package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhb {
    private static final zzaaj zza;
    private static final zzph<zzeg, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzdz, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhe
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzeg zzegVar = (zzeg) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzum) ((zzalf) zzum.zzc().zza(zzegVar.zzb()).zze())).zzj()).zza(zzhb.zza(zzegVar.zzd())).zze()));
            }
        }, zzeg.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhd
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzhb.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhg
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzdz zzdzVar = (zzdz) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzuj) ((zzalf) zzuj.zzb().zza(zzajv.zza(zzdzVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzhb.zza(((zzeg) ((zzcy) zzdzVar.zza())).zzd()), zzdzVar.zzb());
            }
        }, zzdz.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhf
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzhb.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdz zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzuj zzujVarZza = zzuj.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzujVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdz.zze().zza(zzeg.zzc().zza(zzujVarZza.zzd().zzb()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zzujVarZza.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzeg.zzb zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzhi.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzeg.zzb.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzeg.zzb.zzb;
        }
        if (i7 == 4) {
            return zzeg.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzeg zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzum zzumVarZza = zzum.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zzumVarZza.zzb() == 0) {
                    return zzeg.zzc().zza(zzumVarZza.zza()).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzeg.zzb zzbVar) throws GeneralSecurityException {
        if (zzeg.zzb.zza.equals(zzbVar)) {
            return zzxz.TINK;
        }
        if (zzeg.zzb.zzb.equals(zzbVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzeg.zzb.zzc.equals(zzbVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
