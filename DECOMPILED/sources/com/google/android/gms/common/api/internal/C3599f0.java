package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.tasks.TaskCompletionSource;
import p170W2.C1839d;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.f0 */
/* JADX INFO: loaded from: classes.dex */
final class C3599f0 extends AbstractC3632w {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AbstractC3632w.a f14639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3599f0(AbstractC3632w.a aVar, C1839d[] c1839dArr, boolean z7, int i7) {
        super(c1839dArr, z7, i7);
        this.f14639d = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3632w
    /* JADX INFO: renamed from: b */
    protected final void mo17869b(C3553a.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f14639d.f14695a.accept(bVar, taskCompletionSource);
    }
}
