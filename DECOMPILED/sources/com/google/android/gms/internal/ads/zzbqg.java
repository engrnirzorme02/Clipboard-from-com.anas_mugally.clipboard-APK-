package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqg extends zzaya implements zzbqh {
    public zzbqg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            zze();
        } else if (i7 == 3) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzf(string);
        } else {
            if (i7 != 4) {
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
