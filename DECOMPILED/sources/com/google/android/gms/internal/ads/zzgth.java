package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgth {
    public static final /* synthetic */ int zza = 0;
    private static final zzgqe zzb = zzgxs.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgpx.class, zzhds.SYMMETRIC, zzhem.zze());
    private static final zzgyd zzc = zzgtg.zza;
    private static final zzgzc zzd = zzgzc.zzd(zzgtf.zza, zzgtq.class, zzgpx.class);

    public static void zza(boolean z7) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i7 = zzgtz.zza;
        zzgtz.zza(zzgyo.zza());
        zzgyf.zza().zzb(zzc, zzgtu.class);
        zzgyl.zza().zzb(zzd);
        zzgxk.zza().zzb(zzb, true);
    }
}
