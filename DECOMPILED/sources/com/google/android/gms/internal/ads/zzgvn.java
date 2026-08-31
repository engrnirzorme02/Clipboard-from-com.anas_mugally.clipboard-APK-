package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgvm.zza, zzgsl.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvj.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgvk.zza, zzgse.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvl.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsl zzgslVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhda zzhdaVarZzd = zzhdb.zzd();
        zzhdaVarZzd.zza(zzgslVar.zzc());
        zzhdvVarZze.zzb(((zzhdb) zzhdaVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgslVar.zzd()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgsl zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhdb zzhdbVarZzc = zzhdb.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzhdbVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgsj zzgsjVarZzb = zzgsl.zzb();
            zzgsjVarZzb.zza(zzhdbVarZzc.zza());
            zzgsjVarZzb.zzb(12);
            zzgsjVarZzb.zzc(16);
            zzgsjVarZzb.zzd(zzg(zzgzkVar.zzc().zzc()));
            return zzgsjVarZzb.zze();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgse zzgseVar, zzgqt zzgqtVar) {
        zzhcy zzhcyVarZzd = zzhcz.zzd();
        byte[] bArrZzc = zzgseVar.zzd().zzc(zzgqtVar);
        zzhcyVarZzd.zza(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhcz) zzhcyVarZzd.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgseVar.zze().zzd()), zzgseVar.zzf());
    }

    static /* synthetic */ zzgse zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhcz zzhczVarZzc = zzhcz.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhczVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgsj zzgsjVarZzb = zzgsl.zzb();
            zzgsjVarZzb.zza(zzhczVarZzc.zzb().zzc());
            zzgsjVarZzb.zzb(12);
            zzgsjVarZzb.zzc(16);
            zzgsjVarZzb.zzd(zzg(zzgzjVar.zzd()));
            zzgsl zzgslVarZze = zzgsjVarZzb.zze();
            zzgsd zzgsdVarZzc = zzgse.zzc();
            zzgsdVarZzc.zza(zzgslVarZze);
            zzgsdVarZzc.zzb(zzhgh.zza(zzhczVarZzc.zzb().zzv(), zzgqtVar));
            zzgsdVarZzc.zzc(zzgzjVar.zze());
            return zzgsdVarZzc.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhep zzf(zzgsk zzgskVar) throws GeneralSecurityException {
        if (zzgsk.zza.equals(zzgskVar)) {
            return zzhep.TINK;
        }
        if (zzgsk.zzb.equals(zzgskVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsk.zzc.equals(zzgskVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgskVar)));
    }

    private static zzgsk zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgsk.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgsk.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsk.zzb;
    }
}
