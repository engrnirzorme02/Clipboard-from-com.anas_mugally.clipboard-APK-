package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxs extends zzhih implements zzhjt {
    private static final zzaxs zze;
    private static volatile zzhka zzf;
    private int zza;
    private zzaxw zzb;
    private zzhhb zzc;
    private zzhhb zzd;

    static {
        zzaxs zzaxsVar = new zzaxs();
        zze = zzaxsVar;
        zzhih.zzbu(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
    }

    public static zzaxs zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzaxs) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzaxs zze(byte[] bArr, zzhhr zzhhrVar) {
        return (zzaxs) zzhih.zzbV(zze, bArr, zzhhrVar);
    }

    public final zzaxw zza() {
        zzaxw zzaxwVar = this.zzb;
        return zzaxwVar == null ? zzaxw.zzj() : zzaxwVar;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzaxs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxr(bArr);
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
        synchronized (zzaxs.class) {
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
