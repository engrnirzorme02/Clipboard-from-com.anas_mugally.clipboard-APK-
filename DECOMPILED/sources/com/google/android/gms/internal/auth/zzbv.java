package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv implements InterfaceC3643m {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        this.zza = (Status) AbstractC3718s.m18083l(status);
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        this.zzb = (String) AbstractC3718s.m18083l(str);
        this.zza = Status.f14513f;
    }
}
