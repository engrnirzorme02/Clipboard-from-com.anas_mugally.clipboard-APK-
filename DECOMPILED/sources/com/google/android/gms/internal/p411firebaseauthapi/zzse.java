package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzse implements zzqw {
    private static final zziv.zza zza = zziv.zza.zza;

    private zzse(zzqp zzqpVar, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            throw new IllegalArgumentException("conscrypt is null");
        }
        if (!zza.zza()) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzqpVar.zze().zzb();
            new SecretKeySpec(zzqpVar.zzf().zza(zzbf.zza()), "AES");
        } catch (NoSuchAlgorithmException e7) {
            throw new GeneralSecurityException("AES-CMAC not available.", e7);
        }
    }

    public static zzqw zza(zzqp zzqpVar, Provider provider) {
        return new zzse(zzqpVar, provider);
    }
}
