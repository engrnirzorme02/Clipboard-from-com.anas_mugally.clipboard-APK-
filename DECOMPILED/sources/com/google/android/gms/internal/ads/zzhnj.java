package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnj extends zzhih implements zzhjt {
    private static final zzhnj zzi;
    private static volatile zzhka zzj;
    private int zza;
    private zzhni zzb;
    private zzhhb zzd;
    private zzhhb zze;
    private int zzf;
    private zzhhb zzg;
    private byte zzh = 2;
    private zzhit zzc = zzhih.zzbM();

    static {
        zzhnj zzhnjVar = new zzhnj();
        zzi = zzhnjVar;
        zzhih.zzbu(zzhnj.class, zzhnjVar);
    }

    private zzhnj() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
        this.zzg = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        byte[] bArr = null;
        switch (zzhigVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhih.zzbv(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", zzhnb.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhnj();
            case NEW_BUILDER:
                return new zzhng(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                zzhka zzhkaVar = zzj;
                if (zzhkaVar != null) {
                    return zzhkaVar;
                }
                synchronized (zzhnj.class) {
                    try {
                        zzhicVar = zzj;
                        if (zzhicVar == null) {
                            zzhicVar = new zzhic(zzi);
                            zzj = zzhicVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return zzhicVar;
            default:
                throw null;
        }
    }
}
