package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p170W2.C1837b;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.U */
/* JADX INFO: loaded from: classes.dex */
public final class C3676U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        IBinder iBinderM8003E = null;
        C1837b c1837b = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
            } else if (iM8036w == 3) {
                c1837b = (C1837b) AbstractC1946b.m8029p(parcel, iM8002D, C1837b.CREATOR);
            } else if (iM8036w == 4) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3675T(iM8004F, iBinderM8003E, c1837b, zM8037x, zM8037x2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3675T[i7];
    }
}
