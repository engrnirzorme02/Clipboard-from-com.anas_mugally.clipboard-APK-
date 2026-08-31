package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhdt extends zzhih implements zzhjt {
    private static final zzhdt zzd;
    private static volatile zzhka zze;
    private String zza = "";
    private zzhhb zzb = zzhhb.zzb;
    private int zzc;

    static {
        zzhdt zzhdtVar = new zzhdt();
        zzd = zzhdtVar;
        zzhih.zzbu(zzhdt.class, zzhdtVar);
    }

    private zzhdt() {
    }

    public static zzhdr zzd() {
        return (zzhdr) zzd.zzbn();
    }

    public static zzhdt zze() {
        return zzd;
    }

    public final String zza() {
        return this.zza;
    }

    public final zzhhb zzb() {
        return this.zzb;
    }

    public final zzhds zzc() {
        zzhds zzhdsVar;
        int i7 = this.zzc;
        if (i7 == 0) {
            zzhdsVar = zzhds.UNKNOWN_KEYMATERIAL;
        } else if (i7 == 1) {
            zzhdsVar = zzhds.SYMMETRIC;
        } else if (i7 == 2) {
            zzhdsVar = zzhds.ASYMMETRIC_PRIVATE;
        } else if (i7 != 3) {
            zzhdsVar = i7 != 4 ? null : zzhds.REMOTE;
        } else {
            zzhdsVar = zzhds.ASYMMETRIC_PUBLIC;
        }
        return zzhdsVar == null ? zzhds.UNRECOGNIZED : zzhdsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhdt();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdr(bArr);
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
        synchronized (zzhdt.class) {
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

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zza = str;
    }

    final /* synthetic */ void zzh(zzhhb zzhhbVar) {
        zzhhbVar.getClass();
        this.zzb = zzhhbVar;
    }

    final /* synthetic */ void zzi(zzhds zzhdsVar) {
        this.zzc = zzhdsVar.zza();
    }
}
