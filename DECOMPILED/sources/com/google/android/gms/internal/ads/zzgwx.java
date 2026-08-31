package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzgwx extends ThreadLocal {
    zzgwx() {
    }

    protected static final Cipher zza() {
        try {
            Cipher cipher = (Cipher) zzhfo.zza.zzb("AES/GCM-SIV/NoPadding");
            if (zzgvp.zzb(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
