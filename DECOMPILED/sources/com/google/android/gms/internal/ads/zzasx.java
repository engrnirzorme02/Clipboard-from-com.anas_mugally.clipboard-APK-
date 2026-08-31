package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasx extends zzhih implements zzhjt {
    private static final zzasx zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhhb zzb;
    private zzhhb zzc;
    private zzhhb zzd;
    private zzhhb zze;

    static {
        zzasx zzasxVar = new zzasx();
        zzf = zzasxVar;
        zzhih.zzbu(zzasx.class, zzasxVar);
    }

    private zzasx() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzb = zzhhbVar;
        this.zzc = zzhhbVar;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
    }

    public static zzasx zze(byte[] bArr, zzhhr zzhhrVar) {
        return (zzasx) zzhih.zzbV(zzf, bArr, zzhhrVar);
    }

    public static zzasw zzg() {
        return (zzasw) zzf.zzbn();
    }

    public final zzhhb zza() {
        return this.zzb;
    }

    public final zzhhb zzb() {
        return this.zzc;
    }

    public final zzhhb zzc() {
        return this.zzd;
    }

    public final zzhhb zzd() {
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
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzasx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzasw(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzg;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzasx.class) {
            try {
                zzhicVar = zzg;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzf);
                    zzg = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        this.zza |= 1;
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzi(zzhhb zzhhbVar) {
        this.zza |= 2;
        this.zzc = zzhhbVar;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        this.zza |= 4;
        this.zzd = zzhhbVar;
    }

    final /* synthetic */ void zzk(zzhhb zzhhbVar) {
        this.zza |= 8;
        this.zze = zzhhbVar;
    }
}
