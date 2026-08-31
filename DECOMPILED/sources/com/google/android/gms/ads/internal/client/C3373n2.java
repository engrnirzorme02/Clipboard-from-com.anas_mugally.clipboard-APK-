package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3373n2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        int iM8004F2 = 0;
        boolean zM8037x = false;
        int iM8004F3 = 0;
        int iM8004F4 = 0;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        boolean zM8037x4 = false;
        boolean zM8037x5 = false;
        boolean zM8037x6 = false;
        boolean zM8037x7 = false;
        boolean zM8037x8 = false;
        boolean zM8037x9 = false;
        String strM8030q = null;
        C3369m2[] c3369m2Arr = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 4:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 7:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 8:
                    c3369m2Arr = (C3369m2[]) AbstractC1946b.m8033t(parcel, iM8002D, C3369m2.CREATOR);
                    break;
                case 9:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 11:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 12:
                    zM8037x5 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 13:
                    zM8037x6 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 14:
                    zM8037x7 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 15:
                    zM8037x8 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 16:
                    zM8037x9 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3369m2(strM8030q, iM8004F, iM8004F2, zM8037x, iM8004F3, iM8004F4, c3369m2Arr, zM8037x2, zM8037x3, zM8037x4, zM8037x5, zM8037x6, zM8037x7, zM8037x8, zM8037x9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3369m2[i7];
    }
}
