package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdm extends zzhih implements zzhjt {
    private static final zzhdm zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhdq zzc;
    private zzhhb zzd = zzhhb.zzb;

    static {
        zzhdm zzhdmVar = new zzhdm();
        zze = zzhdmVar;
        zzhih.zzbu(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static zzhdm zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhdm) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhdl zze() {
        return (zzhdl) zze.zzbn();
    }

    public static zzhdm zzg() {
        return zze;
    }

    public static zzhka zzh() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhdq zzb() {
        zzhdq zzhdqVar = this.zzc;
        return zzhdqVar == null ? zzhdq.zzd() : zzhdqVar;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhdm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdl(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzf;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhdm.class) {
            try {
                zzhicVar = zzf;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zze);
                    zzf = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zzi(zzhdq zzhdqVar) {
        zzhdqVar.getClass();
        this.zzc = zzhdqVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        this.zzd = zzhhbVar;
    }
}
