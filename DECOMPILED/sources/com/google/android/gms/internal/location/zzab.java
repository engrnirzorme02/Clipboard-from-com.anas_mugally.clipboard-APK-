package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Status status = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 1) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                status = (Status) AbstractC1946b.m8029p(parcel, iM8002D, Status.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i7) {
        return new zzaa[i7];
    }
}
