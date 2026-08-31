package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
final class zzhfe extends ThreadLocal {
    zzhfe() {
    }

    protected static final Cipher zza() {
        try {
            return (Cipher) zzhfo.zza.zzb("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
