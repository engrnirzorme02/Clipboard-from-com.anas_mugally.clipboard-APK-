package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdf extends zzhih implements zzhjt {
    private static final zzhdf zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdf zzhdfVar = new zzhdf();
        zzc = zzhdfVar;
        zzhih.zzbu(zzhdf.class, zzhdfVar);
    }

    private zzhdf() {
    }

    public static zzhdf zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhdf) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhde zzd() {
        return (zzhde) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzb", "zza"});
        }
        if (iOrdinal == 3) {
            return new zzhdf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhde(bArr);
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
        synchronized (zzhdf.class) {
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
        this.zza = i7;
    }
}
