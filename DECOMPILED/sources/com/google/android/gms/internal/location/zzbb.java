package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3688d;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import p177X2.AbstractC1946b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        List<C3688d> listM8034u = zzba.zza;
        LocationRequest locationRequest = null;
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        boolean zM8037x4 = false;
        boolean zM8037x5 = false;
        long jM8006H = Long.MAX_VALUE;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w != 1) {
                switch (iM8036w) {
                    case 5:
                        listM8034u = AbstractC1946b.m8034u(parcel, iM8002D, C3688d.CREATOR);
                        break;
                    case 6:
                        strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                        break;
                    case 7:
                        zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                        break;
                    case 8:
                        zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                        break;
                    case 9:
                        zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                        break;
                    case 10:
                        strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                        break;
                    case 11:
                        zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                        break;
                    case 12:
                        zM8037x5 = AbstractC1946b.m8037x(parcel, iM8002D);
                        break;
                    case 13:
                        strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                        break;
                    case 14:
                        jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                        break;
                    default:
                        AbstractC1946b.m8010L(parcel, iM8002D);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) AbstractC1946b.m8029p(parcel, iM8002D, LocationRequest.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new zzba(locationRequest, listM8034u, strM8030q, zM8037x, zM8037x2, zM8037x3, strM8030q2, zM8037x4, zM8037x5, strM8030q3, jM8006H);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i7) {
        return new zzba[i7];
    }
}
