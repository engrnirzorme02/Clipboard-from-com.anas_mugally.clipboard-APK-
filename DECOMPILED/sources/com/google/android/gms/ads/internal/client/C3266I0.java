package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3266I0 extends zzaxz implements InterfaceC3272K0 {
    C3266I0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3272K0
    public final String zze() {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3272K0
    public final String zzf() {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }
}
