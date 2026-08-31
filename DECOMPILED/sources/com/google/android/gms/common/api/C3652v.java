package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.v */
/* JADX INFO: loaded from: classes.dex */
public final class C3652v implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static final C3555c m17972a(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        C3557e c3557e = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3557e = (C3557e) AbstractC1946b.m8029p(parcel, iM8002D, C3557e.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3555c(c3557e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m17972a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3555c[i7];
    }
}
