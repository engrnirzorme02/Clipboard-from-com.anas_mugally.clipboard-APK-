package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwb extends zzaxz implements zzbwd {
    zzbwb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzf() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzg(zzbvx zzbvxVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbvxVar);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzh(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzi(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzj() {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwd
    public final void zzk() {
        zzdf(7, zza());
    }
}
