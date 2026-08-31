package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes2.dex */
final class zzgr extends zzgu {
    private final int zzc;
    private final int zzd;

    zzgr(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzgx.zzj(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final byte zza(int i7) {
        int i8 = this.zzd;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return this.zza[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    final byte zzb(int i7) {
        return this.zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.fido.zzgu
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzgu, com.google.android.gms.internal.fido.zzgx
    protected final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zza, this.zzc, bArr, 0, i9);
    }
}
