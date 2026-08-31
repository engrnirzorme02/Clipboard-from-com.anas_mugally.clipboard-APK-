package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3947L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Status status = null;
        C3975n c3975n = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                status = (Status) AbstractC1946b.m8029p(parcel, iM8002D, Status.CREATOR);
            } else if (iM8036w != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c3975n = (C3975n) AbstractC1946b.m8029p(parcel, iM8002D, C3975n.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3974m(status, c3975n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C3974m[i7];
    }
}
