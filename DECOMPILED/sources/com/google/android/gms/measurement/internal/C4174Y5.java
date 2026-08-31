package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4174Y5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        byte[] bArrM8020g = null;
        String strM8030q = null;
        Bundle bundleM8019f = null;
        String strM8030q2 = null;
        long jM8006H = 0;
        long jM8006H2 = 0;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 2:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 3:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 5:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 6:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4167X5(jM8006H, bArrM8020g, strM8030q, bundleM8019f, iM8004F, jM8006H2, strM8030q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4167X5[i7];
    }
}
