package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzma extends zzna implements zzoj {
    private static final zzma zzd;
    private static volatile zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzma zzmaVar = new zzma();
        zzd = zzmaVar;
        zznd.zzI(zzma.class, zzmaVar);
    }

    private zzma() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i8 == 2) {
            return new zzou(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzlv.zza, "zzh", zzlu.zza, "zzi", zzly.zza, "zzj", zzlz.zza, "zzk", zzlx.zza, "zzl", zzlw.zza});
        }
        if (i8 == 3) {
            return new zzma();
        }
        zzmh zzmhVar = null;
        if (i8 == 4) {
            return new zzlt(zzmhVar);
        }
        if (i8 == 5) {
            return zzd;
        }
        if (i8 != 6) {
            this.zzm = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzoq zzoqVar = zze;
        if (zzoqVar != null) {
            return zzoqVar;
        }
        synchronized (zzma.class) {
            try {
                zzmyVar = zze;
                if (zzmyVar == null) {
                    zzmyVar = new zzmy(zzd);
                    zze = zzmyVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzmyVar;
    }
}
