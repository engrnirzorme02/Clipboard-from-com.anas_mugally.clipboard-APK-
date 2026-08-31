package com.anas_mugally.clipboard;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.FirebaseAuth;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import org.json.JSONObject;
import p000.AbstractC5157d;
import p000.C2974c;
import p145S5.AbstractC1437o;
import p145S5.AbstractC1440r;
import p145S5.C1434l;
import p145S5.C1444v;
import p152T5.AbstractC1610H;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p227d3.C5228d;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: com.anas_mugally.clipboard.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3065o {

    /* JADX INFO: renamed from: f */
    public static final a f12624f = new a(null);

    /* JADX INFO: renamed from: g */
    private static C3065o f12625g;

    /* JADX INFO: renamed from: a */
    private Context f12626a;

    /* JADX INFO: renamed from: b */
    private final FirebaseAnalytics f12627b;

    /* JADX INFO: renamed from: c */
    private final C2974c f12628c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6624N f12629d;

    /* JADX INFO: renamed from: e */
    private final Object f12630e;

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3065o m15175a(Context context) {
            AbstractC6118n.m27187e(context, "context");
            C3065o c3065o = C3065o.f12625g;
            if (c3065o == null) {
                c3065o = new C3065o(context, null);
                C3065o.f12625g = c3065o;
            }
            c3065o.f12626a = context;
            return c3065o;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.o$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12631a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f12633c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Map f12634d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Map map, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12633c = str;
            this.f12634d = map;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C3065o.this.new b(this.f12633c, this.f12634d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            String strMo8711b0;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12631a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    AbstractC4880u abstractC4880uM21989e = FirebaseAuth.getInstance().m21989e();
                    if (abstractC4880uM21989e == null || (strMo8711b0 = abstractC4880uM21989e.mo8711b0()) == null) {
                        strMo8711b0 = "guest-" + C3065o.this.f12630e;
                    }
                    JSONObject jSONObject = new JSONObject();
                    String str = this.f12633c;
                    Map map = this.f12634d;
                    jSONObject.put("user_uid", strMo8711b0);
                    jSONObject.put("event_name", str);
                    jSONObject.put("event_data", new JSONObject(map));
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
                    AbstractC6118n.m27184b(myApplicationM15105a);
                    jSONObject.put("accessibility_enabled", AbstractC3081u.m15314a(myApplicationM15105a));
                    C2974c c2974c = C3065o.this.f12628c;
                    this.f12631a = 1;
                    obj = c2974c.m14832k(jSONObject, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                AbstractC5157d abstractC5157d = (AbstractC5157d) obj;
                if (abstractC5157d instanceof AbstractC5157d.b) {
                    Log.d("AnalyticsLogger", "Event " + this.f12633c + " sent to API successfully");
                } else {
                    if (!(abstractC5157d instanceof AbstractC5157d.a)) {
                        throw new C1434l();
                    }
                    Log.w("AnalyticsLogger", "Failed to send event " + this.f12633c + " to API: " + ((AbstractC5157d.a) abstractC5157d).m23906a());
                }
            } catch (Exception e7) {
                Log.e("AnalyticsLogger", "Error sending event " + this.f12633c + " to API", e7);
            }
            return C1444v.f4971a;
        }
    }

    public /* synthetic */ C3065o(Context context, AbstractC6112h abstractC6112h) {
        this(context);
    }

    /* JADX INFO: renamed from: f */
    private final Map m15162f() {
        return AbstractC1610H.m6628j(AbstractC1440r.m6083a("market", AbstractC3041D.m15085j()), AbstractC1440r.m6083a("language", Locale.getDefault().getLanguage()), AbstractC1440r.m6083a("country", Locale.getDefault().getDisplayCountry(Locale.ENGLISH)), AbstractC1440r.m6083a("sdk_version", Integer.valueOf(Build.VERSION.SDK_INT)), AbstractC1440r.m6083a("app_version", "200.5.0"), AbstractC1440r.m6083a("install_date", this.f12630e), AbstractC1440r.m6083a("device_model", Build.MODEL), AbstractC1440r.m6083a("device_brand", Build.BRAND), AbstractC1440r.m6083a("device_manufacturer", Build.MANUFACTURER));
    }

    /* JADX INFO: renamed from: h */
    private final void m15163h(String str, Map map) {
        Map mapM = AbstractC1610H.m6631m(map, m15162f());
        m15165q(str, mapM);
        m15164p(str, mapM);
    }

    /* JADX INFO: renamed from: p */
    private final void m15164p(String str, Map map) {
        AbstractC6672k.m28227d(this.f12629d, null, null, new b(str, map, null), 3, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m15165q(String str, Map map) {
        AbstractC4880u abstractC4880uM21989e = FirebaseAuth.getInstance().m21989e();
        String strMo8711b0 = abstractC4880uM21989e != null ? abstractC4880uM21989e.mo8711b0() : null;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                bundle.putString(str2, (String) value);
            } else if (value instanceof Boolean) {
                bundle.putBoolean(str2, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                bundle.putInt(str2, ((Number) value).intValue());
            } else if (value instanceof Double) {
                bundle.putDouble(str2, ((Number) value).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(str2, ((Number) value).longValue());
            }
        }
        if (strMo8711b0 != null) {
            bundle.putString("user_uid", strMo8711b0);
        }
        bundle.putLong("timestamp", System.currentTimeMillis());
        MyApplication myApplicationM15105a = MyApplication.f12496a.m15105a();
        AbstractC6118n.m27184b(myApplicationM15105a);
        bundle.putBoolean("accessibility_enabled", AbstractC3081u.m15314a(myApplicationM15105a));
        this.f12627b.m21956a(str, bundle);
    }

    /* JADX INFO: renamed from: g */
    public final void m15166g(boolean z7, boolean z8) {
        m15163h("accessibility_toggle", AbstractC1610H.m6628j(AbstractC1440r.m6083a("from_app", Boolean.valueOf(z7)), AbstractC1440r.m6083a("is_first", Boolean.valueOf(z8))));
    }

    /* JADX INFO: renamed from: i */
    public final void m15167i(double d7) {
        m15163h("pro_feature_explore", AbstractC1610H.m6624f(AbstractC1440r.m6083a("duration_sec", Double.valueOf(d7))));
    }

    /* JADX INFO: renamed from: j */
    public final void m15168j(boolean z7) {
        m15163h("accessibility_toggle", AbstractC1610H.m6628j(AbstractC1440r.m6083a("from_app", Boolean.valueOf(z7)), AbstractC1440r.m6083a("go_to_accessibility_enabled", Boolean.TRUE)));
    }

    /* JADX INFO: renamed from: k */
    public final void m15169k(String method) {
        AbstractC6118n.m27187e(method, "method");
        m15163h("login", AbstractC1610H.m6624f(AbstractC1440r.m6083a("method", method)));
    }

    /* JADX INFO: renamed from: l */
    public final void m15170l(boolean z7) {
        m15163h("notification_toggle", AbstractC1610H.m6624f(AbstractC1440r.m6083a("notifications_enabled", Boolean.valueOf(z7))));
    }

    /* JADX INFO: renamed from: m */
    public final void m15171m(String product, int i7) {
        AbstractC6118n.m27187e(product, "product");
        m15163h("purchase", AbstractC1610H.m6628j(AbstractC1440r.m6083a("product_metadata", product), AbstractC1440r.m6083a("issues_count", Integer.valueOf(i7))));
    }

    /* JADX INFO: renamed from: n */
    public final void m15172n(String source) {
        AbstractC6118n.m27187e(source, "source");
        m15163h("purchase_dialog_opened", AbstractC1610H.m6624f(AbstractC1440r.m6083a("dialog_source", source)));
    }

    /* JADX INFO: renamed from: o */
    public final void m15173o(boolean z7) {
        m15163h("subscription_or_in_app_puncher_change", AbstractC1610H.m6628j(AbstractC1440r.m6083a("from_pro", Boolean.valueOf(z7)), AbstractC1440r.m6083a("new_status", !z7 ? "basic" : "pro")));
    }

    /* JADX INFO: renamed from: r */
    public final void m15174r() {
        AbstractC4880u abstractC4880uM21989e = FirebaseAuth.getInstance().m21989e();
        this.f12627b.m21957b(abstractC4880uM21989e != null ? abstractC4880uM21989e.mo8711b0() : null);
    }

    private C3065o(Context context) {
        Object obj;
        this.f12626a = context;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        AbstractC6118n.m27186d(firebaseAnalytics, "getInstance(...)");
        this.f12627b = firebaseAnalytics;
        this.f12628c = new C2974c();
        this.f12629d = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));
        try {
            PackageInfo packageInfoM24152f = C5228d.m24155a(this.f12626a).m24152f("com.anas_mugally.clipboard", 0);
            AbstractC6118n.m27186d(packageInfoM24152f, "getPackageInfo(...)");
            long j7 = packageInfoM24152f.firstInstallTime;
            if (j7 > 0) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+3"));
                obj = simpleDateFormat.format(new Date(j7));
            } else {
                obj = "unknown";
            }
        } catch (Exception unused) {
            obj = 0L;
        }
        this.f12630e = obj;
        m15174r();
    }
}
