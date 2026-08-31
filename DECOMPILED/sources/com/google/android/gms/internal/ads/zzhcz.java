package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcz extends zzhih implements zzhjt {
    private static final zzhcz zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhhb zzb = zzhhb.zzb;

    static {
        zzhcz zzhczVar = new zzhcz();
        zzc = zzhczVar;
        zzhih.zzbu(zzhcz.class, zzhczVar);
    }

    private zzhcz() {
    }

    public static zzhcz zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhcz) zzhih.zzbT(zzc, zzhhbVar, zzhhrVar);
    }

    public static zzhcy zzd() {
        return (zzhcy) zzc.zzbn();
    }

    public static zzhka zze() {
        return zzc.zzbd();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
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
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzhcz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhcy(bArr);
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
        synchronized (zzhcz.class) {
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

    final /* synthetic */ void zzg(zzhhb zzhhbVar) {
        this.zzb = zzhhbVar;
    }
}
