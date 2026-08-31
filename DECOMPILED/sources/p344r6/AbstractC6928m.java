package p344r6;

import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.jvm.internal.C6099B;
import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p352s6.AbstractC7053j;
import p352s6.AbstractC7056m;
import p352s6.C7044a;

/* JADX INFO: renamed from: r6.m */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6928m {

    /* JADX INFO: renamed from: r6.m$a */
    public static final class a implements InterfaceC6919d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6099B f27851a;

        public a(C6099B c6099b) {
            this.f27851a = c6099b;
        }

        @Override // p344r6.InterfaceC6919d
        /* JADX INFO: renamed from: d */
        public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
            this.f27851a.f23859a = obj;
            throw new C7044a(this);
        }
    }

    /* JADX INFO: renamed from: r6.m$b */
    static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27852a;

        /* JADX INFO: renamed from: b */
        Object f27853b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f27854c;

        /* JADX INFO: renamed from: d */
        int f27855d;

        b(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27854c = obj;
            this.f27855d |= Integer.MIN_VALUE;
            return AbstractC6920e.m30365k(null, this);
        }
    }

    /* JADX INFO: renamed from: r6.m$c */
    public static final class c implements InterfaceC6919d {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C6099B f27856a;

        public c(C6099B c6099b) {
            this.f27856a = c6099b;
        }

        @Override // p344r6.InterfaceC6919d
        /* JADX INFO: renamed from: d */
        public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
            this.f27856a.f23859a = obj;
            throw new C7044a(this);
        }
    }

    /* JADX INFO: renamed from: r6.m$d */
    static final class d extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27857a;

        /* JADX INFO: renamed from: b */
        Object f27858b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f27859c;

        /* JADX INFO: renamed from: d */
        int f27860d;

        d(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27859c = obj;
            this.f27860d |= Integer.MIN_VALUE;
            return AbstractC6920e.m30366l(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m30391a(InterfaceC6918c interfaceC6918c, InterfaceC1875e interfaceC1875e) {
        b bVar;
        C6099B c6099b;
        C7044a e7;
        InterfaceC6919d interfaceC6919d;
        if (interfaceC1875e instanceof b) {
            bVar = (b) interfaceC1875e;
            int i7 = bVar.f27855d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f27855d = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC1875e);
            }
        } else {
            bVar = new b(interfaceC1875e);
        }
        Object obj = bVar.f27854c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = bVar.f27855d;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            C6099B c6099b2 = new C6099B();
            c6099b2.f23859a = AbstractC7056m.f28204a;
            InterfaceC6919d aVar = new a(c6099b2);
            try {
                bVar.f27852a = c6099b2;
                bVar.f27853b = aVar;
                bVar.f27855d = 1;
                if (interfaceC6918c.mo7891a(aVar, bVar) == objE) {
                    return objE;
                }
                c6099b = c6099b2;
            } catch (C7044a e8) {
                c6099b = c6099b2;
                e7 = e8;
                interfaceC6919d = aVar;
                AbstractC7053j.m31140a(e7, interfaceC6919d);
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC6919d = (a) bVar.f27853b;
            c6099b = (C6099B) bVar.f27852a;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (C7044a e9) {
                e7 = e9;
                AbstractC7053j.m31140a(e7, interfaceC6919d);
            }
        }
        Object obj2 = c6099b.f23859a;
        if (obj2 != AbstractC7056m.f28204a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m30392b(InterfaceC6918c interfaceC6918c, InterfaceC1875e interfaceC1875e) {
        d dVar;
        C6099B c6099b;
        C7044a e7;
        InterfaceC6919d interfaceC6919d;
        if (interfaceC1875e instanceof d) {
            dVar = (d) interfaceC1875e;
            int i7 = dVar.f27860d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.f27860d = i7 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC1875e);
            }
        } else {
            dVar = new d(interfaceC1875e);
        }
        Object obj = dVar.f27859c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = dVar.f27860d;
        if (i8 == 0) {
            AbstractC1437o.m6082b(obj);
            C6099B c6099b2 = new C6099B();
            InterfaceC6919d cVar = new c(c6099b2);
            try {
                dVar.f27857a = c6099b2;
                dVar.f27858b = cVar;
                dVar.f27860d = 1;
                if (interfaceC6918c.mo7891a(cVar, dVar) == objE) {
                    return objE;
                }
                c6099b = c6099b2;
            } catch (C7044a e8) {
                c6099b = c6099b2;
                e7 = e8;
                interfaceC6919d = cVar;
                AbstractC7053j.m31140a(e7, interfaceC6919d);
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC6919d = (c) dVar.f27858b;
            c6099b = (C6099B) dVar.f27857a;
            try {
                AbstractC1437o.m6082b(obj);
            } catch (C7044a e9) {
                e7 = e9;
                AbstractC7053j.m31140a(e7, interfaceC6919d);
            }
        }
        return c6099b.f23859a;
    }
}
