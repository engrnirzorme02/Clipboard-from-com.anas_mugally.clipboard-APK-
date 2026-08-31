package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class zzak implements InterfaceC3643m {
    private final Status zza;

    public zzak(Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.zza;
    }
}
