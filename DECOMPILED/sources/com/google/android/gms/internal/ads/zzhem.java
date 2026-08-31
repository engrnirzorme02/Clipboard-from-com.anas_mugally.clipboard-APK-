package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhem extends zzhih implements zzhjt {
    private static final zzhem zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzheo zzc;

    static {
        zzhem zzhemVar = new zzhem();
        zzd = zzhemVar;
        zzhih.zzbu(zzhem.class, zzhemVar);
    }

    private zzhem() {
    }

    public static zzhem zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhem) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhel zzd() {
        return (zzhel) zzd.zzbn();
    }

    public static zzhka zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzheo zzb() {
        zzheo zzheoVar = this.zzc;
        return zzheoVar == null ? zzheo.zze() : zzheoVar;
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
            return new zzhem();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhel(bArr);
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
        synchronized (zzhem.class) {
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

    final /* synthetic */ void zzg(zzheo zzheoVar) {
        zzheoVar.getClass();
        this.zzc = zzheoVar;
        this.zza |= 1;
    }
}
