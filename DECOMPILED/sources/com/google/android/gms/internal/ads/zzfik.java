package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfik extends zzhih implements zzhjt {
    private static final zzfik zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzfih zzb;

    static {
        zzfik zzfikVar = new zzfik();
        zzc = zzfikVar;
        zzhih.zzbu(zzfik.class, zzfikVar);
    }

    private zzfik() {
    }

    public static zzfij zza() {
        return (zzfij) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfih zzfihVar) {
        zzfihVar.getClass();
        this.zzb = zzfihVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfij(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzd;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfik.class) {
            try {
                zzhicVar = zzd;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzc);
                    zzd = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
