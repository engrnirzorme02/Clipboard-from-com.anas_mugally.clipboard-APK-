package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzase extends zzhih implements zzhjt {
    private static final zzase zze;
    private static volatile zzhka zzf;
    private int zza;
    private long zzb = -1;
    private int zzc = zzbbn.zzq.zzf;
    private int zzd = zzbbn.zzq.zzf;

    static {
        zzase zzaseVar = new zzase();
        zze = zzaseVar;
        zzhih.zzbu(zzase.class, zzaseVar);
    }

    private zzase() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            zzhin zzhinVar = zzatb.zza;
            return zzhih.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", "zzc", zzhinVar, "zzd", zzhinVar});
        }
        if (iOrdinal == 3) {
            return new zzase();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzasd(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzf;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzase.class) {
            try {
                zzhicVar = zzf;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zze);
                    zzf = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
