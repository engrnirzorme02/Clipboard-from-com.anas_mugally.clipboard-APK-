package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.InterfaceC4793w;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bf */
/* JADX INFO: loaded from: classes2.dex */
final class C4714bf extends AbstractC4721bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f18294a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f18295b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4722bn f18296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4714bf(C4722bn c4722bn, TaskCompletionSource taskCompletionSource, int i7, long j7, TaskCompletionSource taskCompletionSource2) {
        super(c4722bn, taskCompletionSource);
        this.f18296c = c4722bn;
        this.f18294a = j7;
        this.f18295b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        if (C4722bn.m21868k(this.f18296c)) {
            super.mo21833a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C4722bn c4722bn = this.f18296c;
            ((InterfaceC4793w) c4722bn.f18316a.m21918e()).mo21938Q(C4722bn.m21862b(c4722bn, this.f18294a, 0), new BinderC4720bl(this.f18296c, this.f18295b));
        } catch (RemoteException e7) {
            this.f18296c.f18317b.m21892c(e7, "warmUpIntegrityToken(%s)", Long.valueOf(this.f18294a));
            this.f18295b.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
