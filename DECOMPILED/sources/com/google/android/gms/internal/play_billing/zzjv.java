package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjv extends zzfi implements zzgm {
    private static final zzjv zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzjv zzjvVar = new zzjv();
        zzb = zzjvVar;
        zzfi.zzw(zzjv.class, zzjvVar);
    }

    private zzjv() {
    }

    static /* synthetic */ void zzA(zzjv zzjvVar, boolean z7) {
        zzjvVar.zzd |= 8;
        zzjvVar.zzh = z7;
    }

    static /* synthetic */ void zzB(zzjv zzjvVar, int i7) {
        zzjvVar.zzd |= 16;
        zzjvVar.zzi = i7;
    }

    static /* synthetic */ void zzC(zzjv zzjvVar, long j7) {
        zzjvVar.zzd |= 4;
        zzjvVar.zzg = j7;
    }

    static /* synthetic */ void zzD(zzjv zzjvVar, boolean z7) {
        zzjvVar.zzd |= 2;
        zzjvVar.zzf = true;
    }

    public static zzjt zzc() {
        return (zzjt) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzjv();
        }
        zzju zzjuVar = null;
        if (i8 == 4) {
            return new zzjt(zzjuVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
