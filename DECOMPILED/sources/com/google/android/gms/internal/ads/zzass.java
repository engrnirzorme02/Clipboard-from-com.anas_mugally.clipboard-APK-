package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzass extends zzhih implements zzhjt {
    private static final zzass zzj;
    private static volatile zzhka zzk;
    private int zza;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;

    static {
        zzass zzassVar = new zzass();
        zzj = zzassVar;
        zzhih.zzbu(zzass.class, zzassVar);
    }

    private zzass() {
    }

    public static zzasr zza() {
        return (zzasr) zzj.zzbn();
    }

    final /* synthetic */ void zzb(long j7) {
        this.zza |= 1;
        this.zzb = j7;
    }

    final /* synthetic */ void zzc(long j7) {
        this.zza |= 4;
        this.zzd = j7;
    }

    final /* synthetic */ void zzd(long j7) {
        this.zza |= 8;
        this.zze = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzass();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzasr(bArr);
        }
        if (iOrdinal == 5) {
            return zzj;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzk;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzass.class) {
            try {
                zzhicVar = zzk;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzj);
                    zzk = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zze(long j7) {
        this.zza |= 16;
        this.zzf = j7;
    }

    final /* synthetic */ void zzg(long j7) {
        this.zza |= 32;
        this.zzg = j7;
    }
}
