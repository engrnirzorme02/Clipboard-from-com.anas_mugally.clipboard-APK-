package com.google.android.gms.internal.p410authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3634x;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import com.google.android.gms.common.internal.AbstractC3684b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends InterfaceC3602h.a {
    final /* synthetic */ TaskCompletionSource zza;

    zzo(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3602h
    public final void onResult(Status status) {
        if (status.m17744U() == 6) {
            this.zza.trySetException(AbstractC3684b.m18000a(status));
        } else {
            AbstractC3634x.m17953a(status, this.zza);
        }
    }
}
