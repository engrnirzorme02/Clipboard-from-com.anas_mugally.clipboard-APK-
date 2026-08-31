package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC3943H;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzae extends AbstractC3943H {
    public zzae(AbstractC3560h abstractC3560h) {
        super(abstractC3560h);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return status;
    }
}
