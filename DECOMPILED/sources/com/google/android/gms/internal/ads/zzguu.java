package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzguu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgut.zza, zzguq.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgpx.class, zzhds.SYMMETRIC, zzhez.zze());
    private static final zzgyg zzd = zzgur.zza;
    private static final zzgyd zze = zzgus.zza;

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i7 = zzgww.zza;
        zzgww.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zzgykVarZza = zzgyk.zza();
        HashMap map = new HashMap();
        map.put("XCHACHA20_POLY1305", zzguw.zzb(zzguv.zza));
        map.put("XCHACHA20_POLY1305_RAW", zzguw.zzb(zzguv.zzc));
        zzgykVarZza.zzd(Collections.unmodifiableMap(map));
        zzgyf.zza().zzb(zze, zzguw.class);
        zzgyh.zza().zzb(zzd, zzguw.class);
        zzgxk.zza().zzb(zzc, true);
    }
}
