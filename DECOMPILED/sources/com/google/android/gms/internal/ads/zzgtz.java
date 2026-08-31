package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgtz {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgty.zza, zzgtu.class, zzgzk.class);
        zzd = zzgys.zzd(zzgtv.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgtw.zza, zzgtq.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgtx.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgtu zzgtuVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhdvVarZze.zzb(zzg(zzgtuVar).zzaM());
        zzhdvVarZze.zzc(zzf(zzgtuVar.zzc()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgtu zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            return zzh(zzheo.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza()), zzgzkVar.zzc().zzc());
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgtq zzgtqVar, zzgqt zzgqtVar) {
        zzhel zzhelVarZzd = zzhem.zzd();
        zzhelVarZzd.zza(zzg(zzgtqVar.zzd()));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhem) zzhelVarZzd.zzbu()).zzaM(), zzhds.REMOTE, zzf(zzgtqVar.zzd().zzc()), zzgtqVar.zze());
    }

    static /* synthetic */ zzgtq zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhem zzhemVarZzc = zzhem.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhemVarZzc.zza() == 0) {
                return zzgtq.zzc(zzh(zzhemVarZzc.zzb(), zzgzjVar.zzd()), zzgzjVar.zze());
            }
            String strValueOf = String.valueOf(zzhemVarZzc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e7);
        }
    }

    private static zzhep zzf(zzgtt zzgttVar) throws GeneralSecurityException {
        if (zzgtt.zza.equals(zzgttVar)) {
            return zzhep.TINK;
        }
        if (zzgtt.zzb.equals(zzgttVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgttVar)));
    }

    private static zzheo zzg(zzgtu zzgtuVar) throws GeneralSecurityException {
        try {
            zzhdw zzhdwVarZzd = zzhdw.zzd(zzgqu.zza(zzgtuVar.zzd()), zzhhr.zza());
            zzhen zzhenVarZzd = zzheo.zzd();
            zzhenVarZzd.zza(zzgtuVar.zzb());
            zzhenVarZzd.zzb(zzhdwVarZzd);
            return (zzheo) zzhenVarZzd.zzbu();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e7);
        }
    }

    private static zzgtu zzh(zzheo zzheoVar, zzhep zzhepVar) throws GeneralSecurityException {
        zzgts zzgtsVar;
        zzgtt zzgttVar;
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza(zzheoVar.zzb().zza());
        zzhdvVarZze.zzb(zzheoVar.zzb().zzb());
        zzhdvVarZze.zzc(zzhep.RAW);
        zzgqs zzgqsVarZzb = zzgqu.zzb(((zzhdw) zzhdvVarZze.zzbu()).zzaN());
        if (zzgqsVarZzb instanceof zzgsl) {
            zzgtsVar = zzgts.zza;
        } else if (zzgqsVarZzb instanceof zzgta) {
            zzgtsVar = zzgts.zzc;
        } else if (zzgqsVarZzb instanceof zzguw) {
            zzgtsVar = zzgts.zzb;
        } else if (zzgqsVarZzb instanceof zzgru) {
            zzgtsVar = zzgts.zzd;
        } else if (zzgqsVarZzb instanceof zzgsc) {
            zzgtsVar = zzgts.zze;
        } else {
            if (!(zzgqsVarZzb instanceof zzgsu)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzgqsVarZzb.toString()));
            }
            zzgtsVar = zzgts.zzf;
        }
        zzgtr zzgtrVar = new zzgtr(null);
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            zzgttVar = zzgtt.zza;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
            zzgttVar = zzgtt.zzb;
        }
        zzgtrVar.zza(zzgttVar);
        zzgtrVar.zzb(zzheoVar.zza());
        zzgtrVar.zzd((zzgrg) zzgqsVarZzb);
        zzgtrVar.zzc(zzgtsVar);
        return zzgtrVar.zze();
    }
}
