package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhmd extends zzhih implements zzhjt {
    private static final zzhmd zzd;
    private static volatile zzhka zze;
    private int zza;
    private long zzb;
    private long zzc;

    static {
        zzhmd zzhmdVar = new zzhmd();
        zzd = zzhmdVar;
        zzhih.zzbu(zzhmd.class, zzhmdVar);
    }

    private zzhmd() {
    }

    public static zzhmc zzc() {
        return (zzhmc) zzd.zzbn();
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
            return zzhih.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhmd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhmc(bArr);
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
        synchronized (zzhmd.class) {
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

    final /* synthetic */ void zze(long j7) {
        this.zzb = j7;
    }

    final /* synthetic */ void zzg(long j7) {
        this.zzc = j7;
    }
}
