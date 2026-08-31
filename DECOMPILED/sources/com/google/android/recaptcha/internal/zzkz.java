package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzkz extends zzlc {
    private final int zzc;

    zzkz(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzle.zzi(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return ((zzlc) this).zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    final byte zzb(int i7) {
        return ((zzlc) this).zza[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzlc
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzlc, com.google.android.recaptcha.internal.zzle
    protected final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(((zzlc) this).zza, 0, bArr, 0, i9);
    }
}
