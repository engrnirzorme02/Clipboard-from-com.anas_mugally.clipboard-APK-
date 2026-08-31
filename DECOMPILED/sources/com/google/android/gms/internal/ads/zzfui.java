package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfui extends zzhih implements zzhjt {
    private static final zzfui zzx;
    private static volatile zzhka zzy;
    private int zza;
    private int zzb;
    private boolean zze;
    private zzfux zzf;
    private boolean zzg;
    private zzfuz zzj;
    private boolean zzv;
    private boolean zzw;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 200;
    private long zzl = 200;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;

    static {
        zzfui zzfuiVar = new zzfui();
        zzx = zzfuiVar;
        zzhih.zzbu(zzfui.class, zzfuiVar);
    }

    private zzfui() {
    }

    public static zzfuh zzs() {
        return (zzfuh) zzx.zzbn();
    }

    final /* synthetic */ void zzA(boolean z7) {
        this.zza |= 65536;
        this.zzv = z7;
    }

    public final int zzC() {
        int iZza = zzfuk.zza(this.zzb);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }

    final /* synthetic */ void zzD(int i7) {
        this.zzb = i7 - 1;
        this.zza |= 1;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final zzfux zzd() {
        zzfux zzfuxVar = this.zzf;
        return zzfuxVar == null ? zzfux.zzg() : zzfuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhih
    protected final Object zzdh(zzhig zzhigVar, Object obj, Object obj2) {
        zzhka zzhicVar;
        int iOrdinal = zzhigVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzhih.zzbv(zzx, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011", new Object[]{"zza", "zzb", zzfuj.zza, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw"});
        }
        if (iOrdinal == 3) {
            return new zzfui();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfuh(bArr);
        }
        if (iOrdinal == 5) {
            return zzx;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzhka zzhkaVar = zzy;
        if (zzhkaVar != null) {
            return zzhkaVar;
        }
        synchronized (zzfui.class) {
            try {
                zzhicVar = zzy;
                if (zzhicVar == null) {
                    zzhicVar = new zzhic(zzx);
                    zzy = zzhicVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzhicVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final long zzg() {
        return this.zzh;
    }

    public final long zzh() {
        return this.zzi;
    }

    public final zzfuz zzi() {
        zzfuz zzfuzVar = this.zzj;
        return zzfuzVar == null ? zzfuz.zzh() : zzfuzVar;
    }

    public final long zzj() {
        return this.zzk;
    }

    public final long zzk() {
        return this.zzl;
    }

    public final long zzl() {
        return this.zzm;
    }

    public final String zzm() {
        return this.zzn;
    }

    public final String zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzp;
    }

    public final long zzp() {
        return this.zzu;
    }

    public final boolean zzq() {
        return this.zzv;
    }

    public final boolean zzr() {
        return this.zzw;
    }

    final /* synthetic */ void zzt(boolean z7) {
        this.zza |= 2;
        this.zzc = z7;
    }

    final /* synthetic */ void zzu(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void zzv(zzfux zzfuxVar) {
        zzfuxVar.getClass();
        this.zzf = zzfuxVar;
        this.zza |= 16;
    }

    final /* synthetic */ void zzw(long j7) {
        this.zza |= 64;
        this.zzh = j7;
    }

    final /* synthetic */ void zzx(long j7) {
        this.zza |= 128;
        this.zzi = j7;
    }

    final /* synthetic */ void zzy(zzfuz zzfuzVar) {
        zzfuzVar.getClass();
        this.zzj = zzfuzVar;
        this.zza |= 256;
    }

    final /* synthetic */ void zzz(long j7) {
        this.zza |= 32768;
        this.zzu = j7;
    }
}
