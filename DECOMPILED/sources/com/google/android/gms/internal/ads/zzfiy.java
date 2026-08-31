package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfiy extends zzhih implements zzhjt {
    private static final zzfiy zzg;
    private static volatile zzhka zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        zzfiy zzfiyVar = new zzfiy();
        zzg = zzfiyVar;
        zzhih.zzbu(zzfiy.class, zzfiyVar);
    }

    private zzfiy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzfiy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfix(bArr);
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
        synchronized (zzfiy.class) {
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
