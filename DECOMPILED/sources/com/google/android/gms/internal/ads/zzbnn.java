package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbnn implements zzbzq {
    final /* synthetic */ zzbno zza;

    zzbnn(zzbno zzbnoVar) {
        Objects.requireNonNull(zzbnoVar);
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbmk zzbmkVar = (zzbmk) obj;
        zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbmk zzbmkVar2 = zzbmkVar;
                zzbmkVar2.zzn("/result", zzbjk.zzo);
                zzbmkVar2.zzj();
            }
        });
    }
}
