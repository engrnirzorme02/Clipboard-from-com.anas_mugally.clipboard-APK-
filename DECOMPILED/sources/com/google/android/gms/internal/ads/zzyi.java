package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzyi {
    private final int[] zza;
    private final zzwq[] zzb;
    private final int[] zzc;
    private final int[][][] zzd;
    private final zzwq zze;

    zzyi(String[] strArr, int[] iArr, zzwq[] zzwqVarArr, int[] iArr2, int[][][] iArr3, zzwq zzwqVar) {
        this.zza = iArr;
        this.zzb = zzwqVarArr;
        this.zzd = iArr3;
        this.zzc = iArr2;
        this.zze = zzwqVar;
    }

    public final int zza(int i7) {
        return this.zza[i7];
    }

    public final zzwq zzb(int i7) {
        return this.zzb[i7];
    }

    public final int zzc(int i7, int i8, int i9) {
        return this.zzd[i7][i8][i9];
    }

    public final int zzd(int i7, int i8, boolean z7) {
        zzwq[] zzwqVarArr = this.zzb;
        int i9 = zzwqVarArr[i7].zza(i8).zza;
        int[] iArr = new int[i9];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            if ((this.zzd[i7][i8][i12] & 7) == 4) {
                iArr[i11] = i12;
                i11++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
        String str = null;
        int i13 = 0;
        int iMin = 16;
        boolean z8 = false;
        while (i10 < iArrCopyOf.length) {
            String str2 = zzwqVarArr[i7].zza(i8).zza(iArrCopyOf[i10]).zzo;
            int i14 = i13 + 1;
            if (i13 == 0) {
                str = str2;
            } else {
                z8 |= !Objects.equals(str, str2);
            }
            iMin = Math.min(iMin, this.zzd[i7][i8][i10] & 24);
            i10++;
            i13 = i14;
        }
        return z8 ? Math.min(iMin, this.zzc[i7]) : iMin;
    }

    public final zzwq zze() {
        return this.zze;
    }
}
