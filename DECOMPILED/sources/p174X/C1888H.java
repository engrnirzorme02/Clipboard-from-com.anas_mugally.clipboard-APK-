package p174X;

import kotlin.coroutines.jvm.internal.AbstractC6087b;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: X.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1888H implements InterfaceC1916t {

    /* JADX INFO: renamed from: a */
    private final String f6078a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC7419a f6079b;

    /* JADX INFO: renamed from: c */
    private final C1898b f6080c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC6918c f6081d;

    /* JADX INFO: renamed from: X.H$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6082a;

        /* JADX INFO: renamed from: b */
        Object f6083b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6084c;

        /* JADX INFO: renamed from: e */
        int f6086e;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6084c = obj;
            this.f6086e |= Integer.MIN_VALUE;
            return C1888H.this.mo7818b(null, this);
        }
    }

    /* JADX INFO: renamed from: X.H$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6087a;

        /* JADX INFO: renamed from: b */
        boolean f6088b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6089c;

        /* JADX INFO: renamed from: e */
        int f6091e;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6089c = obj;
            this.f6091e |= Integer.MIN_VALUE;
            return C1888H.this.mo7820d(null, this);
        }
    }

    /* JADX INFO: renamed from: X.H$c */
    static final class c extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f6092a;

        c(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return new c(interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            return ((c) create(interfaceC6919d, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f6092a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            return C1444v.f4971a;
        }
    }

    public C1888H(String filePath) {
        AbstractC6118n.m27187e(filePath, "filePath");
        this.f6078a = filePath;
        this.f6079b = AbstractC7425g.m32877b(false, 1, null);
        this.f6080c = new C1898b(0);
        this.f6081d = AbstractC6920e.m30367m(new c(null));
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: a */
    public Object mo7817a(InterfaceC1875e interfaceC1875e) {
        return AbstractC6087b.m27122c(this.f6080c.m7835b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: b */
    public Object mo7818b(InterfaceC5367l interfaceC5367l, InterfaceC1875e interfaceC1875e) throws Throwable {
        a aVar;
        InterfaceC7419a interfaceC7419a;
        Throwable th;
        InterfaceC7419a interfaceC7419a2;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f6086e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f6086e = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f6084c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f6086e;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                interfaceC7419a = this.f6079b;
                aVar.f6082a = interfaceC5367l;
                aVar.f6083b = interfaceC7419a;
                aVar.f6086e = 1;
                if (interfaceC7419a.mo32856d(null, aVar) != objE) {
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7419a2 = (InterfaceC7419a) aVar.f6082a;
                try {
                    AbstractC1437o.m6082b(obj);
                    interfaceC7419a2.mo32855c(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) aVar.f6083b;
            InterfaceC5367l interfaceC5367l2 = (InterfaceC5367l) aVar.f6082a;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a3;
            interfaceC5367l = interfaceC5367l2;
            aVar.f6082a = interfaceC7419a;
            aVar.f6083b = null;
            aVar.f6086e = 2;
            Object objInvoke = interfaceC5367l.invoke(aVar);
            if (objInvoke != objE) {
                InterfaceC7419a interfaceC7419a4 = interfaceC7419a;
                obj = objInvoke;
                interfaceC7419a2 = interfaceC7419a4;
                interfaceC7419a2.mo32855c(null);
                return obj;
            }
            return objE;
        } catch (Throwable th3) {
            InterfaceC7419a interfaceC7419a5 = interfaceC7419a;
            th = th3;
            interfaceC7419a2 = interfaceC7419a5;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: c */
    public Object mo7819c(InterfaceC1875e interfaceC1875e) {
        return AbstractC6087b.m27122c(this.f6080c.m7837d());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: d */
    public Object mo7820d(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) throws Throwable {
        b bVar;
        InterfaceC7419a interfaceC7419a;
        Throwable th;
        boolean z7;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f6091e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f6091e = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f6089c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f6091e;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = bVar.f6088b;
            interfaceC7419a = (InterfaceC7419a) bVar.f6087a;
            try {
                AbstractC1437o.m6082b(obj);
                if (z7) {
                    interfaceC7419a.mo32855c(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z7) {
                    interfaceC7419a.mo32855c(null);
                }
                throw th;
            }
        }
        AbstractC1437o.m6082b(obj);
        InterfaceC7419a interfaceC7419a2 = this.f6079b;
        boolean zMo32853a = interfaceC7419a2.mo32853a(null);
        try {
            Object objM27120a = AbstractC6087b.m27120a(zMo32853a);
            bVar.f6087a = interfaceC7419a2;
            bVar.f6088b = zMo32853a;
            bVar.f6091e = 1;
            Object objInvoke = interfaceC5371p.invoke(objM27120a, bVar);
            if (objInvoke == objE) {
                return objE;
            }
            interfaceC7419a = interfaceC7419a2;
            obj = objInvoke;
            z7 = zMo32853a;
            if (z7) {
                interfaceC7419a.mo32855c(null);
            }
            return obj;
        } catch (Throwable th3) {
            interfaceC7419a = interfaceC7419a2;
            th = th3;
            z7 = zMo32853a;
            if (z7) {
                interfaceC7419a.mo32855c(null);
            }
            throw th;
        }
    }

    @Override // p174X.InterfaceC1916t
    /* JADX INFO: renamed from: e */
    public InterfaceC6918c mo7821e() {
        return this.f6081d;
    }
}
