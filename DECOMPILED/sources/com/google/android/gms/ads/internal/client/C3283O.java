package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.O */
/* JADX INFO: loaded from: classes.dex */
public final class C3283O extends zzaxz implements InterfaceC3289Q {
    C3283O(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3289Q
    public final void zze(C3349h2 c3349h2) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        zzdf(1, parcelZza);
    }
}
