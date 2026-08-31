package com.google.android.gms.internal.p410authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p410authapiphone.zzg
    public final void zzb(Status status, boolean z7) {
        AbstractC3634x.m17954b(status, Boolean.valueOf(z7), this.zza);
    }
}
