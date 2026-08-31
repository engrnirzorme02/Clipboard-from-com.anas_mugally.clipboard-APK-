package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgs extends zzaxz implements zzbgu {
    zzbgs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgu
    public final void zze(zzbgl zzbglVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbglVar);
        zzdf(1, parcelZza);
    }
}
