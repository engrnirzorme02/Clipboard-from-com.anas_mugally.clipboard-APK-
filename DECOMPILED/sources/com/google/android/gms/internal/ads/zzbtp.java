package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbtp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        IBinder iBinderM8003E = null;
        IBinder iBinderM8003E2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                iBinderM8003E2 = AbstractC1946b.m8003E(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbto(iBinderM8003E, iBinderM8003E2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbto[i7];
    }
}
