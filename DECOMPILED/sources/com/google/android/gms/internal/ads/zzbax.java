package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbax extends zzbzm {
    final /* synthetic */ zzbbd zza;

    zzbax(zzbbd zzbbdVar) {
        Objects.requireNonNull(zzbbdVar);
        this.zza = zzbbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzm, java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        this.zza.zzb();
        return super.cancel(z7);
    }
}
