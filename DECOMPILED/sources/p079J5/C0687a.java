package p079J5;

import io.grpc.internal.ExecutorC5741J0;
import java.io.IOException;
import java.net.Socket;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.InterfaceC0669z;
import p095L5.C0853i;
import p095L5.EnumC0845a;
import p095L5.InterfaceC0847c;
import p122P3.AbstractC1209m;
import p131Q5.AbstractC1291c;
import p131Q5.C1290b;
import p131Q5.C1293e;

/* JADX INFO: renamed from: J5.a */
/* JADX INFO: loaded from: classes.dex */
final class C0687a implements InterfaceC0669z {

    /* JADX INFO: renamed from: c */
    private final ExecutorC5741J0 f2655c;

    /* JADX INFO: renamed from: d */
    private final C0688b.a f2656d;

    /* JADX INFO: renamed from: e */
    private final int f2657e;

    /* JADX INFO: renamed from: t */
    private InterfaceC0669z f2661t;

    /* JADX INFO: renamed from: u */
    private Socket f2662u;

    /* JADX INFO: renamed from: v */
    private boolean f2663v;

    /* JADX INFO: renamed from: w */
    private int f2664w;

    /* JADX INFO: renamed from: x */
    private int f2665x;

    /* JADX INFO: renamed from: a */
    private final Object f2653a = new Object();

    /* JADX INFO: renamed from: b */
    private final C0648e f2654b = new C0648e();

    /* JADX INFO: renamed from: f */
    private boolean f2658f = false;

    /* JADX INFO: renamed from: r */
    private boolean f2659r = false;

    /* JADX INFO: renamed from: s */
    private boolean f2660s = false;

    /* JADX INFO: renamed from: J5.a$a */
    class a extends e {

        /* JADX INFO: renamed from: b */
        final C1290b f2666b;

        a() {
            super(C0687a.this, null);
            this.f2666b = AbstractC1291c.m5630f();
        }

        @Override // p079J5.C0687a.e
        /* JADX INFO: renamed from: a */
        public void mo3215a() {
            int i7;
            C0648e c0648e = new C0648e();
            C1293e c1293eM5632h = AbstractC1291c.m5632h("WriteRunnable.runWrite");
            try {
                AbstractC1291c.m5629e(this.f2666b);
                synchronized (C0687a.this.f2653a) {
                    c0648e.mo3003I(C0687a.this.f2654b, C0687a.this.f2654b.m3021Q());
                    C0687a.this.f2658f = false;
                    i7 = C0687a.this.f2665x;
                }
                C0687a.this.f2661t.mo3003I(c0648e, c0648e.m3046h1());
                synchronized (C0687a.this.f2653a) {
                    C0687a.m3202J(C0687a.this, i7);
                }
                if (c1293eM5632h != null) {
                    c1293eM5632h.close();
                }
            } catch (Throwable th) {
                if (c1293eM5632h != null) {
                    try {
                        c1293eM5632h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J5.a$b */
    class b extends e {

        /* JADX INFO: renamed from: b */
        final C1290b f2668b;

        b() {
            super(C0687a.this, null);
            this.f2668b = AbstractC1291c.m5630f();
        }

        @Override // p079J5.C0687a.e
        /* JADX INFO: renamed from: a */
        public void mo3215a() {
            C0648e c0648e = new C0648e();
            C1293e c1293eM5632h = AbstractC1291c.m5632h("WriteRunnable.runFlush");
            try {
                AbstractC1291c.m5629e(this.f2668b);
                synchronized (C0687a.this.f2653a) {
                    c0648e.mo3003I(C0687a.this.f2654b, C0687a.this.f2654b.m3046h1());
                    C0687a.this.f2659r = false;
                }
                C0687a.this.f2661t.mo3003I(c0648e, c0648e.m3046h1());
                C0687a.this.f2661t.flush();
                if (c1293eM5632h != null) {
                    c1293eM5632h.close();
                }
            } catch (Throwable th) {
                if (c1293eM5632h != null) {
                    try {
                        c1293eM5632h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: J5.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C0687a.this.f2661t != null && C0687a.this.f2654b.m3046h1() > 0) {
                    C0687a.this.f2661t.mo3003I(C0687a.this.f2654b, C0687a.this.f2654b.m3046h1());
                }
            } catch (IOException e7) {
                C0687a.this.f2656d.mo3227f(e7);
            }
            C0687a.this.f2654b.close();
            try {
                if (C0687a.this.f2661t != null) {
                    C0687a.this.f2661t.close();
                }
            } catch (IOException e8) {
                C0687a.this.f2656d.mo3227f(e8);
            }
            try {
                if (C0687a.this.f2662u != null) {
                    C0687a.this.f2662u.close();
                }
            } catch (IOException e9) {
                C0687a.this.f2656d.mo3227f(e9);
            }
        }
    }

    /* JADX INFO: renamed from: J5.a$d */
    private class d extends AbstractC0689c {
        public d(InterfaceC0847c interfaceC0847c) {
            super(interfaceC0847c);
        }

        @Override // p079J5.AbstractC0689c, p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: B0 */
        public void mo3216B0(C0853i c0853i) {
            C0687a.m3211o0(C0687a.this);
            super.mo3216B0(c0853i);
        }

        @Override // p079J5.AbstractC0689c, p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: b */
        public void mo3217b(boolean z7, int i7, int i8) {
            if (z7) {
                C0687a.m3211o0(C0687a.this);
            }
            super.mo3217b(z7, i7, i8);
        }

        @Override // p079J5.AbstractC0689c, p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: k */
        public void mo3218k(int i7, EnumC0845a enumC0845a) {
            C0687a.m3211o0(C0687a.this);
            super.mo3218k(i7, enumC0845a);
        }
    }

    /* JADX INFO: renamed from: J5.a$e */
    private abstract class e implements Runnable {
        private e() {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo3215a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (C0687a.this.f2661t == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                mo3215a();
            } catch (Exception e7) {
                C0687a.this.f2656d.mo3227f(e7);
            }
        }

        /* synthetic */ e(C0687a c0687a, a aVar) {
            this();
        }
    }

    private C0687a(ExecutorC5741J0 executorC5741J0, C0688b.a aVar, int i7) {
        this.f2655c = (ExecutorC5741J0) AbstractC1209m.m5303o(executorC5741J0, "executor");
        this.f2656d = (C0688b.a) AbstractC1209m.m5303o(aVar, "exceptionHandler");
        this.f2657e = i7;
    }

    /* JADX INFO: renamed from: J */
    static /* synthetic */ int m3202J(C0687a c0687a, int i7) {
        int i8 = c0687a.f2665x - i7;
        c0687a.f2665x = i8;
        return i8;
    }

    /* JADX INFO: renamed from: K0 */
    static C0687a m3203K0(ExecutorC5741J0 executorC5741J0, C0688b.a aVar, int i7) {
        return new C0687a(executorC5741J0, aVar, i7);
    }

    /* JADX INFO: renamed from: o0 */
    static /* synthetic */ int m3211o0(C0687a c0687a) {
        int i7 = c0687a.f2664w;
        c0687a.f2664w = i7 + 1;
        return i7;
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: I */
    public void mo3003I(C0648e c0648e, long j7) throws IOException {
        AbstractC1209m.m5303o(c0648e, "source");
        if (this.f2660s) {
            throw new IOException("closed");
        }
        C1293e c1293eM5632h = AbstractC1291c.m5632h("AsyncSink.write");
        try {
            synchronized (this.f2653a) {
                try {
                    this.f2654b.mo3003I(c0648e, j7);
                    int i7 = this.f2665x + this.f2664w;
                    this.f2665x = i7;
                    boolean z7 = false;
                    this.f2664w = 0;
                    if (this.f2663v || i7 <= this.f2657e) {
                        if (!this.f2658f && !this.f2659r && this.f2654b.m3021Q() > 0) {
                            this.f2658f = true;
                        }
                        if (c1293eM5632h != null) {
                            c1293eM5632h.close();
                            return;
                        }
                        return;
                    }
                    this.f2663v = true;
                    z7 = true;
                    if (!z7) {
                        this.f2655c.execute(new a());
                        if (c1293eM5632h != null) {
                            c1293eM5632h.close();
                            return;
                        }
                        return;
                    }
                    try {
                        this.f2662u.close();
                    } catch (IOException e7) {
                        this.f2656d.mo3227f(e7);
                    }
                    if (c1293eM5632h != null) {
                        c1293eM5632h.close();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            if (c1293eM5632h != null) {
                try {
                    c1293eM5632h.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p072I6.InterfaceC0669z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f2660s) {
            return;
        }
        this.f2660s = true;
        this.f2655c.execute(new c());
    }

    @Override // p072I6.InterfaceC0669z, java.io.Flushable
    public void flush() throws IOException {
        if (this.f2660s) {
            throw new IOException("closed");
        }
        C1293e c1293eM5632h = AbstractC1291c.m5632h("AsyncSink.flush");
        try {
            synchronized (this.f2653a) {
                if (this.f2659r) {
                    if (c1293eM5632h != null) {
                        c1293eM5632h.close();
                    }
                } else {
                    this.f2659r = true;
                    this.f2655c.execute(new b());
                    if (c1293eM5632h != null) {
                        c1293eM5632h.close();
                    }
                }
            }
        } catch (Throwable th) {
            if (c1293eM5632h != null) {
                try {
                    c1293eM5632h.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p072I6.InterfaceC0669z
    /* JADX INFO: renamed from: g */
    public C0641C mo3005g() {
        return C0641C.f2530e;
    }

    /* JADX INFO: renamed from: p0 */
    void m3213p0(InterfaceC0669z interfaceC0669z, Socket socket) {
        AbstractC1209m.m5309u(this.f2661t == null, "AsyncSink's becomeConnected should only be called once.");
        this.f2661t = (InterfaceC0669z) AbstractC1209m.m5303o(interfaceC0669z, "sink");
        this.f2662u = (Socket) AbstractC1209m.m5303o(socket, "socket");
    }

    /* JADX INFO: renamed from: w0 */
    InterfaceC0847c m3214w0(InterfaceC0847c interfaceC0847c) {
        return new d(interfaceC0847c);
    }
}
