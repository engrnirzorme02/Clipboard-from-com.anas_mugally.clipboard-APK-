package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public enum zzaxq implements zzhil {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    private final int zzh;

    zzaxq(int i7) {
        this.zzh = i7;
    }

    public static zzaxq zzb(int i7) {
        if (i7 == 0) {
            return UNSUPPORTED;
        }
        if (i7 == 2) {
            return ARM7;
        }
        if (i7 == 999) {
            return UNKNOWN;
        }
        if (i7 == 4) {
            return X86;
        }
        if (i7 == 5) {
            return ARM64;
        }
        if (i7 == 6) {
            return X86_64;
        }
        if (i7 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static zzhin zzc() {
        return zzaxp.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzhil
    public final int zza() {
        return this.zzh;
    }
}
