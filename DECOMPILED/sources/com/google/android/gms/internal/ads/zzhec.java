package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhec extends zzhih implements zzhjt {
    private static final zzhec zzc;
    private static volatile zzhka zzd;
    private int zza;
    private zzhit zzb = zzhih.zzbM();

    static {
        zzhec zzhecVar = new zzhec();
        zzc = zzhecVar;
        zzhih.zzbu(zzhec.class, zzhecVar);
    }

    private zzhec() {
    }

    public static zzhec zze(InputStream inputStream, zzhhr zzhhrVar) {
        return (zzhec) zzhih.zzbX(zzc, inputStream, zzhhrVar);
    }

    public static zzhdz zzg() {
        return (zzhdz) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzheb zzd(int i7) {
        return (zzheb) this.zzb.get(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzheb.class});
        }
        if (iOrdinal == 3) {
            return new zzhec();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdz(bArr);
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
        synchronized (zzhec.class) {
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

    final /* synthetic */ void zzh(int i7) {
        this.zza = i7;
    }

    final /* synthetic */ void zzi(zzheb zzhebVar) {
        zzhebVar.getClass();
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhebVar);
    }
}
