package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.L */
/* JADX INFO: loaded from: classes.dex */
public final class C3668L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = -1;
        int iM8004F2 = 0;
        int iM8004F3 = 0;
        int iM8004F4 = 0;
        int iM8004F5 = 0;
        String strM8030q = null;
        String strM8030q2 = null;
        long jM8006H = 0;
        long jM8006H2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 3:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 4:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 5:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    iM8004F5 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 9:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3712p(iM8004F2, iM8004F3, iM8004F4, jM8006H, jM8006H2, strM8030q, strM8030q2, iM8004F5, iM8004F);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3712p[i7];
    }
}
