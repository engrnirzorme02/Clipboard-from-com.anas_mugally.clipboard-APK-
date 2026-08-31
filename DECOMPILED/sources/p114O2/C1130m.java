package p114O2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;
import p259h3.C5631t;

/* JADX INFO: renamed from: O2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1130m extends AbstractC1945a {
    public static final Parcelable.Creator<C1130m> CREATOR = new C1115D();

    /* JADX INFO: renamed from: a */
    private final String f4061a;

    /* JADX INFO: renamed from: b */
    private final String f4062b;

    /* JADX INFO: renamed from: c */
    private final String f4063c;

    /* JADX INFO: renamed from: d */
    private final String f4064d;

    /* JADX INFO: renamed from: e */
    private final Uri f4065e;

    /* JADX INFO: renamed from: f */
    private final String f4066f;

    /* JADX INFO: renamed from: r */
    private final String f4067r;

    /* JADX INFO: renamed from: s */
    private final String f4068s;

    /* JADX INFO: renamed from: t */
    private final C5631t f4069t;

    C1130m(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, C5631t c5631t) {
        this.f4061a = (String) AbstractC3718s.m18083l(str);
        this.f4062b = str2;
        this.f4063c = str3;
        this.f4064d = str4;
        this.f4065e = uri;
        this.f4066f = str5;
        this.f4067r = str6;
        this.f4068s = str7;
        this.f4069t = c5631t;
    }

    /* JADX INFO: renamed from: T */
    public String m4956T() {
        return this.f4062b;
    }

    /* JADX INFO: renamed from: U */
    public String m4957U() {
        return this.f4064d;
    }

    /* JADX INFO: renamed from: V */
    public String m4958V() {
        return this.f4063c;
    }

    /* JADX INFO: renamed from: W */
    public String m4959W() {
        return this.f4067r;
    }

    /* JADX INFO: renamed from: X */
    public String m4960X() {
        return this.f4061a;
    }

    /* JADX INFO: renamed from: Y */
    public String m4961Y() {
        return this.f4066f;
    }

    /* JADX INFO: renamed from: Z */
    public String m4962Z() {
        return this.f4068s;
    }

    /* JADX INFO: renamed from: a0 */
    public Uri m4963a0() {
        return this.f4065e;
    }

    /* JADX INFO: renamed from: b0 */
    public C5631t m4964b0() {
        return this.f4069t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1130m)) {
            return false;
        }
        C1130m c1130m = (C1130m) obj;
        return AbstractC3714q.m18053b(this.f4061a, c1130m.f4061a) && AbstractC3714q.m18053b(this.f4062b, c1130m.f4062b) && AbstractC3714q.m18053b(this.f4063c, c1130m.f4063c) && AbstractC3714q.m18053b(this.f4064d, c1130m.f4064d) && AbstractC3714q.m18053b(this.f4065e, c1130m.f4065e) && AbstractC3714q.m18053b(this.f4066f, c1130m.f4066f) && AbstractC3714q.m18053b(this.f4067r, c1130m.f4067r) && AbstractC3714q.m18053b(this.f4068s, c1130m.f4068s) && AbstractC3714q.m18053b(this.f4069t, c1130m.f4069t);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f4061a, this.f4062b, this.f4063c, this.f4064d, this.f4065e, this.f4066f, this.f4067r, this.f4068s, this.f4069t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, m4960X(), false);
        AbstractC1947c.m8044E(parcel, 2, m4956T(), false);
        AbstractC1947c.m8044E(parcel, 3, m4958V(), false);
        AbstractC1947c.m8044E(parcel, 4, m4957U(), false);
        AbstractC1947c.m8042C(parcel, 5, m4963a0(), i7, false);
        AbstractC1947c.m8044E(parcel, 6, m4961Y(), false);
        AbstractC1947c.m8044E(parcel, 7, m4959W(), false);
        AbstractC1947c.m8044E(parcel, 8, m4962Z(), false);
        AbstractC1947c.m8042C(parcel, 9, m4964b0(), i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
