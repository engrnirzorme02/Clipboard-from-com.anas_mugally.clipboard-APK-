package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> task);
}
