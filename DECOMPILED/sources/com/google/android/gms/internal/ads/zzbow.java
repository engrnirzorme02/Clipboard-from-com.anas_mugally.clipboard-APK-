package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbow extends zzaya implements zzbox {
    public zzbow() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbox zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbox ? (zzbox) iInterfaceQueryLocalInterface : new zzbov(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzbpa zzbpaVarZzb = zzb(string);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzbpaVarZzb);
        } else if (i7 == 2) {
            String string2 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i7 == 3) {
            String string3 = parcel.readString();
            zzayb.zzh(parcel);
            zzbqw zzbqwVarZze = zze(string3);
            parcel2.writeNoException();
            zzayb.zze(parcel2, zzbqwVarZze);
        } else {
            if (i7 != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
