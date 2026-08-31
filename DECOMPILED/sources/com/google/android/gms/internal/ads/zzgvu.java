package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgvu {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgvt.zza, zzgsu.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvq.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgvr.zza, zzgsn.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvs.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgsu zzgsuVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzhde zzhdeVarZzd = zzhdf.zzd();
        zzhdeVarZzd.zza(zzgsuVar.zzc());
        zzhdvVarZze.zzb(((zzhdf) zzhdeVarZzd.zzbu()).zzaM());
        zzhdvVarZze.zzc(zzf(zzgsuVar.zzd()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgsu zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhdf zzhdfVarZzc = zzhdf.zzc(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzhdfVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzgss zzgssVarZzb = zzgsu.zzb();
            zzgssVarZzb.zza(zzhdfVarZzc.zza());
            zzgssVarZzb.zzb(zzg(zzgzkVar.zzc().zzc()));
            return zzgssVarZzb.zzc();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgsn zzgsnVar, zzgqt zzgqtVar) {
        zzhdc zzhdcVarZzd = zzhdd.zzd();
        byte[] bArrZzc = zzgsnVar.zzd().zzc(zzgqtVar);
        zzhdcVarZzd.zza(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzhdd) zzhdcVarZzd.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgsnVar.zze().zzd()), zzgsnVar.zzf());
    }

    static /* synthetic */ zzgsn zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzhdd zzhddVarZzc = zzhdd.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhddVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzgss zzgssVarZzb = zzgsu.zzb();
            zzgssVarZzb.zza(zzhddVarZzc.zzb().zzc());
            zzgssVarZzb.zzb(zzg(zzgzjVar.zzd()));
            zzgsu zzgsuVarZzc = zzgssVarZzb.zzc();
            zzgsm zzgsmVarZzc = zzgsn.zzc();
            zzgsmVarZzc.zza(zzgsuVarZzc);
            zzgsmVarZzc.zzb(zzhgh.zza(zzhddVarZzc.zzb().zzv(), zzgqtVar));
            zzgsmVarZzc.zzc(zzgzjVar.zze());
            return zzgsmVarZzc.zzd();
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    private static zzhep zzf(zzgst zzgstVar) throws GeneralSecurityException {
        if (zzgst.zza.equals(zzgstVar)) {
            return zzhep.TINK;
        }
        if (zzgst.zzb.equals(zzgstVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgst.zzc.equals(zzgstVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgstVar)));
    }

    private static zzgst zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgst.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgst.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgst.zzb;
    }
}
