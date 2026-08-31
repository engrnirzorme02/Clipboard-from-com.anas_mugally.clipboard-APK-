# Source Map

| Namespace / area | Classification | Evidence | Notes |
|---|---|---|---|
| `com.anas_mugally.clipboard` | CORE_APP | 59 JADX Java files; manifest application/components | Primary application namespace candidate, corroborated by manifest |
| `com.anas_mugally.clipboard.p221ui` and subpackages | CORE_APP | UI source paths and manifest activities/services | Package segment `p221ui` may be compiler/decompiler naming; preserve as evidence |
| `com.anas_mugally.clipboard.service` | CORE_APP | manifest services and source | Accessibility, bubble, tiles, Firebase messaging |
| `com.anas_mugally.clipboard.database` | CORE_APP | source package | Persistence implementation requires method/schema review |
| `androidx.*` | ANDROIDX / THIRD_PARTY | 123+ files and META-INF version markers | Library/framework code; do not edit as core feature code |
| `com.google.*`, `io.grpc`, `okhttp3`, `org.chromium` | GOOGLE_FIREBASE / THIRD_PARTY | 9,742 Google files plus library namespaces | Large vendor/runtime footprint |
| `kotlin.*`, `kotlinx.*` | KOTLIN_RUNTIME | source namespace and META-INF markers | Runtime/generated support |
| `com.pairip.*` | THIRD_PARTY / UNKNOWN | license-check components in manifest | Document only; no bypass |
| `C####`, `AbstractC####`, and synthetic-looking names | OBFUSCATED or GENERATED candidate | JADX source filenames and 47 decompilation errors | Semantic labels require call-graph and resource corroboration |

## Obfuscation profile

The core namespace contains readable names for many features, but also short/synthetic names such as `C3034A`, `C3079a`, and `AbstractC...`. JADX was run with deobfuscation enabled and reports 47 errors. These areas are therefore confidence-limited. No global rename was performed.
