package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3543f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        PendingIntent pendingIntent = null;
        String strM8030q = null;
        String strM8030q2 = null;
        ArrayList arrayListM8032s = null;
        String strM8030q3 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    pendingIntent = (PendingIntent) AbstractC1946b.m8029p(parcel, iM8002D, PendingIntent.CREATOR);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    arrayListM8032s = AbstractC1946b.m8032s(parcel, iM8002D);
                    break;
                case 5:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strM8030q, strM8030q2, arrayListM8032s, strM8030q3, iM8004F);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SaveAccountLinkingTokenRequest[i7];
    }
}
