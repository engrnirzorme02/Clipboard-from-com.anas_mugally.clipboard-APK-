package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbag extends zzaxz implements zzbai {
    zzbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zze(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzf() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzg() {
        zzdf(5, zza());
    }
}
