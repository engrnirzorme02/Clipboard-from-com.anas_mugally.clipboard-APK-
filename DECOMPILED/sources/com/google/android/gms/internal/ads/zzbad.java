package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbad extends zzaya implements zzbae {
    public zzbad() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbae zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbae ? (zzbae) iInterfaceQueryLocalInterface : new zzbac(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        zzbab zzazzVar;
        if (i7 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzazzVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzazzVar = iInterfaceQueryLocalInterface instanceof zzbab ? (zzbab) iInterfaceQueryLocalInterface : new zzazz(strongBinder);
            }
            zzayb.zzh(parcel);
            zzb(zzazzVar);
        } else if (i7 == 2) {
            parcel.readInt();
            zzayb.zzh(parcel);
        } else {
            if (i7 != 3) {
                return false;
            }
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            zzd(c3324b1);
        }
        parcel2.writeNoException();
        return true;
    }
}
