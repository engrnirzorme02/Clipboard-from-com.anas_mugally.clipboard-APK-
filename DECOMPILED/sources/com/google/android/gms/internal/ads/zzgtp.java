package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtp {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgto.zza, zzgtk.class, zzgzk.class);
        zzd = zzgys.zzd(zzgtl.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgtm.zza, zzgti.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgtn.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgtk zzgtkVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzhej zzhejVarZzc = zzhek.zzc();
        zzhejVarZzc.zza(zzgtkVar.zzc());
        zzhdvVarZze.zzb(((zzhek) zzhejVarZzc.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgtkVar.zzd()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgtk zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            return zzgtk.zzb(zzhek.zzb(zzgzkVar.zzc().zzb(), zzhhr.zza()).zza(), zzg(zzgzkVar.zzc().zzc()));
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgti zzgtiVar, zzgqt zzgqtVar) {
        zzheh zzhehVarZzd = zzhei.zzd();
        zzhej zzhejVarZzc = zzhek.zzc();
        zzhejVarZzc.zza(zzgtiVar.zzd().zzc());
        zzhehVarZzd.zza((zzhek) zzhejVarZzc.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzhei) zzhehVarZzd.zzbu()).zzaM(), zzhds.REMOTE, zzf(zzgtiVar.zzd().zzd()), zzgtiVar.zze());
    }

    static /* synthetic */ zzgti zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzhei zzheiVarZzc = zzhei.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzheiVarZzc.zza() == 0) {
                return zzgti.zzc(zzgtk.zzb(zzheiVarZzc.zzb().zza(), zzg(zzgzjVar.zzd())), zzgzjVar.zze());
            }
            String strValueOf = String.valueOf(zzheiVarZzc);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 49);
            sb.append("KmsAeadKey are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e7);
        }
    }

    private static zzhep zzf(zzgtj zzgtjVar) throws GeneralSecurityException {
        if (zzgtj.zza.equals(zzgtjVar)) {
            return zzhep.TINK;
        }
        if (zzgtj.zzb.equals(zzgtjVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgtjVar.toString()));
    }

    private static zzgtj zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgtj.zza;
        }
        if (iOrdinal == 3) {
            return zzgtj.zzb;
        }
        int iZza = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
