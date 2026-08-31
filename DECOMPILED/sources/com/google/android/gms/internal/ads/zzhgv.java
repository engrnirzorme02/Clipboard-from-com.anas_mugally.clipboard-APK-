package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhgv extends zzhgz {
    private final int zzc;
    private final int zzd;

    zzhgv(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzhhb.zzA(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final byte zza(int i7) {
        zzhhb.zzz(i7, this.zzd);
        return ((zzhgz) this).zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    final byte zzb(int i7) {
        return ((zzhgz) this).zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz
    protected final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhgz, com.google.android.gms.internal.ads.zzhhb
    protected final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(((zzhgz) this).zza, this.zzc + i7, bArr, i8, i9);
    }
}
