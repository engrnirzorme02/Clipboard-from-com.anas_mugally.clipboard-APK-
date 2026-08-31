package com.google.android.gms.internal.p411firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaja implements Parcelable.Creator<zzajb> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
        String strM8030q7 = null;
        String strM8030q8 = null;
        String strM8030q9 = null;
        String strM8030q10 = null;
        String strM8030q11 = null;
        String strM8030q12 = null;
        String strM8030q13 = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q8 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 11:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 12:
                    strM8030q9 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 13:
                    strM8030q10 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 14:
                    strM8030q11 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 15:
                    strM8030q12 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 16:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 17:
                    strM8030q13 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzajb(strM8030q, strM8030q2, strM8030q3, strM8030q4, strM8030q5, strM8030q6, strM8030q7, strM8030q8, zM8037x, zM8037x2, strM8030q9, strM8030q10, strM8030q11, strM8030q12, zM8037x3, strM8030q13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzajb[] newArray(int i7) {
        return new zzajb[i7];
    }
}
