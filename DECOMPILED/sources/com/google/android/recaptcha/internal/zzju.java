package com.google.android.recaptcha.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i7 = bArr[0] & 255;
        int i8 = bArr[1] & 255;
        int i9 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i7 | (i8 << 8) | (i9 << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    final boolean zzc(zzjv zzjvVar) {
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z7 = true;
        int i7 = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i7 >= bArr.length) {
                return z7;
            }
            z7 &= bArr[i7] == zzjvVar.zze()[i7];
            i7++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    final byte[] zze() {
        return this.zza;
    }
}
