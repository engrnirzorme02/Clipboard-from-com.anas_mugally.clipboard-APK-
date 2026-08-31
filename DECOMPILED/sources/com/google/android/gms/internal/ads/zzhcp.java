package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcp extends zzhih implements zzhjt {
    private static final zzhcp zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcr zzb;
    private int zzc;

    static {
        zzhcp zzhcpVar = new zzhcp();
        zzd = zzhcpVar;
        zzhih.zzbu(zzhcp.class, zzhcpVar);
    }

    private zzhcp() {
    }

    public static zzhco zzc() {
        return (zzhco) zzd.zzbn();
    }

    public static zzhcp zzd() {
        return zzd;
    }

    public final zzhcr zza() {
        zzhcr zzhcrVar = this.zzb;
        return zzhcrVar == null ? zzhcr.zzc() : zzhcrVar;
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
            return new zzhcp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhco(bArr);
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
        synchronized (zzhcp.class) {
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

    final /* synthetic */ void zze(zzhcr zzhcrVar) {
        zzhcrVar.getClass();
        this.zzb = zzhcrVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(int i7) {
        this.zzc = i7;
    }
}
