package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.firebase.auth.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4855g0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        String strM8030q2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 4) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4833Q(strM8030q, strM8030q2, zM8037x, zM8037x2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4833Q[i7];
    }
}
