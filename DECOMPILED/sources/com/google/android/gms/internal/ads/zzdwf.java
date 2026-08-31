package com.google.android.gms.internal.ads;

import java.util.Objects;
import p314o2.AbstractC6552d;
import p314o2.AbstractC6559k;
import p314o2.C6561m;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwf extends AbstractC6552d {
    final /* synthetic */ String zza;
    final /* synthetic */ AbstractC6559k zzb;
    final /* synthetic */ zzdwp zzc;

    zzdwf(zzdwp zzdwpVar, String str, AbstractC6559k abstractC6559k) {
        this.zza = str;
        this.zzb = abstractC6559k;
        Objects.requireNonNull(zzdwpVar);
        this.zzc = zzdwpVar;
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.zzc.zzg(zzdwp.zzm(c6561m));
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
