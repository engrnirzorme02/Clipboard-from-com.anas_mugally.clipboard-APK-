package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfiw extends zzhih implements zzhjt {
    private static final zzfiw zzc;
    private static volatile zzhka zzd;
    private zzhit zza = zzhih.zzbM();
    private long zzb;

    static {
        zzfiw zzfiwVar = new zzfiw();
        zzc = zzfiwVar;
        zzhih.zzbu(zzfiw.class, zzfiwVar);
    }

    private zzfiw() {
    }

    public static zzfiv zza() {
        return (zzfiv) zzc.zzbn();
    }

    final /* synthetic */ void zzb(zzfhq zzfhqVar) {
        zzfhqVar.getClass();
        zzhit zzhitVar = this.zza;
        if (!zzhitVar.zza()) {
            this.zza = zzhih.zzbN(zzhitVar);
        }
        this.zza.add(zzfhqVar);
    }

    final /* synthetic */ void zzc(long j7) {
        this.zzb = j7;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", zzfhq.class, "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfiw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfiv(bArr);
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
        synchronized (zzfiw.class) {
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
