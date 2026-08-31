# Feature Map

| Feature | Entry point | Main evidence | Supporting evidence | Privacy / dependency risk | Confidence | Candidate status |
|---|---|---|---|---|---|---|
| Notes browsing | `ui.notes.BrowserNotesFullActivity` | `resources/AndroidManifest.xml` launcher declaration; `sources/sources/com/anas_mugally/clipboard/p221ui/notes/` | notes layouts and adapters | Local text retention; shared storage path needs schema review | HIGH | KEEP candidate |
| Search | `ui.SearchActivity` | manifest activity; `sources/.../ui/SearchActivity.java` | notes models/adapters | Search may expose stored clipboard text | MEDIUM | KEEP candidate |
| Temporary notes | `ui.temporaryNotes.BrowserTemporaryTextActivity` and `service.BrowserTemporaryTextTileService` | manifest and core source paths | temporary-note resources | Temporary content lifecycle/clearing must be verified | HIGH | KEEP candidate |
| Clipboard-related handling | `ClipboardManager` references in core source | `sources/...` symbol inventory | application/service callers | Clipboard content can be sensitive; Android version behavior matters | MEDIUM | MODIFY review |
| Accessibility capture/scan | `service.MyAccessibilityService`; accessibility settings activities | manifest component and `res/xml/accessibility_service_config.xml` | `AccessibilityEvent` references | Screen/window text and event scope are high privacy risks | HIGH | MODIFY review |
| Bubble / overlay | `service.PrimaryBubbleService`; `ui.BubbleCustomizationActivity` | manifest; bubble layouts; `SYSTEM_ALERT_WINDOW` permission | bubble receiver and drawables | Overlay abuse potential; background execution constraints | HIGH | MODIFY review |
| Quick Settings actions | five core `TileService` classes | manifest `BIND_QUICK_SETTINGS_TILE` declarations | tile icons/labels | User-triggered privileged UI actions | HIGH | KEEP candidate |
| Scroll/document extraction | `scrollExtractTexts.ViewNodesActivity`; scanner tile services | source and manifest | scanner resources | Accessibility-based screen extraction | HIGH | MODIFY review |
| AI text processing | `p221ui.p222ai.AiTextProcessingActivity`; AI models/utils; AI tile | source package and manifest tile | translation/result model classes | Text may leave device; endpoint and retention need verification | MEDIUM | MODIFY review |
| Authentication | `GoogleSignInActivity`; Google credential/sign-in components | core source and manifest library components | Firebase/credentials metadata | Account identifiers and tokens | MEDIUM | UNKNOWN until flow audit |
| Ads / monetization | ads activity and Mobile Ads provider; billing permission | manifest and Google Ads/Billing namespaces | pro-feature activity | Advertising identifiers and purchase state | HIGH | KEEP/REVIEW |
| Firebase messaging/analytics | `MyFirebaseMessagingService`; Firebase providers/services | manifest and core source | Firebase metadata | Network, identifiers, notification data | HIGH | REVIEW |
| Boot/background work | `RECEIVE_BOOT_COMPLETED`, WorkManager components | manifest | WorkManager source namespace | Background processing and notification behavior | MEDIUM | MODIFY review |
| License check | `com.pairip.licensecheck.*` components | manifest | Play Core/libraries | Do not bypass; document only | HIGH | UNKNOWN |

`KEEP`, `REMOVE`, `MODIFY`, and `REPLACE` are candidate labels only. No feature was changed or removed. Evidence claims are static and do not establish runtime success.
