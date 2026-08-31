package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaqy extends zzhih implements zzhjt {
    private static final zzaqy zzj;
    private static volatile zzhka zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzarp zzg;
    private zzarv zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        zzaqy zzaqyVar = new zzaqy();
        zzj = zzaqyVar;
        zzhih.zzbu(zzaqy.class, zzaqyVar);
    }

    private zzaqy() {
    }

    public static zzaqx zze() {
        return (zzaqx) zzj.zzbn();
    }

    public final String zza() {
        return this.zzd;
    }

    @Deprecated
    public final boolean zzb() {
        return this.zze;
    }

    public final zzarp zzc() {
        zzarp zzarpVar = this.zzg;
        return zzarpVar == null ? zzarp.zzg() : zzarpVar;
    }

    public final zzarv zzd() {
        zzarv zzarvVar = this.zzh;
        return zzarvVar == null ? zzarv.zza() : zzarvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", zzarb.zza, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iOrdinal == 3) {
            return new zzaqy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzaqx(bArr);
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
        synchronized (zzaqy.class) {
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

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzh(boolean z7) {
        this.zza |= 8;
        this.zze = z7;
    }
}
