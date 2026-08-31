package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p170W2.C1839d;
import p177X2.AbstractC1946b;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3713p0 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    static void m18051a(C3694g c3694g, Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, c3694g.f14774a);
        AbstractC1947c.m8072t(parcel, 2, c3694g.f14775b);
        AbstractC1947c.m8072t(parcel, 3, c3694g.f14776c);
        AbstractC1947c.m8044E(parcel, 4, c3694g.f14777d, false);
        AbstractC1947c.m8071s(parcel, 5, c3694g.f14778e, false);
        AbstractC1947c.m8047H(parcel, 6, c3694g.f14779f, i7, false);
        AbstractC1947c.m8062j(parcel, 7, c3694g.f14780r, false);
        AbstractC1947c.m8042C(parcel, 8, c3694g.f14781s, i7, false);
        AbstractC1947c.m8047H(parcel, 10, c3694g.f14782t, i7, false);
        AbstractC1947c.m8047H(parcel, 11, c3694g.f14783u, i7, false);
        AbstractC1947c.m8059g(parcel, 12, c3694g.f14784v);
        AbstractC1947c.m8072t(parcel, 13, c3694g.f14785w);
        AbstractC1947c.m8059g(parcel, 14, c3694g.f14786x);
        AbstractC1947c.m8044E(parcel, 15, c3694g.m18027T(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Scope[] scopeArr = C3694g.f14773z;
        Bundle bundle = new Bundle();
        C1839d[] c1839dArr = C3694g.f14772A;
        C1839d[] c1839dArr2 = c1839dArr;
        String strM8030q = null;
        IBinder iBinderM8003E = null;
        Account account = null;
        String strM8030q2 = null;
        int iM8004F = 0;
        int iM8004F2 = 0;
        int iM8004F3 = 0;
        boolean zM8037x = false;
        int iM8004F4 = 0;
        boolean zM8037x2 = false;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            switch (AbstractC1946b.m8036w(iM8002D)) {
                case 1:
                    iM8004F = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 2:
                    iM8004F2 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 3:
                    iM8004F3 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 4:
                    strM8030q = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
                case 5:
                    iBinderM8003E = AbstractC1946b.m8003E(parcel, iM8002D);
                    break;
                case 6:
                    scopeArr = (Scope[]) AbstractC1946b.m8033t(parcel, iM8002D, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AbstractC1946b.m8019f(parcel, iM8002D);
                    break;
                case 8:
                    account = (Account) AbstractC1946b.m8029p(parcel, iM8002D, Account.CREATOR);
                    break;
                case 9:
                default:
                    AbstractC1946b.m8010L(parcel, iM8002D);
                    break;
                case 10:
                    c1839dArr = (C1839d[]) AbstractC1946b.m8033t(parcel, iM8002D, C1839d.CREATOR);
                    break;
                case 11:
                    c1839dArr2 = (C1839d[]) AbstractC1946b.m8033t(parcel, iM8002D, C1839d.CREATOR);
                    break;
                case 12:
                    zM8037x = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 13:
                    iM8004F4 = AbstractC1946b.m8004F(parcel, iM8002D);
                    break;
                case 14:
                    zM8037x2 = AbstractC1946b.m8037x(parcel, iM8002D);
                    break;
                case 15:
                    strM8030q2 = AbstractC1946b.m8030q(parcel, iM8002D);
                    break;
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C3694g(iM8004F, iM8004F2, iM8004F3, strM8030q, iBinderM8003E, scopeArr, bundle, account, c1839dArr, c1839dArr2, zM8037x, iM8004F4, zM8037x2, strM8030q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3694g[i7];
    }
}
