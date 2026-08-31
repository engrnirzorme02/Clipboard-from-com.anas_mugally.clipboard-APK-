package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhfb extends zzhih implements zzhjt {
    private static final zzhfb zzb;
    private static volatile zzhka zzc;
    private int zza;

    static {
        zzhfb zzhfbVar = new zzhfb();
        zzb = zzhfbVar;
        zzhih.zzbu(zzhfb.class, zzhfbVar);
    }

    private zzhfb() {
    }

    public static zzhfb zzb(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhfb) zzhih.zzbT(zzb, zzhhbVar, zzhhrVar);
    }

    public static zzhfb zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzhfb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhfa(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzc;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhfb.class) {
            try {
                zzhicVar = zzc;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzb);
                    zzc = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
