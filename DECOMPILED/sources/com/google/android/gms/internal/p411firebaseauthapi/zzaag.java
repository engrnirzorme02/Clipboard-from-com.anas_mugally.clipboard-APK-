package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaag implements zzcc {
    private static final byte[] zza = {0};
    private final zzsq zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzaag(zzqp zzqpVar) {
        this.zzb = zzzz.zza(zzso.zza(zzsr.zza(((zzqu) ((zzrn) zzqpVar.zza())).zzc()), zzqpVar.zzf()));
        this.zzc = ((zzqu) ((zzrn) zzqpVar.zza())).zzb();
        this.zzd = zzqpVar.zze().zzb();
        if (!((zzqu) ((zzrn) zzqpVar.zza())).zze().equals(zzqu.zza.zzc)) {
            this.zze = new byte[0];
        } else {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static zzcc zza(zzqp zzqpVar) {
        return new zzaag(zzqpVar);
    }

    public static zzcc zza(zzra zzraVar) {
        return new zzaag(zzraVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcc
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzcc
    public final byte[] zza(byte[] bArr) {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzyz.zza(this.zzd, this.zzb.zza(zzyz.zza(bArr, bArr2), this.zzc));
        }
        return zzyz.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzaag(zzra zzraVar) {
        this.zzb = new zzaae("HMAC" + String.valueOf(((zzrh) ((zzrn) zzraVar.zza())).zze()), new SecretKeySpec(zzraVar.zzf().zza(zzbf.zza()), "HMAC"));
        this.zzc = ((zzrh) ((zzrn) zzraVar.zza())).zzb();
        this.zzd = zzraVar.zze().zzb();
        if (((zzrh) ((zzrn) zzraVar.zza())).zzf().equals(zzrh.zzc.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzaag(zzsq zzsqVar, int i7) throws InvalidAlgorithmParameterException {
        this.zzb = zzsqVar;
        this.zzc = i7;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i7 >= 10) {
            zzsqVar.zza(new byte[0], i7);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }
}
