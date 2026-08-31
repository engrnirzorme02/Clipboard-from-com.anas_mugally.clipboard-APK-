package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbav extends zzaxz implements IInterface {
    zzbav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final zzbaq zze(zzbat zzbatVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbatVar);
        Parcel parcelZzde = zzde(1, parcelZza);
        zzbaq zzbaqVar = (zzbaq) zzayb.zzb(parcelZzde, zzbaq.CREATOR);
        parcelZzde.recycle();
        return zzbaqVar;
    }

    public final zzbaq zzf(zzbat zzbatVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbatVar);
        Parcel parcelZzde = zzde(2, parcelZza);
        zzbaq zzbaqVar = (zzbaq) zzayb.zzb(parcelZzde, zzbaq.CREATOR);
        parcelZzde.recycle();
        return zzbaqVar;
    }

    public final long zzg(zzbat zzbatVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbatVar);
        Parcel parcelZzde = zzde(3, parcelZza);
        long j7 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j7;
    }
}
