package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarn extends zzhih implements zzhjt {
    private static final zzarn zzh;
    private static volatile zzhka zzi;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzarn zzarnVar = new zzarn();
        zzh = zzarnVar;
        zzhih.zzbu(zzarn.class, zzarnVar);
    }

    private zzarn() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzarn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzarm(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzi;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzarn.class) {
            try {
                zzhicVar = zzi;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzh);
                    zzi = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
