package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasv extends zzhih implements zzhjt {
    private static final zzasv zzl;
    private static volatile zzhka zzm;
    private int zza;
    private long zzb;
    private int zzc;
    private boolean zzd;
    private long zzf;
    private boolean zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private zzhip zze = zzhih.zzbC();
    private zzhit zzh = zzhih.zzbM();

    static {
        zzasv zzasvVar = new zzasv();
        zzl = zzasvVar;
        zzhih.zzbu(zzasv.class, zzasvVar);
    }

    private zzasv() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\b᠌\u0005\t᠌\u0006\n᠌\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", zzasz.class, "zzi", zzggg.zza(), "zzj", zzhlx.zza(), "zzk", zzhlv.zza()});
        }
        if (iOrdinal == 3) {
            return new zzasv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzasu(bArr);
        }
        if (iOrdinal == 5) {
            return zzl;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzm;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzasv.class) {
            try {
                zzhicVar = zzm;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzl);
                    zzm = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
