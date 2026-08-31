package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzah {
    final /* synthetic */ zzae zza;

    zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.InterfaceC3528d
    public final void zzb(Account account) {
        this.zza.setResult(new zzai(account != null ? Status.f14513f : zzal.zza, account));
    }
}
