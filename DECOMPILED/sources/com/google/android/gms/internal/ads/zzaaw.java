package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class zzaaw {
    public static void zza(Surface surface, float f7) {
        try {
            surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e7) {
            zzds.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
