package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzy extends zzh {
    final /* synthetic */ TaskCompletionSource zza;

    zzy(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzi
    public final void zza(Status status, boolean z7) {
        AbstractC3634x.m17954b(status, Boolean.valueOf(z7), this.zza);
    }
}
