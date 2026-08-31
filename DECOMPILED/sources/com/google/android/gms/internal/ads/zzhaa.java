package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhaa {
    private static final zzgyd zza = zzgzz.zza;
    private static final zzgzc zzb = zzgzc.zzd(zzgzx.zza, zzgzw.class, zzhae.class);
    private static final zzgzc zzc = zzgzc.zzd(zzgzy.zza, zzgzw.class, zzgqr.class);
    private static final zzgqe zzd = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgqr.class, zzhds.SYMMETRIC, zzhcd.zzg());

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i7 = zzhbj.zza;
        zzhbj.zza(zzgyo.zza());
        zzgyf.zza().zzb(zza, zzhad.class);
        zzgyl.zza().zzb(zzb);
        zzgyl.zza().zzb(zzc);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        zzhad zzhadVar = zzhbe.zzc;
        map.put("AES_CMAC", zzhadVar);
        map.put("AES256_CMAC", zzhadVar);
        zzhab zzhabVar = new zzhab(null);
        zzhabVar.zza(32);
        zzhabVar.zzb(16);
        zzhabVar.zzc(zzhac.zzd);
        map.put("AES256_CMAC_RAW", zzhabVar.zzd());
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgxk.zza().zzb(zzd, true);
    }

    static /* synthetic */ zzgzw zzb(zzhad zzhadVar, Integer num) throws GeneralSecurityException {
        zze(zzhadVar);
        zzgzv zzgzvVar = new zzgzv(null);
        zzgzvVar.zza(zzhadVar);
        zzgzvVar.zzb(zzhgh.zzb(zzhadVar.zzc()));
        zzgzvVar.zzc(num);
        return zzgzvVar.zzd();
    }

    static /* synthetic */ zzhae zzc(zzgzw zzgzwVar) throws GeneralSecurityException {
        zze(zzgzwVar.zze());
        return zzhbm.zza(zzgzwVar);
    }

    static /* synthetic */ zzgqr zzd(zzgzw zzgzwVar) throws GeneralSecurityException {
        zze(zzgzwVar.zze());
        return zzhgd.zza(zzgzwVar);
    }

    private static void zze(zzhad zzhadVar) throws GeneralSecurityException {
        if (zzhadVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
