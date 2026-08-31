package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgsg implements zzgyd {
    static final /* synthetic */ zzgsg zza = new zzgsg();

    private /* synthetic */ zzgsg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* synthetic */ zzgqd zza(zzgqs zzgqsVar, Integer num) throws GeneralSecurityException {
        zzgsl zzgslVar = (zzgsl) zzgqsVar;
        int i7 = zzgsi.zza;
        if (zzgslVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzgsd zzgsdVar = new zzgsd(null);
        zzgsdVar.zza(zzgslVar);
        zzgsdVar.zzc(num);
        zzgsdVar.zzb(zzhgh.zzb(zzgslVar.zzc()));
        return zzgsdVar.zzd();
    }
}
