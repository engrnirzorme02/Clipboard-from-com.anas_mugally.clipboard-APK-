package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p114O2.C1118a;

/* JADX INFO: loaded from: classes2.dex */
final class zbx extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    zbx(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbi
    public final void zbb(Status status, C1118a c1118a) {
        if (status.m17747X()) {
            this.zba.setResult(c1118a);
        } else {
            this.zba.setException(AbstractC3684b.m18000a(status));
        }
    }
}
