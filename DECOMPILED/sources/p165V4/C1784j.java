package p165V4;

import p158U4.AbstractC1701y;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;
import p351s5.C7039u;

/* JADX INFO: renamed from: V4.j */
/* JADX INFO: loaded from: classes.dex */
public class C1784j implements InterfaceC1790p {

    /* JADX INFO: renamed from: a */
    private C7039u f5849a;

    public C1784j(C7039u c7039u) {
        AbstractC2034b.m8460d(AbstractC1701y.m7164B(c7039u), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f5849a = c7039u;
    }

    /* JADX INFO: renamed from: e */
    private double m7485e() {
        if (AbstractC1701y.m7194v(this.f5849a)) {
            return this.f5849a.m31037p0();
        }
        if (AbstractC1701y.m7195w(this.f5849a)) {
            return this.f5849a.m31039r0();
        }
        throw AbstractC2034b.m8457a("Expected 'operand' to be of Number type, but was " + this.f5849a.getClass().getCanonicalName(), new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    private long m7486f() {
        if (AbstractC1701y.m7194v(this.f5849a)) {
            return (long) this.f5849a.m31037p0();
        }
        if (AbstractC1701y.m7195w(this.f5849a)) {
            return this.f5849a.m31039r0();
        }
        throw AbstractC2034b.m8457a("Expected 'operand' to be of Number type, but was " + this.f5849a.getClass().getCanonicalName(), new Object[0]);
    }

    /* JADX INFO: renamed from: g */
    private long m7487g(long j7, long j8) {
        long j9 = j7 + j8;
        if (((j7 ^ j9) & (j8 ^ j9)) >= 0) {
            return j9;
        }
        return j9 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // p165V4.InterfaceC1790p
    /* JADX INFO: renamed from: a */
    public C7039u mo7447a(C7039u c7039u, C1774s c1774s) {
        C7039u c7039uM7488c = m7488c(c7039u);
        if (AbstractC1701y.m7195w(c7039uM7488c) && AbstractC1701y.m7195w(this.f5849a)) {
            return (C7039u) C7039u.m31032y0().m31049D(m7487g(c7039uM7488c.m31039r0(), m7486f())).m23721o();
        }
        if (AbstractC1701y.m7195w(c7039uM7488c)) {
            return (C7039u) C7039u.m31032y0().m31047B(c7039uM7488c.m31039r0() + m7485e()).m23721o();
        }
        AbstractC2034b.m8460d(AbstractC1701y.m7194v(c7039uM7488c), "Expected NumberValue to be of type DoubleValue, but was ", c7039u.getClass().getCanonicalName());
        return (C7039u) C7039u.m31032y0().m31047B(c7039uM7488c.m31037p0() + m7485e()).m23721o();
    }

    @Override // p165V4.InterfaceC1790p
    /* JADX INFO: renamed from: b */
    public C7039u mo7448b(C7039u c7039u, C7039u c7039u2) {
        return c7039u2;
    }

    /* JADX INFO: renamed from: c */
    public C7039u m7488c(C7039u c7039u) {
        return AbstractC1701y.m7164B(c7039u) ? c7039u : (C7039u) C7039u.m31032y0().m31049D(0L).m23721o();
    }

    /* JADX INFO: renamed from: d */
    public C7039u m7489d() {
        return this.f5849a;
    }
}
