package p336q6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p318o6.InterfaceC6654b1;
import p360t6.AbstractC7101A;
import p360t6.AbstractC7139w;

/* JADX INFO: renamed from: q6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6857m extends AbstractC7101A {

    /* JADX INFO: renamed from: e */
    private final C6849e f27484e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ AtomicReferenceArray f27485f;

    public C6857m(long j7, C6857m c6857m, C6849e c6849e, int i7) {
        super(j7, c6857m, i7);
        this.f27484e = c6849e;
        this.f27485f = new AtomicReferenceArray(AbstractC6850f.f27457b * 2);
    }

    /* JADX INFO: renamed from: E */
    private final void m30046E(int i7, Object obj) {
        m30047z().set(i7 * 2, obj);
    }

    /* JADX INFO: renamed from: z */
    private final /* synthetic */ AtomicReferenceArray m30047z() {
        return this.f27485f;
    }

    /* JADX INFO: renamed from: A */
    public final Object m30048A(int i7) {
        return m30047z().get(i7 * 2);
    }

    /* JADX INFO: renamed from: B */
    public final Object m30049B(int i7) {
        return m30047z().get((i7 * 2) + 1);
    }

    /* JADX INFO: renamed from: C */
    public final void m30050C(int i7, boolean z7) {
        if (z7) {
            m30059y().m29975b1((this.f28391c * ((long) AbstractC6850f.f27457b)) + ((long) i7));
        }
        m31380t();
    }

    /* JADX INFO: renamed from: D */
    public final Object m30051D(int i7) {
        Object objM30048A = m30048A(i7);
        m30057w(i7);
        return objM30048A;
    }

    /* JADX INFO: renamed from: F */
    public final void m30052F(int i7, Object obj) {
        m30047z().set((i7 * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: G */
    public final void m30053G(int i7, Object obj) {
        m30046E(i7, obj);
    }

    @Override // p360t6.AbstractC7101A
    /* JADX INFO: renamed from: r */
    public int mo30054r() {
        return AbstractC6850f.f27457b;
    }

    @Override // p360t6.AbstractC7101A
    /* JADX INFO: renamed from: s */
    public void mo30055s(int i7, Throwable th, InterfaceC1879i interfaceC1879i) {
        InterfaceC5367l interfaceC5367l;
        InterfaceC5367l interfaceC5367l2;
        int i8 = AbstractC6850f.f27457b;
        boolean z7 = i7 >= i8;
        if (z7) {
            i7 -= i8;
        }
        Object objM30048A = m30048A(i7);
        while (true) {
            Object objM30049B = m30049B(i7);
            if ((objM30049B instanceof InterfaceC6654b1) || (objM30049B instanceof C6869y)) {
                if (m30056v(i7, objM30049B, z7 ? AbstractC6850f.f27465j : AbstractC6850f.f27466k)) {
                    m30057w(i7);
                    m30050C(i7, !z7);
                    if (!z7 || (interfaceC5367l = m30059y().f27451b) == null) {
                        return;
                    }
                    AbstractC7139w.m31515a(interfaceC5367l, objM30048A, interfaceC1879i);
                    return;
                }
            } else {
                if (objM30049B == AbstractC6850f.f27465j || objM30049B == AbstractC6850f.f27466k) {
                    break;
                }
                if (objM30049B != AbstractC6850f.f27462g && objM30049B != AbstractC6850f.f27461f) {
                    if (objM30049B == AbstractC6850f.f27464i || objM30049B == AbstractC6850f.f27459d || objM30049B == AbstractC6850f.m30025z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM30049B).toString());
                }
            }
        }
        m30057w(i7);
        if (!z7 || (interfaceC5367l2 = m30059y().f27451b) == null) {
            return;
        }
        AbstractC7139w.m31515a(interfaceC5367l2, objM30048A, interfaceC1879i);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m30056v(int i7, Object obj, Object obj2) {
        return AbstractC6856l.m30045a(m30047z(), (i7 * 2) + 1, obj, obj2);
    }

    /* JADX INFO: renamed from: w */
    public final void m30057w(int i7) {
        m30046E(i7, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m30058x(int i7, Object obj) {
        return m30047z().getAndSet((i7 * 2) + 1, obj);
    }

    /* JADX INFO: renamed from: y */
    public final C6849e m30059y() {
        C6849e c6849e = this.f27484e;
        AbstractC6118n.m27184b(c6849e);
        return c6849e;
    }
}
