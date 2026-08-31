package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1444v;
import p238e6.InterfaceC5367l;
import p318o6.InterfaceC6639V;

/* JADX INFO: loaded from: classes2.dex */
final class zzar extends AbstractC6119o implements InterfaceC5367l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ InterfaceC6639V zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(TaskCompletionSource taskCompletionSource, InterfaceC6639V interfaceC6639V) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = interfaceC6639V;
    }

    @Override // p238e6.InterfaceC5367l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return C1444v.f4971a;
    }
}
