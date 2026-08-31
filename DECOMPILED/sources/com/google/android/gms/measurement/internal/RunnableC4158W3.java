package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.W3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4158W3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f15462a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15463b;

    RunnableC4158W3(C4371x4 c4371x4, Bundle bundle) {
        this.f15462a = bundle;
        Objects.requireNonNull(c4371x4);
        this.f15463b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15463b;
        c4371x4.mo18427h();
        c4371x4.m18748j();
        Bundle bundle = this.f15462a;
        AbstractC3718s.m18083l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC3718s.m18077f(string);
        AbstractC3718s.m18077f(string2);
        AbstractC3718s.m18083l(bundle.get("value"));
        if (!c4371x4.f15066a.m18675g()) {
            c4371x4.f15066a.mo18421a().m18859w().m18834a("Conditional property not set since app measurement is disabled");
            return;
        }
        C4357v6 c4357v6 = new C4357v6(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C4164X2 c4164x2 = c4371x4.f15066a;
            C4039G c4039gM19382R = c4164x2.m18661C().m19382R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c4371x4.f15066a.m18668J().m19226d0(new C4246i(bundle.getString("app_id"), string2, c4357v6, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c4164x2.m18661C().m19382R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), c4039gM19382R, bundle.getLong("time_to_live"), c4164x2.m18661C().m19382R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
