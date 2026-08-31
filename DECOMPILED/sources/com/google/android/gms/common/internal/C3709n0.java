package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p170W2.C1839d;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3709n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Bundle bundleM8019f = null;
        C3692f c3692f = null;
        int iM8004F = 0;
        C1839d[] c1839dArr = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
            } else if (iM8036w == 2) {
                c1839dArr = (C1839d[]) AbstractC1946b.m8033t(parcel, iM8002D, C1839d.CREATOR);
            } else if (iM8036w == 3) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3692f = (C3692f) AbstractC1946b.m8029p(parcel, iM8002D, C3692f.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3707m0(bundleM8019f, c1839dArr, iM8004F, c3692f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3707m0[i7];
    }
}
