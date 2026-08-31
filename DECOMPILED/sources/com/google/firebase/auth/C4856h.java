package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.h */
/* JADX INFO: loaded from: classes.dex */
public class C4856h extends AbstractC4854g {
    public static final Parcelable.Creator<C4856h> CREATOR = new C4863k0();

    /* JADX INFO: renamed from: a */
    private String f18519a;

    /* JADX INFO: renamed from: b */
    private String f18520b;

    /* JADX INFO: renamed from: c */
    private final String f18521c;

    /* JADX INFO: renamed from: d */
    private String f18522d;

    /* JADX INFO: renamed from: e */
    private boolean f18523e;

    C4856h(String str, String str2, String str3, String str4, boolean z7) {
        this.f18519a = AbstractC3718s.m18077f(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f18520b = str2;
        this.f18521c = str3;
        this.f18522d = str4;
        this.f18523e = z7;
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: T */
    public String mo22005T() {
        return "password";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: U */
    public String mo22006U() {
        return !TextUtils.isEmpty(this.f18520b) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.AbstractC4854g
    /* JADX INFO: renamed from: V */
    public final AbstractC4854g mo22007V() {
        return new C4856h(this.f18519a, this.f18520b, this.f18521c, this.f18522d, this.f18523e);
    }

    /* JADX INFO: renamed from: W */
    public final C4856h m22036W(AbstractC4880u abstractC4880u) {
        this.f18522d = abstractC4880u.zze();
        this.f18523e = true;
        return this;
    }

    /* JADX INFO: renamed from: X */
    public final String m22037X() {
        return this.f18522d;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m22038Y() {
        return !TextUtils.isEmpty(this.f18521c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f18519a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f18520b, false);
        AbstractC1947c.m8044E(parcel, 3, this.f18521c, false);
        AbstractC1947c.m8044E(parcel, 4, this.f18522d, false);
        AbstractC1947c.m8059g(parcel, 5, this.f18523e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zzc() {
        return this.f18519a;
    }

    public final String zzd() {
        return this.f18520b;
    }

    public final String zze() {
        return this.f18521c;
    }

    public final boolean zzg() {
        return this.f18523e;
    }
}
