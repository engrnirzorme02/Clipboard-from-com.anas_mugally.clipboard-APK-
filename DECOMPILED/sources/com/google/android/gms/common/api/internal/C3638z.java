package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.z */
/* JADX INFO: loaded from: classes.dex */
final class C3638z implements AbstractC3561i.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BasePendingResult f14707a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C3563B f14708b;

    C3638z(C3563B c3563b, BasePendingResult basePendingResult) {
        this.f14708b = c3563b;
        this.f14707a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC3561i.a
    /* JADX INFO: renamed from: a */
    public final void mo17779a(Status status) {
        this.f14708b.f14564a.remove(this.f14707a);
    }
}
