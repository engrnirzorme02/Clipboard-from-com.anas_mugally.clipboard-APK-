package p344r6;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.AbstractC6117m;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1423a;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5372q;
import p318o6.InterfaceC6701y0;

/* JADX INFO: renamed from: r6.k */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6926k {

    /* JADX INFO: renamed from: r6.k$a */
    public static final class a implements InterfaceC6918c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6918c f27812a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5372q f27813b;

        /* JADX INFO: renamed from: r6.k$a$a, reason: collision with other inner class name */
        public static final class C7721a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            /* synthetic */ Object f27814a;

            /* JADX INFO: renamed from: b */
            int f27815b;

            /* JADX INFO: renamed from: d */
            Object f27817d;

            /* JADX INFO: renamed from: e */
            Object f27818e;

            public C7721a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27814a = obj;
                this.f27815b |= Integer.MIN_VALUE;
                return a.this.mo7891a(null, this);
            }
        }

        public a(InterfaceC6918c interfaceC6918c, InterfaceC5372q interfaceC5372q) {
            this.f27812a = interfaceC6918c;
            this.f27813b = interfaceC5372q;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        @Override // p344r6.InterfaceC6918c
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            C7721a c7721a;
            a aVar;
            if (interfaceC1875e instanceof C7721a) {
                c7721a = (C7721a) interfaceC1875e;
                int i7 = c7721a.f27815b;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    c7721a.f27815b = i7 - Integer.MIN_VALUE;
                } else {
                    c7721a = new C7721a(interfaceC1875e);
                }
            } else {
                c7721a = new C7721a(interfaceC1875e);
            }
            Object objM30358d = c7721a.f27814a;
            Object objE = AbstractC2005b.m8369e();
            int i8 = c7721a.f27815b;
            if (i8 != 0) {
                if (i8 == 1) {
                    interfaceC6919d = (InterfaceC6919d) c7721a.f27818e;
                    aVar = (a) c7721a.f27817d;
                    AbstractC1437o.m6082b(objM30358d);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(objM30358d);
                }
                return C1444v.f4971a;
            }
            AbstractC1437o.m6082b(objM30358d);
            InterfaceC6918c interfaceC6918c = this.f27812a;
            c7721a.f27817d = this;
            c7721a.f27818e = interfaceC6919d;
            c7721a.f27815b = 1;
            objM30358d = AbstractC6920e.m30358d(interfaceC6918c, interfaceC6919d, c7721a);
            if (objM30358d != objE) {
                aVar = this;
            }
            return objE;
            Throwable th = (Throwable) objM30358d;
            if (th != null) {
                InterfaceC5372q interfaceC5372q = aVar.f27813b;
                c7721a.f27817d = null;
                c7721a.f27818e = null;
                c7721a.f27815b = 2;
                AbstractC6117m.m27182a(6);
                Object objMo7830j = interfaceC5372q.mo7830j(interfaceC6919d, th, c7721a);
                AbstractC6117m.m27182a(7);
            }
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: r6.k$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27819a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27820b;

        /* JADX INFO: renamed from: c */
        int f27821c;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27820b = obj;
            this.f27821c |= Integer.MIN_VALUE;
            return AbstractC6920e.m30358d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: r6.k$c */
    static final class c implements InterfaceC6919d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6919d f27822a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6099B f27823b;

        /* JADX INFO: renamed from: r6.k$c$a */
        static final class a extends AbstractC6089d {

            /* JADX INFO: renamed from: a */
            Object f27824a;

            /* JADX INFO: renamed from: b */
            /* synthetic */ Object f27825b;

            /* JADX INFO: renamed from: d */
            int f27827d;

            a(InterfaceC1875e interfaceC1875e) {
                super(interfaceC1875e);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                this.f27825b = obj;
                this.f27827d |= Integer.MIN_VALUE;
                return c.this.mo7892d(null, this);
            }
        }

        c(InterfaceC6919d interfaceC6919d, C6099B c6099b) {
            this.f27822a = interfaceC6919d;
            this.f27823b = c6099b;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p344r6.InterfaceC6919d
        /* JADX INFO: renamed from: d */
        public final Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) throws Throwable {
            a aVar;
            c cVar;
            if (interfaceC1875e instanceof a) {
                aVar = (a) interfaceC1875e;
                int i7 = aVar.f27827d;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    aVar.f27827d = i7 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(interfaceC1875e);
                }
            } else {
                aVar = new a(interfaceC1875e);
            }
            Object obj2 = aVar.f27825b;
            Object objE = AbstractC2005b.m8369e();
            int i8 = aVar.f27827d;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f27824a;
                try {
                    AbstractC1437o.m6082b(obj2);
                    return C1444v.f4971a;
                } catch (Throwable th) {
                    th = th;
                    cVar.f27823b.f23859a = th;
                    throw th;
                }
            }
            AbstractC1437o.m6082b(obj2);
            try {
                InterfaceC6919d interfaceC6919d = this.f27822a;
                aVar.f27824a = this;
                aVar.f27827d = 1;
                if (interfaceC6919d.mo7892d(obj, aVar) == objE) {
                    return objE;
                }
                return C1444v.f4971a;
            } catch (Throwable th2) {
                th = th2;
                cVar = this;
                cVar.f27823b.f23859a = th;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6918c m30385a(InterfaceC6918c interfaceC6918c, InterfaceC5372q interfaceC5372q) {
        return new a(interfaceC6918c, interfaceC5372q);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m30386b(InterfaceC6918c interfaceC6918c, InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) throws Throwable {
        b bVar;
        C6099B c6099b;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f27821c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f27821c = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f27820b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f27821c;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            C6099B c6099b2 = new C6099B();
            try {
                InterfaceC6919d cVar = new c(interfaceC6919d, c6099b2);
                bVar.f27819a = c6099b2;
                bVar.f27821c = 1;
                if (interfaceC6918c.mo7891a(cVar, bVar) == objE) {
                    return objE;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c6099b = c6099b2;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c6099b = (C6099B) bVar.f27819a;
            try {
                AbstractC1437o.m6082b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) c6099b.f23859a;
        if (m30388d(th, th3) || m30387c(th, bVar.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC1423a.m6060a(th3, th);
            throw th3;
        }
        AbstractC1423a.m6060a(th, th3);
        throw th;
    }

    /* JADX INFO: renamed from: c */
    private static final boolean m30387c(Throwable th, InterfaceC1879i interfaceC1879i) {
        InterfaceC6701y0 interfaceC6701y0 = (InterfaceC6701y0) interfaceC1879i.get(InterfaceC6701y0.f24999p);
        if (interfaceC6701y0 == null || !interfaceC6701y0.isCancelled()) {
            return false;
        }
        return m30388d(th, interfaceC6701y0.getCancellationException());
    }

    /* JADX INFO: renamed from: d */
    private static final boolean m30388d(Throwable th, Throwable th2) {
        return th2 != null && AbstractC6118n.m27183a(th2, th);
    }
}
