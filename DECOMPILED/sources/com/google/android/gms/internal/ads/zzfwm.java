package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwm extends zzhih implements zzhjt {
    private static final zzfwm zze;
    private static volatile zzhka zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        zzfwm zzfwmVar = new zzfwm();
        zze = zzfwmVar;
        zzhih.zzbu(zzfwm.class, zzfwmVar);
    }

    private zzfwm() {
    }

    public static zzfwl zzc() {
        return (zzfwl) zze.zzbn();
    }

    public static zzfwm zzd() {
        return zze;
    }

    public final zzaxw zza() {
        return this.zzb == 1 ? (zzaxw) this.zzc : zzaxw.zzj();
    }

    public final zzaxq zzb() {
        zzaxq zzaxqVarZzb = zzaxq.zzb(this.zzd);
        return zzaxqVarZzb == null ? zzaxq.UNSUPPORTED : zzaxqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", zzaxw.class, zzaxu.class, "zzd", zzaxq.zzc()});
        }
        if (iOrdinal == 3) {
            return new zzfwm();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfwl(bArr);
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
        synchronized (zzfwm.class) {
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

    final /* synthetic */ void zze(zzaxw zzaxwVar) {
        zzaxwVar.getClass();
        this.zzc = zzaxwVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzg(zzaxq zzaxqVar) {
        this.zzd = zzaxqVar.zza();
        this.zza |= 1;
    }
}
