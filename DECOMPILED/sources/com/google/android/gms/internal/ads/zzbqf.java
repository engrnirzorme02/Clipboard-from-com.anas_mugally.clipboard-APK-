package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqf extends zzaxz implements zzbqh {
    zzbqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zze() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zzg(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(4, parcelZza);
    }
}
