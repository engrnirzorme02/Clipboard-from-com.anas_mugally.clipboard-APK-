package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p318o6.InterfaceC6639V;

/* JADX INFO: loaded from: classes2.dex */
public final class zzas {
    public static final Task zza(InterfaceC6639V interfaceC6639V) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        interfaceC6639V.invokeOnCompletion(new zzar(taskCompletionSource, interfaceC6639V));
        return taskCompletionSource.getTask();
    }
}
