package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeg {
    public static final zzeg zza = new zzeg(-1, -1);
    private final int zzb;
    private final int zzc;

    static {
        new zzeg(0, 0);
    }

    public zzeg(int i7, int i8) {
        boolean z7 = false;
        if ((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0)) {
            z7 = true;
        }
        zzghc.zza(z7);
        this.zzb = i7;
        this.zzc = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeg) {
            zzeg zzegVar = (zzeg) obj;
            if (this.zzb == zzegVar.zzb && this.zzc == zzegVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.zzc;
    }

    public final String toString() {
        int i7 = this.zzb;
        int length = String.valueOf(i7).length();
        int i8 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(i8).length());
        sb.append(i7);
        sb.append("x");
        sb.append(i8);
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc;
    }
}
