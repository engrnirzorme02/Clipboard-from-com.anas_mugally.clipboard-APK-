package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnc implements Serializable {
    private static final zzgnc zza = new zzgnc(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzgnc(int[] iArr, int i7, int i8) {
        this.zzb = iArr;
        this.zzc = i8;
    }

    public static zzgnc zza() {
        return zza;
    }

    public static zzgnc zzb(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzgnc(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgncVar = (zzgnc) obj;
        int i7 = this.zzc;
        if (i7 != zzgncVar.zzc) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (zzd(i8) != zzgncVar.zzd(i8)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i7]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i7 = this.zzc;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzc() {
        return this.zzc;
    }

    public final int zzd(int i7) {
        zzghc.zzm(i7, this.zzc, "index");
        return this.zzb[i7];
    }
}
