package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhex extends zzhih implements zzhjt {
    private static final zzhex zzb;
    private static volatile zzhka zzc;
    private int zza;

    static {
        zzhex zzhexVar = new zzhex();
        zzb = zzhexVar;
        zzhih.zzbu(zzhex.class, zzhexVar);
    }

    private zzhex() {
    }

    public static zzhew zzb() {
        return (zzhew) zzb.zzbn();
    }

    public static zzhex zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zza;
    }

    final /* synthetic */ void zzd(int i7) {
        this.zza = i7;
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
            return new zzhex();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhew(bArr);
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
        synchronized (zzhex.class) {
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
