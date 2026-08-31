package androidx.lifecycle;

import java.util.Map;
import p303n.C6425c;
import p311o.C6510b;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2664z {

    /* JADX INFO: renamed from: k */
    static final Object f10504k = new Object();

    /* JADX INFO: renamed from: a */
    final Object f10505a;

    /* JADX INFO: renamed from: b */
    private C6510b f10506b;

    /* JADX INFO: renamed from: c */
    int f10507c;

    /* JADX INFO: renamed from: d */
    private boolean f10508d;

    /* JADX INFO: renamed from: e */
    private volatile Object f10509e;

    /* JADX INFO: renamed from: f */
    volatile Object f10510f;

    /* JADX INFO: renamed from: g */
    private int f10511g;

    /* JADX INFO: renamed from: h */
    private boolean f10512h;

    /* JADX INFO: renamed from: i */
    private boolean f10513i;

    /* JADX INFO: renamed from: j */
    private final Runnable f10514j;

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (AbstractC2664z.this.f10505a) {
                obj = AbstractC2664z.this.f10510f;
                AbstractC2664z.this.f10510f = AbstractC2664z.f10504k;
            }
            AbstractC2664z.this.mo12526q(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$b */
    private class b extends d {
        b(InterfaceC2612D interfaceC2612D) {
            super(interfaceC2612D);
        }

        @Override // androidx.lifecycle.AbstractC2664z.d
        /* JADX INFO: renamed from: e */
        boolean mo12677e() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$c */
    class c extends d implements InterfaceC2654p {

        /* JADX INFO: renamed from: e */
        final InterfaceC2657s f10517e;

        c(InterfaceC2657s interfaceC2657s, InterfaceC2612D interfaceC2612D) {
            super(interfaceC2612D);
            this.f10517e = interfaceC2657s;
        }

        @Override // androidx.lifecycle.AbstractC2664z.d
        /* JADX INFO: renamed from: b */
        void mo12678b() {
            this.f10517e.mo419P().mo12628d(this);
        }

        @Override // androidx.lifecycle.AbstractC2664z.d
        /* JADX INFO: renamed from: c */
        boolean mo12679c(InterfaceC2657s interfaceC2657s) {
            return this.f10517e == interfaceC2657s;
        }

        @Override // androidx.lifecycle.AbstractC2664z.d
        /* JADX INFO: renamed from: e */
        boolean mo12677e() {
            return this.f10517e.mo419P().mo12626b().m12634d(AbstractC2650l.b.STARTED);
        }

        @Override // androidx.lifecycle.InterfaceC2654p
        /* JADX INFO: renamed from: n */
        public void mo173n(InterfaceC2657s interfaceC2657s, AbstractC2650l.a aVar) {
            AbstractC2650l.b bVarMo12626b = this.f10517e.mo419P().mo12626b();
            if (bVarMo12626b == AbstractC2650l.b.DESTROYED) {
                AbstractC2664z.this.mo12676p(this.f10519a);
                return;
            }
            AbstractC2650l.b bVar = null;
            while (bVar != bVarMo12626b) {
                m12680a(mo12677e());
                bVar = bVarMo12626b;
                bVarMo12626b = this.f10517e.mo419P().mo12626b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$d */
    private abstract class d {

        /* JADX INFO: renamed from: a */
        final InterfaceC2612D f10519a;

        /* JADX INFO: renamed from: b */
        boolean f10520b;

        /* JADX INFO: renamed from: c */
        int f10521c = -1;

        d(InterfaceC2612D interfaceC2612D) {
            this.f10519a = interfaceC2612D;
        }

        /* JADX INFO: renamed from: a */
        void m12680a(boolean z7) {
            if (z7 == this.f10520b) {
                return;
            }
            this.f10520b = z7;
            AbstractC2664z.this.m12667c(z7 ? 1 : -1);
            if (this.f10520b) {
                AbstractC2664z.this.m12668e(this);
            }
        }

        /* JADX INFO: renamed from: b */
        void mo12678b() {
        }

        /* JADX INFO: renamed from: c */
        boolean mo12679c(InterfaceC2657s interfaceC2657s) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        abstract boolean mo12677e();
    }

    public AbstractC2664z(Object obj) {
        this.f10505a = new Object();
        this.f10506b = new C6510b();
        this.f10507c = 0;
        this.f10510f = f10504k;
        this.f10514j = new a();
        this.f10509e = obj;
        this.f10511g = 0;
    }

    /* JADX INFO: renamed from: b */
    static void m12665b(String str) {
        if (C6425c.m27634g().mo27636b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* JADX INFO: renamed from: d */
    private void m12666d(d dVar) {
        if (dVar.f10520b) {
            if (!dVar.mo12677e()) {
                dVar.m12680a(false);
                return;
            }
            int i7 = dVar.f10521c;
            int i8 = this.f10511g;
            if (i7 >= i8) {
                return;
            }
            dVar.f10521c = i8;
            dVar.f10519a.mo12097b(this.f10509e);
        }
    }

    /* JADX INFO: renamed from: c */
    void m12667c(int i7) {
        int i8 = this.f10507c;
        this.f10507c = i7 + i8;
        if (this.f10508d) {
            return;
        }
        this.f10508d = true;
        while (true) {
            try {
                int i9 = this.f10507c;
                if (i8 == i9) {
                    this.f10508d = false;
                    return;
                }
                boolean z7 = i8 == 0 && i9 > 0;
                boolean z8 = i8 > 0 && i9 == 0;
                if (z7) {
                    mo12520m();
                } else if (z8) {
                    mo12521n();
                }
                i8 = i9;
            } catch (Throwable th) {
                this.f10508d = false;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    void m12668e(d dVar) {
        if (this.f10512h) {
            this.f10513i = true;
            return;
        }
        this.f10512h = true;
        do {
            this.f10513i = false;
            if (dVar != null) {
                m12666d(dVar);
                dVar = null;
            } else {
                C6510b.d dVarM27734e = this.f10506b.m27734e();
                while (dVarM27734e.hasNext()) {
                    m12666d((d) ((Map.Entry) dVarM27734e.next()).getValue());
                    if (this.f10513i) {
                        break;
                    }
                }
            }
        } while (this.f10513i);
        this.f10512h = false;
    }

    /* JADX INFO: renamed from: f */
    public Object m12669f() {
        Object obj = this.f10509e;
        if (obj != f10504k) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    int m12670g() {
        return this.f10511g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m12671h() {
        return this.f10507c > 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m12672i() {
        return this.f10506b.size() > 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m12673j() {
        return this.f10509e != f10504k;
    }

    /* JADX INFO: renamed from: k */
    public void m12674k(InterfaceC2657s interfaceC2657s, InterfaceC2612D interfaceC2612D) {
        m12665b("observe");
        if (interfaceC2657s.mo419P().mo12626b() == AbstractC2650l.b.DESTROYED) {
            return;
        }
        c cVar = new c(interfaceC2657s, interfaceC2612D);
        d dVar = (d) this.f10506b.mo27730k(interfaceC2612D, cVar);
        if (dVar != null && !dVar.mo12679c(interfaceC2657s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        interfaceC2657s.mo419P().mo12625a(cVar);
    }

    /* JADX INFO: renamed from: l */
    public void m12675l(InterfaceC2612D interfaceC2612D) {
        m12665b("observeForever");
        b bVar = new b(interfaceC2612D);
        d dVar = (d) this.f10506b.mo27730k(interfaceC2612D, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.m12680a(true);
    }

    /* JADX INFO: renamed from: m */
    protected void mo12520m() {
    }

    /* JADX INFO: renamed from: n */
    protected void mo12521n() {
    }

    /* JADX INFO: renamed from: o */
    protected void mo12525o(Object obj) {
        boolean z7;
        synchronized (this.f10505a) {
            z7 = this.f10510f == f10504k;
            this.f10510f = obj;
        }
        if (z7) {
            C6425c.m27634g().mo27637c(this.f10514j);
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo12676p(InterfaceC2612D interfaceC2612D) {
        m12665b("removeObserver");
        d dVar = (d) this.f10506b.mo27731m(interfaceC2612D);
        if (dVar == null) {
            return;
        }
        dVar.mo12678b();
        dVar.m12680a(false);
    }

    /* JADX INFO: renamed from: q */
    protected void mo12526q(Object obj) {
        m12665b("setValue");
        this.f10511g++;
        this.f10509e = obj;
        m12668e(null);
    }

    public AbstractC2664z() {
        this.f10505a = new Object();
        this.f10506b = new C6510b();
        this.f10507c = 0;
        Object obj = f10504k;
        this.f10510f = obj;
        this.f10514j = new a();
        this.f10509e = obj;
        this.f10511g = -1;
    }
}
