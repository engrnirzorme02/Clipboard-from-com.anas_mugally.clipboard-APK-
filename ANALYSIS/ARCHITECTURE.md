# Architecture Map

## Evidence scope

This map is based on the decoded manifest, JADX output, Apktool resources, and the immutable APK inventory. It is a static map; runtime behavior remains unverified.

## Startup and entry flow

The manifest identifies `com.anas_mugally.clipboard.MyApplication` as the application class. The launcher activity is `com.anas_mugally.clipboard.ui.notes.BrowserNotesFullActivity`, exposed through `MAIN` and `LAUNCHER`. AndroidX Startup, Firebase initialization, and Mobile Ads initialization are also declared through manifest providers.

## Primary application namespace

The candidate core namespace is `com.anas_mugally.clipboard`, corroborated by the application ID, application class, launcher activity, core services, receivers, UI packages, database package, and resource references. JADX produced 59 Java files under this namespace. The APK contains substantial third-party/generated code, including Google, Firebase, AndroidX, Kotlin, OkHttp, gRPC, Chromium, and other library namespaces.

## Component groups

The core UI includes notes browsing, search, section/category, settings, accessibility settings, bubble customization, text dialog, user profile, Google sign-in, pro features, temporary notes, text adding, and AI text processing activities. The core services include `MyAccessibilityService`, `PrimaryBubbleService`, multiple Quick Settings tile services, and Firebase messaging. Core receivers include scanner and bubble show/hide receivers. The manifest also declares numerous library components for WorkManager, Firebase, Ads, billing, credentials, profile installer, and license checking.

## Observed data and capability flow

The code contains direct references to `ClipboardManager`, accessibility APIs, Firebase, Google sign-in, Quick Settings `TileService`, and the `PROCESS_TEXT` action. Resource and manifest evidence also indicate bubble/overlay UI, foreground/background execution, notifications, Room-related libraries, billing, and network access. The exact persistence schema and runtime sequencing require method-level review because JADX reports 47 errors.

## High-level sequence

1. Android creates `MyApplication` and library initialization providers.
2. The launcher opens `BrowserNotesFullActivity`.
3. User-facing activities expose notes, search, settings, temporary notes, text processing, and feature configuration.
4. User-enabled accessibility functionality can route accessibility events into application logic; the exact filtering and retention behavior must be verified in `MyAccessibilityService` and its XML configuration.
5. Clipboard, bubble, scanner, tile, notification, AI, billing, authentication, and Firebase paths are separate feature areas with shared application and library dependencies.

## Unknowns

Runtime ordering, actual background frequency, exact database schema, server-side processing semantics, credential handling, and whether every advertised UI feature is active cannot be conclusively established from this static pass alone.
