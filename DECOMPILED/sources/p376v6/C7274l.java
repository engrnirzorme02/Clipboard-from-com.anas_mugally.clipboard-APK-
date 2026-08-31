package p376v6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C6099B;
import p336q6.AbstractC6856l;

/* JADX INFO: renamed from: v6.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7274l {

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f29094b = AtomicReferenceFieldUpdater.newUpdater(C7274l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29095c = AtomicIntegerFieldUpdater.newUpdater(C7274l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29096d = AtomicIntegerFieldUpdater.newUpdater(C7274l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f29097e = AtomicIntegerFieldUpdater.newUpdater(C7274l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a */
    private final AtomicReferenceArray f29098a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: b */
    private final AbstractRunnableC7270h m32242b(AbstractRunnableC7270h abstractRunnableC7270h) {
        if (m32245e() == 127) {
            return abstractRunnableC7270h;
        }
        if (abstractRunnableC7270h.f29085b) {
            f29097e.incrementAndGet(this);
        }
        int i7 = f29095c.get(this) & 127;
        while (this.f29098a.get(i7) != null) {
            Thread.yield();
        }
        this.f29098a.lazySet(i7, abstractRunnableC7270h);
        f29095c.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final void m32243c(AbstractRunnableC7270h abstractRunnableC7270h) {
        if (abstractRunnableC7270h == null || !abstractRunnableC7270h.f29085b) {
            return;
        }
        f29097e.decrementAndGet(this);
    }

    /* JADX INFO: renamed from: e */
    private final int m32245e() {
        return f29095c.get(this) - f29096d.get(this);
    }

    /* JADX INFO: renamed from: m */
    private final AbstractRunnableC7270h m32249m() {
        AbstractRunnableC7270h abstractRunnableC7270h;
        while (true) {
            int i7 = f29096d.get(this);
            if (i7 - f29095c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (f29096d.compareAndSet(this, i7, i7 + 1) && (abstractRunnableC7270h = (AbstractRunnableC7270h) this.f29098a.getAndSet(i8, null)) != null) {
                m32243c(abstractRunnableC7270h);
                return abstractRunnableC7270h;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final boolean m32250n(C7266d c7266d) {
        AbstractRunnableC7270h abstractRunnableC7270hM32249m = m32249m();
        if (abstractRunnableC7270hM32249m == null) {
            return false;
        }
        c7266d.m31487a(abstractRunnableC7270hM32249m);
        return true;
    }

    /* JADX INFO: renamed from: o */
    private final AbstractRunnableC7270h m32251o(boolean z7) {
        AbstractRunnableC7270h abstractRunnableC7270h;
        do {
            abstractRunnableC7270h = (AbstractRunnableC7270h) f29094b.get(this);
            if (abstractRunnableC7270h == null || abstractRunnableC7270h.f29085b != z7) {
                int i7 = f29096d.get(this);
                int i8 = f29095c.get(this);
                while (i7 != i8) {
                    if (z7 && f29097e.get(this) == 0) {
                        return null;
                    }
                    i8--;
                    AbstractRunnableC7270h abstractRunnableC7270hM32253q = m32253q(i8, z7);
                    if (abstractRunnableC7270hM32253q != null) {
                        return abstractRunnableC7270hM32253q;
                    }
                }
                return null;
            }
        } while (!AbstractC2404b.m10339a(f29094b, this, abstractRunnableC7270h, null));
        return abstractRunnableC7270h;
    }

    /* JADX INFO: renamed from: p */
    private final AbstractRunnableC7270h m32252p(int i7) {
        int i8 = f29096d.get(this);
        int i9 = f29095c.get(this);
        boolean z7 = i7 == 1;
        while (i8 != i9) {
            if (z7 && f29097e.get(this) == 0) {
                return null;
            }
            int i10 = i8 + 1;
            AbstractRunnableC7270h abstractRunnableC7270hM32253q = m32253q(i8, z7);
            if (abstractRunnableC7270hM32253q != null) {
                return abstractRunnableC7270hM32253q;
            }
            i8 = i10;
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    private final AbstractRunnableC7270h m32253q(int i7, boolean z7) {
        int i8 = i7 & 127;
        AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) this.f29098a.get(i8);
        if (abstractRunnableC7270h == null || abstractRunnableC7270h.f29085b != z7 || !AbstractC6856l.m30045a(this.f29098a, i8, abstractRunnableC7270h, null)) {
            return null;
        }
        if (z7) {
            f29097e.decrementAndGet(this);
        }
        return abstractRunnableC7270h;
    }

    /* JADX INFO: renamed from: s */
    private final long m32254s(int i7, C6099B c6099b) {
        AbstractRunnableC7270h abstractRunnableC7270h;
        do {
            abstractRunnableC7270h = (AbstractRunnableC7270h) f29094b.get(this);
            if (abstractRunnableC7270h == null) {
                return -2L;
            }
            if (((abstractRunnableC7270h.f29085b ? 1 : 2) & i7) == 0) {
                return -2L;
            }
            long jMo32236a = AbstractC7272j.f29092f.mo32236a() - abstractRunnableC7270h.f29084a;
            long j7 = AbstractC7272j.f29088b;
            if (jMo32236a < j7) {
                return j7 - jMo32236a;
            }
        } while (!AbstractC2404b.m10339a(f29094b, this, abstractRunnableC7270h, null));
        c6099b.f23859a = abstractRunnableC7270h;
        return -1L;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC7270h m32255a(AbstractRunnableC7270h abstractRunnableC7270h, boolean z7) {
        if (z7) {
            return m32242b(abstractRunnableC7270h);
        }
        AbstractRunnableC7270h abstractRunnableC7270h2 = (AbstractRunnableC7270h) f29094b.getAndSet(this, abstractRunnableC7270h);
        if (abstractRunnableC7270h2 == null) {
            return null;
        }
        return m32242b(abstractRunnableC7270h2);
    }

    /* JADX INFO: renamed from: i */
    public final int m32256i() {
        return f29094b.get(this) != null ? m32245e() + 1 : m32245e();
    }

    /* JADX INFO: renamed from: j */
    public final void m32257j(C7266d c7266d) {
        AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) f29094b.getAndSet(this, null);
        if (abstractRunnableC7270h != null) {
            c7266d.m31487a(abstractRunnableC7270h);
        }
        while (m32250n(c7266d)) {
        }
    }

    /* JADX INFO: renamed from: k */
    public final AbstractRunnableC7270h m32258k() {
        AbstractRunnableC7270h abstractRunnableC7270h = (AbstractRunnableC7270h) f29094b.getAndSet(this, null);
        return abstractRunnableC7270h == null ? m32249m() : abstractRunnableC7270h;
    }

    /* JADX INFO: renamed from: l */
    public final AbstractRunnableC7270h m32259l() {
        return m32251o(true);
    }

    /* JADX INFO: renamed from: r */
    public final long m32260r(int i7, C6099B c6099b) {
        AbstractRunnableC7270h abstractRunnableC7270hM32249m = i7 == 3 ? m32249m() : m32252p(i7);
        if (abstractRunnableC7270hM32249m == null) {
            return m32254s(i7, c6099b);
        }
        c6099b.f23859a = abstractRunnableC7270hM32249m;
        return -1L;
    }
}
