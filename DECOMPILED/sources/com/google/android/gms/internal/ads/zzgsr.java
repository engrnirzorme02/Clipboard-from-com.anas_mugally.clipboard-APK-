package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgso.zza, zzgsn.class, zzgpx.class);
    private static final zzgyd zzc = zzgsq.zza;
    private static final zzgyg zzd = zzgsp.zza;
    private static final zzgqe zze = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgpx.class, zzhds.SYMMETRIC, zzhdd.zze());

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i7 = zzgvu.zza;
        zzgvu.zza(zzgyo.zza());
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        zzgss zzgssVar = new zzgss(null);
        zzgssVar.zza(16);
        zzgst zzgstVar = zzgst.zza;
        zzgssVar.zzb(zzgstVar);
        map.put("AES128_GCM_SIV", zzgssVar.zzc());
        zzgss zzgssVar2 = new zzgss(null);
        zzgssVar2.zza(16);
        zzgst zzgstVar2 = zzgst.zzc;
        zzgssVar2.zzb(zzgstVar2);
        map.put("AES128_GCM_SIV_RAW", zzgssVar2.zzc());
        zzgss zzgssVar3 = new zzgss(null);
        zzgssVar3.zza(32);
        zzgssVar3.zzb(zzgstVar);
        map.put("AES256_GCM_SIV", zzgssVar3.zzc());
        zzgss zzgssVar4 = new zzgss(null);
        zzgssVar4.zza(32);
        zzgssVar4.zzb(zzgstVar2);
        map.put("AES256_GCM_SIV_RAW", zzgssVar4.zzc());
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyh.zza().zzb(zzd, zzgsu.class);
        zzgyf.zza().zzb(zzc, zzgsu.class);
        zzgyl.zza().zzb(zzb);
        zzgxk.zza().zzb(zze, true);
    }
}
