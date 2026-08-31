package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.v */
/* JADX INFO: loaded from: classes.dex */
public class C3630v extends BasePendingResult {
    public C3630v(AbstractC3560h abstractC3560h) {
        super(abstractC3560h);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return status;
    }
}
