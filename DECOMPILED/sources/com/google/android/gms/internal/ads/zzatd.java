package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatd extends zzhih implements zzhjt {
    private static final zzatd zzh;
    private static volatile zzhka zzi;
    private int zza;
    private long zzd;
    private long zzf;
    private long zzg;
    private String zzb = "";
    private String zzc = "";
    private String zze = "D";

    static {
        zzatd zzatdVar = new zzatd();
        zzh = zzatdVar;
        zzhih.zzbu(zzatd.class, zzatdVar);
    }

    private zzatd() {
    }

    public static zzatc zza() {
        return (zzatc) zzh.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzh, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzatd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzatc(bArr);
        }
        if (iOrdinal == 5) {
            return zzh;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzi;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzatd.class) {
            try {
                zzhicVar = zzi;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzh);
                    zzi = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void zzg(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }

    final /* synthetic */ void zzh(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }
}
