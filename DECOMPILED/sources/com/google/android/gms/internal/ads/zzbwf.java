package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbwf extends zzaxz implements zzbwh {
    zzbwf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }
}
