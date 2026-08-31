package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqy extends zzaya implements zzbqz {
    public zzbqy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zze(string);
        } else if (i7 == 2) {
            String string2 = parcel.readString();
            zzayb.zzh(parcel);
            zzf(string2);
        } else {
            if (i7 != 3) {
                return false;
            }
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            zzg(c3324b1);
        }
        parcel2.writeNoException();
        return true;
    }
}
