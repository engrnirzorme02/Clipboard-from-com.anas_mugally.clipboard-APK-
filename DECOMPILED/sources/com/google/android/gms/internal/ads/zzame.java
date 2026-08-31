package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzame {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;

    public zzame(int i7) {
    }

    public final void zza() {
        this.zze = false;
        this.zza = 0;
        this.zzb = 0;
    }

    public final boolean zzb(int i7, int i8) {
        if (this.zze) {
            int i9 = this.zza - i8;
            this.zza = i9;
            if (this.zzb != 0 || i7 != 181) {
                this.zze = false;
                return true;
            }
            this.zzb = i9;
        } else if (i7 == 179) {
            this.zze = true;
        }
        zzc(zzd, 0, 3);
        return false;
    }

    public final void zzc(byte[] bArr, int i7, int i8) {
        if (this.zze) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i10 = this.zza + i9;
            if (length < i10) {
                this.zzc = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.zzc, this.zza, i9);
            this.zza += i9;
        }
    }
}
