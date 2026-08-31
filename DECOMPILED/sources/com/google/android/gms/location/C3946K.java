package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3946K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8034u = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        C3944I c3944i = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, LocationRequest.CREATOR);
            } else if (iM8036w == 2) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w == 3) {
                zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3944i = (C3944I) AbstractC1946b.m8029p(parcel, iM8002D, C3944I.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3973l(arrayListM8034u, zM8037x, zM8037x2, c3944i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C3973l[i7];
    }
}
