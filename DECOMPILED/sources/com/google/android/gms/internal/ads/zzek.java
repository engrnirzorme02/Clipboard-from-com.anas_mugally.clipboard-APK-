package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzek {
    private long[] zza;
    private Object[] zzb;
    private int zzc;
    private int zzd;

    public zzek() {
        throw null;
    }

    private final Object zzf() {
        zzghc.zzh(this.zzd > 0);
        Object[] objArr = this.zzb;
        int i7 = this.zzc;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.zzc = (i7 + 1) % objArr.length;
        this.zzd--;
        return obj;
    }

    public final synchronized void zza(long j7, Object obj) {
        try {
            int i7 = this.zzd;
            if (i7 > 0) {
                if (j7 <= this.zza[((this.zzc + i7) - 1) % this.zzb.length]) {
                    zzb();
                }
            }
            int length = this.zzb.length;
            if (this.zzd >= length) {
                int i8 = length + length;
                long[] jArr = new long[i8];
                Object[] objArr = new Object[i8];
                int i9 = this.zzc;
                int i10 = length - i9;
                System.arraycopy(this.zza, i9, jArr, 0, i10);
                System.arraycopy(this.zzb, this.zzc, objArr, 0, i10);
                int i11 = this.zzc;
                if (i11 > 0) {
                    System.arraycopy(this.zza, 0, jArr, i10, i11);
                    System.arraycopy(this.zzb, 0, objArr, i10, this.zzc);
                }
                this.zza = jArr;
                this.zzb = objArr;
                this.zzc = 0;
            }
            int i12 = this.zzc;
            int i13 = this.zzd;
            Object[] objArr2 = this.zzb;
            int length2 = (i12 + i13) % objArr2.length;
            this.zza[length2] = j7;
            objArr2[length2] = obj;
            this.zzd = i13 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        Arrays.fill(this.zzb, (Object) null);
    }

    public final synchronized int zzc() {
        return this.zzd;
    }

    public final synchronized Object zzd() {
        if (this.zzd == 0) {
            return null;
        }
        return zzf();
    }

    public final synchronized Object zze(long j7) {
        Object objZzf;
        objZzf = null;
        while (this.zzd > 0 && j7 - this.zza[this.zzc] >= 0) {
            objZzf = zzf();
        }
        return objZzf;
    }

    public zzek(int i7) {
        this.zza = new long[10];
        this.zzb = new Object[10];
    }
}
