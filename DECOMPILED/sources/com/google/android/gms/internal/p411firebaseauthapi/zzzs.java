package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzs implements zzzp<Cipher> {
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzzp
    public final /* synthetic */ Cipher zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
