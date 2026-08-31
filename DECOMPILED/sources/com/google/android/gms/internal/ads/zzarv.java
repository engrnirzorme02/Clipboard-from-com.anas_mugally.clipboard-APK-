package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarv extends zzhih implements zzhjt {
    private static final zzarv zzg;
    private static volatile zzhka zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zzarv zzarvVar = new zzarv();
        zzg = zzarvVar;
        zzhih.zzbu(zzarv.class, zzarvVar);
    }

    private zzarv() {
    }

    public static zzarv zza() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzarv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaru(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzh;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzarv.class) {
            try {
                zzhicVar = zzh;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzg);
                    zzh = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
