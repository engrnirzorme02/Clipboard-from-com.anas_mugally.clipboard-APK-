package com.google.android.gms.internal.ads;

import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
final class zzdun implements zzgoq {
    final /* synthetic */ zzdux zza;

    zzdun(zzdux zzduxVar) {
        Objects.requireNonNull(zzduxVar);
        this.zza = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        synchronized (this) {
            zzdux zzduxVar = this.zza;
            zzduxVar.zzn(true);
            zzduxVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (C7351t.m32357o().mo18161c() - zzduxVar.zzo()));
            zzduxVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdux zzduxVar = this.zza;
            zzduxVar.zzn(true);
            zzduxVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (C7351t.m32357o().mo18161c() - zzduxVar.zzo()));
            zzduxVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdum
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
