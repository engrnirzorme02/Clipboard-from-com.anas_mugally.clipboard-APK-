package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p084K2.C0739d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg extends zza implements IInterface {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void zzc(C0739d c0739d, zzf zzfVar) {
        Parcel parcelZza = zza();
        zzc.zzb(parcelZza, c0739d);
        zzc.zzc(parcelZza, zzfVar);
        zzb(1, parcelZza);
    }
}
