package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmd extends zzaxz implements zzbmf {
    zzbmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblz zzblzVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzblzVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzf(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zzg(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }
}
