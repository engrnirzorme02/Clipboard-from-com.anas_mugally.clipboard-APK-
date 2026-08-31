package p327p5;

import android.os.Build;
import android.util.Log;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import org.json.JSONException;
import org.json.JSONObject;
import p145S5.AbstractC1437o;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.C1444v;
import p152T5.AbstractC1610H;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p219c5.InterfaceC3022e;
import p238e6.InterfaceC5371p;
import p301m5.C6374b;
import p301m5.C6392t;
import p301m5.InterfaceC6369X;
import p302m6.C6405g;
import p310n6.AbstractC6506c;
import p310n6.C6504a;
import p310n6.EnumC6507d;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: p5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6761d implements InterfaceC6772o {

    /* JADX INFO: renamed from: g */
    private static final a f27142g = new a(null);

    /* JADX INFO: renamed from: h */
    private static final int f27143h;

    /* JADX INFO: renamed from: i */
    private static final C6405g f27144i;

    /* JADX INFO: renamed from: a */
    private final InterfaceC6369X f27145a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC3022e f27146b;

    /* JADX INFO: renamed from: c */
    private final C6374b f27147c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6758a f27148d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6769l f27149e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC7419a f27150f;

    /* JADX INFO: renamed from: p5.d$a */
    private static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m29557a() {
            return C6761d.f27143h;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: p5.d$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27151a;

        /* JADX INFO: renamed from: b */
        Object f27152b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f27153c;

        /* JADX INFO: renamed from: e */
        int f27155e;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27153c = obj;
            this.f27155e |= Integer.MIN_VALUE;
            return C6761d.this.mo29548d(this);
        }
    }

    /* JADX INFO: renamed from: p5.d$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27156a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27157b;

        c(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            c cVar = C6761d.this.new c(interfaceC1875e);
            cVar.f27157b = obj;
            return cVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC1875e interfaceC1875e) {
            return ((c) create(jSONObject, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x00f0 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) throws JSONException {
            Boolean bool;
            Double d7;
            Integer num;
            InterfaceC6769l interfaceC6769l;
            int iM29557a;
            C6765h c6765h;
            Integer num2;
            Double d8;
            Object obj2;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27156a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                JSONObject jSONObject = (JSONObject) this.f27157b;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                Integer num3 = 0;
                Integer num4 = null;
                Boolean bool2 = null;
                if (jSONObject.has("app_quality")) {
                    Object obj3 = jSONObject.get("app_quality");
                    AbstractC6118n.m27185c(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject2 = (JSONObject) obj3;
                    try {
                        Boolean bool3 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d8 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    num4 = jSONObject2.has("cache_duration") ? (Integer) jSONObject2.get("cache_duration") : null;
                                    C1444v c1444v = C1444v.f4971a;
                                    num = num2;
                                    d7 = d8;
                                    bool = bool3;
                                    num3 = num4;
                                } catch (JSONException e7) {
                                    e = e7;
                                    Integer num5 = num4;
                                    bool2 = bool3;
                                    obj2 = num5;
                                    AbstractC6087b.m27122c(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d7 = d8;
                                    bool = bool2;
                                    num3 = obj2;
                                }
                            } catch (JSONException e8) {
                                e = e8;
                                num2 = null;
                                bool2 = bool3;
                                obj2 = null;
                            }
                        } catch (JSONException e9) {
                            e = e9;
                            num2 = null;
                            d8 = null;
                            bool2 = bool3;
                            obj2 = d8;
                            AbstractC6087b.m27122c(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                            num = num2;
                            d7 = d8;
                            bool = bool2;
                            num3 = obj2;
                            interfaceC6769l = C6761d.this.f27149e;
                            if (num3 != 0) {
                                iM29557a = num3.intValue();
                            } else {
                                iM29557a = C6761d.f27142g.m29557a();
                            }
                            c6765h = new C6765h(bool, d7, num, AbstractC6087b.m27122c(iM29557a), AbstractC6087b.m27123d(C6761d.this.f27145a.mo27470a().m27465a()));
                            this.f27156a = 1;
                            if (interfaceC6769l.mo29589b(c6765h, this) == objE) {
                                return objE;
                            }
                            return C1444v.f4971a;
                        }
                    } catch (JSONException e10) {
                        e = e10;
                        num2 = null;
                        d8 = null;
                    }
                } else {
                    bool = null;
                    d7 = null;
                    num = null;
                }
                interfaceC6769l = C6761d.this.f27149e;
                if (num3 != 0) {
                    iM29557a = num3.intValue();
                } else {
                    iM29557a = C6761d.f27142g.m29557a();
                }
                c6765h = new C6765h(bool, d7, num, AbstractC6087b.m27122c(iM29557a), AbstractC6087b.m27123d(C6761d.this.f27145a.mo27470a().m27465a()));
                this.f27156a = 1;
                if (interfaceC6769l.mo29589b(c6765h, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: p5.d$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27159a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27160b;

        d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            d dVar = new d(interfaceC1875e);
            dVar.f27160b = obj;
            return dVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC1875e interfaceC1875e) {
            return ((d) create(str, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f27159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.f27160b));
            return C1444v.f4971a;
        }
    }

    static {
        C6504a.a aVar = C6504a.f24605b;
        f27143h = (int) C6504a.m27708v(AbstractC6506c.m27723h(24, EnumC6507d.HOURS));
        f27144i = new C6405g("/");
    }

    public C6761d(InterfaceC6369X timeProvider, InterfaceC3022e firebaseInstallationsApi, C6374b appInfo, InterfaceC6758a configsFetcher, InterfaceC6769l settingsCache) {
        AbstractC6118n.m27187e(timeProvider, "timeProvider");
        AbstractC6118n.m27187e(firebaseInstallationsApi, "firebaseInstallationsApi");
        AbstractC6118n.m27187e(appInfo, "appInfo");
        AbstractC6118n.m27187e(configsFetcher, "configsFetcher");
        AbstractC6118n.m27187e(settingsCache, "settingsCache");
        this.f27145a = timeProvider;
        this.f27146b = firebaseInstallationsApi;
        this.f27147c = appInfo;
        this.f27148d = configsFetcher;
        this.f27149e = settingsCache;
        this.f27150f = AbstractC7425g.m32877b(false, 1, null);
    }

    /* JADX INFO: renamed from: i */
    private final String m29556i(String str) {
        return f27144i.m27530b(str, "");
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: a */
    public Boolean mo29545a() {
        return this.f27149e.mo29592e();
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: b */
    public C6504a mo29546b() {
        Integer numMo29590c = this.f27149e.mo29590c();
        if (numMo29590c == null) {
            return null;
        }
        C6504a.a aVar = C6504a.f24605b;
        return C6504a.m27699d(AbstractC6506c.m27723h(numMo29590c.intValue(), EnumC6507d.SECONDS));
    }

    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: c */
    public Double mo29547c() {
        return this.f27149e.mo29588a();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c4 A[Catch: all -> 0x004f, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x004f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x004f, blocks: (B:21:0x004a, B:47:0x00b6, B:49:0x00c4, B:52:0x00cf), top: B:64:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00cf, please report this as an issue */
    @Override // p327p5.InterfaceC6772o
    /* JADX INFO: renamed from: d */
    public Object mo29548d(InterfaceC1875e interfaceC1875e) throws Throwable {
        b bVar;
        InterfaceC7419a interfaceC7419a;
        C6761d c6761d;
        InterfaceC7419a interfaceC7419a2;
        Throwable th;
        InterfaceC7419a interfaceC7419a3;
        C6761d c6761d2;
        String strM27507b;
        Map mapJ;
        InterfaceC6758a interfaceC6758a;
        c cVar;
        d dVar;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f27155e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f27155e = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f27153c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f27155e;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                if (!this.f27150f.mo32854b() && !this.f27149e.mo29591d()) {
                    return C1444v.f4971a;
                }
                interfaceC7419a = this.f27150f;
                bVar.f27151a = this;
                bVar.f27152b = interfaceC7419a;
                bVar.f27155e = 1;
                if (interfaceC7419a.mo32856d(null, bVar) != objE) {
                    c6761d = this;
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC7419a2 = (InterfaceC7419a) bVar.f27151a;
                    try {
                        AbstractC1437o.m6082b(obj);
                        C1444v c1444v = C1444v.f4971a;
                        interfaceC7419a2.mo32855c(null);
                        return C1444v.f4971a;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC7419a2.mo32855c(null);
                        throw th;
                    }
                }
                interfaceC7419a3 = (InterfaceC7419a) bVar.f27152b;
                c6761d2 = (C6761d) bVar.f27151a;
                try {
                    AbstractC1437o.m6082b(obj);
                    strM27507b = ((C6392t) obj).m27507b();
                    if (AbstractC6118n.m27183a(strM27507b, "")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        C1444v c1444v2 = C1444v.f4971a;
                        interfaceC7419a3.mo32855c(null);
                        return c1444v2;
                    }
                    C1435m c1435mM6083a = AbstractC1440r.m6083a("X-Crashlytics-Installation-ID", strM27507b);
                    C1435m c1435mM6083a2 = AbstractC1440r.m6083a("X-Crashlytics-Device-Model", c6761d2.m29556i(Build.MANUFACTURER + Build.MODEL));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    AbstractC6118n.m27186d(INCREMENTAL, "INCREMENTAL");
                    C1435m c1435mM6083a3 = AbstractC1440r.m6083a("X-Crashlytics-OS-Build-Version", c6761d2.m29556i(INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    AbstractC6118n.m27186d(RELEASE, "RELEASE");
                    mapJ = AbstractC1610H.m6628j(c1435mM6083a, c1435mM6083a2, c1435mM6083a3, AbstractC1440r.m6083a("X-Crashlytics-OS-Display-Version", c6761d2.m29556i(RELEASE)), AbstractC1440r.m6083a("X-Crashlytics-API-Client-Version", c6761d2.f27147c.m27482f()));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    interfaceC6758a = c6761d2.f27148d;
                    cVar = c6761d2.new c(null);
                    dVar = new d(null);
                    bVar.f27151a = interfaceC7419a3;
                    bVar.f27152b = null;
                    bVar.f27155e = 3;
                    if (interfaceC6758a.mo29544a(mapJ, cVar, dVar, bVar) != objE) {
                        interfaceC7419a2 = interfaceC7419a3;
                        C1444v c1444v3 = C1444v.f4971a;
                        interfaceC7419a2.mo32855c(null);
                        return C1444v.f4971a;
                    }
                    return objE;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC7419a2 = interfaceC7419a3;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            InterfaceC7419a interfaceC7419a4 = (InterfaceC7419a) bVar.f27152b;
            c6761d = (C6761d) bVar.f27151a;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a4;
            if (!c6761d.f27149e.mo29591d()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                C1444v c1444v4 = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v4;
            }
            C6392t.a aVar = C6392t.f24407c;
            InterfaceC3022e interfaceC3022e = c6761d.f27146b;
            bVar.f27151a = c6761d;
            bVar.f27152b = interfaceC7419a;
            bVar.f27155e = 2;
            Object objM27508a = aVar.m27508a(interfaceC3022e, bVar);
            if (objM27508a != objE) {
                interfaceC7419a3 = interfaceC7419a;
                obj = objM27508a;
                c6761d2 = c6761d;
                strM27507b = ((C6392t) obj).m27507b();
                if (AbstractC6118n.m27183a(strM27507b, "")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    C1444v c1444v5 = C1444v.f4971a;
                    interfaceC7419a3.mo32855c(null);
                    return c1444v5;
                }
                C1435m c1435mM6083a4 = AbstractC1440r.m6083a("X-Crashlytics-Installation-ID", strM27507b);
                C1435m c1435mM6083a5 = AbstractC1440r.m6083a("X-Crashlytics-Device-Model", c6761d2.m29556i(Build.MANUFACTURER + Build.MODEL));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                AbstractC6118n.m27186d(INCREMENTAL2, "INCREMENTAL");
                C1435m c1435mM6083a6 = AbstractC1440r.m6083a("X-Crashlytics-OS-Build-Version", c6761d2.m29556i(INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                AbstractC6118n.m27186d(RELEASE2, "RELEASE");
                mapJ = AbstractC1610H.m6628j(c1435mM6083a4, c1435mM6083a5, c1435mM6083a6, AbstractC1440r.m6083a("X-Crashlytics-OS-Display-Version", c6761d2.m29556i(RELEASE2)), AbstractC1440r.m6083a("X-Crashlytics-API-Client-Version", c6761d2.f27147c.m27482f()));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                interfaceC6758a = c6761d2.f27148d;
                cVar = c6761d2.new c(null);
                dVar = new d(null);
                bVar.f27151a = interfaceC7419a3;
                bVar.f27152b = null;
                bVar.f27155e = 3;
                if (interfaceC6758a.mo29544a(mapJ, cVar, dVar, bVar) != objE) {
                    interfaceC7419a2 = interfaceC7419a3;
                    C1444v c1444v6 = C1444v.f4971a;
                    interfaceC7419a2.mo32855c(null);
                    return C1444v.f4971a;
                }
            }
            return objE;
        } catch (Throwable th4) {
            interfaceC7419a2 = interfaceC7419a;
            th = th4;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }
}
