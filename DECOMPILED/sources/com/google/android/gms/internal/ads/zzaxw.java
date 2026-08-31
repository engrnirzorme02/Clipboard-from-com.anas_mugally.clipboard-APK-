package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaxw extends zzhih implements zzhjt {
    private static final zzaxw zzg;
    private static volatile zzhka zzh;
    private int zza;
    private String zzb = "";
    private String zzc = "";
    private long zzd;
    private long zze;
    private long zzf;

    static {
        zzaxw zzaxwVar = new zzaxw();
        zzg = zzaxwVar;
        zzhih.zzbu(zzaxw.class, zzaxwVar);
    }

    private zzaxw() {
    }

    public static zzaxw zzg(zzhhb zzhhbVar) {
        return (zzaxw) zzhih.zzbS(zzg, zzhhbVar);
    }

    public static zzaxw zzh(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzaxw) zzhih.zzbT(zzg, zzhhbVar, zzhhrVar);
    }

    public static zzaxv zzi() {
        return (zzaxv) zzg.zzbn();
    }

    public static zzaxw zzj() {
        return zzg;
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final long zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (iOrdinal == 3) {
            return new zzaxw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaxv(bArr);
        }
        if (iOrdinal == 5) {
            return zzg;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzh;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzaxw.class) {
            try {
                zzhicVar = zzh;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzg);
                    zzh = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    public final long zze() {
        return this.zzf;
    }

    final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzm(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    final /* synthetic */ void zzn(long j7) {
        this.zza |= 8;
        this.zze = j7;
    }

    final /* synthetic */ void zzo(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }
}
