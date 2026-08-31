package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzts extends zznd implements zzoj {
    private static final zzts zzb;
    private static volatile zzoq zzd;
    private int zze;

    static {
        zzts zztsVar = new zzts();
        zzb = zztsVar;
        zznd.zzI(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts zzg(byte[] bArr) {
        return (zzts) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        if (i8 == 3) {
            return new zzts();
        }
        zzug zzugVar = null;
        if (i8 == 4) {
            return new zztr(zzugVar);
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
        synchronized (zzts.class) {
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

    public final zztv zzi() {
        zztv zztvVarZzb = zztv.zzb(this.zze);
        return zztvVarZzb == null ? zztv.UNRECOGNIZED : zztvVarZzb;
    }
}
