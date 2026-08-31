package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.A */
/* JADX INFO: loaded from: classes.dex */
final class C3562A implements OnCompleteListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f14562a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3563B f14563b;

    C3562A(C3563B c3563b, TaskCompletionSource taskCompletionSource) {
        this.f14563b = c3563b;
        this.f14562a = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.f14563b.f14565b.remove(this.f14562a);
    }
}
