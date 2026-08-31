# Dependency Map

## Observed direct/shared dependency groups

| Group | Evidence | Role / boundary |
|---|---|---|
| AndroidX | `META-INF/androidx.*.version`; source namespaces | UI, lifecycle, WorkManager, Room, credentials, startup, preferences, view components |
| Firebase / Google services | `META-INF` markers, manifest providers/services, source references | Messaging, analytics/initialization, authentication and related service plumbing |
| Google Mobile Ads | manifest Ads components; source references | Advertising lifecycle and ad activity |
| Billing | `com.android.vending.BILLING`; Play billing metadata | Pro feature purchase path; runtime purchase logic needs review |
| Kotlin / coroutines | Kotlin namespaces and META-INF markers | Runtime and asynchronous control flow |
| Networking | OkHttp, gRPC and URL literals | External communication; exact request/data flow requires endpoint and caller tracing |
| Room / SQLite-related | AndroidX Room markers and core database package | Candidate local persistence; schema and encryption claims remain unverified |
| Play Core / Pairip | manifest license-check and Play Core components | Licensing/runtime support; do not bypass |
| Chromium / Custom Tabs | source namespace and manifest queries | Browser/custom-tab integration candidates |

## Shared components requiring change-impact review

`MyApplication`, common UI/activity bases, storage/database helpers, preference/configuration classes, accessibility service, bubble service, AI models/utilities, Firebase initialization, and shared resource IDs may be coupled across multiple features. Any future edit must trace callers, resources, manifest declarations, and service/task dependencies before changing them.

## External endpoints observed as literals

Static source scan found `clipzboard.com` pages, a Firebase Realtime Database host, Google Translate, YouTube, Google Play, Galaxy Store, and developer/store URLs. A URL literal alone does not prove that sensitive user content is transmitted; request construction and call sites must be reviewed.
