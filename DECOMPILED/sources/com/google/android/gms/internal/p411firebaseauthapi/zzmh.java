package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmh {
    public static zzly zza(zzkg.zzb zzbVar) {
        if (zzbVar == zzkg.zzb.zza) {
            return new zzll(16);
        }
        if (zzbVar == zzkg.zzb.zzb) {
            return new zzll(32);
        }
        if (zzbVar == zzkg.zzb.zzc) {
            return new zzlk();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static zzmc zza(zzkg.zzc zzcVar) {
        if (zzcVar == zzkg.zzc.zza) {
            return new zzlz("HmacSha256");
        }
        if (zzcVar == zzkg.zzc.zzb) {
            return new zzlz("HmacSha384");
        }
        if (zzcVar == zzkg.zzc.zzc) {
            return new zzlz("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static zzmf zza(zzkg.zzf zzfVar) {
        if (zzfVar == zzkg.zzf.zzd) {
            return new zzmu(new zzlz("HmacSha256"));
        }
        if (zzfVar == zzkg.zzf.zza) {
            return zzmr.zza(zzzi.NIST_P256);
        }
        if (zzfVar == zzkg.zzf.zzb) {
            return zzmr.zza(zzzi.NIST_P384);
        }
        if (zzfVar == zzkg.zzf.zzc) {
            return zzmr.zza(zzzi.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
