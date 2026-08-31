package p360t6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6122r;
import p318o6.AbstractC6633S;

/* JADX INFO: renamed from: t6.o */
/* JADX INFO: loaded from: classes.dex */
public class C7131o {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28430a = AtomicReferenceFieldUpdater.newUpdater(C7131o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28431b = AtomicReferenceFieldUpdater.newUpdater(C7131o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28432c = AtomicReferenceFieldUpdater.newUpdater(C7131o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX INFO: renamed from: g */
    private final C7131o m31470g() {
        C7131o c7131o;
        Object obj;
        while (true) {
            C7131o c7131o2 = (C7131o) f28431b.get(this);
            c7131o = c7131o2;
            while (true) {
                C7131o c7131o3 = null;
                while (true) {
                    obj = f28430a.get(c7131o);
                    if (obj == this) {
                        if (c7131o2 != c7131o && !AbstractC2404b.m10339a(f28431b, this, c7131o2, c7131o)) {
                            break;
                        }
                        break;
                    }
                    if (mo31469q()) {
                        return null;
                    }
                    if (!(obj instanceof C7140x)) {
                        AbstractC6118n.m27185c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        c7131o3 = c7131o;
                        c7131o = (C7131o) obj;
                    } else {
                        if (c7131o3 != null) {
                            break;
                        }
                        c7131o = (C7131o) f28431b.get(c7131o);
                    }
                }
                if (!AbstractC2404b.m10339a(f28430a, c7131o3, c7131o, ((C7140x) obj).f28448a)) {
                    break;
                }
                c7131o = c7131o3;
            }
        }
        return c7131o;
    }

    /* JADX INFO: renamed from: h */
    private final C7131o m31471h(C7131o c7131o) {
        while (c7131o.mo31469q()) {
            c7131o = (C7131o) f28431b.get(c7131o);
        }
        return c7131o;
    }

    /* JADX INFO: renamed from: i */
    private final void m31472i(C7131o c7131o) {
        C7131o c7131o2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28431b;
        do {
            c7131o2 = (C7131o) atomicReferenceFieldUpdater.get(c7131o);
            if (m31481j() != c7131o) {
                return;
            }
        } while (!AbstractC2404b.m10339a(f28431b, c7131o, c7131o2, this));
        if (mo31469q()) {
            c7131o.m31470g();
        }
    }

    /* JADX INFO: renamed from: t */
    private final C7140x m31476t() {
        C7140x c7140x = (C7140x) f28432c.get(this);
        if (c7140x != null) {
            return c7140x;
        }
        C7140x c7140x2 = new C7140x(this);
        f28432c.set(this, c7140x2);
        return c7140x2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31477b(C7131o c7131o, int i7) {
        C7131o c7131oM31483m;
        do {
            c7131oM31483m = m31483m();
            if (c7131oM31483m instanceof C7129m) {
                return (((C7129m) c7131oM31483m).f28429d & i7) == 0 && c7131oM31483m.m31477b(c7131o, i7);
            }
        } while (!c7131oM31483m.m31478c(c7131o, this));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31478c(C7131o c7131o, C7131o c7131o2) {
        f28431b.set(c7131o, this);
        f28430a.set(c7131o, c7131o2);
        if (!AbstractC2404b.m10339a(f28430a, this, c7131o2, c7131o)) {
            return false;
        }
        c7131o.m31472i(c7131o2);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m31479e(C7131o c7131o) {
        f28431b.set(c7131o, this);
        f28430a.set(c7131o, this);
        while (m31481j() == this) {
            if (AbstractC2404b.m10339a(f28430a, this, this, c7131o)) {
                c7131o.m31472i(this);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m31480f(int i7) {
        m31477b(new C7129m(i7), i7);
    }

    /* JADX INFO: renamed from: j */
    public final Object m31481j() {
        return f28430a.get(this);
    }

    /* JADX INFO: renamed from: l */
    public final C7131o m31482l() {
        C7131o c7131o;
        Object objM31481j = m31481j();
        C7140x c7140x = objM31481j instanceof C7140x ? (C7140x) objM31481j : null;
        if (c7140x != null && (c7131o = c7140x.f28448a) != null) {
            return c7131o;
        }
        AbstractC6118n.m27185c(objM31481j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C7131o) objM31481j;
    }

    /* JADX INFO: renamed from: m */
    public final C7131o m31483m() {
        C7131o c7131oM31470g = m31470g();
        return c7131oM31470g == null ? m31471h((C7131o) f28431b.get(this)) : c7131oM31470g;
    }

    /* JADX INFO: renamed from: q */
    public boolean mo31469q() {
        return m31481j() instanceof C7140x;
    }

    /* JADX INFO: renamed from: r */
    public boolean m31484r() {
        return m31485s() == null;
    }

    /* JADX INFO: renamed from: s */
    public final C7131o m31485s() {
        Object objM31481j;
        C7131o c7131o;
        do {
            objM31481j = m31481j();
            if (objM31481j instanceof C7140x) {
                return ((C7140x) objM31481j).f28448a;
            }
            if (objM31481j == this) {
                return (C7131o) objM31481j;
            }
            AbstractC6118n.m27185c(objM31481j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c7131o = (C7131o) objM31481j;
        } while (!AbstractC2404b.m10339a(f28430a, this, objM31481j, c7131o.m31476t()));
        c7131o.m31470g();
        return null;
    }

    public String toString() {
        return new AbstractC6122r(this) { // from class: t6.o.a
            @Override // p286k6.InterfaceC6080f
            public Object get() {
                return AbstractC6633S.m28108a(this.receiver);
            }
        } + '@' + AbstractC6633S.m28109b(this);
    }
}
