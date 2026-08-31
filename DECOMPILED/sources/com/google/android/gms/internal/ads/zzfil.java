package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfil extends zzhih implements zzhjt {
    private static final zzfil zzb;
    private static volatile zzhka zzc;
    private zzhit zza = zzhih.zzbM();

    static {
        zzfil zzfilVar = new zzfil();
        zzb = zzfilVar;
        zzhih.zzbu(zzfil.class, zzfilVar);
    }

    private zzfil() {
    }

    public static zzfii zzb() {
        return (zzfii) zzb.zzbn();
    }

    public final int zza() {
        return this.zza.size();
    }

    final /* synthetic */ void zzc(zzfik zzfikVar) {
        zzfikVar.getClass();
        zzhit zzhitVar = this.zza;
        if (!zzhitVar.zza()) {
            this.zza = zzhih.zzbN(zzhitVar);
        }
        this.zza.add(zzfikVar);
    }

    final /* synthetic */ void zzd() {
        this.zza = zzhih.zzbM();
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", zzfik.class});
        }
        if (iOrdinal == 3) {
            return new zzfil();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfii(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzc;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfil.class) {
            try {
                zzhicVar = zzc;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzb);
                    zzc = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }
}
