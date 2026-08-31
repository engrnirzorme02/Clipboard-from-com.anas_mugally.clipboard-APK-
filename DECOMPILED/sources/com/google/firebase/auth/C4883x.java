package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.x */
/* JADX INFO: loaded from: classes.dex */
public class C4883x extends AbstractC4854g {
    public static final Parcelable.Creator<C4883x> CREATOR = new C4839X();

    /* JADX INFO: renamed from: a */
    private String f18561a;

    C4883x(String str) {
        this.f18561a = AbstractC3718s.m18077f(str);
    }

    /* JADX INFO: renamed from: W */
    public static zzajb m22061W(C4883x c4883x, String str) {
        AbstractC3718s.m18083l(c4883x);
        return new zzajb(null, c4883x.f18561a, c4883x.mo22005T(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4883x(this.f18561a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18561a, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
