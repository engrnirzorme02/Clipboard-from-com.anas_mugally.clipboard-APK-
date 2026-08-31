package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwb {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgyv zzc;
    private static final zzgys zzd;
    private static final zzgxq zze;
    private static final zzgxn zzf;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zzhggVarZza;
        zzc = zzgyv.zzd(zzgwa.zza, zzgta.class, zzgzk.class);
        zzd = zzgys.zzd(zzgvx.zza, zzhggVarZza, zzgzk.class);
        zze = zzgxq.zzd(zzgvy.zza, zzgsv.class, zzgzj.class);
        zzf = zzgxn.zzd(zzgvz.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zzc);
        zzgyoVar.zze(zzd);
        zzgyoVar.zzb(zze);
        zzgyoVar.zzc(zzf);
    }

    static /* synthetic */ zzgzk zzb(zzgta zzgtaVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzhdvVarZze.zzb(zzhdj.zzb().zzaM());
        zzhdvVarZze.zzc(zzf(zzgtaVar.zzc()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzgta zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhdj.zza(zzgzkVar.zzc().zzb(), zzhhr.zza());
            return zzgta.zzb(zzg(zzgzkVar.zzc().zzc()));
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzgsv zzgsvVar, zzgqt zzgqtVar) {
        zzhdg zzhdgVarZzd = zzhdh.zzd();
        byte[] bArrZzc = zzgsvVar.zzd().zzc(zzgqtVar);
        zzhdgVarZzd.zza(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((zzhdh) zzhdgVarZzd.zzbu()).zzaM(), zzhds.SYMMETRIC, zzf(zzgsvVar.zze().zzc()), zzgsvVar.zzf());
    }

    static /* synthetic */ zzgsv zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzhdh zzhdhVarZzc = zzhdh.zzc(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhdhVarZzc.zza() == 0) {
                return zzgsv.zzc(zzg(zzgzjVar.zzd()), zzhgh.zza(zzhdhVarZzc.zzb().zzv(), zzgqtVar), zzgzjVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhiw unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    private static zzhep zzf(zzgsz zzgszVar) throws GeneralSecurityException {
        if (zzgsz.zza.equals(zzgszVar)) {
            return zzhep.TINK;
        }
        if (zzgsz.zzb.equals(zzgszVar)) {
            return zzhep.CRUNCHY;
        }
        if (zzgsz.zzc.equals(zzgszVar)) {
            return zzhep.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgszVar.toString()));
    }

    private static zzgsz zzg(zzhep zzhepVar) throws GeneralSecurityException {
        int iOrdinal = zzhepVar.ordinal();
        if (iOrdinal == 1) {
            return zzgsz.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzgsz.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhepVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgsz.zzb;
    }
}
