package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p142S2.C1390a;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3549e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        ArrayList arrayListM8034u = null;
        Account account = null;
        String strM8030q = null;
        String strM8030q2 = null;
        ArrayList arrayListM8034u2 = null;
        String strM8030q3 = null;
        int iM8004F = 0;
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) AbstractC1946b.m8029p(parcel, iM8002D, Account.CREATOR);
                    break;
                case 4:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 6:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 9:
                    arrayListM8034u2 = AbstractC1946b.m8034u(parcel, iM8002D, C1390a.CREATOR);
                    break;
                case 10:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new GoogleSignInOptions(iM8004F, arrayListM8034u, account, zM8037x, zM8037x2, zM8037x3, strM8030q, strM8030q2, arrayListM8034u2, strM8030q3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInOptions[i7];
    }
}
