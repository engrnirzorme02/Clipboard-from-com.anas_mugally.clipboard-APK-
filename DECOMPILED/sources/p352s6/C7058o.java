package p352s6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6601B0;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7058o extends AbstractC6089d implements InterfaceC6919d, InterfaceC6090e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6919d f28207a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1879i f28208b;

    /* JADX INFO: renamed from: c */
    public final int f28209c;

    /* JADX INFO: renamed from: d */
    private InterfaceC1879i f28210d;

    /* JADX INFO: renamed from: e */
    private InterfaceC1875e f28211e;

    public C7058o(InterfaceC6919d interfaceC6919d, InterfaceC1879i interfaceC1879i) {
        super(C7055l.f28202a, C1880j.f6044a);
        this.f28207a = interfaceC6919d;
        this.f28208b = interfaceC1879i;
        this.f28209c = ((Number) interfaceC1879i.fold(0, new InterfaceC5371p() { // from class: s6.n
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(C7058o.m31144k(((Integer) obj).intValue(), (InterfaceC1879i.b) obj2));
            }
        })).intValue();
    }

    /* JADX INFO: renamed from: i */
    private final void m31143i(InterfaceC1879i interfaceC1879i, InterfaceC1879i interfaceC1879i2, Object obj) {
        if (interfaceC1879i2 instanceof C7052i) {
            m31146n((C7052i) interfaceC1879i2, obj);
        }
        AbstractC7061r.m31150b(this, interfaceC1879i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final int m31144k(int i7, InterfaceC1879i.b bVar) {
        return i7 + 1;
    }

    /* JADX INFO: renamed from: m */
    private final Object m31145m(InterfaceC1875e interfaceC1875e, Object obj) {
        InterfaceC1879i context = interfaceC1875e.getContext();
        AbstractC6601B0.m27951h(context);
        InterfaceC1879i interfaceC1879i = this.f28210d;
        if (interfaceC1879i != context) {
            m31143i(context, interfaceC1879i, obj);
            this.f28210d = context;
        }
        this.f28211e = interfaceC1875e;
        InterfaceC5372q interfaceC5372q = AbstractC7059p.f28212a;
        InterfaceC6919d interfaceC6919d = this.f28207a;
        AbstractC6118n.m27185c(interfaceC6919d, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC6118n.m27185c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objMo7830j = interfaceC5372q.mo7830j(interfaceC6919d, obj, this);
        if (!AbstractC6118n.m27183a(objMo7830j, AbstractC2005b.m8369e())) {
            this.f28211e = null;
        }
        return objMo7830j;
    }

    /* JADX INFO: renamed from: n */
    private final void m31146n(C7052i c7052i, Object obj) {
        throw new IllegalStateException(AbstractC6406h.m27540j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c7052i.f28201b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p344r6.InterfaceC6919d
    /* JADX INFO: renamed from: d */
    public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
        try {
            Object objM31145m = m31145m(interfaceC1875e, obj);
            if (objM31145m == AbstractC2005b.m8369e()) {
                AbstractC6093h.m27135c(interfaceC1875e);
            }
            return objM31145m == AbstractC2005b.m8369e() ? objM31145m : C1444v.f4971a;
        } catch (Throwable th) {
            this.f28210d = new C7052i(th, interfaceC1875e.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a, kotlin.coroutines.jvm.internal.InterfaceC6090e
    public InterfaceC6090e getCallerFrame() {
        InterfaceC1875e interfaceC1875e = this.f28211e;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6089d, p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        InterfaceC1879i interfaceC1879i = this.f28210d;
        return interfaceC1879i == null ? C1880j.f6044a : interfaceC1879i;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
    protected Object invokeSuspend(Object obj) {
        Throwable thM6075d = C1436n.m6075d(obj);
        if (thM6075d != null) {
            this.f28210d = new C7052i(thM6075d, getContext());
        }
        InterfaceC1875e interfaceC1875e = this.f28211e;
        if (interfaceC1875e != null) {
            interfaceC1875e.resumeWith(obj);
        }
        return AbstractC2005b.m8369e();
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC6089d, kotlin.coroutines.jvm.internal.AbstractC6086a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
