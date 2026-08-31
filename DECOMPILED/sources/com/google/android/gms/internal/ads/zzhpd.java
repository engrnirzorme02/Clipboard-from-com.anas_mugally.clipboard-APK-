package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpd extends zzhih implements zzhjt {
    private static final zzhpd zzp;
    private static volatile zzhka zzu;
    private int zza;
    private boolean zzh;
    private double zzi;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzb = "";
    private String zzc = "";
    private int zzd = 4;
    private zzhit zze = zzhih.zzbM();
    private String zzf = "";
    private String zzg = "";
    private zzhit zzj = zzhih.zzbM();

    static {
        zzhpd zzhpdVar = new zzhpd();
        zzp = zzhpdVar;
        zzhih.zzbu(zzhpd.class, zzhpdVar);
    }

    private zzhpd() {
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzp, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zza", "zzb", "zzd", zzhpc.zza, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhpb.class, "zzc", "zzk", zzhoz.zza, "zzl", "zzm", "zzn", "zzo"});
        }
        if (iOrdinal == 3) {
            return new zzhpd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhoy(bArr);
        }
        if (iOrdinal == 5) {
            return zzp;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzu;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzhpd.class) {
            try {
                zzhicVar = zzu;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzp);
                    zzu = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
