package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsg extends zznd implements zzoj {
    private static final zzsg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsg zzsgVar = new zzsg();
        zzb = zzsgVar;
        zznd.zzI(zzsg.class, zzsgVar);
    }

    private zzsg() {
    }

    public static zzsf zzf() {
        return (zzsf) zzb.zzq();
    }

    static /* synthetic */ void zzi(zzsg zzsgVar, String str) {
        zzsgVar.zze |= 1;
        zzsgVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzsg();
        }
        zzsn zzsnVar = null;
        if (i8 == 4) {
            return new zzsf(zzsnVar);
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
        synchronized (zzsg.class) {
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
