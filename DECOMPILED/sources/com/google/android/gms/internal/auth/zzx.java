package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzx extends InterfaceC3602h.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3602h
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
