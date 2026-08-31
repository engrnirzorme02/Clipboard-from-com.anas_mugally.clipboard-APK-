package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import p114O2.C1120c;

/* JADX INFO: loaded from: classes2.dex */
final class zbal extends zbk {
    final /* synthetic */ TaskCompletionSource zba;

    zbal(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbl
    public final void zbb(Status status, C1120c c1120c) {
        AbstractC3634x.m17954b(status, c1120c, this.zba);
    }
}
