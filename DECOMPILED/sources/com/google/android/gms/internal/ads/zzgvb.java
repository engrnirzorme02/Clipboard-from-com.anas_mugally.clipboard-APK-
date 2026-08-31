package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgva.zza, zzgru.class, zzgzk.class);
        zzd = zzgys.zzd(zzgux.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzguy.zza, zzgrm.class, zzgzj.class);
        zzf = zzgxn.zzd(zzguz.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgru zzgruVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzhck zzhckVarZzd = zzhcl.zzd();
        zzhco zzhcoVarZzc = zzhcp.zzc();
        zzhcq zzhcqVarZzb = zzhcr.zzb();
        zzhcqVarZzb.zza(zzgruVar.zzf());
        zzhcoVarZzc.zza((zzhcr) zzhcqVarZzb.zzbu());
        zzhcoVarZzc.zzb(zzgruVar.zzc());
        zzhckVarZzd.zza((zzhcp) zzhcoVarZzc.zzbu());
        zzhdn zzhdnVarZze = zzhdo.zze();
        zzhdnVarZze.zza(zzi(zzgruVar));
        zzhdnVarZze.zzb(zzgruVar.zzd());
        zzhckVarZzd.zzb((zzhdo) zzhdnVarZze.zzbu());
        zzhdvVarZze.zzb(((zzhcl) zzhckVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgruVar.zzg()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgru zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhcl zzhclVarZzc = zzhcl.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzhclVarZzc.zzb().zzc() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgrr zzgrrVarZzb = zzgru.zzb();
            zzgrrVarZzb.zza(zzhclVarZzc.zza().zzb());
            zzgrrVarZzb.zzb(zzhclVarZzc.zzb().zzb());
            zzgrrVarZzb.zzc(zzhclVarZzc.zza().zza().zza());
            zzgrrVarZzb.zzd(zzhclVarZzc.zzb().zza().zzb());
            zzgrrVarZzb.zzf(zzh(zzhclVarZzc.zzb().zza().zza()));
            zzgrrVarZzb.zze(zzg(zzgzkVar.zzc().zzc()));
            return zzgrrVarZzb.zzg();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgrm zzgrmVar, zzgqt zzgqtVar) {
        zzhci zzhciVarZze = zzhcj.zze();
        zzhcm zzhcmVarZzd = zzhcn.zzd();
        zzhcq zzhcqVarZzb = zzhcr.zzb();
        zzhcqVarZzb.zza(zzgrmVar.zzf().zzf());
        zzhcmVarZzd.zza((zzhcr) zzhcqVarZzb.zzbu());
        byte[] bArrZzc = zzgrmVar.zzd().zzc(zzgqtVar);
        zzhcmVarZzd.zzb(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        zzhciVarZze.zza((zzhcn) zzhcmVarZzd.zzbu());
        zzhdl zzhdlVarZze = zzhdm.zze();
        zzhdlVarZze.zza(zzi(zzgrmVar.zzf()));
        byte[] bArrZzc2 = zzgrmVar.zze().zzc(zzgqtVar);
        zzhdlVarZze.zzb(zzhhb.zzr(bArrZzc2, 0, bArrZzc2.length));
        zzhciVarZze.zzb((zzhdm) zzhdlVarZze.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzhcj) zzhciVarZze.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgrmVar.zzf().zzg()), zzgrmVar.zzg());
    }

    static /* synthetic */ zzgrm zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zzhcj zzhcjVarZzd = zzhcj.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhcjVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhcjVarZzd.zzb().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zzhcjVarZzd.zzc().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            zzgrr zzgrrVarZzb = zzgru.zzb();
            zzgrrVarZzb.zza(zzhcjVarZzd.zzb().zzc().zzc());
            zzgrrVarZzb.zzb(zzhcjVarZzd.zzc().zzc().zzc());
            zzgrrVarZzb.zzc(zzhcjVarZzd.zzb().zzb().zza());
            zzgrrVarZzb.zzd(zzhcjVarZzd.zzc().zzb().zzb());
            zzgrrVarZzb.zzf(zzh(zzhcjVarZzd.zzc().zzb().zza()));
            zzgrrVarZzb.zze(zzg(zzgzjVar.zzd()));
            zzgru zzgruVarZzg = zzgrrVarZzb.zzg();
            zzgrl zzgrlVarZzc = zzgrm.zzc();
            zzgrlVarZzc.zza(zzgruVarZzg);
            zzgrlVarZzc.zzb(zzhgh.zza(zzhcjVarZzd.zzb().zzc().zzv(), zzgqtVar));
            zzgrlVarZzc.zzc(zzhgh.zza(zzhcjVarZzd.zzc().zzc().zzv(), zzgqtVar));
            zzgrlVarZzc.zzd(zzgzjVar.zze());
            return zzgrlVarZzc.zze();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    private static zzhep zzf(zzgrt zzgrtVar) throws GeneralSecurityException {
        if (zzgrt.zza.equals(zzgrtVar)) {
            return zzhep.TINK;
        }
        if (zzgrt.zzb.equals(zzgrtVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgrt.zzc.equals(zzgrtVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgrtVar)));
    }

    private static zzgrt zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgrt.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgrt.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgrt.zzb;
    }

    private static zzgrs zzh(zzhdk zzhdkVar) throws GeneralSecurityException {
        int iOrdinal = zzhdkVar.ordinal();
        if (iOrdinal == 1) {
            return zzgrs.zza;
        }
        if (iOrdinal == 2) {
            return zzgrs.zzd;
        }
        if (iOrdinal == 3) {
            return zzgrs.zzc;
        }
        if (iOrdinal == 4) {
            return zzgrs.zze;
        }
        if (iOrdinal == 5) {
            return zzgrs.zzb;
        }
        int iZza = zzhdkVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 26);
        sb.append("Unable to parse HashType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhdq zzi(zzgru zzgruVar) throws GeneralSecurityException {
        zzhdk zzhdkVar;
        zzhdp zzhdpVarZzc = zzhdq.zzc();
        zzhdpVarZzc.zzb(zzgruVar.zze());
        zzgrs zzgrsVarZzh = zzgruVar.zzh();
        if (zzgrs.zza.equals(zzgrsVarZzh)) {
            zzhdkVar = zzhdk.SHA1;
        } else if (zzgrs.zzb.equals(zzgrsVarZzh)) {
            zzhdkVar = zzhdk.SHA224;
        } else if (zzgrs.zzc.equals(zzgrsVarZzh)) {
            zzhdkVar = zzhdk.SHA256;
        } else if (zzgrs.zzd.equals(zzgrsVarZzh)) {
            zzhdkVar = zzhdk.SHA384;
        } else {
            if (!zzgrs.zze.equals(zzgrsVarZzh)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzgrsVarZzh)));
            }
            zzhdkVar = zzhdk.SHA512;
        }
        zzhdpVarZzc.zza(zzhdkVar);
        return (zzhdq) zzhdpVarZzc.zzbu();
    }
}
