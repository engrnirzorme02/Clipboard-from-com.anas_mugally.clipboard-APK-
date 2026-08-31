package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmz extends zzhih implements zzhjt {
    private static final zzhmz zzf;
    private static volatile zzhka zzg;
    private int zza;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private long zze;

    static {
        zzhmz zzhmzVar = new zzhmz();
        zzf = zzhmzVar;
        zzhih.zzbu(zzhmz.class, zzhmzVar);
    }

    private zzhmz() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", zzhmy.zza, "zzc", zzhmw.zza, "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhmz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmx(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzg;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhmz.class) {
            try {
                zzhicVar = zzg;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzf);
                    zzg = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
