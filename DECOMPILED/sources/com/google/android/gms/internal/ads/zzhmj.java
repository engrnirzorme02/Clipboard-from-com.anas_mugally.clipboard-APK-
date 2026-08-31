package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmj extends zzhih implements zzhjt {
    private static final zzhmj zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhmj zzhmjVar = new zzhmj();
        zze = zzhmjVar;
        zzhih.zzbu(zzhmj.class, zzhmjVar);
    }

    private zzhmj() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", zzhmi.zza, "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhmj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmh(bArr);
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
        synchronized (zzhmj.class) {
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
