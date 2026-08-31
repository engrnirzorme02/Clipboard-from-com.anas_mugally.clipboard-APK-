package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcj extends zzhih implements zzhjt {
    private static final zzhcj zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb;
    private zzhcn zzc;
    private zzhdm zzd;

    static {
        zzhcj zzhcjVar = new zzhcj();
        zze = zzhcjVar;
        zzhih.zzbu(zzhcj.class, zzhcjVar);
    }

    private zzhcj() {
    }

    public static zzhcj zzd(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzhcj) zzhih.zzbT(zze, zzhhbVar, zzhhrVar);
    }

    public static zzhci zze() {
        return (zzhci) zze.zzbn();
    }

    public static zzhka zzg() {
        return zze.zzbd();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzhcn zzb() {
        zzhcn zzhcnVar = this.zzc;
        return zzhcnVar == null ? zzhcn.zze() : zzhcnVar;
    }

    public final zzhdm zzc() {
        zzhdm zzhdmVar = this.zzd;
        return zzhdmVar == null ? zzhdm.zzg() : zzhdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzhcj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhci(bArr);
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
        synchronized (zzhcj.class) {
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

    final /* synthetic */ void zzh(zzhcn zzhcnVar) {
        zzhcnVar.getClass();
        this.zzc = zzhcnVar;
        this.zza |= 1;
    }

    final /* synthetic */ void zzi(zzhdm zzhdmVar) {
        zzhdmVar.getClass();
        this.zzd = zzhdmVar;
        this.zza |= 2;
    }
}
