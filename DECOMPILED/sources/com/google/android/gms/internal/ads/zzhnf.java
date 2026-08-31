package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhnf extends zzhih implements zzhjt {
    private static final zzhnf zzh;
    private static volatile zzhka zzi;
    private int zza;
    private zzhne zzb;
    private zzhhb zzd;
    private zzhhb zze;
    private int zzf;
    private byte zzg = 2;
    private zzhit zzc = zzhih.zzbM();

    static {
        zzhnf zzhnfVar = new zzhnf();
        zzh = zzhnfVar;
        zzhih.zzbu(zzhnf.class, zzhnfVar);
    }

    private zzhnf() {
        zzhhb zzhhbVar = zzhhb.zzb;
        this.zzd = zzhhbVar;
        this.zze = zzhhbVar;
    }

    public static zzhnc zzc() {
        return (zzhnc) zzh.zzbn();
    }

    final /* synthetic */ void zzd(zzhnb zzhnbVar) {
        zzhnbVar.getClass();
        zzhit zzhitVar = this.zzc;
        if (!zzhitVar.zza()) {
            this.zzc = zzhih.zzbN(zzhitVar);
        }
        this.zzc.add(zzhnbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        byte[] bArr = null;
        switch (zzhigVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzhih.zzbv(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", zzhnb.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhnf();
            case NEW_BUILDER:
                return new zzhnc(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                zzhka zzhkaVar = zzi;
                if (zzhkaVar != null) {
                    return zzhkaVar;
                }
                synchronized (zzhnf.class) {
                    try {
                        zzhicVar = zzi;
                        if (zzhicVar == null) {
                            zzhicVar = new zzhic(zzh);
                            zzi = zzhicVar;
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
