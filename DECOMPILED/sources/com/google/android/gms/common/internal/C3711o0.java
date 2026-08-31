package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3711o0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C3722u c3722u = null;
        int[] iArrM8024k = null;
        int[] iArrM8024k2 = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    c3722u = (C3722u) AbstractC1946b.m8029p(parcel, iM8002D, C3722u.CREATOR);
                    break;
                case 2:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 3:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 4:
                    iArrM8024k = AbstractC1946b.m8024k(parcel, iM8002D);
                    break;
                case 5:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 6:
                    iArrM8024k2 = AbstractC1946b.m8024k(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3692f(c3722u, zM8037x, zM8037x2, iArrM8024k, iM8004F, iArrM8024k2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3692f[i7];
    }
}
