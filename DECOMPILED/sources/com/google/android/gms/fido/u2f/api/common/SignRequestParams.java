package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p177X2.AbstractC1947c;
import p267i3.C5694a;
import p267i3.C5698e;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new C3795b();

    /* JADX INFO: renamed from: a */
    private final Integer f14963a;

    /* JADX INFO: renamed from: b */
    private final Double f14964b;

    /* JADX INFO: renamed from: c */
    private final Uri f14965c;

    /* JADX INFO: renamed from: d */
    private final byte[] f14966d;

    /* JADX INFO: renamed from: e */
    private final List f14967e;

    /* JADX INFO: renamed from: f */
    private final C5694a f14968f;

    /* JADX INFO: renamed from: r */
    private final String f14969r;

    /* JADX INFO: renamed from: s */
    private final Set f14970s;

    SignRequestParams(Integer num, Double d7, Uri uri, byte[] bArr, List list, C5694a c5694a, String str) {
        this.f14963a = num;
        this.f14964b = d7;
        this.f14965c = uri;
        this.f14966d = bArr;
        this.f14967e = list;
        this.f14968f = c5694a;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5698e c5698e = (C5698e) it.next();
                AbstractC3718s.m18073b((c5698e.m25263T() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                c5698e.m25264U();
                AbstractC3718s.m18073b(true, "register request has null challenge and no default challenge isprovided");
                if (c5698e.m25263T() != null) {
                    hashSet.add(Uri.parse(c5698e.m25263T()));
                }
            }
        }
        this.f14970s = hashSet;
        AbstractC3718s.m18073b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.f14969r = str;
    }

    /* JADX INFO: renamed from: T */
    public Uri m18253T() {
        return this.f14965c;
    }

    /* JADX INFO: renamed from: U */
    public C5694a m18254U() {
        return this.f14968f;
    }

    /* JADX INFO: renamed from: V */
    public byte[] m18255V() {
        return this.f14966d;
    }

    /* JADX INFO: renamed from: W */
    public String m18256W() {
        return this.f14969r;
    }

    /* JADX INFO: renamed from: X */
    public List m18257X() {
        return this.f14967e;
    }

    /* JADX INFO: renamed from: Y */
    public Integer m18258Y() {
        return this.f14963a;
    }

    /* JADX INFO: renamed from: Z */
    public Double m18259Z() {
        return this.f14964b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return AbstractC3714q.m18053b(this.f14963a, signRequestParams.f14963a) && AbstractC3714q.m18053b(this.f14964b, signRequestParams.f14964b) && AbstractC3714q.m18053b(this.f14965c, signRequestParams.f14965c) && Arrays.equals(this.f14966d, signRequestParams.f14966d) && this.f14967e.containsAll(signRequestParams.f14967e) && signRequestParams.f14967e.containsAll(this.f14967e) && AbstractC3714q.m18053b(this.f14968f, signRequestParams.f14968f) && AbstractC3714q.m18053b(this.f14969r, signRequestParams.f14969r);
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14963a, this.f14965c, this.f14964b, this.f14967e, this.f14968f, this.f14969r, Integer.valueOf(Arrays.hashCode(this.f14966d)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8075w(parcel, 2, m18258Y(), false);
        AbstractC1947c.m8067o(parcel, 3, m18259Z(), false);
        AbstractC1947c.m8042C(parcel, 4, m18253T(), i7, false);
        AbstractC1947c.m8063k(parcel, 5, m18255V(), false);
        AbstractC1947c.m8048I(parcel, 6, m18257X(), false);
        AbstractC1947c.m8042C(parcel, 7, m18254U(), i7, false);
        AbstractC1947c.m8044E(parcel, 8, m18256W(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
