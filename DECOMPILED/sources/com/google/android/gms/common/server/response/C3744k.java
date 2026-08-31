package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3744k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Parcel parcelM8027n = null;
        int iM8004F = 0;
        C3741h c3741h = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                parcelM8027n = AbstractC1946b.m8027n(parcel, iM8002D);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3741h = (C3741h) AbstractC1946b.m8029p(parcel, iM8002D, C3741h.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3736c(iM8004F, parcelM8027n, c3741h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3736c[i7];
    }
}
