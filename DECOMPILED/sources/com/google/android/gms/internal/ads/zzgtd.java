package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtd {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgtc.zza, zzgti.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgpx.class, zzhds.REMOTE, zzhei.zze());
    private static final zzgyd zzd = zzgtb.zza;

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i7 = zzgtp.zza;
        zzgtp.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyf.zza().zzb(zzd, zzgtk.class);
        zzgxk.zza().zzb(zzc, true);
    }
}
