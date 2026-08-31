package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhbs {
    public static final /* synthetic */ int zza = 0;
    private static final zzhgg zzb;
    private static final zzgxh zzc;
    private static final zzgxh zzd;
    private static final zzgyv zze;
    private static final zzgys zzf;
    private static final zzgxq zzg;
    private static final zzgxn zzh;

    static {
        zzhgg zzhggVarZza = zzgzu.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzhggVarZza;
        zzgxg zzgxgVarZza = zzgxh.zza();
        zzgxgVarZza.zza(zzhep.RAW, zzhaq.zzd);
        zzgxgVarZza.zza(zzhep.TINK, zzhaq.zza);
        zzgxgVarZza.zza(zzhep.LEGACY, zzhaq.zzc);
        zzgxgVarZza.zza(zzhep.CRUNCHY, zzhaq.zzb);
        zzc = zzgxgVarZza.zzb();
        zzgxg zzgxgVarZza2 = zzgxh.zza();
        zzgxgVarZza2.zza(zzhdk.SHA1, zzhap.zza);
        zzgxgVarZza2.zza(zzhdk.SHA224, zzhap.zzb);
        zzgxgVarZza2.zza(zzhdk.SHA256, zzhap.zzc);
        zzgxgVarZza2.zza(zzhdk.SHA384, zzhap.zzd);
        zzgxgVarZza2.zza(zzhdk.SHA512, zzhap.zze);
        zzd = zzgxgVarZza2.zzb();
        zze = zzgyv.zzd(zzhbr.zza, zzhar.class, zzgzk.class);
        zzf = zzgys.zzd(zzhbo.zza, zzhggVarZza, zzgzk.class);
        zzg = zzgxq.zzd(zzhbp.zza, zzhai.class, zzgzj.class);
        zzh = zzgxn.zzd(zzhbq.zza, zzhggVarZza, zzgzj.class);
    }

    public static void zza(zzgyo zzgyoVar) {
        zzgyoVar.zzd(zze);
        zzgyoVar.zze(zzf);
        zzgyoVar.zzb(zzg);
        zzgyoVar.zzc(zzh);
    }

    static /* synthetic */ zzgzk zzb(zzhar zzharVar) {
        zzhdv zzhdvVarZze = zzhdw.zze();
        zzhdvVarZze.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzhdn zzhdnVarZze = zzhdo.zze();
        zzhdnVarZze.zza(zzf(zzharVar));
        zzhdnVarZze.zzb(zzharVar.zzc());
        zzhdvVarZze.zzb(((zzhdo) zzhdnVarZze.zzbu()).zzaM());
        zzhdvVarZze.zzc((zzhep) zzc.zzb(zzharVar.zzf()));
        return zzgzk.zza((zzhdw) zzhdvVarZze.zzbu());
    }

    static /* synthetic */ zzhar zzc(zzgzk zzgzkVar) throws GeneralSecurityException {
        if (!zzgzkVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgzkVar.zzc().zza())));
        }
        try {
            zzhdo zzhdoVarZzd = zzhdo.zzd(zzgzkVar.zzc().zzb(), zzhhr.zza());
            if (zzhdoVarZzd.zzc() != 0) {
                int iZzc = zzhdoVarZzd.zzc();
                StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 47);
                sb.append("Parsing HmacParameters failed: unknown Version ");
                sb.append(iZzc);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhao zzhaoVarZzb = zzhar.zzb();
            zzhaoVarZzb.zza(zzhdoVarZzd.zzb());
            zzhaoVarZzb.zzb(zzhdoVarZzd.zza().zzb());
            zzhaoVarZzb.zzd((zzhap) zzd.zzc(zzhdoVarZzd.zza().zza()));
            zzhaoVarZzb.zzc((zzhaq) zzc.zzc(zzgzkVar.zzc().zzc()));
            return zzhaoVarZzb.zze();
        } catch (zzhiw e7) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e7);
        }
    }

    static /* synthetic */ zzgzj zzd(zzhai zzhaiVar, zzgqt zzgqtVar) {
        zzhdl zzhdlVarZze = zzhdm.zze();
        zzhdlVarZze.zza(zzf(zzhaiVar.zze()));
        byte[] bArrZzc = zzhaiVar.zzc().zzc(zzgqtVar);
        zzhdlVarZze.zzb(zzhhb.zzr(bArrZzc, 0, bArrZzc.length));
        return zzgzj.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzhdm) zzhdlVarZze.zzbu()).zzaM(), zzhds.SYMMETRIC, (zzhep) zzc.zzb(zzhaiVar.zze().zzf()), zzhaiVar.zzf());
    }

    static /* synthetic */ zzhai zze(zzgzj zzgzjVar, zzgqt zzgqtVar) throws GeneralSecurityException {
        if (!zzgzjVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            zzhdm zzhdmVarZzd = zzhdm.zzd(zzgzjVar.zzb(), zzhhr.zza());
            if (zzhdmVarZzd.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhao zzhaoVarZzb = zzhar.zzb();
            zzhaoVarZzb.zza(zzhdmVarZzd.zzc().zzc());
            zzhaoVarZzb.zzb(zzhdmVarZzd.zzb().zzb());
            zzhaoVarZzb.zzd((zzhap) zzd.zzc(zzhdmVarZzd.zzb().zza()));
            zzhaoVarZzb.zzc((zzhaq) zzc.zzc(zzgzjVar.zzd()));
            zzhar zzharVarZze = zzhaoVarZzb.zze();
            zzhah zzhahVarZzb = zzhai.zzb();
            zzhahVarZzb.zza(zzharVarZze);
            zzhahVarZzb.zzb(zzhgh.zza(zzhdmVarZzd.zzc().zzv(), zzgqtVar));
            zzhahVarZzb.zzc(zzgzjVar.zze());
            return zzhahVarZzb.zzd();
        } catch (zzhiw | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    private static zzhdq zzf(zzhar zzharVar) {
        zzhdp zzhdpVarZzc = zzhdq.zzc();
        zzhdpVarZzc.zzb(zzharVar.zzd());
        zzhdpVarZzc.zza((zzhdk) zzd.zzb(zzharVar.zzg()));
        return (zzhdq) zzhdpVarZzc.zzbu();
    }
}
