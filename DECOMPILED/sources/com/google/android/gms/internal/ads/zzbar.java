package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbar implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        long jM8006H = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) AbstractC1946b.m8029p(parcel, iM8002D, ParcelFileDescriptor.CREATOR);
            } else if (iM8036w == 3) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w == 4) {
                zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w == 5) {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            } else if (iM8036w != 6) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbaq(parcelFileDescriptor, zM8037x, zM8037x2, jM8006H, zM8037x3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbaq[i7];
    }
}
