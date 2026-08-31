package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC4764H implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TaskCompletionSource f18367a;

    AbstractRunnableC4764H() {
        this.f18367a = null;
    }

    /* JADX INFO: renamed from: a */
    public void mo21833a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f18367a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    /* JADX INFO: renamed from: b */
    protected abstract void mo21834b();

    /* JADX INFO: renamed from: c */
    final TaskCompletionSource m21895c() {
        return this.f18367a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo21834b();
        } catch (Exception e7) {
            mo21833a(e7);
        }
    }

    public AbstractRunnableC4764H(TaskCompletionSource taskCompletionSource) {
        this.f18367a = taskCompletionSource;
    }
}
