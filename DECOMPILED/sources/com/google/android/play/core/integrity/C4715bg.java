package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC4793w;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bg */
/* JADX INFO: loaded from: classes2.dex */
final class C4715bg extends AbstractC4721bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f18297a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f18298b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f18299c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ TaskCompletionSource f18300d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4722bn f18301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4715bg(C4722bn c4722bn, TaskCompletionSource taskCompletionSource, int i7, String str, long j7, long j8, TaskCompletionSource taskCompletionSource2) {
        super(c4722bn, taskCompletionSource);
        this.f18301e = c4722bn;
        this.f18297a = str;
        this.f18298b = j7;
        this.f18299c = j8;
        this.f18300d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        if (C4722bn.m21868k(this.f18301e)) {
            super.mo21833a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C4722bn c4722bn = this.f18301e;
            ((InterfaceC4793w) c4722bn.f18316a.m21918e()).mo21940e0(C4722bn.m21861a(c4722bn, this.f18297a, this.f18298b, this.f18299c, 0), new BinderC4719bk(this.f18301e, this.f18300d, this.f18298b));
        } catch (RemoteException e7) {
            this.f18301e.f18317b.m21892c(e7, "requestExpressIntegrityToken(%s, %s)", this.f18297a, Long.valueOf(this.f18298b));
            this.f18300d.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
