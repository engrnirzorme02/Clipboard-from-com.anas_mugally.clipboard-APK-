package p316o4;

import org.json.JSONObject;
import p252g4.InterfaceC5464B;

/* JADX INFO: renamed from: o4.m */
/* JADX INFO: loaded from: classes.dex */
class C6592m implements InterfaceC6588i {
    C6592m() {
    }

    /* JADX INFO: renamed from: b */
    private static C6583d.a m27927b(JSONObject jSONObject) {
        return new C6583d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    /* JADX INFO: renamed from: c */
    private static C6583d.b m27928c(JSONObject jSONObject) {
        return new C6583d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    /* JADX INFO: renamed from: d */
    private static long m27929d(InterfaceC5464B interfaceC5464B, long j7, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : interfaceC5464B.mo24673a() + (j7 * 1000);
    }

    @Override // p316o4.InterfaceC6588i
    /* JADX INFO: renamed from: a */
    public C6583d mo27894a(InterfaceC5464B interfaceC5464B, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new C6583d(m27929d(interfaceC5464B, iOptInt2, jSONObject), jSONObject.has("session") ? m27928c(jSONObject.getJSONObject("session")) : m27928c(new JSONObject()), m27927b(jSONObject.getJSONObject("features")), iOptInt, iOptInt2, jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d), jSONObject.optDouble("on_demand_backoff_base", 1.2d), jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60));
    }
}
