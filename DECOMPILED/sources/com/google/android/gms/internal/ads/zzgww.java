package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgww {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgwv.zza, zzguw.class, zzgzk.class);
        zzd = zzgys.zzd(zzgws.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgwt.zza, zzguq.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgwu.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzguw zzguwVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzhdvVarZze.zzb(zzhfb.zzc().zzaM());
        zzhdvVarZze.zzc(zzf(zzguwVar.zzc()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzguw zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            if (zzhfb.zzb(zzgzkVar.zzc().zzb(), zzhhr.zza()).zza() == 0) {
                return zzguw.zzb(zzg(zzgzkVar.zzc().zzc()));
            }
            throw new GeneralSecurityException("Only version 0 parameters are accepted");
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzguq zzguqVar, zzgqt zzgqtVar) {
        zzhey zzheyVarZzd = zzhez.zzd();
        byte[] bArrZzc = zzguqVar.zzd().zzc(zzgqtVar);
        zzheyVarZzd.zza(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzhez) zzheyVarZzd.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzguqVar.zze().zzc()), zzguqVar.zzf());
    }

    static /* synthetic */ zzguq zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhez zzhezVarZzc = zzhez.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhezVarZzc.zza() == 0) {
                return zzguq.zzc(zzg(zzgzjVar.zzd()), zzhgh.zza(zzhezVarZzc.zzb().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzhep zzf(zzguv zzguvVar) throws GeneralSecurityException {
        if (zzguv.zza.equals(zzguvVar)) {
            return zzhep.TINK;
        }
        if (zzguv.zzb.equals(zzguvVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzguv.zzc.equals(zzguvVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzguvVar.toString()));
    }

    private static zzguv zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzguv.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzguv.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzguv.zzb;
    }
}
