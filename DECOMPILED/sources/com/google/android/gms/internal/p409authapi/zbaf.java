package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p114O2.C1126i;

/* JADX INFO: loaded from: classes2.dex */
final class zbaf extends zbr {
    final /* synthetic */ TaskCompletionSource zba;

    zbaf(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbs
    public final void zbb(Status status, C1126i c1126i) {
        if (status.m17747X()) {
            this.zba.setResult(c1126i);
        } else {
            this.zba.setException(AbstractC3684b.m18000a(status));
        }
    }
}
