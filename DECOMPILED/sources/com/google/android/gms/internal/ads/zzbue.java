package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbue implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8032s = null;
        boolean zM8037x = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 2) {
                zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbud(zM8037x, arrayListM8032s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbud[i7];
    }
}
