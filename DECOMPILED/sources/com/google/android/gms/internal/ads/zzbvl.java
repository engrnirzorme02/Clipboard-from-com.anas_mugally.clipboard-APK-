package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvl extends zzaxz implements zzbvn {
    zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzf() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzg() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzh() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzi(zzbvh zzbvhVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbvhVar);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzj() {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzk(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final void zzl() {
        zzdf(8, zza());
    }
}
