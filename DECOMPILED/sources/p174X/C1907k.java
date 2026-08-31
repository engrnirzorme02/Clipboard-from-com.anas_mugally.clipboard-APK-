package p174X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import kotlin.jvm.internal.C6099B;
import kotlin.jvm.internal.C6128x;
import kotlin.jvm.internal.C6130z;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.AbstractC1440r;
import p145S5.C1434l;
import p145S5.C1435m;
import p145S5.C1436n;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p318o6.AbstractC6668i;
import p318o6.AbstractC6672k;
import p318o6.AbstractC6702z;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6698x;
import p318o6.InterfaceC6701y0;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: X.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1907k implements InterfaceC1905i {

    /* JADX INFO: renamed from: m */
    public static final a f6126m = new a(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC1890J f6127a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1901e f6128b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC6624N f6129c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6918c f6130d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC7419a f6131e;

    /* JADX INFO: renamed from: f */
    private int f6132f;

    /* JADX INFO: renamed from: g */
    private InterfaceC6701y0 f6133g;

    /* JADX INFO: renamed from: h */
    private final C1908l f6134h;

    /* JADX INFO: renamed from: i */
    private final b f6135i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC1429g f6136j;

    /* JADX INFO: renamed from: k */
    private final InterfaceC1429g f6137k;

    /* JADX INFO: renamed from: l */
    private final C1887G f6138l;

    /* JADX INFO: renamed from: X.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: X.k$b */
    private final class b extends AbstractC1884D {

        /* JADX INFO: renamed from: c */
        private List f6139c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1907k f6140d;

        /* JADX INFO: renamed from: X.k$b$a */
        static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f6141a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f6142b;

            /* JADX INFO: renamed from: d */
            int f6144d;

            a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f6142b = obj;
                this.f6144d |= Integer.MIN_VALUE;
                return b.this.mo7801b(this);
            }
        }

        /* JADX INFO: renamed from: X.k$b$b, reason: collision with other inner class name */
        static final class C7655b extends AbstractC6097l implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            Object f6145a;

            /* JADX INFO: renamed from: b */
            Object f6146b;

            /* JADX INFO: renamed from: c */
            Object f6147c;

            /* JADX INFO: renamed from: d */
            Object f6148d;

            /* JADX INFO: renamed from: e */
            Object f6149e;

            /* JADX INFO: renamed from: f */
            int f6150f;

            /* JADX INFO: renamed from: r */
            int f6151r;

            /* JADX INFO: renamed from: s */
            final /* synthetic */ C1907k f6152s;

            /* JADX INFO: renamed from: t */
            final /* synthetic */ b f6153t;

            /* JADX INFO: renamed from: X.k$b$b$a */
            public static final class a implements InterfaceC1915s {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC7419a f6154a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ C6128x f6155b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C6099B f6156c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ C1907k f6157d;

                /* JADX INFO: renamed from: X.k$b$b$a$a, reason: collision with other inner class name */
                static final class C7656a extends AbstractC6089d {

                    /* JADX INFO: renamed from: a */
                    Object f6158a;

                    /* JADX INFO: renamed from: b */
                    Object f6159b;

                    /* JADX INFO: renamed from: c */
                    Object f6160c;

                    /* JADX INFO: renamed from: d */
                    Object f6161d;

                    /* JADX INFO: renamed from: e */
                    Object f6162e;

                    /* JADX INFO: renamed from: f */
                    /* synthetic */ Object f6163f;

                    /* JADX INFO: renamed from: s */
                    int f6165s;

                    C7656a(InterfaceC1875e interfaceC1875e) {
                        super(interfaceC1875e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
                    public final Object invokeSuspend(Object obj) {
                        this.f6163f = obj;
                        this.f6165s |= Integer.MIN_VALUE;
                        return a.this.mo7884a(null, this);
                    }
                }

                a(InterfaceC7419a interfaceC7419a, C6128x c6128x, C6099B c6099b, C1907k c1907k) {
                    this.f6154a = interfaceC7419a;
                    this.f6155b = c6128x;
                    this.f6156c = c6099b;
                    this.f6157d = c1907k;
                }

                /* JADX WARN: Code duplicated, block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p174X.InterfaceC1915s
                /* JADX INFO: renamed from: a */
                public Object mo7884a(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws Throwable {
                    C7656a c7656a;
                    InterfaceC7419a interfaceC7419a;
                    C1907k c1907k;
                    C6128x c6128x;
                    C6099B c6099b;
                    InterfaceC7419a interfaceC7419a2;
                    InterfaceC7419a interfaceC7419a3;
                    C1907k c1907k2;
                    Object obj;
                    C6099B c6099b2;
                    if (interfaceC1875e instanceof C7656a) {
                        c7656a = (C7656a) interfaceC1875e;
                        int i7 = c7656a.f6165s;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            c7656a.f6165s = i7 - Integer.MIN_VALUE;
                        } else {
                            c7656a = new C7656a(interfaceC1875e);
                        }
                    } else {
                        c7656a = new C7656a(interfaceC1875e);
                    }
                    Object obj2 = c7656a.f6163f;
                    Object objE = AbstractC2005b.m8369e();
                    int i8 = c7656a.f6165s;
                    try {
                        if (i8 == 0) {
                            AbstractC1437o.m6082b(obj2);
                            interfaceC7419a = this.f6154a;
                            C6128x c6128x2 = this.f6155b;
                            C6099B c6099b3 = this.f6156c;
                            c1907k = this.f6157d;
                            c7656a.f6158a = interfaceC5371p;
                            c7656a.f6159b = interfaceC7419a;
                            c7656a.f6160c = c6128x2;
                            c7656a.f6161d = c6099b3;
                            c7656a.f6162e = c1907k;
                            c7656a.f6165s = 1;
                            if (interfaceC7419a.mo32856d(null, c7656a) != objE) {
                                c6128x = c6128x2;
                                c6099b = c6099b3;
                            }
                            return objE;
                        }
                        if (i8 != 1) {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c7656a.f6160c;
                                c6099b2 = (C6099B) c7656a.f6159b;
                                interfaceC7419a2 = (InterfaceC7419a) c7656a.f6158a;
                                try {
                                    AbstractC1437o.m6082b(obj2);
                                    c6099b2.f23859a = obj;
                                    c6099b = c6099b2;
                                    Object obj3 = c6099b.f23859a;
                                    interfaceC7419a2.mo32855c(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC7419a2.mo32855c(null);
                                    throw th;
                                }
                            }
                            c1907k2 = (C1907k) c7656a.f6160c;
                            c6099b = (C6099B) c7656a.f6159b;
                            interfaceC7419a3 = (InterfaceC7419a) c7656a.f6158a;
                            try {
                                AbstractC1437o.m6082b(obj2);
                                if (!AbstractC6118n.m27183a(obj2, c6099b.f23859a)) {
                                    c7656a.f6158a = interfaceC7419a3;
                                    c7656a.f6159b = c6099b;
                                    c7656a.f6160c = obj2;
                                    c7656a.f6165s = 3;
                                    if (c1907k2.m7879B(obj2, false, c7656a) != objE) {
                                        obj = obj2;
                                        c6099b2 = c6099b;
                                        interfaceC7419a2 = interfaceC7419a3;
                                        c6099b2.f23859a = obj;
                                        c6099b = c6099b2;
                                    }
                                    return objE;
                                }
                                interfaceC7419a2 = interfaceC7419a3;
                                Object obj4 = c6099b.f23859a;
                                interfaceC7419a2.mo32855c(null);
                                return obj4;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC7419a2 = interfaceC7419a3;
                                interfaceC7419a2.mo32855c(null);
                                throw th;
                            }
                        }
                        C1907k c1907k3 = (C1907k) c7656a.f6162e;
                        c6099b = (C6099B) c7656a.f6161d;
                        c6128x = (C6128x) c7656a.f6160c;
                        InterfaceC7419a interfaceC7419a4 = (InterfaceC7419a) c7656a.f6159b;
                        InterfaceC5371p interfaceC5371p2 = (InterfaceC5371p) c7656a.f6158a;
                        AbstractC1437o.m6082b(obj2);
                        c1907k = c1907k3;
                        interfaceC5371p = interfaceC5371p2;
                        interfaceC7419a = interfaceC7419a4;
                        if (c6128x.f23885a) {
                            throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                        }
                        Object obj5 = c6099b.f23859a;
                        c7656a.f6158a = interfaceC7419a;
                        c7656a.f6159b = c6099b;
                        c7656a.f6160c = c1907k;
                        c7656a.f6161d = null;
                        c7656a.f6162e = null;
                        c7656a.f6165s = 2;
                        Object objInvoke = interfaceC5371p.invoke(obj5, c7656a);
                        if (objInvoke != objE) {
                            interfaceC7419a3 = interfaceC7419a;
                            obj2 = objInvoke;
                            c1907k2 = c1907k;
                            if (!AbstractC6118n.m27183a(obj2, c6099b.f23859a)) {
                                c7656a.f6158a = interfaceC7419a3;
                                c7656a.f6159b = c6099b;
                                c7656a.f6160c = obj2;
                                c7656a.f6165s = 3;
                                if (c1907k2.m7879B(obj2, false, c7656a) != objE) {
                                    obj = obj2;
                                    c6099b2 = c6099b;
                                    interfaceC7419a2 = interfaceC7419a3;
                                    c6099b2.f23859a = obj;
                                    c6099b = c6099b2;
                                }
                            } else {
                                interfaceC7419a2 = interfaceC7419a3;
                            }
                            Object obj6 = c6099b.f23859a;
                            interfaceC7419a2.mo32855c(null);
                            return obj6;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC7419a2 = interfaceC7419a;
                        interfaceC7419a2.mo32855c(null);
                        throw th;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7655b(C1907k c1907k, b bVar, InterfaceC1875e interfaceC1875e) {
                super(1, interfaceC1875e);
                this.f6152s = c1907k;
                this.f6153t = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
                return new C7655b(this.f6152s, this.f6153t, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1875e interfaceC1875e) {
                return ((C7655b) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00af  */
            /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
            /* JADX WARN: Code duplicated, block: B:39:0x010d  */
            /* JADX WARN: Code duplicated, block: B:48:0x010c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:? A[LOOP:0: B:21:0x00a9->B:50:?, LOOP_END, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) throws C1900d {
                InterfaceC7419a interfaceC7419aM32877b;
                C6128x c6128x;
                C6099B c6099b;
                C6099B c6099b2;
                C6128x c6128x2;
                InterfaceC7419a interfaceC7419a;
                Iterator it;
                InterfaceC7419a interfaceC7419a2;
                C6128x c6128x3;
                C6099B c6099b3;
                a aVar;
                C6099B c6099b4;
                InterfaceC5371p interfaceC5371p;
                Object obj2;
                int iHashCode;
                int i7;
                Object objE = AbstractC2005b.m8369e();
                int i8 = this.f6151r;
                if (i8 == 0) {
                    AbstractC1437o.m6082b(obj);
                    interfaceC7419aM32877b = AbstractC7425g.m32877b(false, 1, null);
                    c6128x = new C6128x();
                    c6099b = new C6099B();
                    C1907k c1907k = this.f6152s;
                    this.f6145a = interfaceC7419aM32877b;
                    this.f6146b = c6128x;
                    this.f6147c = c6099b;
                    this.f6148d = c6099b;
                    this.f6151r = 1;
                    obj = c1907k.m7877y(true, this);
                    if (obj != objE) {
                        c6099b2 = c6099b;
                    }
                    return objE;
                }
                if (i8 == 1) {
                    c6099b = (C6099B) this.f6148d;
                    c6099b2 = (C6099B) this.f6147c;
                    c6128x = (C6128x) this.f6146b;
                    interfaceC7419aM32877b = (InterfaceC7419a) this.f6145a;
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i8 == 2) {
                        it = (Iterator) this.f6149e;
                        aVar = (a) this.f6148d;
                        c6099b3 = (C6099B) this.f6147c;
                        c6128x3 = (C6128x) this.f6146b;
                        interfaceC7419a2 = (InterfaceC7419a) this.f6145a;
                        AbstractC1437o.m6082b(obj);
                        while (it.hasNext()) {
                            interfaceC5371p = (InterfaceC5371p) it.next();
                            this.f6145a = interfaceC7419a2;
                            this.f6146b = c6128x3;
                            this.f6147c = c6099b3;
                            this.f6148d = aVar;
                            this.f6149e = it;
                            this.f6151r = 2;
                            if (interfaceC5371p.invoke(aVar, this) == objE) {
                                return objE;
                            }
                        }
                        c6099b2 = c6099b3;
                        c6128x2 = c6128x3;
                        interfaceC7419a = interfaceC7419a2;
                        this.f6153t.f6139c = null;
                        this.f6145a = c6128x2;
                        this.f6146b = c6099b2;
                        this.f6147c = interfaceC7419a;
                        this.f6148d = null;
                        this.f6149e = null;
                        this.f6151r = 3;
                        if (interfaceC7419a.mo32856d(null, this) != objE) {
                            c6099b4 = c6099b2;
                            c6128x2.f23885a = true;
                            C1444v c1444v = C1444v.f4971a;
                            interfaceC7419a.mo32855c(null);
                            obj2 = c6099b4.f23859a;
                            if (obj2 != null) {
                            }
                            InterfaceC1916t interfaceC1916tM7871r = this.f6152s.m7871r();
                            this.f6145a = obj2;
                            this.f6146b = null;
                            this.f6147c = null;
                            this.f6150f = iHashCode;
                            this.f6151r = 4;
                            obj = interfaceC1916tM7871r.mo7817a(this);
                            if (obj != objE) {
                                i7 = iHashCode;
                            }
                        }
                        return objE;
                    }
                    if (i8 == 3) {
                        interfaceC7419a = (InterfaceC7419a) this.f6147c;
                        c6099b4 = (C6099B) this.f6146b;
                        c6128x2 = (C6128x) this.f6145a;
                        AbstractC1437o.m6082b(obj);
                        try {
                            c6128x2.f23885a = true;
                            C1444v c1444v2 = C1444v.f4971a;
                            interfaceC7419a.mo32855c(null);
                            obj2 = c6099b4.f23859a;
                            iHashCode = obj2 != null ? obj2.hashCode() : 0;
                            InterfaceC1916t interfaceC1916tM7871r2 = this.f6152s.m7871r();
                            this.f6145a = obj2;
                            this.f6146b = null;
                            this.f6147c = null;
                            this.f6150f = iHashCode;
                            this.f6151r = 4;
                            obj = interfaceC1916tM7871r2.mo7817a(this);
                            if (obj != objE) {
                                i7 = iHashCode;
                            }
                            return objE;
                        } catch (Throwable th) {
                            interfaceC7419a.mo32855c(null);
                            throw th;
                        }
                    }
                    if (i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.f6150f;
                    obj2 = this.f6145a;
                    AbstractC1437o.m6082b(obj);
                }
                return new C1902f(obj2, i7, ((Number) obj).intValue());
                c6099b.f23859a = ((C1902f) obj).m7840c();
                a aVar2 = new a(interfaceC7419aM32877b, c6128x, c6099b2, this.f6152s);
                List list = this.f6153t.f6139c;
                if (list != null) {
                    it = list.iterator();
                    interfaceC7419a2 = interfaceC7419aM32877b;
                    c6128x3 = c6128x;
                    c6099b3 = c6099b2;
                    aVar = aVar2;
                    while (it.hasNext()) {
                        interfaceC5371p = (InterfaceC5371p) it.next();
                        this.f6145a = interfaceC7419a2;
                        this.f6146b = c6128x3;
                        this.f6147c = c6099b3;
                        this.f6148d = aVar;
                        this.f6149e = it;
                        this.f6151r = 2;
                        if (interfaceC5371p.invoke(aVar, this) == objE) {
                            return objE;
                        }
                    }
                    c6099b2 = c6099b3;
                    c6128x2 = c6128x3;
                    interfaceC7419a = interfaceC7419a2;
                } else {
                    c6128x2 = c6128x;
                    interfaceC7419a = interfaceC7419aM32877b;
                }
                this.f6153t.f6139c = null;
                this.f6145a = c6128x2;
                this.f6146b = c6099b2;
                this.f6147c = interfaceC7419a;
                this.f6148d = null;
                this.f6149e = null;
                this.f6151r = 3;
                if (interfaceC7419a.mo32856d(null, this) != objE) {
                    c6099b4 = c6099b2;
                    c6128x2.f23885a = true;
                    C1444v c1444v3 = C1444v.f4971a;
                    interfaceC7419a.mo32855c(null);
                    obj2 = c6099b4.f23859a;
                    if (obj2 != null) {
                    }
                    InterfaceC1916t interfaceC1916tM7871r3 = this.f6152s.m7871r();
                    this.f6145a = obj2;
                    this.f6146b = null;
                    this.f6147c = null;
                    this.f6150f = iHashCode;
                    this.f6151r = 4;
                    obj = interfaceC1916tM7871r3.mo7817a(this);
                    if (obj != objE) {
                        i7 = iHashCode;
                        return new C1902f(obj2, i7, ((Number) obj).intValue());
                    }
                }
                return objE;
            }
        }

        public b(C1907k c1907k, List initTasksList) {
            AbstractC6118n.m27187e(initTasksList, "initTasksList");
            this.f6140d = c1907k;
            this.f6139c = AbstractC1638q.m6593g0(initTasksList);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006e  */
        /* JADX WARN: Code duplicated, block: B:29:0x007c  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p174X.AbstractC1884D
        /* JADX INFO: renamed from: b */
        protected Object mo7801b(InterfaceC1875e interfaceC1875e) throws C1900d {
            a aVar;
            b bVar;
            C1902f c1902f;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f6144d;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f6144d = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object objM7877y = aVar.f6142b;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f6144d;
            if (i8 == 0) {
                AbstractC1437o.m6082b(objM7877y);
                List list = this.f6139c;
                if (list != null) {
                    AbstractC6118n.m27184b(list);
                    if (list.isEmpty()) {
                        C1907k c1907k = this.f6140d;
                        aVar.f6141a = this;
                        aVar.f6144d = 1;
                        objM7877y = c1907k.m7877y(false, aVar);
                        if (objM7877y != objE) {
                            bVar = this;
                            c1902f = (C1902f) objM7877y;
                        }
                    } else {
                        InterfaceC1916t interfaceC1916tM7871r = this.f6140d.m7871r();
                        C7655b c7655b = new C7655b(this.f6140d, this, null);
                        aVar.f6141a = this;
                        aVar.f6144d = 2;
                        objM7877y = interfaceC1916tM7871r.mo7818b(c7655b, aVar);
                        if (objM7877y != objE) {
                            bVar = this;
                            c1902f = (C1902f) objM7877y;
                        }
                    }
                } else {
                    C1907k c1907k2 = this.f6140d;
                    aVar.f6141a = this;
                    aVar.f6144d = 1;
                    objM7877y = c1907k2.m7877y(false, aVar);
                    if (objM7877y != objE) {
                        bVar = this;
                        c1902f = (C1902f) objM7877y;
                    }
                }
                return objE;
            }
            if (i8 == 1) {
                bVar = (b) aVar.f6141a;
                AbstractC1437o.m6082b(objM7877y);
                c1902f = (C1902f) objM7877y;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) aVar.f6141a;
                AbstractC1437o.m6082b(objM7877y);
                c1902f = (C1902f) objM7877y;
            }
            bVar.f6140d.f6134h.m7911c(c1902f);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: X.k$c */
    static final class c extends AbstractC6119o implements InterfaceC5356a {
        c() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1916t invoke() {
            return C1907k.this.m7880s().mo7826d();
        }
    }

    /* JADX INFO: renamed from: X.k$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f6167a;

        /* JADX INFO: renamed from: b */
        int f6168b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f6169c;

        /* JADX INFO: renamed from: X.k$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f6171a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1907k f6172b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C1907k c1907k, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6172b = c1907k;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f6172b, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6919d, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f6171a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    C1907k c1907k = this.f6172b;
                    this.f6171a = 1;
                    if (c1907k.m7873u(this) == objE) {
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

        /* JADX INFO: renamed from: X.k$d$b */
        static final class b extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f6173a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f6174b;

            b(InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                b bVar = new b(interfaceC1875e);
                bVar.f6174b = obj;
                return bVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC1889I abstractC1889I, InterfaceC1875e interfaceC1875e) {
                return ((b) create(abstractC1889I, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f6173a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return AbstractC6087b.m27120a(!(((AbstractC1889I) this.f6174b) instanceof C1914r));
            }
        }

        /* JADX INFO: renamed from: X.k$d$c */
        static final class c extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f6175a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f6176b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC1889I f6177c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(AbstractC1889I abstractC1889I, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6177c = abstractC1889I;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                c cVar = new c(this.f6177c, interfaceC1875e);
                cVar.f6176b = obj;
                return cVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC1889I abstractC1889I, InterfaceC1875e interfaceC1875e) {
                return ((c) create(abstractC1889I, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f6175a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                AbstractC1889I abstractC1889I = (AbstractC1889I) this.f6176b;
                return AbstractC6087b.m27120a((abstractC1889I instanceof C1902f) && abstractC1889I.m7823a() <= this.f6177c.m7823a());
            }
        }

        /* JADX INFO: renamed from: X.k$d$d, reason: collision with other inner class name */
        static final class C7657d extends AbstractC6097l implements InterfaceC5372q {

            /* JADX INFO: renamed from: a */
            int f6178a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C1907k f6179b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7657d(C1907k c1907k, InterfaceC1875e interfaceC1875e) {
                super(3, interfaceC1875e);
                this.f6179b = c1907k;
            }

            @Override // p238e6.InterfaceC5372q
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object mo7830j(InterfaceC6919d interfaceC6919d, Throwable th, InterfaceC1875e interfaceC1875e) {
                return new C7657d(this.f6179b, interfaceC1875e).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f6178a;
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    C1907k c1907k = this.f6179b;
                    this.f6178a = 1;
                    if (c1907k.m7869p(this) == objE) {
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

        /* JADX INFO: renamed from: X.k$d$e */
        public static final class e implements InterfaceC6918c {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC6918c f6180a;

            /* JADX INFO: renamed from: X.k$d$e$a */
            public static final class a implements InterfaceC6919d {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ InterfaceC6919d f6181a;

                /* JADX INFO: renamed from: X.k$d$e$a$a, reason: collision with other inner class name */
                public static final class C7658a extends AbstractC6089d {

                    /* JADX INFO: renamed from: a */
                    /* synthetic */ Object f6182a;

                    /* JADX INFO: renamed from: b */
                    int f6183b;

                    public C7658a(InterfaceC1875e interfaceC1875e) {
                        super(interfaceC1875e);
                    }

                    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
                    public final Object invokeSuspend(Object obj) {
                        this.f6182a = obj;
                        this.f6183b |= Integer.MIN_VALUE;
                        return a.this.mo7892d(null, this);
                    }
                }

                public a(InterfaceC6919d interfaceC6919d) {
                    this.f6181a = interfaceC6919d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p344r6.InterfaceC6919d
                /* JADX INFO: renamed from: d */
                public final Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) throws Throwable {
                    C7658a c7658a;
                    if (interfaceC1875e instanceof C7658a) {
                        c7658a = (C7658a) interfaceC1875e;
                        int i7 = c7658a.f6183b;
                        if ((i7 & Integer.MIN_VALUE) != 0) {
                            c7658a.f6183b = i7 - Integer.MIN_VALUE;
                        } else {
                            c7658a = new C7658a(interfaceC1875e);
                        }
                    } else {
                        c7658a = new C7658a(interfaceC1875e);
                    }
                    Object obj2 = c7658a.f6182a;
                    Object objE = AbstractC2005b.m8369e();
                    int i8 = c7658a.f6183b;
                    if (i8 == 0) {
                        AbstractC1437o.m6082b(obj2);
                        InterfaceC6919d interfaceC6919d = this.f6181a;
                        AbstractC1889I abstractC1889I = (AbstractC1889I) obj;
                        if (abstractC1889I instanceof C1882B) {
                            throw ((C1882B) abstractC1889I).m7798b();
                        }
                        if (!(abstractC1889I instanceof C1902f)) {
                            if (abstractC1889I instanceof C1914r ? true : abstractC1889I instanceof C1893M) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new C1434l();
                        }
                        Object objM7840c = ((C1902f) abstractC1889I).m7840c();
                        c7658a.f6183b = 1;
                        if (interfaceC6919d.mo7892d(objM7840c, c7658a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1437o.m6082b(obj2);
                    }
                    return C1444v.f4971a;
                }
            }

            public e(InterfaceC6918c interfaceC6918c) {
                this.f6180a = interfaceC6918c;
            }

            @Override // p344r6.InterfaceC6918c
            /* JADX INFO: renamed from: a */
            public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
                Object objMo7891a = this.f6180a.mo7891a(new a(interfaceC6919d), interfaceC1875e);
                return objMo7891a == AbstractC2005b.m8369e() ? objMo7891a : C1444v.f4971a;
            }
        }

        d(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            d dVar = C1907k.this.new d(interfaceC1875e);
            dVar.f6169c = obj;
            return dVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6919d, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        
            if (p344r6.AbstractC6920e.m30363i(r1, r9, r8) == r0) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC6919d interfaceC6919d;
            AbstractC1889I abstractC1889I;
            InterfaceC6919d interfaceC6919d2;
            AbstractC1889I abstractC1889I2;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6168b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6919d interfaceC6919d3 = (InterfaceC6919d) this.f6169c;
                C1907k c1907k = C1907k.this;
                this.f6169c = interfaceC6919d3;
                this.f6168b = 1;
                Object objM7878z = c1907k.m7878z(false, this);
                if (objM7878z != objE) {
                    interfaceC6919d = interfaceC6919d3;
                    obj = objM7878z;
                }
                return objE;
            }
            if (i7 == 1) {
                interfaceC6919d = (InterfaceC6919d) this.f6169c;
                AbstractC1437o.m6082b(obj);
            } else if (i7 == 2) {
                abstractC1889I2 = (AbstractC1889I) this.f6167a;
                interfaceC6919d2 = (InterfaceC6919d) this.f6169c;
                AbstractC1437o.m6082b(obj);
                abstractC1889I = abstractC1889I2;
                interfaceC6919d = interfaceC6919d2;
                InterfaceC6918c interfaceC6918cM30368n = AbstractC6920e.m30368n(new e(AbstractC6920e.m30361g(AbstractC6920e.m30370p(AbstractC6920e.m30369o(C1907k.this.f6134h.m7910b(), new a(C1907k.this, null)), new b(null)), new c(abstractC1889I, null))), new C7657d(C1907k.this, null));
                this.f6169c = null;
                this.f6167a = null;
                this.f6168b = 3;
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
            abstractC1889I = (AbstractC1889I) obj;
            if (abstractC1889I instanceof C1902f) {
                Object objM7840c = ((C1902f) abstractC1889I).m7840c();
                this.f6169c = interfaceC6919d;
                this.f6167a = abstractC1889I;
                this.f6168b = 2;
                if (interfaceC6919d.mo7892d(objM7840c, this) != objE) {
                    interfaceC6919d2 = interfaceC6919d;
                    abstractC1889I2 = abstractC1889I;
                    abstractC1889I = abstractC1889I2;
                    interfaceC6919d = interfaceC6919d2;
                    InterfaceC6918c interfaceC6918cM30368n2 = AbstractC6920e.m30368n(new e(AbstractC6920e.m30361g(AbstractC6920e.m30370p(AbstractC6920e.m30369o(C1907k.this.f6134h.m7910b(), new a(C1907k.this, null)), new b(null)), new c(abstractC1889I, null))), new C7657d(C1907k.this, null));
                    this.f6169c = null;
                    this.f6167a = null;
                    this.f6168b = 3;
                }
            } else {
                if (abstractC1889I instanceof C1893M) {
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                if (abstractC1889I instanceof C1882B) {
                    throw ((C1882B) abstractC1889I).m7798b();
                }
                if (abstractC1889I instanceof C1914r) {
                    return C1444v.f4971a;
                }
                InterfaceC6918c interfaceC6918cM30368n3 = AbstractC6920e.m30368n(new e(AbstractC6920e.m30361g(AbstractC6920e.m30370p(AbstractC6920e.m30369o(C1907k.this.f6134h.m7910b(), new a(C1907k.this, null)), new b(null)), new c(abstractC1889I, null))), new C7657d(C1907k.this, null));
                this.f6169c = null;
                this.f6167a = null;
                this.f6168b = 3;
            }
            return objE;
        }
    }

    /* JADX INFO: renamed from: X.k$e */
    static final class e extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6185a;

        /* JADX INFO: renamed from: b */
        Object f6186b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6187c;

        /* JADX INFO: renamed from: e */
        int f6189e;

        e(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6187c = obj;
            this.f6189e |= Integer.MIN_VALUE;
            return C1907k.this.m7869p(this);
        }
    }

    /* JADX INFO: renamed from: X.k$f */
    static final class f extends AbstractC6097l implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        int f6190a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5367l f6191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
            super(1, interfaceC1875e);
            this.f6191b = interfaceC5367l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
            return new f(this.f6191b, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1875e interfaceC1875e) {
            return ((f) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6190a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return obj;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC5367l interfaceC5367l = this.f6191b;
            this.f6190a = 1;
            Object objInvoke = interfaceC5367l.invoke(this);
            return objInvoke == objE ? objE : objInvoke;
        }
    }

    /* JADX INFO: renamed from: X.k$g */
    static final class g extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6192a;

        /* JADX INFO: renamed from: b */
        Object f6193b;

        /* JADX INFO: renamed from: c */
        Object f6194c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f6195d;

        /* JADX INFO: renamed from: f */
        int f6197f;

        g(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6195d = obj;
            this.f6197f |= Integer.MIN_VALUE;
            return C1907k.this.m7872t(null, this);
        }
    }

    /* JADX INFO: renamed from: X.k$h */
    static final class h extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6198a;

        /* JADX INFO: renamed from: b */
        Object f6199b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6200c;

        /* JADX INFO: renamed from: e */
        int f6202e;

        h(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6200c = obj;
            this.f6202e |= Integer.MIN_VALUE;
            return C1907k.this.m7873u(this);
        }
    }

    /* JADX INFO: renamed from: X.k$i */
    static final class i extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6203a;

        /* JADX INFO: renamed from: X.k$i$a */
        static final class a implements InterfaceC6919d {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C1907k f6205a;

            a(C1907k c1907k) {
                this.f6205a = c1907k;
            }

            @Override // p344r6.InterfaceC6919d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo7892d(C1444v c1444v, InterfaceC1875e interfaceC1875e) {
                Object objM7875w;
                return ((this.f6205a.f6134h.m7909a() instanceof C1914r) || (objM7875w = this.f6205a.m7875w(true, interfaceC1875e)) != AbstractC2005b.m8369e()) ? C1444v.f4971a : objM7875w;
            }
        }

        i(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C1907k.this.new i(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((i) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            if (r5.mo7891a(r1, r4) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6203a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                b bVar = C1907k.this.f6135i;
                this.f6203a = 1;
                if (bVar.m7800a(this) != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
            InterfaceC6918c interfaceC6918cM30360f = AbstractC6920e.m30360f(C1907k.this.m7871r().mo7821e());
            a aVar = new a(C1907k.this);
            this.f6203a = 2;
        }
    }

    /* JADX INFO: renamed from: X.k$j */
    static final class j extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6206a;

        /* JADX INFO: renamed from: b */
        int f6207b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6208c;

        /* JADX INFO: renamed from: e */
        int f6210e;

        j(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6208c = obj;
            this.f6210e |= Integer.MIN_VALUE;
            return C1907k.this.m7874v(this);
        }
    }

    /* JADX INFO: renamed from: X.k$k */
    static final class k extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6211a;

        /* JADX INFO: renamed from: b */
        Object f6212b;

        /* JADX INFO: renamed from: c */
        boolean f6213c;

        /* JADX INFO: renamed from: d */
        /* synthetic */ Object f6214d;

        /* JADX INFO: renamed from: f */
        int f6216f;

        k(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6214d = obj;
            this.f6216f |= Integer.MIN_VALUE;
            return C1907k.this.m7875w(false, this);
        }
    }

    /* JADX INFO: renamed from: X.k$l */
    static final class l extends AbstractC6097l implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        Object f6217a;

        /* JADX INFO: renamed from: b */
        int f6218b;

        l(InterfaceC1875e interfaceC1875e) {
            super(1, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
            return C1907k.this.new l(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1875e interfaceC1875e) {
            return ((l) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            AbstractC1889I c1882b;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6218b;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    C1907k c1907k = C1907k.this;
                    this.f6218b = 1;
                    obj = c1907k.m7877y(true, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) this.f6217a;
                        AbstractC1437o.m6082b(obj);
                        c1882b = new C1882B(th, ((Number) obj).intValue());
                        return AbstractC1440r.m6083a(c1882b, AbstractC6087b.m27120a(true));
                    }
                    AbstractC1437o.m6082b(obj);
                }
                c1882b = (AbstractC1889I) obj;
            } catch (Throwable th2) {
                InterfaceC1916t interfaceC1916tM7871r = C1907k.this.m7871r();
                this.f6217a = th2;
                this.f6218b = 2;
                Object objMo7817a = interfaceC1916tM7871r.mo7817a(this);
                if (objMo7817a != objE) {
                    th = th2;
                    obj = objMo7817a;
                }
                return objE;
            }
            return AbstractC1440r.m6083a(c1882b, AbstractC6087b.m27120a(true));
        }
    }

    /* JADX INFO: renamed from: X.k$m */
    static final class m extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f6220a;

        /* JADX INFO: renamed from: b */
        int f6221b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ boolean f6222c;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f6224e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f6224e = i7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            m mVar = C1907k.this.new m(this.f6224e, interfaceC1875e);
            mVar.f6222c = ((Boolean) obj).booleanValue();
            return mVar;
        }

        /* JADX INFO: renamed from: g */
        public final Object m7897g(boolean z7, InterfaceC1875e interfaceC1875e) {
            return ((m) create(Boolean.valueOf(z7), interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7897g(((Boolean) obj).booleanValue(), (InterfaceC1875e) obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r4v0 */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Throwable th;
            int iIntValue;
            ?? r7;
            ?? r8;
            AbstractC1889I abstractC1889I;
            ?? r9;
            Object objE = AbstractC2005b.m8369e();
            ?? r10 = this.f6221b;
            try {
                if (r10 == 0) {
                    AbstractC1437o.m6082b(obj);
                    boolean z7 = this.f6222c;
                    C1907k c1907k = C1907k.this;
                    this.f6222c = z7;
                    this.f6221b = 1;
                    obj = c1907k.m7877y(z7, this);
                    r10 = z7;
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z8 = this.f6222c;
                        th = (Throwable) this.f6220a;
                        AbstractC1437o.m6082b(obj);
                        r8 = z8;
                        iIntValue = ((Number) obj).intValue();
                        r7 = r8;
                        C1882B c1882b = new C1882B(th, iIntValue);
                        r9 = r7;
                        abstractC1889I = c1882b;
                        return AbstractC1440r.m6083a(abstractC1889I, AbstractC6087b.m27120a(r9));
                    }
                    boolean z9 = this.f6222c;
                    AbstractC1437o.m6082b(obj);
                    r10 = z9;
                }
                abstractC1889I = (AbstractC1889I) obj;
                r9 = r10;
            } catch (Throwable th2) {
                if (r10 != 0) {
                    InterfaceC1916t interfaceC1916tM7871r = C1907k.this.m7871r();
                    this.f6220a = th2;
                    this.f6222c = r10;
                    this.f6221b = 2;
                    Object objMo7817a = interfaceC1916tM7871r.mo7817a(this);
                    if (objMo7817a != objE) {
                        r8 = r10;
                        th = th2;
                        obj = objMo7817a;
                    }
                    return objE;
                }
                ?? r11 = r10;
                th = th2;
                iIntValue = this.f6224e;
                r7 = r11 == true ? 1 : 0;
            }
            return AbstractC1440r.m6083a(abstractC1889I, AbstractC6087b.m27120a(r9));
        }
    }

    /* JADX INFO: renamed from: X.k$n */
    static final class n extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6225a;

        /* JADX INFO: renamed from: b */
        Object f6226b;

        /* JADX INFO: renamed from: c */
        Object f6227c;

        /* JADX INFO: renamed from: d */
        Object f6228d;

        /* JADX INFO: renamed from: e */
        boolean f6229e;

        /* JADX INFO: renamed from: f */
        int f6230f;

        /* JADX INFO: renamed from: r */
        /* synthetic */ Object f6231r;

        /* JADX INFO: renamed from: t */
        int f6233t;

        n(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6231r = obj;
            this.f6233t |= Integer.MIN_VALUE;
            return C1907k.this.m7877y(false, this);
        }
    }

    /* JADX INFO: renamed from: X.k$o */
    static final class o extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f6234a;

        /* JADX INFO: renamed from: b */
        int f6235b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ boolean f6236c;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ int f6238e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f6238e = i7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            o oVar = C1907k.this.new o(this.f6238e, interfaceC1875e);
            oVar.f6236c = ((Boolean) obj).booleanValue();
            return oVar;
        }

        /* JADX INFO: renamed from: g */
        public final Object m7898g(boolean z7, InterfaceC1875e interfaceC1875e) {
            return ((o) create(Boolean.valueOf(z7), interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m7898g(((Boolean) obj).booleanValue(), (InterfaceC1875e) obj2);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0059  */
        /* JADX WARN: Code duplicated, block: B:23:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            boolean z7;
            Object obj2;
            int iIntValue;
            int iHashCode;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6235b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                z7 = this.f6236c;
                C1907k c1907k = C1907k.this;
                this.f6236c = z7;
                this.f6235b = 1;
                obj = c1907k.m7876x(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                z7 = this.f6236c;
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f6234a;
                AbstractC1437o.m6082b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C1902f(obj2, iHashCode, iIntValue);
            if (z7) {
                InterfaceC1916t interfaceC1916tM7871r = C1907k.this.m7871r();
                this.f6234a = obj;
                this.f6235b = 2;
                Object objMo7817a = interfaceC1916tM7871r.mo7817a(this);
                if (objMo7817a != objE) {
                    obj2 = obj;
                    obj = objMo7817a;
                    iIntValue = ((Number) obj).intValue();
                }
                return objE;
            }
            obj2 = obj;
            iIntValue = this.f6238e;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C1902f(obj2, iHashCode, iIntValue);
        }
    }

    /* JADX INFO: renamed from: X.k$p */
    static final class p extends AbstractC6097l implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        Object f6239a;

        /* JADX INFO: renamed from: b */
        int f6240b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6099B f6241c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C1907k f6242d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C6130z f6243e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C6099B c6099b, C1907k c1907k, C6130z c6130z, InterfaceC1875e interfaceC1875e) {
            super(1, interfaceC1875e);
            this.f6241c = c6099b;
            this.f6242d = c1907k;
            this.f6243e = c6130z;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
            return new p(this.f6241c, this.f6242d, this.f6243e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1875e interfaceC1875e) {
            return ((p) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            C6130z c6130z;
            C6099B c6099b;
            C6130z c6130z2;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6240b;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    c6099b = this.f6241c;
                    C1907k c1907k = this.f6242d;
                    this.f6239a = c6099b;
                    this.f6240b = 1;
                    obj = c1907k.m7876x(this);
                    if (obj == objE) {
                    }
                    return objE;
                }
                if (i7 == 1) {
                    c6099b = (C6099B) this.f6239a;
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6130z = (C6130z) this.f6239a;
                        AbstractC1437o.m6082b(obj);
                        c6130z.f23887a = ((Number) obj).intValue();
                        return C1444v.f4971a;
                    }
                    c6130z2 = (C6130z) this.f6239a;
                    AbstractC1437o.m6082b(obj);
                }
                c6130z2.f23887a = ((Number) obj).intValue();
                return C1444v.f4971a;
                c6099b.f23859a = obj;
                c6130z2 = this.f6243e;
                InterfaceC1916t interfaceC1916tM7871r = this.f6242d.m7871r();
                this.f6239a = c6130z2;
                this.f6240b = 2;
                obj = interfaceC1916tM7871r.mo7817a(this);
                if (obj == objE) {
                    return objE;
                }
                c6130z2.f23887a = ((Number) obj).intValue();
            } catch (C1900d unused) {
                C6130z c6130z3 = this.f6243e;
                C1907k c1907k2 = this.f6242d;
                Object obj2 = this.f6241c.f23859a;
                this.f6239a = c6130z3;
                this.f6240b = 3;
                Object objM7879B = c1907k2.m7879B(obj2, true, this);
                if (objM7879B != objE) {
                    c6130z = c6130z3;
                    obj = objM7879B;
                }
                return objE;
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: X.k$q */
    static final class q extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6244a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ boolean f6246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(boolean z7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f6246c = z7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C1907k.this.new q(this.f6246c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((q) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
        
            if (r5 == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6244a;
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
                    return (AbstractC1889I) obj;
                }
                AbstractC1437o.m6082b(obj);
                if (C1907k.this.f6134h.m7909a() instanceof C1914r) {
                    return C1907k.this.f6134h.m7909a();
                }
                C1907k c1907k = C1907k.this;
                this.f6244a = 1;
                if (c1907k.m7874v(this) != objE) {
                }
                return objE;
                C1907k c1907k2 = C1907k.this;
                boolean z7 = this.f6246c;
                this.f6244a = 2;
                obj = c1907k2.m7875w(z7, this);
            } catch (Throwable th) {
                return new C1882B(th, -1);
            }
        }
    }

    /* JADX INFO: renamed from: X.k$r */
    static final class r extends AbstractC6119o implements InterfaceC5356a {
        r() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1891K invoke() {
            return C1907k.this.f6127a.mo7824a();
        }
    }

    /* JADX INFO: renamed from: X.k$s */
    static final class s extends AbstractC6097l implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        Object f6248a;

        /* JADX INFO: renamed from: b */
        int f6249b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC1879i f6251d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5371p f6252e;

        /* JADX INFO: renamed from: X.k$s$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f6253a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC5371p f6254b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C1902f f6255c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5371p interfaceC5371p, C1902f c1902f, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f6254b = interfaceC5371p;
                this.f6255c = c1902f;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return new a(this.f6254b, this.f6255c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f6253a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                    return obj;
                }
                AbstractC1437o.m6082b(obj);
                InterfaceC5371p interfaceC5371p = this.f6254b;
                Object objM7840c = this.f6255c.m7840c();
                this.f6253a = 1;
                Object objInvoke = interfaceC5371p.invoke(objM7840c, this);
                return objInvoke == objE ? objE : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(InterfaceC1879i interfaceC1879i, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
            super(1, interfaceC1875e);
            this.f6251d = interfaceC1879i;
            this.f6252e = interfaceC5371p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(InterfaceC1875e interfaceC1875e) {
            return C1907k.this.new s(this.f6251d, this.f6252e, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1875e interfaceC1875e) {
            return ((s) create(interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) throws C1900d {
            C1902f c1902f;
            C1907k c1907k;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6249b;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                C1907k c1907k2 = C1907k.this;
                this.f6249b = 1;
                obj = c1907k2.m7877y(true, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i7 == 1) {
                AbstractC1437o.m6082b(obj);
            } else {
                if (i7 != 2) {
                    if (i7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.f6248a;
                    AbstractC1437o.m6082b(obj);
                    return obj2;
                }
                c1902f = (C1902f) this.f6248a;
                AbstractC1437o.m6082b(obj);
            }
            c1902f.m7839b();
            if (!AbstractC6118n.m27183a(c1902f.m7840c(), obj)) {
                c1907k = C1907k.this;
                this.f6248a = obj;
                this.f6249b = 3;
                if (c1907k.m7879B(obj, true, this) == objE) {
                    return objE;
                }
            }
            return obj;
            c1902f = (C1902f) obj;
            InterfaceC1879i interfaceC1879i = this.f6251d;
            a aVar = new a(this.f6252e, c1902f, null);
            this.f6248a = c1902f;
            this.f6249b = 2;
            obj = AbstractC6668i.m28186g(interfaceC1879i, aVar, this);
            if (obj != objE) {
                c1902f.m7839b();
                if (!AbstractC6118n.m27183a(c1902f.m7840c(), obj)) {
                    c1907k = C1907k.this;
                    this.f6248a = obj;
                    this.f6249b = 3;
                    if (c1907k.m7879B(obj, true, this) == objE) {
                    }
                }
                return obj;
            }
            return objE;
        }
    }

    /* JADX INFO: renamed from: X.k$t */
    static final class t extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6256a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f6257b;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ InterfaceC5371p f6259d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f6259d = interfaceC5371p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            t tVar = C1907k.this.new t(this.f6259d, interfaceC1875e);
            tVar.f6257b = obj;
            return tVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((t) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6256a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return obj;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.f6257b;
            InterfaceC6698x interfaceC6698xM28298b = AbstractC6702z.m28298b(null, 1, null);
            C1907k.this.f6138l.m7814e(new AbstractC1919w.a(this.f6259d, interfaceC6698xM28298b, C1907k.this.f6134h.m7909a(), interfaceC6624N.mo12635Q()));
            this.f6256a = 1;
            Object objAwait = interfaceC6698xM28298b.await(this);
            return objAwait == objE ? objE : objAwait;
        }
    }

    /* JADX INFO: renamed from: X.k$u */
    static final class u extends AbstractC6119o implements InterfaceC5367l {
        u() {
            super(1);
        }

        /* JADX INFO: renamed from: a */
        public final void m7905a(Throwable th) {
            if (th != null) {
                C1907k.this.f6134h.m7911c(new C1914r(th));
            }
            if (C1907k.this.f6136j.mo6064d()) {
                C1907k.this.m7880s().close();
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m7905a((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: X.k$v */
    static final class v extends AbstractC6119o implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        public static final v f6261a = new v();

        v() {
            super(2);
        }

        /* JADX INFO: renamed from: a */
        public final void m7906a(AbstractC1919w.a msg, Throwable th) {
            AbstractC6118n.m27187e(msg, "msg");
            InterfaceC6698x interfaceC6698xM7928a = msg.m7928a();
            if (th == null) {
                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC6698xM7928a.mo28288o0(th);
        }

        @Override // p238e6.InterfaceC5371p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m7906a((AbstractC1919w.a) obj, (Throwable) obj2);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: X.k$w */
    static final class w extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6262a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f6263b;

        w(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            w wVar = C1907k.this.new w(interfaceC1875e);
            wVar.f6263b = obj;
            return wVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC1919w.a aVar, InterfaceC1875e interfaceC1875e) {
            return ((w) create(aVar, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6262a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AbstractC1919w.a aVar = (AbstractC1919w.a) this.f6263b;
                C1907k c1907k = C1907k.this;
                this.f6262a = 1;
                if (c1907k.m7872t(aVar, this) == objE) {
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

    /* JADX INFO: renamed from: X.k$x */
    static final class x extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6265a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f6266b;

        /* JADX INFO: renamed from: d */
        int f6268d;

        x(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6266b = obj;
            this.f6268d |= Integer.MIN_VALUE;
            return C1907k.this.m7879B(null, false, this);
        }
    }

    /* JADX INFO: renamed from: X.k$y */
    static final class y extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        Object f6269a;

        /* JADX INFO: renamed from: b */
        int f6270b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f6271c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6130z f6272d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ C1907k f6273e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Object f6274f;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ boolean f6275r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(C6130z c6130z, C1907k c1907k, Object obj, boolean z7, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f6272d = c6130z;
            this.f6273e = c1907k;
            this.f6274f = obj;
            this.f6275r = z7;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            y yVar = new y(this.f6272d, this.f6273e, this.f6274f, this.f6275r, interfaceC1875e);
            yVar.f6271c = obj;
            return yVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1896P interfaceC1896P, InterfaceC1875e interfaceC1875e) {
            return ((y) create(interfaceC1896P, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r3.mo7832a(r7, r6) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C6130z c6130z;
            InterfaceC1896P interfaceC1896P;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6270b;
            if (i7 != 0) {
                if (i7 == 1) {
                    c6130z = (C6130z) this.f6269a;
                    interfaceC1896P = (InterfaceC1896P) this.f6271c;
                    AbstractC1437o.m6082b(obj);
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                if (this.f6275r) {
                    C1908l c1908l = this.f6273e.f6134h;
                    Object obj2 = this.f6274f;
                    c1908l.m7911c(new C1902f(obj2, obj2 != null ? obj2.hashCode() : 0, this.f6272d.f23887a));
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC1896P interfaceC1896P2 = (InterfaceC1896P) this.f6271c;
            c6130z = this.f6272d;
            InterfaceC1916t interfaceC1916tM7871r = this.f6273e.m7871r();
            this.f6271c = interfaceC1896P2;
            this.f6269a = c6130z;
            this.f6270b = 1;
            Object objMo7819c = interfaceC1916tM7871r.mo7819c(this);
            if (objMo7819c != objE) {
                interfaceC1896P = interfaceC1896P2;
                obj = objMo7819c;
            }
            return objE;
            c6130z.f23887a = ((Number) obj).intValue();
            Object obj3 = this.f6274f;
            this.f6271c = null;
            this.f6269a = null;
            this.f6270b = 2;
        }
    }

    public C1907k(InterfaceC1890J storage, List initTasksList, InterfaceC1901e corruptionHandler, InterfaceC6624N scope) {
        AbstractC6118n.m27187e(storage, "storage");
        AbstractC6118n.m27187e(initTasksList, "initTasksList");
        AbstractC6118n.m27187e(corruptionHandler, "corruptionHandler");
        AbstractC6118n.m27187e(scope, "scope");
        this.f6127a = storage;
        this.f6128b = corruptionHandler;
        this.f6129c = scope;
        this.f6130d = AbstractC6920e.m30367m(new d(null));
        this.f6131e = AbstractC7425g.m32877b(false, 1, null);
        this.f6134h = new C1908l();
        this.f6135i = new b(this, initTasksList);
        this.f6136j = AbstractC1430h.m6066b(new r());
        this.f6137k = AbstractC1430h.m6066b(new c());
        this.f6138l = new C1887G(scope, new u(), v.f6261a, new w(null));
    }

    /* JADX INFO: renamed from: A */
    private final Object m7854A(InterfaceC5371p interfaceC5371p, InterfaceC1879i interfaceC1879i, InterfaceC1875e interfaceC1875e) {
        return m7871r().mo7818b(new s(interfaceC1879i, interfaceC5371p, null), interfaceC1875e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m7869p(InterfaceC1875e interfaceC1875e) {
        e eVar;
        C1907k c1907k;
        InterfaceC7419a interfaceC7419a;
        if (interfaceC1875e instanceof e) {
            eVar = (e) interfaceC1875e;
            int i7 = eVar.f6189e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                eVar.f6189e = i7 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC1875e);
            }
        } else {
            eVar = new e(interfaceC1875e);
        }
        Object obj = eVar.f6187c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = eVar.f6189e;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            InterfaceC7419a interfaceC7419a2 = this.f6131e;
            eVar.f6185a = this;
            eVar.f6186b = interfaceC7419a2;
            eVar.f6189e = 1;
            if (interfaceC7419a2.mo32856d(null, eVar) == objE) {
                return objE;
            }
            c1907k = this;
            interfaceC7419a = interfaceC7419a2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7419a = (InterfaceC7419a) eVar.f6186b;
            c1907k = (C1907k) eVar.f6185a;
            AbstractC1437o.m6082b(obj);
        }
        try {
            int i9 = c1907k.f6132f - 1;
            c1907k.f6132f = i9;
            if (i9 == 0) {
                InterfaceC6701y0 interfaceC6701y0 = c1907k.f6133g;
                if (interfaceC6701y0 != null) {
                    InterfaceC6701y0.a.m28291b(interfaceC6701y0, null, 1, null);
                }
                c1907k.f6133g = null;
            }
            C1444v c1444v = C1444v.f4971a;
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX INFO: renamed from: q */
    private final Object m7870q(boolean z7, InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
        return z7 ? interfaceC5367l.invoke(interfaceC1875e) : m7871r().mo7818b(new f(interfaceC5367l, null), interfaceC1875e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC1916t m7871r() {
        return (InterfaceC1916t) this.f6137k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r9 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.w$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [X.w$a] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3, types: [o6.x] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7872t(AbstractC1919w.a aVar, InterfaceC1875e interfaceC1875e) {
        g gVar;
        Object objM6073b;
        ?? r9;
        InterfaceC6698x interfaceC6698xM7928a;
        C1907k c1907k;
        Object objM7854A;
        ?? r10;
        InterfaceC6698x interfaceC6698x;
        if (interfaceC1875e instanceof g) {
            gVar = (g) interfaceC1875e;
            int i7 = gVar.f6197f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                gVar.f6197f = i7 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC1875e);
            }
        } else {
            gVar = new g(interfaceC1875e);
        }
        Object obj = gVar.f6195d;
        Object objE = AbstractC2005b.m8369e();
        int i8 = gVar.f6197f;
        boolean z7 = true;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    interfaceC6698x = (InterfaceC6698x) gVar.f6192a;
                } else if (i8 == 2) {
                    InterfaceC6698x interfaceC6698x2 = (InterfaceC6698x) gVar.f6194c;
                    c1907k = (C1907k) gVar.f6193b;
                    AbstractC1919w.a aVar2 = (AbstractC1919w.a) gVar.f6192a;
                    AbstractC1437o.m6082b(obj);
                    interfaceC6698xM7928a = interfaceC6698x2;
                    r10 = aVar2;
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC6698x = (InterfaceC6698x) gVar.f6192a;
                }
                AbstractC1437o.m6082b(obj);
                aVar = interfaceC6698x;
                objM6073b = C1436n.m6073b(obj);
                r9 = aVar;
                AbstractC6702z.m28299c(r9, objM6073b);
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            interfaceC6698xM7928a = aVar.m7928a();
            try {
                C1436n.a aVar3 = C1436n.f4958b;
                AbstractC1889I abstractC1889IM7909a = this.f6134h.m7909a();
                if (abstractC1889IM7909a instanceof C1902f) {
                    InterfaceC5371p interfaceC5371pM7931d = aVar.m7931d();
                    InterfaceC1879i interfaceC1879iM7929b = aVar.m7929b();
                    gVar.f6192a = interfaceC6698xM7928a;
                    gVar.f6197f = 1;
                    objM7854A = m7854A(interfaceC5371pM7931d, interfaceC1879iM7929b, gVar);
                    if (objM7854A == objE) {
                    }
                    InterfaceC6698x interfaceC6698x3 = interfaceC6698xM7928a;
                    obj = objM7854A;
                    aVar = interfaceC6698x3;
                    objM6073b = C1436n.m6073b(obj);
                    r9 = aVar;
                    AbstractC6702z.m28299c(r9, objM6073b);
                    return C1444v.f4971a;
                }
                if (!(abstractC1889IM7909a instanceof C1882B)) {
                    z7 = abstractC1889IM7909a instanceof C1893M;
                }
                if (!z7) {
                    if (abstractC1889IM7909a instanceof C1914r) {
                        throw ((C1914r) abstractC1889IM7909a).m7925b();
                    }
                    throw new C1434l();
                }
                if (abstractC1889IM7909a != aVar.m7930c()) {
                    AbstractC6118n.m27185c(abstractC1889IM7909a, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((C1882B) abstractC1889IM7909a).m7798b();
                }
                gVar.f6192a = aVar;
                gVar.f6193b = this;
                gVar.f6194c = interfaceC6698xM7928a;
                gVar.f6197f = 2;
                if (m7874v(gVar) != objE) {
                    c1907k = this;
                    r10 = aVar;
                }
                return objE;
            } catch (Throwable th) {
                th = th;
                aVar = interfaceC6698xM7928a;
                C1436n.a aVar4 = C1436n.f4958b;
                objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
                r9 = aVar;
            }
            InterfaceC5371p interfaceC5371pM7931d2 = r10.m7931d();
            InterfaceC1879i interfaceC1879iM7929b2 = r10.m7929b();
            gVar.f6192a = interfaceC6698xM7928a;
            gVar.f6193b = null;
            gVar.f6194c = null;
            gVar.f6197f = 3;
            objM7854A = c1907k.m7854A(interfaceC5371pM7931d2, interfaceC1879iM7929b2, gVar);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7873u(InterfaceC1875e interfaceC1875e) {
        h hVar;
        C1907k c1907k;
        InterfaceC7419a interfaceC7419a;
        if (interfaceC1875e instanceof h) {
            hVar = (h) interfaceC1875e;
            int i7 = hVar.f6202e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                hVar.f6202e = i7 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC1875e);
            }
        } else {
            hVar = new h(interfaceC1875e);
        }
        Object obj = hVar.f6200c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = hVar.f6202e;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            InterfaceC7419a interfaceC7419a2 = this.f6131e;
            hVar.f6198a = this;
            hVar.f6199b = interfaceC7419a2;
            hVar.f6202e = 1;
            if (interfaceC7419a2.mo32856d(null, hVar) == objE) {
                return objE;
            }
            c1907k = this;
            interfaceC7419a = interfaceC7419a2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7419a = (InterfaceC7419a) hVar.f6199b;
            c1907k = (C1907k) hVar.f6198a;
            AbstractC1437o.m6082b(obj);
        }
        try {
            int i9 = c1907k.f6132f + 1;
            c1907k.f6132f = i9;
            if (i9 == 1) {
                c1907k.f6133g = AbstractC6672k.m28227d(c1907k.f6129c, null, null, c1907k.new i(null), 3, null);
            }
            C1444v c1444v = C1444v.f4971a;
            return C1444v.f4971a;
        } finally {
            interfaceC7419a.mo32855c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r4.m7802c(r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7874v(InterfaceC1875e interfaceC1875e) throws Throwable {
        j jVar;
        C1907k c1907k;
        int iIntValue;
        int i7;
        Throwable th;
        C1907k c1907k2;
        if (interfaceC1875e instanceof j) {
            jVar = (j) interfaceC1875e;
            int i8 = jVar.f6210e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                jVar.f6210e = i8 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC1875e);
            }
        } else {
            jVar = new j(interfaceC1875e);
        }
        Object objMo7817a = jVar.f6208c;
        Object objE = AbstractC2005b.m8369e();
        int i9 = jVar.f6210e;
        try {
            if (i9 == 0) {
                AbstractC1437o.m6082b(objMo7817a);
                InterfaceC1916t interfaceC1916tM7871r = m7871r();
                jVar.f6206a = this;
                jVar.f6210e = 1;
                objMo7817a = interfaceC1916tM7871r.mo7817a(jVar);
                if (objMo7817a != objE) {
                    c1907k = this;
                }
                return objE;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = jVar.f6207b;
                c1907k2 = (C1907k) jVar.f6206a;
                try {
                    AbstractC1437o.m6082b(objMo7817a);
                    return C1444v.f4971a;
                } catch (Throwable th2) {
                    th = th2;
                    c1907k2.f6134h.m7911c(new C1882B(th, i7));
                    throw th;
                }
            }
            c1907k = (C1907k) jVar.f6206a;
            AbstractC1437o.m6082b(objMo7817a);
            b bVar = c1907k.f6135i;
            jVar.f6206a = c1907k;
            jVar.f6207b = iIntValue;
            jVar.f6210e = 2;
        } catch (Throwable th3) {
            i7 = iIntValue;
            th = th3;
            c1907k2 = c1907k;
            c1907k2.f6134h.m7911c(new C1882B(th, i7));
            throw th;
        }
        iIntValue = ((Number) objMo7817a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7875w(boolean z7, InterfaceC1875e interfaceC1875e) {
        k kVar;
        AbstractC1889I abstractC1889I;
        Object obj;
        boolean z8;
        C1907k c1907k;
        C1435m c1435m;
        AbstractC1889I abstractC1889I2;
        if (interfaceC1875e instanceof k) {
            kVar = (k) interfaceC1875e;
            int i7 = kVar.f6216f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                kVar.f6216f = i7 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC1875e);
            }
        } else {
            kVar = new k(interfaceC1875e);
        }
        Object objMo7820d = kVar.f6214d;
        Object objE = AbstractC2005b.m8369e();
        int i8 = kVar.f6216f;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objMo7820d);
            AbstractC1889I abstractC1889IM7909a = this.f6134h.m7909a();
            if (abstractC1889IM7909a instanceof C1893M) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            InterfaceC1916t interfaceC1916tM7871r = m7871r();
            kVar.f6211a = this;
            kVar.f6212b = abstractC1889IM7909a;
            kVar.f6213c = z7;
            kVar.f6216f = 1;
            Object objMo7817a = interfaceC1916tM7871r.mo7817a(kVar);
            if (objMo7817a != objE) {
                abstractC1889I = abstractC1889IM7909a;
                obj = objMo7817a;
                z8 = z7;
                c1907k = this;
            }
            return objE;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                c1907k = (C1907k) kVar.f6211a;
                AbstractC1437o.m6082b(objMo7820d);
                c1435m = (C1435m) objMo7820d;
                abstractC1889I2 = (AbstractC1889I) c1435m.m6068a();
                if (((Boolean) c1435m.m6069b()).booleanValue()) {
                    c1907k.f6134h.m7911c(abstractC1889I2);
                }
                return abstractC1889I2;
            }
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1907k = (C1907k) kVar.f6211a;
            AbstractC1437o.m6082b(objMo7820d);
            c1435m = (C1435m) objMo7820d;
            abstractC1889I2 = (AbstractC1889I) c1435m.m6068a();
            if (((Boolean) c1435m.m6069b()).booleanValue()) {
                c1907k.f6134h.m7911c(abstractC1889I2);
            }
            return abstractC1889I2;
        }
        boolean z9 = kVar.f6213c;
        AbstractC1889I abstractC1889I3 = (AbstractC1889I) kVar.f6212b;
        C1907k c1907k2 = (C1907k) kVar.f6211a;
        AbstractC1437o.m6082b(objMo7820d);
        z8 = z9;
        c1907k = c1907k2;
        abstractC1889I = abstractC1889I3;
        obj = objMo7820d;
        int iIntValue = ((Number) obj).intValue();
        boolean z10 = abstractC1889I instanceof C1902f;
        int iM7823a = z10 ? abstractC1889I.m7823a() : -1;
        if (z10 && iIntValue == iM7823a) {
            return abstractC1889I;
        }
        if (z8) {
            InterfaceC1916t interfaceC1916tM7871r2 = c1907k.m7871r();
            l lVar = c1907k.new l(null);
            kVar.f6211a = c1907k;
            kVar.f6212b = null;
            kVar.f6216f = 2;
            objMo7820d = interfaceC1916tM7871r2.mo7818b(lVar, kVar);
        } else {
            InterfaceC1916t interfaceC1916tM7871r3 = c1907k.m7871r();
            m mVar = c1907k.new m(iM7823a, null);
            kVar.f6211a = c1907k;
            kVar.f6212b = null;
            kVar.f6216f = 3;
            objMo7820d = interfaceC1916tM7871r3.mo7820d(mVar, kVar);
        }
        return objE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public final Object m7876x(InterfaceC1875e interfaceC1875e) {
        return AbstractC1892L.m7828a(m7880s(), interfaceC1875e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x010d  */
    /* JADX WARN: Code duplicated, block: B:66:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX INFO: renamed from: y */
    public final Object m7877y(boolean z7, InterfaceC1875e interfaceC1875e) throws C1900d {
        n nVar;
        C1907k c1907k;
        C6099B c6099b;
        Object objMo7838a;
        C1900d c1900d;
        C6099B c6099b2;
        C1907k c1907k2;
        C6130z c6130z;
        C1900d c1900d2;
        InterfaceC5367l pVar;
        C6130z c6130z2;
        C6099B c6099b3;
        C1907k c1907k3;
        C1907k c1907k4;
        int iHashCode;
        Object objMo7817a;
        boolean z8;
        int i7;
        Object obj;
        if (interfaceC1875e instanceof n) {
            nVar = (n) interfaceC1875e;
            int i8 = nVar.f6233t;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.f6233t = i8 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC1875e);
            }
        } else {
            nVar = new n(interfaceC1875e);
        }
        Object objMo7817a2 = nVar.f6231r;
        Object objE = AbstractC2005b.m8369e();
        ?? r7 = nVar.f6233t;
        try {
            switch (r7) {
                case 0:
                    AbstractC1437o.m6082b(objMo7817a2);
                    try {
                        if (z7) {
                            nVar.f6225a = this;
                            nVar.f6229e = z7;
                            nVar.f6233t = 1;
                            objMo7817a2 = m7876x(nVar);
                            if (objMo7817a2 != objE) {
                                c1907k4 = this;
                                if (objMo7817a2 != null) {
                                    try {
                                        iHashCode = objMo7817a2.hashCode();
                                    } catch (C1900d e7) {
                                        e = e7;
                                        c1907k = c1907k4;
                                        c6099b = new C6099B();
                                        InterfaceC1901e interfaceC1901e = c1907k.f6128b;
                                        nVar.f6225a = c1907k;
                                        nVar.f6226b = e;
                                        nVar.f6227c = c6099b;
                                        nVar.f6228d = c6099b;
                                        nVar.f6229e = z7;
                                        nVar.f6233t = 5;
                                        objMo7838a = interfaceC1901e.mo7838a(e, nVar);
                                        if (objMo7838a != objE) {
                                            c1900d = e;
                                            objMo7817a2 = objMo7838a;
                                            c6099b2 = c6099b;
                                            c1907k2 = c1907k;
                                            c6099b2.f23859a = objMo7817a2;
                                            c6130z = new C6130z();
                                            try {
                                                pVar = new p(c6099b, c1907k2, c6130z, null);
                                                nVar.f6225a = c1900d;
                                                nVar.f6226b = c6099b;
                                                nVar.f6227c = c6130z;
                                                nVar.f6228d = null;
                                                nVar.f6233t = 6;
                                                if (c1907k2.m7870q(z7, pVar, nVar) != objE) {
                                                    c6130z2 = c6130z;
                                                    c6099b3 = c6099b;
                                                    Object obj2 = c6099b3.f23859a;
                                                    return new C1902f(obj2, obj2 != null ? obj2.hashCode() : 0, c6130z2.f23887a);
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                c1900d2 = c1900d;
                                                AbstractC1423a.m6060a(c1900d2, th);
                                                throw c1900d2;
                                            }
                                        }
                                    }
                                } else {
                                    iHashCode = 0;
                                }
                                InterfaceC1916t interfaceC1916tM7871r = c1907k4.m7871r();
                                nVar.f6225a = c1907k4;
                                nVar.f6226b = objMo7817a2;
                                nVar.f6229e = z7;
                                nVar.f6230f = iHashCode;
                                nVar.f6233t = 2;
                                objMo7817a = interfaceC1916tM7871r.mo7817a(nVar);
                                if (objMo7817a != objE) {
                                    int i9 = iHashCode;
                                    z8 = z7;
                                    i7 = i9;
                                    obj = objMo7817a2;
                                    objMo7817a2 = objMo7817a;
                                    return new C1902f(obj, i7, ((Number) objMo7817a2).intValue());
                                }
                            }
                        } else {
                            InterfaceC1916t interfaceC1916tM7871r2 = m7871r();
                            nVar.f6225a = this;
                            nVar.f6229e = z7;
                            nVar.f6233t = 3;
                            objMo7817a2 = interfaceC1916tM7871r2.mo7817a(nVar);
                            if (objMo7817a2 != objE) {
                                c1907k3 = this;
                                int iIntValue = ((Number) objMo7817a2).intValue();
                                InterfaceC1916t interfaceC1916tM7871r3 = c1907k3.m7871r();
                                o oVar = c1907k3.new o(iIntValue, null);
                                nVar.f6225a = c1907k3;
                                nVar.f6229e = z7;
                                nVar.f6233t = 4;
                                objMo7817a2 = interfaceC1916tM7871r3.mo7820d(oVar, nVar);
                                if (objMo7817a2 == objE) {
                                }
                                return (C1902f) objMo7817a2;
                            }
                        }
                    } catch (C1900d e8) {
                        e = e8;
                        c1907k = this;
                        c6099b = new C6099B();
                        InterfaceC1901e interfaceC1901e2 = c1907k.f6128b;
                        nVar.f6225a = c1907k;
                        nVar.f6226b = e;
                        nVar.f6227c = c6099b;
                        nVar.f6228d = c6099b;
                        nVar.f6229e = z7;
                        nVar.f6233t = 5;
                        objMo7838a = interfaceC1901e2.mo7838a(e, nVar);
                        if (objMo7838a != objE) {
                            c1900d = e;
                            objMo7817a2 = objMo7838a;
                            c6099b2 = c6099b;
                            c1907k2 = c1907k;
                            c6099b2.f23859a = objMo7817a2;
                            c6130z = new C6130z();
                            pVar = new p(c6099b, c1907k2, c6130z, null);
                            nVar.f6225a = c1900d;
                            nVar.f6226b = c6099b;
                            nVar.f6227c = c6130z;
                            nVar.f6228d = null;
                            nVar.f6233t = 6;
                            if (c1907k2.m7870q(z7, pVar, nVar) != objE) {
                                c6130z2 = c6130z;
                                c6099b3 = c6099b;
                                Object obj3 = c6099b3.f23859a;
                                return new C1902f(obj3, obj3 != null ? obj3.hashCode() : 0, c6130z2.f23887a);
                            }
                        }
                    }
                    return objE;
                case 1:
                    z7 = nVar.f6229e;
                    C1907k c1907k5 = (C1907k) nVar.f6225a;
                    AbstractC1437o.m6082b(objMo7817a2);
                    c1907k4 = c1907k5;
                    if (objMo7817a2 != null) {
                        iHashCode = objMo7817a2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterfaceC1916t interfaceC1916tM7871r4 = c1907k4.m7871r();
                    nVar.f6225a = c1907k4;
                    nVar.f6226b = objMo7817a2;
                    nVar.f6229e = z7;
                    nVar.f6230f = iHashCode;
                    nVar.f6233t = 2;
                    objMo7817a = interfaceC1916tM7871r4.mo7817a(nVar);
                    if (objMo7817a != objE) {
                        int i10 = iHashCode;
                        z8 = z7;
                        i7 = i10;
                        obj = objMo7817a2;
                        objMo7817a2 = objMo7817a;
                        return new C1902f(obj, i7, ((Number) objMo7817a2).intValue());
                    }
                    return objE;
                case 2:
                    i7 = nVar.f6230f;
                    z8 = nVar.f6229e;
                    obj = nVar.f6226b;
                    c1907k4 = (C1907k) nVar.f6225a;
                    try {
                        AbstractC1437o.m6082b(objMo7817a2);
                        return new C1902f(obj, i7, ((Number) objMo7817a2).intValue());
                    } catch (C1900d e9) {
                        e = e9;
                        z7 = z8;
                        c1907k = c1907k4;
                        c6099b = new C6099B();
                        InterfaceC1901e interfaceC1901e3 = c1907k.f6128b;
                        nVar.f6225a = c1907k;
                        nVar.f6226b = e;
                        nVar.f6227c = c6099b;
                        nVar.f6228d = c6099b;
                        nVar.f6229e = z7;
                        nVar.f6233t = 5;
                        objMo7838a = interfaceC1901e3.mo7838a(e, nVar);
                        if (objMo7838a != objE) {
                            c1900d = e;
                            objMo7817a2 = objMo7838a;
                            c6099b2 = c6099b;
                            c1907k2 = c1907k;
                            c6099b2.f23859a = objMo7817a2;
                            c6130z = new C6130z();
                            pVar = new p(c6099b, c1907k2, c6130z, null);
                            nVar.f6225a = c1900d;
                            nVar.f6226b = c6099b;
                            nVar.f6227c = c6130z;
                            nVar.f6228d = null;
                            nVar.f6233t = 6;
                            if (c1907k2.m7870q(z7, pVar, nVar) != objE) {
                                c6130z2 = c6130z;
                                c6099b3 = c6099b;
                                Object obj4 = c6099b3.f23859a;
                                return new C1902f(obj4, obj4 != null ? obj4.hashCode() : 0, c6130z2.f23887a);
                            }
                        }
                        return objE;
                    }
                case 3:
                    z7 = nVar.f6229e;
                    c1907k3 = (C1907k) nVar.f6225a;
                    AbstractC1437o.m6082b(objMo7817a2);
                    int iIntValue2 = ((Number) objMo7817a2).intValue();
                    InterfaceC1916t interfaceC1916tM7871r5 = c1907k3.m7871r();
                    o oVar2 = c1907k3.new o(iIntValue2, null);
                    nVar.f6225a = c1907k3;
                    nVar.f6229e = z7;
                    nVar.f6233t = 4;
                    objMo7817a2 = interfaceC1916tM7871r5.mo7820d(oVar2, nVar);
                    if (objMo7817a2 == objE) {
                        return objE;
                    }
                    return (C1902f) objMo7817a2;
                case 4:
                    boolean z9 = nVar.f6229e;
                    AbstractC1437o.m6082b(objMo7817a2);
                    return (C1902f) objMo7817a2;
                case 5:
                    z7 = nVar.f6229e;
                    C6099B c6099b4 = (C6099B) nVar.f6228d;
                    C6099B c6099b5 = (C6099B) nVar.f6227c;
                    c1900d = (C1900d) nVar.f6226b;
                    C1907k c1907k6 = (C1907k) nVar.f6225a;
                    AbstractC1437o.m6082b(objMo7817a2);
                    c6099b2 = c6099b4;
                    c6099b = c6099b5;
                    c1907k2 = c1907k6;
                    c6099b2.f23859a = objMo7817a2;
                    c6130z = new C6130z();
                    pVar = new p(c6099b, c1907k2, c6130z, null);
                    nVar.f6225a = c1900d;
                    nVar.f6226b = c6099b;
                    nVar.f6227c = c6130z;
                    nVar.f6228d = null;
                    nVar.f6233t = 6;
                    if (c1907k2.m7870q(z7, pVar, nVar) != objE) {
                        c6130z2 = c6130z;
                        c6099b3 = c6099b;
                        Object obj5 = c6099b3.f23859a;
                        return new C1902f(obj5, obj5 != null ? obj5.hashCode() : 0, c6130z2.f23887a);
                    }
                    return objE;
                case 6:
                    c6130z2 = (C6130z) nVar.f6227c;
                    c6099b3 = (C6099B) nVar.f6226b;
                    c1900d2 = (C1900d) nVar.f6225a;
                    try {
                        AbstractC1437o.m6082b(objMo7817a2);
                        Object obj6 = c6099b3.f23859a;
                        return new C1902f(obj6, obj6 != null ? obj6.hashCode() : 0, c6130z2.f23887a);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC1423a.m6060a(c1900d2, th);
                        throw c1900d2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C1900d e10) {
            e = e10;
            c1907k = r7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public final Object m7878z(boolean z7, InterfaceC1875e interfaceC1875e) {
        return AbstractC6668i.m28186g(this.f6129c.mo12635Q(), new q(z7, null), interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public final Object m7879B(Object obj, boolean z7, InterfaceC1875e interfaceC1875e) {
        x xVar;
        C6130z c6130z;
        if (interfaceC1875e instanceof x) {
            xVar = (x) interfaceC1875e;
            int i7 = xVar.f6268d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                xVar.f6268d = i7 - Integer.MIN_VALUE;
            } else {
                xVar = new x(interfaceC1875e);
            }
        } else {
            xVar = new x(interfaceC1875e);
        }
        Object obj2 = xVar.f6266b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = xVar.f6268d;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj2);
            C6130z c6130z2 = new C6130z();
            InterfaceC1891K interfaceC1891KM7880s = m7880s();
            y yVar = new y(c6130z2, this, obj, z7, null);
            xVar.f6265a = c6130z2;
            xVar.f6268d = 1;
            if (interfaceC1891KM7880s.mo7827e(yVar, xVar) == objE) {
                return objE;
            }
            c6130z = c6130z2;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6130z = (C6130z) xVar.f6265a;
            AbstractC1437o.m6082b(obj2);
        }
        return AbstractC6087b.m27122c(c6130z.f23887a);
    }

    @Override // p174X.InterfaceC1905i
    /* JADX INFO: renamed from: a */
    public Object mo7850a(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        C1895O c1895o = (C1895O) interfaceC1875e.getContext().get(C1895O.a.C7652a.f6102a);
        if (c1895o != null) {
            c1895o.m7831a(this);
        }
        return AbstractC6668i.m28186g(new C1895O(c1895o, this), new t(interfaceC5371p, null), interfaceC1875e);
    }

    @Override // p174X.InterfaceC1905i
    public InterfaceC6918c getData() {
        return this.f6130d;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC1891K m7880s() {
        return (InterfaceC1891K) this.f6136j.getValue();
    }
}
