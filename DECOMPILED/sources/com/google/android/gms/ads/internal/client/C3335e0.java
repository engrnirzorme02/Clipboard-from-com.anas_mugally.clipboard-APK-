package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3335e0 extends zzaxz implements InterfaceC3339f0 {
    C3335e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3339f0
    /* JADX INFO: renamed from: F0 */
    public final void mo17224F0(C3296S1 c3296s1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3296s1);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3339f0
    /* JADX INFO: renamed from: X */
    public final void mo17225X(C3296S1 c3296s1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3296s1);
        zzdf(2, parcelZza);
    }
}
