package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.C4823G;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzafi implements zzafm {
    private final /* synthetic */ C4823G zza;

    zzafi(zzafh zzafhVar, C4823G c4823g) {
        this.zza = c4823g;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafm
    public final void zza(AbstractC4825I abstractC4825I, Object... objArr) {
        abstractC4825I.onVerificationCompleted(this.zza);
    }
}
