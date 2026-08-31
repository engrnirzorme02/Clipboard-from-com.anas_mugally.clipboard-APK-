package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbah extends zzaya implements zzbai {
    public zzbah() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzc();
        } else if (i7 == 2) {
            zzd();
        } else if (i7 == 3) {
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            zze(c3324b1);
        } else if (i7 == 4) {
            zzf();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}
