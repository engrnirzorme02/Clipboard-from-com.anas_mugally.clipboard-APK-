# 2. Service and Intent Contracts

This document reconstructs the app’s runtime service and intent model from the decompiled code in:
- `DECOMPILED/sources/com/anas_mugally/clipboard/service/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/broadcastReceiver/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/C3034A.java`
- `DECOMPILED/sources/com/anas_mugally/clipboard/C3149w.java`
- `DECOMPILED/resources/AndroidManifest.xml`

This is a contract-level reconstruction for a clean-room rebuild. It focuses on the actual action names, extras, and data movement patterns visible in the APK static code, rather than the original source naming.

## 2.1 Service topology

The app uses three core runtime service patterns:

1. Accessibility service
   - `com.anas_mugally.clipboard.service.MyAccessibilityService`
   - handles screen text extraction, accessibility events, overlay state, and permission-driven behavior

2. Bubble overlay service
   - `com.anas_mugally.clipboard.service.PrimaryBubbleService`
   - lifecycle service used to keep the floating bubble active

3. Broadcast-driven action router
   - `com.anas_mugally.clipboard.broadcastReceiver.ShowOrHidePrimaryBubbleReceiver`
   - `com.anas_mugally.clipboard.broadcastReceiver.ScannerReceiver`
   - route UI, notification, tile, and system lifecycle events into functionality

The app also exposes Quick Settings tile services, each of which sends a broadcast or starts an activity:
- `BrowserTextTileService`
- `ExtractTextScannerTileService`
- `ExtractTextWhileScrollingScannerTileService`
- `AddTextTileService`
- `AiTextProcessingTileService`
- `BrowserTemporaryTextTileService`

---

## 2.2 Exact app action strings observed in code

### 2.2.1 Scanner / extraction actions
These are the most important runtime actions discovered in the decompiled code:

| Action string | Producer | Consumer | Purpose |
|---|---|---|---|
| `com.anas_mugally.clipboard.action_extract_text` | `C3149w.m16720j(0)` / `ExtractTextScannerTileService.m15188a()` | `ScannerReceiver.onReceive()` | start screen text extraction flow |
| `com.anas_mugally.clipboard.action_extract_text_while_scrolling` | `C3149w.m16720j(1)` | `ScannerReceiver.onReceive()` | start scroll-scanner flow |
| `com.anas_mugally.clipboard.OPEN_APP_ACTION` | `MyApplication.m15102l()` | `ShowOrHidePrimaryBubbleReceiver` | open app via bubble action |
| `com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION` | app logic and receiver toggle path | `ShowOrHidePrimaryBubbleReceiver` | toggle bubble visible state |
| `com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION` | app logic and receiver toggle path | `ShowOrHidePrimaryBubbleReceiver` | set bubble state explicitly |

### 2.2.2 Android lifecycle actions
These are used to detect app state transitions:

| Action string | Source | Consumer | Purpose |
|---|---|---|---|
| `android.intent.action.BOOT_COMPLETED` | system | `ShowOrHidePrimaryBubbleReceiver` | restore or initialize bubble after boot |
| `android.intent.action.USER_PRESENT` | system | `ShowOrHidePrimaryBubbleReceiver` | user arrives at unlock / foreground state |
| `android.intent.action.MY_PACKAGE_REPLACED` | system | `ShowOrHidePrimaryBubbleReceiver` | handle app update lifecycle |

### 2.2.3 Generic system intents
These are consumed by activities and service flows:

| Action string | Where declared | Meaning |
|---|---|---|
| `android.intent.action.SEND` | manifest | share text into the app |
| `android.intent.action.PROCESS_TEXT` | manifest | selected text action |
| `android.intent.action.EDIT` | manifest | edit incoming text |
| `android.intent.action.VIEW` | manifest | open URLs or file/content data |
| `android.accessibilityservice.AccessibilityService` | manifest | accessibility service binding |
| `android.service.quicksettings.action.QS_TILE` | manifest | quick settings tile registration |

---

## 2.3 Exact bundle keys and property keys recovered from code

These are the app-specific key names seen in actual `Intent` extras and preference storage.

### 2.3.1 Intent extras used in scanning and bubble logic

| Key | Type | Used in | Meaning |
|---|---|---|---|
| `fromNotification` | `String` | `C3149w.f13207g` | used to indicate the request originated from notification UI |
| `state` | `boolean` | `ShowOrHidePrimaryBubbleReceiver` | explicit bubble state passed in ACTION_SHOW_HIDE_WITH_VALUE |
| `string` | `String` | `ScannerReceiver` | individual extracted text item |
| `rect` | `Parcelable` | `ScannerReceiver` | rectangle bounds for extracted text node |
| `list` | `ArrayList<Bundle>` | `ScannerReceiver -> TextExtractionActivity` | extracted text fragments to display |
| `direct` | `boolean` | `ScannerReceiver` | tells the scanner to ignore some delay logic or direct-run mode |

### 2.3.2 SharedPreferences keys
The app stores multiple configuration values under the same shared name (`SHARED_NAME`) and uses these constant names:

| Key name | Source | Meaning |
|---|---|---|
| `primaryBubble` | `C3034A.f12459g` | whether the main bubble should be shown |
| `accessibilityService` | `C3034A.f12458f` | accessibility feature toggle |
| `autoPick` | `C3034A.f12460h` | auto-pick setting |
| `clipboardOverlay` | `C3034A.f12461i` | overlay enabled |
| `overlayPosition` | `C3034A.f12462j` | bubble position |
| `overlayCustomPosition` | `C3034A.f12463k` | custom overlay position |
| `typePick` | `C3034A.f12464l` | text pick mode |
| `keepDurationText` | `C3034A.f12465m` | retention duration of text in keep state |
| `keepDuration` | `C3034A.f12466n` | duration setting |
| `countOfNotesGet` | `C3034A.f12467o` | count of notes fetched |
| `autoSaveTemporaryText` | `C3034A.f12468p` | temporary note autosave preference |
| `temporary_password` | `C3034A.f12456d` | password for protected temp feature |
| `temporary_biometric_enabled` | `C3034A.f12457e` | biometric unlock state |
| `key_video_link` | `C3034A.f12455c` | a configured video link |

These are not all `Intent` extras, but they are central contract values that the app passes through intents and preferences.

---

## 2.4 Exact Intent flow: tile trigger to scanner

### 2.4.1 Tile service to broadcast
The Quick Settings tile service is the canonical trigger for scanner actions.

Example from `ExtractTextScannerTileService`:

```java
Intent intent = new Intent(this, ScannerReceiver.class);
intent.setAction("com.anas_mugally.clipboard.action_extract_text");
intent.putExtra(C3149w.f13206f.m16727a(), true);
PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, intent, 201326592);
```

This means:
- target: `ScannerReceiver`
- action: `com.anas_mugally.clipboard.action_extract_text`
- extra: `fromNotification=true`

The same pattern is used for the scrolling extractor with a different action:
- `com.anas_mugally.clipboard.action_extract_text_while_scrolling`

### 2.4.2 Broadcast receiver handling
`ScannerReceiver.onReceive()` performs the following conditional logic:

```java
String action = intent.getAction();
if (action != null && action matches extract_text or extract_text_while_scrolling) {
    this.f12575a = ... delay value based on animation scale ...
    this.f12580f = MyAccessibilityService.f12639O.m15245a();

    boolean booleanExtra = intent.getBooleanExtra(C3149w.f13206f.m16727a(), false);
    if (booleanExtra) {
        myAccessibilityService.m15225L();
    }

    if (intent.getBooleanExtra("direct", false) && !booleanExtra) {
        this.f12575a = 0L;
    }

    m15136z(intent);
}
```

This is a key piece of logic: the same scanner path is reused for notifications and manual tile triggers, with a “fromNotification” signal toggling special behavior.

---

## 2.5 Exact flow: ScannerReceiver -> AccessibilityService -> TextExtractionActivity

### Stage A: delay scheduling
`ScannerReceiver.m15136z(intent)` posts a delayed runnable on the main handler:

```java
this.f12588n = System.currentTimeMillis();
this.f12586l.postDelayed(() -> ScannerReceiver.m15110A(this, intent), this.f12575a);
```

This is the asynchronous trigger for the actual scan.

### Stage B: root and window detection
In `m15124n(intent)`:

```java
AccessibilityNodeInfo rootInActiveWindow = myAccessibilityService.getRootInActiveWindow();
List<AccessibilityNodeInfo> list = rootInActiveWindow != null
    ? rootInActiveWindow.findAccessibilityNodeInfosByViewId("com.android.systemui:id/notification_stack_scroller")
    : null;
```

The code checks whether the system notification area is visible and delays or proceeds based on timing windows. That pattern implies:
- the extraction flow is heavily tied to the current active UI/window state
- it may intentionally avoid scanning while notification UI is visible

### Stage C: extraction result packaging
When scan logic succeeds, it converts accessibility tree data into a list of bundles:

```java
Bundle bundle = new Bundle();
bundle.putString("string", (String) c1435m.m6070c());
bundle.putParcelable("rect", (Parcelable) c1435m.m6071d());
arrayList2.add(bundle);
```

This is the critical data contract between the accessibility scanner and the UI display.

### Stage D: launch result screen
After collecting the list:

```java
Intent intent = new Intent(context, TextExtractionActivity.class);
intent.addFlags(1350565888);
intent.putParcelableArrayListExtra("list", new ArrayList<>(this.f12581g));
context.startActivity(intent);
```

So the exact data contract for the extraction UI is:
- intent target: `TextExtractionActivity`
- extra key: `list`
- value type: `ArrayList<Bundle>`
- each item contains:
  - `string`: extracted text content
  - `rect`: screen rectangle metadata

This is the core handoff from accessibility extraction to UI rendering.

---

## 2.6 Exact flow: bubble toggle and overlay state

### 2.6.1 Bubble receiver registration
`ShowOrHidePrimaryBubbleReceiver.C3050a.m15140b(context)` registers a receiver for:
- `android.intent.action.BOOT_COMPLETED`
- `android.intent.action.USER_PRESENT`
- `android.intent.action.MY_PACKAGE_REPLACED`

### 2.6.2 Bubble state actions
The receiver handles these actions:
- `com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION`
- `com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION`
- `com.anas_mugally.clipboard.OPEN_APP_ACTION`
- `android.intent.action.BOOT_COMPLETED`
- `android.intent.action.USER_PRESENT`
- `android.intent.action.MY_PACKAGE_REPLACED`

The logic is:

```java
boolean booleanExtra = sharedPreferences.getBoolean(c3034a.m15014A(), true);
...
case SHOW_HIDE_PRIMARY_BUBBLE_ACTION:
    booleanExtra = !booleanExtra;
    sharedPreferences.edit().putBoolean(c3034a.m15014A(), booleanExtra).apply();
    break;

case SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION:
    booleanExtra = intent.getBooleanExtra("state", true);
    sharedPreferences.edit().putBoolean(c3034a.m15014A(), booleanExtra).apply();
    break;
```

Then the receiver calls:

```java
f12594a.m15139a(context, booleanExtra);
```

### 2.6.3 Bubble service toggling
`C3050a.m15139a(context, state)` decides whether to:
- start `PrimaryBubbleService`
- stop `PrimaryBubbleService`
- or call accessibility methods directly, depending on whether the app is ready and accessibility is active

Pseudo-flow:

```java
if (!bubbleAllowed || myAccessibilityService == null) {
    if (state) startService(PrimaryBubbleService)
    else stopService(PrimaryBubbleService)
    return;
}

if (state) {
    myAccessibilityService.m15223F();
} else {
    myAccessibilityService.m15237r();
}
```

This strongly suggests:
- `PrimaryBubbleService` is the foreground lifecycle service that keeps the bubble alive
- `MyAccessibilityService` is the runtime control plane that actually shows/hides the overlay behavior when accessibility is enabled

### 2.6.4 Bubble service lifecycle
`PrimaryBubbleService` has:
- `onCreate()` → set `f12706c = true` and register shared preference listener
- `onStartCommand()` → set `f12706c = true` and ensure listener is registered
- `m15279c(context)` → start the service
- `m15280d(context)` → stop the service and clear listener

This indicates the overlay is intentionally kept as a service-managed floating UI with state gated by app preferences and accessibility availability.

---

## 2.7 Accessibility service contracts

The accessibility service itself is not fully decompiled in the provided snippet, but its invocation pattern is clear from callers.

### Observed service entry methods
From the codebase, the app calls these methods on `MyAccessibilityService`:

- `m15223F()` — likely show bubble / enable overlay
- `m15237r()` — likely hide bubble / disable overlay
- `m15225L()` — likely trigger text extraction or resume scanning
- `m15230U()` — likely stop scanning flow or cleanup scan overlay

These are strong evidence that the service is the runtime coordinator between:
- system accessibility events
- bubble visibility state
- scanner state and extraction results
- app UI actions

### Accessibility service registration
In the manifest:

```xml
<service android:exported="true" android:label="@string/app_name" android:name="com.anas_mugally.clipboard.service.MyAccessibilityService" android:permission="android.permission.BIND_ACCESSIBILITY_SERVICE">
    <meta-data android:name="android.accessibilityservice" android:resource="@xml/accessibility_service_config"/>
    <intent-filter>
        <action android:name="android.accessibilityservice.AccessibilityService"/>
    </intent-filter>
</service>
```

This confirms the service is a system-bound accessibility service with configuration metadata and permission enforcement.

---

## 2.8 Notification-driven data flow

The notification builder (`C3149w`) creates pending intents for multiple quick actions. It is relevant because it is an alternate entry point into scanning and the app’s main flows.

The notification uses:
- `R.id.btn_extract_text` -> `ScannerReceiver` with action `com.anas_mugally.clipboard.action_extract_text`
- `R.id.btn_scroll_extract_text` -> `ScannerReceiver` with action `com.anas_mugally.clipboard.action_extract_text_while_scrolling`
- other buttons start activities like `AddNoteActivity`, `BrowseNotesDialogActivity`, `BrowserTemporaryTextActivity`, `AiTextProcessingActivity`, and `AccessibilitySettingActivity`

This means notification UI is effectively a second runtime façade for the same action-routing system.

---

## 2.9 Component interaction map

```text
Quick Settings Tile / Notification
          |
          v
ScannerReceiver.onReceive()
          |
          |-- action = extract_text / extract_text_while_scrolling
          |
          +--> configure delay and scan mode
          |
          +--> MyAccessibilityService.m15225L() if fromNotification
          |
          +--> m15136z(intent)
                    |
                    +--> delayed call to m15124n(intent)
                              |
                              +--> AccessibilityNodeInfo inspection
                              |
                              +--> extract bundle list
                                      { "string": ..., "rect": ... }
                              |
                              +--> start TextExtractionActivity with:
                                     extra: "list" = ArrayList<Bundle>

Bubble lifecycle:
ShowOrHidePrimaryBubbleReceiver
          |
          +--> SharedPreferences[primaryBubble] toggle
          +--> PrimaryBubbleService.start/stop if not accessibility-ready
          +--> MyAccessibilityService.m15223F()/m15237r() if accessibility-ready
```

---

## 2.10 Recommended contract model for a rebuild

For a clean-room implementation, define a small internal messaging contract around these keys.

### Core broadcast actions
```kotlin
const val ACTION_EXTRACT_TEXT = "com.anas_mugally.clipboard.action_extract_text"
const val ACTION_EXTRACT_TEXT_WHILE_SCROLLING = "com.anas_mugally.clipboard.action_extract_text_while_scrolling"
const val ACTION_SHOW_HIDE_PRIMARY_BUBBLE = "com.anas_mugally.clipboard.SHOW_HIDE_PRIMARY_BUBBLE_ACTION"
const val ACTION_SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE = "com.anas_mugally.clipboard.SHOW_HIDE_WITH_VALUE_PRIMARY_BUBBLE_ACTION"
const val ACTION_OPEN_APP = "com.anas_mugally.clipboard.OPEN_APP_ACTION"
```

### Core extras
```kotlin
const val EXTRA_FROM_NOTIFICATION = "fromNotification"
const val EXTRA_STATE = "state"
const val EXTRA_DIRECT = "direct"
const val EXTRA_STRING = "string"
const val EXTRA_RECT = "rect"
const val EXTRA_LIST = "list"
```

### Preferred data contracts
- `ScannerReceiver -> TextExtractionActivity`
  - `EXTRA_LIST`: `ArrayList<Bundle>`
  - each bundle contains `EXTRA_STRING` and `EXTRA_RECT`

- `Bubble receiver -> service coordinator`
  - `EXTRA_STATE`: boolean flag
  - persisted in `SharedPreferences` under `primaryBubble`

- `Notification -> scanner`
  - `EXTRA_FROM_NOTIFICATION`: true
  - default action route is scanner broadcast with appropriate action name

This contract model matches the observed runtime design and is stable enough to rebuild cleanly.

---

## 2.11 Summary

The app’s runtime architecture is not a traditional simple single-activity app. It is a layered system where:
- Quick Settings tiles and notifications launch broadcast actions
- `ScannerReceiver` orchestrates extraction tasks and delegates to `MyAccessibilityService`
- extracted text is bundled as `Bundle` items and handed to `TextExtractionActivity`
- bubble state is controlled by a broadcast receiver that toggles both `PrimaryBubbleService` and accessibility runtime state
- many runtime decisions are driven by `Intent` actions and small `Bundle` payloads rather than a central service API

These contracts are the most critical pieces to preserve when rebuilding the app.

---

## 2.12 File status

This file is intentionally limited to Service and Intent Contracts.

Next file to generate after confirmation:
- `REBUILD_BLUEPRINT/3_UI_Component_Tree.md`

After you confirm, I will generate the third blueprint file only.
