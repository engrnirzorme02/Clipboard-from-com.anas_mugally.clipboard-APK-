package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl {
    private static final zzaaj zza;
    private static final zzph<zzdq, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzdl, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgo
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzdq zzdqVar = (zzdq) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zztx) ((zzalf) zztx.zzb().zza(zzgl.zzb(zzdqVar)).zza(zzdqVar.zzc()).zze())).zzj()).zza(zzgl.zza(zzdqVar.zzf())).zze()));
            }
        }, zzdq.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgn
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzgl.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgq
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzdl zzdlVar = (zzdl) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zztu) ((zzalf) zztu.zzb().zza(zzgl.zzb((zzdq) ((zzcy) zzdlVar.zza()))).zza(zzajv.zza(zzdlVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzgl.zza(((zzdq) ((zzcy) zzdlVar.zza())).zzf()), zzdlVar.zzb());
            }
        }, zzdl.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzgl.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdl zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zztu zztuVarZza = zztu.zza(zzqbVar.zzd(), zzaku.zza());
            if (zztuVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdl.zze().zza(zzdq.zze().zzb(zztuVarZza.zze().zzb()).zza(zztuVarZza.zzd().zza()).zzc(16).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zztuVarZza.zze().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzdq.zzb zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzgs.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzdq.zzb.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdq.zzb.zzb;
        }
        if (i7 == 4) {
            return zzdq.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdq zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zztx zztxVarZza = zztx.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzdq.zze().zzb(zztxVarZza.zza()).zza(zztxVarZza.zzd().zza()).zzc(16).zza(zza(zzqeVar.zza().zzd())).zza();
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzdq.zzb zzbVar) throws GeneralSecurityException {
        if (zzdq.zzb.zza.equals(zzbVar)) {
            return zzxz.TINK;
        }
        if (zzdq.zzb.zzb.equals(zzbVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdq.zzb.zzc.equals(zzbVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    private static zzua zzb(zzdq zzdqVar) throws GeneralSecurityException {
        if (zzdqVar.zzd() == 16) {
            return (zzua) ((zzalf) zzua.zzb().zza(zzdqVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(zzdqVar.zzd())));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
