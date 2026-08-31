package com.google.android.gms.internal.p409authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zbam extends InterfaceC3602h.a {
    final /* synthetic */ TaskCompletionSource zba;

    zbam(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3602h
    public final void onResult(Status status) {
        AbstractC3634x.m17953a(status, this.zba);
    }
}
