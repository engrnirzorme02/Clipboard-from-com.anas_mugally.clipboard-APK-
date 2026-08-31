package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgye implements zzgyd {
    static final /* synthetic */ zzgye zza = new zzgye();

    private /* synthetic */ zzgye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyd
    public final /* synthetic */ zzgqd zza(zzgqs zzgqsVar, Integer num) throws GeneralSecurityException {
        int i7 = zzgyf.zza;
        zzhdw zzhdwVarZzc = ((zzgxw) zzgqsVar).zzb().zzc();
        zzgqe zzgqeVarZzd = zzgxk.zza().zzd(zzhdwVarZzc.zza());
        if (!zzgxk.zza().zze(zzhdwVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhdt zzhdtVarZzc = zzgqeVarZzd.zzc(zzhdwVarZzc.zzb());
        return new zzgxv(zzgzj.zza(zzhdtVarZzc.zza(), zzhdtVarZzc.zzb(), zzhdtVarZzc.zzc(), zzhdwVarZzc.zzc(), num), zzgqc.zza());
    }
}
