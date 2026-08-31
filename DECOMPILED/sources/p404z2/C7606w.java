package p404z2;

import org.json.JSONObject;

/* JADX INFO: renamed from: z2.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7606w {

    /* JADX INFO: renamed from: a */
    private final AbstractC7608y f30278a;

    private C7606w(AbstractC7608y abstractC7608y) {
        this.f30278a = abstractC7608y;
    }

    /* JADX INFO: renamed from: b */
    public static C7606w m33344b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new C7606w(jSONObjectOptJSONObject == null ? new C7598o(1, 0, 1.0d, false) : new C7598o(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7608y m33345a() {
        return this.f30278a;
    }
}
