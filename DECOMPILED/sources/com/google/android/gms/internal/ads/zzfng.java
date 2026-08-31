package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfng {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfnf(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfnc.zzb() != zzflp.CTV) {
            return 2;
        }
        return zza;
    }
}
