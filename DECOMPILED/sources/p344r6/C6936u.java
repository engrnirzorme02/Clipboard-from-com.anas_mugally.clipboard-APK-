package p344r6;

import androidx.lifecycle.AbstractC2636b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.C6682p;
import p352s6.AbstractC7046c;
import p352s6.AbstractC7047d;
import p360t6.AbstractC7119c;

/* JADX INFO: renamed from: r6.u */
/* JADX INFO: loaded from: classes.dex */
final class C6936u extends AbstractC7047d {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f27875a = new AtomicReference(null);

    @Override // p352s6.AbstractC7047d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo30407a(C6934s c6934s) {
        if (AbstractC7119c.m31444a(this.f27875a) != null) {
            return false;
        }
        AbstractC7119c.m31445b(this.f27875a, AbstractC6935t.f27873a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final Object m30410e(InterfaceC1875e interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        if (!AbstractC2636b.m12603a(this.f27875a, AbstractC6935t.f27873a, c6682p)) {
            C1436n.a aVar = C1436n.f4958b;
            c6682p.resumeWith(C1436n.m6073b(C1444v.f4971a));
        }
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y == AbstractC2005b.m8369e() ? objM28273y : C1444v.f4971a;
    }

    @Override // p352s6.AbstractC7047d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC1875e[] mo30408b(C6934s c6934s) {
        AbstractC7119c.m31445b(this.f27875a, null);
        return AbstractC7046c.f28185a;
    }

    /* JADX INFO: renamed from: g */
    public final void m30412g() {
        AtomicReference atomicReference = this.f27875a;
        while (true) {
            Object objM31444a = AbstractC7119c.m31444a(atomicReference);
            if (objM31444a == null || objM31444a == AbstractC6935t.f27874b) {
                return;
            }
            if (objM31444a == AbstractC6935t.f27873a) {
                if (AbstractC2636b.m12603a(this.f27875a, objM31444a, AbstractC6935t.f27874b)) {
                    return;
                }
            } else if (AbstractC2636b.m12603a(this.f27875a, objM31444a, AbstractC6935t.f27873a)) {
                C1436n.a aVar = C1436n.f4958b;
                ((C6682p) objM31444a).resumeWith(C1436n.m6073b(C1444v.f4971a));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m30413h() {
        Object andSet = this.f27875a.getAndSet(AbstractC6935t.f27873a);
        AbstractC6118n.m27184b(andSet);
        return andSet == AbstractC6935t.f27874b;
    }
}
