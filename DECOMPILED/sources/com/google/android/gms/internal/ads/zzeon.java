package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.C3250D;
import java.util.concurrent.Callable;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeon implements zzeup {
    private final zzgpd zza;
    private final Context zzb;

    public zzeon(zzgpd zzgpdVar, Context context) {
        this.zza = zzgpdVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final InterfaceFutureC1673e zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeom
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 13;
    }

    final /* synthetic */ zzeoo zzc() {
        int i7;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float fM17514b = C7351t.m32355m().m17514b();
        boolean zM17516d = C7351t.m32355m().m17516d();
        if (audioManager == null) {
            return new zzeoo(-1, false, false, -1, -1, -1, -1, -1, fM17514b, zM17516d, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzlN)).booleanValue()) {
            int iMo17472j = C7351t.m32352j().mo17472j(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i7 = iMo17472j;
        } else {
            i7 = -1;
            streamMaxVolume = -1;
        }
        return new zzeoo(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i7, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fM17514b, zM17516d, false);
    }
}
