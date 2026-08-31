package com.google.android.gms.internal.p411firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlq {
    private static final zzaaj zza;
    private static final zzaaj zzb;
    private static final zzph<zzkb, zzqe> zzc;
    private static final zzpd<zzqe> zzd;
    private static final zznx<zzkh, zzqb> zze;
    private static final zznt<zzqb> zzf;
    private static final zznx<zzke, zzqb> zzg;
    private static final zznt<zzqb> zzh;
    private static final zznl<zzxz, zzkb.zzd> zzi;
    private static final zznl<zzvy, zzkb.zzb> zzj;
    private static final zznl<zzvw, zzkb.zzc> zzk;
    private static final zznl<zzvb, zzkb.zze> zzl;

    static {
        zzaaj zzaajVarZzb = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzaajVarZzb;
        zzaaj zzaajVarZzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzaajVarZzb2;
        zzc = zzph.zza(new zzpj() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlt
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpj
            public final zzqf zza(zzcb zzcbVar) {
                zzkb zzkbVar = (zzkb) zzcbVar;
                return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").zza(((zzvh) ((zzalf) zzvh.zza().zza(zzlq.zzb(zzkbVar)).zze())).zzj()).zza((zzxz) zzlq.zzi.zza(zzkbVar.zzg())).zze()));
            }
        }, zzkb.class, zzqe.class);
        zzd = zzpd.zza(new zzpf() { // from class: com.google.android.gms.internal.firebase-auth-api.zzls
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zzpf
            public final zzcb zza(zzqf zzqfVar) {
                return zzlq.zzb((zzqe) zzqfVar);
            }
        }, zzaajVarZzb, zzqe.class);
        zze = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlv
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                zzkh zzkhVar = (zzkh) zzbiVar;
                return zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzlq.zza(zzkhVar).zzj(), zzwx.zzb.ASYMMETRIC_PUBLIC, (zzxz) zzlq.zzi.zza(((zzkb) ((zzlg) zzkhVar.zza())).zzg()), zzkhVar.zzb());
            }
        }, zzkh.class, zzqb.class);
        zzf = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlu
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzlq.zzd((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb2, zzqb.class);
        zzg = zznx.zza(new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlx
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznz
            public final zzqf zza(zzbi zzbiVar, zzch zzchVar) {
                return zzlq.zza((zzke) zzbiVar, zzchVar);
            }
        }, zzke.class, zzqb.class);
        zzh = zznt.zza(new zznv() { // from class: com.google.android.gms.internal.firebase-auth-api.zzlw
            @Override // com.google.android.gms.internal.p411firebaseauthapi.zznv
            public final zzbi zza(zzqf zzqfVar, zzch zzchVar) {
                return zzlq.zzc((zzqb) zzqfVar, zzchVar);
            }
        }, zzaajVarZzb, zzqb.class);
        zznk zznkVarZza = zznl.zza().zza(zzxz.RAW, zzkb.zzd.zzc).zza(zzxz.TINK, zzkb.zzd.zza);
        zzxz zzxzVar = zzxz.LEGACY;
        zzkb.zzd zzdVar = zzkb.zzd.zzb;
        zzi = zznkVarZza.zza(zzxzVar, zzdVar).zza(zzxz.CRUNCHY, zzdVar).zza();
        zzj = zznl.zza().zza(zzvy.SHA1, zzkb.zzb.zza).zza(zzvy.SHA224, zzkb.zzb.zzb).zza(zzvy.SHA256, zzkb.zzb.zzc).zza(zzvy.SHA384, zzkb.zzb.zzd).zza(zzvy.SHA512, zzkb.zzb.zze).zza();
        zzk = zznl.zza().zza(zzvw.NIST_P256, zzkb.zzc.zza).zza(zzvw.NIST_P384, zzkb.zzc.zzb).zza(zzvw.NIST_P521, zzkb.zzc.zzc).zza(zzvw.CURVE25519, zzkb.zzc.zzd).zza();
        zzl = zznl.zza().zza(zzvb.UNCOMPRESSED, zzkb.zze.zzb).zza(zzvb.COMPRESSED, zzkb.zze.zza).zza(zzvb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzkb.zze.zzc).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzke zzc(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzqbVar.zzf());
        }
        try {
            zzvn zzvnVarZza = zzvn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzvnVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzvq zzvqVarZzd = zzvnVarZza.zzd();
            if (zzvqVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zzkbVarZza = zza(zzqbVar.zzb(), zzvqVarZzd.zzb());
            return zzkbVarZza.zzd().equals(zzkb.zzc.zzd) ? zzke.zza(zzkh.zza(zzkbVarZza, zzaaj.zza(zzvqVarZzd.zzf().zzd()), zzqbVar.zze()), zzaal.zza(zzvnVarZza.zze().zzd(), zzch.zza(zzchVar))) : zzke.zza(zzkh.zza(zzkbVarZza, new ECPoint(zzne.zza(zzvqVarZzd.zzf().zzd()), zzne.zza(zzvqVarZzd.zzg().zzd())), zzqbVar.zze()), zzaam.zza(zzne.zza(zzvnVarZza.zze().zzd()), zzch.zza(zzchVar)));
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkh zzd(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzqbVar.zzf());
        }
        try {
            zzvq zzvqVarZza = zzvq.zza(zzqbVar.zzd(), zzaku.zza());
            if (zzvqVarZza.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzkb zzkbVarZza = zza(zzqbVar.zzb(), zzvqVarZza.zzb());
            if (!zzkbVarZza.zzd().equals(zzkb.zzc.zzd)) {
                return zzkh.zza(zzkbVarZza, new ECPoint(zzne.zza(zzvqVarZza.zzf().zzd()), zzne.zza(zzvqVarZza.zzg().zzd())), zzqbVar.zze());
            }
            if (zzvqVarZza.zzg().zzb() == 0) {
                return zzkh.zza(zzkbVarZza, zzaaj.zza(zzvqVarZza.zzf().zzd()), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Y must be empty for X25519 points");
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzkb zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzqeVar.zza().zzd(), zzvh.zza(zzqeVar.zza().zze(), zzaku.zza()).zzc());
            } catch (zzall e7) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e7);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static int zza(zzkb.zzc zzcVar) throws GeneralSecurityException {
        if (zzkb.zzc.zza.equals(zzcVar)) {
            return 33;
        }
        if (zzkb.zzc.zzb.equals(zzcVar)) {
            return 49;
        }
        if (zzkb.zzc.zzc.equals(zzcVar)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType " + String.valueOf(zzcVar));
    }

    private static zzkb zza(zzxz zzxzVar, zzvk zzvkVar) throws GeneralSecurityException {
        zzkb.zza zzaVarZza = zzkb.zzc().zza(zzi.zza(zzxzVar)).zza(zzk.zza(zzvkVar.zzf().zzd())).zza(zzj.zza(zzvkVar.zzf().zze())).zza(zzcj.zza(((zzxb) ((zzalf) zzxb.zza().zza(zzvkVar.zzb().zzd().zzf()).zza(zzxz.RAW).zza(zzvkVar.zzb().zzd().zze()).zze())).zzk())).zza(zzaaj.zza(zzvkVar.zzf().zzf().zzd()));
        if (!zzvkVar.zzf().zzd().equals(zzvw.CURVE25519)) {
            zzaVarZza.zza(zzl.zza(zzvkVar.zza()));
        } else if (!zzvkVar.zza().equals(zzvb.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zzaVarZza.zza();
    }

    private static zzvk zzb(zzkb zzkbVar) throws GeneralSecurityException {
        zzvt.zza zzaVarZza = zzvt.zza().zza((zzvw) zzk.zza(zzkbVar.zzd())).zza((zzvy) zzj.zza(zzkbVar.zze()));
        if (zzkbVar.zzh() != null && zzkbVar.zzh().zza() > 0) {
            zzaVarZza.zza(zzajv.zza(zzkbVar.zzh().zzb()));
        }
        zzvt zzvtVar = (zzvt) ((zzalf) zzaVarZza.zze());
        try {
            zzxb zzxbVarZza = zzxb.zza(zzcj.zza(zzkbVar.zzb()), zzaku.zza());
            zzve zzveVar = (zzve) ((zzalf) zzve.zza().zza((zzxb) ((zzalf) zzxb.zza().zza(zzxbVarZza.zzf()).zza(zzxz.TINK).zza(zzxbVarZza.zze()).zze())).zze());
            zzkb.zze zzeVarZzf = zzkbVar.zzf();
            if (zzeVarZzf == null) {
                zzeVarZzf = zzkb.zze.zza;
            }
            return (zzvk) ((zzalf) zzvk.zzc().zza(zzvtVar).zza(zzveVar).zza((zzvb) zzl.zza(zzeVarZzf)).zze());
        } catch (zzall e7) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e7);
        }
    }

    public static /* synthetic */ zzqb zza(zzke zzkeVar, zzch zzchVar) throws GeneralSecurityException {
        zzvn.zza zzaVarZza = zzvn.zzb().zza(0).zza(zza((zzkh) ((zzli) zzkeVar.zzc())));
        if (((zzkb) ((zzlg) zzkeVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            zzaVarZza.zza(zzajv.zza(zzkeVar.zzg().zza(zzch.zza(zzchVar))));
        } else {
            zzaVarZza.zza(zzajv.zza(zzne.zza(zzkeVar.zzf().zza(zzch.zza(zzchVar)), zza(((zzkb) ((zzlg) zzkeVar.zza())).zzd()))));
        }
        return zzqb.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((zzvn) ((zzalf) zzaVarZza.zze())).zzj(), zzwx.zzb.ASYMMETRIC_PRIVATE, (zzxz) zzi.zza(((zzkb) ((zzlg) zzkeVar.zza())).zzg()), zzkeVar.zzb());
    }

    private static zzvq zza(zzkh zzkhVar) throws GeneralSecurityException {
        if (((zzkb) ((zzlg) zzkhVar.zza())).zzd().equals(zzkb.zzc.zzd)) {
            return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzkhVar.zze().zzb())).zzb(zzajv.zza).zze());
        }
        int iZza = zza(((zzkb) ((zzlg) zzkhVar.zza())).zzd());
        ECPoint eCPointZzf = zzkhVar.zzf();
        if (eCPointZzf != null) {
            return (zzvq) ((zzalf) zzvq.zzc().zza(0).zza(zzb((zzkb) ((zzlg) zzkhVar.zza()))).zza(zzajv.zza(zzne.zza(eCPointZzf.getAffineX(), iZza))).zzb(zzajv.zza(zzne.zza(eCPointZzf.getAffineY(), iZza))).zze());
        }
        throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
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
