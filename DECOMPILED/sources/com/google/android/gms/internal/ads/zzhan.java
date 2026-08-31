package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhan {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzhaj.zza, zzhai.class, zzhae.class);
    private static final zzgzc zzc = zzgzc.zzd(zzham.zza, zzhai.class, zzgqr.class);
    private static final zzgqe zzd = zzgxs.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgqr.class, zzhds.SYMMETRIC, zzhdm.zzh());
    private static final zzgyg zze = zzhal.zza;
    private static final zzgyd zzf = zzhak.zza;
    private static final int zzg = 2;

    public static void zza(boolean z7) throws GeneralSecurityException {
        int i7 = zzg;
        if (!zzgxd.zza(i7)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzhbs.zza;
        zzhbs.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyl.zza().zzb(zzc);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", zzhbe.zza);
        zzhao zzhaoVar = new zzhao(null);
        zzhaoVar.zza(32);
        zzhaoVar.zzb(16);
        zzhaq zzhaqVar = zzhaq.zzd;
        zzhaoVar.zzc(zzhaqVar);
        zzhap zzhapVar = zzhap.zzc;
        zzhaoVar.zzd(zzhapVar);
        map.put("HMAC_SHA256_128BITTAG_RAW", zzhaoVar.zze());
        zzhao zzhaoVar2 = new zzhao(null);
        zzhaoVar2.zza(32);
        zzhaoVar2.zzb(32);
        zzhaq zzhaqVar2 = zzhaq.zza;
        zzhaoVar2.zzc(zzhaqVar2);
        zzhaoVar2.zzd(zzhapVar);
        map.put("HMAC_SHA256_256BITTAG", zzhaoVar2.zze());
        zzhao zzhaoVar3 = new zzhao(null);
        zzhaoVar3.zza(32);
        zzhaoVar3.zzb(32);
        zzhaoVar3.zzc(zzhaqVar);
        zzhaoVar3.zzd(zzhapVar);
        map.put("HMAC_SHA256_256BITTAG_RAW", zzhaoVar3.zze());
        zzhao zzhaoVar4 = new zzhao(null);
        zzhaoVar4.zza(64);
        zzhaoVar4.zzb(16);
        zzhaoVar4.zzc(zzhaqVar2);
        zzhap zzhapVar2 = zzhap.zze;
        zzhaoVar4.zzd(zzhapVar2);
        map.put("HMAC_SHA512_128BITTAG", zzhaoVar4.zze());
        zzhao zzhaoVar5 = new zzhao(null);
        zzhaoVar5.zza(64);
        zzhaoVar5.zzb(16);
        zzhaoVar5.zzc(zzhaqVar);
        zzhaoVar5.zzd(zzhapVar2);
        map.put("HMAC_SHA512_128BITTAG_RAW", zzhaoVar5.zze());
        zzhao zzhaoVar6 = new zzhao(null);
        zzhaoVar6.zza(64);
        zzhaoVar6.zzb(32);
        zzhaoVar6.zzc(zzhaqVar2);
        zzhaoVar6.zzd(zzhapVar2);
        map.put("HMAC_SHA512_256BITTAG", zzhaoVar6.zze());
        zzhao zzhaoVar7 = new zzhao(null);
        zzhaoVar7.zza(64);
        zzhaoVar7.zzb(32);
        zzhaoVar7.zzc(zzhaqVar);
        zzhaoVar7.zzd(zzhapVar2);
        map.put("HMAC_SHA512_256BITTAG_RAW", zzhaoVar7.zze());
        map.put("HMAC_SHA512_512BITTAG", zzhbe.zzb);
        zzhao zzhaoVar8 = new zzhao(null);
        zzhaoVar8.zza(64);
        zzhaoVar8.zzb(64);
        zzhaoVar8.zzc(zzhaqVar);
        zzhaoVar8.zzd(zzhapVar2);
        map.put("HMAC_SHA512_512BITTAG_RAW", zzhaoVar8.zze());
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyf.zza().zzb(zzf, zzhar.class);
        zzgyh.zza().zzb(zze, zzhar.class);
        zzgxk.zza().zzf(zzd, i7, true);
    }
}
