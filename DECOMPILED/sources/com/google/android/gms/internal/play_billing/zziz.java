package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zziz extends zzfi implements zzgm {
    private static final zziz zzb;
    private int zzd;
    private int zze;

    static {
        zziz zzizVar = new zziz();
        zzb = zzizVar;
        zzfi.zzw(zziz.class, zzizVar);
    }

    private zziz() {
    }

    static /* synthetic */ void zzA(zziz zzizVar, int i7) {
        zzizVar.zze = i7 - 1;
        zzizVar.zzd |= 1;
    }

    public static zziw zzc() {
        return (zziw) zzb.zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzix.zza});
        }
        if (i8 == 3) {
            return new zziz();
        }
        zziy zziyVar = null;
        if (i8 == 4) {
            return new zziw(zziyVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
