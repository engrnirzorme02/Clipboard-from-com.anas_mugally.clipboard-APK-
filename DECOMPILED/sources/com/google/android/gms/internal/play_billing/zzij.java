package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes2.dex */
public final class zzij extends zzfi implements zzgm {
    private static final zzij zzb;

    static {
        zzij zzijVar = new zzij();
        zzb = zzijVar;
        zzfi.zzw(zzij.class, zzijVar);
    }

    private zzij() {
    }

    public static zzij zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfi
    protected final Object zzb(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        zzii zziiVar = null;
        if (i8 == 2) {
            return zzfi.zzt(zzb, "\u0004\u0000", null);
        }
        if (i8 == 3) {
            return new zzij();
        }
        if (i8 == 4) {
            return new zzih(zziiVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
