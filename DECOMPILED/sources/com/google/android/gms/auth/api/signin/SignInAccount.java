package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C3551g();

    /* JADX INFO: renamed from: a */
    final String f14494a;

    /* JADX INFO: renamed from: b */
    private final GoogleSignInAccount f14495b;

    /* JADX INFO: renamed from: c */
    final String f14496c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f14495b = googleSignInAccount;
        this.f14494a = AbstractC3718s.m18078g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f14496c = AbstractC3718s.m18078g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    /* JADX INFO: renamed from: T */
    public final GoogleSignInAccount m17726T() {
        return this.f14495b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f14494a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 4, str, false);
        AbstractC1947c.m8042C(parcel, 7, this.f14495b, i7, false);
        AbstractC1947c.m8044E(parcel, 8, this.f14496c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
