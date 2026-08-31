package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqw extends zznd implements zzoj {
    private static final zzqw zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqw zzqwVar = new zzqw();
        zzb = zzqwVar;
        zznd.zzI(zzqw.class, zzqwVar);
    }

    private zzqw() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzqw();
        }
        zzqv zzqvVar = null;
        if (i8 == 4) {
            return new zzqu(zzqvVar);
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
        synchronized (zzqw.class) {
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
