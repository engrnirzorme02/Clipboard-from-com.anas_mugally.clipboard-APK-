package p054G4;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6100C;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6126v;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p174X.C1900d;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p181Y.C2009b;
import p196a0.AbstractC2173a;
import p196a0.AbstractC2181i;
import p206b0.AbstractC2924f;
import p206b0.AbstractC2925g;
import p206b0.AbstractC2928j;
import p206b0.C2921c;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p254g6.InterfaceC5519a;
import p286k6.InterfaceC6083i;
import p318o6.AbstractC6670j;
import p318o6.InterfaceC6624N;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;

/* JADX INFO: renamed from: G4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0484c {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ InterfaceC6083i[] f1810f = {AbstractC6100C.m27143f(new C6126v(C0484c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a */
    private final Context f1811a;

    /* JADX INFO: renamed from: b */
    private final String f1812b;

    /* JADX INFO: renamed from: c */
    private final ThreadLocal f1813c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC5519a f1814d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1905i f1815e;

    /* JADX INFO: renamed from: G4.c$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f1816a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5367l f1818c;

        /* JADX INFO: renamed from: G4.c$a$a, reason: collision with other inner class name */
        static final class C7628a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f1819a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f1820b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC5367l f1821c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7628a(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f1821c = interfaceC5367l;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                C7628a c7628a = new C7628a(this.f1821c, interfaceC1875e);
                c7628a.f1820b = obj;
                return c7628a;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2921c c2921c, InterfaceC1875e interfaceC1875e) {
                return ((C7628a) create(c2921c, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f1819a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                this.f1821c.invoke((C2921c) this.f1820b);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f1818c = interfaceC5367l;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C0484c.this.new a(this.f1818c, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f1816a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    if (AbstractC6118n.m27183a(C0484c.this.f1813c.get(), AbstractC6087b.m27120a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    C0484c.this.f1813c.set(AbstractC6087b.m27120a(true));
                    InterfaceC1905i interfaceC1905i = C0484c.this.f1815e;
                    C7628a c7628a = new C7628a(this.f1818c, null);
                    this.f1816a = 1;
                    obj = AbstractC2928j.m14683a(interfaceC1905i, c7628a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                AbstractC2924f abstractC2924f = (AbstractC2924f) obj;
                C0484c.this.f1813c.set(AbstractC6087b.m27120a(false));
                return abstractC2924f;
            } catch (Throwable th) {
                C0484c.this.f1813c.set(AbstractC6087b.m27120a(false));
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: G4.c$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f1822a;

        b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C0484c.this.new b(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Map mapMo14653a;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f1822a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6918c data = C0484c.this.f1815e.getData();
                this.f1822a = 1;
                obj = AbstractC6920e.m30366l(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            AbstractC2924f abstractC2924f = (AbstractC2924f) obj;
            return (abstractC2924f == null || (mapMo14653a = abstractC2924f.mo14653a()) == null) ? AbstractC1610H.m6626h() : mapMo14653a;
        }
    }

    /* JADX INFO: renamed from: G4.c$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f1824a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC2924f.a f1826c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f1827d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC2924f.a aVar, Object obj, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f1826c = aVar;
            this.f1827d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C0484c.this.new c(this.f1826c, this.f1827d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objMo14654b;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f1824a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6918c data = C0484c.this.f1815e.getData();
                this.f1824a = 1;
                obj = AbstractC6920e.m30366l(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            AbstractC2924f abstractC2924f = (AbstractC2924f) obj;
            return (abstractC2924f == null || (objMo14654b = abstractC2924f.mo14654b(this.f1826c)) == null) ? this.f1827d : objMo14654b;
        }
    }

    /* JADX INFO: renamed from: G4.c$d */
    static final class d extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f1828a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AbstractC2924f.a f1830c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f1831d;

        /* JADX INFO: renamed from: G4.c$d$a */
        static final class a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f1832a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f1833b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ AbstractC2924f.a f1834c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ Object f1835d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractC2924f.a aVar, Object obj, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f1834c = aVar;
                this.f1835d = obj;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                a aVar = new a(this.f1834c, this.f1835d, interfaceC1875e);
                aVar.f1833b = obj;
                return aVar;
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C2921c c2921c, InterfaceC1875e interfaceC1875e) {
                return ((a) create(c2921c, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                AbstractC2005b.m8369e();
                if (this.f1832a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                ((C2921c) this.f1833b).m14659i(this.f1834c, this.f1835d);
                return C1444v.f4971a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC2924f.a aVar, Object obj, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f1830c = aVar;
            this.f1831d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return C0484c.this.new d(this.f1830c, this.f1831d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((d) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f1828a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return obj;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC1905i interfaceC1905i = C0484c.this.f1815e;
            a aVar = new a(this.f1830c, this.f1831d, null);
            this.f1828a = 1;
            Object objM14683a = AbstractC2928j.m14683a(interfaceC1905i, aVar, this);
            return objM14683a == objE ? objE : objM14683a;
        }
    }

    public C0484c(Context context, String name) {
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(name, "name");
        this.f1811a = context;
        this.f1812b = name;
        this.f1813c = new ThreadLocal();
        this.f1814d = AbstractC2173a.m8796b(name, new C2009b(new InterfaceC5367l() { // from class: G4.a
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C0484c.m2071e(this.f1808a, (C1900d) obj);
            }
        }), new InterfaceC5367l() { // from class: G4.b
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C0484c.m2072f(this.f1809a, (Context) obj);
            }
        }, null, 8, null);
        this.f1815e = m2073i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final AbstractC2924f m2071e(C0484c c0484c, C1900d ex) {
        AbstractC6118n.m27187e(ex, "ex");
        Log.w(AbstractC6100C.m27139b(C0484c.class).mo27115b(), "CorruptionException in " + c0484c.f1812b + " DataStore running in process " + Process.myPid(), ex);
        return AbstractC2925g.m14669a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final List m2072f(C0484c c0484c, Context it) {
        AbstractC6118n.m27187e(it, "it");
        return AbstractC1638q.m6759d(AbstractC2181i.m8861b(it, c0484c.f1812b, null, 4, null));
    }

    /* JADX INFO: renamed from: i */
    private final InterfaceC1905i m2073i(Context context) {
        return (InterfaceC1905i) this.f1814d.mo8800a(context, f1810f[0]);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC2924f m2074g(InterfaceC5367l transform) {
        AbstractC6118n.m27187e(transform, "transform");
        return (AbstractC2924f) AbstractC6670j.m28200b(null, new a(transform, null), 1, null);
    }

    /* JADX INFO: renamed from: h */
    public final Map m2075h() {
        return (Map) AbstractC6670j.m28200b(null, new b(null), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final Object m2076j(AbstractC2924f.a key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        return AbstractC6670j.m28200b(null, new c(key, obj, null), 1, null);
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC2924f m2077k(AbstractC2924f.a key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        return (AbstractC2924f) AbstractC6670j.m28200b(null, new d(key, obj, null), 1, null);
    }
}
