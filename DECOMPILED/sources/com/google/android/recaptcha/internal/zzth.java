package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzth extends zznd implements zzoj {
    private static final zzth zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzth zzthVar = new zzth();
        zzb = zzthVar;
        zznd.zzI(zzth.class, zzthVar);
    }

    private zzth() {
    }

    static /* synthetic */ void zzM(zzth zzthVar, float f7) {
        zzthVar.zze = 9;
        zzthVar.zzf = Float.valueOf(f7);
    }

    static /* synthetic */ void zzN(zzth zzthVar, int i7) {
        zzthVar.zze = 4;
        zzthVar.zzf = Integer.valueOf(i7);
    }

    static /* synthetic */ void zzO(zzth zzthVar, int i7) {
        zzthVar.zze = 5;
        zzthVar.zzf = Integer.valueOf(i7);
    }

    static /* synthetic */ void zzP(zzth zzthVar, long j7) {
        zzthVar.zze = 7;
        zzthVar.zzf = Long.valueOf(j7);
    }

    static /* synthetic */ void zzQ(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 11;
        zzthVar.zzf = str;
    }

    public static zztg zzf() {
        return (zztg) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzth zzthVar, boolean z7) {
        zzthVar.zze = 1;
        zzthVar.zzf = Boolean.valueOf(z7);
    }

    static /* synthetic */ void zzj(zzth zzthVar, zzle zzleVar) {
        zzthVar.zze = 2;
        zzthVar.zzf = zzleVar;
    }

    static /* synthetic */ void zzk(zzth zzthVar, String str) {
        str.getClass();
        zzthVar.zze = 3;
        zzthVar.zzf = str;
    }

    static /* synthetic */ void zzl(zzth zzthVar, double d7) {
        zzthVar.zze = 10;
        zzthVar.zzf = Double.valueOf(d7);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        }
        if (i8 == 3) {
            return new zzth();
        }
        zztj zztjVar = null;
        if (i8 == 4) {
            return new zztg(zztjVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        if (i8 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzth.class) {
            try {
                zzmyVar = zzd;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzb);
                    zzd = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }
}
