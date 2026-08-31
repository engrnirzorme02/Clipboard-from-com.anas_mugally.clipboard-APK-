package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzo implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzp zzb;

    zzo(zzp zzpVar, Task task) {
        this.zzb = zzpVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.zzb.zzb.then(this.zza.getResult());
            if (taskThen == null) {
                this.zzb.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            zzp zzpVar = this.zzb;
            Executor executor = TaskExecutors.zza;
            taskThen.addOnSuccessListener(executor, zzpVar);
            taskThen.addOnFailureListener(executor, this.zzb);
            taskThen.addOnCanceledListener(executor, this.zzb);
        } catch (RuntimeExecutionException e7) {
            if (e7.getCause() instanceof Exception) {
                this.zzb.onFailure((Exception) e7.getCause());
            } else {
                this.zzb.onFailure(e7);
            }
        } catch (CancellationException unused) {
            this.zzb.onCanceled();
        } catch (Exception e8) {
            this.zzb.onFailure(e8);
        }
    }
}
