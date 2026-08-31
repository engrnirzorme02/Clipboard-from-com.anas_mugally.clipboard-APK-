package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvg {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgvf.zza, zzgsc.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvc.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgvd.zza, zzgrw.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgve.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsc zzgscVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzhcu zzhcuVarZzd = zzhcv.zzd();
        zzhcuVarZzd.zza(zzh(zzgscVar));
        zzhcuVarZzd.zzb(zzgscVar.zzc());
        zzhdvVarZze.zzb(((zzhcv) zzhcuVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgscVar.zze()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgsc zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhcv zzhcvVarZzc = zzhcv.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            zzgsa zzgsaVarZzb = zzgsc.zzb();
            zzgsaVarZzb.zza(zzhcvVarZzc.zzb());
            zzgsaVarZzb.zzb(zzhcvVarZzc.zza().zza());
            zzgsaVarZzb.zzc(16);
            zzgsaVarZzb.zzd(zzg(zzgzkVar.zzc().zzc()));
            return zzgsaVarZzb.zze();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgrw zzgrwVar, zzgqt zzgqtVar) {
        zzhcs zzhcsVarZze = zzhct.zze();
        zzhcsVarZze.zza(zzh(zzgrwVar.zze()));
        byte[] bArrZzc = zzgrwVar.zzd().zzc(zzgqtVar);
        zzhcsVarZze.zzb(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzhct) zzhcsVarZze.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgrwVar.zze().zze()), zzgrwVar.zzf());
    }

    static /* synthetic */ zzgrw zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zzhct zzhctVarZzd = zzhct.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhctVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsa zzgsaVarZzb = zzgsc.zzb();
            zzgsaVarZzb.zza(zzhctVarZzd.zzc().zzc());
            zzgsaVarZzb.zzb(zzhctVarZzd.zzb().zza());
            zzgsaVarZzb.zzc(16);
            zzgsaVarZzb.zzd(zzg(zzgzjVar.zzd()));
            zzgsc zzgscVarZze = zzgsaVarZzb.zze();
            zzgrv zzgrvVarZzc = zzgrw.zzc();
            zzgrvVarZzc.zza(zzgscVarZze);
            zzgrvVarZzc.zzb(zzhgh.zza(zzhctVarZzd.zzc().zzv(), zzgqtVar));
            zzgrvVarZzc.zzc(zzgzjVar.zze());
            return zzgrvVarZzc.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    private static zzhep zzf(zzgsb zzgsbVar) throws GeneralSecurityException {
        if (zzgsb.zza.equals(zzgsbVar)) {
            return zzhep.TINK;
        }
        if (zzgsb.zzb.equals(zzgsbVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsb.zzc.equals(zzgsbVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgsbVar)));
    }

    private static zzgsb zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgsb.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgsb.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsb.zzb;
    }

    private static zzhcx zzh(zzgsc zzgscVar) {
        zzhcw zzhcwVarZzb = zzhcx.zzb();
        zzhcwVarZzb.zza(zzgscVar.zzd());
        return (zzhcx) zzhcwVarZzb.zzbu();
    }
}
