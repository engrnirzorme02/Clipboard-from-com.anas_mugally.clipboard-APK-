package p393y;

import p385x.C7370e;
import p385x.C7373h;

/* JADX INFO: renamed from: y.j */
/* JADX INFO: loaded from: classes.dex */
class C7439j extends AbstractC7445p {
    C7439j(C7370e c7370e) {
        super(c7370e);
        c7370e.f29432e.mo32917f();
        c7370e.f29434f.mo32917f();
        this.f29840f = ((C7373h) c7370e).m32668t1();
    }

    /* JADX INFO: renamed from: q */
    private void m32951q(C7435f c7435f) {
        this.f29842h.f29793k.add(c7435f);
        c7435f.f29794l.add(this.f29842h);
    }

    @Override // p393y.AbstractC7445p, p393y.InterfaceC7433d
    /* JADX INFO: renamed from: a */
    public void mo32914a(InterfaceC7433d interfaceC7433d) {
        C7435f c7435f = this.f29842h;
        if (c7435f.f29785c && !c7435f.f29792j) {
            this.f29842h.mo32936d((int) ((((C7435f) c7435f.f29794l.get(0)).f29789g * ((C7373h) this.f29836b).m32671w1()) + 0.5f));
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: d */
    void mo32915d() {
        C7373h c7373h = (C7373h) this.f29836b;
        int iM32669u1 = c7373h.m32669u1();
        int iM32670v1 = c7373h.m32670v1();
        c7373h.m32671w1();
        if (c7373h.m32668t1() == 1) {
            if (iM32669u1 != -1) {
                this.f29842h.f29794l.add(this.f29836b.f29425a0.f29432e.f29842h);
                this.f29836b.f29425a0.f29432e.f29842h.f29793k.add(this.f29842h);
                this.f29842h.f29788f = iM32669u1;
            } else if (iM32670v1 != -1) {
                this.f29842h.f29794l.add(this.f29836b.f29425a0.f29432e.f29843i);
                this.f29836b.f29425a0.f29432e.f29843i.f29793k.add(this.f29842h);
                this.f29842h.f29788f = -iM32670v1;
            } else {
                C7435f c7435f = this.f29842h;
                c7435f.f29784b = true;
                c7435f.f29794l.add(this.f29836b.f29425a0.f29432e.f29843i);
                this.f29836b.f29425a0.f29432e.f29843i.f29793k.add(this.f29842h);
            }
            m32951q(this.f29836b.f29432e.f29842h);
            m32951q(this.f29836b.f29432e.f29843i);
            return;
        }
        if (iM32669u1 != -1) {
            this.f29842h.f29794l.add(this.f29836b.f29425a0.f29434f.f29842h);
            this.f29836b.f29425a0.f29434f.f29842h.f29793k.add(this.f29842h);
            this.f29842h.f29788f = iM32669u1;
        } else if (iM32670v1 != -1) {
            this.f29842h.f29794l.add(this.f29836b.f29425a0.f29434f.f29843i);
            this.f29836b.f29425a0.f29434f.f29843i.f29793k.add(this.f29842h);
            this.f29842h.f29788f = -iM32670v1;
        } else {
            C7435f c7435f2 = this.f29842h;
            c7435f2.f29784b = true;
            c7435f2.f29794l.add(this.f29836b.f29425a0.f29434f.f29843i);
            this.f29836b.f29425a0.f29434f.f29843i.f29793k.add(this.f29842h);
        }
        m32951q(this.f29836b.f29434f.f29842h);
        m32951q(this.f29836b.f29434f.f29843i);
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: e */
    public void mo32916e() {
        if (((C7373h) this.f29836b).m32668t1() == 1) {
            this.f29836b.m32548n1(this.f29842h.f29789g);
        } else {
            this.f29836b.m32550o1(this.f29842h.f29789g);
        }
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: f */
    void mo32917f() {
        this.f29842h.m32935c();
    }

    @Override // p393y.AbstractC7445p
    /* JADX INFO: renamed from: m */
    boolean mo32919m() {
        return false;
    }
}
