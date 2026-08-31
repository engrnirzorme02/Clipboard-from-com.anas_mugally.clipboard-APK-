package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.AbstractC2436b;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.util.C3753h;
import com.google.android.gms.common.util.InterfaceC3750e;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzqp;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p227d3.C5228d;
import p283k3.C6030a;
import p283k3.EnumC6050u;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4164X2 implements InterfaceC4011C3 {

    /* JADX INFO: renamed from: E */
    private static volatile C4164X2 f15469E;

    /* JADX INFO: renamed from: A */
    private int f15470A;

    /* JADX INFO: renamed from: B */
    private int f15471B;

    /* JADX INFO: renamed from: D */
    final long f15473D;

    /* JADX INFO: renamed from: a */
    private final Context f15474a;

    /* JADX INFO: renamed from: b */
    private final boolean f15475b;

    /* JADX INFO: renamed from: c */
    private final C4222f f15476c;

    /* JADX INFO: renamed from: d */
    private final C4278m f15477d;

    /* JADX INFO: renamed from: e */
    private final C4026E2 f15478e;

    /* JADX INFO: renamed from: f */
    private final C4313q2 f15479f;

    /* JADX INFO: renamed from: g */
    private final C4136T2 f15480g;

    /* JADX INFO: renamed from: h */
    private final C4098N5 f15481h;

    /* JADX INFO: renamed from: i */
    private final C4389z6 f15482i;

    /* JADX INFO: renamed from: j */
    private final C4257j2 f15483j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3750e f15484k;

    /* JADX INFO: renamed from: l */
    private final C4090M4 f15485l;

    /* JADX INFO: renamed from: m */
    private final C4371x4 f15486m;

    /* JADX INFO: renamed from: n */
    private final C4008C0 f15487n;

    /* JADX INFO: renamed from: o */
    private final C4004B4 f15488o;

    /* JADX INFO: renamed from: p */
    private final String f15489p;

    /* JADX INFO: renamed from: q */
    private C4249i2 f15490q;

    /* JADX INFO: renamed from: r */
    private C4364w5 f15491r;

    /* JADX INFO: renamed from: s */
    private C3991A f15492s;

    /* JADX INFO: renamed from: t */
    private C4233g2 f15493t;

    /* JADX INFO: renamed from: u */
    private C4020D4 f15494u;

    /* JADX INFO: renamed from: w */
    private Boolean f15496w;

    /* JADX INFO: renamed from: x */
    private long f15497x;

    /* JADX INFO: renamed from: y */
    private volatile Boolean f15498y;

    /* JADX INFO: renamed from: z */
    private volatile boolean f15499z;

    /* JADX INFO: renamed from: v */
    private boolean f15495v = false;

    /* JADX INFO: renamed from: C */
    private final AtomicInteger f15472C = new AtomicInteger(0);

    C4164X2(C4043G3 c4043g3) {
        AbstractC3718s.m18083l(c4043g3);
        Context context = c4043g3.f15227a;
        C4222f c4222f = new C4222f(context);
        this.f15476c = c4222f;
        AbstractC4156W1.f15460a = c4222f;
        this.f15474a = context;
        this.f15475b = c4043g3.f15231e;
        this.f15498y = c4043g3.f15228b;
        this.f15489p = c4043g3.f15233g;
        this.f15499z = true;
        zzkm.zzb(context);
        InterfaceC3750e interfaceC3750eM18171d = C3753h.m18171d();
        this.f15484k = interfaceC3750eM18171d;
        Long l7 = c4043g3.f15232f;
        this.f15473D = l7 != null ? l7.longValue() : interfaceC3750eM18171d.mo18159a();
        this.f15477d = new C4278m(this);
        C4026E2 c4026e2 = new C4026E2(this);
        c4026e2.m18438m();
        this.f15478e = c4026e2;
        C4313q2 c4313q2 = new C4313q2(this);
        c4313q2.m18438m();
        this.f15479f = c4313q2;
        C4389z6 c4389z6 = new C4389z6(this);
        c4389z6.m18438m();
        this.f15482i = c4389z6;
        this.f15483j = new C4257j2(new C4035F3(c4043g3, this));
        this.f15487n = new C4008C0(this);
        C4090M4 c4090m4 = new C4090M4(this);
        c4090m4.m18749k();
        this.f15485l = c4090m4;
        C4371x4 c4371x4 = new C4371x4(this);
        c4371x4.m18749k();
        this.f15486m = c4371x4;
        C4098N5 c4098n5 = new C4098N5(this);
        c4098n5.m18749k();
        this.f15481h = c4098n5;
        C4004B4 c4004b4 = new C4004B4(this);
        c4004b4.m18438m();
        this.f15488o = c4004b4;
        C4136T2 c4136t2 = new C4136T2(this);
        c4136t2.m18438m();
        this.f15480g = c4136t2;
        zzdd zzddVar = c4043g3.f15230d;
        boolean z7 = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            m18657t(c4371x4);
            if (c4371x4.f15066a.f15474a.getApplicationContext() instanceof Application) {
                Application application = (Application) c4371x4.f15066a.f15474a.getApplicationContext();
                if (c4371x4.f16204c == null) {
                    c4371x4.f16204c = new C4275l4(c4371x4);
                }
                if (z7) {
                    application.unregisterActivityLifecycleCallbacks(c4371x4.f16204c);
                    application.registerActivityLifecycleCallbacks(c4371x4.f16204c);
                    C4313q2 c4313q3 = c4371x4.f15066a.f15479f;
                    m18658u(c4313q3);
                    c4313q3.m18859w().m18834a("Registered activity lifecycle callback");
                }
            }
        } else {
            m18658u(c4313q2);
            c4313q2.m18854r().m18834a("Application context is not an Application");
        }
        c4136t2.m18639t(new RunnableC4150V2(this, c4043g3));
    }

    /* JADX INFO: renamed from: O */
    public static C4164X2 m18653O(Context context, zzdd zzddVar, Long l7) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        AbstractC3718s.m18083l(context);
        AbstractC3718s.m18083l(context.getApplicationContext());
        if (f15469E == null) {
            synchronized (C4164X2.class) {
                try {
                    if (f15469E == null) {
                        f15469E = new C4164X2(new C4043G3(context, zzddVar, l7));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC3718s.m18083l(f15469E);
            f15469E.f15498y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC3718s.m18083l(f15469E);
        return f15469E;
    }

    /* JADX INFO: renamed from: q */
    static final void m18654q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: renamed from: r */
    private static final void m18655r(AbstractC4025E1 abstractC4025E1) {
        if (abstractC4025E1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: s */
    private static final void m18656s(AbstractC3995A3 abstractC3995A3) {
        if (abstractC3995A3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: renamed from: t */
    private static final void m18657t(AbstractC4225f2 abstractC4225f2) {
        if (abstractC4225f2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC4225f2.m18747i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC4225f2.getClass())));
        }
    }

    /* JADX INFO: renamed from: u */
    private static final void m18658u(AbstractC4003B3 abstractC4003B3) {
        if (abstractC4003B3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC4003B3.m18436k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC4003B3.getClass())));
        }
    }

    /* JADX INFO: renamed from: A */
    final C4136T2 m18659A() {
        return this.f15480g;
    }

    /* JADX INFO: renamed from: B */
    public final C4371x4 m18660B() {
        C4371x4 c4371x4 = this.f15486m;
        m18657t(c4371x4);
        return c4371x4;
    }

    /* JADX INFO: renamed from: C */
    public final C4389z6 m18661C() {
        C4389z6 c4389z6 = this.f15482i;
        m18656s(c4389z6);
        return c4389z6;
    }

    /* JADX INFO: renamed from: D */
    public final C4257j2 m18662D() {
        return this.f15483j;
    }

    /* JADX INFO: renamed from: E */
    public final C4249i2 m18663E() {
        m18657t(this.f15490q);
        return this.f15490q;
    }

    /* JADX INFO: renamed from: F */
    public final C4004B4 m18664F() {
        C4004B4 c4004b4 = this.f15488o;
        m18658u(c4004b4);
        return c4004b4;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m18665G() {
        return this.f15475b;
    }

    /* JADX INFO: renamed from: H */
    public final String m18666H() {
        return this.f15489p;
    }

    /* JADX INFO: renamed from: I */
    public final C4090M4 m18667I() {
        C4090M4 c4090m4 = this.f15485l;
        m18657t(c4090m4);
        return c4090m4;
    }

    /* JADX INFO: renamed from: J */
    public final C4364w5 m18668J() {
        m18657t(this.f15491r);
        return this.f15491r;
    }

    /* JADX INFO: renamed from: K */
    public final C3991A m18669K() {
        m18658u(this.f15492s);
        return this.f15492s;
    }

    /* JADX INFO: renamed from: L */
    public final C4233g2 m18670L() {
        m18657t(this.f15493t);
        return this.f15493t;
    }

    /* JADX INFO: renamed from: M */
    public final C4008C0 m18671M() {
        C4008C0 c4008c0 = this.f15487n;
        m18655r(c4008c0);
        return c4008c0;
    }

    /* JADX INFO: renamed from: N */
    public final C4020D4 m18672N() {
        m18655r(this.f15494u);
        return this.f15494u;
    }

    /* JADX INFO: renamed from: P */
    final void m18673P(boolean z7) {
        this.f15498y = Boolean.valueOf(z7);
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4011C3
    /* JADX INFO: renamed from: a */
    public final C4313q2 mo18421a() {
        C4313q2 c4313q2 = this.f15479f;
        m18658u(c4313q2);
        return c4313q2;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4011C3
    /* JADX INFO: renamed from: b */
    public final C4136T2 mo18422b() {
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        return c4136t2;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4011C3
    /* JADX INFO: renamed from: c */
    public final C4222f mo18423c() {
        return this.f15476c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m18674d() {
        return this.f15498y != null && this.f15498y.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4011C3
    /* JADX INFO: renamed from: e */
    public final Context mo18424e() {
        return this.f15474a;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4011C3
    /* JADX INFO: renamed from: f */
    public final InterfaceC3750e mo18425f() {
        return this.f15484k;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18675g() {
        return m18676h() == 0;
    }

    /* JADX INFO: renamed from: h */
    public final int m18676h() {
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        C4278m c4278m = this.f15477d;
        if (c4278m.m18804L()) {
            return 1;
        }
        m18658u(c4136t2);
        c4136t2.mo18427h();
        if (!this.f15499z) {
            return 8;
        }
        C4026E2 c4026e2 = this.f15478e;
        m18656s(c4026e2);
        Boolean boolM18492t = c4026e2.m18492t();
        if (boolM18492t != null) {
            return boolM18492t.booleanValue() ? 0 : 3;
        }
        C4222f c4222f = c4278m.f15066a.f15476c;
        Boolean boolM18802J = c4278m.m18802J("firebase_analytics_collection_enabled");
        if (boolM18802J != null) {
            return boolM18802J.booleanValue() ? 0 : 4;
        }
        return (this.f15498y == null || this.f15498y.booleanValue()) ? 0 : 7;
    }

    /* JADX INFO: renamed from: i */
    public final void m18677i(boolean z7) {
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        this.f15499z = z7;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m18678j() {
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        return this.f15499z;
    }

    /* JADX INFO: renamed from: k */
    final void m18679k() {
        this.f15470A++;
    }

    /* JADX INFO: renamed from: l */
    final void m18680l() {
        this.f15472C.incrementAndGet();
    }

    /* JADX INFO: renamed from: m */
    protected final boolean m18681m() {
        if (!this.f15495v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        Boolean bool = this.f15496w;
        if (bool == null || this.f15497x == 0 || (!bool.booleanValue() && Math.abs(this.f15484k.mo18161c() - this.f15497x) > 1000)) {
            this.f15497x = this.f15484k.mo18161c();
            C4389z6 c4389z6 = this.f15482i;
            m18656s(c4389z6);
            boolean z7 = false;
            if (c4389z6.m19379M("android.permission.INTERNET")) {
                m18656s(c4389z6);
                if (c4389z6.m19379M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.f15474a;
                    if (C5228d.m24155a(context).m24153g() || this.f15477d.m18815m() || (C4389z6.m19361j0(context) && C4389z6.m19355E(context, false))) {
                        z7 = true;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z7);
            this.f15496w = boolValueOf;
            if (boolValueOf.booleanValue()) {
                m18656s(c4389z6);
                this.f15496w = Boolean.valueOf(c4389z6.m19399o(m18670L().m18755r()));
            }
        }
        return this.f15496w.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX INFO: renamed from: n */
    public final boolean m18682n() {
        NetworkInfo activeNetworkInfo;
        Bundle bundle;
        C4374y c4374yM19317h;
        int i7;
        String str;
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        C4004B4 c4004b4 = this.f15488o;
        m18658u(c4004b4);
        m18658u(c4004b4);
        String strM18754q = m18670L().m18754q();
        if (!this.f15477d.m18805M()) {
            C4313q2 c4313q2 = this.f15479f;
            m18658u(c4313q2);
            c4313q2.m18859w().m18834a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        C4026E2 c4026e2 = this.f15478e;
        m18656s(c4026e2);
        Pair pairM18487o = c4026e2.m18487o(strM18754q);
        if (((Boolean) pairM18487o.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairM18487o.first)) {
            C4313q2 c4313q3 = this.f15479f;
            m18658u(c4313q3);
            c4313q3.m18859w().m18834a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        m18658u(c4004b4);
        c4004b4.m18437l();
        ConnectivityManager connectivityManager = (ConnectivityManager) c4004b4.f15066a.f15474a.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
                activeNetworkInfo = null;
            }
        } else {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            C4313q2 c4313q4 = this.f15479f;
            m18658u(c4313q4);
            c4313q4.m18854r().m18834a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        C4364w5 c4364w5M18668J = m18668J();
        c4364w5M18668J.mo18427h();
        c4364w5M18668J.m18748j();
        if (c4364w5M18668J.m19245y()) {
            C4389z6 c4389z6 = c4364w5M18668J.f15066a.f15482i;
            m18656s(c4389z6);
            if (c4389z6.m19386W() >= 234200) {
                C4371x4 c4371x4 = this.f15486m;
                m18657t(c4371x4);
                C4164X2 c4164x2 = c4371x4.f15066a;
                c4371x4.mo18427h();
                C6030a c6030aM19234l0 = c4164x2.m18668J().m19234l0();
                if (c6030aM19234l0 != null) {
                }
                if (bundle == null) {
                    i7 = this.f15471B;
                    this.f15471B = i7 + 1;
                    if (i7 < 10) {
                    }
                    C4313q2 c4313q5 = this.f15479f;
                    m18658u(c4313q5);
                    if (i7 < 10) {
                        str = "Retrying.";
                    } else {
                        str = "Skipping.";
                    }
                    C4297o2 c4297o2M18858v = c4313q5.m18858v();
                    StringBuilder sb2 = new StringBuilder(str.length() + 60);
                    sb2.append("Failed to retrieve DMA consent from the service, ");
                    sb2.append(str);
                    sb2.append(" retryCount");
                    c4297o2M18858v.m18835b(sb2.toString(), Integer.valueOf(this.f15471B));
                    return z;
                }
                C4027E3 c4027e3M18501e = C4027E3.m18501e(bundle, 100);
                sb.append("&gcs=");
                sb.append(c4027e3M18501e.m18511k());
                c4374yM19317h = C4374y.m19317h(bundle, 100);
                sb.append("&dma=");
                sb.append(!Objects.equals(c4374yM19317h.m19325j(), Boolean.FALSE) ? 1 : 0);
                if (!TextUtils.isEmpty(c4374yM19317h.m19326k())) {
                    sb.append("&dma_cps=");
                    sb.append(c4374yM19317h.m19326k());
                }
                int i8 = !Objects.equals(C4374y.m19318i(bundle), Boolean.TRUE) ? 1 : 0;
                sb.append("&npa=");
                sb.append(i8);
                C4313q2 c4313q6 = this.f15479f;
                m18658u(c4313q6);
                c4313q6.m18859w().m18835b("Consent query parameters to Bow", sb);
            }
        } else {
            C4371x4 c4371x5 = this.f15486m;
            m18657t(c4371x5);
            C4164X2 c4164x3 = c4371x5.f15066a;
            c4371x5.mo18427h();
            C6030a c6030aM19234l1 = c4164x3.m18668J().m19234l0();
            bundle = c6030aM19234l1 != null ? c6030aM19234l1.f23808a : null;
            if (bundle == null) {
                i7 = this.f15471B;
                this.f15471B = i7 + 1;
                boolean z7 = i7 < 10;
                C4313q2 c4313q7 = this.f15479f;
                m18658u(c4313q7);
                if (i7 < 10) {
                    str = "Retrying.";
                } else {
                    str = "Skipping.";
                }
                C4297o2 c4297o2M18858v2 = c4313q7.m18858v();
                StringBuilder sb3 = new StringBuilder(str.length() + 60);
                sb3.append("Failed to retrieve DMA consent from the service, ");
                sb3.append(str);
                sb3.append(" retryCount");
                c4297o2M18858v2.m18835b(sb3.toString(), Integer.valueOf(this.f15471B));
                return z7;
            }
            C4027E3 c4027e3M18501e2 = C4027E3.m18501e(bundle, 100);
            sb.append("&gcs=");
            sb.append(c4027e3M18501e2.m18511k());
            c4374yM19317h = C4374y.m19317h(bundle, 100);
            sb.append("&dma=");
            sb.append(!Objects.equals(c4374yM19317h.m19325j(), Boolean.FALSE) ? 1 : 0);
            if (!TextUtils.isEmpty(c4374yM19317h.m19326k())) {
                sb.append("&dma_cps=");
                sb.append(c4374yM19317h.m19326k());
            }
            int i9 = !Objects.equals(C4374y.m19318i(bundle), Boolean.TRUE) ? 1 : 0;
            sb.append("&npa=");
            sb.append(i9);
            C4313q2 c4313q8 = this.f15479f;
            m18658u(c4313q8);
            c4313q8.m18859w().m18835b("Consent query parameters to Bow", sb);
        }
        C4389z6 c4389z7 = this.f15482i;
        m18656s(c4389z7);
        m18670L().f15066a.f15477d.m18793A();
        String str2 = (String) pairM18487o.first;
        C4026E2 c4026e3 = this.f15478e;
        m18656s(c4026e3);
        URL urlM19397i0 = c4389z7.m19397i0(133005L, strM18754q, str2, c4026e3.f15188v.m18433a() - 1, sb.toString());
        if (urlM19397i0 != null) {
            C4004B4 c4004b5 = this.f15488o;
            m18658u(c4004b5);
            InterfaceC4379y4 interfaceC4379y4 = new InterfaceC4379y4() { // from class: com.google.android.gms.measurement.internal.W2
                @Override // com.google.android.gms.measurement.internal.InterfaceC4379y4
                /* JADX INFO: renamed from: a */
                public final /* synthetic */ void mo18652a(String str3, int i10, Throwable th, byte[] bArr, Map map) {
                    this.f15461a.m18683o(str3, i10, th, bArr, map);
                }
            };
            c4004b5.m18437l();
            AbstractC3718s.m18083l(urlM19397i0);
            AbstractC3718s.m18083l(interfaceC4379y4);
            C4136T2 c4136t3 = c4004b5.f15066a.f15480g;
            m18658u(c4136t3);
            c4136t3.m18642w(new RunnableC3996A4(c4004b5, strM18754q, urlM19397i0, null, null, interfaceC4379y4));
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    final /* synthetic */ void m18683o(String str, int i7, Throwable th, byte[] bArr, Map map) {
        int i8;
        if (i7 != 200 && i7 != 204) {
            i8 = 304;
            if (i7 != 304) {
                i8 = i7;
            }
            C4313q2 c4313q2 = this.f15479f;
            m18658u(c4313q2);
            c4313q2.m18854r().m18836c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
        }
        i8 = i7;
        if (th == null) {
            C4026E2 c4026e2 = this.f15478e;
            m18656s(c4026e2);
            c4026e2.f15187u.m19334b(true);
            if (bArr == null || bArr.length == 0) {
                C4313q2 c4313q3 = this.f15479f;
                m18658u(c4313q3);
                c4313q3.m18858v().m18834a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    C4313q2 c4313q4 = this.f15479f;
                    m18658u(c4313q4);
                    c4313q4.m18858v().m18834a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                C4389z6 c4389z6 = this.f15482i;
                m18656s(c4389z6);
                C4164X2 c4164x2 = c4389z6.f15066a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = c4164x2.f15474a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.f15486m.m19303t("auto", "_cmp", bundle);
                        m18656s(c4389z6);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = c4389z6.f15066a.f15474a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e7) {
                            C4313q2 c4313q5 = c4389z6.f15066a.f15479f;
                            m18658u(c4313q5);
                            c4313q5.m18851o().m18835b("Failed to persist Deferred Deep Link. exception", e7);
                            return;
                        }
                    }
                }
                C4313q2 c4313q6 = this.f15479f;
                m18658u(c4313q6);
                c4313q6.m18854r().m18837d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e8) {
                C4313q2 c4313q7 = this.f15479f;
                m18658u(c4313q7);
                c4313q7.m18851o().m18835b("Failed to parse the Deferred Deep Link response. exception", e8);
                return;
            }
        }
        C4313q2 c4313q8 = this.f15479f;
        m18658u(c4313q8);
        c4313q8.m18854r().m18836c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i8), th);
    }

    /* JADX INFO: renamed from: p */
    final /* synthetic */ void m18684p(C4043G3 c4043g3) {
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        C4278m c4278m = this.f15477d;
        c4278m.m18817u();
        C3991A c3991a = new C3991A(this);
        c3991a.m18438m();
        this.f15492s = c3991a;
        zzdd zzddVar = c4043g3.f15230d;
        C4233g2 c4233g2 = new C4233g2(this, c4043g3.f15229c, zzddVar == null ? 0L : zzddVar.zza);
        c4233g2.m18749k();
        this.f15493t = c4233g2;
        C4249i2 c4249i2 = new C4249i2(this);
        c4249i2.m18749k();
        this.f15490q = c4249i2;
        C4364w5 c4364w5 = new C4364w5(this);
        c4364w5.m18749k();
        this.f15491r = c4364w5;
        C4389z6 c4389z6 = this.f15482i;
        c4389z6.m18439n();
        this.f15478e.m18439n();
        this.f15493t.m18750l();
        C4020D4 c4020d4 = new C4020D4(this);
        c4020d4.m18749k();
        this.f15494u = c4020d4;
        c4020d4.m18750l();
        C4313q2 c4313q2 = this.f15479f;
        m18658u(c4313q2);
        C4297o2 c4297o2M18857u = c4313q2.m18857u();
        c4278m.m18793A();
        c4297o2M18857u.m18835b("App measurement initialized, version", 133005L);
        m18658u(c4313q2);
        c4313q2.m18857u().m18834a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strM18754q = c4233g2.m18754q();
        m18656s(c4389z6);
        if (c4389z6.m19380P(strM18754q, c4278m.m18810R())) {
            m18658u(c4313q2);
            c4313q2.m18857u().m18834a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            m18658u(c4313q2);
            c4313q2.m18857u().m18834a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM18754q)));
        }
        m18658u(c4313q2);
        c4313q2.m18858v().m18834a("Debug-level message logging enabled");
        int i7 = this.f15470A;
        AtomicInteger atomicInteger = this.f15472C;
        if (i7 != atomicInteger.get()) {
            m18658u(c4313q2);
            c4313q2.m18851o().m18836c("Not all components initialized", Integer.valueOf(this.f15470A), Integer.valueOf(atomicInteger.get()));
        }
        this.f15495v = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0034  */
    /* JADX WARN: Code duplicated, block: B:13:0x006b  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[DONT_INVERT] */
    /* JADX INFO: renamed from: v */
    protected final void m18685v(zzdd zzddVar) {
        C4027E3 c4027e3M18499a;
        Bundle bundle;
        C4136T2 c4136t2 = this.f15480g;
        m18658u(c4136t2);
        c4136t2.mo18427h();
        zzin zzinVarM18467q = m18672N().m18467q();
        zzin zzinVar = zzin.CLIENT_UPLOAD_ELIGIBLE;
        zzqp.zza();
        C4201c2 c4201c2 = AbstractC4209d2.f15631R0;
        C4278m c4278m = this.f15477d;
        boolean zM18800H = c4278m.m18800H(null, c4201c2);
        boolean z7 = zzinVarM18467q == zzinVar;
        if (zM18800H) {
            C4389z6 c4389z6 = this.f15482i;
            m18656s(c4389z6);
            if (c4389z6.m19373G()) {
                C4389z6 c4389z7 = this.f15482i;
                m18656s(c4389z7);
                c4389z7.mo18427h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                C4046G6 c4046g6 = new C4046G6(c4389z7.f15066a);
                C4164X2 c4164x2 = c4389z7.f15066a;
                AbstractC2436b.registerReceiver(c4164x2.f15474a, c4046g6, intentFilter, 2);
                C4313q2 c4313q2 = c4164x2.f15479f;
                m18658u(c4313q2);
                c4313q2.m18858v().m18834a("Registered app receiver");
                if (z7) {
                    m18672N().m18465o(((Long) AbstractC4209d2.f15600C.m18706b(null)).longValue());
                }
            } else if (z7) {
                z7 = true;
                C4389z6 c4389z8 = this.f15482i;
                m18656s(c4389z8);
                c4389z8.mo18427h();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                C4046G6 c4046g7 = new C4046G6(c4389z8.f15066a);
                C4164X2 c4164x3 = c4389z8.f15066a;
                AbstractC2436b.registerReceiver(c4164x3.f15474a, c4046g7, intentFilter2, 2);
                C4313q2 c4313q3 = c4164x3.f15479f;
                m18658u(c4313q3);
                c4313q3.m18858v().m18834a("Registered app receiver");
                if (z7) {
                    m18672N().m18465o(((Long) AbstractC4209d2.f15600C.m18706b(null)).longValue());
                }
            }
        } else if (z7) {
            z7 = true;
            C4389z6 c4389z9 = this.f15482i;
            m18656s(c4389z9);
            c4389z9.mo18427h();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            C4046G6 c4046g8 = new C4046G6(c4389z9.f15066a);
            C4164X2 c4164x4 = c4389z9.f15066a;
            AbstractC2436b.registerReceiver(c4164x4.f15474a, c4046g8, intentFilter3, 2);
            C4313q2 c4313q4 = c4164x4.f15479f;
            m18658u(c4313q4);
            c4313q4.m18858v().m18834a("Registered app receiver");
            if (z7) {
                m18672N().m18465o(((Long) AbstractC4209d2.f15600C.m18706b(null)).longValue());
            }
        }
        C4026E2 c4026e2 = this.f15478e;
        m18656s(c4026e2);
        C4027E3 c4027e3M18495w = c4026e2.m18495w();
        int iM18509b = c4027e3M18495w.m18509b();
        EnumC6050u enumC6050uM18807O = c4278m.m18807O("google_analytics_default_allow_ad_storage", false);
        EnumC6050u enumC6050uM18807O2 = c4278m.m18807O("google_analytics_default_allow_analytics_storage", false);
        EnumC6050u enumC6050u = EnumC6050u.UNINITIALIZED;
        if (enumC6050uM18807O == enumC6050u && enumC6050uM18807O2 == enumC6050u) {
            if (!TextUtils.isEmpty(m18670L().m18755r())) {
                C4371x4 c4371x4 = this.f15486m;
                m18657t(c4371x4);
                c4371x4.m19298q0(new C4027E3(null, null, -10), false);
            }
            c4027e3M18499a = null;
        } else {
            m18656s(c4026e2);
            if (c4026e2.m18494v(-10)) {
                c4027e3M18499a = C4027E3.m18499a(enumC6050uM18807O, enumC6050uM18807O2, -10);
            } else {
                if (!TextUtils.isEmpty(m18670L().m18755r()) && (iM18509b == 0 || iM18509b == 30 || iM18509b == 10 || iM18509b == 40)) {
                    C4371x4 c4371x5 = this.f15486m;
                    m18657t(c4371x5);
                    c4371x5.m19298q0(new C4027E3(null, null, -10), false);
                }
                c4027e3M18499a = null;
            }
        }
        if (c4027e3M18499a != null) {
            C4371x4 c4371x6 = this.f15486m;
            m18657t(c4371x6);
            c4371x6.m19298q0(c4027e3M18499a, true);
            c4027e3M18495w = c4027e3M18499a;
        }
        C4371x4 c4371x7 = this.f15486m;
        m18657t(c4371x7);
        c4371x7.m19293o(c4027e3M18495w);
        m18656s(c4026e2);
        int iM19320b = c4026e2.m18493u().m19320b();
        EnumC6050u enumC6050uM18807O3 = c4278m.m18807O("google_analytics_default_allow_ad_personalization_signals", true);
        if (enumC6050uM18807O3 != enumC6050u) {
            C4313q2 c4313q5 = this.f15479f;
            m18658u(c4313q5);
            c4313q5.m18859w().m18835b("Default ad personalization consent from Manifest", enumC6050uM18807O3);
        }
        EnumC6050u enumC6050uM18807O4 = c4278m.m18807O("google_analytics_default_allow_ad_user_data", true);
        if (enumC6050uM18807O4 != enumC6050u && C4027E3.m18508u(-10, iM19320b)) {
            m18657t(c4371x7);
            c4371x7.m19296p0(C4374y.m19315a(enumC6050uM18807O4, -10), true);
        } else if (!TextUtils.isEmpty(m18670L().m18755r()) && (iM19320b == 0 || iM19320b == 30)) {
            m18657t(c4371x7);
            c4371x7.m19296p0(new C4374y((Boolean) null, -10, (Boolean) null, (String) null), true);
        } else if (TextUtils.isEmpty(m18670L().m18755r()) && zzddVar != null && (bundle = zzddVar.zzd) != null && C4027E3.m18508u(30, iM19320b)) {
            C4374y c4374yM19317h = C4374y.m19317h(bundle, 30);
            if (c4374yM19317h.m19322d()) {
                m18657t(c4371x7);
                c4371x7.m19296p0(c4374yM19317h, true);
            }
        }
        Boolean boolM18802J = c4278m.m18802J("google_analytics_tcf_data_enabled");
        if (boolM18802J == null || boolM18802J.booleanValue()) {
            C4313q2 c4313q6 = this.f15479f;
            m18658u(c4313q6);
            c4313q6.m18858v().m18834a("TCF client enabled.");
            m18657t(c4371x7);
            c4371x7.m19301s();
            m18657t(c4371x7);
            c4371x7.m19299r();
        }
        m18656s(c4026e2);
        C4002B2 c4002b2 = c4026e2.f15172f;
        if (c4002b2.m18433a() == 0) {
            C4313q2 c4313q7 = this.f15479f;
            m18658u(c4313q7);
            long j7 = this.f15473D;
            c4313q7.m18859w().m18835b("Persisting first open", Long.valueOf(j7));
            m18656s(c4026e2);
            c4002b2.m18434b(j7);
        }
        m18657t(c4371x7);
        c4371x7.f16219r.m18526c();
        if (m18681m()) {
            if (!TextUtils.isEmpty(m18670L().m18755r())) {
                C4389z6 c4389z10 = this.f15482i;
                m18656s(c4389z10);
                String strM18755r = m18670L().m18755r();
                m18656s(c4026e2);
                c4026e2.mo18427h();
                if (c4389z10.m19400p(strM18755r, c4026e2.m18488p().getString("gmp_app_id", null))) {
                    C4313q2 c4313q8 = this.f15479f;
                    m18658u(c4313q8);
                    c4313q8.m18857u().m18834a("Rechecking which service to use due to a GMP App Id change");
                    m18656s(c4026e2);
                    c4026e2.mo18427h();
                    Boolean boolM18492t = c4026e2.m18492t();
                    SharedPreferences.Editor editorEdit = c4026e2.m18488p().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolM18492t != null) {
                        c4026e2.m18491s(boolM18492t);
                    }
                    m18663E().m18764o();
                    this.f15491r.m19202A();
                    this.f15491r.m19243w();
                    m18656s(c4026e2);
                    c4002b2.m18434b(this.f15473D);
                    m18656s(c4026e2);
                    c4026e2.f15174h.m18460b(null);
                }
                m18656s(c4026e2);
                String strM18755r2 = m18670L().m18755r();
                c4026e2.mo18427h();
                SharedPreferences.Editor editorEdit2 = c4026e2.m18488p().edit();
                editorEdit2.putString("gmp_app_id", strM18755r2);
                editorEdit2.apply();
            }
            m18656s(c4026e2);
            if (!c4026e2.m18495w().m18514o(EnumC6051v.ANALYTICS_STORAGE)) {
                m18656s(c4026e2);
                c4026e2.f15174h.m18460b(null);
            }
            m18657t(c4371x7);
            m18656s(c4026e2);
            c4371x7.m19260E(c4026e2.f15174h.m18459a());
            C4389z6 c4389z11 = this.f15482i;
            m18656s(c4389z11);
            try {
                c4389z11.f15066a.f15474a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            } catch (ClassNotFoundException unused) {
                C4026E2 c4026e3 = this.f15478e;
                m18656s(c4026e3);
                C4018D2 c4018d2 = c4026e3.f15189w;
                if (!TextUtils.isEmpty(c4018d2.m18459a())) {
                    C4313q2 c4313q9 = this.f15479f;
                    m18658u(c4313q9);
                    c4313q9.m18854r().m18834a("Remote config removed with active feature rollouts");
                    m18656s(c4026e3);
                    c4018d2.m18460b(null);
                }
            }
            if (!TextUtils.isEmpty(m18670L().m18755r())) {
                boolean zM18675g = m18675g();
                C4026E2 c4026e4 = this.f15478e;
                m18656s(c4026e4);
                if (!c4026e4.m18498z() && !this.f15477d.m18804L()) {
                    m18656s(c4026e4);
                    c4026e4.m18497y(!zM18675g);
                }
                if (zM18675g) {
                    C4371x4 c4371x8 = this.f15486m;
                    m18657t(c4371x8);
                    c4371x8.m19263H();
                }
                C4098N5 c4098n5 = this.f15481h;
                m18657t(c4098n5);
                c4098n5.f15334e.m18560a();
                m18668J().m19237q(new AtomicReference());
                C4364w5 c4364w5M18668J = m18668J();
                m18656s(c4026e4);
                c4364w5M18668J.m19242v(c4026e4.f15192z.m18419a());
            }
        } else if (m18675g()) {
            C4389z6 c4389z12 = this.f15482i;
            m18656s(c4389z12);
            if (!c4389z12.m19379M("android.permission.INTERNET")) {
                C4313q2 c4313q10 = this.f15479f;
                m18658u(c4313q10);
                c4313q10.m18851o().m18834a("App is missing INTERNET permission");
            }
            m18656s(c4389z12);
            if (!c4389z12.m19379M("android.permission.ACCESS_NETWORK_STATE")) {
                C4313q2 c4313q11 = this.f15479f;
                m18658u(c4313q11);
                c4313q11.m18851o().m18834a("App is missing ACCESS_NETWORK_STATE permission");
            }
            Context context = this.f15474a;
            if (!C5228d.m24155a(context).m24153g() && !this.f15477d.m18815m()) {
                if (!C4389z6.m19361j0(context)) {
                    C4313q2 c4313q12 = this.f15479f;
                    m18658u(c4313q12);
                    c4313q12.m18851o().m18834a("AppMeasurementReceiver not registered/enabled");
                }
                if (!C4389z6.m19355E(context, false)) {
                    C4313q2 c4313q13 = this.f15479f;
                    m18658u(c4313q13);
                    c4313q13.m18851o().m18834a("AppMeasurementService not registered/enabled");
                }
            }
            C4313q2 c4313q14 = this.f15479f;
            m18658u(c4313q14);
            c4313q14.m18851o().m18834a("Uploading is not possible. App measurement disabled");
        }
        zzqp.zza();
        if (this.f15477d.m18800H(null, AbstractC4209d2.f15631R0)) {
            C4389z6 c4389z13 = this.f15482i;
            m18656s(c4389z13);
            if (c4389z13.m19373G()) {
                long jMax = Math.max(500L, ((((long) ((Integer) AbstractC4209d2.f15709y0.m18706b(null)).intValue()) * 1000) + ((long) new Random().nextInt(5000))) - this.f15484k.mo18161c());
                if (jMax > 500) {
                    C4313q2 c4313q15 = this.f15479f;
                    m18658u(c4313q15);
                    c4313q15.m18859w().m18835b("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax));
                }
                C4371x4 c4371x9 = this.f15486m;
                m18657t(c4371x9);
                c4371x9.m19302s0(jMax);
            }
        }
        C4026E2 c4026e5 = this.f15478e;
        m18656s(c4026e5);
        c4026e5.f15182p.m19334b(true);
    }

    /* JADX INFO: renamed from: w */
    public final C4278m m18686w() {
        return this.f15477d;
    }

    /* JADX INFO: renamed from: x */
    public final C4026E2 m18687x() {
        C4026E2 c4026e2 = this.f15478e;
        m18656s(c4026e2);
        return c4026e2;
    }

    /* JADX INFO: renamed from: y */
    public final C4313q2 m18688y() {
        C4313q2 c4313q2 = this.f15479f;
        if (c4313q2 == null || !c4313q2.m18436k()) {
            return null;
        }
        return c4313q2;
    }

    /* JADX INFO: renamed from: z */
    public final C4098N5 m18689z() {
        C4098N5 c4098n5 = this.f15481h;
        m18657t(c4098n5);
        return c4098n5;
    }
}
