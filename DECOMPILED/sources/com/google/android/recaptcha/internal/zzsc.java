package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsc extends zznd implements zzoj {
    private static final zzsc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zznj zzl = zznd.zzA();
    private zzle zzm = zzle.zzb;
    private String zzn = "";
    private zzse zzo;
    private zzsa zzp;

    static {
        zzsc zzscVar = new zzsc();
        zzb = zzscVar;
        zznd.zzI(zzsc.class, zzscVar);
    }

    private zzsc() {
    }

    public static zzsc zzi() {
        return zzb;
    }

    public final String zzM() {
        return this.zzh;
    }

    public final String zzN() {
        return this.zzj;
    }

    public final String zzO() {
        return this.zzk;
    }

    public final List zzP() {
        return this.zzl;
    }

    public final boolean zzQ() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzR() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzS() {
        return (this.zze & 256) != 0;
    }

    public final boolean zzT() {
        return (this.zze & 64) != 0;
    }

    public final zzle zzf() {
        return this.zzm;
    }

    @Override // com.google.android.recaptcha.internal.zznd
    protected final Object zzh(int i7, Object obj, Object obj2) {
        zzoq zzmyVar;
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\tለ\u0007\u000bဉ\b\fဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i8 == 3) {
            return new zzsc();
        }
        zzsn zzsnVar = null;
        if (i8 == 4) {
            return new zzsb(zzsnVar);
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
        synchronized (zzsc.class) {
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

    public final zzse zzj() {
        zzse zzseVar = this.zzo;
        return zzseVar == null ? zzse.zzk() : zzseVar;
    }

    public final String zzk() {
        return this.zzg;
    }

    public final String zzl() {
        return this.zzi;
    }
}
