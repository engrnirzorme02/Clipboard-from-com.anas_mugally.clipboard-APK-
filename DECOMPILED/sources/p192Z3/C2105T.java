package p192Z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.internal.p411firebaseauthapi.zzaao;
import com.google.android.gms.internal.p411firebaseauthapi.zzahv;
import com.google.firebase.auth.AbstractC4817C;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import com.google.firebase.auth.C4843a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p164V3.C1762g;
import p191Z2.C2086a;

/* JADX INFO: renamed from: Z3.T */
/* JADX INFO: loaded from: classes.dex */
public final class C2105T {

    /* JADX INFO: renamed from: a */
    private Context f6912a;

    /* JADX INFO: renamed from: b */
    private String f6913b;

    /* JADX INFO: renamed from: c */
    private SharedPreferences f6914c;

    /* JADX INFO: renamed from: d */
    private C2086a f6915d;

    public C2105T(Context context, String str) {
        AbstractC3718s.m18083l(context);
        this.f6913b = AbstractC3718s.m18077f(str);
        this.f6912a = context.getApplicationContext();
        this.f6914c = this.f6912a.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", this.f6913b), 0);
        this.f6915d = new C2086a("StorageHelpers", new String[0]);
    }

    /* JADX INFO: renamed from: a */
    private final C2126h m8658a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C2130j c2130jM8731a;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z7 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i7 = 0; i7 < length; i7++) {
                arrayList.add(C2118d.m8694Y(jSONArray3.getString(i7)));
            }
            C2126h c2126h = new C2126h(C1762g.m7395n(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                c2126h.mo8715f0(zzahv.zzb(string));
            }
            if (!z7) {
                c2126h.mo8716g0();
            }
            c2126h.m8721l0(str);
            if (jSONObject.has("userMetadata") && (c2130jM8731a = C2130j.m8731a(jSONObject.getJSONObject("userMetadata"))) != null) {
                c2126h.m8722m0(c2130jM8731a);
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i8));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? C4827K.m22012Z(jSONObject2) : Objects.equals(strOptString, "totp") ? C4830N.m22015Y(jSONObject2) : null);
                }
                c2126h.mo8719j0(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    arrayList3.add(C4843a0.m22021U(new JSONObject(jSONArray.getString(i9))));
                }
                c2126h.mo8717h0(arrayList3);
            }
            return c2126h;
        } catch (zzaao e7) {
            e = e7;
            this.f6915d.m8622j(e);
            return null;
        } catch (ArrayIndexOutOfBoundsException e8) {
            e = e8;
            this.f6915d.m8622j(e);
            return null;
        } catch (IllegalArgumentException e9) {
            e = e9;
            this.f6915d.m8622j(e);
            return null;
        } catch (JSONException e10) {
            e = e10;
            this.f6915d.m8622j(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private final String m8659d(String str) {
        String string = this.f6914c.getString(str, null);
        if (string != null) {
            return string.startsWith("ENCRYPTED:") ? C2102P.m8645a(this.f6912a, this.f6913b).m8649b(string.substring(10)) : string;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final void m8660f(String str, String str2) {
        String strM8650d = C2102P.m8645a(this.f6912a, this.f6913b).m8650d(str2);
        if (strM8650d != null) {
            this.f6914c.edit().putString(str, "ENCRYPTED:" + strM8650d).apply();
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m8661i(String str) {
        this.f6914c.edit().remove(str).apply();
    }

    /* JADX INFO: renamed from: k */
    private final String m8662k(AbstractC4880u abstractC4880u) {
        boolean z7;
        JSONObject jSONObject = new JSONObject();
        if (!(abstractC4880u instanceof C2126h)) {
            return null;
        }
        C2126h c2126h = (C2126h) abstractC4880u;
        try {
            jSONObject.put("cachedTokenState", c2126h.zze());
            jSONObject.put("applicationName", c2126h.mo8713d0().m7406o());
            jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
            if (c2126h.m8727r0() != null) {
                JSONArray jSONArray = new JSONArray();
                List listM8727r0 = c2126h.m8727r0();
                int size = listM8727r0.size();
                if (listM8727r0.size() > 30) {
                    this.f6915d.m8620h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(listM8727r0.size()));
                    size = 30;
                }
                int i7 = 0;
                boolean z8 = false;
                while (true) {
                    z7 = true;
                    if (i7 >= size) {
                        break;
                    }
                    C2118d c2118d = (C2118d) listM8727r0.get(i7);
                    if (c2118d.mo8702g().equals("firebase")) {
                        z8 = true;
                    }
                    if (i7 == size - 1 && !z8) {
                        break;
                    }
                    jSONArray.put(c2118d.m8700Z());
                    i7++;
                }
                if (!z8) {
                    int i8 = size - 1;
                    while (true) {
                        if (i8 >= listM8727r0.size() || i8 < 0) {
                            z7 = z8;
                            break;
                        }
                        C2118d c2118d2 = (C2118d) listM8727r0.get(i8);
                        if (c2118d2.mo8702g().equals("firebase")) {
                            jSONArray.put(c2118d2.m8700Z());
                            break;
                        }
                        if (i8 == listM8727r0.size() - 1) {
                            jSONArray.put(c2118d2.m8700Z());
                        }
                        i8++;
                    }
                    if (!z7) {
                        this.f6915d.m8620h("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(listM8727r0.size()), Integer.valueOf(size));
                        if (listM8727r0.size() < 5) {
                            StringBuilder sb = new StringBuilder("Provider user info list:\n");
                            Iterator it = listM8727r0.iterator();
                            while (it.hasNext()) {
                                sb.append(String.format("Provider - %s\n", ((C2118d) it.next()).mo8702g()));
                            }
                            this.f6915d.m8620h(sb.toString(), new Object[0]);
                        }
                    }
                }
                jSONObject.put("userInfos", jSONArray);
            }
            jSONObject.put("anonymous", c2126h.mo8712c0());
            jSONObject.put("version", "2");
            if (c2126h.mo8706W() != null) {
                jSONObject.put("userMetadata", ((C2130j) c2126h.mo8706W()).m8732b());
            }
            List listMo8735a = ((C2132k) c2126h.mo8707X()).mo8735a();
            if (listMo8735a != null && !listMo8735a.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i9 = 0; i9 < listMo8735a.size(); i9++) {
                    jSONArray2.put(((AbstractC4817C) listMo8735a.get(i9)).mo21969X());
                }
                jSONObject.put("userMultiFactorInfo", jSONArray2);
            }
            List listMo8720k0 = c2126h.mo8720k0();
            if (listMo8720k0 != null && !listMo8720k0.isEmpty()) {
                JSONArray jSONArray3 = new JSONArray();
                for (int i10 = 0; i10 < listMo8720k0.size(); i10++) {
                    jSONArray3.put(C4843a0.m22022V((C4843a0) listMo8720k0.get(i10)));
                }
                jSONObject.put("passkeyInfo", jSONArray3);
            }
            return jSONObject.toString();
        } catch (Exception e7) {
            this.f6915d.m8621i("Failed to turn object into JSON", e7, new Object[0]);
            throw new zzaao(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    public final zzahv m8663b(AbstractC4880u abstractC4880u) {
        AbstractC3718s.m18083l(abstractC4880u);
        String strM8659d = m8659d(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC4880u.mo8711b0()));
        if (strM8659d == null) {
            return null;
        }
        try {
            return zzahv.zzb(strM8659d);
        } catch (zzaao unused) {
            this.f6915d.m8617e("Failed to restore token data from persistent storage.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4880u m8664c() {
        String strM8659d = m8659d("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(strM8659d)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM8659d);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return m8658a(jSONObject);
            }
        } catch (Exception unused) {
            this.f6915d.m8617e("Failed to restore user data from persistent storage.", new Object[0]);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m8665e(AbstractC4880u abstractC4880u, zzahv zzahvVar) {
        AbstractC3718s.m18083l(abstractC4880u);
        AbstractC3718s.m18083l(zzahvVar);
        m8660f(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC4880u.mo8711b0()), zzahvVar.zzf());
    }

    /* JADX INFO: renamed from: g */
    public final void m8666g() {
        m8661i("com.google.firebase.auth.FIREBASE_USER");
    }

    /* JADX INFO: renamed from: h */
    public final void m8667h(AbstractC4880u abstractC4880u) {
        AbstractC3718s.m18083l(abstractC4880u);
        m8661i(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC4880u.mo8711b0()));
    }

    /* JADX INFO: renamed from: j */
    public final void m8668j(AbstractC4880u abstractC4880u) {
        AbstractC3718s.m18083l(abstractC4880u);
        String strM8662k = m8662k(abstractC4880u);
        if (TextUtils.isEmpty(strM8662k)) {
            return;
        }
        m8660f("com.google.firebase.auth.FIREBASE_USER", strM8662k);
    }
}
