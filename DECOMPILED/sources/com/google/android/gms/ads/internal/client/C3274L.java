package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3274L extends zzaxz implements InterfaceC3280N {
    C3274L(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzb() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3280N
    public final void zzc(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(2, parcelZza);
    }
}
