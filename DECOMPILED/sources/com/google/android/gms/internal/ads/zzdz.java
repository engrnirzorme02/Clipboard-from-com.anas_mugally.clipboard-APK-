package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzdz {
    final /* synthetic */ zzed zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzdz(zzed zzedVar, zzdx zzdxVar, Executor executor) {
        Objects.requireNonNull(zzedVar);
        this.zza = zzedVar;
        this.zzb = new WeakReference(zzdxVar);
        this.zzc = executor;
    }

    public final boolean zza() {
        return this.zzb.get() == null;
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzdx zzdxVar = (zzdx) this.zzb.get();
        if (zzdxVar != null) {
            zzdxVar.zza(this.zza.zzc());
        }
    }
}
