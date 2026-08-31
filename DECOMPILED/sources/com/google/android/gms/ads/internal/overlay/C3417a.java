package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbbn;
import p177X2.AbstractC1946b;
import p380w2.C7343l;
import p396y2.C7524l;
import p404z2.C7584a;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.overlay.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3417a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        long jM8006H = 0;
        boolean zM8037x = false;
        int iM8004F = 0;
        int iM8004F2 = 0;
        boolean zM8037x2 = false;
        C7524l c7524l = null;
        IBinder iBinderM8003E = null;
        IBinder iBinderM8003E2 = null;
        IBinder iBinderM8003E3 = null;
        IBinder iBinderM8003E4 = null;
        String strM8030q = null;
        String strM8030q2 = null;
        IBinder iBinderM8003E5 = null;
        String strM8030q3 = null;
        C7584a c7584a = null;
        String strM8030q4 = null;
        C7343l c7343l = null;
        IBinder iBinderM8003E6 = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
        String strM8030q7 = null;
        IBinder iBinderM8003E7 = null;
        IBinder iBinderM8003E8 = null;
        IBinder iBinderM8003E9 = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 2:
                    c7524l = (C7524l) AbstractC1946b.m8029p(parcel, iM8002D, C7524l.CREATOR);
                    break;
                case 3:
                    iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 4:
                    iBinderM8003E2 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 5:
                    iBinderM8003E3 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 6:
                    iBinderM8003E4 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 9:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 10:
                    iBinderM8003E5 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 11:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 12:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 13:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 14:
                    c7584a = (C7584a) AbstractC1946b.m8029p(parcel, iM8002D, C7584a.CREATOR);
                    break;
                case 15:
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                case 22:
                case 23:
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
                case 16:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 17:
                    c7343l = (C7343l) AbstractC1946b.m8029p(parcel, iM8002D, C7343l.CREATOR);
                    break;
                case 18:
                    iBinderM8003E6 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 19:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 24:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 25:
                    strM8030q7 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 26:
                    iBinderM8003E7 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 27:
                    iBinderM8003E8 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 28:
                    iBinderM8003E9 = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 29:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 30:
                    jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new AdOverlayInfoParcel(c7524l, iBinderM8003E, iBinderM8003E2, iBinderM8003E3, iBinderM8003E4, strM8030q, zM8037x, strM8030q2, iBinderM8003E5, iM8004F, iM8004F2, strM8030q3, c7584a, strM8030q4, c7343l, iBinderM8003E6, strM8030q5, strM8030q6, strM8030q7, iBinderM8003E7, iBinderM8003E8, iBinderM8003E9, zM8037x2, jM8006H);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AdOverlayInfoParcel[i7];
    }
}
