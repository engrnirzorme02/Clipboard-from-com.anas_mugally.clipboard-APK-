package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzde implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Bundle bundleM8019f = null;
        String strM8030q = null;
        boolean zM8037x = false;
        long jM8006H = 0;
        long jM8006H2 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            } else if (iM8036w == 2) {
                jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
            } else if (iM8036w == 3) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w == 7) {
                bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
            } else if (iM8036w != 8) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzdd(jM8006H, jM8006H2, zM8037x, bundleM8019f, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzdd[i7];
    }
}
