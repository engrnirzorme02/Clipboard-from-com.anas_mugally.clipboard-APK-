package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzb implements zzbd {
    private final ECPrivateKey zza;
    private final zzzd zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzzh zze;
    private final zzlr zzf;
    private final byte[] zzg;

    private zzzb(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzzh zzzhVar, zzlr zzlrVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzzd(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzzhVar;
        this.zzf = zzlrVar;
        this.zzg = bArr2;
    }

    public static zzbd zza(zzke zzkeVar) throws NoSuchAlgorithmException {
        ECPrivateKey eCPrivateKeyZza = zzzf.zza((zzzi) zzze.zza.zza(((zzkb) ((zzlg) zzkeVar.zza())).zzd()), zzne.zza(zzkeVar.zzf().zza(zzbf.zza())));
        byte[] bArrZzb = new byte[0];
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzh() != null) {
            bArrZzb = ((zzkb) ((zzlg) zzkeVar.zza())).zzh().zzb();
        }
        return new zzzb(eCPrivateKeyZza, bArrZzb, zzze.zza(((zzkb) ((zzlg) zzkeVar.zza())).zze()), (zzzh) zzze.zzb.zza(((zzkb) ((zzlg) zzkeVar.zza())).zzf()), zzln.zza((zzkb) ((zzlg) zzkeVar.zza())), zzkeVar.zzh().zzb());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i7;
        int i8;
        if (zzqn.zza(this.zzg, bArr)) {
            int length = this.zzg.length;
            EllipticCurve curve = this.zza.getParams().getCurve();
            zzzh zzzhVar = this.zze;
            int iZza = zzzf.zza(curve);
            int iOrdinal = zzzhVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new GeneralSecurityException("unknown EC point format");
                    }
                    i7 = iZza * 2;
                }
                i8 = i7 + length;
                if (bArr.length >= i8) {
                    return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i8), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i8);
                }
                throw new GeneralSecurityException("ciphertext too short");
            }
            iZza *= 2;
            i7 = iZza + 1;
            i8 = i7 + length;
            if (bArr.length >= i8) {
                return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i8), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i8);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
    }
}
