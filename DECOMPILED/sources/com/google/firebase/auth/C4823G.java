package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.G */
/* JADX INFO: loaded from: classes.dex */
public class C4823G extends AbstractC4854g implements Cloneable {
    public static final Parcelable.Creator<C4823G> CREATOR = new C4845b0();

    /* JADX INFO: renamed from: a */
    private String f18467a;

    /* JADX INFO: renamed from: b */
    private String f18468b;

    /* JADX INFO: renamed from: c */
    private String f18469c;

    /* JADX INFO: renamed from: d */
    private boolean f18470d;

    /* JADX INFO: renamed from: e */
    private String f18471e;

    C4823G(String str, String str2, String str3, boolean z7, String str4) {
        AbstractC3718s.m18073b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f18467a = str;
        this.f18468b = str2;
        this.f18469c = str3;
        this.f18470d = z7;
        this.f18471e = str4;
    }

    /* JADX INFO: renamed from: X */
    public static C4823G m22003X(String str, String str2) {
        return new C4823G(str, str2, null, true, null);
    }

    /* JADX INFO: renamed from: Z */
    public static C4823G m22004Z(String str, String str2) {
        return new C4823G(null, null, str, true, str2);
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return (C4823G) clone();
    }

    /* JADX INFO: renamed from: W */
    public String m22008W() {
        return this.f18468b;
    }

    /* JADX INFO: renamed from: Y */
    public final C4823G m22009Y(boolean z7) {
        this.f18470d = false;
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m22010a0() {
        return this.f18469c;
    }

    public /* synthetic */ Object clone() {
        return new C4823G(this.f18467a, m22008W(), this.f18469c, this.f18470d, this.f18471e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18467a, false);
        AbstractC1947c.m8044E(parcel, 2, m22008W(), false);
        AbstractC1947c.m8044E(parcel, 4, this.f18469c, false);
        AbstractC1947c.m8059g(parcel, 5, this.f18470d);
        AbstractC1947c.m8044E(parcel, 6, this.f18471e, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zzc() {
        return this.f18467a;
    }

    public final String zzd() {
        return this.f18471e;
    }

    public final boolean zze() {
        return this.f18470d;
    }
}
