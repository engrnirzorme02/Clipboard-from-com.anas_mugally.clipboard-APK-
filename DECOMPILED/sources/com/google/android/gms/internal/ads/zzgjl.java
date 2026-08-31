package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjl {
    static Object zza(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            if (i7 <= 256) {
                return new byte[i7];
            }
            return i7 <= 65536 ? new short[i7] : new int[i7];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 41);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i7);
        throw new IllegalArgumentException(sb.toString());
    }

    static int zzb(Object obj, int i7) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i7] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i7] : ((int[]) obj)[i7];
    }

    static void zzc(Object obj, int i7, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    static int zzd(int i7) {
        return (i7 < 32 ? 4 : 2) * (i7 + 1);
    }

    static int zze(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iZzb = zzgjs.zzb(obj);
        int i8 = iZzb & i7;
        int iZzb2 = zzb(obj3, i8);
        if (iZzb2 != 0) {
            int i9 = ~i7;
            int i10 = iZzb & i9;
            int i11 = -1;
            while (true) {
                int i12 = iZzb2 - 1;
                int i13 = iArr[i12];
                int i14 = i13 & i7;
                if ((i13 & i9) != i10 || !Objects.equals(obj, objArr[i12]) || (objArr2 != null && !Objects.equals(obj2, objArr2[i12]))) {
                    if (i14 == 0) {
                        break;
                    }
                    i11 = i12;
                    iZzb2 = i14;
                } else {
                    if (i11 == -1) {
                        zzc(obj3, i8, i14);
                        return i12;
                    }
                    iArr[i11] = (iArr[i11] & i9) | (i14 & i7);
                    return i12;
                }
            }
        }
        return -1;
    }
}
