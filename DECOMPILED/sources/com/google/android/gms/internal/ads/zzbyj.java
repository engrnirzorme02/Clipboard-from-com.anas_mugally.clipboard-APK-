package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        C3369m2 c3369m2 = null;
        C3349h2 c3349h2 = null;
        String strM8030q3 = null;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    c3369m2 = (C3369m2) AbstractC1946b.m8029p(parcel, iM8002D, C3369m2.CREATOR);
                    break;
                case 4:
                    c3349h2 = (C3349h2) AbstractC1946b.m8029p(parcel, iM8002D, C3349h2.CREATOR);
                    break;
                case 5:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbyi(strM8030q, strM8030q2, c3369m2, c3349h2, iM8004F, strM8030q3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbyi[i7];
    }
}
