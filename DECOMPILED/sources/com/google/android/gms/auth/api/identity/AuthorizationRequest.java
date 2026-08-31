package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new C3538a();

    /* JADX INFO: renamed from: a */
    private final List f14402a;

    /* JADX INFO: renamed from: b */
    private final String f14403b;

    /* JADX INFO: renamed from: c */
    private final boolean f14404c;

    /* JADX INFO: renamed from: d */
    private final boolean f14405d;

    /* JADX INFO: renamed from: e */
    private final Account f14406e;

    /* JADX INFO: renamed from: f */
    private final String f14407f;

    /* JADX INFO: renamed from: r */
    private final String f14408r;

    /* JADX INFO: renamed from: s */
    private final boolean f14409s;

    /* JADX INFO: renamed from: t */
    private final Bundle f14410t;

    /* JADX INFO: renamed from: u */
    private final boolean f14411u;

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.AuthorizationRequest$a */
    public static final class C3533a {

        /* JADX INFO: renamed from: a */
        private List f14412a;

        /* JADX INFO: renamed from: b */
        private String f14413b;

        /* JADX INFO: renamed from: c */
        private boolean f14414c;

        /* JADX INFO: renamed from: d */
        private boolean f14415d;

        /* JADX INFO: renamed from: e */
        private Account f14416e;

        /* JADX INFO: renamed from: f */
        private String f14417f;

        /* JADX INFO: renamed from: g */
        private String f14418g;

        /* JADX INFO: renamed from: h */
        private boolean f14419h;

        /* JADX INFO: renamed from: i */
        private Bundle f14420i;

        /* JADX INFO: renamed from: j */
        private boolean f14421j;

        /* JADX INFO: renamed from: j */
        private final String m17650j(String str) {
            AbstractC3718s.m18083l(str);
            String str2 = this.f14413b;
            boolean z7 = true;
            if (str2 != null && !str2.equals(str)) {
                z7 = false;
            }
            AbstractC3718s.m18073b(z7, "two different server client ids provided");
            return str;
        }

        /* JADX INFO: renamed from: a */
        public C3533a m17651a(EnumC3534b enumC3534b, String str) {
            AbstractC3718s.m18084m(enumC3534b, "Resource parameter cannot be null");
            AbstractC3718s.m18084m(str, "Resource parameter value cannot be null");
            if (this.f14420i == null) {
                this.f14420i = new Bundle();
            }
            this.f14420i.putString(enumC3534b.f14429a, str);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AuthorizationRequest m17652b() {
            return new AuthorizationRequest(this.f14412a, this.f14413b, this.f14414c, this.f14415d, this.f14416e, this.f14417f, this.f14418g, this.f14419h, this.f14420i, this.f14421j);
        }

        /* JADX INFO: renamed from: c */
        public C3533a m17653c(String str) {
            this.f14417f = AbstractC3718s.m18077f(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3533a m17654d(String str, boolean z7) {
            m17650j(str);
            this.f14413b = str;
            this.f14414c = true;
            this.f14419h = z7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C3533a m17655e(Account account) {
            this.f14416e = (Account) AbstractC3718s.m18083l(account);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C3533a m17656f(boolean z7) {
            this.f14421j = z7;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3533a m17657g(List list) {
            boolean z7 = false;
            if (list != null && !list.isEmpty()) {
                z7 = true;
            }
            AbstractC3718s.m18073b(z7, "requestedScopes cannot be null or empty");
            this.f14412a = list;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final C3533a m17658h(String str) {
            m17650j(str);
            this.f14413b = str;
            this.f14415d = true;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public final C3533a m17659i(String str) {
            this.f14418g = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.identity.AuthorizationRequest$b */
    public enum EnumC3534b {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");


        /* JADX INFO: renamed from: a */
        final String f14429a;

        EnumC3534b(String str) {
            this.f14429a = str;
        }
    }

    AuthorizationRequest(List list, String str, boolean z7, boolean z8, Account account, String str2, String str3, boolean z9, Bundle bundle, boolean z10) {
        boolean z11 = false;
        if (list != null && !list.isEmpty()) {
            z11 = true;
        }
        AbstractC3718s.m18073b(z11, "requestedScopes cannot be null or empty");
        this.f14402a = list;
        this.f14403b = str;
        this.f14404c = z7;
        this.f14405d = z8;
        this.f14406e = account;
        this.f14407f = str2;
        this.f14408r = str3;
        this.f14409s = z9;
        this.f14410t = bundle;
        this.f14411u = z10;
    }

    /* JADX INFO: renamed from: T */
    public static C3533a m17640T() {
        return new C3533a();
    }

    /* JADX INFO: renamed from: c0 */
    public static C3533a m17641c0(AuthorizationRequest authorizationRequest) {
        EnumC3534b enumC3534b;
        AbstractC3718s.m18083l(authorizationRequest);
        C3533a c3533aM17640T = m17640T();
        c3533aM17640T.m17657g(authorizationRequest.m17645X());
        Bundle bundleM17646Y = authorizationRequest.m17646Y();
        if (bundleM17646Y != null) {
            for (String str : bundleM17646Y.keySet()) {
                String string = bundleM17646Y.getString(str);
                EnumC3534b[] enumC3534bArrValues = EnumC3534b.values();
                int length = enumC3534bArrValues.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        enumC3534b = null;
                        break;
                    }
                    enumC3534b = enumC3534bArrValues[i7];
                    if (enumC3534b.f14429a.equals(str)) {
                        break;
                    }
                    i7++;
                }
                if (string != null && enumC3534b != null) {
                    c3533aM17640T.m17651a(enumC3534b, string);
                }
            }
        }
        boolean zM17648a0 = authorizationRequest.m17648a0();
        String str2 = authorizationRequest.f14408r;
        String strM17643V = authorizationRequest.m17643V();
        Account accountM17642U = authorizationRequest.m17642U();
        String strM17647Z = authorizationRequest.m17647Z();
        if (str2 != null) {
            c3533aM17640T.m17659i(str2);
        }
        if (strM17643V != null) {
            c3533aM17640T.m17653c(strM17643V);
        }
        if (accountM17642U != null) {
            c3533aM17640T.m17655e(accountM17642U);
        }
        if (authorizationRequest.f14405d && strM17647Z != null) {
            c3533aM17640T.m17658h(strM17647Z);
        }
        if (authorizationRequest.m17649b0() && strM17647Z != null) {
            c3533aM17640T.m17654d(strM17647Z, zM17648a0);
        }
        c3533aM17640T.m17656f(authorizationRequest.f14411u);
        return c3533aM17640T;
    }

    /* JADX INFO: renamed from: U */
    public Account m17642U() {
        return this.f14406e;
    }

    /* JADX INFO: renamed from: V */
    public String m17643V() {
        return this.f14407f;
    }

    /* JADX INFO: renamed from: W */
    public boolean m17644W() {
        return this.f14411u;
    }

    /* JADX INFO: renamed from: X */
    public List m17645X() {
        return this.f14402a;
    }

    /* JADX INFO: renamed from: Y */
    public Bundle m17646Y() {
        return this.f14410t;
    }

    /* JADX INFO: renamed from: Z */
    public String m17647Z() {
        return this.f14403b;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m17648a0() {
        return this.f14409s;
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m17649b0() {
        return this.f14404c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.f14402a;
        int size = list.size();
        List list2 = authorizationRequest.f14402a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.f14410t;
            Bundle bundle2 = this.f14410t;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!AbstractC3714q.m18053b(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.f14404c == authorizationRequest.f14404c && this.f14409s == authorizationRequest.f14409s && this.f14405d == authorizationRequest.f14405d && this.f14411u == authorizationRequest.f14411u && AbstractC3714q.m18053b(this.f14403b, authorizationRequest.f14403b) && AbstractC3714q.m18053b(this.f14406e, authorizationRequest.f14406e) && AbstractC3714q.m18053b(this.f14407f, authorizationRequest.f14407f) && AbstractC3714q.m18053b(this.f14408r, authorizationRequest.f14408r)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3714q.m18054c(this.f14402a, this.f14403b, Boolean.valueOf(this.f14404c), Boolean.valueOf(this.f14409s), Boolean.valueOf(this.f14405d), this.f14406e, this.f14407f, this.f14408r, this.f14410t, Boolean.valueOf(this.f14411u));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, m17645X(), false);
        AbstractC1947c.m8044E(parcel, 2, m17647Z(), false);
        AbstractC1947c.m8059g(parcel, 3, m17649b0());
        AbstractC1947c.m8059g(parcel, 4, this.f14405d);
        AbstractC1947c.m8042C(parcel, 5, m17642U(), i7, false);
        AbstractC1947c.m8044E(parcel, 6, m17643V(), false);
        AbstractC1947c.m8044E(parcel, 7, this.f14408r, false);
        AbstractC1947c.m8059g(parcel, 8, m17648a0());
        AbstractC1947c.m8062j(parcel, 9, m17646Y(), false);
        AbstractC1947c.m8059g(parcel, 10, m17644W());
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
