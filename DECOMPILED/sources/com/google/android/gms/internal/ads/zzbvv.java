package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvv extends zzaxz implements zzbvx {
    zzbvv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final String zze() {
        Parcel parcelZzde = zzde(1, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbvx
    public final int zzf() {
        Parcel parcelZzde = zzde(2, zza());
        int i7 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i7;
    }
}
