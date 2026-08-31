package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgsf.zza, zzgse.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgpx.class, zzhds.SYMMETRIC, zzhcz.zze());
    private static final zzgyg zzd = zzgsh.zza;
    private static final zzgyd zze = zzgsg.zza;
    private static final int zzf = 2;

    public static void zza(boolean z7) throws GeneralSecurityException {
        int i7 = zzf;
        if (!zzgxd.zza(i7)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i8 = zzgvn.zza;
        zzgvn.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("AES128_GCM", zzguj.zza);
        zzgsj zzgsjVar = new zzgsj(null);
        zzgsjVar.zzb(12);
        zzgsjVar.zza(16);
        zzgsjVar.zzc(16);
        zzgsk zzgskVar = zzgsk.zzc;
        zzgsjVar.zzd(zzgskVar);
        map.put("AES128_GCM_RAW", zzgsjVar.zze());
        map.put("AES256_GCM", zzguj.zzb);
        zzgsj zzgsjVar2 = new zzgsj(null);
        zzgsjVar2.zzb(12);
        zzgsjVar2.zza(32);
        zzgsjVar2.zzc(16);
        zzgsjVar2.zzd(zzgskVar);
        map.put("AES256_GCM_RAW", zzgsjVar2.zze());
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyh.zza().zzb(zzd, zzgsl.class);
        zzgyf.zza().zzb(zze, zzgsl.class);
        zzgxk.zza().zzf(zzc, i7, true);
    }
}
