package p344r6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6117m;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p352s6.C7058o;

/* JADX INFO: renamed from: r6.j */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6925j {

    /* JADX INFO: renamed from: r6.j$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27794a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27795b;

        /* JADX INFO: renamed from: c */
        int f27796c;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27795b = obj;
            this.f27796c |= Integer.MIN_VALUE;
            return AbstractC6925j.m30382c(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: r6.j$b */
    public static final class b implements InterfaceC6918c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6918c f27797a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5372q f27798b;

        /* JADX INFO: renamed from: r6.j$b$a */
        public static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f27799a;

            /* JADX INFO: renamed from: b */
            int f27800b;

            /* JADX INFO: renamed from: d */
            Object f27802d;

            /* JADX INFO: renamed from: e */
            Object f27803e;

            public a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27799a = obj;
                this.f27800b |= Integer.MIN_VALUE;
                return b.this.mo7891a(null, this);
            }
        }

        public b(InterfaceC6918c interfaceC6918c, InterfaceC5372q interfaceC5372q) {
            this.f27797a = interfaceC6918c;
            this.f27798b = interfaceC5372q;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0088  */
        /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p344r6.InterfaceC6918c
        /* JADX INFO: renamed from: a */
        public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) throws Throwable {
            a aVar;
            b bVar;
            C6937v c6937v;
            InterfaceC5372q interfaceC5372q;
            C7058o c7058o;
            Throwable th;
            C7058o c7058o2;
            Object objMo7830j;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27800b;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27800b = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object obj = aVar.f27799a;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27800b;
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                try {
                    InterfaceC6918c interfaceC6918c = this.f27797a;
                    aVar.f27802d = this;
                    aVar.f27803e = interfaceC6919d;
                    aVar.f27800b = 1;
                    if (interfaceC6918c.mo7891a(interfaceC6919d, aVar) != objE) {
                        bVar = this;
                        c7058o = new C7058o(interfaceC6919d, aVar.getContext());
                        InterfaceC5372q interfaceC5372q2 = bVar.f27798b;
                        aVar.f27802d = c7058o;
                        aVar.f27803e = null;
                        aVar.f27800b = 3;
                        AbstractC6117m.m27182a(6);
                        objMo7830j = interfaceC5372q2.mo7830j(c7058o, null, aVar);
                        AbstractC6117m.m27182a(7);
                        if (objMo7830j != objE) {
                            c7058o2 = c7058o;
                            c7058o2.releaseIntercepted();
                            return C1444v.f4971a;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = this;
                    c6937v = new C6937v(th);
                    interfaceC5372q = bVar.f27798b;
                    aVar.f27802d = th;
                    aVar.f27803e = null;
                    aVar.f27800b = 2;
                    if (AbstractC6925j.m30382c(c6937v, interfaceC5372q, th, aVar) == objE) {
                        throw th;
                    }
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 == 2) {
                    Throwable th3 = (Throwable) aVar.f27802d;
                    AbstractC1437o.m6082b(obj);
                    throw th3;
                }
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7058o2 = (C7058o) aVar.f27802d;
                try {
                    AbstractC1437o.m6082b(obj);
                    c7058o2.releaseIntercepted();
                    return C1444v.f4971a;
                } catch (Throwable th4) {
                    th = th4;
                    c7058o2.releaseIntercepted();
                    throw th;
                }
            }
            interfaceC6919d = (InterfaceC6919d) aVar.f27803e;
            bVar = (b) aVar.f27802d;
            try {
                AbstractC1437o.m6082b(obj);
                c7058o = new C7058o(interfaceC6919d, aVar.getContext());
                try {
                    InterfaceC5372q interfaceC5372q3 = bVar.f27798b;
                    aVar.f27802d = c7058o;
                    aVar.f27803e = null;
                    aVar.f27800b = 3;
                    AbstractC6117m.m27182a(6);
                    objMo7830j = interfaceC5372q3.mo7830j(c7058o, null, aVar);
                    AbstractC6117m.m27182a(7);
                    if (objMo7830j != objE) {
                        c7058o2 = c7058o;
                        c7058o2.releaseIntercepted();
                        return C1444v.f4971a;
                    }
                    return objE;
                } catch (Throwable th5) {
                    th = th5;
                    c7058o2 = c7058o;
                    c7058o2.releaseIntercepted();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c6937v = new C6937v(th);
                interfaceC5372q = bVar.f27798b;
                aVar.f27802d = th;
                aVar.f27803e = null;
                aVar.f27800b = 2;
                if (AbstractC6925j.m30382c(c6937v, interfaceC5372q, th, aVar) == objE) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: r6.j$c */
    public static final class c implements InterfaceC6918c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5371p f27804a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6918c f27805b;

        /* JADX INFO: renamed from: r6.j$c$a */
        public static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f27806a;

            /* JADX INFO: renamed from: b */
            int f27807b;

            /* JADX INFO: renamed from: d */
            Object f27809d;

            /* JADX INFO: renamed from: e */
            Object f27810e;

            /* JADX INFO: renamed from: f */
            Object f27811f;

            public a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27806a = obj;
                this.f27807b |= Integer.MIN_VALUE;
                return c.this.mo7891a(null, this);
            }
        }

        public c(InterfaceC5371p interfaceC5371p, InterfaceC6918c interfaceC6918c) {
            this.f27804a = interfaceC5371p;
            this.f27805b = interfaceC6918c;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.mo7891a(r2, r0) == r1) goto L27;
         */
        @Override // p344r6.InterfaceC6918c
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) throws Throwable {
            a aVar;
            Throwable th;
            C7058o c7058o;
            c cVar;
            InterfaceC6919d interfaceC6919d2;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27807b;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27807b = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object obj = aVar.f27806a;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27807b;
            if (i8 != 0) {
                if (i8 == 1) {
                    c7058o = (C7058o) aVar.f27811f;
                    interfaceC6919d2 = (InterfaceC6919d) aVar.f27810e;
                    cVar = (c) aVar.f27809d;
                    try {
                        AbstractC1437o.m6082b(obj);
                        c7058o.releaseIntercepted();
                        InterfaceC6918c interfaceC6918c = cVar.f27805b;
                        aVar.f27809d = null;
                        aVar.f27810e = null;
                        aVar.f27811f = null;
                        aVar.f27807b = 2;
                    } catch (Throwable th2) {
                        th = th2;
                        c7058o.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(obj);
            C7058o c7058o2 = new C7058o(interfaceC6919d, aVar.getContext());
            try {
                InterfaceC5371p interfaceC5371p = this.f27804a;
                aVar.f27809d = this;
                aVar.f27810e = interfaceC6919d;
                aVar.f27811f = c7058o2;
                aVar.f27807b = 1;
                AbstractC6117m.m27182a(6);
                Object objInvoke = interfaceC5371p.invoke(c7058o2, aVar);
                AbstractC6117m.m27182a(7);
                if (objInvoke != objE) {
                    cVar = this;
                    interfaceC6919d2 = interfaceC6919d;
                    c7058o = c7058o2;
                    c7058o.releaseIntercepted();
                    InterfaceC6918c interfaceC6918c2 = cVar.f27805b;
                    aVar.f27809d = null;
                    aVar.f27810e = null;
                    aVar.f27811f = null;
                    aVar.f27807b = 2;
                }
                return objE;
            } catch (Throwable th3) {
                th = th3;
                c7058o = c7058o2;
                c7058o.releaseIntercepted();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m30381b(InterfaceC6919d interfaceC6919d) throws Throwable {
        if (interfaceC6919d instanceof C6937v) {
            throw ((C6937v) interfaceC6919d).f27876a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static final Object m30382c(InterfaceC6919d interfaceC6919d, InterfaceC5372q interfaceC5372q, Throwable th, InterfaceC1875e interfaceC1875e) {
        a aVar;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f27796c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f27796c = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f27795b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f27796c;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                aVar.f27794a = th;
                aVar.f27796c = 1;
                if (interfaceC5372q.mo7830j(interfaceC6919d, th, aVar) == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) aVar.f27794a;
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC1423a.m6060a(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6918c m30383d(InterfaceC6918c interfaceC6918c, InterfaceC5372q interfaceC5372q) {
        return new b(interfaceC6918c, interfaceC5372q);
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC6918c m30384e(InterfaceC6918c interfaceC6918c, InterfaceC5371p interfaceC5371p) {
        return new c(interfaceC5371p, interfaceC6918c);
    }
}
