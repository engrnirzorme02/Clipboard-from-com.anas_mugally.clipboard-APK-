package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcf extends zzhih implements zzhjt {
    private static final zzhcf zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhch zzc;

    static {
        zzhcf zzhcfVar = new zzhcf();
        zzd = zzhcfVar;
        zzhih.zzbu(zzhcf.class, zzhcfVar);
    }

    private zzhcf() {
    }

    public static zzhcf zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhcf) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhce zzd() {
        return (zzhce) zzd.zzbn();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhch zzb() {
        zzhch zzhchVar = this.zzc;
        return zzhchVar == null ? zzhch.zzc() : zzhchVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhcf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhce(bArr);
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
        synchronized (zzhcf.class) {
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

    final /* synthetic */ void zze(int i7) {
        this.zzb = i7;
    }

    final /* synthetic */ void zzg(zzhch zzhchVar) {
        zzhchVar.getClass();
        this.zzc = zzhchVar;
        this.zza |= 1;
    }
}
