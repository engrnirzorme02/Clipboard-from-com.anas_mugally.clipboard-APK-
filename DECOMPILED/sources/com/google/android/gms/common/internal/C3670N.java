package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.N */
/* JADX INFO: loaded from: classes.dex */
final class C3670N implements AbstractC3561i.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AbstractC3561i f14726a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ TaskCompletionSource f14727b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ AbstractC3716r.a f14728c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ InterfaceC3672P f14729d;

    C3670N(AbstractC3561i abstractC3561i, TaskCompletionSource taskCompletionSource, AbstractC3716r.a aVar, InterfaceC3672P interfaceC3672P) {
        this.f14726a = abstractC3561i;
        this.f14727b = taskCompletionSource;
        this.f14728c = aVar;
        this.f14729d = interfaceC3672P;
    }

    @Override // com.google.android.gms.common.api.AbstractC3561i.a
    /* JADX INFO: renamed from: a */
    public final void mo17779a(Status status) {
        if (!status.m17747X()) {
            this.f14727b.setException(AbstractC3684b.m18000a(status));
        } else {
            this.f14727b.setResult(this.f14728c.mo17733a(this.f14726a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
