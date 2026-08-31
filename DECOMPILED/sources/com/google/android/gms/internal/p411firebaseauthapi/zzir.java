package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzir extends ThreadLocal<Cipher> {
    zzir() {
    }

    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzgz.zza(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
