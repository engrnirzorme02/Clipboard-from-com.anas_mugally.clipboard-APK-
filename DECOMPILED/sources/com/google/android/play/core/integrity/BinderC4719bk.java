package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4763G;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bk */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4719bk extends BinderC4717bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4722bn f18310c;

    /* JADX INFO: renamed from: d */
    private final C4763G f18311d;

    /* JADX INFO: renamed from: e */
    private final long f18312e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC4719bk(C4722bn c4722bn, TaskCompletionSource taskCompletionSource, long j7) {
        super(c4722bn, taskCompletionSource);
        this.f18310c = c4722bn;
        this.f18311d = new C4763G("OnRequestIntegrityTokenCallback");
        this.f18312e = j7;
    }

    @Override // com.google.android.play.core.integrity.BinderC4717bi, com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: c */
    public final void mo21857c(Bundle bundle) {
        super.mo21857c(bundle);
        this.f18311d.m21893d("onRequestExpressIntegrityToken", new Object[0]);
        C3554b c3554bMo21874a = this.f18310c.f18321f.mo21874a(bundle);
        if (c3554bMo21874a != null) {
            this.f18307a.trySetException(c3554bMo21874a);
            return;
        }
        C4718bj c4718bj = new C4718bj(this, this.f18310c.f18318c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f18307a;
        C4708b c4708b = new C4708b();
        c4708b.mo21853b(bundle.getString("token"));
        c4708b.mo21852a(c4718bj);
        taskCompletionSource.trySetResult(c4708b.mo21854c());
    }
}
