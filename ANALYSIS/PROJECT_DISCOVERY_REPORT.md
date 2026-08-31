# Clipboard APK Project Discovery Report

## Executive assessment

**PROJECT STATUS: ANALYSIS-READY / NOT BUILD-READY**

The uploaded artifact was preserved unchanged and decoded into a documentation-oriented workspace. The APK has a clear primary namespace, a substantial clipboard/notes/accessibility/bubble/tile feature surface, and a large Google/Firebase/AndroidX dependency footprint. It is suitable for evidence-backed CLI analysis and controlled planning. It has not been built, signed, installed, or runtime-verified.

## Intake summary

| Field | Result | Evidence |
|---|---|---|
| Original filename | `Clipboard-com.anas_mugally.clipboard-200.5.0-250.apk` | uploaded artifact |
| SHA-256 | `1fc59b0d40f49f0f1abad1d6700a8e68b5ad42b2a7d5ea457458bd9bcaa55a18` | `ORIGINAL/SHA256SUMS.txt` |
| Size | 17,648,887 bytes | intake stat |
| Package/application ID | `com.anas_mugally.clipboard` | decoded manifest |
| Application class | `com.anas_mugally.clipboard.MyApplication` | decoded manifest |
| Launcher | `com.anas_mugally.clipboard.ui.notes.BrowserNotesFullActivity` | `MAIN` + `LAUNCHER` filter |
| DEX count | 2 | APK archive |
| Native `.so` count | 0 | extracted archive |
| Resource files | 1,151 decoded files | Apktool extraction |
| Assets | 2 | extracted archive |
| JADX Java files | 14,306 total; 59 in core namespace | JADX output |
| Manifest counts | 33 activities, 22 services, 14 receivers, 5 providers, 25 permissions | decoded manifest |
| Cleartext traffic | enabled | application attribute |
| JADX status | 47 reported errors | `jadx_run.log` |

## Primary findings

The core application namespace is strongly corroborated as `com.anas_mugally.clipboard`. The launcher opens the notes browser. Core source and manifest evidence identify notes, search, temporary notes, accessibility, bubble/overlay, Quick Settings tiles, scanner/scroll extraction, AI text processing, authentication, pro features, Firebase messaging, ads, billing, and background work as distinct feature areas.

The most sensitive paths are accessibility observation, clipboard handling, screen/window text extraction, overlay/bubble behavior, external network services, and background execution. The manifest explicitly requests `INTERNET`, `SYSTEM_ALERT_WINDOW`, `BIND_ACCESSIBILITY_SERVICE`, foreground-service, boot, notification, billing, advertising-ID-related, and wake-lock capabilities. `usesCleartextTraffic="true"` is present and requires later call-site analysis before judging actual exposure.

## Sequence audit

The plausible static sequence is: application initialization; launcher notes browser; user navigation to notes/search/settings or feature configuration; optional user enablement of accessibility; event-driven extraction/clipboard-related handling; optional bubble, tile, scanner, AI, notification, account, ads, billing, or Firebase paths. The exact sequence is **not** proven for every path because static decompilation does not reveal runtime scheduling, user settings, server behavior, or all control-flow details.

## Verified versus unresolved claims

| Claim | Classification |
|---|---|
| The APK package is `com.anas_mugally.clipboard` | Verified by decoded manifest |
| `MyApplication` is the declared application class | Verified by decoded manifest |
| `BrowserNotesFullActivity` is launcher | Verified by manifest intent filter |
| Accessibility service is declared and implemented in core namespace | Verified by manifest/source/resource evidence |
| Quick Settings tile services exist | Verified by manifest/source evidence |
| Firebase, Google, AndroidX, Kotlin, OkHttp/gRPC-related code exists | Verified by archive/source/META-INF evidence |
| Room is used for the app's own persistence | Unresolved; library presence and database package are evidence, schema/call-site audit required |
| AI sends clipboard/text content to a particular provider | Unresolved; URL/model names alone are insufficient |
| Automatic clipboard capture behavior on all Android versions | Unresolved; requires API-level/runtime and call-site analysis |
| APK is buildable from reconstructed sources | Not established; explicitly deferred |

## Current blockers

The 47 JADX errors and synthetic/obfuscated-looking names limit method-level certainty. Runtime behavior, API-level clipboard restrictions, actual data retention, network payloads, and license-gated behavior remain unverified. These are not blockers for static discovery, but they are blockers for any claim of runtime or release readiness.

## Safe now

It is safe to continue read-only call-graph tracing, manifest/resource cross-reference, database schema inspection, endpoint/caller mapping, feature dependency documentation, and controlled project-control-file edits. It is not safe within this phase to modify extracted source, bypass license/security controls, or claim that a rebuilt APK would work.

## Recommended next action

Perform a second static pass focused on `MyAccessibilityService`, clipboard callers, database entities/DAOs, AI request construction, network clients, and manifest XML configuration. Record each finding with an exact file/method path and confidence. Only after user approval should a separate controlled-edit phase be planned.
