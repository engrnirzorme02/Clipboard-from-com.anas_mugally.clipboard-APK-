package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.util.C3424C;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuo extends zzaxz implements IInterface {
    zzbuo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzbuf zzbufVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, zzbufVar);
        zzdf(1, parcelZza);
    }

    public final void zzf(C3424C c3424c) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3424c);
        zzdf(2, parcelZza);
    }
}
