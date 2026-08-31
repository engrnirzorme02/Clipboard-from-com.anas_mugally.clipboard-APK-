package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class zzgor implements Runnable {
    final Future zza;
    final zzgoq zzb;

    zzgor(Future future, zzgoq zzgoqVar) {
        this.zza = future;
        this.zzb = zzgoqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Future future = this.zza;
        if ((future instanceof zzgpv) && (thZza = zzgpw.zza((zzgpv) future)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzgot.zzr(future));
        } catch (ExecutionException e7) {
            this.zzb.zza(e7.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzggy zzggyVarZzb = zzggz.zzb(this);
        zzggyVarZzb.zza(this.zzb);
        return zzggyVarZzb.toString();
    }
}
