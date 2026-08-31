package p360t6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.InterfaceC6090e;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6606E;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6633S;
import p318o6.AbstractC6650a0;
import p318o6.AbstractC6669i0;
import p318o6.C6638U0;
import p318o6.C6682p;
import p318o6.InterfaceC6678n;

/* JADX INFO: renamed from: t6.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7124h extends AbstractC6650a0 implements InterfaceC6090e, InterfaceC1875e {

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28413s = AtomicReferenceFieldUpdater.newUpdater(C7124h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public final AbstractC6618K f28414d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1875e f28415e;

    /* JADX INFO: renamed from: f */
    public Object f28416f;

    /* JADX INFO: renamed from: r */
    public final Object f28417r;

    public C7124h(AbstractC6618K abstractC6618K, InterfaceC1875e interfaceC1875e) {
        super(-1);
        this.f28414d = abstractC6618K;
        this.f28415e = interfaceC1875e;
        this.f28416f = AbstractC7125i.f28418a;
        this.f28417r = AbstractC7111K.m31408g(getContext());
    }

    /* JADX INFO: renamed from: p */
    private final C6682p m31449p() {
        Object obj = f28413s.get(this);
        if (obj instanceof C6682p) {
            return (C6682p) obj;
        }
        return null;
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: g */
    public InterfaceC1875e mo28150g() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6090e
    public InterfaceC6090e getCallerFrame() {
        InterfaceC1875e interfaceC1875e = this.f28415e;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    @Override // p173W5.InterfaceC1875e
    public InterfaceC1879i getContext() {
        return this.f28415e.getContext();
    }

    @Override // p318o6.AbstractC6650a0
    /* JADX INFO: renamed from: m */
    public Object mo28154m() {
        Object obj = this.f28416f;
        this.f28416f = AbstractC7125i.f28418a;
        return obj;
    }

    /* JADX INFO: renamed from: n */
    public final void m31451n() {
        while (f28413s.get(this) == AbstractC7125i.f28419b) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final C6682p m31452o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28413s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f28413s.set(this, AbstractC7125i.f28419b);
                return null;
            }
            if (obj instanceof C6682p) {
                if (AbstractC2404b.m10339a(f28413s, this, obj, AbstractC7125i.f28419b)) {
                    return (C6682p) obj;
                }
            } else if (obj != AbstractC7125i.f28419b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m31453r() {
        return f28413s.get(this) != null;
    }

    @Override // p173W5.InterfaceC1875e
    public void resumeWith(Object obj) {
        Object objM27978b = AbstractC6606E.m27978b(obj);
        if (this.f28414d.mo28091R0(getContext())) {
            this.f28416f = objM27978b;
            this.f24935c = 0;
            this.f28414d.mo28090Q0(getContext(), this);
            return;
        }
        AbstractC6669i0 abstractC6669i0M28128b = C6638U0.f24927a.m28128b();
        if (abstractC6669i0M28128b.m28194b1()) {
            this.f28416f = objM27978b;
            this.f24935c = 0;
            abstractC6669i0M28128b.m28191X0(this);
            return;
        }
        abstractC6669i0M28128b.m28193Z0(true);
        try {
            InterfaceC1879i context = getContext();
            Object objM31410i = AbstractC7111K.m31410i(context, this.f28417r);
            try {
                this.f28415e.resumeWith(obj);
                C1444v c1444v = C1444v.f4971a;
                AbstractC7111K.m31407f(context, objM31410i);
                while (abstractC6669i0M28128b.m28197e1()) {
                }
            } catch (Throwable th) {
                AbstractC7111K.m31407f(context, objM31410i);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m28153k(th2);
            } finally {
                abstractC6669i0M28128b.m28190U0(true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m31454s(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28413s;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7104D c7104d = AbstractC7125i.f28419b;
            if (AbstractC6118n.m27183a(obj, c7104d)) {
                if (AbstractC2404b.m10339a(f28413s, this, c7104d, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC2404b.m10339a(f28413s, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m31455t() {
        m31451n();
        C6682p c6682pM31449p = m31449p();
        if (c6682pM31449p != null) {
            c6682pM31449p.m28272t();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f28414d + ", " + AbstractC6633S.m28110c(this.f28415e) + ']';
    }

    /* JADX INFO: renamed from: u */
    public final Throwable m31456u(InterfaceC6678n interfaceC6678n) {
        C7104D c7104d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28413s;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c7104d = AbstractC7125i.f28419b;
            if (obj != c7104d) {
                if (obj instanceof Throwable) {
                    if (AbstractC2404b.m10339a(f28413s, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC2404b.m10339a(f28413s, this, c7104d, interfaceC6678n));
        return null;
    }
}
