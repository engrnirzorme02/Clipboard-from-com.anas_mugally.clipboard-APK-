package com.google.android.gms.internal.ads;

import java.util.Objects;
import p004A2.AbstractC0012a;
import p004A2.AbstractC0013b;
import p314o2.C6561m;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwg extends AbstractC0013b {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwp zzb;

    zzdwg(zzdwp zzdwpVar, String str) {
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
        this.zzb.zzf(this.zza, (AbstractC0012a) obj);
    }
}
