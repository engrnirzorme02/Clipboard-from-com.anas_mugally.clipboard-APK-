package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfqf extends zzaya implements zzfqg {
    public zzfqf() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 2:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzayb.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzayb.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzayb.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzayb.zzh(parcel);
                break;
            case 8:
                InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzayb.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
