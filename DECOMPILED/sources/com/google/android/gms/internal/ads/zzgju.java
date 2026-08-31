package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.C3553a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgju {
    zzgju() {
    }

    static int zze(int i7, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i8 <= i7) {
            return i7;
        }
        int i9 = i7 + (i7 >> 1) + 1;
        if (i9 < i8) {
            int iHighestOneBit = Integer.highestOneBit(i8 - 1);
            i9 = iHighestOneBit + iHighestOneBit;
        }
        return i9 < 0 ? C3553a.e.API_PRIORITY_OTHER : i9;
    }

    public abstract zzgju zzd(Object obj);
}
