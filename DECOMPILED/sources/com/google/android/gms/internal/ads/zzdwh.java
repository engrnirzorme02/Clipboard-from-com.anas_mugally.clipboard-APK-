package com.google.android.gms.internal.ads;

import java.util.Objects;
import p068I2.AbstractC0608c;
import p068I2.AbstractC0609d;
import p314o2.C6561m;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwh extends AbstractC0609d {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    zzdwh(zzdwp zzdwpVar, String str) {
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
        this.zzb.zzf(this.zza, (AbstractC0608c) obj);
    }
}
