package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgrq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgrp.zza, zzgrm.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgpx.class, zzhds.SYMMETRIC, zzhcj.zzg());
    private static final zzgyg zzd = zzgro.zza;
    private static final zzgyd zze = zzgrn.zza;
    private static final int zzf = 2;

    public static void zza(boolean z7) throws GeneralSecurityException {
        int i7 = zzf;
        if (!zzgxd.zza(i7)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzgvb.zza;
        zzgvb.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", zzguj.zze);
        zzgrr zzgrrVar = new zzgrr(null);
        zzgrrVar.zza(16);
        zzgrrVar.zzb(32);
        zzgrrVar.zzd(16);
        zzgrrVar.zzc(16);
        zzgrs zzgrsVar = zzgrs.zzc;
        zzgrrVar.zzf(zzgrsVar);
        zzgrt zzgrtVar = zzgrt.zzc;
        zzgrrVar.zze(zzgrtVar);
        map.put("AES128_CTR_HMAC_SHA256_RAW", zzgrrVar.zzg());
        map.put("AES256_CTR_HMAC_SHA256", zzguj.zzf);
        zzgrr zzgrrVar2 = new zzgrr(null);
        zzgrrVar2.zza(32);
        zzgrrVar2.zzb(32);
        zzgrrVar2.zzd(32);
        zzgrrVar2.zzc(16);
        zzgrrVar2.zzf(zzgrsVar);
        zzgrrVar2.zze(zzgrtVar);
        map.put("AES256_CTR_HMAC_SHA256_RAW", zzgrrVar2.zzg());
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyh.zza().zzb(zzd, zzgru.class);
        zzgyf.zza().zzb(zze, zzgru.class);
        zzgxk.zza().zzf(zzc, i7, true);
    }
}
