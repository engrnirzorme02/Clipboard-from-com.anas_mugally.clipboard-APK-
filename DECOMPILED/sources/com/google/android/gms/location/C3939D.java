package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.D */
/* JADX INFO: loaded from: classes2.dex */
public final class C3939D implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 1000;
        int iM8004F2 = 1;
        int iM8004F3 = 1;
        long jM8006H = 0;
        C3949N[] c3949nArr = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 3) {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            } else if (iM8036w == 4) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3949nArr = (C3949N[]) AbstractC1946b.m8033t(parcel, iM8002D, C3949N.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new LocationAvailability(iM8004F, iM8004F2, iM8004F3, jM8006H, c3949nArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new LocationAvailability[i7];
    }
}
