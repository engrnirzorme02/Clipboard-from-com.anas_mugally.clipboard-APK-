package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfn extends zzmf implements zznn {
    private static final zzfn zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private zzfh zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfn zzfnVar = new zzfn();
        zzj = zzfnVar;
        zzmf.zzcp(zzfn.class, zzfnVar);
    }

    private zzfn() {
    }

    public static zzfm zzi() {
        return (zzfm) zzj.zzck();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zze;
    }

    public final zzfh zzd() {
        zzfh zzfhVar = this.zzf;
        return zzfhVar == null ? zzfh.zzi() : zzfhVar;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmf.zzcq(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzfn();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new zzfm(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }
}
