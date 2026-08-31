package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgun {
    private static final zzgyd zza = zzgum.zza;
    private static final zzgzc zzb = zzgzc.zzd(zzgul.zza, zzguk.class, zzgpx.class);

    public static void zza(boolean z7) {
        int i7 = zzgwq.zza;
        zzgwq.zza(zzgyo.zza());
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzguj.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzguj.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzguj.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzguj.zzj);
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyl.zza().zzb(zzb);
        zzgyf.zza().zzb(zza, zzgup.class);
    }
}
