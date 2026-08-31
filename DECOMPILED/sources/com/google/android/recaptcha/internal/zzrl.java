package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrl extends zznd implements zzoj {
    private static final zzrl zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzml zzf;
    private zzpj zzg;
    private zzml zzh;
    private zzpj zzi;

    static {
        zzrl zzrlVar = new zzrl();
        zzb = zzrlVar;
        zznd.zzI(zzrl.class, zzrlVar);
    }

    private zzrl() {
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzrl zzrlVar, zzpj zzpjVar) {
        zzpjVar.getClass();
        zzrlVar.zzi = zzpjVar;
        zzrlVar.zze |= 8;
    }

    static /* synthetic */ void zzj(zzrl zzrlVar, zzml zzmlVar) {
        zzmlVar.getClass();
        zzrlVar.zzh = zzmlVar;
        zzrlVar.zze |= 4;
    }

    static /* synthetic */ void zzk(zzrl zzrlVar, zzpj zzpjVar) {
        zzpjVar.getClass();
        zzrlVar.zzg = zzpjVar;
        zzrlVar.zze |= 2;
    }

    static /* synthetic */ void zzl(zzrl zzrlVar, zzml zzmlVar) {
        zzmlVar.getClass();
        zzrlVar.zzf = zzmlVar;
        zzrlVar.zze |= 1;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzrl();
        }
        zzrk zzrkVar = null;
        if (i8 == 4) {
            return new zzrj(zzrkVar);
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
        synchronized (zzrl.class) {
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
