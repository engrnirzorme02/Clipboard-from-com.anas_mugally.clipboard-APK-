package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractRunnableC4764H;
import com.google.android.play.integrity.internal.C4777g;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bm */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4721bm extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ C4722bn f18315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractC4721bm(C4722bn c4722bn, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f18315f = c4722bn;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: a */
    public final void mo21833a(Exception exc) {
        if (!(exc instanceof C4777g)) {
            super.mo21833a(exc);
        } else if (C4722bn.m21868k(this.f18315f)) {
            super.mo21833a(new StandardIntegrityException(-2, exc));
        } else {
            super.mo21833a(new StandardIntegrityException(-9, exc));
        }
    }
}
