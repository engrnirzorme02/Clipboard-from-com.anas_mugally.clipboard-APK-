package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p063H5.C0530Z;
import p063H5.C0554l0;
import p063H5.C0568t;
import p063H5.C0570v;
import p063H5.InterfaceC0557n;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.C */
/* JADX INFO: loaded from: classes.dex */
class C5726C implements InterfaceC5804r {

    /* JADX INFO: renamed from: a */
    private volatile boolean f21962a;

    /* JADX INFO: renamed from: b */
    private InterfaceC5806s f21963b;

    /* JADX INFO: renamed from: c */
    private InterfaceC5804r f21964c;

    /* JADX INFO: renamed from: d */
    private C0554l0 f21965d;

    /* JADX INFO: renamed from: f */
    private o f21967f;

    /* JADX INFO: renamed from: g */
    private long f21968g;

    /* JADX INFO: renamed from: h */
    private long f21969h;

    /* JADX INFO: renamed from: e */
    private List f21966e = new ArrayList();

    /* JADX INFO: renamed from: i */
    private List f21970i = new ArrayList();

    /* JADX INFO: renamed from: io.grpc.internal.C$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f21971a;

        a(int i7) {
            this.f21971a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25459d(this.f21971a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25462g();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$c */
    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC0557n f21974a;

        c(InterfaceC0557n interfaceC0557n) {
            this.f21974a = interfaceC0557n;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25458c(this.f21974a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$d */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f21976a;

        d(boolean z7) {
            this.f21976a = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25469u(this.f21976a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$e */
    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0570v f21978a;

        e(C0570v c0570v) {
            this.f21978a = c0570v;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25468t(this.f21978a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$f */
    class f implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f21980a;

        f(int i7) {
            this.f21980a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25463m(this.f21980a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$g */
    class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f21982a;

        g(int i7) {
            this.f21982a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25464n(this.f21982a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$h */
    class h implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0568t f21984a;

        h(C0568t c0568t) {
            this.f21984a = c0568t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25466r(this.f21984a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$i */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.m25455k();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$j */
    class j implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f21987a;

        j(String str) {
            this.f21987a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo3265o(this.f21987a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$k */
    class k implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputStream f21989a;

        k(InputStream inputStream) {
            this.f21989a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25461f(this.f21989a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$l */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.flush();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$m */
    class m implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C0554l0 f21992a;

        m(C0554l0 c0554l0) {
            this.f21992a = c0554l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25438a(this.f21992a);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$n */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726C.this.f21964c.mo25465q();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.C$o */
    private static class o implements InterfaceC5806s {

        /* JADX INFO: renamed from: a */
        private final InterfaceC5806s f21995a;

        /* JADX INFO: renamed from: b */
        private volatile boolean f21996b;

        /* JADX INFO: renamed from: c */
        private List f21997c = new ArrayList();

        /* JADX INFO: renamed from: io.grpc.internal.C$o$a */
        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ InterfaceC5755Q0.a f21998a;

            a(InterfaceC5755Q0.a aVar) {
                this.f21998a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f21995a.mo25473a(this.f21998a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C$o$b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f21995a.mo25474b();
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C$o$c */
        class c implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0530Z f22001a;

            c(C0530Z c0530z) {
                this.f22001a = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f21995a.mo25476d(this.f22001a);
            }
        }

        /* JADX INFO: renamed from: io.grpc.internal.C$o$d */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0554l0 f22003a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ InterfaceC5806s.a f22004b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C0530Z f22005c;

            d(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
                this.f22003a = c0554l0;
                this.f22004b = aVar;
                this.f22005c = c0530z;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f21995a.mo25475c(this.f22003a, this.f22004b, this.f22005c);
            }
        }

        public o(InterfaceC5806s interfaceC5806s) {
            this.f21995a = interfaceC5806s;
        }

        /* JADX INFO: renamed from: f */
        private void m25472f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f21996b) {
                        runnable.run();
                    } else {
                        this.f21997c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: a */
        public void mo25473a(InterfaceC5755Q0.a aVar) {
            if (this.f21996b) {
                this.f21995a.mo25473a(aVar);
            } else {
                m25472f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.InterfaceC5755Q0
        /* JADX INFO: renamed from: b */
        public void mo25474b() {
            if (this.f21996b) {
                this.f21995a.mo25474b();
            } else {
                m25472f(new b());
            }
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: c */
        public void mo25475c(C0554l0 c0554l0, InterfaceC5806s.a aVar, C0530Z c0530z) {
            m25472f(new d(c0554l0, aVar, c0530z));
        }

        @Override // io.grpc.internal.InterfaceC5806s
        /* JADX INFO: renamed from: d */
        public void mo25476d(C0530Z c0530z) {
            m25472f(new c(c0530z));
        }

        /* JADX INFO: renamed from: g */
        public void m25477g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f21997c.isEmpty()) {
                            this.f21997c = null;
                            this.f21996b = true;
                            return;
                        } else {
                            list = this.f21997c;
                            this.f21997c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    C5726C() {
    }

    /* JADX INFO: renamed from: j */
    private void m25454j(Runnable runnable) {
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f21962a) {
                    runnable.run();
                } else {
                    this.f21966e.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m25455k() {
        o oVar;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.f21966e.isEmpty()) {
                    break;
                }
                list = this.f21966e;
                this.f21966e = arrayList;
            }
            if (oVar != null) {
                oVar.m25477g();
            }
            list.clear();
            arrayList = list;
        }
        this.f21966e = null;
        this.f21962a = true;
        oVar = this.f21967f;
        if (oVar != null) {
            oVar.m25477g();
        }
    }

    /* JADX INFO: renamed from: l */
    private void m25456l(InterfaceC5806s interfaceC5806s) {
        Iterator it = this.f21970i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f21970i = null;
        this.f21964c.mo25467s(interfaceC5806s);
    }

    /* JADX INFO: renamed from: w */
    private void m25457w(InterfaceC5804r interfaceC5804r) {
        InterfaceC5804r interfaceC5804r2 = this.f21964c;
        AbstractC1209m.m5311w(interfaceC5804r2 == null, "realStream already set to %s", interfaceC5804r2);
        this.f21964c = interfaceC5804r;
        this.f21969h = System.nanoTime();
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: a */
    public void mo25438a(C0554l0 c0554l0) {
        boolean z7 = false;
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        AbstractC1209m.m5303o(c0554l0, "reason");
        synchronized (this) {
            try {
                if (this.f21964c == null) {
                    m25457w(C5801p0.f22823a);
                    this.f21965d = c0554l0;
                } else {
                    z7 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            m25454j(new m(c0554l0));
            return;
        }
        m25455k();
        mo25440v(c0554l0);
        this.f21963b.mo25475c(c0554l0, InterfaceC5806s.a.PROCESSED, new C0530Z());
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: c */
    public void mo25458c(InterfaceC0557n interfaceC0557n) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        AbstractC1209m.m5303o(interfaceC0557n, "compressor");
        this.f21970i.add(new c(interfaceC0557n));
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: d */
    public void mo25459d(int i7) {
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        if (this.f21962a) {
            this.f21964c.mo25459d(i7);
        } else {
            m25454j(new a(i7));
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: e */
    public boolean mo25460e() {
        if (this.f21962a) {
            return this.f21964c.mo25460e();
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: f */
    public void mo25461f(InputStream inputStream) {
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        AbstractC1209m.m5303o(inputStream, "message");
        if (this.f21962a) {
            this.f21964c.mo25461f(inputStream);
        } else {
            m25454j(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    public void flush() {
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        if (this.f21962a) {
            this.f21964c.flush();
        } else {
            m25454j(new l());
        }
    }

    @Override // io.grpc.internal.InterfaceC5753P0
    /* JADX INFO: renamed from: g */
    public void mo25462g() {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        this.f21970i.add(new b());
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: m */
    public void mo25463m(int i7) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        this.f21970i.add(new f(i7));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: n */
    public void mo25464n(int i7) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        this.f21970i.add(new g(i7));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: o */
    public void mo3265o(String str) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        AbstractC1209m.m5303o(str, "authority");
        this.f21970i.add(new j(str));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: p */
    public void mo25439p(C5768Y c5768y) {
        synchronized (this) {
            try {
                if (this.f21963b == null) {
                    return;
                }
                if (this.f21964c != null) {
                    c5768y.m25763b("buffered_nanos", Long.valueOf(this.f21969h - this.f21968g));
                    this.f21964c.mo25439p(c5768y);
                } else {
                    c5768y.m25763b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f21968g));
                    c5768y.m25762a("waiting_for_connection");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: q */
    public void mo25465q() {
        AbstractC1209m.m5309u(this.f21963b != null, "May only be called after start");
        m25454j(new n());
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: r */
    public void mo25466r(C0568t c0568t) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        this.f21970i.add(new h(c0568t));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: s */
    public void mo25467s(InterfaceC5806s interfaceC5806s) {
        C0554l0 c0554l0;
        boolean z7;
        AbstractC1209m.m5303o(interfaceC5806s, "listener");
        AbstractC1209m.m5309u(this.f21963b == null, "already started");
        synchronized (this) {
            try {
                c0554l0 = this.f21965d;
                z7 = this.f21962a;
                if (!z7) {
                    o oVar = new o(interfaceC5806s);
                    this.f21967f = oVar;
                    interfaceC5806s = oVar;
                }
                this.f21963b = interfaceC5806s;
                this.f21968g = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0554l0 != null) {
            interfaceC5806s.mo25475c(c0554l0, InterfaceC5806s.a.PROCESSED, new C0530Z());
        } else if (z7) {
            m25456l(interfaceC5806s);
        }
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: t */
    public void mo25468t(C0570v c0570v) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        AbstractC1209m.m5303o(c0570v, "decompressorRegistry");
        this.f21970i.add(new e(c0570v));
    }

    @Override // io.grpc.internal.InterfaceC5804r
    /* JADX INFO: renamed from: u */
    public void mo25469u(boolean z7) {
        AbstractC1209m.m5309u(this.f21963b == null, "May only be called before start");
        this.f21970i.add(new d(z7));
    }

    /* JADX INFO: renamed from: v */
    protected void mo25440v(C0554l0 c0554l0) {
    }

    /* JADX INFO: renamed from: x */
    final Runnable m25470x(InterfaceC5804r interfaceC5804r) {
        synchronized (this) {
            try {
                if (this.f21964c != null) {
                    return null;
                }
                m25457w((InterfaceC5804r) AbstractC1209m.m5303o(interfaceC5804r, "stream"));
                InterfaceC5806s interfaceC5806s = this.f21963b;
                if (interfaceC5806s == null) {
                    this.f21966e = null;
                    this.f21962a = true;
                }
                if (interfaceC5806s == null) {
                    return null;
                }
                m25456l(interfaceC5806s);
                return new i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
