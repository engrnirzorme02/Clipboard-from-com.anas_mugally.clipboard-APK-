package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3424C;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzdzy implements zzgoq {
    final /* synthetic */ zzbuf zza;
    final /* synthetic */ zzbuo zzb;

    zzdzy(zzeap zzeapVar, zzbuo zzbuoVar, zzbuf zzbufVar) {
        this.zzb = zzbuoVar;
        this.zza = zzbufVar;
        Objects.requireNonNull(zzeapVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(C3424C.m17380T(th));
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Service can't call client", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e7) {
            AbstractC3490o0.m17546l("Service can't call client", e7);
        }
    }
}
