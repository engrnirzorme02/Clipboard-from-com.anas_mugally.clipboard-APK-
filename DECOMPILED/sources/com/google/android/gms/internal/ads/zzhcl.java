package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcl extends zzhih implements zzhjt {
    private static final zzhcl zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhcp zzb;
    private zzhdo zzc;

    static {
        zzhcl zzhclVar = new zzhcl();
        zzd = zzhclVar;
        zzhih.zzbu(zzhcl.class, zzhclVar);
    }

    private zzhcl() {
    }

    public static zzhcl zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhcl) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhck zzd() {
        return (zzhck) zzd.zzbn();
    }

    public final zzhcp zza() {
        zzhcp zzhcpVar = this.zzb;
        return zzhcpVar == null ? zzhcp.zzd() : zzhcpVar;
    }

    public final zzhdo zzb() {
        zzhdo zzhdoVar = this.zzc;
        return zzhdoVar == null ? zzhdo.zzg() : zzhdoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhcl();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhck(bArr);
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
        synchronized (zzhcl.class) {
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

    final /* synthetic */ void zze(zzhcp zzhcpVar) {
        zzhcpVar.getClass();
        this.zzb = zzhcpVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzg(zzhdo zzhdoVar) {
        zzhdoVar.getClass();
        this.zzc = zzhdoVar;
        this.zza |= 2;
    }
}
