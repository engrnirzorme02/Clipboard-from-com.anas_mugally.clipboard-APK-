package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzij {
    private static final zzaaj zza;
    private static final zzph<zzge, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzgb, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzim
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzyr.zzc().zzj()).zza(zzij.zza(((zzge) zzcbVar).zzb())).zze()));
            }
        }, zzge.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzil
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzij.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzio
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzgb zzgbVar = (zzgb) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzyo) ((zzalf) zzyo.zzb().zza(zzajv.zza(zzgbVar.zze().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzij.zza(((zzge) ((zzcy) zzgbVar.zza())).zzb()), zzgbVar.zzb());
            }
        }, zzgb.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzin
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzij.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgb zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzyo zzyoVarZza = zzyo.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzyoVarZza.zza() == 0) {
                return zzgb.zza(zza(zzqbVar.zzb()), zzaal.zza(zzyoVarZza.zzd().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzge.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zziq.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzge.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzge.zza.zzb;
        }
        if (i7 == 4) {
            return zzge.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzge zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzyr.zza(zzqeVar.zza().zze(), zzaku.zza()).zza() == 0) {
                    return zzge.zza(zza(zzqeVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzge.zza zzaVar) throws GeneralSecurityException {
        if (zzge.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzge.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzge.zza.zzc.equals(zzaVar)) {
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
