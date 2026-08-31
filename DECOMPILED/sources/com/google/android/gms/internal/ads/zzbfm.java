package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3321a2;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        int iM8004F = 0;
        boolean zM8037x = false;
        int iM8004F2 = 0;
        boolean zM8037x2 = false;
        int iM8004F3 = 0;
        boolean zM8037x3 = false;
        int iM8004F4 = 0;
        int iM8004F5 = 0;
        boolean zM8037x4 = false;
        int iM8004F6 = 0;
        C3321a2 c3321a2 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 3:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 4:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 6:
                    c3321a2 = (C3321a2) AbstractC1946b.m8029p(parcel, iM8002D, C3321a2.CREATOR);
                    break;
                case 7:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 8:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 9:
                    iM8004F5 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 11:
                    iM8004F6 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzbfl(iM8004F, zM8037x, iM8004F2, zM8037x2, iM8004F3, c3321a2, zM8037x3, iM8004F4, iM8004F5, zM8037x4, iM8004F6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzbfl[i7];
    }
}
