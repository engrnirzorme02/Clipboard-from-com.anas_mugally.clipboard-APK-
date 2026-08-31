package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.C3553a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbv {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzbu zzc;

    public final zzbv zza(Object obj, Object obj2) {
        int i7 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            if (i8 > length) {
                length = length + (length >> 1) + 1;
                if (length < i8) {
                    int iHighestOneBit = Integer.highestOneBit(i8 - 1);
                    length = iHighestOneBit + iHighestOneBit;
                }
                if (length < 0) {
                    length = C3553a.e.API_PRIORITY_OTHER;
                }
            }
            this.zza = Arrays.copyOf(objArr, length);
        }
        zzbo.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i9 = this.zzb;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.zzb = i9 + 1;
        return this;
    }

    public final zzbw zzb() {
        zzbu zzbuVar = this.zzc;
        if (zzbuVar != null) {
            throw zzbuVar.zza();
        }
        zzcf zzcfVarZzg = zzcf.zzg(this.zzb, this.zza, this);
        zzbu zzbuVar2 = this.zzc;
        if (zzbuVar2 == null) {
            return zzcfVarZzg;
        }
        throw zzbuVar2.zza();
    }
}
