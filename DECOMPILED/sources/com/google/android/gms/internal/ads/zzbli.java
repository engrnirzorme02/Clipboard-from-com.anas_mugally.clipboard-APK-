package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.Objects;
import p170W2.C1837b;

/* JADX INFO: loaded from: classes2.dex */
final class zzbli implements AbstractC3686c.b {
    final /* synthetic */ zzbzm zza;

    zzbli(zzblj zzbljVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbljVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
