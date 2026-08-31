package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdb extends zzhih implements zzhjt {
    private static final zzhdb zzc;
    private static volatile zzhka zzd;
    private int zza;
    private int zzb;

    static {
        zzhdb zzhdbVar = new zzhdb();
        zzc = zzhdbVar;
        zzhih.zzbu(zzhdb.class, zzhdbVar);
    }

    private zzhdb() {
    }

    public static zzhdb zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhdb) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhda zzd() {
        return (zzhda) zzc.zzbn();
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
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhdb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhda(bArr);
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
        synchronized (zzhdb.class) {
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
