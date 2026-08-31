package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzhk extends ThreadLocal<Cipher> {
    zzhk() {
    }

    private static Cipher zza() {
        try {
            Cipher cipherZza = zzzj.zza.zza("ChaCha20-Poly1305");
            if (zzhh.zzb(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
