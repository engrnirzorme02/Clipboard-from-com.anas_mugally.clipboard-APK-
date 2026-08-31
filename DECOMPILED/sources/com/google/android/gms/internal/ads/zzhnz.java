package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnz extends zzhih implements zzhjt {
    private static final zzhnz zzf;
    private static volatile zzhka zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private zzhhb zzd;
    private zzhhb zze;

    static {
        zzhnz zzhnzVar = new zzhnz();
        zzf = zzhnzVar;
        zzhih.zzbu(zzhnz.class, zzhnzVar);
    }

    private zzhnz() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
    }

    public static zzhnx zzc() {
        return (zzhnx) zzf.zzbn();
    }

    final /* synthetic */ void zzd(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", zzhny.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhnz();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhnx(bArr);
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
        synchronized (zzhnz.class) {
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

    final /* synthetic */ void zze(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zza |= 4;
        this.zzd = zzhhbVar;
    }

    final /* synthetic */ void zzh(int i7) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }
}
