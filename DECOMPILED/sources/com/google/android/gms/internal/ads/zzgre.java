package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgre {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxj zzb = zzb();

    public static zzgqb zza() throws GeneralSecurityException {
        if (zzgxe.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzgxj zzb() {
        try {
            zzgzd zzgzdVarZza = zzgzg.zza();
            zzgrk.zzd(zzgzdVarZza);
            zzgzdVarZza.zza(zzgzc.zzd(zzgrc.zza, zzgrm.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgra.zza, zzgse.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgrb.zza, zzgsn.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgqz.zza, zzgrw.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgqy.zza, zzgsv.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgqx.zza, zzguq.class, zzgpx.class));
            zzgzdVarZza.zza(zzgzc.zzd(zzgrd.zza, zzguk.class, zzgpx.class));
            return zzgxj.zzb(zzgzdVarZza.zzc());
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException(e7);
        }
    }
}
