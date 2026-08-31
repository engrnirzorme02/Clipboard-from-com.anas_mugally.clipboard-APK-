package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.common.util.InterfaceC3750e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC1945a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C3547c();

    /* JADX INFO: renamed from: y */
    public static final InterfaceC3750e f14452y = C3753h.m18171d();

    /* JADX INFO: renamed from: a */
    final int f14453a;

    /* JADX INFO: renamed from: b */
    private final String f14454b;

    /* JADX INFO: renamed from: c */
    private final String f14455c;

    /* JADX INFO: renamed from: d */
    private final String f14456d;

    /* JADX INFO: renamed from: e */
    private final String f14457e;

    /* JADX INFO: renamed from: f */
    private final Uri f14458f;

    /* JADX INFO: renamed from: r */
    private String f14459r;

    /* JADX INFO: renamed from: s */
    private final long f14460s;

    /* JADX INFO: renamed from: t */
    private final String f14461t;

    /* JADX INFO: renamed from: u */
    final List f14462u;

    /* JADX INFO: renamed from: v */
    private final String f14463v;

    /* JADX INFO: renamed from: w */
    private final String f14464w;

    /* JADX INFO: renamed from: x */
    private final Set f14465x = new HashSet();

    GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f14453a = i7;
        this.f14454b = str;
        this.f14455c = str2;
        this.f14456d = str3;
        this.f14457e = str4;
        this.f14458f = uri;
        this.f14459r = str5;
        this.f14460s = j7;
        this.f14461t = str6;
        this.f14462u = list;
        this.f14463v = str7;
        this.f14464w = str8;
    }

    /* JADX INFO: renamed from: c0 */
    public static GoogleSignInAccount m17684c0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), AbstractC3718s.m18077f(str7), new ArrayList((Collection) AbstractC3718s.m18083l(set)), str5, str6);
    }

    /* JADX INFO: renamed from: d0 */
    public static GoogleSignInAccount m17685d0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j7 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount googleSignInAccountM17684c0 = m17684c0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j7), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountM17684c0.f14459r = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountM17684c0;
    }

    /* JADX INFO: renamed from: T */
    public String m17686T() {
        return this.f14457e;
    }

    /* JADX INFO: renamed from: U */
    public String m17687U() {
        return this.f14456d;
    }

    /* JADX INFO: renamed from: V */
    public String m17688V() {
        return this.f14464w;
    }

    /* JADX INFO: renamed from: W */
    public String m17689W() {
        return this.f14463v;
    }

    /* JADX INFO: renamed from: X */
    public String m17690X() {
        return this.f14454b;
    }

    /* JADX INFO: renamed from: Y */
    public String m17691Y() {
        return this.f14455c;
    }

    /* JADX INFO: renamed from: Z */
    public Uri m17692Z() {
        return this.f14458f;
    }

    /* JADX INFO: renamed from: a0 */
    public Set m17693a0() {
        HashSet hashSet = new HashSet(this.f14462u);
        hashSet.addAll(this.f14465x);
        return hashSet;
    }

    /* JADX INFO: renamed from: b0 */
    public String m17694b0() {
        return this.f14459r;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m17695e0() {
        return this.f14461t;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f14461t.equals(this.f14461t) && googleSignInAccount.m17693a0().equals(m17693a0());
    }

    /* JADX INFO: renamed from: f0 */
    public final String m17696f0() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (m17690X() != null) {
                jSONObject.put("id", m17690X());
            }
            if (m17691Y() != null) {
                jSONObject.put("tokenId", m17691Y());
            }
            if (m17687U() != null) {
                jSONObject.put("email", m17687U());
            }
            if (m17686T() != null) {
                jSONObject.put("displayName", m17686T());
            }
            if (m17689W() != null) {
                jSONObject.put("givenName", m17689W());
            }
            if (m17688V() != null) {
                jSONObject.put("familyName", m17688V());
            }
            Uri uriM17692Z = m17692Z();
            if (uriM17692Z != null) {
                jSONObject.put("photoUrl", uriM17692Z.toString());
            }
            if (m17694b0() != null) {
                jSONObject.put("serverAuthCode", m17694b0());
            }
            jSONObject.put("expirationTime", this.f14460s);
            jSONObject.put("obfuscatedIdentifier", this.f14461t);
            JSONArray jSONArray = new JSONArray();
            List list = this.f14462u;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: R2.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).m17742T().compareTo(((Scope) obj2).m17742T());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.m17742T());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public int hashCode() {
        return ((this.f14461t.hashCode() + 527) * 31) + m17693a0().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14453a);
        AbstractC1947c.m8044E(parcel, 2, m17690X(), false);
        AbstractC1947c.m8044E(parcel, 3, m17691Y(), false);
        AbstractC1947c.m8044E(parcel, 4, m17687U(), false);
        AbstractC1947c.m8044E(parcel, 5, m17686T(), false);
        AbstractC1947c.m8042C(parcel, 6, m17692Z(), i7, false);
        AbstractC1947c.m8044E(parcel, 7, m17694b0(), false);
        AbstractC1947c.m8076x(parcel, 8, this.f14460s);
        AbstractC1947c.m8044E(parcel, 9, this.f14461t, false);
        AbstractC1947c.m8048I(parcel, 10, this.f14462u, false);
        AbstractC1947c.m8044E(parcel, 11, m17689W(), false);
        AbstractC1947c.m8044E(parcel, 12, m17688V(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
