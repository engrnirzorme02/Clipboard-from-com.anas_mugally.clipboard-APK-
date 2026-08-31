package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.y */
/* JADX INFO: loaded from: classes.dex */
public class C4884y extends AbstractC4854g {
    public static final Parcelable.Creator<C4884y> CREATOR = new C4840Y();

    /* JADX INFO: renamed from: a */
    private final String f18562a;

    /* JADX INFO: renamed from: b */
    private final String f18563b;

    C4884y(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f18562a = str;
        this.f18563b = str2;
    }

    /* JADX INFO: renamed from: W */
    public static zzajb m22062W(C4884y c4884y, String str) {
        AbstractC3718s.m18083l(c4884y);
        return new zzajb(c4884y.f18562a, c4884y.f18563b, c4884y.mo22005T(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4884y(this.f18562a, this.f18563b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18562a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f18563b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
