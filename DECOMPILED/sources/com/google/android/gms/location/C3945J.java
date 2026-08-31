package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3945J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = "";
        String strM8030q2 = "";
        String strM8030q3 = strM8030q2;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 2) {
                strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3944I(strM8030q, strM8030q2, strM8030q3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C3944I[i7];
    }
}
