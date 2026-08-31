package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcv extends zzhih implements zzhjt {
    private static final zzhcv zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcx zzb;
    private int zzc;

    static {
        zzhcv zzhcvVar = new zzhcv();
        zzd = zzhcvVar;
        zzhih.zzbu(zzhcv.class, zzhcvVar);
    }

    private zzhcv() {
    }

    public static zzhcv zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhcv) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhcu zzd() {
        return (zzhcu) zzd.zzbn();
    }

    public final zzhcx zza() {
        zzhcx zzhcxVar = this.zzb;
        return zzhcxVar == null ? zzhcx.zzc() : zzhcxVar;
    }

    public final int zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhcv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhcu(bArr);
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
        synchronized (zzhcv.class) {
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

    final /* synthetic */ void zze(zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        this.zzb = zzhcxVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i7) {
        this.zzc = i7;
    }
}
