package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzip extends zzfi implements zzgm {
    private static final zzip zzb;
    private int zzd;
    private int zzf;
    private zzig zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private zzfm zzg = zzfi.zzq();
    private zzfn zzh = zzfi.zzr();

    static {
        zzip zzipVar = new zzip();
        zzb = zzipVar;
        zzfi.zzw(zzip.class, zzipVar);
    }

    private zzip() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", zzin.zza, "zzg", zzik.zza, "zzh", zzjl.class, "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new zzip();
        }
        zzio zzioVar = null;
        if (i8 == 4) {
            return new zzim(zzioVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
