package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C3389r2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        C3324b1 c3324b1 = null;
        Bundle bundleM8019f = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        String strM8030q4 = null;
        String strM8030q5 = null;
        long jM8006H = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 3:
                    c3324b1 = (C3324b1) AbstractC1946b.m8029p(parcel, iM8002D, C3324b1.CREATOR);
                    break;
                case 4:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3385q2(strM8030q, jM8006H, c3324b1, bundleM8019f, strM8030q2, strM8030q3, strM8030q4, strM8030q5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3385q2[i7];
    }
}
