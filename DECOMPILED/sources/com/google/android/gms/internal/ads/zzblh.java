package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzblh implements AbstractC3686c.a {
    final /* synthetic */ zzbzm zza;
    final /* synthetic */ zzblj zzb;

    zzblh(zzblj zzbljVar, zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
        Objects.requireNonNull(zzbljVar);
        this.zzb = zzbljVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zzc().zzp());
        } catch (DeadObjectException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 23);
        sb.append("onConnectionSuspended: ");
        sb.append(i7);
        this.zza.zzd(new RuntimeException(sb.toString()));
    }
}
