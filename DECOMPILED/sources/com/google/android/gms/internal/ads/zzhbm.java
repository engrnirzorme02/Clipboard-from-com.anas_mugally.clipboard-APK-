package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbm implements zzhae {
    public zzhbm(zzgzw zzgzwVar) {
    }

    public static zzhae zza(zzgzw zzgzwVar) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerZza = zzgxf.zza();
        if (providerZza != null) {
            try {
                return zzhbl.zza(zzgzwVar, providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new zzhbm(zzgzwVar);
    }
}
