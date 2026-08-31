package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C3673Q extends AbstractC1945a {
    public static final Parcelable.Creator<C3673Q> CREATOR = new C3674S();

    /* JADX INFO: renamed from: a */
    final int f14730a;

    /* JADX INFO: renamed from: b */
    private final Account f14731b;

    /* JADX INFO: renamed from: c */
    private final int f14732c;

    /* JADX INFO: renamed from: d */
    private final GoogleSignInAccount f14733d;

    C3673Q(int i7, Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this.f14730a = i7;
        this.f14731b = account;
        this.f14732c = i8;
        this.f14733d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14730a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8042C(parcel, 2, this.f14731b, i7, false);
        AbstractC1947c.m8072t(parcel, 3, this.f14732c);
        AbstractC1947c.m8042C(parcel, 4, this.f14733d, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C3673Q(Account account, int i7, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i7, googleSignInAccount);
    }
}
