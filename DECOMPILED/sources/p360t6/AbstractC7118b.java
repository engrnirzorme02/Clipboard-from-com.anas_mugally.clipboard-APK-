package p360t6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7118b {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28408a = AtomicReferenceFieldUpdater.newUpdater(AbstractC7118b.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28409b = AtomicReferenceFieldUpdater.newUpdater(AbstractC7118b.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC7118b(AbstractC7118b abstractC7118b) {
        this._prev$volatile = abstractC7118b;
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC7118b m31432d() {
        AbstractC7118b abstractC7118bM31439h = m31439h();
        while (abstractC7118bM31439h != null && abstractC7118bM31439h.mo31378k()) {
            abstractC7118bM31439h = (AbstractC7118b) f28409b.get(abstractC7118bM31439h);
        }
        return abstractC7118bM31439h;
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC7118b m31433e() {
        AbstractC7118b abstractC7118bM31438f;
        AbstractC7118b abstractC7118bM31438f2 = m31438f();
        AbstractC6118n.m27184b(abstractC7118bM31438f2);
        while (abstractC7118bM31438f2.mo31378k() && (abstractC7118bM31438f = abstractC7118bM31438f2.m31438f()) != null) {
            abstractC7118bM31438f2 = abstractC7118bM31438f;
        }
        return abstractC7118bM31438f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Object m31434g() {
        return f28408a.get(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m31437c() {
        f28409b.set(this, null);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC7118b m31438f() {
        Object objM31434g = m31434g();
        if (objM31434g == AbstractC7117a.f28407a) {
            return null;
        }
        return (AbstractC7118b) objM31434g;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC7118b m31439h() {
        return (AbstractC7118b) f28409b.get(this);
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo31378k();

    /* JADX INFO: renamed from: l */
    public final boolean m31440l() {
        return m31438f() == null;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m31441m() {
        return AbstractC2404b.m10339a(f28408a, this, null, AbstractC7117a.f28407a);
    }

    /* JADX INFO: renamed from: n */
    public final void m31442n() {
        Object obj;
        if (m31440l()) {
            return;
        }
        while (true) {
            AbstractC7118b abstractC7118bM31432d = m31432d();
            AbstractC7118b abstractC7118bM31433e = m31433e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28409b;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC7118bM31433e);
            } while (!AbstractC2404b.m10339a(atomicReferenceFieldUpdater, abstractC7118bM31433e, obj, ((AbstractC7118b) obj) == null ? null : abstractC7118bM31432d));
            if (abstractC7118bM31432d != null) {
                f28408a.set(abstractC7118bM31432d, abstractC7118bM31433e);
            }
            if (!abstractC7118bM31433e.mo31378k() || abstractC7118bM31433e.m31440l()) {
                if (abstractC7118bM31432d == null || !abstractC7118bM31432d.mo31378k()) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m31443o(AbstractC7118b abstractC7118b) {
        return AbstractC2404b.m10339a(f28408a, this, null, abstractC7118b);
    }
}
