package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwz implements zzgpx {
    private static final ThreadLocal zza = new zzgwx();

    public static zzgpx zzb(zzgsn zzgsnVar) {
        return zzgvp.zzc(zzgsnVar, zzgwy.zza);
    }

    static /* synthetic */ Cipher zzc() throws GeneralSecurityException {
        try {
            Cipher cipher = (Cipher) zza.get();
            if (cipher != null) {
                return cipher;
            }
            throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
        } catch (IllegalStateException e7) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
