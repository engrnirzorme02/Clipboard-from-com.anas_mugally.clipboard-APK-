package p301m5;

import android.util.Log;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1434l;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p309n5.C6502b;
import p309n5.InterfaceC6503c;
import p310n6.C6504a;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p327p5.C6767j;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: m5.U */
/* JADX INFO: loaded from: classes.dex */
public final class C6366U implements InterfaceC6365T {

    /* JADX INFO: renamed from: b */
    private final C6767j f24272b;

    /* JADX INFO: renamed from: c */
    private final C6360N f24273c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6357K f24274d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC6369X f24275e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1905i f24276f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC6395w f24277g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC1879i f24278h;

    /* JADX INFO: renamed from: i */
    public C6351E f24279i;

    /* JADX INFO: renamed from: j */
    private boolean f24280j;

    /* JADX INFO: renamed from: k */
    private b f24281k;

    /* JADX INFO: renamed from: l */
    private String f24282l;

    /* JADX INFO: renamed from: m5.U$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24283a;

        /* JADX INFO: renamed from: m5.U$a$a, reason: collision with other inner class name */
        static final class C7714a extends AbstractC6097l implements InterfaceC5372q {

            /* JADX INFO: renamed from: a */
            int f24285a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f24286b;

            /* JADX INFO: renamed from: c */
            /* synthetic */ Object f24287c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C6366U f24288d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7714a(C6366U c6366u, InterfaceC1875e interfaceC1875e) {
                super(3, interfaceC1875e);
                this.f24288d = c6366u;
            }

            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object mo7830j(InterfaceC6919d interfaceC6919d, Throwable th, InterfaceC1875e interfaceC1875e) {
                C7714a c7714a = new C7714a(this.f24288d, interfaceC1875e);
                c7714a.f24286b = interfaceC6919d;
                c7714a.f24287c = th;
                return c7714a.invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f24285a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    InterfaceC6919d interfaceC6919d = (InterfaceC6919d) this.f24286b;
                    Throwable th = (Throwable) this.f24287c;
                    C6351E c6351e = new C6351E(this.f24288d.f24273c.m27420a(null), (C6368W) null, (Map) null, 4, (AbstractC6112h) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + c6351e.m27384f().m27394b());
                    this.f24286b = null;
                    this.f24285a = 1;
                    if (interfaceC6919d.mo7892d(c6351e, this) == objE) {
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

        /* JADX INFO: renamed from: m5.U$a$b */
        static final class b implements InterfaceC6919d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C6366U f24289a;

            b(C6366U c6366u) {
                this.f24289a = c6366u;
            }

            @Override // p344r6.InterfaceC6919d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo7892d(C6351E c6351e, InterfaceC1875e interfaceC1875e) {
                this.f24289a.m27452r(c6351e);
                Object objM27450q = this.f24289a.m27450q(c6351e.m27384f().m27394b(), b.GENERAL, interfaceC1875e);
                return objM27450q == AbstractC2005b.m8369e() ? objM27450q : C1444v.f4971a;
            }
        }

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6366U.this.new a(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24283a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6918c interfaceC6918cM30357c = AbstractC6920e.m30357c(C6366U.this.f24276f.getData(), new C7714a(C6366U.this, null));
                b bVar = new b(C6366U.this);
                this.f24283a = 1;
                if (interfaceC6918cM30357c.mo7891a(bVar, this) == objE) {
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

    /* JADX INFO: renamed from: m5.U$b */
    public enum b {
        GENERAL,
        FALLBACK;


        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ InterfaceC2059a f24293d = AbstractC2060b.m8524a(m27456c());
    }

    /* JADX INFO: renamed from: m5.U$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24294a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24294a = iArr;
        }
    }

    /* JADX INFO: renamed from: m5.U$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24295a;

        /* JADX INFO: renamed from: m5.U$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f24297a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f24298b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C6366U f24299c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6366U c6366u, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f24299c = c6366u;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                a aVar = new a(this.f24299c, interfaceC1875e);
                aVar.f24298b = obj;
                return aVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6351E c6351e, InterfaceC1875e interfaceC1875e) {
                return ((a) create(c6351e, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f24297a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return C6351E.m27379c((C6351E) this.f24298b, null, this.f24299c.f24275e.mo27470a(), null, 5, null);
            }
        }

        d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6366U.this.new d(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24295a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    InterfaceC1905i interfaceC1905i = C6366U.this.f24276f;
                    a aVar = new a(C6366U.this, null);
                    this.f24295a = 1;
                    if (interfaceC1905i.mo7850a(aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
            } catch (Exception e7) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e7.getMessage());
                C6366U c6366u = C6366U.this;
                c6366u.m27452r(C6351E.m27379c(c6366u.m27451m(), null, C6366U.this.f24275e.mo27470a(), null, 5, null));
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: m5.U$e */
    static final class e extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f24300a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6351E f24302c;

        /* JADX INFO: renamed from: m5.U$e$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f24303a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f24304b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C6366U f24305c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6366U c6366u, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f24305c = c6366u;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                a aVar = new a(this.f24305c, interfaceC1875e);
                aVar.f24304b = obj;
                return aVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C6351E c6351e, InterfaceC1875e interfaceC1875e) {
                return ((a) create(c6351e, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Map mapMo27365f;
                AbstractC2005b.m8369e();
                if (this.f24303a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                C6351E c6351e = (C6351E) this.f24304b;
                boolean zM27449p = this.f24305c.m27449p(c6351e);
                boolean zM27447n = this.f24305c.m27447n(c6351e);
                boolean zM27448o = this.f24305c.m27448o(c6351e);
                if (zM27447n) {
                    mapMo27365f = this.f24305c.f24277g.mo27364e();
                } else {
                    mapMo27365f = zM27448o ? this.f24305c.f24277g.mo27365f(c6351e.m27383e()) : c6351e.m27383e();
                }
                C6354H c6354hM27384f = zM27447n ? null : c6351e.m27384f();
                if (!zM27449p && !zM27447n) {
                    return zM27448o ? C6351E.m27379c(c6351e, null, null, this.f24305c.f24277g.mo27365f(mapMo27365f), 3, null) : c6351e;
                }
                C6354H c6354hM27420a = this.f24305c.f24273c.m27420a(c6354hM27384f);
                this.f24305c.f24274d.mo27406a(c6354hM27420a);
                this.f24305c.f24277g.mo27360a();
                return c6351e.m27381b(c6354hM27420a, null, mapMo27365f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C6351E c6351e, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f24302c = c6351e;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C6366U.this.new e(this.f24302c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((e) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r10.mo7850a(r0, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.m27450q(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f24300a;
            try {
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1437o.m6082b(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj);
                    }
                    return C1444v.f4971a;
                }
                AbstractC1437o.m6082b(obj);
                InterfaceC1905i interfaceC1905i = C6366U.this.f24276f;
                a aVar = new a(C6366U.this, null);
                this.f24300a = 1;
            } catch (Exception e7) {
                Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e7.getMessage());
                if (C6366U.this.m27449p(this.f24302c)) {
                    C6354H c6354hM27420a = C6366U.this.f24273c.m27420a(this.f24302c.m27384f());
                    C6366U.this.m27452r(C6351E.m27379c(this.f24302c, c6354hM27420a, null, null, 4, null));
                    C6366U.this.f24274d.mo27406a(c6354hM27420a);
                    C6366U c6366u = C6366U.this;
                    String strM27394b = c6354hM27420a.m27394b();
                    b bVar = b.FALLBACK;
                    this.f24300a = 2;
                }
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: m5.U$f */
    static final class f extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f24306a;

        /* JADX INFO: renamed from: b */
        Object f24307b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f24308c;

        /* JADX INFO: renamed from: e */
        int f24310e;

        f(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f24308c = obj;
            this.f24310e |= Integer.MIN_VALUE;
            return C6366U.this.m27450q(null, null, this);
        }
    }

    public C6366U(C6767j sessionsSettings, C6360N sessionGenerator, InterfaceC6357K sessionFirelogPublisher, InterfaceC6369X timeProvider, InterfaceC1905i sessionDataStore, InterfaceC6395w processDataManager, InterfaceC1879i backgroundDispatcher) {
        AbstractC6118n.m27187e(sessionsSettings, "sessionsSettings");
        AbstractC6118n.m27187e(sessionGenerator, "sessionGenerator");
        AbstractC6118n.m27187e(sessionFirelogPublisher, "sessionFirelogPublisher");
        AbstractC6118n.m27187e(timeProvider, "timeProvider");
        AbstractC6118n.m27187e(sessionDataStore, "sessionDataStore");
        AbstractC6118n.m27187e(processDataManager, "processDataManager");
        AbstractC6118n.m27187e(backgroundDispatcher, "backgroundDispatcher");
        this.f24272b = sessionsSettings;
        this.f24273c = sessionGenerator;
        this.f24274d = sessionFirelogPublisher;
        this.f24275e = timeProvider;
        this.f24276f = sessionDataStore;
        this.f24277g = processDataManager;
        this.f24278h = backgroundDispatcher;
        this.f24281k = b.GENERAL;
        this.f24282l = "";
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final boolean m27447n(C6351E c6351e) {
        Map mapM27383e = c6351e.m27383e();
        if (mapM27383e == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zMo27361b = this.f24277g.mo27361b(mapM27383e);
        if (zMo27361b) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zMo27361b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final boolean m27448o(C6351E c6351e) {
        Map mapM27383e = c6351e.m27383e();
        if (mapM27383e == null) {
            Log.d("FirebaseSessions", "No process data for " + this.f24277g.mo27362c());
            return true;
        }
        boolean zMo27363d = this.f24277g.mo27363d(mapM27383e);
        if (zMo27363d) {
            Log.d("FirebaseSessions", "Process " + this.f24277g.mo27362c() + " is stale");
        }
        return zMo27363d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final boolean m27449p(C6351E c6351e) {
        C6368W c6368wM27382d = c6351e.m27382d();
        if (c6368wM27382d == null) {
            Log.d("FirebaseSessions", "Session " + c6351e.m27384f().m27394b() + " has not backgrounded yet");
            return false;
        }
        boolean z7 = C6504a.m27700j(this.f24275e.mo27470a().m27467c(c6368wM27382d), this.f24272b.m29582b()) > 0;
        if (z7) {
            Log.d("FirebaseSessions", "Session " + c6351e.m27384f().m27394b() + " is expired");
        }
        return z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m27450q(String str, b bVar, InterfaceC1875e interfaceC1875e) {
        f fVar;
        String str2;
        if (interfaceC1875e instanceof f) {
            fVar = (f) interfaceC1875e;
            int i7 = fVar.f24310e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fVar.f24310e = i7 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC1875e);
            }
        } else {
            fVar = new f(interfaceC1875e);
        }
        Object objM27680c = fVar.f24308c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = fVar.f24310e;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM27680c);
            this.f24281k = bVar;
            if (AbstractC6118n.m27183a(this.f24282l, str)) {
                return C1444v.f4971a;
            }
            this.f24282l = str;
            C6502b c6502b = C6502b.f24586a;
            fVar.f24306a = str;
            fVar.f24307b = bVar;
            fVar.f24310e = 1;
            objM27680c = c6502b.m27680c(fVar);
            if (objM27680c == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (b) fVar.f24307b;
            str = (String) fVar.f24306a;
            AbstractC1437o.m6082b(objM27680c);
        }
        for (InterfaceC6503c interfaceC6503c : ((Map) objM27680c).values()) {
            interfaceC6503c.mo24818a(new InterfaceC6503c.b(str));
            int i9 = c.f24294a[bVar.ordinal()];
            if (i9 == 1) {
                str2 = "Notified " + interfaceC6503c.mo24820c() + " of new session " + str;
            } else {
                if (i9 != 2) {
                    throw new C1434l();
                }
                str2 = "Notified " + interfaceC6503c.mo24820c() + " of new fallback session " + str;
            }
            Log.d("FirebaseSessions", str2);
        }
        return C1444v.f4971a;
    }

    @Override // p301m5.InterfaceC6365T
    /* JADX INFO: renamed from: a */
    public boolean mo27434a() {
        return this.f24280j;
    }

    @Override // p301m5.InterfaceC6365T
    /* JADX INFO: renamed from: b */
    public void mo27435b() {
        this.f24280j = false;
        if (this.f24279i == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f24277g.mo27362c());
        AbstractC6672k.m28227d(AbstractC6626O.m28098a(this.f24278h), null, null, new d(null), 3, null);
    }

    @Override // p301m5.InterfaceC6365T
    /* JADX INFO: renamed from: c */
    public void mo27436c() {
        this.f24280j = true;
        if (this.f24279i == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        C6351E c6351eM27451m = m27451m();
        Log.d("FirebaseSessions", "App foregrounded on " + this.f24277g.mo27362c());
        if (m27449p(c6351eM27451m) || m27448o(c6351eM27451m)) {
            AbstractC6672k.m28227d(AbstractC6626O.m28098a(this.f24278h), null, null, new e(c6351eM27451m, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public final C6351E m27451m() {
        C6351E c6351e = this.f24279i;
        if (c6351e != null) {
            return c6351e;
        }
        AbstractC6118n.m27197o("localSessionData");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m27452r(C6351E c6351e) {
        AbstractC6118n.m27187e(c6351e, "<set-?>");
        this.f24279i = c6351e;
    }
}
