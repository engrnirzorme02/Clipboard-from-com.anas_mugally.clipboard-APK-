package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p142S2.C1390a;
import p142S2.C1391b;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractC1945a implements C3553a.d, ReflectedParcelable {

    /* JADX INFO: renamed from: B */
    public static final Scope f14467B;

    /* JADX INFO: renamed from: C */
    public static final Scope f14468C;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: D */
    private static final Comparator f14469D;

    /* JADX INFO: renamed from: w */
    public static final GoogleSignInOptions f14470w;

    /* JADX INFO: renamed from: x */
    public static final GoogleSignInOptions f14471x;

    /* JADX INFO: renamed from: a */
    final int f14474a;

    /* JADX INFO: renamed from: b */
    private final ArrayList f14475b;

    /* JADX INFO: renamed from: c */
    private Account f14476c;

    /* JADX INFO: renamed from: d */
    private boolean f14477d;

    /* JADX INFO: renamed from: e */
    private final boolean f14478e;

    /* JADX INFO: renamed from: f */
    private final boolean f14479f;

    /* JADX INFO: renamed from: r */
    private String f14480r;

    /* JADX INFO: renamed from: s */
    private String f14481s;

    /* JADX INFO: renamed from: t */
    private ArrayList f14482t;

    /* JADX INFO: renamed from: u */
    private String f14483u;

    /* JADX INFO: renamed from: v */
    private Map f14484v;

    /* JADX INFO: renamed from: y */
    public static final Scope f14472y = new Scope("profile");

    /* JADX INFO: renamed from: z */
    public static final Scope f14473z = new Scope("email");

    /* JADX INFO: renamed from: A */
    public static final Scope f14466A = new Scope("openid");

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f14467B = scope;
        f14468C = new Scope("https://www.googleapis.com/auth/games");
        C3544a c3544a = new C3544a();
        c3544a.m17721c();
        c3544a.m17723e();
        f14470w = c3544a.m17719a();
        C3544a c3544a2 = new C3544a();
        c3544a2.m17724f(scope, new Scope[0]);
        f14471x = c3544a2.m17719a();
        CREATOR = new C3549e();
        f14469D = new C3548d();
    }

    /* JADX INFO: renamed from: c0 */
    public static GoogleSignInOptions m17698c0(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static Map m17708n0(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1390a c1390a = (C1390a) it.next();
                map.put(Integer.valueOf(c1390a.m5966T()), c1390a);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: T */
    public Account m17709T() {
        return this.f14476c;
    }

    /* JADX INFO: renamed from: U */
    public ArrayList m17710U() {
        return this.f14482t;
    }

    /* JADX INFO: renamed from: V */
    public String m17711V() {
        return this.f14483u;
    }

    /* JADX INFO: renamed from: W */
    public ArrayList m17712W() {
        return new ArrayList(this.f14475b);
    }

    /* JADX INFO: renamed from: X */
    public String m17713X() {
        return this.f14480r;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m17714Y() {
        return this.f14479f;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m17715Z() {
        return this.f14477d;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m17716a0() {
        return this.f14478e;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f14482t.isEmpty() && googleSignInOptions.f14482t.isEmpty() && this.f14475b.size() == googleSignInOptions.m17712W().size() && this.f14475b.containsAll(googleSignInOptions.m17712W())) {
                Account account = this.f14476c;
                if (account == null) {
                    if (googleSignInOptions.m17709T() == null) {
                        if (TextUtils.isEmpty(this.f14480r)) {
                            if (TextUtils.isEmpty(googleSignInOptions.m17713X())) {
                                if (this.f14479f != googleSignInOptions.m17714Y() && this.f14477d == googleSignInOptions.m17715Z() && this.f14478e == googleSignInOptions.m17716a0() && TextUtils.equals(this.f14483u, googleSignInOptions.m17711V())) {
                                    return true;
                                }
                            }
                        } else if (!this.f14480r.equals(googleSignInOptions.m17713X())) {
                            if (this.f14479f != googleSignInOptions.m17714Y()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.m17709T())) {
                    if (TextUtils.isEmpty(this.f14480r)) {
                        if (TextUtils.isEmpty(googleSignInOptions.m17713X())) {
                            if (this.f14479f != googleSignInOptions.m17714Y()) {
                            }
                        }
                    } else if (!this.f14480r.equals(googleSignInOptions.m17713X())) {
                        if (this.f14479f != googleSignInOptions.m17714Y()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public final String m17717g0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f14475b, f14469D);
            Iterator it = this.f14475b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).m17742T());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f14476c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f14477d);
            jSONObject.put("forceCodeForRefreshToken", this.f14479f);
            jSONObject.put("serverAuthRequested", this.f14478e);
            if (!TextUtils.isEmpty(this.f14480r)) {
                jSONObject.put("serverClientId", this.f14480r);
            }
            if (!TextUtils.isEmpty(this.f14481s)) {
                jSONObject.put("hostedDomain", this.f14481s);
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f14475b;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((Scope) arrayList2.get(i7)).m17742T());
        }
        Collections.sort(arrayList);
        C1391b c1391b = new C1391b();
        c1391b.m5967a(arrayList);
        c1391b.m5967a(this.f14476c);
        c1391b.m5967a(this.f14480r);
        c1391b.m5969c(this.f14479f);
        c1391b.m5969c(this.f14477d);
        c1391b.m5969c(this.f14478e);
        c1391b.m5967a(this.f14483u);
        return c1391b.m5968b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14474a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8048I(parcel, 2, m17712W(), false);
        AbstractC1947c.m8042C(parcel, 3, m17709T(), i7, false);
        AbstractC1947c.m8059g(parcel, 4, m17715Z());
        AbstractC1947c.m8059g(parcel, 5, m17716a0());
        AbstractC1947c.m8059g(parcel, 6, m17714Y());
        AbstractC1947c.m8044E(parcel, 7, m17713X(), false);
        AbstractC1947c.m8044E(parcel, 8, this.f14481s, false);
        AbstractC1947c.m8048I(parcel, 9, m17710U(), false);
        AbstractC1947c.m8044E(parcel, 10, m17711V(), false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C3544a {

        /* JADX INFO: renamed from: a */
        private Set f14485a;

        /* JADX INFO: renamed from: b */
        private boolean f14486b;

        /* JADX INFO: renamed from: c */
        private boolean f14487c;

        /* JADX INFO: renamed from: d */
        private boolean f14488d;

        /* JADX INFO: renamed from: e */
        private String f14489e;

        /* JADX INFO: renamed from: f */
        private Account f14490f;

        /* JADX INFO: renamed from: g */
        private String f14491g;

        /* JADX INFO: renamed from: h */
        private Map f14492h;

        /* JADX INFO: renamed from: i */
        private String f14493i;

        public C3544a() {
            this.f14485a = new HashSet();
            this.f14492h = new HashMap();
        }

        /* JADX INFO: renamed from: h */
        private final String m17718h(String str) {
            AbstractC3718s.m18077f(str);
            String str2 = this.f14489e;
            boolean z7 = true;
            if (str2 != null && !str2.equals(str)) {
                z7 = false;
            }
            AbstractC3718s.m18073b(z7, "two different server client ids provided");
            return str;
        }

        /* JADX INFO: renamed from: a */
        public GoogleSignInOptions m17719a() {
            if (this.f14485a.contains(GoogleSignInOptions.f14468C)) {
                Set set = this.f14485a;
                Scope scope = GoogleSignInOptions.f14467B;
                if (set.contains(scope)) {
                    this.f14485a.remove(scope);
                }
            }
            if (this.f14488d && (this.f14490f == null || !this.f14485a.isEmpty())) {
                m17721c();
            }
            return new GoogleSignInOptions(new ArrayList(this.f14485a), this.f14490f, this.f14488d, this.f14486b, this.f14487c, this.f14489e, this.f14491g, this.f14492h, this.f14493i);
        }

        /* JADX INFO: renamed from: b */
        public C3544a m17720b() {
            this.f14485a.add(GoogleSignInOptions.f14473z);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3544a m17721c() {
            this.f14485a.add(GoogleSignInOptions.f14466A);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3544a m17722d(String str) {
            this.f14488d = true;
            m17718h(str);
            this.f14489e = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C3544a m17723e() {
            this.f14485a.add(GoogleSignInOptions.f14472y);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C3544a m17724f(Scope scope, Scope... scopeArr) {
            this.f14485a.add(scope);
            this.f14485a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3544a m17725g(String str) {
            this.f14493i = str;
            return this;
        }

        public C3544a(GoogleSignInOptions googleSignInOptions) {
            this.f14485a = new HashSet();
            this.f14492h = new HashMap();
            AbstractC3718s.m18083l(googleSignInOptions);
            this.f14485a = new HashSet(googleSignInOptions.f14475b);
            this.f14486b = googleSignInOptions.f14478e;
            this.f14487c = googleSignInOptions.f14479f;
            this.f14488d = googleSignInOptions.f14477d;
            this.f14489e = googleSignInOptions.f14480r;
            this.f14490f = googleSignInOptions.f14476c;
            this.f14491g = googleSignInOptions.f14481s;
            this.f14492h = GoogleSignInOptions.m17708n0(googleSignInOptions.f14482t);
            this.f14493i = googleSignInOptions.f14483u;
        }
    }

    GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z7, boolean z8, boolean z9, String str, String str2, ArrayList arrayList2, String str3) {
        this(i7, arrayList, account, z7, z8, z9, str, str2, m17708n0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i7, ArrayList arrayList, Account account, boolean z7, boolean z8, boolean z9, String str, String str2, Map map, String str3) {
        this.f14474a = i7;
        this.f14475b = arrayList;
        this.f14476c = account;
        this.f14477d = z7;
        this.f14478e = z8;
        this.f14479f = z9;
        this.f14480r = str;
        this.f14481s = str2;
        this.f14482t = new ArrayList(map.values());
        this.f14484v = map;
        this.f14483u = str3;
    }
}
