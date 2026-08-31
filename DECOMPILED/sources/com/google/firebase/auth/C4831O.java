package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.O */
/* JADX INFO: loaded from: classes.dex */
public class C4831O extends AbstractC4854g {
    public static final Parcelable.Creator<C4831O> CREATOR = new C4853f0();

    /* JADX INFO: renamed from: a */
    private String f18481a;

    /* JADX INFO: renamed from: b */
    private String f18482b;

    C4831O(String str, String str2) {
        this.f18481a = AbstractC3718s.m18077f(str);
        this.f18482b = AbstractC3718s.m18077f(str2);
    }

    /* JADX INFO: renamed from: W */
    public static zzajb m22016W(C4831O c4831o, String str) {
        AbstractC3718s.m18083l(c4831o);
        return new zzajb(null, c4831o.f18481a, c4831o.mo22005T(), null, c4831o.f18482b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4831O(this.f18481a, this.f18482b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18481a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f18482b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
