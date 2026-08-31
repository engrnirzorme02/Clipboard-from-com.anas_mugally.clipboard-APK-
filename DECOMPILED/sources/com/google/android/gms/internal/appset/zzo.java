package com.google.android.gms.internal.appset;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.tasks.TaskCompletionSource;
import p084K2.C0738c;
import p084K2.C0741f;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, C0741f c0741f) {
        AbstractC3634x.m17954b(status, c0741f != null ? new C0738c(c0741f.m3502U(), c0741f.m3501T()) : null, this.zza);
    }
}
