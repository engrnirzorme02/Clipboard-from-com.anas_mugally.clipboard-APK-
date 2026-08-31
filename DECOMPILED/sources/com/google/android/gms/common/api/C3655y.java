package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p170W2.C1837b;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.common.api.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3655y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        C1837b c1837b = null;
        int iM8004F = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
            } else if (iM8036w == 2) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                c1837b = (C1837b) AbstractC1946b.m8029p(parcel, iM8002D, C1837b.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new Status(iM8004F, strM8030q, pendingIntent, c1837b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new Status[i7];
    }
}
