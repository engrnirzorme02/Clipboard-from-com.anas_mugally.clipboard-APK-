package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.location.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C3940E implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 102;
        long jM8006H = 3600000;
        long jM8006H2 = 600000;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        long jM8006H3 = Long.MAX_VALUE;
        int iM8004F2 = Integer.MAX_VALUE;
        float fM8000B = 0.0f;
        long jM8006H4 = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 3:
                    jM8006H2 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 4:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    jM8006H3 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 6:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 7:
                    fM8000B = AbstractC1946b.m8000B(parcel, iM8002D);
                    break;
                case 8:
                    jM8006H4 = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                case 9:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new LocationRequest(iM8004F, jM8006H, jM8006H2, zM8037x, jM8006H3, iM8004F2, fM8000B, jM8006H4, zM8037x2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new LocationRequest[i7];
    }
}
