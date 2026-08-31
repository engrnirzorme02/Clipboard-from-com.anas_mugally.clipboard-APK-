package p393y;

import java.util.Iterator;
import p385x.C7366a;
import p385x.C7370e;

/* JADX INFO: renamed from: y.k */
/* JADX INFO: loaded from: classes.dex */
class C7440k extends AbstractC7445p {
    C7440k(C7370e c7370e) {
        super(c7370e);
    }

    /* JADX INFO: renamed from: q */
    private void m32952q(C7435f c7435f) {
        this.f29842h.f29793k.add(c7435f);
        c7435f.f29794l.add(this.f29842h);
    }

    @Override // p393y.AbstractC7445p, p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        C7366a c7366a = (C7366a) this.f29836b;
        int iM32427w1 = c7366a.m32427w1();
        Iterator it = this.f29842h.f29794l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = ((C7435f) it.next()).f29789g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (iM32427w1 == 0 || iM32427w1 == 2) {
            this.f29842h.mo32936d(i8 + c7366a.m32428x1());
        } else {
            this.f29842h.mo32936d(i7 + c7366a.m32428x1());
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: d */
    void mo32915d() {
        C7370e c7370e = this.f29836b;
        if (c7370e instanceof C7366a) {
            this.f29842h.f29784b = true;
            C7366a c7366a = (C7366a) c7370e;
            int iM32427w1 = c7366a.m32427w1();
            boolean zM32426v1 = c7366a.m32426v1();
            int i7 = 0;
            if (iM32427w1 == 0) {
                this.f29842h.f29787e = C7435f.a.LEFT;
                while (i7 < c7366a.f29565M0) {
                    C7370e c7370e2 = c7366a.f29564L0[i7];
                    if (zM32426v1 || c7370e2.m32506V() != 8) {
                        C7435f c7435f = c7370e2.f29432e.f29842h;
                        c7435f.f29793k.add(this.f29842h);
                        this.f29842h.f29794l.add(c7435f);
                    }
                    i7++;
                }
                m32952q(this.f29836b.f29432e.f29842h);
                m32952q(this.f29836b.f29432e.f29843i);
                return;
            }
            if (iM32427w1 == 1) {
                this.f29842h.f29787e = C7435f.a.RIGHT;
                while (i7 < c7366a.f29565M0) {
                    C7370e c7370e3 = c7366a.f29564L0[i7];
                    if (zM32426v1 || c7370e3.m32506V() != 8) {
                        C7435f c7435f2 = c7370e3.f29432e.f29843i;
                        c7435f2.f29793k.add(this.f29842h);
                        this.f29842h.f29794l.add(c7435f2);
                    }
                    i7++;
                }
                m32952q(this.f29836b.f29432e.f29842h);
                m32952q(this.f29836b.f29432e.f29843i);
                return;
            }
            if (iM32427w1 == 2) {
                this.f29842h.f29787e = C7435f.a.TOP;
                while (i7 < c7366a.f29565M0) {
                    C7370e c7370e4 = c7366a.f29564L0[i7];
                    if (zM32426v1 || c7370e4.m32506V() != 8) {
                        C7435f c7435f3 = c7370e4.f29434f.f29842h;
                        c7435f3.f29793k.add(this.f29842h);
                        this.f29842h.f29794l.add(c7435f3);
                    }
                    i7++;
                }
                m32952q(this.f29836b.f29434f.f29842h);
                m32952q(this.f29836b.f29434f.f29843i);
                return;
            }
            if (iM32427w1 != 3) {
                return;
            }
            this.f29842h.f29787e = C7435f.a.BOTTOM;
            while (i7 < c7366a.f29565M0) {
                C7370e c7370e5 = c7366a.f29564L0[i7];
                if (zM32426v1 || c7370e5.m32506V() != 8) {
                    C7435f c7435f4 = c7370e5.f29434f.f29843i;
                    c7435f4.f29793k.add(this.f29842h);
                    this.f29842h.f29794l.add(c7435f4);
                }
                i7++;
            }
            m32952q(this.f29836b.f29434f.f29842h);
            m32952q(this.f29836b.f29434f.f29843i);
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: e */
    public void mo32916e() {
        C7370e c7370e = this.f29836b;
        if (c7370e instanceof C7366a) {
            int iM32427w1 = ((C7366a) c7370e).m32427w1();
            if (iM32427w1 == 0 || iM32427w1 == 1) {
                this.f29836b.m32548n1(this.f29842h.f29789g);
            } else {
                this.f29836b.m32550o1(this.f29842h.f29789g);
            }
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: f */
    void mo32917f() {
        this.f29837c = null;
        this.f29842h.m32935c();
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: m */
    boolean mo32919m() {
        return false;
    }
}
