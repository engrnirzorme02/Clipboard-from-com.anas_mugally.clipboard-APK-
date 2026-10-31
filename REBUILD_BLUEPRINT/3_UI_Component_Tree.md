# 3. UI Component Tree

This document reconstructs the Android UI tree and interaction model from the decompiled sources under:
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/accessibilitySetting/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/addText/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/notes/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/temporaryNotes/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/p222ai/`
- `DECOMPILED/sources/com/anas_mugally/clipboard/p221ui/ads/`

Important note: the APK is decompiled with obfuscated class names. This document therefore describes the architecture and screen roles in human-readable form, while preserving the runtime behavior visible in the code. It intentionally ignores the generated obfuscation names and focuses on screen responsibilities, view hierarchy, state flow, and rebuild strategy.

---

## 3.1 High-level UI architecture

The UI layer is organized as a classic Android screen stack with a shared app shell and a group of stateful activities:

```text
Application shell
  ├─ BaseMyAppAdsActivity
  │    ├─ Ad-enabled screen base
  │    ├─ common toolbar and lifecycle behavior
  │    └─ screen finish / transition control
  │
  ├─ AbstractActivityC3140d / AbstractViewOnClickListenerC3111a
  │    ├─ generic screen callback wiring
  │    ├─ shared click handling
  │    └─ CRUD / selection actions
  │
  ├─ Activities for content management
  │    ├─ Add note / edit note screen
  │    ├─ Search / filter screen
  │    ├─ Section / category browser
  │    ├─ Text dialog / full-text viewer
  │    ├─ Temporary text browser
  │    ├─ Notes browser dialog
  │    ├─ Text extraction overlay screen
  │    └─ Settings / accessibility screens
  │
  └─ Reusable widgets / compose-like views
       ├─ ActionsLayout (menu action panel)
       ├─ CoordinatorLayout (sheet container)
       ├─ SwipeRefreshLayout (live refresh)
       ├─ Recycler/List adapter patterns
       └─ customized TextWatcher / OnClickListener callbacks
```

This is not a formal Jetpack Compose project; the screen logic is still classic Android XML-style view composition managed in code, plus a strong callback-driven state model.

---

## 3.2 Screen inventory

The decompiled UI tree shows these major screen families:

### A. Content and note management
- Add/Edit note screen
- Notes browser dialog or notes listing UI
- Section/category browser
- Search screen
- Temporary text browser
- Text dialog / full note viewer

### B. Extraction and action overlays
- Text extraction floating sheet
- Browser-like overlay for extracted text selection
- Action bar / bottom sheet actions

### C. Settings and permissions
- Settings activity
- Accessibility settings activity
- Bubble customization activity
- App enable pro-features or onboarding screens
- User profile / account UI (if present)

### D. External feature flows
- AI processing activity
- Google sign-in flow
- Ad watch activity
- Intro / onboarding flow

---

## 3.3 Shared screen base and common UI responsibilities

### 3.3.1 Base screen class
The app uses a base activity layer that appears to centralize:
- ad display configuration
- startup animations and transition flags
- finish/close behaviors
- toolbar/subview registration
- default UI state initialization

Observed base classes include:
- `BaseMyAppAdsActivity`
- `AbstractActivityC3130a`
- `AbstractActivityC3140d`

This is the app’s canonical UI shell. Rebuilders should treat it as a foundational activity that owns:
- ad lifecycle
- common action bar style
- app-wide navigation transitions
- default heavy-lifecycle lifecycle bootstrapping

### 3.3.2 Shared callbacks
The code uses many callback interfaces such as:
- `InterfaceC5371p` (generic lambda/action event bridge)
- `InterfaceC5367l` (passing result values back to caller)
- `InterfaceC5356a` (side-effect trigger closures)
- `View.OnClickListener`
- `TextWatcher`
- `SwipeRefreshLayout.OnRefreshListener`

This is a major sign that the code follows a callback-driven presenter pattern rather than a strict ViewModel-per-screen design.

### 3.3.3 Reusable widgets
The UI heavily depends on custom widgets and layout containers:

- `ActionsLayout`
  - custom action menu for note/text actions
  - item map from ID to button view
  - menu click routing to action IDs (e.g. save, copy, delete, send, more)

- `CoordinatorLayout`
  - used for bottom sheet placement and insets
  - used to anchor overlay sheet and maintain translation positions

- `Recycler/List-style callback rendering`
  - selection/deselection of list items by coordinates and bounds
  - custom list adapter-like patterns in extraction screen

- `TextWatcher`
  - search input, note editing, temporary text filters
  - real-time validation and updates

---

## 3.4 Main screen breakdown

## 3.4.1 Add Note / Edit Note screen
Role:
- create or modify clipboard notes
- save to the database
- optionally assign category / section
- optionally perform text actions

Observed patterns:
- implements `TextWatcher`
- likely uses `EditText` or custom text area for title/content
- dispatches to database DAO save methods
- handles action button click listeners and menu events

State model:
- currently edited content
- title / category metadata
- state of save / delete / copy actions
- screen transition back to previous view if “close after op” is enabled

MVVM/MVI interpretation:
- `Intent`: user types text, taps save, selects category, chooses action
- `State`: draft note content, validation state, focus state, unsaved changes
- `Side effects`: database insert/update, clipboard copy, navigation back, maybe AI processing flow

Key rules from code: when the screen is in the action workflow, it delegates to the database and immediate app navigation; there is no independent business model class in the UI layer, which is a classic Android activity-driven state pattern.

---

## 3.4.2 Search screen
Role:
- full-text or category search across clipboard items
- search value filter and result list
- narrow item set by keyword or section

Observed patterns:
- implements `TextWatcher`
- uses filter callbacks and comparator objects
- likely builds a list from Room DAO results and updates the results list dynamically
- multiple nested callback objects suggest input-driven state changes and list re-rendering

State model:
- search query string
- current matching list
- selected item or result count
- filter re-evaluation state

MVVM/MVI interpretation:
- `Intent`: user enters text, selects result, clears filter, chooses item action
- `State`: current search query, filtered items, selection
- `Side effects`: query database, launch text dialog or detail activity, clipboard copy, open section

This is a pure “search state reducer” screen; the source implements its logic as a list of callback actions rather than a separate `SearchViewModel` class.

---

## 3.4.3 Section / Category browser
Role:
- browse grouped clipboard notes by category / section
- load category collection
- navigate to a section’s notes or note detail state

Observed patterns:
- `SectionActivity` implements multi-interface callback architecture
- supports click and selection actions, likely for editing or opening category items
- callback classes are used to process data and route actions

State model:
- current section list
- selected section or category
- relationship to notes and temporary content

MVVM/MVI interpretation:
- `Intent`: open section, select category, delete/move items, refresh list
- `State`: section tree, result count, active selection, loading state
- `Side effects`: database query for categories, UI navigation, item mutation operations

This screen is one of the core “content classification” screens in the app and is likely the functional heart of the notes organization feature.

---

## 3.4.4 Text Dialog / Full-Text Detail screen
Role:
- display a saved note or clipboard entry in full
- likely show text content, maybe read aloud via TTS, copy, share, delete operations
- could also include text-to-speech stream

Observed patterns:
- `TextDialogActivity` implements `UtteranceProgressListener`
- includes speech-status callbacks and text-processing actions
- likely handles both reading text and editing the item through dialog actions

State model:
- displayed text content
- chosen voice / speech state
- selected text actions (copy, share, save, etc.)

MVVM/MVI interpretation:
- `Intent`: open item, read aloud, copy/share text, close dialog
- `State`: selected text payload and UI state
- `Side effects`: TTS engine invocation, clipboard copy, share intent, database update

This is a classic detail-read-only screen with a lightweight action panel.

---

## 3.4.5 Temporary Text browser
Role:
- browse transient clipboard/cache notes
- list temporary text entries and allow filtering / deletion / selection
- likely show recents or auto-saved snippets

Observed patterns:
- `BrowserTemporaryTextActivity` implements `SwipeRefreshLayout.OnRefreshListener`
- implements `TextWatcher`
- custom comparator and sorting logic
- menu item callback processing

State model:
- temporary list entries
- current sort/filter state
- selection and deletion count
- stale / refreshed state

MVVM/MVI interpretation:
- `Intent`: refresh list, type filter, select item, delete item, open item detail
- `State`: current list and selection set
- `Side effects`: database query for temp rows, copy/share actions, delete operations, refresh UI

This screen is a very typical “repository-backed list screen” with actions attached directly to the list items.

---

## 3.4.6 Notes browser dialog / notes list screen
Role:
- show saved clipboard/note entries in a browsable dialog UI
- support item selection, bulk actions, copy, delete, search, category navigation

Observables from code patterns:
- this screen is likely one of the central note list UIs
- common architecture with `BaseMyAppAdsActivity`
- callback-driven action map handling and menu item actions

State model:
- list of notes
- selected item IDs
- filter and sorting state
- bulk selection count

MVVM/MVI interpretation:
- `Intent`: open list, select item(s), run delete/copy/share actions, navigate to detail or add screen
- `State`: list model, selection set, loading state
- `Side effects`: DB reads/writes, start detail/edit activity, clipboard operations

This is the core “clipboard list” screen and should be treated as the canonical list-view candidate in any clean-room rebuild.

---

## 3.4.7 Text Extraction screen (floating selection overlay)
Role:
- receives extracted text from the accessibility scanner
- shows text blocks with coordinate metadata
- allows multi-selection, combination, and sending to downstream actions

Observed patterns:
- `TextExtractionActivity` is implemented as a bottom sheet overlay container over a `CoordinatorLayout`
- uses `ActionsLayout` as the bottom action tray
- uses custom `View.OnTouchListener` logic and drag handling for the sheet
- supports item selection and result combination
- custom bundling of `string` + `rect` objects

This screen is a major architectural clue:
- it is not a CRUD list screen; it is a result-aggregation overlay whose logic is built around coordinate-based text selection

State model:
- extracted text list (with rectangles)
- selected extraction nodes
- bottom sheet expanded/collapsed state
- drag gesture state for smooth sheet motion

MVVM/MVI interpretation:
- `Intent`: toggle selection, drag sheet, tap action button, choose result combination
- `State`: `selectedNodes`, `sheetOpen`, `combinedText`, `dragPosition`
- `Side effects`: clipboard copy, share intent, save to note DB, close screen

This screen is the clearest evidence that the app uses a hybrid “gesture-driven overlay + action menu” model, which should be preserved in a custom implementation.

---

## 3.4.8 Settings screen
Role:
- app-wide configuration toggles
- overlay behavior
- app bubble preferences
- action preferences and retention settings

Observed patterns:
- `SettingActivity` handles preferences and direct navigation to configuration screens
- includes helper functions that read/write `SharedPreferences` under `SHARED_NAME`
- uses action ID checks and menu items
- likely binds dozens of toggles to app feature flags

State model:
- feature toggles for accessibility, bubble, auto-pick, keep-duration, custom position, etc.
- overlay configuration values
- persistent state in `SharedPreferences`

MVVM/MVI interpretation:
- `Intent`: toggle feature, select setting, open nested settings screen
- `State`: persistent preference map
- `Side effects`: update preference store, trigger service changes or startup lifecycle updates

This is not a UI-only screen; it acts as a preferences facade over the runtime service architecture.

---

## 3.4.9 Accessibility settings screen
Role:
- permission and accessibility enablement flow
- runtime components check if the app is permitted to access accessibility and overlays
- user directed to enable the service and grant overlay permission

Observed patterns:
- uses `AccessibilityManager`, service check and VM-like state
- calls `MyAccessibilityService` state checks
- typical permission flow: start settings, show helper prompts, finish or reopen configuration flow

State model:
- permission state flags
- service enabled/disallowed state
- direct flow to full accessibility configuration screen if necessary

MVVM/MVI interpretation:
- `Intent`: enable service or overlay, confirm, return to app
- `State`: permission state and screen-specific gating
- `Side effects`: system settings intents, permission prompts, restart UI state

This is one of the most important screens because it gates the entire extraction feature set.

---

## 3.5 MVVM / MVI interpretation of the whole UI layer

The app does not use a neat one-file-per-ViewModel pattern in the visible decompiled files. Instead, the UI is organized as an activity-driven, callback-heavy state machine.

### In practical terms, the app behaves like:

- `View` = activities + custom layouts
- `Intent` = click listeners, `TextWatcher`, menu selections, swipe gestures, settings toggles
- `State` = fields on the activity, selection sets, list model, filter strings, expansion states
- `Side Effect` = DB writes, `Intent` navigation, clipboard actions, TTS, share targets, ads, permission prompts, service triggers

This is effectively an MVVM/MVI hybrid:
- view logic is still activity-centric
- state is stored in member fields and preference store
- actions are dispatched through callback interfaces and menu listeners
- the database is the single source of truth for content
- the service layer is the single source of truth for system-level interaction features

### The clean-room rebuild should preserve this organization

Recommended model:

```text
UI layer
  ├─ Screen Activity / Fragment
  │    ├─ UI state holder
  │    ├─ click/text watchers / gestures
  │    ├─ reducer-like update methods
  │    └─ side-effect dispatcher
  │
  ├─ Domain / use-case layer
  │    ├─ load notes
  │    ├─ save note
  │    ├─ search notes
  │    ├─ toggle feature settings
  │    └─ run extraction pipeline
  │
  ├─ Repository layer
  │    ├─ Room DAO access
  │    ├─ SharedPreferences config access
  │    └─ service gateway
  │
  └─ Runtime platform layer
       ├─ AccessibilityService
       ├─ overlay service
       ├─ clipboard manager
       └─ Android system Intents
```

---

## 3.6 Rebuild priority order for screens

When reconstructing from scratch, prioritize in this order:

1. `TextExtractionActivity`
   - highest complexity
   - unique app value proposition
   - includes drag gesture, multi-select, and action menu

2. `Notes browser / SectionActivity`
   - central content management screen
   - likely root of user note browsing

3. `AddNoteActivity`
   - note creation workflow
   - essential domain data path

4. `Temporary text browser`
   - temporary notes and clipboard archives

5. `SearchActivity`
   - essential filtering across notes

6. `SettingsActivity` and `AccessibilitySettingActivity`
   - runtime permission and configuration logic

7. Supporting screens
   - intro, ad watch, user profile, sign-in, AI processing, custom bubble settings

---

## 3.7 UI state contract summary

The following runtime state categories are repeated across screens:

- `ListState`
  - collection of notes / sections / temporary texts
  - filtered list
  - selected item IDs

- `FormState`
  - current text draft
  - title / metadata edits
  - save validation

- `SelectionState`
  - item selected
  - multi-select set
  - bulk action count

- `OverlayState`
  - expanded/collapsed bottom sheet
  - drag offset and gesture tracking
  - overlay position / bounds

- `PermissionState`
  - accessibility enabled
  - overlay permission granted
  - service runtime availability

- `PreferenceState`
  - bubble enabled state
  - auto-pick mode
  - retention settings
  - custom overlays

---

## 3.8 Component map for a clean-room rebuild

### Core screens to rebuild first

```text
Main note management
  ├─ Notes Browser Dialog / List Screen
  ├─ Section / Category Browser
  ├─ Search Screen
  ├─ Add Note / Edit Note Screen
  ├─ Full Text / Detail Dialog
  └─ Temporary Text Browser

Runtime overlay / extraction
  ├─ Accessibility Service trigger flow
  ├─ Text Extraction Overlay Activity
  ├─ ActionsLayout bottom action tray
  └─ Selected-text aggregation / combine flow

Settings and boundaries
  ├─ Settings Activity
  ├─ Accessibility Settings Activity
  ├─ Bubble Customization Screen
  └─ Permission / overlay gate screen
```

---

## 3.9 Final architectural conclusion

The UI is clearly a layered, callback-driven Android app with a strong runtime overlay system and a set of content screens built around:
- persistent clipboard/note storage
- settings stored in `SharedPreferences`
- accessibility-driven extraction flows
- layered action menus and a bottom-sheet pattern

Most importantly, the architecture is not “single screen with one giant controller.” Instead, it is a set of specialized screens that all share:
- the same app-shell base
- the same callback-driven state management style
- the same data repository and service interfaces
- a strong preference-to-runtime configuration boundary

This is the correct mental model for rebuilding the app with custom features while preserving the feature set and runtime behavior.

---

## 3.10 File status

This file is intentionally limited to the UI component tree and screen architecture.

Next file to generate after confirmation:
- `REBUILD_BLUEPRINT/4_State_Management_and_Use_Cases.md`

After you confirm, I will generate the fourth blueprint file only.
