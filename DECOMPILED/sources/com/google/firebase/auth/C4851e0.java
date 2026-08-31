package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p411firebaseauthapi.zzaiz;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.firebase.auth.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4851e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = null;
        String strM8030q2 = null;
        zzaiz zzaizVar = null;
        long jM8006H = 0;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 1) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 2) {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 3) {
                jM8006H = AbstractC1946b.m8006H(parcel, iM8002D);
            } else if (iM8036w != 4) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                zzaizVar = (zzaiz) AbstractC1946b.m8029p(parcel, iM8002D, zzaiz.CREATOR);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4830N(strM8030q, strM8030q2, jM8006H, zzaizVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C4830N[i7];
    }
}
