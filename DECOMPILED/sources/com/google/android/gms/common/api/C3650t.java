package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: renamed from: com.google.android.gms.common.api.t */
/* JADX INFO: loaded from: classes.dex */
final class C3650t extends BasePendingResult {

    /* JADX INFO: renamed from: a */
    private final InterfaceC3643m f14712a;

    public C3650t(AbstractC3560h abstractC3560h, InterfaceC3643m interfaceC3643m) {
        super(abstractC3560h);
        this.f14712a = interfaceC3643m;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final InterfaceC3643m createFailedResult(Status status) {
        return this.f14712a;
    }
}
