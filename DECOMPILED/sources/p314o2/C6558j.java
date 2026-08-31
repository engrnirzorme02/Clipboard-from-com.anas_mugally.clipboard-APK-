package p314o2;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.ads.internal.client.C3385q2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6558j {

    /* JADX INFO: renamed from: a */
    private final C3385q2 f24758a;

    /* JADX INFO: renamed from: b */
    private final C6550b f24759b;

    private C6558j(C3385q2 c3385q2) {
        this.f24758a = c3385q2;
        C3324b1 c3324b1 = c3385q2.f14077c;
        this.f24759b = c3324b1 == null ? null : c3324b1.m17220T();
    }

    /* JADX INFO: renamed from: e */
    public static C6558j m27842e(C3385q2 c3385q2) {
        if (c3385q2 != null) {
            return new C6558j(c3385q2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m27843a() {
        return this.f24758a.f14080f;
    }

    /* JADX INFO: renamed from: b */
    public String m27844b() {
        return this.f24758a.f14082s;
    }

    /* JADX INFO: renamed from: c */
    public String m27845c() {
        return this.f24758a.f14081r;
    }

    /* JADX INFO: renamed from: d */
    public String m27846d() {
        return this.f24758a.f14079e;
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m27847f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C3385q2 c3385q2 = this.f24758a;
        jSONObject.put("Adapter", c3385q2.f14075a);
        jSONObject.put("Latency", c3385q2.f14076b);
        String strM27846d = m27846d();
        if (strM27846d == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", strM27846d);
        }
        String strM27843a = m27843a();
        if (strM27843a == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", strM27843a);
        }
        String strM27845c = m27845c();
        if (strM27845c == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", strM27845c);
        }
        String strM27844b = m27844b();
        if (strM27844b == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", strM27844b);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = c3385q2.f14078d;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        C6550b c6550b = this.f24759b;
        if (c6550b == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", c6550b.mo27811e());
        return jSONObject;
    }

    public String toString() {
        try {
            return m27847f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
