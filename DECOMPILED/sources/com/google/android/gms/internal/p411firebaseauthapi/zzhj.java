package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhj {
    private static final zzaaj zza;
    private static final zzph<zzem, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzej, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhm
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzuy.zzb().zzj()).zza(zzhj.zza(((zzem) zzcbVar).zzb())).zze()));
            }
        }, zzem.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhl
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzhj.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzho
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzej zzejVar = (zzej) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzuv) ((zzalf) zzuv.zzb().zza(zzajv.zza(zzejVar.zze().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzhj.zza(((zzem) ((zzcy) zzejVar.zza())).zzb()), zzejVar.zzb());
            }
        }, zzej.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzhn
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzhj.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzej zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzuv zzuvVarZza = zzuv.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzuvVarZza.zza() == 0) {
                return zzej.zza(zza(zzqbVar.zzb()), zzaal.zza(zzuvVarZza.zzd().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzem.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzhq.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzem.zza.zza;
        }
        if (i7 == 2 || i7 == 3) {
            return zzem.zza.zzb;
        }
        if (i7 == 4) {
            return zzem.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzem zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzuy.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzem.zza(zza(zzqeVar.zza().zzd()));
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzem.zza zzaVar) throws GeneralSecurityException {
        if (zzem.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzem.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzem.zza.zzc.equals(zzaVar)) {
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
