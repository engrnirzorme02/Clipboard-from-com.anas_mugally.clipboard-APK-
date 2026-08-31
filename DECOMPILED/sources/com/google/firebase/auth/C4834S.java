package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.firebase.auth.S */
/* JADX INFO: loaded from: classes.dex */
public final class C4834S implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
        String strM8030q7 = null;
        String strM8030q8 = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 10:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 11:
                    strM8030q8 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4848d(strM8030q, strM8030q2, strM8030q3, strM8030q4, zM8037x, strM8030q5, zM8037x2, strM8030q6, iM8004F, strM8030q7, strM8030q8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4848d[i7];
    }
}
