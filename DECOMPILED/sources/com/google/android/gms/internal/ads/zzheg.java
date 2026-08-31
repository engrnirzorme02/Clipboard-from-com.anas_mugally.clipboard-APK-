package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzheg extends zzhih implements zzhjt {
    private static final zzheg zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhit zzb = zzhih.zzbM();

    static {
        zzheg zzhegVar = new zzheg();
        zzc = zzhegVar;
        zzhih.zzbu(zzheg.class, zzhegVar);
    }

    private zzheg() {
    }

    public static zzhed zza() {
        return (zzhed) zzc.zzbn();
    }

    final /* synthetic */ void zzb(int i7) {
        this.zza = i7;
    }

    final /* synthetic */ void zzc(zzhef zzhefVar) {
        zzhefVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhefVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhef.class});
        }
        if (iOrdinal == 3) {
            return new zzheg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhed(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzd;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzheg.class) {
            try {
                zzhicVar = zzd;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzc);
                    zzd = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
