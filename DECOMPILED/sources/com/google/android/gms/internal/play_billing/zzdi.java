package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdi extends zzfi implements zzgm {
    private static final zzdi zzb;
    private int zzd;
    private zzdn zze;
    private zzdn zzf;
    private int zzg;

    static {
        zzdi zzdiVar = new zzdi();
        zzb = zzdiVar;
        zzfi.zzw(zzdi.class, zzdiVar);
    }

    private zzdi() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzdq.zza()});
        }
        if (i8 == 3) {
            return new zzdi();
        }
        zzdl zzdlVar = null;
        if (i8 == 4) {
            return new zzdh(zzdlVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
