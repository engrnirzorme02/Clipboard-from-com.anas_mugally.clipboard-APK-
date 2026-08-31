package com.google.android.gms.internal.ads;

import java.util.Objects;
import p076J2.AbstractC0679a;
import p076J2.AbstractC0680b;
import p314o2.C6561m;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwi extends AbstractC0680b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    zzdwi(zzdwp zzdwpVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdwpVar);
        this.zzb = zzdwpVar;
    }

    @Override // p314o2.AbstractC6553e
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.zzb.zzg(zzdwp.zzm(c6561m));
    }

    @Override // p314o2.AbstractC6553e
    public final /* bridge */ /* synthetic */ void onAdLoaded(Object obj) {
        this.zzb.zzf(this.zza, (AbstractC0679a) obj);
    }
}
