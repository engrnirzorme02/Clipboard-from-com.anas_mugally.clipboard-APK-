package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbwg extends zzaya implements zzbwh {
    public zzbwg() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zze();
        } else if (i7 == 2) {
            int i9 = parcel.readInt();
            zzayb.zzh(parcel);
            zzf(i9);
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
