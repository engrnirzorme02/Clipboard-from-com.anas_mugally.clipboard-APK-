package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhev extends zzhih implements zzhjt {
    private static final zzhev zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhex zzc;

    static {
        zzhev zzhevVar = new zzhev();
        zzd = zzhevVar;
        zzhih.zzbu(zzhev.class, zzhevVar);
    }

    private zzhev() {
    }

    public static zzhev zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhev) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzheu zzd() {
        return (zzheu) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhex zzb() {
        zzhex zzhexVar = this.zzc;
        return zzhexVar == null ? zzhex.zzc() : zzhexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhev();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzheu(bArr);
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
        synchronized (zzhev.class) {
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

    final /* synthetic */ void zze(zzhex zzhexVar) {
        zzhexVar.getClass();
        this.zzc = zzhexVar;
        this.zza |= 1;
    }
}
