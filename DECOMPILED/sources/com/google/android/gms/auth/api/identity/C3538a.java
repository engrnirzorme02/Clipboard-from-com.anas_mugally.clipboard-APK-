package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p177X2.AbstractC1946b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3538a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        boolean zM8037x = false;
        boolean zM8037x2 = false;
        boolean zM8037x3 = false;
        boolean zM8037x4 = false;
        ArrayList arrayListM8034u = null;
        String strM8030q = null;
        Account account = null;
        String strM8030q2 = null;
        String strM8030q3 = null;
        Bundle bundleM8019f = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    arrayListM8034u = AbstractC1946b.m8034u(parcel, iM8002D, Scope.CREATOR);
                    break;
                case 2:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 3:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 4:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 5:
                    account = (Account) AbstractC1946b.m8029p(parcel, iM8002D, Account.CREATOR);
                    break;
                case 6:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 7:
                    strM8030q3 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 8:
                    zM8037x3 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 9:
                    bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 10:
                    zM8037x4 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new AuthorizationRequest(arrayListM8034u, strM8030q, zM8037x, zM8037x2, account, strM8030q2, strM8030q3, zM8037x3, bundleM8019f, zM8037x4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AuthorizationRequest[i7];
    }
}
