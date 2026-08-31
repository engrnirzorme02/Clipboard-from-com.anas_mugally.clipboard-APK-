package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgbd extends zzfoh {
    private final zzfvz zzb;

    zzgbd(Context context, Executor executor, zzfvz zzfvzVar) {
        super(context, executor, new TaskCompletionSource().getTask(), false);
        this.zzb = zzfvzVar;
    }

    private static Task zzh() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zzb(int i7, long j7) {
        this.zzb.zzb(i7, j7, null, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zzc(int i7, long j7, Exception exc) {
        this.zzb.zzb(i7, j7, exc, null);
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzfoh
    public final Task zze(int i7, String str) {
        this.zzb.zzb(i7, -1L, null, str);
        return zzh();
    }
}
