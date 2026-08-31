package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatk extends zzhih implements zzhjt {
    private static final zzatk zzf;
    private static volatile zzhka zzg;
    private int zza;
    private zzhit zzb = zzhih.zzbM();
    private zzhhb zzc = zzhhb.zzb;
    private int zzd = 1;
    private int zze = 1;

    static {
        zzatk zzatkVar = new zzatk();
        zzf = zzatkVar;
        zzhih.zzbu(zzatk.class, zzatkVar);
    }

    private zzatk() {
    }

    public static zzatj zza() {
        return (zzatj) zzf.zzbn();
    }

    final /* synthetic */ void zzb(zzhhb zzhhbVar) {
        zzhit zzhitVar = this.zzb;
        if (!zzhitVar.zza()) {
            this.zzb = zzhih.zzbN(zzhitVar);
        }
        this.zzb.add(zzhhbVar);
    }

    final /* synthetic */ void zzc(zzhhb zzhhbVar) {
        this.zza |= 1;
        this.zzc = zzhhbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", zzate.zza, "zze", zzata.zza});
        }
        if (iOrdinal == 3) {
            return new zzatk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzatj(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzg;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzatk.class) {
            try {
                zzhicVar = zzg;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzf);
                    zzg = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    final /* synthetic */ void zze(int i7) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void zzg(int i7) {
        this.zze = i7 - 1;
        this.zza |= 4;
    }
}
