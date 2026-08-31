package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbld extends zzaxz implements IInterface {
    zzbld(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbkx zzbkxVar, zzblc zzblcVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbkxVar);
        zzayb.zze(parcelZza, zzblcVar);
        zzdg(2, parcelZza);
    }
}
