package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p092L2.C0836c;

/* JADX INFO: loaded from: classes2.dex */
final class zzz extends zzl {
    final /* synthetic */ TaskCompletionSource zza;

    zzz(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzm
    public final void zzb(Status status, C0836c c0836c) {
        zzab.zzf(status, c0836c, this.zza);
    }
}
