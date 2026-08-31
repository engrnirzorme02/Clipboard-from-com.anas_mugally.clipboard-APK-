package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbma extends zzaxz implements zzbmc {
    zzbma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzf(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(2, parcelZza);
    }
}
