package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.w6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4365w6 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m19247a(C4357v6 c4357v6, Parcel parcel, int i7) {
        int i8 = c4357v6.f16123a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, c4357v6.f16124b, false);
        AbstractC1947c.m8076x(parcel, 3, c4357v6.f16125c);
        AbstractC1947c.m8078z(parcel, 4, c4357v6.f16126d, false);
        AbstractC1947c.m8070r(parcel, 5, null, false);
        AbstractC1947c.m8044E(parcel, 6, c4357v6.f16127e, false);
        AbstractC1947c.m8044E(parcel, 7, c4357v6.f16128f, false);
        AbstractC1947c.m8067o(parcel, 8, c4357v6.f16129r, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        Long lM8007I = null;
        Float fM8001C = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        Double dM7999A = null;
        long jM8006H = 0;
        int iM8004F = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 4:
                    lM8007I = AbstractC1946b.m8007I(parcel, iM8002D);
                    break;
                case 5:
                    fM8001C = AbstractC1946b.m8001C(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    dM7999A = AbstractC1946b.m7999A(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4357v6(iM8004F, strM8030q, jM8006H, lM8007I, fM8001C, strM8030q2, strM8030q3, dM7999A);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4357v6[i7];
    }
}
