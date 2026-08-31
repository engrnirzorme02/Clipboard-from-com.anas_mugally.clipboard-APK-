package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbac extends zzaxz implements zzbae {
    zzbac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzb(zzbab zzbabVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbabVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzc(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbae
    public final void zzd(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }
}
