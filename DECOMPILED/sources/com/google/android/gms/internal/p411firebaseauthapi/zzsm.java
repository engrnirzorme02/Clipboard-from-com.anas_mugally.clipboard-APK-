package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsm implements zzcc {
    private static final byte[] zza = {0};
    private final zzcc zzb;
    private final zzxz zzc;
    private final byte[] zzd;

    private zzsm(zzcc zzccVar, zzxz zzxzVar, byte[] bArr) {
        this.zzb = zzccVar;
        this.zzc = zzxzVar;
        this.zzd = bArr;
    }

    public static zzcc zza(zzof zzofVar) throws GeneralSecurityException {
        byte[] bArrZzb;
        zzqb zzqbVarZza = zzofVar.zza(zzbf.zza());
        zzcc zzccVar = (zzcc) zznq.zza().zza(zzqbVarZza.zzf(), zzcc.class).zzb(zzqbVarZza.zzd());
        zzxz zzxzVarZzb = zzqbVarZza.zzb();
        int i7 = zzsp.zza[zzxzVarZzb.ordinal()];
        if (i7 == 1) {
            bArrZzb = zzpe.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            bArrZzb = zzpe.zza(zzofVar.zzb().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzb = zzpe.zzb(zzofVar.zzb().intValue()).zzb();
        }
        return new zzsm(zzccVar, zzxzVarZzb, bArrZzb);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 10) {
            if (this.zzc.equals(zzxz.LEGACY)) {
                bArr2 = zzyz.zza(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzxz.RAW)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
                bArr3 = bArrCopyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcc
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzxz.LEGACY)) {
            bArr = zzyz.zza(bArr, zza);
        }
        return zzyz.zza(this.zzd, this.zzb.zza(bArr));
    }
}
