package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzhfz implements zzhbw {
    final zzhbw zza;
    final zzhbw zzb;

    /* synthetic */ zzhfz(zzhbw zzhbwVar, zzhbw zzhbwVar2, byte[] bArr) {
        this.zza = zzhbwVar;
        this.zzb = zzhbwVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbw
    public final byte[] zza(byte[] bArr, int i7) {
        return bArr.length <= 64 ? this.zza.zza(bArr, i7) : this.zzb.zza(bArr, i7);
    }
}
