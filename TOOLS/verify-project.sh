#!/usr/bin/env bash
set -euo pipefail
ROOT="$(cd "$(dirname "$0")/.." && pwd)"
APK="$ROOT/ORIGINAL/original.apk"
EXPECTED="$(awk '{print $1}' "$ROOT/ORIGINAL/SHA256SUMS.txt")"
ACTUAL="$(sha256sum "$APK" | awk '{print $1}')"
[[ "$EXPECTED" == "$ACTUAL" ]] || { echo "FAIL: original hash mismatch"; exit 1; }
[[ -s "$ROOT/resources/AndroidManifest.xml" ]] || { echo "FAIL: decoded manifest missing"; exit 1; }
[[ -d "$ROOT/sources/sources" ]] || { echo "FAIL: JADX sources missing"; exit 1; }
[[ -d "$ROOT/resources/res" ]] || { echo "FAIL: decoded resources missing"; exit 1; }
printf 'PASS: original hash matches\n'
printf 'JADX Java files: '; find "$ROOT/sources/sources" -type f -name '*.java' | wc -l
printf 'Resource files: '; find "$ROOT/resources/res" -type f | wc -l
printf 'Manifest components: '; grep -Ec '<(activity|service|receiver|provider) ' "$ROOT/resources/AndroidManifest.xml" || true
printf 'No build/sign/install operation is performed by this script.\n'
