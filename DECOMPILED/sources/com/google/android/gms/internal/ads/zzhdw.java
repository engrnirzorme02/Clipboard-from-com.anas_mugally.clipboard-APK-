package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdw extends zzhih implements zzhjt {
    private static final zzhdw zzd;
    private static volatile zzhka zze;
    private String zza = "";
    private zzhhb zzb = zzhhb.zzb;
    private int zzc;

    static {
        zzhdw zzhdwVar = new zzhdw();
        zzd = zzhdwVar;
        zzhih.zzbu(zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
    }

    public static zzhdw zzd(byte[] bArr, zzhhr zzhhrVar) {
        return (zzhdw) zzhih.zzbV(zzd, bArr, zzhhrVar);
    }

    public static zzhdv zze() {
        return (zzhdv) zzd.zzbn();
    }

    public static zzhdv zzg(zzhdw zzhdwVar) {
        return (zzhdv) zzd.zzbo(zzhdwVar);
    }

    public static zzhdw zzh() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
        return this.zzb;
    }

    public final zzhep zzc() {
        zzhep zzhepVarZzb = zzhep.zzb(this.zzc);
        return zzhepVarZzb == null ? zzhep.UNRECOGNIZED : zzhepVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhdw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdv(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zze;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhdw.class) {
            try {
                zzhicVar = zze;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzd);
                    zze = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzj(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzk(zzhep zzhepVar) {
        this.zzc = zzhepVar.zza();
    }
}
