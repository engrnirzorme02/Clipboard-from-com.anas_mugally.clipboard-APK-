package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractC4780j;
import com.google.android.play.integrity.internal.AbstractRunnableC4764H;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.be */
/* JADX INFO: loaded from: classes2.dex */
final class C4713be extends AbstractRunnableC4764H {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f18292a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4722bn f18293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4713be(C4722bn c4722bn, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f18293b = c4722bn;
        this.f18292a = context;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        this.f18293b.f18319d.trySetResult(Integer.valueOf(AbstractC4780j.m21924a(this.f18292a)));
    }
}
