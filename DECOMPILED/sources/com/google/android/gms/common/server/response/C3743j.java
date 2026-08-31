package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.j */
/* JADX INFO: loaded from: classes.dex */
public final class C3743j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        int iM8004F = 0;
        ArrayList arrayListM8034u = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C3740g.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3739f(iM8004F, strM8030q, arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3739f[i7];
    }
}
