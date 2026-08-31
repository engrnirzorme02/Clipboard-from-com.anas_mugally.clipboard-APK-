package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgt {
    private static final zzaaj zza;
    private static final zzph<zzdx, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzds, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgw
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                return zzgt.zza((zzdx) zzcbVar);
            }
        }, zzdx.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgv
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzgt.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgy
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                return zzgt.zza((zzds) zzbiVar, zzchVar);
            }
        }, zzds.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgx
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzgt.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzds zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzud zzudVarZza = zzud.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzudVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzds.zze().zza(zzdx.zze().zzb(zzudVarZza.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zzudVarZza.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzdx.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzha.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzdx.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdx.zza.zzb;
        }
        if (i7 == 4) {
            return zzdx.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzds zzdsVar, zzch zzchVar) throws GeneralSecurityException {
        zzb((zzdx) ((zzcy) zzdsVar.zza()));
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzud) ((zzalf) zzud.zzb().zza(zzajv.zza(zzdsVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzdx) ((zzcy) zzdsVar.zza())).zzf()), zzdsVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzdx zzdxVar) throws GeneralSecurityException {
        zzb(zzdxVar);
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzug) ((zzalf) zzug.zzc().zza(zzdxVar.zzc()).zze())).zzj()).zza(zza(zzdxVar.zzf())).zze()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdx zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzug zzugVarZza = zzug.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zzugVarZza.zzb() == 0) {
                    return zzdx.zze().zzb(zzugVarZza.zza()).zza(12).zzc(16).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzdx.zza zzaVar) throws GeneralSecurityException {
        if (zzdx.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzdx.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdx.zza.zzc.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    private static void zzb(zzdx zzdxVar) throws GeneralSecurityException {
        if (zzdxVar.zzd() == 16) {
            if (zzdxVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdxVar.zzb())));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdxVar.zzd())));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
