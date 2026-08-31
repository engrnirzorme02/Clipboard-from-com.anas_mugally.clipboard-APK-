package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.C6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4014C6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        int iM8004F = 0;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        int iM8004F2 = 0;
        int iM8004F3 = 0;
        long jM8006H = 0;
        long jM8006H2 = 0;
        long jM8006H3 = 0;
        long jM8006H4 = 0;
        long jM8006H5 = 0;
        long jM8006H6 = 0;
        long jM8006H7 = 0;
        String strM8030q = "";
        String strM8030q2 = strM8030q;
        String strM8030q3 = strM8030q2;
        String strM8030q4 = strM8030q3;
        String strM8030q5 = null;
        String strM8030q6 = null;
        String strM8030q7 = null;
        String strM8030q8 = null;
        String strM8030q9 = null;
        String strM8030q10 = null;
        Boolean boolM8038y = null;
        ArrayList arrayListM8032s = null;
        String strM8030q11 = null;
        String strM8030q12 = null;
        int iM8004F4 = 100;
        boolean zM8037x4 = true;
        boolean zM8037x5 = true;
        long jM8006H8 = -2147483648L;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q8 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 7:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q9 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 11:
                    jM8006H8 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 12:
                    strM8030q10 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 13:
                case 17:
                case 19:
                case 20:
                case 24:
                case 33:
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
                case 14:
                    jM8006H3 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 15:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 16:
                    zM8037x5 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 18:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    boolM8038y = AbstractC1946b.m8038y(parcel, iM8002D);
                    break;
                case 22:
                    jM8006H4 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 23:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 25:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 26:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 27:
                    strM8030q11 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 28:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 29:
                    jM8006H5 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 30:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 31:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 32:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 34:
                    jM8006H6 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 35:
                    strM8030q12 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 36:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 37:
                    jM8006H7 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 38:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4006B6(strM8030q5, strM8030q6, strM8030q7, strM8030q8, jM8006H, jM8006H2, strM8030q9, zM8037x4, zM8037x, jM8006H8, strM8030q10, jM8006H3, iM8004F, zM8037x5, zM8037x2, boolM8038y, jM8006H4, arrayListM8032s, strM8030q, strM8030q2, strM8030q11, zM8037x3, jM8006H5, iM8004F4, strM8030q3, iM8004F2, jM8006H6, strM8030q12, strM8030q4, jM8006H7, iM8004F3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4006B6[i7];
    }
}
