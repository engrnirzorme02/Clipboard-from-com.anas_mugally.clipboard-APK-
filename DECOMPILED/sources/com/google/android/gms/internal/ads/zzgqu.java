package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqu {
    public static byte[] zza(zzgqs zzgqsVar) {
        return ((zzgzk) zzgyo.zza().zzk(zzgqsVar, zzgzk.class)).zzc().zzaN();
    }

    public static zzgqs zzb(byte[] bArr) {
        try {
            zzhdw zzhdwVarZzd = zzhdw.zzd(bArr, zzhhr.zza());
            zzgyo zzgyoVarZza = zzgyo.zza();
            zzgzk zzgzkVarZzb = zzgzk.zzb(zzhdwVarZzd);
            return !zzgyoVarZza.zzi(zzgzkVarZzb) ? new zzgxw(zzgzkVarZzb) : zzgyoVarZza.zzj(zzgzkVarZzb);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }
}
