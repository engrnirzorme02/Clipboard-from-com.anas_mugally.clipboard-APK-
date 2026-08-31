package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzac;
import com.google.android.gms.internal.p411firebaseauthapi.zzajb;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4861j0 extends AbstractC4820F {
    public static final Parcelable.Creator<C4861j0> CREATOR = new C4859i0();

    /* JADX INFO: renamed from: a */
    private final String f18532a;

    /* JADX INFO: renamed from: b */
    private final String f18533b;

    /* JADX INFO: renamed from: c */
    private final String f18534c;

    /* JADX INFO: renamed from: d */
    private final zzajb f18535d;

    /* JADX INFO: renamed from: e */
    private final String f18536e;

    /* JADX INFO: renamed from: f */
    private final String f18537f;

    /* JADX INFO: renamed from: r */
    private final String f18538r;

    C4861j0(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.f18532a = zzac.zzb(str);
        this.f18533b = str2;
        this.f18534c = str3;
        this.f18535d = zzajbVar;
        this.f18536e = str4;
        this.f18537f = str5;
        this.f18538r = str6;
    }

    /* JADX INFO: renamed from: Z */
    public static zzajb m22051Z(C4861j0 c4861j0, String str) {
        AbstractC3718s.m18083l(c4861j0);
        zzajb zzajbVar = c4861j0.f18535d;
        return zzajbVar != null ? zzajbVar : new zzajb(c4861j0.mo21971X(), c4861j0.mo21970W(), c4861j0.mo22005T(), null, c4861j0.mo21972Y(), null, str, c4861j0.f18536e, c4861j0.f18538r);
    }

    /* JADX INFO: renamed from: a0 */
    public static C4861j0 m22052a0(zzajb zzajbVar) {
        AbstractC3718s.m18084m(zzajbVar, "Must specify a non-null webSignInCredential");
        return new C4861j0(null, null, null, zzajbVar, null, null, null);
    }

    /* JADX INFO: renamed from: b0 */
    public static C4861j0 m22053b0(String str, String str2, String str3, String str4, String str5) {
        AbstractC3718s.m18078g(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new C4861j0(str, str2, str3, null, str4, str5, null);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public final String mo22005T() {
        return this.f18532a;
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public final String mo22006U() {
        return this.f18532a;
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4861j0(this.f18532a, this.f18533b, this.f18534c, this.f18535d, this.f18536e, this.f18537f, this.f18538r);
    }

    @Override // com.google.firebase.auth.AbstractC4820F
    /* JADX INFO: renamed from: W */
    public final String mo21970W() {
        return this.f18534c;
    }

    @Override // com.google.firebase.auth.AbstractC4820F
    /* JADX INFO: renamed from: X */
    public final String mo21971X() {
        return this.f18533b;
    }

    @Override // com.google.firebase.auth.AbstractC4820F
    /* JADX INFO: renamed from: Y */
    public final String mo21972Y() {
        return this.f18537f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, mo22005T(), false);
        AbstractC1947c.m8044E(parcel, 2, mo21971X(), false);
        AbstractC1947c.m8044E(parcel, 3, mo21970W(), false);
        AbstractC1947c.m8042C(parcel, 4, this.f18535d, i7, false);
        AbstractC1947c.m8044E(parcel, 5, this.f18536e, false);
        AbstractC1947c.m8044E(parcel, 6, mo21972Y(), false);
        AbstractC1947c.m8044E(parcel, 7, this.f18538r, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
