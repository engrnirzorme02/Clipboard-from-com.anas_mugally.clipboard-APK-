package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        int iM8004F = 0;
        short sM8008J = 0;
        int iM8004F2 = 0;
        double dM8039z = 0.0d;
        double dM8039z2 = 0.0d;
        float fM8000B = 0.0f;
        long jM8006H = 0;
        int iM8004F3 = -1;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 2:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 3:
                    sM8008J = AbstractC1946b.m8008J(parcel, iM8002D);
                    break;
                case 4:
                    dM8039z = AbstractC1946b.m8039z(parcel, iM8002D);
                    break;
                case 5:
                    dM8039z2 = AbstractC1946b.m8039z(parcel, iM8002D);
                    break;
                case 6:
                    fM8000B = AbstractC1946b.m8000B(parcel, iM8002D);
                    break;
                case 7:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 8:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 9:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbe(strM8030q, iM8004F, sM8008J, dM8039z, dM8039z2, fM8000B, jM8006H, iM8004F2, iM8004F3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i7) {
        return new zzbe[i7];
    }
}
