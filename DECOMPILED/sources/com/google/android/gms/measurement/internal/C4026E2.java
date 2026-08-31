package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC3718s;
import p283k3.EnumC6051v;
import p356t2.C7073a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.E2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4026E2 extends AbstractC4003B3 {

    /* JADX INFO: renamed from: A */
    static final Pair f15168A = new Pair("", 0L);

    /* JADX INFO: renamed from: c */
    private SharedPreferences f15169c;

    /* JADX INFO: renamed from: d */
    private SharedPreferences f15170d;

    /* JADX INFO: renamed from: e */
    public C4010C2 f15171e;

    /* JADX INFO: renamed from: f */
    public final C4002B2 f15172f;

    /* JADX INFO: renamed from: g */
    public final C4002B2 f15173g;

    /* JADX INFO: renamed from: h */
    public final C4018D2 f15174h;

    /* JADX INFO: renamed from: i */
    private String f15175i;

    /* JADX INFO: renamed from: j */
    private boolean f15176j;

    /* JADX INFO: renamed from: k */
    private long f15177k;

    /* JADX INFO: renamed from: l */
    public final C4002B2 f15178l;

    /* JADX INFO: renamed from: m */
    public final C4385z2 f15179m;

    /* JADX INFO: renamed from: n */
    public final C4018D2 f15180n;

    /* JADX INFO: renamed from: o */
    public final C3994A2 f15181o;

    /* JADX INFO: renamed from: p */
    public final C4385z2 f15182p;

    /* JADX INFO: renamed from: q */
    public final C4002B2 f15183q;

    /* JADX INFO: renamed from: r */
    public final C4002B2 f15184r;

    /* JADX INFO: renamed from: s */
    public boolean f15185s;

    /* JADX INFO: renamed from: t */
    public final C4385z2 f15186t;

    /* JADX INFO: renamed from: u */
    public final C4385z2 f15187u;

    /* JADX INFO: renamed from: v */
    public final C4002B2 f15188v;

    /* JADX INFO: renamed from: w */
    public final C4018D2 f15189w;

    /* JADX INFO: renamed from: x */
    public final C4018D2 f15190x;

    /* JADX INFO: renamed from: y */
    public final C4002B2 f15191y;

    /* JADX INFO: renamed from: z */
    public final C3994A2 f15192z;

    C4026E2(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15178l = new C4002B2(this, "session_timeout", 1800000L);
        this.f15179m = new C4385z2(this, "start_new_session", true);
        this.f15183q = new C4002B2(this, "last_pause_time", 0L);
        this.f15184r = new C4002B2(this, "session_id", 0L);
        this.f15180n = new C4018D2(this, "non_personalized_ads", null);
        this.f15181o = new C3994A2(this, "last_received_uri_timestamps_by_source", null);
        this.f15182p = new C4385z2(this, "allow_remote_dynamite", false);
        this.f15172f = new C4002B2(this, "first_open_time", 0L);
        this.f15173g = new C4002B2(this, "app_install_time", 0L);
        this.f15174h = new C4018D2(this, "app_instance_id", null);
        this.f15186t = new C4385z2(this, "app_backgrounded", false);
        this.f15187u = new C4385z2(this, "deep_link_retrieval_complete", false);
        this.f15188v = new C4002B2(this, "deep_link_retrieval_attempts", 0L);
        this.f15189w = new C4018D2(this, "firebase_feature_rollouts", null);
        this.f15190x = new C4018D2(this, "deferred_attribution_cache", null);
        this.f15191y = new C4002B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f15192z = new C3994A2(this, "default_event_parameters", null);
    }

    /* JADX INFO: renamed from: A */
    final boolean m18486A(long j7) {
        return j7 - this.f15178l.m18433a() > this.f15183q.m18433a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: i */
    protected final boolean mo18416i() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4003B3
    /* JADX INFO: renamed from: j */
    protected final void mo18435j() {
        C4164X2 c4164x2 = this.f15066a;
        SharedPreferences sharedPreferences = c4164x2.mo18424e().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f15169c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f15185s = z7;
        if (!z7) {
            SharedPreferences.Editor editorEdit = this.f15169c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c4164x2.m18686w();
        this.f15171e = new C4010C2(this, "health_monitor", Math.max(0L, ((Long) AbstractC4209d2.f15657d.m18706b(null)).longValue()), null);
    }

    /* JADX INFO: renamed from: o */
    final Pair m18487o(String str) {
        mo18427h();
        if (!m18495w().m18514o(EnumC6051v.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        C4164X2 c4164x2 = this.f15066a;
        long jMo18161c = c4164x2.mo18425f().mo18161c();
        String str2 = this.f15175i;
        if (str2 != null && jMo18161c < this.f15177k) {
            return new Pair(str2, Boolean.valueOf(this.f15176j));
        }
        this.f15177k = jMo18161c + c4164x2.m18686w().m18796D(str, AbstractC4209d2.f15651b);
        C7073a.m31183c(true);
        try {
            C7073a.a aVarM31181a = C7073a.m31181a(c4164x2.mo18424e());
            this.f15175i = "";
            String strM31190a = aVarM31181a.m31190a();
            if (strM31190a != null) {
                this.f15175i = strM31190a;
            }
            this.f15176j = aVarM31181a.m31191b();
        } catch (Exception e7) {
            this.f15066a.mo18421a().m18858v().m18835b("Unable to get advertising id", e7);
            this.f15175i = "";
        }
        C7073a.m31183c(false);
        return new Pair(this.f15175i, Boolean.valueOf(this.f15176j));
    }

    /* JADX INFO: renamed from: p */
    protected final SharedPreferences m18488p() {
        mo18427h();
        m18437l();
        AbstractC3718s.m18083l(this.f15169c);
        return this.f15169c;
    }

    /* JADX INFO: renamed from: q */
    protected final SharedPreferences m18489q() {
        mo18427h();
        m18437l();
        if (this.f15170d == null) {
            C4164X2 c4164x2 = this.f15066a;
            String strValueOf = String.valueOf(c4164x2.mo18424e().getPackageName());
            C4297o2 c4297o2M18859w = c4164x2.mo18421a().m18859w();
            String strConcat = strValueOf.concat("_preferences");
            c4297o2M18859w.m18835b("Default prefs file", strConcat);
            this.f15170d = c4164x2.mo18424e().getSharedPreferences(strConcat, 0);
        }
        return this.f15170d;
    }

    /* JADX INFO: renamed from: r */
    final SparseArray m18490r() {
        Bundle bundleM18419a = this.f15181o.m18419a();
        int[] intArray = bundleM18419a.getIntArray("uriSources");
        long[] longArray = bundleM18419a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f15066a.mo18421a().m18851o().m18834a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i7 = 0; i7 < intArray.length; i7++) {
            sparseArray.put(intArray[i7], Long.valueOf(longArray[i7]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: s */
    final void m18491s(Boolean bool) {
        mo18427h();
        SharedPreferences.Editor editorEdit = m18488p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: t */
    final Boolean m18492t() {
        mo18427h();
        if (m18488p().contains("measurement_enabled")) {
            return Boolean.valueOf(m18488p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    final C4374y m18493u() {
        mo18427h();
        return C4374y.m19316g(m18488p().getString("dma_consent_settings", null));
    }

    /* JADX INFO: renamed from: v */
    final boolean m18494v(int i7) {
        return C4027E3.m18508u(i7, m18488p().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: w */
    final C4027E3 m18495w() {
        mo18427h();
        return C4027E3.m18502f(m18488p().getString("consent_settings", "G1"), m18488p().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: x */
    protected final boolean m18496x(C4105O5 c4105o5) {
        mo18427h();
        String string = m18488p().getString("stored_tcf_param", "");
        String strM18572a = c4105o5.m18572a();
        if (strM18572a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = m18488p().edit();
        editorEdit.putString("stored_tcf_param", strM18572a);
        editorEdit.apply();
        return true;
    }

    /* JADX INFO: renamed from: y */
    final void m18497y(boolean z7) {
        mo18427h();
        this.f15066a.mo18421a().m18859w().m18835b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor editorEdit = m18488p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z7);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: z */
    final boolean m18498z() {
        SharedPreferences sharedPreferences = this.f15169c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
