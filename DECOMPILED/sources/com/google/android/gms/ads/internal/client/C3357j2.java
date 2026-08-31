package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3357j2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        long jM8006H = 0;
        long jM8006H2 = 0;
        long jM8006H3 = 0;
        int iM8004F = 0;
        int iM8004F2 = 0;
        boolean zM8037x = false;
        int iM8004F3 = 0;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        int iM8004F4 = 0;
        int iM8004F5 = 0;
        int iM8004F6 = 0;
        Bundle bundleM8019f = null;
        ArrayList arrayListM8032s = null;
        String strM8030q = null;
        C3308W1 c3308w1 = null;
        Location location = null;
        String strM8030q2 = null;
        Bundle bundleM8019f2 = null;
        Bundle bundleM8019f3 = null;
        ArrayList arrayListM8032s2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        C3323b0 c3323b0 = null;
        String strM8030q5 = null;
        ArrayList arrayListM8032s3 = null;
        String strM8030q6 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 3:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 4:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 5:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 6:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 7:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 8:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    c3308w1 = (C3308W1) AbstractC1946b.m8029p(parcel, iM8002D, C3308W1.CREATOR);
                    break;
                case 11:
                    location = (Location) AbstractC1946b.m8029p(parcel, iM8002D, Location.CREATOR);
                    break;
                case 12:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 13:
                    bundleM8019f2 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 14:
                    bundleM8019f3 = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 15:
                    arrayListM8032s2 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 16:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 17:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 18:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 19:
                    c3323b0 = (C3323b0) AbstractC1946b.m8029p(parcel, iM8002D, C3323b0.CREATOR);
                    break;
                case 20:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case zzbbn.zzt.zzm /* 21 */:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 22:
                    arrayListM8032s3 = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 23:
                    iM8004F5 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 24:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 25:
                    iM8004F6 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 26:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 27:
                    jM8006H3 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3349h2(iM8004F, jM8006H, bundleM8019f, iM8004F2, arrayListM8032s, zM8037x, iM8004F3, zM8037x2, strM8030q, c3308w1, location, strM8030q2, bundleM8019f2, bundleM8019f3, arrayListM8032s2, strM8030q3, strM8030q4, zM8037x3, c3323b0, iM8004F4, strM8030q5, arrayListM8032s3, iM8004F5, strM8030q6, iM8004F6, jM8006H2, jM8006H3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3349h2[i7];
    }
}
