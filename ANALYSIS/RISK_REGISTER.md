# Risk Register

| ID | Description | Evidence | Impact | Likelihood | Confidence | Later mitigation | Blocker |
|---|---|---|---|---|---|---|---|
| R-01 | Clipboard data may be sensitive and retained locally or processed by features | `ClipboardManager` references; notes/temporary-notes packages | High | Medium | Medium | Trace read/write/clear lifecycle and document retention | NO |
| R-02 | Accessibility service may observe window/content events | `MyAccessibilityService`; `res/xml/accessibility_service_config.xml`; `BIND_ACCESSIBILITY_SERVICE` | High | Medium | High | Review event types, package filters, persistence, and user-enable flow | NO |
| R-03 | Overlay/bubble capability can affect other apps and background UX | `PrimaryBubbleService`; bubble layouts; `SYSTEM_ALERT_WINDOW` | High | Medium | High | Verify permission checks, lifecycle, and teardown | NO |
| R-04 | Cleartext traffic is explicitly enabled | `AndroidManifest.xml` application attribute `usesCleartextTraffic="true"` | Medium/High | Medium | High | Identify actual HTTP callers; later disable or narrowly scope if compatible | NO |
| R-05 | External endpoints and Firebase/Google services may receive identifiers or text | URL literals, Firebase/Google namespaces, `INTERNET` | High | Medium | Medium | Trace request payloads, auth, logging, and retention | NO |
| R-06 | Background execution/boot/notification behavior may be restricted by Android versions | `RECEIVE_BOOT_COMPLETED`, foreground service, WorkManager, notifications | Medium | Medium | High | Runtime matrix across supported API levels | NO |
| R-07 | Ads and billing introduce tracking/purchase coupling | AD_ID-related permissions, Mobile Ads components, billing permission | Medium | High | High | Map consent, purchase state, and feature gates | NO |
| R-08 | JADX reconstruction has 47 reported errors | `jadx_run.log` | High for source correctness | High | High | Corroborate with DEX/resources and mark uncertain methods | NO |
| R-09 | Synthetic/obfuscated names obscure semantic ownership | `C####`, `AbstractC####`, `p221ui` names | Medium/High | High | High | Build feature-reachable call graph; no blind renaming | NO |
| R-10 | License-check components are present | `com.pairip.licensecheck.*` in manifest | High if modified improperly | Unknown | High | Document only; never bypass | YES for any release/rebuild work |

This is a technical risk register, not legal advice. Static evidence does not establish runtime behavior or policy compliance.
