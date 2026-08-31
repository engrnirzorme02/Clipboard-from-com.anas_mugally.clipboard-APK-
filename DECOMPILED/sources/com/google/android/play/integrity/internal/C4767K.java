package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.K */
/* JADX INFO: loaded from: classes2.dex */
final class C4767K extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: r */
    final /* synthetic */ TaskCompletionSource f18371r;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ AbstractRunnableC4764H f18372s;

    /* JADX INFO: renamed from: t */
    final /* synthetic */ C4776f f18373t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4767K(C4776f c4776f, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC4764H abstractRunnableC4764H) {
        super(taskCompletionSource);
        this.f18373t = c4776f;
        this.f18371r = taskCompletionSource2;
        this.f18372s = abstractRunnableC4764H;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    public final void mo21834b() {
        synchronized (this.f18373t.f18387f) {
            try {
                C4776f.m21910o(this.f18373t, this.f18371r);
                if (this.f18373t.f18393l.getAndIncrement() > 0) {
                    this.f18373t.f18383b.m21893d("Already connected to the service.", new Object[0]);
                }
                C4776f.m21912q(this.f18373t, this.f18372s);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
