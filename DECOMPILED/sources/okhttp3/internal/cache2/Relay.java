package okhttp3.internal.cache2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p145S5.C1444v;

/* JADX INFO: loaded from: classes.dex */
public final class Relay {

    /* JADX INFO: renamed from: k */
    public static final Companion f25575k = new Companion(null);

    /* JADX INFO: renamed from: l */
    public static final C0651h f25576l;

    /* JADX INFO: renamed from: m */
    public static final C0651h f25577m;

    /* JADX INFO: renamed from: a */
    private RandomAccessFile f25578a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0640B f25579b;

    /* JADX INFO: renamed from: c */
    private long f25580c;

    /* JADX INFO: renamed from: d */
    private final C0651h f25581d;

    /* JADX INFO: renamed from: e */
    private final long f25582e;

    /* JADX INFO: renamed from: f */
    private Thread f25583f;

    /* JADX INFO: renamed from: g */
    private final C0648e f25584g;

    /* JADX INFO: renamed from: h */
    private boolean f25585h;

    /* JADX INFO: renamed from: i */
    private final C0648e f25586i;

    /* JADX INFO: renamed from: j */
    private int f25587j;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public final class RelaySource implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final C0641C f25588a;

        /* JADX INFO: renamed from: b */
        private FileOperator f25589b;

        /* JADX INFO: renamed from: c */
        private long f25590c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Relay f25591d;

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f25589b == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.f25589b = null;
            Relay relay = this.f25591d;
            synchronized (relay) {
                try {
                    relay.m28881l(relay.m28875f() - 1);
                    if (relay.m28875f() == 0) {
                        RandomAccessFile randomAccessFileM28874e = relay.m28874e();
                        relay.m28880k(null);
                        randomAccessFile = randomAccessFileM28874e;
                    }
                    C1444v c1444v = C1444v.f4971a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (randomAccessFile != null) {
                Util.m28773m(randomAccessFile);
            }
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return this.f25588a;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) throws IOException {
            char c7;
            AbstractC6118n.m27187e(sink, "sink");
            if (this.f25589b == null) {
                throw new IllegalStateException("Check failed.");
            }
            Relay relay = this.f25591d;
            synchronized (relay) {
                while (true) {
                    try {
                        if (this.f25590c != relay.m28878i()) {
                            long jM28878i = relay.m28878i() - relay.m28871b().m3046h1();
                            if (this.f25590c < jM28878i) {
                                c7 = 2;
                                break;
                            }
                            long jMin = Math.min(j7, relay.m28878i() - this.f25590c);
                            relay.m28871b().m3050k0(sink, this.f25590c - jM28878i, jMin);
                            this.f25590c += jMin;
                            return jMin;
                        }
                        if (!relay.m28873d()) {
                            if (relay.m28879j() == null) {
                                relay.m28883n(Thread.currentThread());
                                c7 = 1;
                                break;
                            }
                            this.f25588a.m2958i(relay);
                        } else {
                            return -1L;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c7 == 2) {
                    long jMin2 = Math.min(j7, this.f25591d.m28878i() - this.f25590c);
                    FileOperator fileOperator = this.f25589b;
                    AbstractC6118n.m27184b(fileOperator);
                    fileOperator.m28866a(this.f25590c + 32, sink, jMin2);
                    this.f25590c += jMin2;
                    return jMin2;
                }
                try {
                    InterfaceC0640B interfaceC0640BM28876g = this.f25591d.m28876g();
                    AbstractC6118n.m27184b(interfaceC0640BM28876g);
                    long jMo2949w = interfaceC0640BM28876g.mo2949w(this.f25591d.m28877h(), this.f25591d.m28872c());
                    if (jMo2949w == -1) {
                        Relay relay2 = this.f25591d;
                        relay2.m28870a(relay2.m28878i());
                        Relay relay3 = this.f25591d;
                        synchronized (relay3) {
                            relay3.m28883n(null);
                            AbstractC6118n.m27185c(relay3, "null cannot be cast to non-null type java.lang.Object");
                            relay3.notifyAll();
                            C1444v c1444v = C1444v.f4971a;
                        }
                        return -1L;
                    }
                    long jMin3 = Math.min(jMo2949w, j7);
                    this.f25591d.m28877h().m3050k0(sink, 0L, jMin3);
                    this.f25590c += jMin3;
                    FileOperator fileOperator2 = this.f25589b;
                    AbstractC6118n.m27184b(fileOperator2);
                    fileOperator2.m28867b(this.f25591d.m28878i() + 32, this.f25591d.m28877h().clone(), jMo2949w);
                    Relay relay4 = this.f25591d;
                    synchronized (relay4) {
                        try {
                            relay4.m28871b().mo3003I(relay4.m28877h(), jMo2949w);
                            if (relay4.m28871b().m3046h1() > relay4.m28872c()) {
                                relay4.m28871b().mo3052l(relay4.m28871b().m3046h1() - relay4.m28872c());
                            }
                            relay4.m28882m(relay4.m28878i() + jMo2949w);
                            C1444v c1444v2 = C1444v.f4971a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Relay relay5 = this.f25591d;
                    synchronized (relay5) {
                        relay5.m28883n(null);
                        AbstractC6118n.m27185c(relay5, "null cannot be cast to non-null type java.lang.Object");
                        relay5.notifyAll();
                    }
                    return jMin3;
                } catch (Throwable th3) {
                    Relay relay6 = this.f25591d;
                    synchronized (relay6) {
                        relay6.m28883n(null);
                        AbstractC6118n.m27185c(relay6, "null cannot be cast to non-null type java.lang.Object");
                        relay6.notifyAll();
                        C1444v c1444v3 = C1444v.f4971a;
                        throw th3;
                    }
                }
            }
        }
    }

    static {
        C0651h.a aVar = C0651h.f2562d;
        f25576l = aVar.m3114d("OkHttp cache v1\n");
        f25577m = aVar.m3114d("OkHttp DIRTY :(\n");
    }

    /* JADX INFO: renamed from: o */
    private final void m28868o(C0651h c0651h, long j7, long j8) throws IOException {
        C0648e c0648e = new C0648e();
        c0648e.mo3017N0(c0651h);
        c0648e.m3067s1(j7);
        c0648e.m3067s1(j8);
        if (c0648e.m3046h1() != 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        RandomAccessFile randomAccessFile = this.f25578a;
        AbstractC6118n.m27184b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        AbstractC6118n.m27186d(channel, "file!!.channel");
        new FileOperator(channel).m28867b(0L, c0648e, 32L);
    }

    /* JADX INFO: renamed from: p */
    private final void m28869p(long j7) throws IOException {
        C0648e c0648e = new C0648e();
        c0648e.mo3017N0(this.f25581d);
        RandomAccessFile randomAccessFile = this.f25578a;
        AbstractC6118n.m27184b(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        AbstractC6118n.m27186d(channel, "file!!.channel");
        new FileOperator(channel).m28867b(32 + j7, c0648e, this.f25581d.m3090F());
    }

    /* JADX INFO: renamed from: a */
    public final void m28870a(long j7) throws IOException {
        m28869p(j7);
        RandomAccessFile randomAccessFile = this.f25578a;
        AbstractC6118n.m27184b(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        m28868o(f25576l, j7, this.f25581d.m3090F());
        RandomAccessFile randomAccessFile2 = this.f25578a;
        AbstractC6118n.m27184b(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.f25585h = true;
            C1444v c1444v = C1444v.f4971a;
        }
        InterfaceC0640B interfaceC0640B = this.f25579b;
        if (interfaceC0640B != null) {
            Util.m28773m(interfaceC0640B);
        }
        this.f25579b = null;
    }

    /* JADX INFO: renamed from: b */
    public final C0648e m28871b() {
        return this.f25586i;
    }

    /* JADX INFO: renamed from: c */
    public final long m28872c() {
        return this.f25582e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m28873d() {
        return this.f25585h;
    }

    /* JADX INFO: renamed from: e */
    public final RandomAccessFile m28874e() {
        return this.f25578a;
    }

    /* JADX INFO: renamed from: f */
    public final int m28875f() {
        return this.f25587j;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0640B m28876g() {
        return this.f25579b;
    }

    /* JADX INFO: renamed from: h */
    public final C0648e m28877h() {
        return this.f25584g;
    }

    /* JADX INFO: renamed from: i */
    public final long m28878i() {
        return this.f25580c;
    }

    /* JADX INFO: renamed from: j */
    public final Thread m28879j() {
        return this.f25583f;
    }

    /* JADX INFO: renamed from: k */
    public final void m28880k(RandomAccessFile randomAccessFile) {
        this.f25578a = randomAccessFile;
    }

    /* JADX INFO: renamed from: l */
    public final void m28881l(int i7) {
        this.f25587j = i7;
    }

    /* JADX INFO: renamed from: m */
    public final void m28882m(long j7) {
        this.f25580c = j7;
    }

    /* JADX INFO: renamed from: n */
    public final void m28883n(Thread thread) {
        this.f25583f = thread;
    }
}
