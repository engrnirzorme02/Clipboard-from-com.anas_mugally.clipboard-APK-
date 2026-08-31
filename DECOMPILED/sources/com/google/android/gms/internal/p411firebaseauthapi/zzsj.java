package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsj {
    private static final zzaaj zza;
    private static final zznl<zzxz, zzrh.zzc> zzb;
    private static final zznl<zzvy, zzrh.zza> zzc;
    private static final zzph<zzrh, zzqe> zzd;
    private static final zzpd<zzqe> zze;
    private static final zznx<zzra, zzqb> zzf;
    private static final zznt<zzqb> zzg;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzaajVarZzb;
        zzb = zznl.zza().zza(zzxz.RAW, zzrh.zzc.zzd).zza(zzxz.TINK, zzrh.zzc.zza).zza(zzxz.LEGACY, zzrh.zzc.zzc).zza(zzxz.CRUNCHY, zzrh.zzc.zzb).zza();
        zzc = zznl.zza().zza(zzvy.SHA1, zzrh.zza.zza).zza(zzvy.SHA224, zzrh.zza.zzb).zza(zzvy.SHA256, zzrh.zza.zzc).zza(zzvy.SHA384, zzrh.zza.zzd).zza(zzvy.SHA512, zzrh.zza.zze).zza();
        zzd = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsi
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzrh zzrhVar = (zzrh) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.HmacKey").zza(((zzwe) ((zzalf) zzwe.zzc().zza(zzsj.zzb(zzrhVar)).zza(zzrhVar.zzc()).zze())).zzj()).zza((zzxz) zzsj.zzb.zza(zzrhVar.zzf())).zze()));
            }
        }, zzrh.class, zzqe.class);
        zze = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsl
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzsj.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzf = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsk
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzra zzraVar = (zzra) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzwb) ((zzalf) zzwb.zzb().zza(zzsj.zzb((zzrh) ((zzrn) zzraVar.zza()))).zza(zzajv.zza(zzraVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, (zzxz) zzsj.zzb.zza(((zzrh) ((zzrn) zzraVar.zza())).zzf()), zzraVar.zzb());
            }
        }, zzra.class, zzqb.class);
        zzg = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzsn
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzsj.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzra zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzwb zzwbVarZza = zzwb.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzwbVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzra.zzc().zza(zzrh.zzd().zza(zzwbVarZza.zzf().zzb()).zzb(zzwbVarZza.zze().zza()).zza(zzc.zza(zzwbVarZza.zze().zzb())).zza(zzb.zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zzwbVarZza.zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzrh zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzwe zzweVarZza = zzwe.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zzweVarZza.zzb() == 0) {
                    return zzrh.zzd().zza(zzweVarZza.zza()).zzb(zzweVarZza.zzf().zza()).zza(zzc.zza(zzweVarZza.zzf().zzb())).zza(zzb.zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzweVarZza.zzb());
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
        zzozVarZza.zza(zzf);
        zzozVarZza.zza(zzg);
    }

    private static zzwh zzb(zzrh zzrhVar) {
        return (zzwh) ((zzalf) zzwh.zzc().zza(zzrhVar.zzb()).zza((zzvy) zzc.zza(zzrhVar.zze())).zze());
    }
}
