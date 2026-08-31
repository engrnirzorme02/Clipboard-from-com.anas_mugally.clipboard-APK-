package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfrv extends zzhih implements zzhjt {
    private static final zzfrv zzn;
    private static volatile zzhka zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zzhis zzk = zzhih.zzbE();
    private zzhis zzl = zzhih.zzbE();
    private zzhis zzm = zzhih.zzbE();

    static {
        zzfrv zzfrvVar = new zzfrv();
        zzn = zzfrvVar;
        zzhih.zzbu(zzfrv.class, zzfrvVar);
    }

    private zzfrv() {
    }

    public static zzfrv zzp() {
        return zzn;
    }

    final /* synthetic */ void zzA(long j7) {
        zzhis zzhisVar = this.zzl;
        if (!zzhisVar.zza()) {
            this.zzl = zzhih.zzbF(zzhisVar);
        }
        this.zzl.zzd(j7);
    }

    final /* synthetic */ void zzB(long j7) {
        zzhis zzhisVar = this.zzm;
        if (!zzhisVar.zza()) {
            this.zzm = zzhih.zzbF(zzhisVar);
        }
        this.zzm.zzd(j7);
    }

    final /* synthetic */ void zzC() {
        this.zzm = zzhih.zzbE();
    }

    public final String zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final boolean zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (iOrdinal == 3) {
            return new zzfrv();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfru(bArr);
        }
        if (iOrdinal == 5) {
            return zzn;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzo;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfrv.class) {
            try {
                zzhicVar = zzo;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzn);
                    zzo = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzg;
    }

    public final long zzh() {
        return this.zzh;
    }

    public final long zzi() {
        return this.zzi;
    }

    public final boolean zzj() {
        return (this.zza & 64) != 0;
    }

    public final List zzk() {
        return this.zzk;
    }

    public final int zzl() {
        return this.zzk.size();
    }

    public final int zzm() {
        return this.zzl.size();
    }

    public final List zzn() {
        return this.zzm;
    }

    public final int zzo() {
        return this.zzm.size();
    }

    final /* synthetic */ void zzq(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void zzr(long j7) {
        this.zza |= 1;
        this.zzc = j7;
    }

    final /* synthetic */ void zzs(int i7) {
        this.zza |= 2;
        this.zzd = i7;
    }

    final /* synthetic */ void zzt(boolean z7) {
        this.zza |= 4;
        this.zze = true;
    }

    final /* synthetic */ void zzu(boolean z7) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void zzv(long j7) {
        this.zza |= 16;
        this.zzg = j7;
    }

    final /* synthetic */ void zzw(long j7) {
        this.zzh = j7;
    }

    final /* synthetic */ void zzx(long j7) {
        this.zza |= 32;
        this.zzi = j7;
    }

    final /* synthetic */ void zzy(long j7) {
        this.zza |= 64;
        this.zzj = j7;
    }

    final /* synthetic */ void zzz(long j7) {
        zzhis zzhisVar = this.zzk;
        if (!zzhisVar.zza()) {
            this.zzk = zzhih.zzbF(zzhisVar);
        }
        this.zzk.zzd(j7);
    }
}
