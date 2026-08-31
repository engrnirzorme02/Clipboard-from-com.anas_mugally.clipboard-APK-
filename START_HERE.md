# START HERE — FINAL CLIPBOARD PROJECT

## এটি কী

এটি আপনার uploaded Clipboard APK-এর **সম্পূর্ণ project/decompilation package**। এই archive-এ original APK এবং তার JADX/Apktool-derived analysis files একসঙ্গে আছে। এই archive-টাই CLI-কে project analysis বা reconstruction-এর জন্য দেবেন।

## প্রথমে কী খুলবেন

প্রথমে `ANALYSIS/PROJECT_DISCOVERY_REPORT.md` পড়ুন। তারপর `ANALYSIS/ARCHITECTURE.md`, `ANALYSIS/FEATURE_MAP.md` এবং `ANALYSIS/RISK_REGISTER.md` পড়ুন। Decompiled Java source দেখতে `DECOMPILED/sources/` খুলুন। Decoded manifest/resources দেখতে `DECOMPILED/resources/` খুলুন।

## গুরুত্বপূর্ণ folder

`APK/`-এ original APK আছে। `DECOMPILED/`-এ reconstructed source ও decoded resources আছে। `ANALYSIS/`-এ findings, maps ও uncertainty আছে। `TOOLS/verify-project.sh` read-only integrity check-এর জন্য।

## CLI-কে যে নির্দেশ দেবেন

CLI-কে বলবেন: “এই folder-টি FINAL_CLIPBOARD_PROJECT। প্রথমে START_HERE.md এবং ANALYSIS/PROJECT_DISCOVERY_REPORT.md পড়ো। APK build, signing, installation বা source rewrite শুরু করো না। Decompiled source-কে original/buildable source ধরে নিও না। Evidence path ও confidence সহ analysis করো।”

## কী করবেন না

এই project archive-এর ভেতরের original APK বা extracted source নিজে থেকে rename, delete, move, patch বা rebuild করবেন না। Blueprint ও implementation plan-এর জন্য আলাদা `FINAL_CLIPBOARD_BLUEPRINT` archive ব্যবহার করুন। এই দুই archive একসঙ্গে মিশিয়ে CLI-কে দেবেন না।
