package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zby extends InterfaceC3602h.a {
    final /* synthetic */ TaskCompletionSource zba;

    zby(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3602h
    public final void onResult(Status status) {
        if (status.m17747X()) {
            this.zba.setResult(null);
        } else {
            this.zba.setException(AbstractC3684b.m18000a(status));
        }
    }
}
