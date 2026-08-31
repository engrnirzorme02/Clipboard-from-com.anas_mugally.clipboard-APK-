package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzage implements OnFailureListener {
    zzage(zzagc zzagcVar) {
        Objects.requireNonNull(zzagcVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzagc.zza.m8615c("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
