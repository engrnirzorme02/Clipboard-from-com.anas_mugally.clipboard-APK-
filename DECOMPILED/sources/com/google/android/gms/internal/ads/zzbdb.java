package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdb extends zzaxz implements zzbdd {
    zzbdb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbdd
    public final void zze(zzbda zzbdaVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbdaVar);
        zzdf(1, parcelZza);
    }
}
