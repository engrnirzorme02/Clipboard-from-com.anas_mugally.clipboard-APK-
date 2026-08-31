package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4763G;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bl */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4720bl extends BinderC4717bi {

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C4722bn f18313c;

    /* JADX INFO: renamed from: d */
    private final C4763G f18314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BinderC4720bl(C4722bn c4722bn, TaskCompletionSource taskCompletionSource) {
        super(c4722bn, taskCompletionSource);
        this.f18313c = c4722bn;
        this.f18314d = new C4763G("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.BinderC4717bi, com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: e */
    public final void mo21859e(Bundle bundle) {
        super.mo21859e(bundle);
        this.f18314d.m21893d("onWarmUpExpressIntegrityToken", new Object[0]);
        C3554b c3554bMo21874a = this.f18313c.f18321f.mo21874a(bundle);
        if (c3554bMo21874a != null) {
            this.f18307a.trySetException(c3554bMo21874a);
        } else {
            this.f18307a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
