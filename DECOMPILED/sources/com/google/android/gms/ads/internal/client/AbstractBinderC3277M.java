package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3277M extends zzaya implements InterfaceC3280N {
    public AbstractBinderC3277M() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzb();
        } else {
            if (i7 != 2) {
                return false;
            }
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            zzc(c3324b1);
        }
        parcel2.writeNoException();
        return true;
    }
}
