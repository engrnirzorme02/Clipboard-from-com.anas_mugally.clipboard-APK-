package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfwe extends zzhih implements zzhjt {
    private static final zzfwe zzd;
    private static volatile zzhka zze;
    private int zza;
    private zzhit zzb = zzhih.zzbM();
    private zzhlt zzc;

    static {
        zzfwe zzfweVar = new zzfwe();
        zzd = zzfweVar;
        zzhih.zzbu(zzfwe.class, zzfweVar);
    }

    private zzfwe() {
    }

    public static zzfwd zza() {
        return (zzfwd) zzd.zzbn();
    }

    final /* synthetic */ void zzb(zzfwc zzfwcVar) {
        zzfwcVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzfwcVar);
    }

    final /* synthetic */ void zzc(zzhlt zzhltVar) {
        zzhltVar.getClass();
        this.zzc = zzhltVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", zzfwc.class, "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzfwe();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfwd(bArr);
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
        synchronized (zzfwe.class) {
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
}
