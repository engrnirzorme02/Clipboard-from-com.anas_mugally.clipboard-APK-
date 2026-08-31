package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4189a6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8034u = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C4167X5.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4181Z5(arrayListM8034u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4181Z5[i7];
    }
}
