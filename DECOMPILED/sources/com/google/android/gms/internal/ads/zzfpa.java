package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpa extends zzhih implements zzhjt {
    private static final zzfpa zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhip zzb = zzhih.zzbC();
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        zzfpa zzfpaVar = new zzfpa();
        zzf = zzfpaVar;
        zzhih.zzbu(zzfpa.class, zzfpaVar);
    }

    private zzfpa() {
    }

    public static zzfoz zza() {
        return (zzfoz) zzf.zzbn();
    }

    final /* synthetic */ void zzb(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    final /* synthetic */ void zzd(int i7) {
        zzhip zzhipVar = this.zzb;
        if (!zzhipVar.zza()) {
            this.zzb = zzhih.zzbD(zzhipVar);
        }
        this.zzb.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", zzfoy.zza, "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzfpa();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfoz(bArr);
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
        synchronized (zzfpa.class) {
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
}
