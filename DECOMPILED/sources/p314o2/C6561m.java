package p314o2;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6561m extends C6550b {

    /* JADX INFO: renamed from: e */
    private final C6571w f24761e;

    public C6561m(int i7, String str, String str2, C6550b c6550b, C6571w c6571w) {
        super(i7, str, str2, c6550b);
        this.f24761e = c6571w;
    }

    @Override // p314o2.C6550b
    /* JADX INFO: renamed from: e */
    public final JSONObject mo27811e() throws JSONException {
        JSONObject jSONObjectMo27811e = super.mo27811e();
        C6571w c6571wM27853f = m27853f();
        if (c6571wM27853f == null) {
            jSONObjectMo27811e.put("Response Info", "null");
            return jSONObjectMo27811e;
        }
        jSONObjectMo27811e.put("Response Info", c6571wM27853f.m27866d());
        return jSONObjectMo27811e;
    }

    /* JADX INFO: renamed from: f */
    public C6571w m27853f() {
        return this.f24761e;
    }

    @Override // p314o2.C6550b
    public String toString() {
        try {
            return mo27811e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
