package com.google.android.gms.internal.ads;

import java.util.Objects;
import p314o2.C6561m;
import p332q2.AbstractC6824a;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwe extends AbstractC6824a.a {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    zzdwe(zzdwp zzdwpVar, String str) {
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
        this.zzb.zzf(this.zza, (AbstractC6824a) obj);
    }
}
