package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlt extends zzhih implements zzhjt {
    private static final zzhlt zzc;
    private static volatile zzhka zzd;
    private int zza;
    private String zzb = "";

    static {
        zzhlt zzhltVar = new zzhlt();
        zzc = zzhltVar;
        zzhih.zzbu(zzhlt.class, zzhltVar);
    }

    private zzhlt() {
    }

    public static zzhls zzc() {
        return (zzhls) zzc.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhlt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhls(bArr);
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
        synchronized (zzhlt.class) {
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

    final /* synthetic */ void zze(int i7) {
        this.zza = 15;
    }
}
