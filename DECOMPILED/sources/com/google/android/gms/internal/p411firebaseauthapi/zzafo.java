package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzafo {
    zzaeo zza;
    Executor zzb;

    public final <ResultT> Task<ResultT> zza(final zzafq<ResultT> zzafqVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafr
            @Override // java.lang.Runnable
            public final void run() {
                zzafqVar.zza(taskCompletionSource, this.zza.zza);
            }
        });
        return taskCompletionSource.getTask();
    }
}
