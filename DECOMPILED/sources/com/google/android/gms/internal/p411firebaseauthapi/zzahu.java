package com.google.android.gms.internal.p411firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzahu implements Parcelable.Creator<zzahv> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        Long lM8007I = null;
        String strM8030q3 = null;
        Long lM8007I2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 4) {
                lM8007I = AbstractC1946b.m8007I(parcel, iM8002D);
            } else if (iM8036w == 5) {
                strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w != 6) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                lM8007I2 = AbstractC1946b.m8007I(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzahv(strM8030q, strM8030q2, lM8007I, strM8030q3, lM8007I2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahv[] newArray(int i7) {
        return new zzahv[i7];
    }
}
