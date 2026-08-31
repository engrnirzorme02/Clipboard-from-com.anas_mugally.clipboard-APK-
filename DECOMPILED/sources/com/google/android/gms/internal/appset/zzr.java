package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import p084K2.C0738c;
import p084K2.InterfaceC0737b;
import p170W2.C1841f;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr implements InterfaceC0737b {
    private final InterfaceC0737b zza;
    private final InterfaceC0737b zzb;

    public zzr(Context context) {
        this.zza = new zzp(context, C1841f.m7623f());
        this.zzb = zzl.zzc(context);
    }

    public static /* synthetic */ Task zza(zzr zzrVar, Task task) {
        if (!task.isSuccessful() && !task.isCanceled()) {
            Exception exception = task.getException();
            if (exception instanceof C3554b) {
                int statusCode = ((C3554b) exception).getStatusCode();
                if (statusCode == 43001 || statusCode == 43002 || statusCode == 43003 || statusCode == 17) {
                    return zzrVar.zzb.getAppSetIdInfo();
                }
                if (statusCode == 43000) {
                    return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                }
                if (statusCode == 15) {
                    return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                }
            }
        }
        return task;
    }

    @Override // p084K2.InterfaceC0737b
    public final Task<C0738c> getAppSetIdInfo() {
        return this.zza.getAppSetIdInfo().continueWithTask(new Continuation() { // from class: com.google.android.gms.internal.appset.zzq
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return zzr.zza(this.zza, task);
            }
        });
    }
}
