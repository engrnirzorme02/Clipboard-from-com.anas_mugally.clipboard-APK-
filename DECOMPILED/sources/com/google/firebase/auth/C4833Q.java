package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.Q */
/* JADX INFO: loaded from: classes.dex */
public class C4833Q extends AbstractC1945a {
    public static final Parcelable.Creator<C4833Q> CREATOR = new C4855g0();

    /* JADX INFO: renamed from: a */
    private String f18483a;

    /* JADX INFO: renamed from: b */
    private String f18484b;

    /* JADX INFO: renamed from: c */
    private boolean f18485c;

    /* JADX INFO: renamed from: d */
    private boolean f18486d;

    /* JADX INFO: renamed from: e */
    private Uri f18487e;

    C4833Q(String str, String str2, boolean z7, boolean z8) {
        this.f18483a = str;
        this.f18484b = str2;
        this.f18485c = z7;
        this.f18486d = z8;
        this.f18487e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    /* JADX INFO: renamed from: T */
    public String m22017T() {
        return this.f18483a;
    }

    /* JADX INFO: renamed from: U */
    public Uri m22018U() {
        return this.f18487e;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m22019V() {
        return this.f18485c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, m22017T(), false);
        AbstractC1947c.m8044E(parcel, 3, this.f18484b, false);
        AbstractC1947c.m8059g(parcel, 4, this.f18485c);
        AbstractC1947c.m8059g(parcel, 5, this.f18486d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zza() {
        return this.f18484b;
    }

    public final boolean zzc() {
        return this.f18486d;
    }
}
