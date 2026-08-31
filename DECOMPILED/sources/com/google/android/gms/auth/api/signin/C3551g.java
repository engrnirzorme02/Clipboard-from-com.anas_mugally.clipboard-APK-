package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3551g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        String strM8030q = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strM8030q2 = "";
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            int iM8036w = AbstractC1946b.m8036w(iM8002D);
            if (iM8036w == 4) {
                strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
            } else if (iM8036w == 7) {
                googleSignInAccount = (GoogleSignInAccount) AbstractC1946b.m8029p(parcel, iM8002D, GoogleSignInAccount.CREATOR);
            } else if (iM8036w != 8) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new SignInAccount(strM8030q, googleSignInAccount, strM8030q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SignInAccount[i7];
    }
}
