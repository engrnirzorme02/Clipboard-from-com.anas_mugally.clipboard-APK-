package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;
import p199a3.C2197b;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3737d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        C2197b c2197b = null;
        int iM8004F = 0;
        int iM8004F2 = 0;
        boolean zM8037x = false;
        int iM8004F3 = 0;
        boolean zM8037x2 = false;
        int iM8004F4 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 3:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 4:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    c2197b = (C2197b) AbstractC1946b.m8029p(parcel, iM8002D, C2197b.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new AbstractC3734a.a(iM8004F, iM8004F2, zM8037x, iM8004F3, zM8037x2, strM8030q, iM8004F4, strM8030q2, c2197b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AbstractC3734a.a[i7];
    }
}
