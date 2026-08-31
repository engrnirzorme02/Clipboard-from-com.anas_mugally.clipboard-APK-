package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3399u0 extends zzaya implements InterfaceC3403v0 {
    public AbstractBinderC3399u0() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            mo17203Y(c3324b1);
        } else if (i7 == 2) {
            zzc();
        } else if (i7 == 3) {
            zzd();
        } else if (i7 == 4) {
            zze();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
