package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.AbstractC3525a;
import com.google.android.gms.auth.account.InterfaceC3526b;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class zzal implements InterfaceC3526b {
    private static final Status zza = new Status(13);

    public final AbstractC3561i addWorkAccount(AbstractC3560h abstractC3560h, String str) {
        return abstractC3560h.mo17772b(new zzae(this, AbstractC3525a.f14398a, abstractC3560h, str));
    }

    public final AbstractC3561i removeWorkAccount(AbstractC3560h abstractC3560h, Account account) {
        return abstractC3560h.mo17772b(new zzag(this, AbstractC3525a.f14398a, abstractC3560h, account));
    }

    public final void setWorkAuthenticatorEnabled(AbstractC3560h abstractC3560h, boolean z7) {
        setWorkAuthenticatorEnabledWithResult(abstractC3560h, z7);
    }

    public final AbstractC3561i setWorkAuthenticatorEnabledWithResult(AbstractC3560h abstractC3560h, boolean z7) {
        return abstractC3560h.mo17772b(new zzac(this, AbstractC3525a.f14398a, abstractC3560h, z7));
    }
}
