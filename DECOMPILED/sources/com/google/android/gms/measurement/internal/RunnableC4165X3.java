package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.X3 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4165X3 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f15500a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15501b;

    RunnableC4165X3(C4371x4 c4371x4, Bundle bundle) {
        this.f15500a = bundle;
        Objects.requireNonNull(c4371x4);
        this.f15501b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15501b;
        c4371x4.mo18427h();
        c4371x4.m18748j();
        Bundle bundle = this.f15500a;
        AbstractC3718s.m18083l(bundle);
        String strM18077f = AbstractC3718s.m18077f(bundle.getString("name"));
        if (!c4371x4.f15066a.m18675g()) {
            c4371x4.f15066a.mo18421a().m18859w().m18834a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c4371x4.f15066a.m18668J().m19226d0(new C4246i(bundle.getString("app_id"), "", new C4357v6(strM18077f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c4371x4.f15066a.m18661C().m19382R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
