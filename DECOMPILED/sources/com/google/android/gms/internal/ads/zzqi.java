package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqi {
    private final Context zza;
    private Boolean zzb;

    public zzqi() {
        this(null);
    }

    public final zzpg zza(zzu zzuVar, zzc zzcVar) {
        int i7;
        boolean zBooleanValue;
        zzuVar.getClass();
        zzcVar.getClass();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 29 || (i7 = zzuVar.zzH) == -1) {
            return zzpg.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z7 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzca.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzuVar.zzo;
        str.getClass();
        int iZzh = zzar.zzh(str, zzuVar.zzk);
        if (iZzh == 0 || i8 < zzeo.zzD(iZzh)) {
            return zzpg.zza;
        }
        int iZzB = zzeo.zzB(zzuVar.zzG);
        if (iZzB == 0) {
            return zzpg.zza;
        }
        try {
            AudioFormat audioFormatZzC = zzeo.zzC(i7, iZzB, iZzh);
            if (i8 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatZzC, zzcVar.zza())) {
                    return zzpg.zza;
                }
                zzpf zzpfVar = new zzpf();
                zzpfVar.zza(true);
                zzpfVar.zzc(zBooleanValue);
                return zzpfVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatZzC, zzcVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzpg.zza;
            }
            zzpf zzpfVar2 = new zzpf();
            if (i8 > 32 && playbackOffloadSupport == 2) {
                z7 = true;
            }
            zzpfVar2.zza(true);
            zzpfVar2.zzb(z7);
            zzpfVar2.zzc(zBooleanValue);
            return zzpfVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpg.zza;
        }
    }

    public zzqi(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
