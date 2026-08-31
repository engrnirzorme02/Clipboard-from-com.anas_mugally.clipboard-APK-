package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhei extends zzhih implements zzhjt {
    private static final zzhei zzd;
    private static volatile zzhka zze;
    private int zza;
    private int zzb;
    private zzhek zzc;

    static {
        zzhei zzheiVar = new zzhei();
        zzd = zzheiVar;
        zzhih.zzbu(zzhei.class, zzheiVar);
    }

    private zzhei() {
    }

    public static zzhei zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhei) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzheh zzd() {
        return (zzheh) zzd.zzbn();
    }

    public static zzhka zze() {
        return zzd.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhek zzb() {
        zzhek zzhekVar = this.zzc;
        return zzhekVar == null ? zzhek.zzd() : zzhekVar;
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
            return new zzhei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzheh(bArr);
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
        synchronized (zzhei.class) {
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

    final /* synthetic */ void zzg(zzhek zzhekVar) {
        zzhekVar.getClass();
        this.zzc = zzhekVar;
        this.zza |= 1;
    }
}
