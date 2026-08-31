package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.C2390a;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.AbstractC3751f;
import com.google.android.gms.common.util.AbstractC3765t;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzqp;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p129Q3.AbstractC1260B;
import p129Q3.AbstractC1272k;
import p129Q3.AbstractC1273l;
import p129Q3.AbstractC1274m;
import p157U3.AbstractC1671c;
import p157U3.InterfaceFutureC1673e;
import p283k3.AbstractC6021D;
import p283k3.AbstractC6025H;
import p283k3.AbstractC6049t;
import p283k3.AbstractC6052w;
import p283k3.AbstractC6054y;
import p283k3.C6027J;
import p283k3.EnumC6023F;
import p283k3.EnumC6024G;
import p283k3.EnumC6051v;
import p283k3.InterfaceC6018A;
import p283k3.InterfaceC6055z;
import p362u0.AbstractC7153a;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.x4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4371x4 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    protected C4275l4 f16204c;

    /* JADX INFO: renamed from: d */
    private InterfaceC6055z f16205d;

    /* JADX INFO: renamed from: e */
    private final Set f16206e;

    /* JADX INFO: renamed from: f */
    private boolean f16207f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f16208g;

    /* JADX INFO: renamed from: h */
    private final Object f16209h;

    /* JADX INFO: renamed from: i */
    private boolean f16210i;

    /* JADX INFO: renamed from: j */
    private int f16211j;

    /* JADX INFO: renamed from: k */
    private AbstractC4366x f16212k;

    /* JADX INFO: renamed from: l */
    private AbstractC4366x f16213l;

    /* JADX INFO: renamed from: m */
    private PriorityQueue f16214m;

    /* JADX INFO: renamed from: n */
    private boolean f16215n;

    /* JADX INFO: renamed from: o */
    private C4027E3 f16216o;

    /* JADX INFO: renamed from: p */
    private final AtomicLong f16217p;

    /* JADX INFO: renamed from: q */
    private long f16218q;

    /* JADX INFO: renamed from: r */
    final C4054H6 f16219r;

    /* JADX INFO: renamed from: s */
    protected boolean f16220s;

    /* JADX INFO: renamed from: t */
    private AbstractC4366x f16221t;

    /* JADX INFO: renamed from: u */
    private SharedPreferences.OnSharedPreferenceChangeListener f16222u;

    /* JADX INFO: renamed from: v */
    private AbstractC4366x f16223v;

    /* JADX INFO: renamed from: w */
    private final InterfaceC4381y6 f16224w;

    protected C4371x4(C4164X2 c4164x2) {
        super(c4164x2);
        this.f16206e = new CopyOnWriteArraySet();
        this.f16209h = new Object();
        this.f16210i = false;
        this.f16211j = 1;
        this.f16220s = true;
        this.f16224w = new C4195b4(this);
        this.f16208g = new AtomicReference();
        this.f16216o = C4027E3.f15193c;
        this.f16218q = -1L;
        this.f16217p = new AtomicLong(0L);
        this.f16219r = new C4054H6(c4164x2);
    }

    /* JADX INFO: renamed from: e0 */
    private final EnumC6023F m19253e0(final C4167X5 c4167x5) {
        try {
            URL url = new URI(c4167x5.f15506c).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strM18756s = this.f15066a.m18670L().m18756s();
            C4164X2 c4164x2 = this.f15066a;
            C4297o2 c4297o2M18859w = c4164x2.mo18421a().m18859w();
            Long lValueOf = Long.valueOf(c4167x5.f15504a);
            c4297o2M18859w.m18837d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, c4167x5.f15506c, Integer.valueOf(c4167x5.f15505b.length));
            if (!TextUtils.isEmpty(c4167x5.f15510r)) {
                c4164x2.mo18421a().m18859w().m18836c("[sgtm] Uploading data from app. row_id", lValueOf, c4167x5.f15510r);
            }
            HashMap map = new HashMap();
            Bundle bundle = c4167x5.f15507d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            C4004B4 c4004b4M18664F = c4164x2.m18664F();
            byte[] bArr = c4167x5.f15505b;
            InterfaceC4379y4 interfaceC4379y4 = new InterfaceC4379y4() { // from class: com.google.android.gms.measurement.internal.m4
                /* JADX WARN: Code duplicated, block: B:10:0x0016  */
                /* JADX WARN: Code duplicated, block: B:11:0x002e A[PHI: r8
                  0x002e: PHI (r8v7 int) = (r8v1 int), (r8v0 int) binds: [B:9:0x0014, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:13:0x0064  */
                /* JADX WARN: Code duplicated, block: B:14:0x0067  */
                @Override // com.google.android.gms.measurement.internal.InterfaceC4379y4
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ void mo18652a(String str2, int i7, Throwable th, byte[] bArr2, Map map2) {
                    EnumC6023F enumC6023F;
                    C4371x4 c4371x4 = this.f15887a;
                    c4371x4.mo18427h();
                    C4167X5 c4167x6 = c4167x5;
                    if (i7 == 200 || i7 == 204) {
                        if (th == null) {
                            c4371x4.f15066a.mo18421a().m18859w().m18835b("[sgtm] Upload succeeded for row_id", Long.valueOf(c4167x6.f15504a));
                            enumC6023F = EnumC6023F.SUCCESS;
                        } else {
                            c4371x4.f15066a.mo18421a().m18854r().m18837d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c4167x6.f15504a), Integer.valueOf(i7), th);
                            if (Arrays.asList(((String) AbstractC4209d2.f15700u.m18706b(null)).split(",")).contains(String.valueOf(i7))) {
                                enumC6023F = EnumC6023F.BACKOFF;
                            } else {
                                enumC6023F = EnumC6023F.FAILURE;
                            }
                        }
                    } else if (i7 == 304) {
                        i7 = 304;
                        if (th == null) {
                            c4371x4.f15066a.mo18421a().m18859w().m18835b("[sgtm] Upload succeeded for row_id", Long.valueOf(c4167x6.f15504a));
                            enumC6023F = EnumC6023F.SUCCESS;
                        } else {
                            c4371x4.f15066a.mo18421a().m18854r().m18837d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c4167x6.f15504a), Integer.valueOf(i7), th);
                            if (Arrays.asList(((String) AbstractC4209d2.f15700u.m18706b(null)).split(",")).contains(String.valueOf(i7))) {
                                enumC6023F = EnumC6023F.BACKOFF;
                            } else {
                                enumC6023F = EnumC6023F.FAILURE;
                            }
                        }
                    } else {
                        c4371x4.f15066a.mo18421a().m18854r().m18837d("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c4167x6.f15504a), Integer.valueOf(i7), th);
                        if (Arrays.asList(((String) AbstractC4209d2.f15700u.m18706b(null)).split(",")).contains(String.valueOf(i7))) {
                            enumC6023F = EnumC6023F.BACKOFF;
                        } else {
                            enumC6023F = EnumC6023F.FAILURE;
                        }
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    C4364w5 c4364w5M18668J = c4371x4.f15066a.m18668J();
                    long j7 = c4167x6.f15504a;
                    c4364w5M18668J.m19233k0(new C4230g(j7, enumC6023F.zza(), c4167x6.f15509f));
                    c4371x4.f15066a.mo18421a().m18859w().m18836c("[sgtm] Updated status for row_id", Long.valueOf(j7), enumC6023F);
                    synchronized (atomicReference2) {
                        atomicReference2.set(enumC6023F);
                        atomicReference2.notifyAll();
                    }
                }
            };
            c4004b4M18664F.m18437l();
            AbstractC3718s.m18083l(url);
            AbstractC3718s.m18083l(bArr);
            AbstractC3718s.m18083l(interfaceC4379y4);
            c4004b4M18664F.f15066a.mo18422b().m18642w(new RunnableC3996A4(c4004b4M18664F, strM18756s, url, bArr, map, interfaceC4379y4));
            try {
                C4164X2 c4164x3 = c4164x2.m18661C().f15066a;
                long jMo18159a = c4164x3.mo18425f().mo18159a() + 60000;
                synchronized (atomicReference) {
                    for (long jMo18159a2 = 60000; atomicReference.get() == null && jMo18159a2 > 0; jMo18159a2 = jMo18159a - c4164x3.mo18425f().mo18159a()) {
                        try {
                            atomicReference.wait(jMo18159a2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f15066a.mo18421a().m18854r().m18834a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC6023F.UNKNOWN : (EnumC6023F) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e7) {
            this.f15066a.mo18421a().m18851o().m18837d("[sgtm] Bad upload url for row_id", c4167x5.f15506c, Long.valueOf(c4167x5.f15504a), e7);
            return EnumC6023F.FAILURE;
        }
    }

    /* JADX INFO: renamed from: f0 */
    private final void m19254f0(Boolean bool, boolean z7) {
        mo18427h();
        m18748j();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18858v().m18835b("Setting app measurement enabled (FE)", bool);
        c4164x2.m18687x().m18491s(bool);
        if (z7) {
            C4026E2 c4026e2M18687x = c4164x2.m18687x();
            C4164X2 c4164x3 = c4026e2M18687x.f15066a;
            c4026e2M18687x.mo18427h();
            SharedPreferences.Editor editorEdit = c4026e2M18687x.m18488p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f15066a.m18678j() || !(bool == null || bool.booleanValue())) {
            m19280Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void m19280Y() {
        C4371x4 c4371x4;
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        String strM18459a = c4164x2.m18687x().f15180n.m18459a();
        if (strM18459a == null) {
            c4371x4 = this;
        } else if ("unset".equals(strM18459a)) {
            c4371x4 = this;
            c4371x4.m19257B("app", "_npa", null, c4164x2.mo18425f().mo18159a());
        } else {
            m19257B("app", "_npa", Long.valueOf(true != "true".equals(strM18459a) ? 0L : 1L), c4164x2.mo18425f().mo18159a());
            c4371x4 = this;
        }
        if (!c4371x4.f15066a.m18675g() || !c4371x4.f16220s) {
            c4164x2.mo18421a().m18858v().m18834a("Updating Scion state (FE)");
            c4371x4.f15066a.m18668J().m19220X();
        } else {
            c4164x2.mo18421a().m18858v().m18834a("Recording app launch after enabling measurement for the first time (FE)");
            m19263H();
            c4371x4.f15066a.m18689z().f15334e.m18560a();
            c4164x2.mo18422b().m18639t(new RunnableC4096N3(this));
        }
    }

    /* JADX INFO: renamed from: A */
    final void m19256A(String str, String str2, long j7, Object obj) {
        this.f15066a.mo18422b().m18639t(new RunnableC4130S3(this, str, str2, obj, j7));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX INFO: renamed from: B */
    final void m19257B(String str, String str2, Object obj, long j7) {
        AbstractC3718s.m18077f(str);
        AbstractC3718s.m18077f(str2);
        mo18427h();
        m18748j();
        Object obj2 = obj;
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    long j8 = true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    C4164X2 c4164x2 = this.f15066a;
                    Long lValueOf = Long.valueOf(j8);
                    c4164x2.m18687x().f15180n.m18460b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    this.f15066a.m18687x().f15180n.m18460b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                this.f15066a.m18687x().f15180n.m18460b("unset");
                obj = obj;
                str2 = "_npa";
            }
            this.f15066a.mo18421a().m18859w().m18836c("Setting user property(FE)", "non_personalized_ads(_npa)", obj);
            obj2 = obj;
        }
        String str4 = str2;
        Object obj3 = obj2;
        C4164X2 c4164x3 = this.f15066a;
        if (!c4164x3.m18675g()) {
            this.f15066a.mo18421a().m18859w().m18834a("User property not set since app measurement is disabled");
        } else if (c4164x3.m18681m()) {
            this.f15066a.m18668J().m19235o(new C4357v6(str4, j7, obj3, str));
        }
    }

    /* JADX INFO: renamed from: C */
    public final Map m19258C(String str, String str2, boolean z7) {
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.mo18422b().m18635p()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        c4164x2.mo18423c();
        if (C4222f.m18746a()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f15066a.mo18422b().m18640u(atomicReference, 5000L, "get user properties", new RunnableC4179Z3(this, atomicReference, null, str, str2, z7));
        List<C4357v6> list = (List) atomicReference.get();
        if (list == null) {
            c4164x2.mo18421a().m18851o().m18835b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
            return Collections.EMPTY_MAP;
        }
        C2390a c2390a = new C2390a(list.size());
        for (C4357v6 c4357v6 : list) {
            Object objZza = c4357v6.zza();
            if (objZza != null) {
                c2390a.put(c4357v6.f16124b, objZza);
            }
        }
        return c2390a;
    }

    /* JADX INFO: renamed from: D */
    public final String m19259D() {
        return (String) this.f16208g.get();
    }

    /* JADX INFO: renamed from: E */
    final void m19260E(String str) {
        this.f16208g.set(str);
    }

    /* JADX INFO: renamed from: F */
    public final void m19261F() {
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18687x().f15187u.m19333a()) {
            c4164x2.mo18421a().m18858v().m18834a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jM18433a = c4164x2.m18687x().f15188v.m18433a();
        c4164x2.m18687x().f15188v.m18434b(1 + jM18433a);
        c4164x2.m18686w();
        if (jM18433a >= 5) {
            c4164x2.mo18421a().m18854r().m18834a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c4164x2.m18687x().f15187u.m19334b(true);
        } else {
            if (this.f16221t == null) {
                this.f16221t = new C4144U3(this, this.f15066a);
            }
            this.f16221t.m19249b(0L);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m19262G(long j7) {
        this.f16208g.set(null);
        this.f15066a.mo18422b().m18639t(new RunnableC4151V3(this, j7));
    }

    /* JADX INFO: renamed from: H */
    public final void m19263H() {
        mo18427h();
        m18748j();
        if (this.f15066a.m18681m()) {
            C4164X2 c4164x2 = this.f15066a;
            C4278m c4278mM18686w = c4164x2.m18686w();
            c4278mM18686w.f15066a.mo18423c();
            Boolean boolM18802J = c4278mM18686w.m18802J("google_analytics_deferred_deep_link_enabled");
            if (boolM18802J != null && boolM18802J.booleanValue()) {
                c4164x2.mo18421a().m18858v().m18834a("Deferred Deep Link feature enabled.");
                c4164x2.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.v4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f16121a.m19261F();
                    }
                });
            }
            this.f15066a.m18668J().m19239s();
            this.f16220s = false;
            C4026E2 c4026e2M18687x = c4164x2.m18687x();
            c4026e2M18687x.mo18427h();
            String string = c4026e2M18687x.m18488p().getString("previous_os_version", null);
            c4026e2M18687x.f15066a.m18669K().m18437l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c4026e2M18687x.m18488p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c4164x2.m18669K().m18437l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m19303t("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m19264I(InterfaceC6055z interfaceC6055z) {
        InterfaceC6055z interfaceC6055z2;
        mo18427h();
        m18748j();
        if (interfaceC6055z != null && interfaceC6055z != (interfaceC6055z2 = this.f16205d)) {
            AbstractC3718s.m18087p(interfaceC6055z2 == null, "EventInterceptor already set.");
        }
        this.f16205d = interfaceC6055z;
    }

    /* JADX INFO: renamed from: J */
    public final void m19265J(InterfaceC6018A interfaceC6018A) {
        m18748j();
        AbstractC3718s.m18083l(interfaceC6018A);
        if (this.f16206e.add(interfaceC6018A)) {
            return;
        }
        this.f15066a.mo18421a().m18854r().m18834a("OnEventListener already registered");
    }

    /* JADX INFO: renamed from: K */
    public final void m19266K(InterfaceC6018A interfaceC6018A) {
        m18748j();
        AbstractC3718s.m18083l(interfaceC6018A);
        if (this.f16206e.remove(interfaceC6018A)) {
            return;
        }
        this.f15066a.mo18421a().m18854r().m18834a("OnEventListener had not been registered");
    }

    /* JADX INFO: renamed from: L */
    public final int m19267L(String str) {
        AbstractC3718s.m18077f(str);
        this.f15066a.m18686w();
        return 25;
    }

    /* JADX INFO: renamed from: M */
    public final void m19268M(Bundle bundle) {
        m19269N(bundle, this.f15066a.mo18425f().mo18159a());
    }

    /* JADX INFO: renamed from: N */
    public final void m19269N(Bundle bundle, long j7) {
        AbstractC3718s.m18083l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f15066a.mo18421a().m18854r().m18834a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC3718s.m18083l(bundle2);
        AbstractC6049t.m27058b(bundle2, "app_id", String.class, null);
        AbstractC6049t.m27058b(bundle2, "origin", String.class, null);
        AbstractC6049t.m27058b(bundle2, "name", String.class, null);
        AbstractC6049t.m27058b(bundle2, "value", Object.class, null);
        AbstractC6049t.m27058b(bundle2, "trigger_event_name", String.class, null);
        AbstractC6049t.m27058b(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC6049t.m27058b(bundle2, "timed_out_event_name", String.class, null);
        AbstractC6049t.m27058b(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC6049t.m27058b(bundle2, "triggered_event_name", String.class, null);
        AbstractC6049t.m27058b(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC6049t.m27058b(bundle2, "time_to_live", Long.class, 0L);
        AbstractC6049t.m27058b(bundle2, "expired_event_name", String.class, null);
        AbstractC6049t.m27058b(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC3718s.m18077f(bundle2.getString("name"));
        AbstractC3718s.m18077f(bundle2.getString("origin"));
        AbstractC3718s.m18083l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18661C().m19418y0(string) != 0) {
            c4164x2.mo18421a().m18851o().m18835b("Invalid conditional user property name", c4164x2.m18662D().m18777c(string));
            return;
        }
        if (c4164x2.m18661C().m19417y(string, obj) != 0) {
            c4164x2.mo18421a().m18851o().m18836c("Invalid conditional user property value", c4164x2.m18662D().m18777c(string), obj);
            return;
        }
        Object objM19419z = c4164x2.m18661C().m19419z(string, obj);
        if (objM19419z == null) {
            c4164x2.mo18421a().m18851o().m18836c("Unable to normalize conditional user property value", c4164x2.m18662D().m18777c(string), obj);
            return;
        }
        AbstractC6049t.m27057a(bundle2, objM19419z);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c4164x2.m18686w();
            if (j8 > 15552000000L || j8 < 1) {
                c4164x2.mo18421a().m18851o().m18836c("Invalid conditional user property timeout", c4164x2.m18662D().m18777c(string), Long.valueOf(j8));
                return;
            }
        }
        long j9 = bundle2.getLong("time_to_live");
        c4164x2.m18686w();
        if (j9 > 15552000000L || j9 < 1) {
            c4164x2.mo18421a().m18851o().m18836c("Invalid conditional user property time to live", c4164x2.m18662D().m18777c(string), Long.valueOf(j9));
        } else {
            c4164x2.mo18422b().m18639t(new RunnableC4158W3(this, bundle2));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m19270O(String str, String str2, Bundle bundle) {
        C4164X2 c4164x2 = this.f15066a;
        long jMo18159a = c4164x2.mo18425f().mo18159a();
        AbstractC3718s.m18077f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jMo18159a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c4164x2.mo18422b().m18639t(new RunnableC4165X3(this, bundle2));
    }

    /* JADX INFO: renamed from: P */
    public final ArrayList m19271P(String str, String str2) {
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.mo18422b().m18635p()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c4164x2.mo18423c();
        if (C4222f.m18746a()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f15066a.mo18422b().m18640u(atomicReference, 5000L, "get conditional user properties", new RunnableC4172Y3(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C4389z6.m19360h0(list);
        }
        c4164x2.mo18421a().m18851o().m18835b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    /* JADX INFO: renamed from: Q */
    public final String m19272Q() {
        C4028E4 c4028e4M18554u = this.f15066a.m18667I().m18554u();
        if (c4028e4M18554u != null) {
            return c4028e4M18554u.f15196a;
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final String m19273R() {
        C4028E4 c4028e4M18554u = this.f15066a.m18667I().m18554u();
        if (c4028e4M18554u != null) {
            return c4028e4M18554u.f15197b;
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final String m19274S() {
        try {
            return AbstractC6025H.m27045a(this.f15066a.mo18424e(), "google_app_id", this.f15066a.m18666H());
        } catch (IllegalStateException e7) {
            this.f15066a.mo18421a().m18851o().m18835b("getGoogleAppId failed with exception", e7);
            return null;
        }
    }

    /* JADX INFO: renamed from: T */
    final /* synthetic */ void m19275T(SharedPreferences sharedPreferences, String str) {
        C4164X2 c4164x2 = this.f15066a;
        if (!c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15650a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c4164x2.mo18421a().m18859w().m18834a("IABTCF_TCString change picked up in listener.");
                ((AbstractC4366x) AbstractC3718s.m18083l(this.f16223v)).m19249b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c4164x2.mo18421a().m18859w().m18834a("IABTCF_TCString change picked up in listener.");
            ((AbstractC4366x) AbstractC3718s.m18083l(this.f16223v)).m19249b(500L);
        }
    }

    /* JADX INFO: renamed from: U */
    final /* synthetic */ void m19276U(Bundle bundle) {
        Bundle bundle2;
        int i7;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C4164X2 c4164x2 = this.f15066a;
            bundle2 = new Bundle(c4164x2.m18687x().f15192z.m18419a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i7 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c4164x2.m18661C().m19370B0(obj)) {
                        c4164x2.m18661C().m19369B(this.f16224w, null, 27, null, null, 0);
                    }
                    c4164x2.mo18421a().m18856t().m18836c("Invalid default event parameter type. Name, value", next, obj);
                } else if (C4389z6.m19357N(next)) {
                    c4164x2.mo18421a().m18856t().m18835b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c4164x2.m18661C().m19371C0("param", next, c4164x2.m18686w().m18820x(null, false), obj)) {
                    c4164x2.m18661C().m19367A(bundle2, next, obj);
                }
            }
            c4164x2.m18661C();
            int iM18818v = c4164x2.m18686w().m18818v();
            if (bundle2.size() > iM18818v) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i7++;
                    if (i7 > iM18818v) {
                        bundle2.remove(str);
                    }
                }
                c4164x2.m18661C().m19369B(this.f16224w, null, 26, null, null, 0);
                c4164x2.mo18421a().m18856t().m18834a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C4164X2 c4164x3 = this.f15066a;
        c4164x3.m18687x().f15192z.m18420b(bundle2);
        if (!bundle.isEmpty() || c4164x3.m18686w().m18800H(null, AbstractC4209d2.f15643X0)) {
            this.f15066a.m18668J().m19242v(bundle2);
        }
    }

    /* JADX INFO: renamed from: V */
    final /* synthetic */ void m19277V(int i7) {
        if (this.f16212k == null) {
            this.f16212k = new C4082L3(this, this.f15066a);
        }
        this.f16212k.m19249b(((long) i7) * 1000);
    }

    /* JADX INFO: renamed from: W */
    final /* synthetic */ void m19278W(Boolean bool, boolean z7) {
        m19254f0(bool, true);
    }

    /* JADX INFO: renamed from: X */
    final /* synthetic */ void m19279X(C4027E3 c4027e3, long j7, boolean z7, boolean z8) {
        mo18427h();
        m18748j();
        C4164X2 c4164x2 = this.f15066a;
        C4027E3 c4027e3M18495w = c4164x2.m18687x().m18495w();
        if (j7 <= this.f16218q && C4027E3.m18508u(c4027e3M18495w.m18509b(), c4027e3.m18509b())) {
            c4164x2.mo18421a().m18857u().m18835b("Dropped out-of-date consent setting, proposed settings", c4027e3);
            return;
        }
        C4026E2 c4026e2M18687x = c4164x2.m18687x();
        C4164X2 c4164x3 = c4026e2M18687x.f15066a;
        c4026e2M18687x.mo18427h();
        int iM18509b = c4027e3.m18509b();
        if (!c4026e2M18687x.m18494v(iM18509b)) {
            c4164x2.mo18421a().m18857u().m18835b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c4027e3.m18509b()));
            return;
        }
        C4164X2 c4164x4 = this.f15066a;
        SharedPreferences.Editor editorEdit = c4026e2M18687x.m18488p().edit();
        editorEdit.putString("consent_settings", c4027e3.m18512l());
        editorEdit.putInt("consent_source", iM18509b);
        editorEdit.apply();
        c4164x2.mo18421a().m18859w().m18835b("Setting storage consent(FE)", c4027e3);
        this.f16218q = j7;
        if (c4164x4.m18668J().m19205D()) {
            c4164x4.m18668J().m19222Z(z7);
        } else {
            c4164x4.m18668J().m19221Y(z7);
        }
        if (z8) {
            c4164x4.m18668J().m19237q(new AtomicReference());
        }
    }

    /* JADX INFO: renamed from: Z */
    final /* synthetic */ void m19281Z(boolean z7) {
        this.f16210i = false;
    }

    /* JADX INFO: renamed from: a0 */
    final /* synthetic */ int m19282a0() {
        return this.f16211j;
    }

    /* JADX INFO: renamed from: b0 */
    final /* synthetic */ void m19283b0(int i7) {
        this.f16211j = i7;
    }

    /* JADX INFO: renamed from: c0 */
    final /* synthetic */ AbstractC4366x m19284c0() {
        return this.f16221t;
    }

    /* JADX INFO: renamed from: d0 */
    final /* synthetic */ int m19285d0(Throwable th) {
        String message = th.getMessage();
        this.f16215n = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        this.f16215n = true;
        return 1;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m19286h0() {
        C4164X2 c4164x2 = this.f15066a;
        if (!(c4164x2.mo18424e().getApplicationContext() instanceof Application) || this.f16204c == null) {
            return;
        }
        ((Application) c4164x2.mo18424e().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f16204c);
    }

    /* JADX INFO: renamed from: i0 */
    public final Boolean m19287i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f15066a.mo18422b().m18640u(atomicReference, 15000L, "boolean test flag value", new RunnableC4137T3(this, atomicReference));
    }

    /* JADX INFO: renamed from: j0 */
    public final String m19288j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f15066a.mo18422b().m18640u(atomicReference, 15000L, "String test flag value", new RunnableC4203c4(this, atomicReference));
    }

    /* JADX INFO: renamed from: k0 */
    public final Long m19289k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f15066a.mo18422b().m18640u(atomicReference, 15000L, "long test flag value", new RunnableC4211d4(this, atomicReference));
    }

    /* JADX INFO: renamed from: l0 */
    public final Integer m19290l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f15066a.mo18422b().m18640u(atomicReference, 15000L, "int test flag value", new RunnableC4219e4(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return false;
    }

    /* JADX INFO: renamed from: m0 */
    public final Double m19291m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f15066a.mo18422b().m18640u(atomicReference, 15000L, "double test flag value", new RunnableC4227f4(this, atomicReference));
    }

    /* JADX INFO: renamed from: n0 */
    public final void m19292n0(Boolean bool) {
        m18748j();
        this.f15066a.mo18422b().m18639t(new RunnableC4235g4(this, bool));
    }

    /* JADX INFO: renamed from: o */
    final void m19293o(C4027E3 c4027e3) {
        mo18427h();
        boolean z7 = (c4027e3.m18514o(EnumC6051v.ANALYTICS_STORAGE) && c4027e3.m18514o(EnumC6051v.AD_STORAGE)) || this.f15066a.m18668J().m19204C();
        C4164X2 c4164x2 = this.f15066a;
        if (z7 != c4164x2.m18678j()) {
            c4164x2.m18677i(z7);
            C4026E2 c4026e2M18687x = this.f15066a.m18687x();
            C4164X2 c4164x3 = c4026e2M18687x.f15066a;
            c4026e2M18687x.mo18427h();
            Boolean boolValueOf = c4026e2M18687x.m18488p().contains("measurement_enabled_from_api") ? Boolean.valueOf(c4026e2M18687x.m18488p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z7 || boolValueOf == null || boolValueOf.booleanValue()) {
                m19254f0(Boolean.valueOf(z7), false);
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    final void m19294o0(Bundle bundle, int i7, long j7) {
        Object obj;
        String string;
        m18748j();
        C4027E3 c4027e3 = C4027E3.f15193c;
        EnumC6051v[] enumC6051vArrM18462d = EnumC4019D3.STORAGE.m18462d();
        int length = enumC6051vArrM18462d.length;
        int i8 = 0;
        while (true) {
            obj = null;
            if (i8 >= length) {
                break;
            }
            String str = enumC6051vArrM18462d[i8].f23824a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i8++;
        }
        if (obj != null) {
            C4164X2 c4164x2 = this.f15066a;
            c4164x2.mo18421a().m18856t().m18835b("Ignoring invalid consent setting", obj);
            c4164x2.mo18421a().m18856t().m18834a("Valid consent values are 'granted', 'denied'");
        }
        boolean zM18635p = this.f15066a.mo18422b().m18635p();
        C4027E3 c4027e3M18501e = C4027E3.m18501e(bundle, i7);
        if (c4027e3M18501e.m18510c()) {
            m19298q0(c4027e3M18501e, zM18635p);
        }
        C4374y c4374yM19317h = C4374y.m19317h(bundle, i7);
        if (c4374yM19317h.m19322d()) {
            m19296p0(c4374yM19317h, zM18635p);
        }
        Boolean boolM19318i = C4374y.m19318i(bundle);
        if (boolM19318i != null) {
            String str2 = i7 == -30 ? "tcf" : "app";
            if (zM18635p) {
                m19257B(str2, "allow_personalized_ads", boolM19318i.toString(), j7);
            } else {
                m19314z(str2, "allow_personalized_ads", boolM19318i.toString(), false, j7);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m19295p(String str, String str2, Bundle bundle) {
        m19297q(str, str2, bundle, true, true, this.f15066a.mo18425f().mo18159a());
    }

    /* JADX INFO: renamed from: p0 */
    final void m19296p0(C4374y c4374y, boolean z7) {
        RunnableC4243h4 runnableC4243h4 = new RunnableC4243h4(this, c4374y);
        if (!z7) {
            this.f15066a.mo18422b().m18639t(runnableC4243h4);
        } else {
            mo18427h();
            runnableC4243h4.run();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m19297q(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f15066a.m18667I().m18552s(bundle2, j7);
            return;
        }
        boolean z9 = true;
        if (z8 && this.f16205d != null && !C4389z6.m19357N(str2)) {
            z9 = false;
        }
        boolean z10 = z9;
        if (str == null) {
            str = "app";
        }
        m19311x(str, str2, j7, bundle2, z8, z10, z7, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: q0 */
    public final void m19298q0(com.google.android.gms.measurement.internal.C4027E3 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4371x4.m19298q0(com.google.android.gms.measurement.internal.E3, boolean):void");
    }

    /* JADX INFO: renamed from: r */
    public final void m19299r() {
        C4105O5 c4105o5;
        C4105O5 c4105o6;
        zzkq zzkqVar;
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18858v().m18834a("Handle tcf update.");
        SharedPreferences sharedPreferencesM18489q = c4164x2.m18687x().m18489q();
        HashMap map = new HashMap();
        C4201c2 c4201c2 = AbstractC4209d2.f15650a1;
        int i7 = 2;
        if (((Boolean) c4201c2.m18706b(null)).booleanValue()) {
            AbstractC1272k abstractC1272k = AbstractC4119Q5.f15382a;
            zzkp zzkpVar = zzkp.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            EnumC4112P5 enumC4112P5 = EnumC4112P5.CONSENT;
            Map.Entry entryM27043a = AbstractC6021D.m27043a(zzkpVar, enumC4112P5);
            int i8 = 1;
            zzkp zzkpVar2 = zzkp.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            EnumC4112P5 enumC4112P6 = EnumC4112P5.FLEXIBLE_LEGITIMATE_INTEREST;
            AbstractC1273l abstractC1273lM5552n = AbstractC1273l.m5552n(entryM27043a, AbstractC6021D.m27043a(zzkpVar2, enumC4112P6), AbstractC6021D.m27043a(zzkp.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, enumC4112P5), AbstractC6021D.m27043a(zzkp.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, enumC4112P5), AbstractC6021D.m27043a(zzkp.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, enumC4112P6), AbstractC6021D.m27043a(zzkp.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC4112P6), AbstractC6021D.m27043a(zzkp.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC4112P6));
            AbstractC1274m abstractC1274mM5577y = AbstractC1274m.m5577y("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesM18489q.contains("IABTCF_TCString");
            int iM18614b = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_CmpSdkID");
            int iM18614b2 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_PolicyVersion");
            int iM18614b3 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_gdprApplies");
            int iM18614b4 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_PurposeOneTreatment");
            int iM18614b5 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_EnableAdvertiserConsentMode");
            String strM18613a = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_PublisherCC");
            AbstractC1273l.a aVarM5546a = AbstractC1273l.m5546a();
            AbstractC1260B abstractC1260BMo5581w = abstractC1273lM5552n.keySet().iterator();
            while (abstractC1260BMo5581w.hasNext()) {
                zzkp zzkpVar3 = (zzkp) abstractC1260BMo5581w.next();
                int iZza = zzkpVar3.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(iZza);
                String strM18613a2 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, sb.toString());
                if (TextUtils.isEmpty(strM18613a2) || strM18613a2.length() < 755) {
                    zzkqVar = zzkq.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strM18613a2.charAt(754), 10);
                    if (iDigit < 0 || iDigit > zzkq.values().length || iDigit == 0) {
                        zzkqVar = zzkq.PURPOSE_RESTRICTION_NOT_ALLOWED;
                    } else if (iDigit != i8) {
                        zzkqVar = iDigit != i7 ? zzkq.PURPOSE_RESTRICTION_UNDEFINED : zzkq.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                    } else {
                        zzkqVar = zzkq.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    }
                }
                aVarM5546a.m5566f(zzkpVar3, zzkqVar);
                i7 = 2;
                i8 = 1;
            }
            AbstractC1273l abstractC1273lM5565c = aVarM5546a.m5565c();
            String strM18613a3 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_PurposeConsents");
            String strM18613a4 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_VendorConsents");
            boolean z7 = !TextUtils.isEmpty(strM18613a4) && strM18613a4.length() >= 755 && strM18613a4.charAt(754) == '1';
            String strM18613a5 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_PurposeLegitimateInterests");
            String strM18613a6 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_VendorLegitimateInterests");
            boolean z8 = !TextUtils.isEmpty(strM18613a6) && strM18613a6.length() >= 755 && strM18613a6.charAt(754) == '1';
            cArr[0] = '2';
            c4105o5 = new C4105O5(AbstractC4119Q5.m18616d(abstractC1273lM5552n, abstractC1273lM5565c, abstractC1274mM5577y, cArr, iM18614b, iM18614b5, iM18614b3, iM18614b2, iM18614b4, strM18613a, strM18613a3, strM18613a5, z7, z8, zContains));
        } else {
            String strM18613a7 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_VendorConsents");
            if (!"".equals(strM18613a7) && strM18613a7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strM18613a7.charAt(754)));
            }
            int iM18614b6 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_gdprApplies");
            if (iM18614b6 != -1) {
                map.put("gdprApplies", String.valueOf(iM18614b6));
            }
            int iM18614b7 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_EnableAdvertiserConsentMode");
            if (iM18614b7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iM18614b7));
            }
            int iM18614b8 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_PolicyVersion");
            if (iM18614b8 != -1) {
                map.put("PolicyVersion", String.valueOf(iM18614b8));
            }
            String strM18613a8 = AbstractC4119Q5.m18613a(sharedPreferencesM18489q, "IABTCF_PurposeConsents");
            if (!"".equals(strM18613a8)) {
                map.put("PurposeConsents", strM18613a8);
            }
            int iM18614b9 = AbstractC4119Q5.m18614b(sharedPreferencesM18489q, "IABTCF_CmpSdkID");
            if (iM18614b9 != -1) {
                map.put("CmpSdkID", String.valueOf(iM18614b9));
            }
            c4105o5 = new C4105O5(map);
        }
        c4164x2.mo18421a().m18859w().m18835b("Tcf preferences read", c4105o5);
        if (!c4164x2.m18686w().m18800H(null, c4201c2)) {
            if (c4164x2.m18687x().m18496x(c4105o5)) {
                Bundle bundleM18573b = c4105o5.m18573b();
                c4164x2.mo18421a().m18859w().m18835b("Consent generated from Tcf", bundleM18573b);
                if (bundleM18573b != Bundle.EMPTY) {
                    m19294o0(bundleM18573b, -30, c4164x2.mo18425f().mo18159a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", c4105o5.m18576e());
                m19303t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        C4026E2 c4026e2M18687x = c4164x2.m18687x();
        c4026e2M18687x.mo18427h();
        String string = c4026e2M18687x.m18488p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c4105o6 = new C4105O5(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && AbstractC4119Q5.f15382a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            c4105o6 = new C4105O5(map2);
        }
        if (c4164x2.m18687x().m18496x(c4105o5)) {
            Bundle bundleM18573b2 = c4105o5.m18573b();
            c4164x2.mo18421a().m18859w().m18835b("Consent generated from Tcf", bundleM18573b2);
            if (bundleM18573b2 != Bundle.EMPTY) {
                m19294o0(bundleM18573b2, -30, c4164x2.mo18425f().mo18159a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", c4105o5.m18575d(c4105o6));
            bundle2.putString("_tcfd2", c4105o5.m18574c());
            bundle2.putString("_tcfd", c4105o5.m18576e());
            m19303t("auto", "_tcf", bundle2);
        }
    }

    /* JADX INFO: renamed from: r0 */
    final void m19300r0(Runnable runnable) {
        m18748j();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.mo18422b().m18635p()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (c4164x2.mo18422b().m18636q()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        c4164x2.mo18423c();
        if (C4222f.m18746a()) {
            c4164x2.mo18421a().m18851o().m18834a("Cannot retrieve and upload batches from main thread");
            return;
        }
        c4164x2.mo18421a().m18859w().m18834a("[sgtm] Started client-side batch upload work.");
        boolean z7 = false;
        int size = 0;
        int i7 = 0;
        while (!z7) {
            c4164x2.mo18421a().m18859w().m18834a("[sgtm] Getting upload batches from service (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c4164x2.mo18422b().m18640u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: com.google.android.gms.measurement.internal.w4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f16182a.f15066a.m18668J().m19232j0(atomicReference, C6027J.m27047T(EnumC6024G.SGTM_CLIENT));
                }
            });
            C4181Z5 c4181z5 = (C4181Z5) atomicReference.get();
            if (c4181z5 == null) {
                break;
            }
            List list = c4181z5.f15539a;
            if (!list.isEmpty()) {
                c4164x2.mo18421a().m18859w().m18835b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                size += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z7 = false;
                        break;
                    }
                    EnumC6023F enumC6023FM19253e0 = m19253e0((C4167X5) it.next());
                    if (enumC6023FM19253e0 == EnumC6023F.SUCCESS) {
                        i7++;
                    } else if (enumC6023FM19253e0 == EnumC6023F.BACKOFF) {
                        z7 = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        c4164x2.mo18421a().m18859w().m18836c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i7));
        runnable.run();
    }

    /* JADX INFO: renamed from: s */
    public final void m19301s() {
        mo18427h();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18858v().m18834a("Register tcfPrefChangeListener.");
        if (this.f16222u == null) {
            this.f16223v = new C4117Q3(this, this.f15066a);
            this.f16222u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.measurement.internal.s4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    this.f16042a.m19275T(sharedPreferences, str);
                }
            };
        }
        c4164x2.m18687x().m18489q().registerOnSharedPreferenceChangeListener(this.f16222u);
    }

    /* JADX INFO: renamed from: s0 */
    final void m19302s0(long j7) {
        mo18427h();
        if (this.f16213l == null) {
            this.f16213l = new C4059I3(this, this.f15066a);
        }
        this.f16213l.m19249b(j7);
    }

    /* JADX INFO: renamed from: t */
    final void m19303t(String str, String str2, Bundle bundle) {
        mo18427h();
        m19305u(str, str2, this.f15066a.mo18425f().mo18159a(), bundle);
    }

    /* JADX INFO: renamed from: t0 */
    final void m19304t0() {
        mo18427h();
        AbstractC4366x abstractC4366x = this.f16213l;
        if (abstractC4366x != null) {
            abstractC4366x.m19251d();
        }
    }

    /* JADX INFO: renamed from: u */
    final void m19305u(String str, String str2, long j7, Bundle bundle) {
        mo18427h();
        boolean z7 = true;
        if (this.f16205d != null && !C4389z6.m19357N(str2)) {
            z7 = false;
        }
        m19307v(str, str2, j7, bundle, true, z7, true, null);
    }

    /* JADX INFO: renamed from: u0 */
    final void m19306u0() {
        zzqp.zza();
        C4164X2 c4164x2 = this.f15066a;
        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15631R0)) {
            if (c4164x2.mo18422b().m18635p()) {
                c4164x2.mo18421a().m18851o().m18834a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c4164x2.mo18423c();
            if (C4222f.m18746a()) {
                c4164x2.mo18421a().m18851o().m18834a("Cannot get trigger URIs from main thread");
                return;
            }
            m18748j();
            c4164x2.mo18421a().m18859w().m18834a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c4164x2.mo18422b().m18640u(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: com.google.android.gms.measurement.internal.o4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C4371x4 c4371x4 = this.f15934a;
                    c4371x4.f15066a.m18668J().m19231i0(atomicReference, c4371x4.f15066a.m18687x().f15181o.m18419a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c4164x2.mo18421a().m18853q().m18834a("Timed out waiting for get trigger URIs");
            } else {
                c4164x2.mo18422b().m18639t(new Runnable() { // from class: com.google.android.gms.measurement.internal.p4
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C4371x4 c4371x4 = this.f15949a;
                        c4371x4.mo18427h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<C4132S5> list2 = list;
                        SparseArray sparseArrayM18490r = c4371x4.f15066a.m18687x().m18490r();
                        for (C4132S5 c4132s5 : list2) {
                            int i7 = c4132s5.f15419c;
                            if (!sparseArrayM18490r.contains(i7) || ((Long) sparseArrayM18490r.get(i7)).longValue() < c4132s5.f15418b) {
                                c4371x4.m19310w0().add(c4132s5);
                            }
                        }
                        c4371x4.m19312x0();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    protected final void m19307v(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        boolean z10;
        int i7;
        C4164X2 c4164x2;
        long j8;
        long j9;
        String str4;
        C4164X2 c4164x3;
        long j10;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC3718s.m18077f(str5);
        AbstractC3718s.m18083l(bundle);
        mo18427h();
        m18748j();
        C4164X2 c4164x4 = this.f15066a;
        if (!c4164x4.m18675g()) {
            this.f15066a.mo18421a().m18858v().m18834a("Event not sent since app measurement is disabled");
            return;
        }
        List listM18760w = this.f15066a.m18670L().m18760w();
        if (listM18760w != null && !listM18760w.contains(str2)) {
            this.f15066a.mo18421a().m18858v().m18836c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f16207f) {
            this.f16207f = true;
            try {
                try {
                    (!c4164x4.m18665G() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f15066a.mo18424e().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f15066a.mo18424e());
                } catch (Exception e7) {
                    this.f15066a.mo18421a().m18854r().m18835b("Failed to invoke Tag Manager's initialize() method", e7);
                }
            } catch (ClassNotFoundException unused) {
                this.f15066a.mo18421a().m18857u().m18834a("Tag Manager is not found and thus will not be used");
            }
        }
        C4164X2 c4164x5 = this.f15066a;
        if (!c4164x5.m18686w().m18800H(null, AbstractC4209d2.f15668g1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            c4164x5.mo18423c();
            m19257B("auto", "_lgclid", bundle.getString("gclid"), c4164x5.mo18425f().mo18159a());
        }
        C4371x4 c4371x4 = this;
        c4164x5.mo18423c();
        if (z7 && C4389z6.m19359U(str2)) {
            c4164x5.m18661C().m19413w(bundle, c4164x5.m18687x().f15192z.m18419a());
        }
        if (!z9) {
            c4164x5.mo18423c();
            if (!"_iap".equals(str2)) {
                C4164X2 c4164x6 = c4371x4.f15066a;
                C4389z6 c4389z6M18661C = c4164x6.m18661C();
                int i8 = 2;
                if (c4389z6M18661C.m19408t0("event", str2)) {
                    if (c4389z6M18661C.m19412v0("event", AbstractC6052w.f23825a, AbstractC6052w.f23826b, str2)) {
                        c4389z6M18661C.f15066a.m18686w();
                        if (c4389z6M18661C.m19414w0("event", 40, str2)) {
                            i8 = 0;
                        }
                    } else {
                        i8 = 13;
                    }
                }
                if (i8 != 0) {
                    c4164x5.mo18421a().m18853q().m18835b("Invalid public event name. Event will not be logged (FE)", c4164x5.m18662D().m18775a(str2));
                    C4389z6 c4389z6M18661C2 = c4164x6.m18661C();
                    c4164x6.m18686w();
                    c4164x6.m18661C().m19369B(c4371x4.f16224w, null, i8, "_ev", c4389z6M18661C2.m19402q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c4164x5.mo18423c();
        C4164X2 c4164x7 = c4371x4.f15066a;
        C4028E4 c4028e4M18550q = c4164x7.m18667I().m18550q(false);
        if (c4028e4M18550q != null && !bundle.containsKey("_sc")) {
            c4028e4M18550q.f15199d = true;
        }
        C4389z6.m19362k0(c4028e4M18550q, bundle, z7 && !z9);
        boolean zEquals = "am".equals(str5);
        boolean zM19357N = C4389z6.m19357N(str2);
        if (!z7 || c4371x4.f16205d == null || zM19357N) {
            z10 = zEquals;
        } else {
            if (!zEquals) {
                c4164x5.mo18421a().m18858v().m18836c("Passing event to registered event handler (FE)", c4164x5.m18662D().m18775a(str2), c4164x5.m18662D().m18779e(bundle));
                AbstractC3718s.m18083l(c4371x4.f16205d);
                c4371x4.f16205d.mo18781a(str5, str2, bundle, j7);
                return;
            }
            z10 = true;
        }
        C4164X2 c4164x8 = c4371x4.f15066a;
        if (c4164x8.m18681m()) {
            int iM19416x0 = c4164x5.m18661C().m19416x0(str2);
            if (iM19416x0 != 0) {
                c4164x5.mo18421a().m18853q().m18835b("Invalid event name. Event will not be logged (FE)", c4164x5.m18662D().m18775a(str2));
                C4389z6 c4389z6M18661C3 = c4164x5.m18661C();
                c4164x5.m18686w();
                c4164x8.m18661C().m19369B(c4371x4.f16224w, str3, iM19416x0, "_ev", c4389z6M18661C3.m19402q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleM19407t = c4164x5.m18661C().m19407t(str3, str2, bundle, AbstractC3751f.m18163b("_o", "_sn", "_sc", "_si"), z9);
            AbstractC3718s.m18083l(bundleM19407t);
            c4164x5.mo18423c();
            if (c4164x7.m18667I().m18550q(false) == null || !"_ae".equals(str2)) {
                i7 = 0;
                c4164x2 = c4164x7;
                j8 = 0;
            } else {
                C4084L5 c4084l5 = c4164x7.m18689z().f15335f;
                j8 = 0;
                long jMo18161c = c4084l5.f15303d.f15066a.mo18425f().mo18161c();
                i7 = 0;
                c4164x2 = c4164x7;
                long j11 = jMo18161c - c4084l5.f15301b;
                c4084l5.f15301b = jMo18161c;
                if (j11 > 0) {
                    c4164x5.m18661C().m19389Z(bundleM19407t, j11);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                C4389z6 c4389z6M18661C4 = c4164x5.m18661C();
                String string = bundleM19407t.getString("_ffr");
                if (AbstractC3765t.m18209b(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C4164X2 c4164x9 = c4389z6M18661C4.f15066a;
                if (Objects.equals(string, c4164x9.m18687x().f15189w.m18459a())) {
                    c4164x9.mo18421a().m18858v().m18834a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c4164x9.m18687x().f15189w.m18460b(string);
            } else if ("_ae".equals(str2)) {
                String strM18459a = c4164x5.m18661C().f15066a.m18687x().f15189w.m18459a();
                if (!TextUtils.isEmpty(strM18459a)) {
                    bundleM19407t.putString("_ffr", strM18459a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleM19407t);
            boolean zM18565p = c4164x5.m18686w().m18800H(null, AbstractC4209d2.f15639V0) ? c4164x2.m18689z().m18565p() : c4164x5.m18687x().f15186t.m19333a();
            if (c4164x5.m18687x().f15183q.m18433a() > j8) {
                c4164x3 = c4164x5;
                if (c4164x5.m18687x().m18486A(j7) && zM18565p) {
                    c4164x3.mo18421a().m18859w().m18834a("Current session is expired, remove the session number, ID, and engagement time");
                    j9 = j8;
                    str4 = "_ae";
                    m19257B("auto", "_sid", null, c4164x3.mo18425f().mo18159a());
                    m19257B("auto", "_sno", null, c4164x3.mo18425f().mo18159a());
                    m19257B("auto", "_se", null, c4164x3.mo18425f().mo18159a());
                    c4371x4 = this;
                    c4164x3.m18687x().f15184r.m18434b(j9);
                } else {
                    j9 = j8;
                    str4 = "_ae";
                }
            } else {
                j9 = j8;
                str4 = "_ae";
                c4164x3 = c4164x5;
            }
            if (bundleM19407t.getLong("extend_session", j9) == 1) {
                c4164x3.mo18421a().m18859w().m18834a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j10 = j7;
                c4164x8.m18689z().f15334e.m18561b(j10, true);
            } else {
                j10 = j7;
            }
            ArrayList arrayList2 = new ArrayList(bundleM19407t.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i9 = i7; i9 < size; i9++) {
                String str6 = (String) arrayList2.get(i9);
                if (str6 != null) {
                    c4164x3.m18661C();
                    Object obj = bundleM19407t.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i7] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM19407t.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i10 = i7;
            while (i10 < arrayList.size()) {
                Bundle bundleM19381Q = (Bundle) arrayList.get(i10);
                String str7 = i10 != 0 ? "_ep" : str2;
                bundleM19381Q.putString("_o", str5);
                if (z8) {
                    bundleM19381Q = c4164x3.m18661C().m19381Q(bundleM19381Q, null);
                }
                Bundle bundle2 = bundleM19381Q;
                c4164x2.m18668J().m19225c0(new C4039G(str7, new C4023E(bundle2), str5, j10), str3);
                if (!z10) {
                    Iterator it = c4371x4.f16206e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC6018A) it.next()).mo18430a(str, str2, new Bundle(bundle2), j7);
                    }
                }
                i10++;
                str5 = str;
                j10 = j7;
            }
            c4164x3.mo18423c();
            if (c4164x2.m18667I().m18550q(i7) == null || !str4.equals(str2)) {
                return;
            }
            c4164x2.m18689z().f15335f.m18540d(true, true, c4164x3.mo18425f().mo18161c());
        }
    }

    /* JADX INFO: renamed from: v0 */
    final boolean m19308v0() {
        return this.f16215n;
    }

    /* JADX INFO: renamed from: w */
    public final void m19309w(String str, String str2, Bundle bundle, String str3) {
        C4164X2.m18654q();
        m19311x("auto", str2, this.f15066a.mo18425f().mo18159a(), bundle, false, true, true, str3);
    }

    /* JADX INFO: renamed from: w0 */
    final PriorityQueue m19310w0() {
        if (this.f16214m == null) {
            this.f16214m = new PriorityQueue(Comparator.comparing(C4315q4.f15978a, C4323r4.f16032a));
        }
        return this.f16214m;
    }

    /* JADX INFO: renamed from: x */
    protected final void m19311x(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        int i7 = C4389z6.f16275k;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i8 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i8 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i8];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i8] = new Bundle((Bundle) parcelable);
                        }
                        i8++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i8 < list.size()) {
                        Object obj2 = list.get(i8);
                        if (obj2 instanceof Bundle) {
                            list.set(i8, new Bundle((Bundle) obj2));
                        }
                        i8++;
                    }
                }
            }
        }
        this.f15066a.mo18422b().m18639t(new RunnableC4123R3(this, str, str2, j7, bundle2, z7, z8, z9, str3));
    }

    /* JADX INFO: renamed from: x0 */
    final void m19312x0() {
        C4132S5 c4132s5;
        mo18427h();
        this.f16215n = false;
        if (m19310w0().isEmpty() || this.f16210i || (c4132s5 = (C4132S5) m19310w0().poll()) == null) {
            return;
        }
        C4164X2 c4164x2 = this.f15066a;
        AbstractC7153a abstractC7153aM19374H = c4164x2.m18661C().m19374H();
        if (abstractC7153aM19374H != null) {
            this.f16210i = true;
            C4297o2 c4297o2M18859w = c4164x2.mo18421a().m18859w();
            String str = c4132s5.f15417a;
            c4297o2M18859w.m18835b("Registering trigger URI", str);
            InterfaceFutureC1673e interfaceFutureC1673eMo31624d = abstractC7153aM19374H.mo31624d(Uri.parse(str));
            if (interfaceFutureC1673eMo31624d != null) {
                AbstractC1671c.m7031a(interfaceFutureC1673eMo31624d, new C4075K3(this, c4132s5), new ExecutorC4067J3(this));
            } else {
                this.f16210i = false;
                m19310w0().add(c4132s5);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m19313y(String str, String str2, Object obj, boolean z7) {
        m19314z("auto", "_ldl", obj, true, this.f15066a.mo18425f().mo18159a());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX INFO: renamed from: z */
    public final void m19314z(String str, String str2, Object obj, boolean z7, long j7) {
        int i7;
        int iM19418y0;
        String str3;
        C4164X2 c4164x2;
        int iM19417y;
        Object objM19419z;
        if (!z7) {
            C4389z6 c4389z6M18661C = this.f15066a.m18661C();
            if (!c4389z6M18661C.m19408t0("user property", str2)) {
                i7 = 6;
            } else if (c4389z6M18661C.m19412v0("user property", AbstractC6054y.f23833a, null, str2)) {
                c4389z6M18661C.f15066a.m18686w();
                if (c4389z6M18661C.m19414w0("user property", 24, str2)) {
                    i7 = 0;
                } else {
                    i7 = 6;
                }
            } else {
                iM19418y0 = 15;
            }
            if (i7 != 0) {
                C4164X2 c4164x3 = this.f15066a;
                C4389z6 c4389z6M18661C2 = c4164x3.m18661C();
                c4164x3.m18686w();
                this.f15066a.m18661C().m19369B(this.f16224w, null, i7, "_ev", c4389z6M18661C2.m19402q(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            if (str == null) {
                str3 = "app";
            } else {
                str3 = str;
            }
            if (obj != null) {
                m19256A(str3, str2, j7, null);
                return;
            }
            c4164x2 = this.f15066a;
            iM19417y = c4164x2.m18661C().m19417y(str2, obj);
            if (iM19417y != 0) {
                objM19419z = c4164x2.m18661C().m19419z(str2, obj);
                if (objM19419z != null) {
                    m19256A(str3, str2, j7, objM19419z);
                    return;
                }
                return;
            }
            C4389z6 c4389z6M18661C3 = c4164x2.m18661C();
            c4164x2.m18686w();
            this.f15066a.m18661C().m19369B(this.f16224w, null, iM19417y, "_ev", c4389z6M18661C3.m19402q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        }
        iM19418y0 = this.f15066a.m18661C().m19418y0(str2);
        i7 = iM19418y0;
        if (i7 != 0) {
            C4164X2 c4164x4 = this.f15066a;
            C4389z6 c4389z6M18661C4 = c4164x4.m18661C();
            c4164x4.m18686w();
            if (str2 != null) {
            }
            this.f15066a.m18661C().m19369B(this.f16224w, null, i7, "_ev", c4389z6M18661C4.m19402q(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (obj != null) {
            m19256A(str3, str2, j7, null);
            return;
        }
        c4164x2 = this.f15066a;
        iM19417y = c4164x2.m18661C().m19417y(str2, obj);
        if (iM19417y != 0) {
            objM19419z = c4164x2.m18661C().m19419z(str2, obj);
            if (objM19419z != null) {
                m19256A(str3, str2, j7, objM19419z);
                return;
            }
            return;
        }
        C4389z6 c4389z6M18661C5 = c4164x2.m18661C();
        c4164x2.m18686w();
        this.f15066a.m18661C().m19369B(this.f16224w, null, iM19417y, "_ev", c4389z6M18661C5.m19402q(str2, 24, true), (!(obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
    }
}
