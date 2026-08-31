package com.google.android.gms.internal.p409authapi;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zban extends zbp {
    final /* synthetic */ TaskCompletionSource zba;

    zban(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p409authapi.zbq
    public final void zbb(Status status, PendingIntent pendingIntent) {
        AbstractC3634x.m17954b(status, pendingIntent, this.zba);
    }
}
