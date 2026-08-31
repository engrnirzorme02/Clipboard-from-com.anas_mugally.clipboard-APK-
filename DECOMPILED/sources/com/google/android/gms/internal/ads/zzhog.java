package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhog extends zzhih implements zzhjt {
    private static final zzhog zzj;
    private static volatile zzhka zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzhog zzhogVar = new zzhog();
        zzj = zzhogVar;
        zzhih.zzbu(zzhog.class, zzhogVar);
    }

    private zzhog() {
    }

    public static zzhof zzc() {
        return (zzhof) zzj.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", zzhoh.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzhog();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhof(bArr);
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
        synchronized (zzhog.class) {
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
        this.zza |= 2;
        this.zzc = j7;
    }

    final /* synthetic */ void zzg(boolean z7) {
        this.zza |= 4;
        this.zzd = z7;
    }
}
