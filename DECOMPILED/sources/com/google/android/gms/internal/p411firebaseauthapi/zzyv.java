package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzyv extends ThreadLocal<Cipher> {
    zzyv() {
    }

    private static Cipher zza() {
        try {
            return zzzj.zza.zza("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
