package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbj {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzhbi.zza, zzhad.class, zzgzk.class);
        zzd = zzgys.zzd(zzhbf.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzhbg.zza, zzgzw.class, zzgzj.class);
        zzf = zzgxn.zzd(zzhbh.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzhad zzhadVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzhce zzhceVarZzd = zzhcf.zzd();
        zzhceVarZzd.zzb(zzh(zzhadVar));
        zzhceVarZzd.zza(zzhadVar.zzc());
        zzhdvVarZze.zzb(((zzhcf) zzhceVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzhadVar.zzf()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzhad zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhcf zzhcfVarZzc = zzhcf.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            zzhab zzhabVarZzb = zzhad.zzb();
            zzhabVarZzb.zza(zzhcfVarZzc.zza());
            zzhabVarZzb.zzb(zzhcfVarZzc.zzb().zza());
            zzhabVarZzb.zzc(zzg(zzgzkVar.zzc().zzc()));
            return zzhabVarZzb.zzd();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgzw zzgzwVar, zzgqt zzgqtVar) {
        zzhcc zzhccVarZze = zzhcd.zze();
        zzhccVarZze.zzb(zzh(zzgzwVar.zze()));
        byte[] bArrZzc = zzgzwVar.zzc().zzc(zzgqtVar);
        zzhccVarZze.zza(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzhcd) zzhccVarZze.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgzwVar.zze().zzf()), zzgzwVar.zzf());
    }

    static /* synthetic */ zzgzw zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzhcd zzhcdVarZzd = zzhcd.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhcdVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhab zzhabVarZzb = zzhad.zzb();
            zzhabVarZzb.zza(zzhcdVarZzd.zzb().zzc());
            zzhabVarZzb.zzb(zzhcdVarZzd.zzc().zza());
            zzhabVarZzb.zzc(zzg(zzgzjVar.zzd()));
            zzhad zzhadVarZzd = zzhabVarZzb.zzd();
            zzgzv zzgzvVarZzb = zzgzw.zzb();
            zzgzvVarZzb.zza(zzhadVarZzd);
            zzgzvVarZzb.zzb(zzhgh.zza(zzhcdVarZzd.zzb().zzv(), zzgqtVar));
            zzgzvVarZzb.zzc(zzgzjVar.zze());
            return zzgzvVarZzb.zzd();
        } catch (zzhiw | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    private static zzhep zzf(zzhac zzhacVar) throws GeneralSecurityException {
        if (zzhac.zza.equals(zzhacVar)) {
            return zzhep.TINK;
        }
        if (zzhac.zzb.equals(zzhacVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzhac.zzd.equals(zzhacVar)) {
            return zzhep.RAW;
        }
        if (zzhac.zzc.equals(zzhacVar)) {
            return zzhep.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzhacVar)));
    }

    private static zzhac zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzhac.zza;
        }
        if (iOrdinal == 2) {
            return zzhac.zzc;
        }
        if (iOrdinal == 3) {
            return zzhac.zzd;
        }
        if (iOrdinal == 4) {
            return zzhac.zzb;
        }
        int iZza = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }

    private static zzhch zzh(zzhad zzhadVar) {
        zzhcg zzhcgVarZzb = zzhch.zzb();
        zzhcgVarZzb.zza(zzhadVar.zzd());
        return (zzhch) zzhcgVarZzb.zzbu();
    }
}
