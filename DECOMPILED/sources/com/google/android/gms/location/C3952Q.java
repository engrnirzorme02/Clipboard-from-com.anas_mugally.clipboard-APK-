package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.Q */
/* JADX INFO: loaded from: classes2.dex */
public final class C3952Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = "";
        ArrayList arrayListM8032s = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
            } else if (iM8036w == 2) {
                pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
            } else if (iM8036w != 3) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3951P(arrayListM8032s, pendingIntent, strM8030q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C3951P[i7];
    }
}
