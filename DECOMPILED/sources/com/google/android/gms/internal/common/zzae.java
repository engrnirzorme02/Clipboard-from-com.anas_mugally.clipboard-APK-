package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.C3553a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
class zzae extends zzaf {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    zzae(int i7) {
    }

    public final zzae zza(Object obj) {
        int i7;
        obj.getClass();
        int length = this.zza.length;
        int i8 = this.zzb;
        int i9 = i8 + 1;
        if (i9 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i9 <= length) {
            i7 = length;
        } else {
            i7 = (length >> 1) + length + 1;
            if (i7 < i9) {
                int iHighestOneBit = Integer.highestOneBit(i8);
                i7 = iHighestOneBit + iHighestOneBit;
            }
            if (i7 < 0) {
                i7 = C3553a.e.API_PRIORITY_OTHER;
            }
        }
        if (i7 > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, i7);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
