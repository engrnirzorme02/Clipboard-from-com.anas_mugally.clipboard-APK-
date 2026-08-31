package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqd {
    private static final ThreadLocal<SecureRandom> zza = new zzqg();

    static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandomZzb = zzb();
        secureRandomZzb.nextLong();
        return secureRandomZzb;
    }

    private static SecureRandom zzb() {
        Provider providerZza = zznh.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerZzb = zznh.zzb();
        if (providerZzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }

    public static byte[] zza(int i7) {
        byte[] bArr = new byte[i7];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
