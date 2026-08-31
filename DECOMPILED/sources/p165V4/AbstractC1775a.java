package p165V4;

import java.util.Collections;
import java.util.List;
import p158U4.AbstractC1701y;
import p164V3.C1774s;
import p351s5.C7019a;
import p351s5.C7039u;

/* JADX INFO: renamed from: V4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1775a implements InterfaceC1790p {

    /* JADX INFO: renamed from: a */
    private final List f5828a;

    /* JADX INFO: renamed from: V4.a$a */
    public static class a extends AbstractC1775a {
        public a(List list) {
            super(list);
        }

        @Override // p165V4.AbstractC1775a
        /* JADX INFO: renamed from: c */
        protected C7039u mo7449c(C7039u c7039u) {
            C7019a.b bVarM7446d = AbstractC1775a.m7446d(c7039u);
            for (C7039u c7039u2 : m7450e()) {
                int i7 = 0;
                while (i7 < bVarM7446d.m30671A()) {
                    if (AbstractC1701y.m7190r(bVarM7446d.m30675z(i7), c7039u2)) {
                        bVarM7446d.m30672B(i7);
                    } else {
                        i7++;
                    }
                }
            }
            return (C7039u) C7039u.m31032y0().m31056x(bVarM7446d).m23721o();
        }
    }

    /* JADX INFO: renamed from: V4.a$b */
    public static class b extends AbstractC1775a {
        public b(List list) {
            super(list);
        }

        @Override // p165V4.AbstractC1775a
        /* JADX INFO: renamed from: c */
        protected C7039u mo7449c(C7039u c7039u) {
            C7019a.b bVarM7446d = AbstractC1775a.m7446d(c7039u);
            for (C7039u c7039u2 : m7450e()) {
                if (!AbstractC1701y.m7189q(bVarM7446d, c7039u2)) {
                    bVarM7446d.m30674y(c7039u2);
                }
            }
            return (C7039u) C7039u.m31032y0().m31056x(bVarM7446d).m23721o();
        }
    }

    AbstractC1775a(List list) {
        this.f5828a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: renamed from: d */
    static C7019a.b m7446d(C7039u c7039u) {
        return AbstractC1701y.m7193u(c7039u) ? (C7019a.b) c7039u.m31034l0().m23710Y() : C7019a.m30666j0();
    }

    @Override // p165V4.InterfaceC1790p
    /* JADX INFO: renamed from: a */
    public C7039u mo7447a(C7039u c7039u, C1774s c1774s) {
        return mo7449c(c7039u);
    }

    @Override // p165V4.InterfaceC1790p
    /* JADX INFO: renamed from: b */
    public C7039u mo7448b(C7039u c7039u, C7039u c7039u2) {
        return mo7449c(c7039u);
    }

    /* JADX INFO: renamed from: c */
    protected abstract C7039u mo7449c(C7039u c7039u);

    /* JADX INFO: renamed from: e */
    public List m7450e() {
        return this.f5828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5828a.equals(((AbstractC1775a) obj).f5828a);
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f5828a.hashCode();
    }
}
