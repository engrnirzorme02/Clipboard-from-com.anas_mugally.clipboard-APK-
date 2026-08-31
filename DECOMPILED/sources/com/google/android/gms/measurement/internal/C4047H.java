package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.H */
/* JADX INFO: loaded from: classes2.dex */
public final class C4047H implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m18522a(C4039G c4039g, Parcel parcel, int i7) {
        String str = c4039g.f15219a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, str, false);
        AbstractC1947c.m8042C(parcel, 3, c4039g.f15220b, i7, false);
        AbstractC1947c.m8044E(parcel, 4, c4039g.f15221c, false);
        AbstractC1947c.m8076x(parcel, 5, c4039g.f15222d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        long jM8006H = 0;
        String strM8030q = null;
        C4023E c4023e = null;
        String strM8030q2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                c4023e = (C4023E) AbstractC1946b.m8029p(parcel, iM8002D, C4023E.CREATOR);
            } else if (iM8036w == 4) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w != 5) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4039G(strM8030q, c4023e, strM8030q2, jM8006H);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4039G[i7];
    }
}
