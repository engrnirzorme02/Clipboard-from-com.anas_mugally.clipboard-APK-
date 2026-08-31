package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdj extends zzhih implements zzhjt {
    private static final zzhdj zza;
    private static volatile zzhka zzb;

    static {
        zzhdj zzhdjVar = new zzhdj();
        zza = zzhdjVar;
        zzhih.zzbu(zzhdj.class, zzhdjVar);
    }

    private zzhdj() {
    }

    public static zzhdj zza(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhdj) zzhih.zzbT(zza, zzhhbVar, zzhhrVar);
    }

    public static zzhdj zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zzhih.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhdj();
        }
        if (iOrdinal == 4) {
            return new zzhdi(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzb;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhdj.class) {
            try {
                zzhicVar = zzb;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zza);
                    zzb = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
