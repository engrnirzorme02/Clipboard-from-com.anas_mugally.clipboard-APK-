package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p149T2.C1463c;

/* JADX INFO: loaded from: classes2.dex */
final class zzw extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    zzw(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zzb(Status status, C1463c c1463c) {
        AbstractC3634x.m17954b(status, c1463c, this.zza);
    }
}
