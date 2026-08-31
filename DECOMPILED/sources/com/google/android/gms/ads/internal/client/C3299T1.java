package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.T1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3299T1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        String strM8030q = null;
        C3349h2 c3349h2 = null;
        int iM8004F2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 2) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 3) {
                c3349h2 = (C3349h2) AbstractC1946b.m8029p(parcel, iM8002D, C3349h2.CREATOR);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3296S1(strM8030q, iM8004F, c3349h2, iM8004F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3296S1[i7];
    }
}
