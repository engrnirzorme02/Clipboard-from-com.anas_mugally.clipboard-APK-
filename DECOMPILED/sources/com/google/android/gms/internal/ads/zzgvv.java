package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvv extends ThreadLocal {
    zzgvv() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhfo.zza.zzb("ChaCha20-Poly1305");
            if (zzgvw.zzf(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
