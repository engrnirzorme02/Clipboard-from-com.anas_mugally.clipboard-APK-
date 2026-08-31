package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p177X2.AbstractC1947c;
import p267i3.C5694a;
import p267i3.C5697d;
import p267i3.C5698e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new C3794a();

    /* JADX INFO: renamed from: a */
    private final Integer f14955a;

    /* JADX INFO: renamed from: b */
    private final Double f14956b;

    /* JADX INFO: renamed from: c */
    private final Uri f14957c;

    /* JADX INFO: renamed from: d */
    private final List f14958d;

    /* JADX INFO: renamed from: e */
    private final List f14959e;

    /* JADX INFO: renamed from: f */
    private final C5694a f14960f;

    /* JADX INFO: renamed from: r */
    private final String f14961r;

    /* JADX INFO: renamed from: s */
    private Set f14962s;

    RegisterRequestParams(Integer num, Double d7, Uri uri, List list, List list2, C5694a c5694a, String str) {
        this.f14955a = num;
        this.f14956b = d7;
        this.f14957c = uri;
        AbstractC3718s.m18073b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.f14958d = list;
        this.f14959e = list2;
        this.f14960f = c5694a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5697d c5697d = (C5697d) it.next();
            AbstractC3718s.m18073b((uri == null && c5697d.m25260T() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (c5697d.m25260T() != null) {
                hashSet.add(Uri.parse(c5697d.m25260T()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C5698e c5698e = (C5698e) it2.next();
            AbstractC3718s.m18073b((uri == null && c5698e.m25263T() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (c5698e.m25263T() != null) {
                hashSet.add(Uri.parse(c5698e.m25263T()));
            }
        }
        this.f14962s = hashSet;
        AbstractC3718s.m18073b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f14961r = str;
    }

    /* JADX INFO: renamed from: T */
    public Uri m18246T() {
        return this.f14957c;
    }

    /* JADX INFO: renamed from: U */
    public C5694a m18247U() {
        return this.f14960f;
    }

    /* JADX INFO: renamed from: V */
    public String m18248V() {
        return this.f14961r;
    }

    /* JADX INFO: renamed from: W */
    public List m18249W() {
        return this.f14958d;
    }

    /* JADX INFO: renamed from: X */
    public List m18250X() {
        return this.f14959e;
    }

    /* JADX INFO: renamed from: Y */
    public Integer m18251Y() {
        return this.f14955a;
    }

    /* JADX INFO: renamed from: Z */
    public Double m18252Z() {
        return this.f14956b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return AbstractC3714q.m18053b(this.f14955a, registerRequestParams.f14955a) && AbstractC3714q.m18053b(this.f14956b, registerRequestParams.f14956b) && AbstractC3714q.m18053b(this.f14957c, registerRequestParams.f14957c) && AbstractC3714q.m18053b(this.f14958d, registerRequestParams.f14958d) && (((list = this.f14959e) == null && registerRequestParams.f14959e == null) || (list != null && (list2 = registerRequestParams.f14959e) != null && list.containsAll(list2) && registerRequestParams.f14959e.containsAll(this.f14959e))) && AbstractC3714q.m18053b(this.f14960f, registerRequestParams.f14960f) && AbstractC3714q.m18053b(this.f14961r, registerRequestParams.f14961r);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14955a, this.f14957c, this.f14956b, this.f14958d, this.f14959e, this.f14960f, this.f14961r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8075w(parcel, 2, m18251Y(), false);
        AbstractC1947c.m8067o(parcel, 3, m18252Z(), false);
        AbstractC1947c.m8042C(parcel, 4, m18246T(), i7, false);
        AbstractC1947c.m8048I(parcel, 5, m18249W(), false);
        AbstractC1947c.m8048I(parcel, 6, m18250X(), false);
        AbstractC1947c.m8042C(parcel, 7, m18247U(), i7, false);
        AbstractC1947c.m8044E(parcel, 8, m18248V(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
