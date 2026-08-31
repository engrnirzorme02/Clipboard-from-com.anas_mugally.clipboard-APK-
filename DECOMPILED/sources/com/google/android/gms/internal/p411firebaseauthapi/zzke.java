package com.google.android.gms.internal.p411firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzke extends zzlj {
    private final zzkh zza;
    private final zzaam zzb;
    private final zzaal zzc;

    private zzke(zzkh zzkhVar, zzaam zzaamVar, zzaal zzaalVar) {
        this.zza = zzkhVar;
        this.zzb = zzaamVar;
        this.zzc = zzaalVar;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj, com.google.android.gms.internal.p411firebaseauthapi.zzbi
    public final /* synthetic */ zzcb zza() {
        return (zzkb) zza();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj, com.google.android.gms.internal.p411firebaseauthapi.zzce
    public final /* synthetic */ zzbi zzc() {
        return (zzkh) zzc();
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj
    /* JADX INFO: renamed from: zzd */
    public final /* synthetic */ zzlg zza() {
        return (zzkb) ((zzlg) this.zza.zza());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzlj
    /* JADX INFO: renamed from: zze */
    public final /* synthetic */ zzli zzc() {
        return this.zza;
    }

    public final zzaam zzf() {
        return this.zzb;
    }

    public final zzaal zzg() {
        return this.zzc;
    }

    public static zzke zza(zzkh zzkhVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzkhVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzkhVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] bArrZza = zzaalVar.zza(zzbf.zza());
        byte[] bArrZzb = zzkhVar.zze().zzb();
        if (bArrZza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzaah.zza(bArrZza), bArrZzb)) {
            return new zzke(zzkhVar, null, zzaalVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static zzke zza(zzkh zzkhVar, zzaam zzaamVar) throws GeneralSecurityException {
        if (zzkhVar != null) {
            if (zzkhVar.zzf() == null) {
                throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            }
            if (zzaamVar != null) {
                BigInteger bigIntegerZza = zzaamVar.zza(zzbf.zza());
                ECPoint eCPointZzf = zzkhVar.zzf();
                zzkb.zzc zzcVarZzd = ((zzkb) ((zzlg) zzkhVar.zza())).zzd();
                BigInteger order = zza(zzcVarZzd).getOrder();
                if (bigIntegerZza.signum() > 0 && bigIntegerZza.compareTo(order) < 0) {
                    if (zznj.zza(bigIntegerZza, zza(zzcVarZzd)).equals(eCPointZzf)) {
                        return new zzke(zzkhVar, zzaamVar, null);
                    }
                    throw new GeneralSecurityException("Invalid private value");
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
    }

    private static ECParameterSpec zza(zzkb.zzc zzcVar) {
        if (zzcVar == zzkb.zzc.zza) {
            return zznj.zza;
        }
        if (zzcVar == zzkb.zzc.zzb) {
            return zznj.zzb;
        }
        if (zzcVar == zzkb.zzc.zzc) {
            return zznj.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVar));
    }
}
