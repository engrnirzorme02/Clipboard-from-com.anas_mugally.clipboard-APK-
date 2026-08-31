package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdt {
    private int zza;
    private long[] zzb;

    public zzdt() {
        throw null;
    }

    public final void zza(long j7) {
        int i7 = this.zza;
        long[] jArr = this.zzb;
        if (i7 == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i7 + i7);
        }
        long[] jArr2 = this.zzb;
        int i8 = this.zza;
        this.zza = i8 + 1;
        jArr2[i8] = j7;
    }

    public final void zzb(long[] jArr) {
        int i7 = this.zza;
        int length = jArr.length;
        int i8 = i7 + length;
        long[] jArr2 = this.zzb;
        int length2 = jArr2.length;
        if (i8 > length2) {
            this.zzb = Arrays.copyOf(jArr2, Math.max(length2 + length2, i8));
        }
        System.arraycopy(jArr, 0, this.zzb, this.zza, length);
        this.zza = i8;
    }

    public final long zzc(int i7) {
        if (i7 >= 0 && i7 < this.zza) {
            return this.zzb[i7];
        }
        int i8 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 24 + String.valueOf(i8).length());
        sb.append("Invalid index ");
        sb.append(i7);
        sb.append(", size is ");
        sb.append(i8);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final int zzd() {
        return this.zza;
    }

    public zzdt(int i7) {
        this.zzb = new long[i7];
    }
}
