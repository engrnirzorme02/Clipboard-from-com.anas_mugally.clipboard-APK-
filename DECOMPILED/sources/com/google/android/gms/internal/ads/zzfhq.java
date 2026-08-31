package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhq extends zzhih implements zzhjt {
    private static final zzfhq zzc;
    private static volatile zzhka zzd;
    private int zza;
    private long zzb;

    static {
        zzfhq zzfhqVar = new zzfhq();
        zzc = zzfhqVar;
        zzhih.zzbu(zzfhq.class, zzfhqVar);
    }

    private zzfhq() {
    }

    public static zzfhp zza() {
        return (zzfhp) zzc.zzbn();
    }

    final /* synthetic */ void zzb(long j7) {
        this.zzb = j7;
    }

    final /* synthetic */ void zzd(int i7) {
        this.zza = i7 - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfhq();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfhp(bArr);
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
        synchronized (zzfhq.class) {
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
