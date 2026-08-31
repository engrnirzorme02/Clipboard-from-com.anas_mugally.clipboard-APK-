package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C4254j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        C4357v6 c4357v6 = null;
        String strM8030q3 = null;
        C4039G c4039g = null;
        C4039G c4039g2 = null;
        C4039G c4039g3 = null;
        long jM8006H = 0;
        long jM8006H2 = 0;
        long jM8006H3 = 0;
        boolean zM8037x = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    c4357v6 = (C4357v6) AbstractC1946b.m8029p(parcel, iM8002D, C4357v6.CREATOR);
                    break;
                case 5:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 6:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    c4039g = (C4039G) AbstractC1946b.m8029p(parcel, iM8002D, C4039G.CREATOR);
                    break;
                case 9:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 10:
                    c4039g2 = (C4039G) AbstractC1946b.m8029p(parcel, iM8002D, C4039G.CREATOR);
                    break;
                case 11:
                    jM8006H3 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 12:
                    c4039g3 = (C4039G) AbstractC1946b.m8029p(parcel, iM8002D, C4039G.CREATOR);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4246i(strM8030q, strM8030q2, c4357v6, jM8006H, zM8037x, strM8030q3, c4039g, jM8006H2, c4039g2, jM8006H3, c4039g3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4246i[i7];
    }
}
