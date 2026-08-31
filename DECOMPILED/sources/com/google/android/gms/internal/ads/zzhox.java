package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhox extends zzhih implements zzhjt {
    private static final zzhox zzh;
    private static volatile zzhka zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private zzhip zzd = zzhih.zzbC();
    private zzhit zzf = zzhih.zzbM();
    private zzhhb zzg = zzhhb.zzb;

    static {
        zzhox zzhoxVar = new zzhox();
        zzh = zzhoxVar;
        zzhih.zzbu(zzhox.class, zzhoxVar);
    }

    private zzhox() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", zzhov.class, "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzhox();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhow(bArr);
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
        synchronized (zzhox.class) {
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
