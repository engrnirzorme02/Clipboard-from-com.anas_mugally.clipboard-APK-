package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbla implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        long jM8006H = 0;
        boolean zM8037x = false;
        int iM8004F = 0;
        boolean zM8037x2 = false;
        String strM8030q = null;
        byte[] bArrM8020g = null;
        String[] strArrM8031r = null;
        String[] strArrM8031r2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 4:
                    bArrM8020g = AbstractC1946b.m8020g(parcel, iM8002D);
                    break;
                case 5:
                    strArrM8031r = AbstractC1946b.m8031r(parcel, iM8002D);
                    break;
                case 6:
                    strArrM8031r2 = AbstractC1946b.m8031r(parcel, iM8002D);
                    break;
                case 7:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 8:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbkz(zM8037x, strM8030q, iM8004F, bArrM8020g, strArrM8031r, strArrM8031r2, zM8037x2, jM8006H);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbkz[i7];
    }
}
