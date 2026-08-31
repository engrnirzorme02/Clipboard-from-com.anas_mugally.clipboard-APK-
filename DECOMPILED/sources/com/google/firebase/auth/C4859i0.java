package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.firebase.auth.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4859i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        zzajb zzajbVar = null;
        String strM8030q4 = null;
        String strM8030q5 = null;
        String strM8030q6 = null;
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
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 4:
                    zzajbVar = (zzajb) AbstractC1946b.m8029p(parcel, iM8002D, zzajb.CREATOR);
                    break;
                case 5:
                    strM8030q4 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 6:
                    strM8030q5 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q6 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4861j0(strM8030q, strM8030q2, strM8030q3, zzajbVar, strM8030q4, strM8030q5, strM8030q6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4861j0[i7];
    }
}
