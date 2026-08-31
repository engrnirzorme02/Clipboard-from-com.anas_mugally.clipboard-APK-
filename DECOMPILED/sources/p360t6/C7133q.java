package p360t6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6112h;

/* JADX INFO: renamed from: t6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7133q {

    /* JADX INFO: renamed from: e */
    public static final a f28434e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28435f = AtomicReferenceFieldUpdater.newUpdater(C7133q.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f28436g = AtomicLongFieldUpdater.newUpdater(C7133q.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    public static final C7104D f28437h = new C7104D("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a */
    private final int f28438a;

    /* JADX INFO: renamed from: b */
    private final boolean f28439b;

    /* JADX INFO: renamed from: c */
    private final int f28440c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AtomicReferenceArray f28441d;

    /* JADX INFO: renamed from: t6.q$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m31505a(long j7) {
            return (j7 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final long m31506b(long j7, int i7) {
            return m31508d(j7, 1073741823L) | ((long) i7);
        }

        /* JADX INFO: renamed from: c */
        public final long m31507c(long j7, int i7) {
            return m31508d(j7, 1152921503533105152L) | (((long) i7) << 30);
        }

        /* JADX INFO: renamed from: d */
        public final long m31508d(long j7, long j8) {
            return j7 & (~j8);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: t6.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f28442a;

        public b(int i7) {
            this.f28442a = i7;
        }
    }

    public C7133q(int i7, boolean z7) {
        this.f28438a = i7;
        this.f28439b = z7;
        int i8 = i7 - 1;
        this.f28440c = i8;
        this.f28441d = new AtomicReferenceArray(i7);
        if (i8 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i8) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: b */
    private final C7133q m31491b(long j7) {
        C7133q c7133q = new C7133q(this.f28438a * 2, this.f28439b);
        int i7 = (int) (1073741823 & j7);
        int i8 = (int) ((1152921503533105152L & j7) >> 30);
        while (true) {
            int i9 = this.f28440c;
            if ((i7 & i9) == (i9 & i8)) {
                f28436g.set(c7133q, f28434e.m31508d(j7, 1152921504606846976L));
                return c7133q;
            }
            Object bVar = m31494f().get(this.f28440c & i7);
            if (bVar == null) {
                bVar = new b(i7);
            }
            c7133q.m31494f().set(c7133q.f28440c & i7, bVar);
            i7++;
        }
    }

    /* JADX INFO: renamed from: c */
    private final C7133q m31492c(long j7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28435f;
        while (true) {
            C7133q c7133q = (C7133q) atomicReferenceFieldUpdater.get(this);
            if (c7133q != null) {
                return c7133q;
            }
            AbstractC2404b.m10339a(f28435f, this, null, m31491b(j7));
        }
    }

    /* JADX INFO: renamed from: e */
    private final C7133q m31493e(int i7, Object obj) {
        Object obj2 = m31494f().get(this.f28440c & i7);
        if (!(obj2 instanceof b) || ((b) obj2).f28442a != i7) {
            return null;
        }
        m31494f().set(i7 & this.f28440c, obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ AtomicReferenceArray m31494f() {
        return this.f28441d;
    }

    /* JADX INFO: renamed from: k */
    private final long m31497k() {
        long j7;
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28436g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 1152921504606846976L) != 0) {
                return j7;
            }
            j8 = 1152921504606846976L | j7;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j8));
        return j8;
    }

    /* JADX INFO: renamed from: n */
    private final C7133q m31498n(int i7, int i8) {
        long j7;
        int i9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28436g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            i9 = (int) (1073741823 & j7);
            if ((1152921504606846976L & j7) != 0) {
                return m31503l();
            }
        } while (!f28436g.compareAndSet(this, j7, f28434e.m31506b(j7, i8)));
        m31494f().set(this.f28440c & i9, null);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final int m31499a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28436g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j7) != 0) {
                return f28434e.m31505a(j7);
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = (int) ((1152921503533105152L & j7) >> 30);
            int i9 = this.f28440c;
            if (((i8 + 2) & i9) == (i7 & i9)) {
                return 1;
            }
            if (!this.f28439b && m31494f().get(i8 & i9) != null) {
                int i10 = this.f28438a;
                if (i10 < 1024 || ((i8 - i7) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            } else if (f28436g.compareAndSet(this, j7, f28434e.m31507c(j7, (i8 + 1) & 1073741823))) {
                m31494f().set(i8 & i9, obj);
                C7133q c7133qM31493e = this;
                while ((f28436g.get(c7133qM31493e) & 1152921504606846976L) != 0 && (c7133qM31493e = c7133qM31493e.m31503l().m31493e(i8, obj)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m31500d() {
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28436g;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if ((j7 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j7) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, 2305843009213693952L | j7));
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m31501g() {
        long j7 = f28436g.get(this);
        return (((int) ((j7 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j7))) & 1073741823;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m31502j() {
        long j7 = f28436g.get(this);
        return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: l */
    public final C7133q m31503l() {
        return m31492c(m31497k());
    }

    /* JADX INFO: renamed from: m */
    public final Object m31504m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f28436g;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j7) != 0) {
                return f28437h;
            }
            int i7 = (int) (1073741823 & j7);
            int i8 = this.f28440c;
            if ((((int) ((1152921503533105152L & j7) >> 30)) & i8) == (i8 & i7)) {
                return null;
            }
            Object obj = m31494f().get(this.f28440c & i7);
            if (obj == null) {
                if (this.f28439b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i9 = (i7 + 1) & 1073741823;
                if (f28436g.compareAndSet(this, j7, f28434e.m31506b(j7, i9))) {
                    m31494f().set(this.f28440c & i7, null);
                    return obj;
                }
                if (this.f28439b) {
                    C7133q c7133qM31498n = this;
                    do {
                        c7133qM31498n = c7133qM31498n.m31498n(i7, i9);
                    } while (c7133qM31498n != null);
                    return obj;
                }
            }
        }
    }
}
