package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfd extends zzaxz implements IInterface {
    zzbfd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtz zzbtzVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbtzVar);
        zzdf(1, parcelZza);
    }
}
