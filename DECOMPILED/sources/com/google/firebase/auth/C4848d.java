package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.d */
/* JADX INFO: loaded from: classes.dex */
public class C4848d extends AbstractC1945a {
    public static final Parcelable.Creator<C4848d> CREATOR = new C4834S();

    /* JADX INFO: renamed from: a */
    private final String f18501a;

    /* JADX INFO: renamed from: b */
    private final String f18502b;

    /* JADX INFO: renamed from: c */
    private final String f18503c;

    /* JADX INFO: renamed from: d */
    private final String f18504d;

    /* JADX INFO: renamed from: e */
    private final boolean f18505e;

    /* JADX INFO: renamed from: f */
    private final String f18506f;

    /* JADX INFO: renamed from: r */
    private final boolean f18507r;

    /* JADX INFO: renamed from: s */
    private String f18508s;

    /* JADX INFO: renamed from: t */
    private int f18509t;

    /* JADX INFO: renamed from: u */
    private String f18510u;

    /* JADX INFO: renamed from: v */
    private final String f18511v;

    C4848d(String str, String str2, String str3, String str4, boolean z7, String str5, boolean z8, String str6, int i7, String str7, String str8) {
        this.f18501a = str;
        this.f18502b = str2;
        this.f18503c = str3;
        this.f18504d = str4;
        this.f18505e = z7;
        this.f18506f = str5;
        this.f18507r = z8;
        this.f18508s = str6;
        this.f18509t = i7;
        this.f18510u = str7;
        this.f18511v = str8;
    }

    /* JADX INFO: renamed from: T */
    public boolean m22023T() {
        return this.f18507r;
    }

    /* JADX INFO: renamed from: U */
    public boolean m22024U() {
        return this.f18505e;
    }

    /* JADX INFO: renamed from: V */
    public String m22025V() {
        return this.f18506f;
    }

    /* JADX INFO: renamed from: W */
    public String m22026W() {
        return this.f18504d;
    }

    /* JADX INFO: renamed from: X */
    public String m22027X() {
        return this.f18502b;
    }

    /* JADX INFO: renamed from: Y */
    public String m22028Y() {
        return this.f18511v;
    }

    /* JADX INFO: renamed from: Z */
    public String m22029Z() {
        return this.f18501a;
    }

    /* JADX INFO: renamed from: a0 */
    public final int m22030a0() {
        return this.f18509t;
    }

    /* JADX INFO: renamed from: b0 */
    public final void m22031b0(int i7) {
        this.f18509t = i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m22029Z(), false);
        AbstractC1947c.m8044E(parcel, 2, m22027X(), false);
        AbstractC1947c.m8044E(parcel, 3, this.f18503c, false);
        AbstractC1947c.m8044E(parcel, 4, m22026W(), false);
        AbstractC1947c.m8059g(parcel, 5, m22024U());
        AbstractC1947c.m8044E(parcel, 6, m22025V(), false);
        AbstractC1947c.m8059g(parcel, 7, m22023T());
        AbstractC1947c.m8044E(parcel, 8, this.f18508s, false);
        AbstractC1947c.m8072t(parcel, 9, this.f18509t);
        AbstractC1947c.m8044E(parcel, 10, this.f18510u, false);
        AbstractC1947c.m8044E(parcel, 11, m22028Y(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zzc() {
        return this.f18510u;
    }

    public final String zzd() {
        return this.f18503c;
    }

    public final String zze() {
        return this.f18508s;
    }
}
