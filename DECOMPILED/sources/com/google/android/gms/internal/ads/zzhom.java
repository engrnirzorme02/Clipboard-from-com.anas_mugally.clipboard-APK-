package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhom extends zzhih implements zzhjt {
    private static final zzhom zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private int zzc;

    static {
        zzhom zzhomVar = new zzhom();
        zzd = zzhomVar;
        zzhih.zzbu(zzhom.class, zzhomVar);
    }

    private zzhom() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzhin zzhinVar = zzhol.zza;
            return zzhih.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", zzhinVar, "zzc", zzhinVar});
        }
        if (iOrdinal == 3) {
            return new zzhom();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhok(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zze;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhom.class) {
            try {
                zzhicVar = zze;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzd);
                    zze = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
