package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbya extends zzaya implements zzbyb {
    public zzbya() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            parcel.readString();
            parcel.readString();
            zzayb.zzh(parcel);
        } else if (i7 == 2) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzb(string);
        } else {
            if (i7 != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzayb.zzb(parcel, Bundle.CREATOR);
            zzayb.zzh(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
