package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.i */
/* JADX INFO: loaded from: classes.dex */
public class C4858i extends AbstractC4854g {
    public static final Parcelable.Creator<C4858i> CREATOR = new C4865l0();

    /* JADX INFO: renamed from: a */
    private final String f18524a;

    C4858i(String str) {
        this.f18524a = AbstractC3718s.m18077f(str);
    }

    /* JADX INFO: renamed from: W */
    public static zzajb m22039W(C4858i c4858i, String str) {
        AbstractC3718s.m18083l(c4858i);
        return new zzajb(null, c4858i.f18524a, c4858i.mo22005T(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4858i(this.f18524a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18524a, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
