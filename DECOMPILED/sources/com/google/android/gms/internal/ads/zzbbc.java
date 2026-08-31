package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.Objects;
import p170W2.C1837b;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbc implements AbstractC3686c.b {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzbbd zzb;

    zzbbc(zzbbd zzbbdVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbbdVar);
        this.zzb = zzbbdVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        synchronized (this.zzb.zzf()) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
