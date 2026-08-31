package com.google.android.gms.internal.ads;

import java.util.Objects;
import p314o2.AbstractC6552d;
import p314o2.C6561m;

/* JADX INFO: loaded from: classes2.dex */
final class zzdwj extends AbstractC6552d {
    final /* synthetic */ zzdwp zza;

    zzdwj(zzdwp zzdwpVar) {
        Objects.requireNonNull(zzdwpVar);
        this.zza = zzdwpVar;
    }

    @Override // p314o2.AbstractC6552d
    public final void onAdFailedToLoad(C6561m c6561m) {
        this.zza.zzg(zzdwp.zzm(c6561m));
    }
}
