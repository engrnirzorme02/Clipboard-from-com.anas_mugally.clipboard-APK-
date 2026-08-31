package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3760o;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3500t0 implements InterfaceC3494q0 {

    /* JADX INFO: renamed from: b */
    private boolean f14295b;

    /* JADX INFO: renamed from: d */
    private InterfaceFutureC1673e f14297d;

    /* JADX INFO: renamed from: f */
    private SharedPreferences f14299f;

    /* JADX INFO: renamed from: g */
    private SharedPreferences.Editor f14300g;

    /* JADX INFO: renamed from: i */
    private String f14302i;

    /* JADX INFO: renamed from: j */
    private String f14303j;

    /* JADX INFO: renamed from: a */
    private final Object f14294a = new Object();

    /* JADX INFO: renamed from: c */
    private final List f14296c = new ArrayList();

    /* JADX INFO: renamed from: e */
    private zzazi f14298e = null;

    /* JADX INFO: renamed from: h */
    private boolean f14301h = true;

    /* JADX INFO: renamed from: k */
    private boolean f14304k = true;

    /* JADX INFO: renamed from: l */
    private String f14305l = "-1";

    /* JADX INFO: renamed from: m */
    private int f14306m = -1;

    /* JADX INFO: renamed from: n */
    private zzbyq f14307n = new zzbyq("", 0);

    /* JADX INFO: renamed from: o */
    private long f14308o = 0;

    /* JADX INFO: renamed from: p */
    private long f14309p = 0;

    /* JADX INFO: renamed from: q */
    private int f14310q = -1;

    /* JADX INFO: renamed from: r */
    private int f14311r = 0;

    /* JADX INFO: renamed from: s */
    private Set f14312s = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: t */
    private JSONObject f14313t = new JSONObject();

    /* JADX INFO: renamed from: u */
    private boolean f14314u = true;

    /* JADX INFO: renamed from: v */
    private boolean f14315v = true;

    /* JADX INFO: renamed from: w */
    private String f14316w = null;

    /* JADX INFO: renamed from: x */
    private String f14317x = "";

    /* JADX INFO: renamed from: y */
    private boolean f14318y = false;

    /* JADX INFO: renamed from: z */
    private String f14319z = "";

    /* JADX INFO: renamed from: A */
    private String f14290A = "{}";

    /* JADX INFO: renamed from: B */
    private int f14291B = -1;

    /* JADX INFO: renamed from: C */
    private int f14292C = -1;

    /* JADX INFO: renamed from: D */
    private long f14293D = 0;

    /* JADX INFO: renamed from: n */
    private final void m17559n() {
        InterfaceFutureC1673e interfaceFutureC1673e = this.f14297d;
        if (interfaceFutureC1673e == null || interfaceFutureC1673e.isDone()) {
            return;
        }
        try {
            this.f14297d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            int i7 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33332g("Interrupted while waiting for preferences loaded.", e7);
        } catch (CancellationException e8) {
            e = e8;
            int i8 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e9) {
            e = e9;
            int i9 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e10) {
            e = e10;
            int i10 = AbstractC3490o0.f14278b;
            AbstractC7599p.m33329d("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    /* JADX INFO: renamed from: o */
    private final void m17560o() {
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.r0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f14283a.m17561l();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: a */
    public final void mo17548a(String str) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                this.f14305l = str;
                if (this.f14300g != null) {
                    if (str.equals("-1")) {
                        this.f14300g.remove("IABTCF_TCString");
                    } else {
                        this.f14300g.putString("IABTCF_TCString", str);
                    }
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: b */
    public final void mo17549b(int i7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                this.f14306m = i7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    if (i7 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i7);
                    }
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: c */
    public final void mo17550c(int i7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14310q == i7) {
                    return;
                }
                this.f14310q = i7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: d */
    public final void mo17551d(String str, String str2, boolean z7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                JSONArray jSONArrayOptJSONArray = this.f14313t.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length = jSONArrayOptJSONArray.length();
                for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        if (!z7 || !jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                            length = i7;
                            break;
                        }
                        return;
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z7);
                    jSONObject.put("timestamp_ms", C7351t.m32357o().mo18159a());
                    jSONArrayOptJSONArray.put(length, jSONObject);
                    this.f14313t.put(str, jSONArrayOptJSONArray);
                } catch (JSONException e7) {
                    int i8 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33332g("Could not update native advanced settings", e7);
                }
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f14313t.toString());
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: e */
    public final void mo17552e(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjI)).booleanValue()) {
            m17559n();
            synchronized (this.f14294a) {
                try {
                    if (this.f14317x.equals(str)) {
                        return;
                    }
                    this.f14317x = str;
                    SharedPreferences.Editor editor = this.f14300g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f14300g.apply();
                    }
                    m17560o();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: f */
    public final void mo17553f(boolean z7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) C3250D.m17200c().zzd(zzbci.zzlm)).longValue();
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z7);
                    this.f14300g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: g */
    public final void mo17554g(long j7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14293D == j7) {
                    return;
                }
                this.f14293D = j7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: h */
    public final void mo17555h(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
            m17559n();
            synchronized (this.f14294a) {
                try {
                    if (this.f14319z.equals(str)) {
                        return;
                    }
                    this.f14319z = str;
                    SharedPreferences.Editor editor = this.f14300g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f14300g.apply();
                    }
                    m17560o();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: i */
    public final void mo17556i(int i7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14292C == i7) {
                    return;
                }
                this.f14292C = i7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: j */
    public final void mo17557j(Runnable runnable) {
        this.f14296c.add(runnable);
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    /* JADX INFO: renamed from: k */
    public final void mo17558k(String str) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzkl)).booleanValue()) {
            m17559n();
            synchronized (this.f14294a) {
                try {
                    if (this.f14290A.equals(str)) {
                        return;
                    }
                    this.f14290A = str;
                    SharedPreferences.Editor editor = this.f14300g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f14300g.apply();
                    }
                    m17560o();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final zzazi m17561l() {
        if (!this.f14295b) {
            return null;
        }
        if ((zzc() && zze()) || !((Boolean) zzbdz.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.f14294a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f14298e == null) {
                    this.f14298e = new zzazi();
                }
                this.f14298e.zza();
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33330e("start fetching content...");
                return this.f14298e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    final /* synthetic */ void m17562m(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.f14294a) {
                try {
                    this.f14299f = sharedPreferences;
                    this.f14300g = editorEdit;
                    if (AbstractC3760o.m18197e()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f14301h = this.f14299f.getBoolean("use_https", this.f14301h);
                    this.f14314u = this.f14299f.getBoolean("content_url_opted_out", this.f14314u);
                    this.f14302i = this.f14299f.getString("content_url_hashes", this.f14302i);
                    this.f14304k = this.f14299f.getBoolean("gad_idless", this.f14304k);
                    this.f14315v = this.f14299f.getBoolean("content_vertical_opted_out", this.f14315v);
                    this.f14303j = this.f14299f.getString("content_vertical_hashes", this.f14303j);
                    this.f14311r = this.f14299f.getInt("version_code", this.f14311r);
                    if (((Boolean) zzbea.zzg.zze()).booleanValue() && C3250D.m17200c().zzc()) {
                        this.f14307n = new zzbyq("", 0L);
                    } else {
                        this.f14307n = new zzbyq(this.f14299f.getString("app_settings_json", this.f14307n.zzd()), this.f14299f.getLong("app_settings_last_update_ms", this.f14307n.zzb()));
                    }
                    this.f14308o = this.f14299f.getLong("app_last_background_time_ms", this.f14308o);
                    this.f14310q = this.f14299f.getInt("request_in_session_count", this.f14310q);
                    this.f14309p = this.f14299f.getLong("first_ad_req_time_ms", this.f14309p);
                    this.f14312s = this.f14299f.getStringSet("never_pool_slots", this.f14312s);
                    this.f14316w = this.f14299f.getString("display_cutout", this.f14316w);
                    this.f14291B = this.f14299f.getInt("app_measurement_npa", this.f14291B);
                    this.f14292C = this.f14299f.getInt("sd_app_measure_npa", this.f14292C);
                    this.f14293D = this.f14299f.getLong("sd_app_measure_npa_ts", this.f14293D);
                    this.f14317x = this.f14299f.getString("inspector_info", this.f14317x);
                    this.f14318y = this.f14299f.getBoolean("linked_device", this.f14318y);
                    this.f14319z = this.f14299f.getString("linked_ad_unit", this.f14319z);
                    this.f14290A = this.f14299f.getString("inspector_ui_storage", this.f14290A);
                    this.f14305l = this.f14299f.getString("IABTCF_TCString", this.f14305l);
                    this.f14306m = this.f14299f.getInt("gad_has_consent_for_cookies", this.f14306m);
                    try {
                        this.f14313t = new JSONObject(this.f14299f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e7) {
                        int i7 = AbstractC3490o0.f14278b;
                        AbstractC7599p.m33332g("Could not convert native advanced settings to json object", e7);
                    }
                    m17560o();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            C7351t.m32354l().zzg(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            AbstractC3490o0.m17546l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final String zzB() {
        m17559n();
        return this.f14305l;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final int zzD() {
        m17559n();
        return this.f14306m;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final long zzF() {
        long j7;
        m17559n();
        synchronized (this.f14294a) {
            j7 = this.f14293D;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final String zzH() {
        String str;
        m17559n();
        synchronized (this.f14294a) {
            str = this.f14317x;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final boolean zzJ() {
        boolean z7;
        m17559n();
        synchronized (this.f14294a) {
            z7 = this.f14318y;
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzK(boolean z7) {
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzjX)).booleanValue()) {
            m17559n();
            synchronized (this.f14294a) {
                try {
                    if (this.f14318y == z7) {
                        return;
                    }
                    this.f14318y = z7;
                    SharedPreferences.Editor editor = this.f14300g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z7);
                        this.f14300g.apply();
                    }
                    m17560o();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final String zzL() {
        String str;
        m17559n();
        synchronized (this.f14294a) {
            str = this.f14319z;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final String zzN() {
        String str;
        m17559n();
        synchronized (this.f14294a) {
            str = this.f14290A;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zza(final Context context) {
        synchronized (this.f14294a) {
            try {
                if (this.f14299f != null) {
                    return;
                }
                final String str = "admob";
                this.f14297d = zzbzh.zza.submit(new Runnable(context, str) { // from class: com.google.android.gms.ads.internal.util.s0

                    /* JADX INFO: renamed from: b */
                    private final /* synthetic */ Context f14287b;

                    /* JADX INFO: renamed from: c */
                    private final /* synthetic */ String f14288c = "admob";

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f14286a.m17562m(this.f14287b, this.f14288c);
                    }
                });
                this.f14295b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzb(boolean z7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14314u == z7) {
                    return;
                }
                this.f14314u = z7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final boolean zzc() {
        boolean z7;
        m17559n();
        synchronized (this.f14294a) {
            z7 = this.f14314u;
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzd(boolean z7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14315v == z7) {
                    return;
                }
                this.f14315v = z7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final boolean zze() {
        boolean z7;
        m17559n();
        synchronized (this.f14294a) {
            z7 = this.f14315v;
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzf(int i7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14311r == i7) {
                    return;
                }
                this.f14311r = i7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putInt("version_code", i7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final int zzg() {
        int i7;
        m17559n();
        synchronized (this.f14294a) {
            i7 = this.f14311r;
        }
        return i7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzh(String str) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                long jMo18159a = C7351t.m32357o().mo18159a();
                if (str != null && !str.equals(this.f14307n.zzd())) {
                    this.f14307n = new zzbyq(str, jMo18159a);
                    SharedPreferences.Editor editor = this.f14300g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f14300g.putLong("app_settings_last_update_ms", jMo18159a);
                        this.f14300g.apply();
                    }
                    m17560o();
                    Iterator it = this.f14296c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f14307n.zza(jMo18159a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final zzbyq zzi() {
        zzbyq zzbyqVar;
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (((Boolean) C3250D.m17200c().zzd(zzbci.zzmw)).booleanValue() && this.f14307n.zzj()) {
                    Iterator it = this.f14296c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzbyqVar = this.f14307n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final zzbyq zzj() {
        zzbyq zzbyqVar;
        synchronized (this.f14294a) {
            zzbyqVar = this.f14307n;
        }
        return zzbyqVar;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzl(long j7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14308o == j7) {
                    return;
                }
                this.f14308o = j7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final long zzm() {
        long j7;
        m17559n();
        synchronized (this.f14294a) {
            j7 = this.f14308o;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final int zzo() {
        int i7;
        m17559n();
        synchronized (this.f14294a) {
            i7 = this.f14310q;
        }
        return i7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzp(long j7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (this.f14309p == j7) {
                    return;
                }
                this.f14309p = j7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final long zzq() {
        long j7;
        m17559n();
        synchronized (this.f14294a) {
            j7 = this.f14309p;
        }
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final JSONObject zzs() {
        JSONObject jSONObject;
        m17559n();
        synchronized (this.f14294a) {
            jSONObject = this.f14313t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzt() {
        m17559n();
        synchronized (this.f14294a) {
            try {
                this.f14313t = new JSONObject();
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final String zzu() {
        String str;
        m17559n();
        synchronized (this.f14294a) {
            str = this.f14316w;
        }
        return str;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzv(String str) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (TextUtils.equals(this.f14316w, str)) {
                    return;
                }
                this.f14316w = str;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final void zzw(boolean z7) {
        m17559n();
        synchronized (this.f14294a) {
            try {
                if (z7 == this.f14304k) {
                    return;
                }
                this.f14304k = z7;
                SharedPreferences.Editor editor = this.f14300g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z7);
                    this.f14300g.apply();
                }
                m17560o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final boolean zzx() {
        boolean z7;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzaM)).booleanValue()) {
            return false;
        }
        m17559n();
        synchronized (this.f14294a) {
            z7 = this.f14304k;
        }
        return z7;
    }

    @Override // com.google.android.gms.ads.internal.util.InterfaceC3494q0
    public final boolean zzz() {
        m17559n();
        synchronized (this.f14294a) {
            try {
                SharedPreferences sharedPreferences = this.f14299f;
                boolean z7 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f14299f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f14304k) {
                    z7 = true;
                }
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
