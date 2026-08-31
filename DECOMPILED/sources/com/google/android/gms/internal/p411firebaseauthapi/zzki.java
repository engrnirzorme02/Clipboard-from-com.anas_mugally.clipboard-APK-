package com.google.android.gms.internal.p411firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzki extends zzlj {
    private final zzkq zza;
    private final zzaal zzb;

    private zzki(zzkq zzkqVar, zzaal zzaalVar) {
        this.zza = zzkqVar;
        this.zzb = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkg) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj, com.google.android.gms.internal.p411firebaseauthapi.zzce
    public final /* synthetic */ zzbi zzc() {
        return (zzkq) zzc();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzlg zza() {
        return (zzkg) ((zzlg) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj
    /* JADX INFO: renamed from: zze */
    public final /* synthetic */ zzli zzc() {
        return this.zza;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    public static zzki zza(zzkq zzkqVar, zzaal zzaalVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkqVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzkg.zzf zzfVarZze = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        int iZza = zzaalVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zzfVarZze) + " must be %d, not " + iZza;
        zzkg.zzf zzfVar = zzkg.zzf.zza;
        if (zzfVarZze == zzfVar) {
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zzfVarZze == zzkg.zzf.zzb) {
            if (iZza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zzfVarZze == zzkg.zzf.zzc) {
            if (iZza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zzfVarZze != zzkg.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zzfVarZze));
            }
            if (iZza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzkg.zzf zzfVarZze2 = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        byte[] bArrZzb = zzkqVar.zze().zzb();
        byte[] bArrZza = zzaalVar.zza(zzbf.zza());
        if (zzfVarZze2 == zzfVar || zzfVarZze2 == zzkg.zzf.zzb || zzfVarZze2 == zzkg.zzf.zzc) {
            if (zzfVarZze2 == zzfVar) {
                eCParameterSpec = zznj.zza;
            } else if (zzfVarZze2 == zzkg.zzf.zzb) {
                eCParameterSpec = zznj.zzb;
            } else {
                if (zzfVarZze2 != zzkg.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zzfVarZze2));
                }
                eCParameterSpec = zznj.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger bigIntegerZza = zzne.zza(bArrZza);
            if (bigIntegerZza.signum() <= 0 || bigIntegerZza.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zznj.zza(bigIntegerZza, eCParameterSpec).equals(zzzf.zza(eCParameterSpec.getCurve(), zzzh.UNCOMPRESSED, bArrZzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zzfVarZze2 != zzkg.zzf.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zzfVarZze2));
            }
            if (!Arrays.equals(zzaah.zza(bArrZza), bArrZzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzki(zzkqVar, zzaalVar);
    }
}
