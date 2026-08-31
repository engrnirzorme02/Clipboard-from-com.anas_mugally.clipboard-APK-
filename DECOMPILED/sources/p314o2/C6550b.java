package p314o2;

import com.google.android.gms.ads.internal.client.C3324b1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o2.b */
/* JADX INFO: loaded from: classes.dex */
public class C6550b {

    /* JADX INFO: renamed from: a */
    private final int f24722a;

    /* JADX INFO: renamed from: b */
    private final String f24723b;

    /* JADX INFO: renamed from: c */
    private final String f24724c;

    /* JADX INFO: renamed from: d */
    private final C6550b f24725d;

    public C6550b(int i7, String str, String str2, C6550b c6550b) {
        this.f24722a = i7;
        this.f24723b = str;
        this.f24724c = str2;
        this.f24725d = c6550b;
    }

    /* JADX INFO: renamed from: a */
    public int m27807a() {
        return this.f24722a;
    }

    /* JADX INFO: renamed from: b */
    public String m27808b() {
        return this.f24724c;
    }

    /* JADX INFO: renamed from: c */
    public String m27809c() {
        return this.f24723b;
    }

    /* JADX INFO: renamed from: d */
    public final C3324b1 m27810d() {
        C3324b1 c3324b1;
        C6550b c6550b = this.f24725d;
        if (c6550b == null) {
            c3324b1 = null;
        } else {
            c3324b1 = new C3324b1(c6550b.f24722a, c6550b.f24723b, c6550b.f24724c, null, null);
        }
        return new C3324b1(this.f24722a, this.f24723b, this.f24724c, c3324b1, null);
    }

    /* JADX INFO: renamed from: e */
    public JSONObject mo27811e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f24722a);
        jSONObject.put("Message", this.f24723b);
        jSONObject.put("Domain", this.f24724c);
        C6550b c6550b = this.f24725d;
        if (c6550b == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", c6550b.mo27811e());
        return jSONObject;
    }

    public String toString() {
        try {
            return mo27811e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public C6550b(int i7, String str, String str2) {
        this(i7, str, str2, null);
    }
}
