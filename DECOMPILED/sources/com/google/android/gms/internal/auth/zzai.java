package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.InterfaceC3643m;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class zzai implements InterfaceC3643m {
    private static final Account zza = new Account("DUMMY_NAME", "com.google");
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.InterfaceC3643m
    public final Status getStatus() {
        return this.zzb;
    }
}
