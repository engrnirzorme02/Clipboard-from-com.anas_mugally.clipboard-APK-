package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzy implements zzzp<Signature> {
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzzp
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
