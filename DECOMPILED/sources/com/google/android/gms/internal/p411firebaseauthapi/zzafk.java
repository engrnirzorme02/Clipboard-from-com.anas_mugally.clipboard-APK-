package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.AbstractC4825I;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzafk implements zzafm {
    private final /* synthetic */ Status zza;

    zzafk(zzafh zzafhVar, Status status) {
        this.zza = status;
        Objects.requireNonNull(zzafhVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzafm
    public final void zza(AbstractC4825I abstractC4825I, Object... objArr) {
        abstractC4825I.onVerificationFailed(zzaen.zza(this.zza));
    }
}
