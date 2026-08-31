package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class zzca {
    private static AudioManager zza;

    public static synchronized AudioManager zza(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final zzde zzdeVar = new zzde(zzdb.zza);
                zzcv.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzca.zzd(applicationContext, zzdeVar);
                    }
                });
                zzdeVar.zzd();
                AudioManager audioManager2 = zza;
                if (audioManager2 != null) {
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager3;
            if (audioManager3 != null) {
                return audioManager3;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int zzb(AudioManager audioManager, zzby zzbyVar) {
        return audioManager.requestAudioFocus(zzbyVar.zzc());
    }

    public static int zzc(AudioManager audioManager, zzby zzbyVar) {
        return audioManager.abandonAudioFocusRequest(zzbyVar.zzc());
    }

    static /* synthetic */ void zzd(Context context, zzde zzdeVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdeVar.zza();
    }
}
