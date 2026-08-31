package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzaac implements zzsq {
    private final zzsq zza;
    private final zzsq zzb;

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzsq
    public final byte[] zza(byte[] bArr, int i7) {
        return bArr.length <= 64 ? this.zza.zza(bArr, i7) : this.zzb.zza(bArr, i7);
    }

    private zzaac(zzsq zzsqVar, zzsq zzsqVar2) {
        this.zza = zzsqVar;
        this.zzb = zzsqVar2;
    }
}
