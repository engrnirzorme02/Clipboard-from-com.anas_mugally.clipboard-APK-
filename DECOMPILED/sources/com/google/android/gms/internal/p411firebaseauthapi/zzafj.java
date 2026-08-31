package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.firebase.auth.AbstractC4825I;
import com.google.firebase.auth.C4824H;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzafj implements zzafm {
    private final /* synthetic */ String zza;

    zzafj(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafm
    public final void zza(AbstractC4825I abstractC4825I, Object... objArr) {
        abstractC4825I.onCodeSent(this.zza, C4824H.m22011T());
    }
}
