package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwq {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgwp.zza, zzgup.class, zzgzk.class);
        zzd = zzgys.zzd(zzgwm.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgwn.zza, zzguk.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgwo.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgup zzgupVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zzheu zzheuVarZzd = zzhev.zzd();
        zzhew zzhewVarZzb = zzhex.zzb();
        zzhewVarZzb.zza(zzgupVar.zzd());
        zzheuVarZzd.zza((zzhex) zzhewVarZzb.zzbu());
        zzhdvVarZze.zzb(((zzhev) zzheuVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgupVar.zzc()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgup zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhev zzhevVarZzc = zzhev.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzhevVarZzc.zza() == 0) {
                return zzgup.zzb(zzg(zzgzkVar.zzc().zzc()), zzhevVarZzc.zzb().zza());
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzguk zzgukVar, zzgqt zzgqtVar) {
        zzhes zzhesVarZze = zzhet.zze();
        byte[] bArrZzc = zzgukVar.zzd().zzc(zzgqtVar);
        zzhesVarZze.zzb(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        zzhew zzhewVarZzb = zzhex.zzb();
        zzhewVarZzb.zza(zzgukVar.zze().zzd());
        zzhesVarZze.zza((zzhex) zzhewVarZzb.zzbu());
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzhet) zzhesVarZze.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgukVar.zze().zzc()), zzgukVar.zzf());
    }

    static /* synthetic */ zzguk zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzhet zzhetVarZzd = zzhet.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhetVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zzhetVarZzd.zzc().zzc() == 32) {
                return zzguk.zzc(zzgup.zzb(zzg(zzgzjVar.zzd()), zzhetVarZzd.zzb().zza()), zzhgh.zza(zzhetVarZzd.zzc().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    private static zzhep zzf(zzguo zzguoVar) throws GeneralSecurityException {
        if (Objects.equals(zzguoVar, zzguo.zza)) {
            return zzhep.TINK;
        }
        if (Objects.equals(zzguoVar, zzguo.zzb)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzguoVar.toString()));
    }

    private static zzguo zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzguo.zza;
        }
        if (iOrdinal == 3) {
            return zzguo.zzb;
        }
        int iZza = zzhepVar.zza();
        StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(iZza);
        throw new GeneralSecurityException(sb.toString());
    }
}
