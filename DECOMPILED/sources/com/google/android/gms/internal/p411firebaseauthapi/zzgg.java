package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgg {
    private static final zzaaj zza;
    private static final zzph<zzdi, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzdd, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgi
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzdi zzdiVar = (zzdi) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzti) ((zzalf) zzti.zza().zza((zzto) ((zzalf) zzto.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(zzdiVar.zzd()).zze())).zza(zzdiVar.zzb()).zze())).zza((zzwe) ((zzalf) zzwe.zzc().zza(zzgg.zzb(zzdiVar)).zza(zzdiVar.zzc()).zze())).zze())).zzj()).zza(zzgg.zza(zzdiVar.zzh())).zze()));
            }
        }, zzdi.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgh
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzgg.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgk
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzdd zzddVar = (zzdd) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zztf) ((zzalf) zztf.zzb().zza((zztl) ((zzalf) zztl.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(((zzdi) ((zzcy) zzddVar.zza())).zzd()).zze())).zza(zzajv.zza(zzddVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zza((zzwb) ((zzalf) zzwb.zzb().zza(zzgg.zzb((zzdi) ((zzcy) zzddVar.zza()))).zza(zzajv.zza(zzddVar.zzg().zza(zzch.zza(zzchVar)))).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzgg.zza(((zzdi) ((zzcy) zzddVar.zza())).zzh()), zzddVar.zzb());
            }
        }, zzdd.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgj
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzgg.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdd zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zztf zztfVarZza = zztf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zztfVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zztfVarZza.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zztfVarZza.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzdd.zze().zza(zzdi.zzf().zza(zztfVarZza.zzd().zzf().zzb()).zzb(zztfVarZza.zze().zzf().zzb()).zzc(zztfVarZza.zzd().zze().zza()).zzd(zztfVarZza.zze().zze().zza()).zza(zza(zztfVarZza.zze().zze().zzb())).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zztfVarZza.zzd().zzf().zzd(), zzch.zza(zzchVar))).zzb(zzaal.zza(zztfVarZza.zze().zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzdi.zza zza(zzvy zzvyVar) throws GeneralSecurityException {
        int i7 = zzgm.zzb[zzvyVar.ordinal()];
        if (i7 == 1) {
            return zzdi.zza.zza;
        }
        if (i7 == 2) {
            return zzdi.zza.zzb;
        }
        if (i7 == 3) {
            return zzdi.zza.zzc;
        }
        if (i7 == 4) {
            return zzdi.zza.zzd;
        }
        if (i7 == 5) {
            return zzdi.zza.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzvyVar.zza());
    }

    private static zzdi.zzc zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzgm.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzdi.zzc.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzdi.zzc.zzb;
        }
        if (i7 == 4) {
            return zzdi.zzc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdi zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzti zztiVarZza = zzti.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zztiVarZza.zzd().zzb() == 0) {
                    return zzdi.zzf().zza(zztiVarZza.zzc().zza()).zzb(zztiVarZza.zzd().zza()).zzc(zztiVarZza.zzc().zze().zza()).zzd(zztiVarZza.zzd().zzf().zza()).zza(zza(zztiVarZza.zzd().zzf().zzb())).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzwh zzb(zzdi zzdiVar) throws GeneralSecurityException {
        zzvy zzvyVar;
        zzwh.zza zzaVarZza = zzwh.zzc().zza(zzdiVar.zze());
        zzdi.zza zzaVarZzg = zzdiVar.zzg();
        if (zzdi.zza.zza.equals(zzaVarZzg)) {
            zzvyVar = zzvy.SHA1;
        } else if (zzdi.zza.zzb.equals(zzaVarZzg)) {
            zzvyVar = zzvy.SHA224;
        } else if (zzdi.zza.zzc.equals(zzaVarZzg)) {
            zzvyVar = zzvy.SHA256;
        } else if (zzdi.zza.zzd.equals(zzaVarZzg)) {
            zzvyVar = zzvy.SHA384;
        } else if (zzdi.zza.zze.equals(zzaVarZzg)) {
            zzvyVar = zzvy.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzaVarZzg));
        }
        return (zzwh) ((zzalf) zzaVarZza.zza(zzvyVar).zze());
    }

    private static zzxz zza(zzdi.zzc zzcVar) throws GeneralSecurityException {
        if (zzdi.zzc.zza.equals(zzcVar)) {
            return zzxz.TINK;
        }
        if (zzdi.zzc.zzb.equals(zzcVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdi.zzc.zzc.equals(zzcVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
