package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.firebase.auth.AbstractC4825I;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzafl implements zzafm {
    private final /* synthetic */ String zza;

    zzafl(zzafh zzafhVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafm
    public final void zza(AbstractC4825I abstractC4825I, Object... objArr) {
        abstractC4825I.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
