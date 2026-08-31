package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C3424C;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbul extends zzaxz implements zzbun {
    zzbul(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, parcelFileDescriptor);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(C3424C c3424c) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3424c);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, parcelFileDescriptor);
        zzayb.zzc(parcelZza, zzbuvVar);
        zzdf(3, parcelZza);
    }
}
