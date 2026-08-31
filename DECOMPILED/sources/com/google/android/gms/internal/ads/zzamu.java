package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamu {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzamu(int i7, int i8) {
        this.zzc = i7;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i7) {
        zzghc.zzh(!this.zzd);
        boolean z7 = i7 == this.zzc;
        this.zzd = z7;
        if (z7) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i7, int i8) {
        if (this.zzd) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i10 = this.zzb + i9;
            if (length < i10) {
                this.zza = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.zza, this.zzb, i9);
            this.zzb += i9;
        }
    }

    public final boolean zze(int i7) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i7;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
