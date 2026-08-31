package p352s6;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1876f;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6614I;
import p336q6.EnumC6845a;
import p336q6.InterfaceC6866v;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7050g extends AbstractC7048e {

    /* JADX INFO: renamed from: d */
    protected final InterfaceC6918c f28196d;

    /* JADX INFO: renamed from: s6.g$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28197a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f28198b;

        a(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = AbstractC7050g.this.new a(interfaceC1875e);
            aVar.f28198b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6919d, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28197a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6919d interfaceC6919d = (InterfaceC6919d) this.f28198b;
                AbstractC7050g abstractC7050g = AbstractC7050g.this;
                this.f28197a = 1;
                if (abstractC7050g.mo31138n(interfaceC6919d, this) == objE) {
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

    public AbstractC7050g(InterfaceC6918c interfaceC6918c, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        super(interfaceC1879i, i7, enumC6845a);
        this.f28196d = interfaceC6918c;
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ Object m31135k(AbstractC7050g abstractC7050g, InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        if (abstractC7050g.f28187b == -3) {
            InterfaceC1879i context = interfaceC1875e.getContext();
            InterfaceC1879i interfaceC1879iM28082j = AbstractC6614I.m28082j(context, abstractC7050g.f28186a);
            if (AbstractC6118n.m27183a(interfaceC1879iM28082j, context)) {
                Object objMo31138n = abstractC7050g.mo31138n(interfaceC6919d, interfaceC1875e);
                return objMo31138n == AbstractC2005b.m8369e() ? objMo31138n : C1444v.f4971a;
            }
            InterfaceC1876f.b bVar = InterfaceC1876f.f6042h;
            if (AbstractC6118n.m27183a(interfaceC1879iM28082j.get(bVar), context.get(bVar))) {
                Object objM31137m = abstractC7050g.m31137m(interfaceC6919d, interfaceC1879iM28082j, interfaceC1875e);
                return objM31137m == AbstractC2005b.m8369e() ? objM31137m : C1444v.f4971a;
            }
        }
        Object objMo7891a = super.mo7891a(interfaceC6919d, interfaceC1875e);
        return objMo7891a == AbstractC2005b.m8369e() ? objMo7891a : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: l */
    static /* synthetic */ Object m31136l(AbstractC7050g abstractC7050g, InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
        Object objMo31138n = abstractC7050g.mo31138n(new C7062s(interfaceC6866v), interfaceC1875e);
        return objMo31138n == AbstractC2005b.m8369e() ? objMo31138n : C1444v.f4971a;
    }

    /* JADX INFO: renamed from: m */
    private final Object m31137m(InterfaceC6919d interfaceC6919d, InterfaceC1879i interfaceC1879i, InterfaceC1875e interfaceC1875e) {
        return AbstractC7049f.m31133c(interfaceC1879i, AbstractC7049f.m31134d(interfaceC6919d, interfaceC1875e.getContext()), null, new a(null), interfaceC1875e, 4, null);
    }

    @Override // p352s6.AbstractC7048e, p344r6.InterfaceC6918c
    /* JADX INFO: renamed from: a */
    public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        return m31135k(this, interfaceC6919d, interfaceC1875e);
    }

    @Override // p352s6.AbstractC7048e
    /* JADX INFO: renamed from: f */
    protected Object mo30353f(InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
        return m31136l(this, interfaceC6866v, interfaceC1875e);
    }

    /* JADX INFO: renamed from: n */
    protected abstract Object mo31138n(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e);

    @Override // p352s6.AbstractC7048e
    public String toString() {
        return this.f28196d + " -> " + super.toString();
    }
}
