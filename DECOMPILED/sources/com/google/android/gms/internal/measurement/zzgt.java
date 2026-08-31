package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgt extends zzmf implements zznn {
    private static final zzgt zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzgt zzgtVar = new zzgt();
        zzf = zzgtVar;
        zzmf.zzcp(zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmf
    protected final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmf.zzcq(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i8 == 3) {
            return new zzgt();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new zzgs(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }
}
