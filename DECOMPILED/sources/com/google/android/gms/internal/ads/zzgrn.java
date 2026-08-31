package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgrn implements zzgyd {
    static final /* synthetic */ zzgrn zza = new zzgrn();

    private /* synthetic */ zzgrn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* synthetic */ zzgqd zza(zzgqs zzgqsVar, Integer num) throws GeneralSecurityException {
        zzgru zzgruVar = (zzgru) zzgqsVar;
        int i7 = zzgrq.zza;
        if (zzgruVar.zzc() != 16 && zzgruVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzgrl zzgrlVar = new zzgrl(null);
        zzgrlVar.zza(zzgruVar);
        zzgrlVar.zzd(num);
        zzgrlVar.zzb(zzhgh.zzb(zzgruVar.zzc()));
        zzgrlVar.zzc(zzhgh.zzb(zzgruVar.zzd()));
        return zzgrlVar.zze();
    }
}
