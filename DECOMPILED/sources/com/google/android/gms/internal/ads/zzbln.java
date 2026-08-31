package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbln extends zzaya implements zzblo {
    public zzbln() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzblo zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzblo ? (zzblo) iInterfaceQueryLocalInterface : new zzblm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            zze();
        } else {
            if (i7 != 3) {
                return false;
            }
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
