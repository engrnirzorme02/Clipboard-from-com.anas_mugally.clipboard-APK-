package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnc {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzflp zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzflp.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? zzflp.OTHER : zzflp.CTV;
        }
        return zzflp.MOBILE;
    }
}
