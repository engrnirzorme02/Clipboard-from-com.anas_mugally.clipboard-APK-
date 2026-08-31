package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p114O2.C1128k;

/* JADX INFO: loaded from: classes2.dex */
final class zbag extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    zbag(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbu
    public final void zbb(Status status, C1128k c1128k) {
        AbstractC3634x.m17954b(status, c1128k, this.zba);
    }
}
