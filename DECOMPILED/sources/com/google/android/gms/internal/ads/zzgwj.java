package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwj implements zzgpx {
    private final zzgpx zza;
    private final byte[] zzb;

    private zzgwj(zzgpx zzgpxVar, byte[] bArr) {
        this.zza = zzgpxVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgpx zzb(zzgxv zzgxvVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgzj zzgzjVarZzc = zzgxvVar.zzc(zzgqc.zza());
        zzgpx zzgpxVar = (zzgpx) zzgxk.zza().zzc(zzgzjVarZzc.zzg(), zzgpx.class).zza(zzgzjVarZzc.zzb());
        zzhep zzhepVarZzd = zzgzjVarZzc.zzd();
        int iOrdinal = zzhepVarZzd.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgyp.zzb(zzgxvVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzhepVarZzd)));
            }
            bArrZzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgyp.zza.zzc();
        }
        return new zzgwj(zzgpxVar, bArrZzc);
    }

    public static zzgpx zzc(zzgpx zzgpxVar, zzhgg zzhggVar) {
        return new zzgwj(zzgpxVar, zzhggVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgpx
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgzu.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
