package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.N0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3281N0 extends zzaya implements InterfaceC3284O0 {
    public AbstractBinderC3281N0() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
        zzayb.zzh(parcel);
        zze(c3324b1);
        parcel2.writeNoException();
        return true;
    }
}
