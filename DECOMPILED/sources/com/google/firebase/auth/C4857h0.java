package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.firebase.auth.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4857h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            AbstractC1946b.m8036w(iM8002D);
            AbstractC1946b.m8010L(parcel, iM8002D);
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4824H();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4824H[i7];
    }
}
