package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.AbstractC3986y;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzf extends AbstractC3986y {
    public zzf(AbstractC3560h abstractC3560h) {
        super(abstractC3560h);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ InterfaceC3643m createFailedResult(Status status) {
        return status;
    }
}
