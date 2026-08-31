package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgsy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgsx.zza, zzgsv.class, zzgpx.class);
    private static final zzgyd zzc = zzgsw.zza;
    private static final zzgqe zzd = zzgxs.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgpx.class, zzhds.SYMMETRIC, zzhdh.zze());

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = zzgwb.zza;
        zzgwb.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyf.zza().zzb(zzc, zzgta.class);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzgta.zzb(zzgsz.zza));
        map.put("CHACHA20_POLY1305_RAW", zzgta.zzb(zzgsz.zzc));
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgxk.zza().zzb(zzd, true);
    }
}
