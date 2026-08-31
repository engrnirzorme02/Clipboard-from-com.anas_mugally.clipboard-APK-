package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzdlq implements zzgoq {
    final /* synthetic */ zzbzm zza;

    zzdlq(zzdmc zzdmcVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzdmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33328c("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcek zzcekVar = (zzcek) obj;
        if (zzcekVar == null) {
            this.zza.zzd(new zzeho(1, "Missing webview from video view future."));
            return;
        }
        final zzbzm zzbzmVar = this.zza;
        zzcekVar.zzab("/video", new zzccc(new zzccb() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzccb
            public final /* synthetic */ void zza(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                zzbzmVar.zzc(bundle);
            }
        }));
        zzcekVar.zzI();
    }
}
