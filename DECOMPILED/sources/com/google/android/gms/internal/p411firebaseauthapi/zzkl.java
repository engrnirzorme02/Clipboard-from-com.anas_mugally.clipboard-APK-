package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkl {
    private static final zzaaj zza;
    private static final zzaaj zzb;
    private static final zzph<zzkg, zzqe> zzc;
    private static final zzpd<zzqe> zzd;
    private static final zznx<zzkq, zzqb> zze;
    private static final zznt<zzqb> zzf;
    private static final zznx<zzki, zzqb> zzg;
    private static final zznt<zzqb> zzh;
    private static final zznl<zzxz, zzkg.zze> zzi;
    private static final zznl<zzwm, zzkg.zzf> zzj;
    private static final zznl<zzwj, zzkg.zzc> zzk;
    private static final zznl<zzwk, zzkg.zzb> zzl;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzaajVarZzb;
        zzaaj zzaajVarZzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzaajVarZzb2;
        zzc = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkk
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzkg zzkgVar = (zzkg) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey").zza(((zzwl) ((zzalf) zzwl.zza().zza(zzkl.zzb(zzkgVar)).zze())).zzj()).zza((zzxz) zzkl.zzi.zza(zzkgVar.zzf())).zze()));
            }
        }, zzkg.class, zzqe.class);
        zzd = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkn
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzkl.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zze = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkm
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzkq zzkqVar = (zzkq) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzkl.zza(zzkqVar).zzj(), zzwx.zzb.ASYMMETRIC_PUBLIC, (zzxz) zzkl.zzi.zza(((zzkg) ((zzlg) zzkqVar.zza())).zzf()), zzkqVar.zzb());
            }
        }, zzkq.class, zzqb.class);
        zzf = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkp
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzkl.zzd((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb2, zzqb.class);
        zzg = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzko
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzki zzkiVar = (zzki) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((zzwr) ((zzalf) zzwr.zzb().zza(0).zza(zzkl.zza((zzkq) ((zzli) zzkiVar.zzc()))).zza(zzajv.zza(zzkiVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.ASYMMETRIC_PRIVATE, (zzxz) zzkl.zzi.zza(((zzkg) ((zzlg) zzkiVar.zza())).zzf()), zzkiVar.zzb());
            }
        }, zzki.class, zzqb.class);
        zzh = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkr
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzkl.zzc((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
        zznk zznkVarZza = zznl.zza().zza(zzxz.RAW, zzkg.zze.zzc).zza(zzxz.TINK, zzkg.zze.zza);
        zzxz zzxzVar = zzxz.LEGACY;
        zzkg.zze zzeVar = zzkg.zze.zzb;
        zzi = zznkVarZza.zza(zzxzVar, zzeVar).zza(zzxz.CRUNCHY, zzeVar).zza();
        zzj = zznl.zza().zza(zzwm.DHKEM_P256_HKDF_SHA256, zzkg.zzf.zza).zza(zzwm.DHKEM_P384_HKDF_SHA384, zzkg.zzf.zzb).zza(zzwm.DHKEM_P521_HKDF_SHA512, zzkg.zzf.zzc).zza(zzwm.DHKEM_X25519_HKDF_SHA256, zzkg.zzf.zzd).zza();
        zzk = zznl.zza().zza(zzwj.HKDF_SHA256, zzkg.zzc.zza).zza(zzwj.HKDF_SHA384, zzkg.zzc.zzb).zza(zzwj.HKDF_SHA512, zzkg.zzc.zzc).zza();
        zzl = zznl.zza().zza(zzwk.AES_128_GCM, zzkg.zzb.zza).zza(zzwk.AES_256_GCM, zzkg.zzb.zzb).zza(zzwk.CHACHA20_POLY1305, zzkg.zzb.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzki zzc(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzqbVar.zzf());
        }
        try {
            zzwr zzwrVarZza = zzwr.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzwrVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzwu zzwuVarZzd = zzwrVarZza.zzd();
            if (zzwuVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkg zzkgVarZza = zza(zzqbVar.zzb(), zzwuVarZzd.zzb());
            return zzki.zza(zzkq.zza(zzkgVarZza, zza(zzkgVarZza.zze(), zzwuVarZzd.zzf().zzd()), zzqbVar.zze()), zzaal.zza(zzne.zza(zzne.zza(zzwrVarZza.zze().zzd()), zzmk.zza(zzkgVarZza.zze())), zzch.zza(zzchVar)));
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkq zzd(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzqbVar.zzf());
        }
        try {
            zzwu zzwuVarZza = zzwu.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzwuVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkg zzkgVarZza = zza(zzqbVar.zzb(), zzwuVarZza.zzb());
            return zzkq.zza(zzkgVarZza, zza(zzkgVarZza.zze(), zzwuVarZza.zzf().zzd()), zzqbVar.zze());
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing HpkePublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkg zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzqeVar.zza().zzd(), zzwl.zza(zzqeVar.zza().zze(), zzaku.zza()).zzc());
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzkg zza(zzxz zzxzVar, zzwo zzwoVar) {
        return zzkg.zzc().zza(zzi.zza(zzxzVar)).zza(zzj.zza(zzwoVar.zzc())).zza(zzk.zza(zzwoVar.zzb())).zza(zzl.zza(zzwoVar.zza())).zza();
    }

    private static zzwo zzb(zzkg zzkgVar) {
        return (zzwo) ((zzalf) zzwo.zzd().zza((zzwm) zzj.zza(zzkgVar.zze())).zza((zzwj) zzk.zza(zzkgVar.zzd())).zza((zzwk) zzl.zza(zzkgVar.zzb())).zze());
    }

    private static zzwu zza(zzkq zzkqVar) {
        return (zzwu) ((zzalf) zzwu.zzc().zza(0).zza(zzb((zzkg) ((zzlg) zzkqVar.zza()))).zza(zzajv.zza(zzkqVar.zze().zzb())).zze());
    }

    private static zzaaj zza(zzkg.zzf zzfVar, byte[] bArr) {
        return zzaaj.zza(zzne.zza(zzne.zza(bArr), zzmk.zzb(zzfVar)));
    }

    public static void zza() {
        zzoz zzozVarZza = zzoz.zza();
        zzozVarZza.zza(zzc);
        zzozVarZza.zza(zzd);
        zzozVarZza.zza(zze);
        zzozVarZza.zza(zzf);
        zzozVarZza.zza(zzg);
        zzozVarZza.zza(zzh);
    }
}
