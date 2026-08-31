package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.L */
/* JADX INFO: loaded from: classes.dex */
public class C4828L extends AbstractC4854g {
    public static final Parcelable.Creator<C4828L> CREATOR = new C4849d0();

    /* JADX INFO: renamed from: a */
    private final String f18476a;

    C4828L(String str) {
        this.f18476a = AbstractC3718s.m18077f(str);
    }

    /* JADX INFO: renamed from: W */
    public static zzajb m22014W(C4828L c4828l, String str) {
        AbstractC3718s.m18083l(c4828l);
        return new zzajb(null, null, c4828l.mo22005T(), null, null, c4828l.f18476a, str, null, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4828L(this.f18476a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18476a, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
