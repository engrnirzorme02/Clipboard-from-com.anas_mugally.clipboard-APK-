package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdu {
    private int zza;
    private int zzb;
    private int zzc;
    private long[] zzd;
    private int zze;

    public zzdu() {
        throw null;
    }

    public final void zza(long j7) {
        int i7 = this.zzc;
        long[] jArr = this.zzd;
        int length = jArr.length;
        if (i7 == length) {
            int i8 = length + length;
            if (i8 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[i8];
            int i9 = this.zza;
            int i10 = length - i9;
            System.arraycopy(jArr, i9, jArr2, 0, i10);
            System.arraycopy(this.zzd, 0, jArr2, i10, i9);
            this.zza = 0;
            this.zzb = this.zzc - 1;
            this.zzd = jArr2;
            this.zze = jArr2.length - 1;
            jArr = jArr2;
        }
        int i11 = (this.zzb + 1) & this.zze;
        this.zzb = i11;
        jArr[i11] = j7;
        this.zzc++;
    }

    public final long zzb() {
        int i7 = this.zzc;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.zzd;
        int i8 = this.zza;
        long j7 = jArr[i8];
        this.zza = this.zze & (i8 + 1);
        this.zzc = i7 - 1;
        return j7;
    }

    public final long zzc() {
        if (this.zzc != 0) {
            return this.zzd[this.zza];
        }
        throw new NoSuchElementException();
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }

    public final void zze() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public zzdu(int i7) {
        int i8 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i8 = iHighestOneBit + iHighestOneBit;
        }
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
        long[] jArr = new long[i8];
        this.zzd = jArr;
        this.zze = jArr.length - 1;
    }
}
