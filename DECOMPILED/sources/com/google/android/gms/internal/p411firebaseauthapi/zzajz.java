package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzajz extends zzakg {
    private final int zzc;
    private final int zzd;

    zzajz(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzajv.zza(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakg, com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public final byte zza(int i7) {
        int iZzb = zzb();
        if (((iZzb - (i7 + 1)) | i7) >= 0) {
            return this.zzb[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + iZzb);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakg, com.google.android.gms.internal.p411firebaseauthapi.zzajv
    final byte zzb(int i7) {
        return this.zzb[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakg
    protected final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakg, com.google.android.gms.internal.p411firebaseauthapi.zzajv
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzakg, com.google.android.gms.internal.p411firebaseauthapi.zzajv
    protected final void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i9);
    }
}
