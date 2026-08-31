package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C3941F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        List listM8034u = LocationResult.f14988b;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                listM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Location.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new LocationResult(listM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new LocationResult[i7];
    }
}
