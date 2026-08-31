package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuz extends zzhih implements zzhjt {
    private static final zzfuz zzh;
    private static volatile zzhka zzi;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        zzfuz zzfuzVar = new zzfuz();
        zzh = zzfuzVar;
        zzhih.zzbu(zzfuz.class, zzfuzVar);
    }

    private zzfuz() {
    }

    public static zzfuy zzg() {
        return (zzfuy) zzh.zzbn();
    }

    public static zzfuz zzh() {
        return zzh;
    }

    public final boolean zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }

    public final long zzd() {
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
            return zzhih.zzbv(zzh, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzfuz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfuy(bArr);
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
        synchronized (zzfuz.class) {
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

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzi(boolean z7) {
        this.zza |= 4;
        this.zzd = z7;
    }
}
