package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class zzwi {
    private final Random zza;
    private final int[] zzb;
    private final int[] zzc;

    public zzwi(int i7) {
        this(0, new Random());
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final int zzb(int i7) {
        int i8 = this.zzc[i7] + 1;
        int[] iArr = this.zzb;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int zzc(int i7) {
        int i8 = this.zzc[i7] - 1;
        if (i8 >= 0) {
            return this.zzb[i8];
        }
        return -1;
    }

    public final int zzd() {
        int[] iArr = this.zzb;
        int length = iArr.length;
        if (length > 0) {
            return iArr[length - 1];
        }
        return -1;
    }

    public final int zze() {
        int[] iArr = this.zzb;
        if (iArr.length > 0) {
            return iArr[0];
        }
        return -1;
    }

    public final zzwi zzf(int i7, int i8) {
        int[] iArr = new int[i8];
        int[] iArr2 = new int[i8];
        int i9 = 0;
        while (i9 < i8) {
            Random random = this.zza;
            iArr[i9] = random.nextInt(this.zzb.length + 1);
            int i10 = i9 + 1;
            int iNextInt = random.nextInt(i10);
            iArr2[i9] = iArr2[iNextInt];
            iArr2[iNextInt] = i9;
            i9 = i10;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.zzb;
        int[] iArr4 = new int[iArr3.length + i8];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr3.length + i8; i13++) {
            if (i11 >= i8 || i12 != iArr[i11]) {
                int i14 = i12 + 1;
                int i15 = iArr3[i12];
                iArr4[i13] = i15;
                if (i15 >= 0) {
                    iArr4[i13] = i15 + i8;
                }
                i12 = i14;
            } else {
                iArr4[i13] = iArr2[i11];
                i11++;
            }
        }
        return new zzwi(iArr4, new Random(this.zza.nextLong()));
    }

    public final zzwi zzg(int i7, int i8) {
        int[] iArr = this.zzb;
        int[] iArr2 = new int[iArr.length - i8];
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 < 0 || i11 >= i8) {
                int i12 = i10 - i9;
                if (i11 >= 0) {
                    i11 -= i8;
                }
                iArr2[i12] = i11;
            } else {
                i9++;
            }
        }
        return new zzwi(iArr2, new Random(this.zza.nextLong()));
    }

    public final zzwi zzh() {
        return new zzwi(0, new Random(this.zza.nextLong()));
    }

    private zzwi(int i7, Random random) {
        this(new int[0], random);
    }

    private zzwi(int[] iArr, Random random) {
        this.zzb = iArr;
        this.zza = random;
        this.zzc = new int[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            this.zzc[iArr[i7]] = i7;
        }
    }
}
