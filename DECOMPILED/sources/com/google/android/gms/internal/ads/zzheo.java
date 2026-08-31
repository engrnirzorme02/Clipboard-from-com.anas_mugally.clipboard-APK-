package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzheo extends zzhih implements zzhjt {
    private static final zzheo zzd;
    private static volatile zzhka zze;
    private int zza;
    private String zzb = "";
    private zzhdw zzc;

    static {
        zzheo zzheoVar = new zzheo();
        zzd = zzheoVar;
        zzhih.zzbu(zzheo.class, zzheoVar);
    }

    private zzheo() {
    }

    public static zzheo zzc(zzhhb zzhhbVar, zzhhr zzhhrVar) {
        return (zzheo) zzhih.zzbT(zzd, zzhhbVar, zzhhrVar);
    }

    public static zzhen zzd() {
        return (zzhen) zzd.zzbn();
    }

    public static zzheo zze() {
        return zzd;
    }

    public final String zza() {
        return this.zzb;
    }

    public final zzhdw zzb() {
        zzhdw zzhdwVar = this.zzc;
        return zzhdwVar == null ? zzhdw.zzh() : zzhdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzheo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhen(bArr);
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
        synchronized (zzheo.class) {
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

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzh(zzhdw zzhdwVar) {
        zzhdwVar.getClass();
        this.zzc = zzhdwVar;
        this.zza |= 1;
    }
}
