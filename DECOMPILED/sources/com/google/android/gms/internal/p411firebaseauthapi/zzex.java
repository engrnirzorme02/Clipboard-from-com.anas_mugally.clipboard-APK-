package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzex {
    private static final zzaaj zza;
    private static final zzph<zzev, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzet, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzew
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzev zzevVar = (zzev) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzxq) ((zzalf) zzxq.zza().zza(zzevVar.zzc()).zze())).zzj()).zza(zzex.zza(zzevVar.zzb())).zze()));
            }
        }, zzev.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzez
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzex.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzey
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzet zzetVar = (zzet) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzxn) ((zzalf) zzxn.zzb().zza((zzxq) ((zzalf) zzxq.zza().zza(((zzev) ((zzcy) zzetVar.zza())).zzc()).zze())).zze())).zzj(), zzwx.zzb.REMOTE, zzex.zza(((zzev) ((zzcy) zzetVar.zza())).zzb()), zzetVar.zzb());
            }
        }, zzet.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfb
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzex.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzet zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzxn zzxnVarZza = zzxn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzxnVarZza.zza() == 0) {
                return zzet.zza(zzev.zza(zzxnVarZza.zzd().zzd(), zza(zzqbVar.zzb())), zzqbVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zzxnVarZza));
        } catch (zzall e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e7);
        }
    }

    private static zzev.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzfa.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzev.zza.zza;
        }
        if (i7 == 2) {
            return zzev.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzev zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzev.zza(zzxq.zza(zzqeVar.zza().zze(), zzaku.zza()).zzd(), zza(zzqeVar.zza().zzd()));
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzev.zza zzaVar) throws GeneralSecurityException {
        if (zzev.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzev.zza.zzb.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzb);
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
    }
}
