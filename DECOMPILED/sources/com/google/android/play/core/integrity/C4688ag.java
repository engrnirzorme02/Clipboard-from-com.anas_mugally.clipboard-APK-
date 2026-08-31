package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC4764H;
import com.google.android.play.integrity.internal.InterfaceC4758B;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ag */
/* JADX INFO: loaded from: classes2.dex */
final class C4688ag extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f18244a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f18245b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f18246c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f18247d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4691aj f18248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4688ag(C4691aj c4691aj, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(taskCompletionSource);
        this.f18248e = c4691aj;
        this.f18244a = bundle;
        this.f18245b = activity;
        this.f18246c = taskCompletionSource2;
        this.f18247d = i7;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        try {
            InterfaceC4758B interfaceC4758B = (InterfaceC4758B) this.f18248e.f18253a.m21918e();
            Bundle bundle = this.f18244a;
            C4691aj c4691aj = this.f18248e;
            interfaceC4758B.mo21886a(bundle, c4691aj.f18256d.m21846a(this.f18245b, this.f18246c, c4691aj.f18253a));
        } catch (RemoteException e7) {
            this.f18248e.f18254b.m21892c(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f18247d));
            this.f18246c.trySetException(new IntegrityServiceException(-100, e7));
        }
    }
}
