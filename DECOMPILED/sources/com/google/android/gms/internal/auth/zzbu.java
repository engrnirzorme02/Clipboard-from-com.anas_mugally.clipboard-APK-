package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import p128Q2.C1256c;

/* JADX INFO: loaded from: classes2.dex */
final class zzbu implements InterfaceC3643m {
    private final Status zza;
    private C1256c zzb;

    public zzbu(Status status) {
        this.zza = status;
    }

    public final C1256c getResponse() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.zza;
    }

    public zzbu(C1256c c1256c) {
        this.zzb = c1256c;
        this.zza = Status.f14513f;
    }
}
