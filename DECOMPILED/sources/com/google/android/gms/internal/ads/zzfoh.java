package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class zzfoh {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfoh(Context context, Executor executor, Task task, boolean z7) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z7;
    }

    public static zzfoh zza(final Context context, Executor executor, boolean z7) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z7) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfod
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i7 = zzfoh.zza;
                    taskCompletionSource.setResult(zzfqd.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfof
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i7 = zzfoh.zza;
                    taskCompletionSource.setResult(zzfqd.zzc());
                }
            });
        }
        return new zzfoh(context, executor, taskCompletionSource.getTask(), z7);
    }

    static void zzg(int i7) {
        zzf = i7;
    }

    private final Task zzh(final int i7, long j7, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfog.zza);
        }
        Context context = this.zzb;
        final zzarc zzarcVarZza = zzarg.zza();
        zzarcVarZza.zza(context.getPackageName());
        zzarcVarZza.zzb(j7);
        zzarcVarZza.zzg(zzf);
        if (exc != null) {
            int i8 = zzghy.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzarcVarZza.zzc(stringWriter.toString());
            zzarcVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzarcVarZza.zze(str2);
        }
        if (str != null) {
            zzarcVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfoe
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                int i9 = zzfoh.zza;
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i10 = i7;
                zzfqc zzfqcVarZza = ((zzfqd) task.getResult()).zza(((zzarg) zzarcVarZza.zzbu()).zzaN());
                zzfqcVarZza.zzc(i10);
                zzfqcVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i7, long j7) {
        return zzh(i7, j7, null, null, null, null);
    }

    public Task zzc(int i7, long j7, Exception exc) {
        return zzh(i7, j7, exc, null, null, null);
    }

    public final Task zzd(int i7, long j7, String str, Map map) {
        return zzh(i7, j7, null, str, null, null);
    }

    public Task zze(int i7, String str) {
        return zzh(i7, 0L, null, null, null, str);
    }

    public final Task zzf(int i7, long j7, String str) {
        return zzh(i7, j7, null, null, null, str);
    }
}
