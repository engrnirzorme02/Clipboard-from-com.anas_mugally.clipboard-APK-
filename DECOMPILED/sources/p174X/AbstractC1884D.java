package p174X;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.AbstractC6702z;
import p318o6.InterfaceC6698x;
import p392x6.AbstractC7425g;
import p392x6.InterfaceC7419a;

/* JADX INFO: renamed from: X.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1884D {

    /* JADX INFO: renamed from: a */
    private final InterfaceC7419a f6058a = AbstractC7425g.m32877b(false, 1, null);

    /* JADX INFO: renamed from: b */
    private final InterfaceC6698x f6059b = AbstractC6702z.m28298b(null, 1, null);

    /* JADX INFO: renamed from: X.D$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f6060a;

        /* JADX INFO: renamed from: b */
        Object f6061b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f6062c;

        /* JADX INFO: renamed from: e */
        int f6064e;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f6062c = obj;
            this.f6064e |= Integer.MIN_VALUE;
            return AbstractC1884D.this.m7802c(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m7800a(InterfaceC1875e interfaceC1875e) {
        Object objAwait = this.f6059b.await(interfaceC1875e);
        return objAwait == AbstractC2005b.m8369e() ? objAwait : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo7801b(InterfaceC1875e interfaceC1875e);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7802c(InterfaceC1875e interfaceC1875e) throws Throwable {
        a aVar;
        InterfaceC7419a interfaceC7419a;
        AbstractC1884D abstractC1884D;
        InterfaceC7419a interfaceC7419a2;
        Throwable th;
        AbstractC1884D abstractC1884D2;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f6064e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f6064e = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f6062c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f6064e;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                if (this.f6059b.isCompleted()) {
                    return C1444v.f4971a;
                }
                interfaceC7419a = this.f6058a;
                aVar.f6060a = this;
                aVar.f6061b = interfaceC7419a;
                aVar.f6064e = 1;
                if (interfaceC7419a.mo32856d(null, aVar) != objE) {
                    abstractC1884D = this;
                }
                return objE;
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7419a2 = (InterfaceC7419a) aVar.f6061b;
                abstractC1884D2 = (AbstractC1884D) aVar.f6060a;
                try {
                    AbstractC1437o.m6082b(obj);
                    InterfaceC6698x interfaceC6698x = abstractC1884D2.f6059b;
                    C1444v c1444v = C1444v.f4971a;
                    interfaceC6698x.mo28289p0(c1444v);
                    interfaceC7419a2.mo32855c(null);
                    return c1444v;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC7419a2.mo32855c(null);
                    throw th;
                }
            }
            InterfaceC7419a interfaceC7419a3 = (InterfaceC7419a) aVar.f6061b;
            abstractC1884D = (AbstractC1884D) aVar.f6060a;
            AbstractC1437o.m6082b(obj);
            interfaceC7419a = interfaceC7419a3;
            if (abstractC1884D.f6059b.isCompleted()) {
                C1444v c1444v2 = C1444v.f4971a;
                interfaceC7419a.mo32855c(null);
                return c1444v2;
            }
            aVar.f6060a = abstractC1884D;
            aVar.f6061b = interfaceC7419a;
            aVar.f6064e = 2;
            if (abstractC1884D.mo7801b(aVar) != objE) {
                interfaceC7419a2 = interfaceC7419a;
                abstractC1884D2 = abstractC1884D;
                InterfaceC6698x interfaceC6698x2 = abstractC1884D2.f6059b;
                C1444v c1444v3 = C1444v.f4971a;
                interfaceC6698x2.mo28289p0(c1444v3);
                interfaceC7419a2.mo32855c(null);
                return c1444v3;
            }
            return objE;
        } catch (Throwable th3) {
            interfaceC7419a2 = interfaceC7419a;
            th = th3;
            interfaceC7419a2.mo32855c(null);
            throw th;
        }
    }
}
