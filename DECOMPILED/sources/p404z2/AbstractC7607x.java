package p404z2;

import org.json.JSONObject;

/* JADX INFO: renamed from: z2.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7607x {
    /* JADX INFO: renamed from: d */
    public static AbstractC7607x m33346d(JSONObject jSONObject) {
        return new C7597n(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo33319a();

    /* JADX INFO: renamed from: b */
    public abstract int mo33320b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo33321c();
}
