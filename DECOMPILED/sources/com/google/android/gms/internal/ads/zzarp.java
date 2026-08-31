package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarp extends zzhih implements zzhjt {
    private static final zzarp zzg;
    private static volatile zzhka zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzarp zzarpVar = new zzarp();
        zzg = zzarpVar;
        zzhih.zzbu(zzarp.class, zzarpVar);
    }

    private zzarp() {
    }

    public static zzarp zzg() {
        return zzg;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzarp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaro(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzh;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzarp.class) {
            try {
                zzhicVar = zzh;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzg);
                    zzh = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    public final boolean zze() {
        return this.zzf;
    }
}
