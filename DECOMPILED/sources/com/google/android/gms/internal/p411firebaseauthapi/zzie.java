package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzie {
    private static final zzaaj zza;
    private static final zzph<zzfz, zzqe> zzb;
    private static final zzpd<zzqe> zzc;
    private static final zznx<zzfw, zzqb> zzd;
    private static final zznt<zzqb> zze;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzaajVarZzb;
        zzb = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzid
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzfz zzfzVar = (zzfz) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzyi) ((zzalf) zzyi.zzb().zza((zzyl) ((zzalf) zzyl.zzb().zza(zzfzVar.zzb()).zze())).zze())).zzj()).zza(zzie.zza(zzfzVar.zzc())).zze()));
            }
        }, zzfz.class, zzqe.class);
        zzc = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzie.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zzd = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzfw zzfwVar = (zzfw) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzyf) ((zzalf) zzyf.zzb().zza(zzajv.zza(zzfwVar.zze().zza(zzch.zza(zzchVar)))).zza((zzyl) ((zzalf) zzyl.zzb().zza(((zzfz) ((zzcy) zzfwVar.zza())).zzb()).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zzie.zza(((zzfz) ((zzcy) zzfwVar.zza())).zzc()), zzfwVar.zzb());
            }
        }, zzfw.class, zzqb.class);
        zze = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzii
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzie.zzb((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfw zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzyf zzyfVarZza = zzyf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzyfVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzyfVarZza.zze().zzb() == 32) {
                return zzfw.zza(zzfz.zza(zza(zzqbVar.zzb()), zzyfVarZza.zzd().zza()), zzaal.zza(zzyfVarZza.zze().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzfz.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i7 = zzih.zza[zzxzVar.ordinal()];
        if (i7 == 1) {
            return zzfz.zza.zza;
        }
        if (i7 == 2) {
            return zzfz.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfz zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzyi zzyiVarZza = zzyi.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zzyiVarZza.zza() == 0) {
                    return zzfz.zza(zza(zzqeVar.zza().zzd()), zzyiVarZza.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzfz.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzfz.zza.zza)) {
            return zzxz.TINK;
        }
        if (Objects.equals(zzaVar, zzfz.zza.zzb)) {
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
