package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public class SaveAccountLinkingTokenRequest extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new C3543f();

    /* JADX INFO: renamed from: a */
    private final PendingIntent f14435a;

    /* JADX INFO: renamed from: b */
    private final String f14436b;

    /* JADX INFO: renamed from: c */
    private final String f14437c;

    /* JADX INFO: renamed from: d */
    private final List f14438d;

    /* JADX INFO: renamed from: e */
    private final String f14439e;

    /* JADX INFO: renamed from: f */
    private final int f14440f;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$a */
    public static final class C3537a {

        /* JADX INFO: renamed from: a */
        private PendingIntent f14441a;

        /* JADX INFO: renamed from: b */
        private String f14442b;

        /* JADX INFO: renamed from: c */
        private String f14443c;

        /* JADX INFO: renamed from: d */
        private List f14444d = new ArrayList();

        /* JADX INFO: renamed from: e */
        private String f14445e;

        /* JADX INFO: renamed from: f */
        private int f14446f;

        /* JADX INFO: renamed from: a */
        public SaveAccountLinkingTokenRequest m17677a() {
            AbstractC3718s.m18073b(this.f14441a != null, "Consent PendingIntent cannot be null");
            AbstractC3718s.m18073b("auth_code".equals(this.f14442b), "Invalid tokenType");
            AbstractC3718s.m18073b(!TextUtils.isEmpty(this.f14443c), "serviceId cannot be null or empty");
            AbstractC3718s.m18073b(this.f14444d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f14441a, this.f14442b, this.f14443c, this.f14444d, this.f14445e, this.f14446f);
        }

        /* JADX INFO: renamed from: b */
        public C3537a m17678b(PendingIntent pendingIntent) {
            this.f14441a = pendingIntent;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3537a m17679c(List list) {
            this.f14444d = list;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3537a m17680d(String str) {
            this.f14443c = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C3537a m17681e(String str) {
            this.f14442b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public final C3537a m17682f(String str) {
            this.f14445e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public final C3537a m17683g(int i7) {
            this.f14446f = i7;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i7) {
        this.f14435a = pendingIntent;
        this.f14436b = str;
        this.f14437c = str2;
        this.f14438d = list;
        this.f14439e = str3;
        this.f14440f = i7;
    }

    /* JADX INFO: renamed from: T */
    public static C3537a m17671T() {
        return new C3537a();
    }

    /* JADX INFO: renamed from: Y */
    public static C3537a m17672Y(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3718s.m18083l(saveAccountLinkingTokenRequest);
        C3537a c3537aM17671T = m17671T();
        c3537aM17671T.m17679c(saveAccountLinkingTokenRequest.m17674V());
        c3537aM17671T.m17680d(saveAccountLinkingTokenRequest.m17675W());
        c3537aM17671T.m17678b(saveAccountLinkingTokenRequest.m17673U());
        c3537aM17671T.m17681e(saveAccountLinkingTokenRequest.m17676X());
        c3537aM17671T.m17683g(saveAccountLinkingTokenRequest.f14440f);
        String str = saveAccountLinkingTokenRequest.f14439e;
        if (!TextUtils.isEmpty(str)) {
            c3537aM17671T.m17682f(str);
        }
        return c3537aM17671T;
    }

    /* JADX INFO: renamed from: U */
    public PendingIntent m17673U() {
        return this.f14435a;
    }

    /* JADX INFO: renamed from: V */
    public List m17674V() {
        return this.f14438d;
    }

    /* JADX INFO: renamed from: W */
    public String m17675W() {
        return this.f14437c;
    }

    /* JADX INFO: renamed from: X */
    public String m17676X() {
        return this.f14436b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.f14438d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.f14438d;
        return size == list2.size() && list.containsAll(list2) && AbstractC3714q.m18053b(this.f14435a, saveAccountLinkingTokenRequest.f14435a) && AbstractC3714q.m18053b(this.f14436b, saveAccountLinkingTokenRequest.f14436b) && AbstractC3714q.m18053b(this.f14437c, saveAccountLinkingTokenRequest.f14437c) && AbstractC3714q.m18053b(this.f14439e, saveAccountLinkingTokenRequest.f14439e) && this.f14440f == saveAccountLinkingTokenRequest.f14440f;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14435a, this.f14436b, this.f14437c, this.f14438d, this.f14439e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, m17673U(), i7, false);
        AbstractC1947c.m8044E(parcel, 2, m17676X(), false);
        AbstractC1947c.m8044E(parcel, 3, m17675W(), false);
        AbstractC1947c.m8046G(parcel, 4, m17674V(), false);
        AbstractC1947c.m8044E(parcel, 5, this.f14439e, false);
        AbstractC1947c.m8072t(parcel, 6, this.f14440f);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
