package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.C6099B;
import kotlin.jvm.internal.C6130z;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p145S5.C1444v;
import p238e6.InterfaceC5356a;

/* JADX INFO: loaded from: classes.dex */
public final class Http2Connection implements Closeable {

    /* JADX INFO: renamed from: N */
    public static final Companion f25827N = new Companion(null);

    /* JADX INFO: renamed from: O */
    private static final Settings f25828O;

    /* JADX INFO: renamed from: A */
    private long f25829A;

    /* JADX INFO: renamed from: B */
    private long f25830B;

    /* JADX INFO: renamed from: C */
    private long f25831C;

    /* JADX INFO: renamed from: D */
    private final Settings f25832D;

    /* JADX INFO: renamed from: E */
    private Settings f25833E;

    /* JADX INFO: renamed from: F */
    private long f25834F;

    /* JADX INFO: renamed from: G */
    private long f25835G;

    /* JADX INFO: renamed from: H */
    private long f25836H;

    /* JADX INFO: renamed from: I */
    private long f25837I;

    /* JADX INFO: renamed from: J */
    private final Socket f25838J;

    /* JADX INFO: renamed from: K */
    private final Http2Writer f25839K;

    /* JADX INFO: renamed from: L */
    private final ReaderRunnable f25840L;

    /* JADX INFO: renamed from: M */
    private final Set f25841M;

    /* JADX INFO: renamed from: a */
    private final boolean f25842a;

    /* JADX INFO: renamed from: b */
    private final Listener f25843b;

    /* JADX INFO: renamed from: c */
    private final Map f25844c;

    /* JADX INFO: renamed from: d */
    private final String f25845d;

    /* JADX INFO: renamed from: e */
    private int f25846e;

    /* JADX INFO: renamed from: f */
    private int f25847f;

    /* JADX INFO: renamed from: r */
    private boolean f25848r;

    /* JADX INFO: renamed from: s */
    private final TaskRunner f25849s;

    /* JADX INFO: renamed from: t */
    private final TaskQueue f25850t;

    /* JADX INFO: renamed from: u */
    private final TaskQueue f25851u;

    /* JADX INFO: renamed from: v */
    private final TaskQueue f25852v;

    /* JADX INFO: renamed from: w */
    private final PushObserver f25853w;

    /* JADX INFO: renamed from: x */
    private long f25854x;

    /* JADX INFO: renamed from: y */
    private long f25855y;

    /* JADX INFO: renamed from: z */
    private long f25856z;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private boolean f25857a;

        /* JADX INFO: renamed from: b */
        private final TaskRunner f25858b;

        /* JADX INFO: renamed from: c */
        public Socket f25859c;

        /* JADX INFO: renamed from: d */
        public String f25860d;

        /* JADX INFO: renamed from: e */
        public InterfaceC0650g f25861e;

        /* JADX INFO: renamed from: f */
        public InterfaceC0649f f25862f;

        /* JADX INFO: renamed from: g */
        private Listener f25863g;

        /* JADX INFO: renamed from: h */
        private PushObserver f25864h;

        /* JADX INFO: renamed from: i */
        private int f25865i;

        public Builder(boolean z7, TaskRunner taskRunner) {
            AbstractC6118n.m27187e(taskRunner, "taskRunner");
            this.f25857a = z7;
            this.f25858b = taskRunner;
            this.f25863g = Listener.f25867b;
            this.f25864h = PushObserver.f25969b;
        }

        /* JADX INFO: renamed from: a */
        public final Http2Connection m29203a() {
            return new Http2Connection(this);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m29204b() {
            return this.f25857a;
        }

        /* JADX INFO: renamed from: c */
        public final String m29205c() {
            String str = this.f25860d;
            if (str != null) {
                return str;
            }
            AbstractC6118n.m27197o("connectionName");
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final Listener m29206d() {
            return this.f25863g;
        }

        /* JADX INFO: renamed from: e */
        public final int m29207e() {
            return this.f25865i;
        }

        /* JADX INFO: renamed from: f */
        public final PushObserver m29208f() {
            return this.f25864h;
        }

        /* JADX INFO: renamed from: g */
        public final InterfaceC0649f m29209g() {
            InterfaceC0649f interfaceC0649f = this.f25862f;
            if (interfaceC0649f != null) {
                return interfaceC0649f;
            }
            AbstractC6118n.m27197o("sink");
            return null;
        }

        /* JADX INFO: renamed from: h */
        public final Socket m29210h() {
            Socket socket = this.f25859c;
            if (socket != null) {
                return socket;
            }
            AbstractC6118n.m27197o("socket");
            return null;
        }

        /* JADX INFO: renamed from: i */
        public final InterfaceC0650g m29211i() {
            InterfaceC0650g interfaceC0650g = this.f25861e;
            if (interfaceC0650g != null) {
                return interfaceC0650g;
            }
            AbstractC6118n.m27197o("source");
            return null;
        }

        /* JADX INFO: renamed from: j */
        public final TaskRunner m29212j() {
            return this.f25858b;
        }

        /* JADX INFO: renamed from: k */
        public final Builder m29213k(Listener listener) {
            AbstractC6118n.m27187e(listener, "listener");
            this.f25863g = listener;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public final Builder m29214l(int i7) {
            this.f25865i = i7;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final void m29215m(String str) {
            AbstractC6118n.m27187e(str, "<set-?>");
            this.f25860d = str;
        }

        /* JADX INFO: renamed from: n */
        public final void m29216n(InterfaceC0649f interfaceC0649f) {
            AbstractC6118n.m27187e(interfaceC0649f, "<set-?>");
            this.f25862f = interfaceC0649f;
        }

        /* JADX INFO: renamed from: o */
        public final void m29217o(Socket socket) {
            AbstractC6118n.m27187e(socket, "<set-?>");
            this.f25859c = socket;
        }

        /* JADX INFO: renamed from: p */
        public final void m29218p(InterfaceC0650g interfaceC0650g) {
            AbstractC6118n.m27187e(interfaceC0650g, "<set-?>");
            this.f25861e = interfaceC0650g;
        }

        /* JADX INFO: renamed from: q */
        public final Builder m29219q(Socket socket, String peerName, InterfaceC0650g source, InterfaceC0649f sink) {
            String str;
            AbstractC6118n.m27187e(socket, "socket");
            AbstractC6118n.m27187e(peerName, "peerName");
            AbstractC6118n.m27187e(source, "source");
            AbstractC6118n.m27187e(sink, "sink");
            m29217o(socket);
            if (this.f25857a) {
                str = Util.f25485i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m29215m(str);
            m29218p(source);
            m29216n(sink);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Settings m29220a() {
            return Http2Connection.f25828O;
        }

        private Companion() {
        }
    }

    public static abstract class Listener {

        /* JADX INFO: renamed from: a */
        public static final Companion f25866a = new Companion(null);

        /* JADX INFO: renamed from: b */
        public static final Listener f25867b = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            /* JADX INFO: renamed from: b */
            public void mo29002b(Http2Stream stream) {
                AbstractC6118n.m27187e(stream, "stream");
                stream.m29269d(ErrorCode.REFUSED_STREAM, null);
            }
        };

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo29001a(Http2Connection connection, Settings settings) {
            AbstractC6118n.m27187e(connection, "connection");
            AbstractC6118n.m27187e(settings, "settings");
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo29002b(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, InterfaceC5356a {

        /* JADX INFO: renamed from: a */
        private final Http2Reader f25868a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Http2Connection f25869b;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            AbstractC6118n.m27187e(reader, "reader");
            this.f25869b = http2Connection;
            this.f25868a = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: a */
        public void mo29221a(int i7, long j7) {
            if (i7 == 0) {
                Http2Connection http2Connection = this.f25869b;
                synchronized (http2Connection) {
                    http2Connection.f25837I = http2Connection.m29185g1() + j7;
                    AbstractC6118n.m27185c(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    C1444v c1444v = C1444v.f4971a;
                }
                return;
            }
            Http2Stream http2StreamM29183e1 = this.f25869b.m29183e1(i7);
            if (http2StreamM29183e1 != null) {
                synchronized (http2StreamM29183e1) {
                    http2StreamM29183e1.m29266a(j7);
                    C1444v c1444v2 = C1444v.f4971a;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: b */
        public void mo29222b(boolean z7, final int i7, final int i8) {
            if (!z7) {
                TaskQueue taskQueue = this.f25869b.f25850t;
                final String str = this.f25869b.m29177Y0() + " ping";
                final Http2Connection http2Connection = this.f25869b;
                final boolean z8 = true;
                taskQueue.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    /* JADX INFO: renamed from: f */
                    public long mo28863f() {
                        http2Connection.m29171A1(true, i7, i8);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f25869b;
            synchronized (http2Connection2) {
                try {
                    if (i7 == 1) {
                        http2Connection2.f25855y++;
                    } else if (i7 != 2) {
                        if (i7 == 3) {
                            http2Connection2.f25830B++;
                            AbstractC6118n.m27185c(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        C1444v c1444v = C1444v.f4971a;
                    } else {
                        http2Connection2.f25829A++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: c */
        public void mo29223c() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: d */
        public void mo29224d(final boolean z7, final Settings settings) {
            AbstractC6118n.m27187e(settings, "settings");
            TaskQueue taskQueue = this.f25869b.f25850t;
            final String str = this.f25869b.m29177Y0() + " applyAndAckSettings";
            final boolean z8 = true;
            taskQueue.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                /* JADX INFO: renamed from: f */
                public long mo28863f() {
                    this.m29229i(z7, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: e */
        public void mo29225e(boolean z7, int i7, int i8, List headerBlock) {
            AbstractC6118n.m27187e(headerBlock, "headerBlock");
            if (this.f25869b.m29193p1(i7)) {
                this.f25869b.m29190m1(i7, headerBlock, z7);
                return;
            }
            final Http2Connection http2Connection = this.f25869b;
            synchronized (http2Connection) {
                Http2Stream http2StreamM29183e1 = http2Connection.m29183e1(i7);
                if (http2StreamM29183e1 != null) {
                    C1444v c1444v = C1444v.f4971a;
                    http2StreamM29183e1.m29288x(Util.m28748Q(headerBlock), z7);
                    return;
                }
                if (http2Connection.f25848r) {
                    return;
                }
                if (i7 <= http2Connection.m29178Z0()) {
                    return;
                }
                if (i7 % 2 == http2Connection.m29180b1() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i7, http2Connection, false, z7, Util.m28748Q(headerBlock));
                http2Connection.m29196s1(i7);
                http2Connection.m29184f1().put(Integer.valueOf(i7), http2Stream);
                TaskQueue taskQueueM28916i = http2Connection.f25849s.m28916i();
                final String str = http2Connection.m29177Y0() + '[' + i7 + "] onStream";
                final boolean z8 = true;
                taskQueueM28916i.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    /* JADX INFO: renamed from: f */
                    public long mo28863f() {
                        try {
                            http2Connection.m29179a1().mo29002b(http2Stream);
                            return -1L;
                        } catch (IOException e7) {
                            Platform.f26006a.m29391g().m29381k("Http2Connection.Listener failure for " + http2Connection.m29177Y0(), 4, e7);
                            try {
                                http2Stream.m29269d(ErrorCode.PROTOCOL_ERROR, e7);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: f */
        public void mo29226f(boolean z7, int i7, InterfaceC0650g source, int i8) {
            AbstractC6118n.m27187e(source, "source");
            if (this.f25869b.m29193p1(i7)) {
                this.f25869b.m29189l1(i7, source, i8, z7);
                return;
            }
            Http2Stream http2StreamM29183e1 = this.f25869b.m29183e1(i7);
            if (http2StreamM29183e1 == null) {
                this.f25869b.m29173C1(i7, ErrorCode.PROTOCOL_ERROR);
                long j7 = i8;
                this.f25869b.m29200x1(j7);
                source.mo3052l(j7);
                return;
            }
            http2StreamM29183e1.m29287w(source, i8);
            if (z7) {
                http2StreamM29183e1.m29288x(Util.f25478b, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: g */
        public void mo29227g(int i7, ErrorCode errorCode, C0651h debugData) {
            int i8;
            Object[] array;
            AbstractC6118n.m27187e(errorCode, "errorCode");
            AbstractC6118n.m27187e(debugData, "debugData");
            debugData.m3090F();
            Http2Connection http2Connection = this.f25869b;
            synchronized (http2Connection) {
                array = http2Connection.m29184f1().values().toArray(new Http2Stream[0]);
                http2Connection.f25848r = true;
                C1444v c1444v = C1444v.f4971a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.m29274j() > i7 && http2Stream.m29284t()) {
                    http2Stream.m29289y(ErrorCode.REFUSED_STREAM);
                    this.f25869b.m29194q1(http2Stream.m29274j());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: h */
        public void mo29228h(int i7, ErrorCode errorCode) {
            AbstractC6118n.m27187e(errorCode, "errorCode");
            if (this.f25869b.m29193p1(i7)) {
                this.f25869b.m29192o1(i7, errorCode);
                return;
            }
            Http2Stream http2StreamM29194q1 = this.f25869b.m29194q1(i7);
            if (http2StreamM29194q1 != null) {
                http2StreamM29194q1.m29289y(errorCode);
            }
        }

        /* JADX INFO: renamed from: i */
        public final void m29229i(boolean z7, Settings settings) {
            long jM29328c;
            int i7;
            Http2Stream[] http2StreamArr;
            final boolean z8 = true;
            AbstractC6118n.m27187e(settings, "settings");
            final C6099B c6099b = new C6099B();
            Http2Writer http2WriterM29186h1 = this.f25869b.m29186h1();
            final Http2Connection http2Connection = this.f25869b;
            synchronized (http2WriterM29186h1) {
                synchronized (http2Connection) {
                    try {
                        Settings settingsM29182d1 = http2Connection.m29182d1();
                        if (!z7) {
                            Settings settings2 = new Settings();
                            settings2.m29332g(settingsM29182d1);
                            settings2.m29332g(settings);
                            settings = settings2;
                        }
                        c6099b.f23859a = settings;
                        jM29328c = ((long) settings.m29328c()) - ((long) settingsM29182d1.m29328c());
                        http2StreamArr = (jM29328c == 0 || http2Connection.m29184f1().isEmpty()) ? null : (Http2Stream[]) http2Connection.m29184f1().values().toArray(new Http2Stream[0]);
                        http2Connection.m29197t1((Settings) c6099b.f23859a);
                        TaskQueue taskQueue = http2Connection.f25852v;
                        final String str = http2Connection.m29177Y0() + " onSettings";
                        taskQueue.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            /* JADX INFO: renamed from: f */
                            public long mo28863f() {
                                http2Connection.m29179a1().mo29001a(http2Connection, (Settings) c6099b.f23859a);
                                return -1L;
                            }
                        }, 0L);
                        C1444v c1444v = C1444v.f4971a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.m29186h1().m29308d((Settings) c6099b.f23859a);
                } catch (IOException e7) {
                    http2Connection.m29158W0(e7);
                }
                C1444v c1444v2 = C1444v.f4971a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.m29266a(jM29328c);
                        C1444v c1444v3 = C1444v.f4971a;
                    }
                }
            }
        }

        @Override // p238e6.InterfaceC5356a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            m29230k();
            return C1444v.f4971a;
        }

        /* JADX INFO: renamed from: k */
        public void m29230k() throws Throwable {
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.f25868a.m29250n(this);
                    while (this.f25868a.m29249m(false, this)) {
                    }
                    try {
                        this.f25869b.m29175V0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                        Util.m28773m(this.f25868a);
                    } catch (IOException e7) {
                        e = e7;
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        this.f25869b.m29175V0(errorCode2, errorCode2, e);
                        Util.m28773m(this.f25868a);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f25869b.m29175V0(errorCode, errorCode, null);
                    Util.m28773m(this.f25868a);
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            } catch (Throwable th2) {
                th = th2;
                this.f25869b.m29175V0(errorCode, errorCode, null);
                Util.m28773m(this.f25868a);
                throw th;
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: l */
        public void mo29231l(int i7, int i8, int i9, boolean z7) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* JADX INFO: renamed from: m */
        public void mo29232m(int i7, int i8, List requestHeaders) throws Throwable {
            AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
            this.f25869b.m29191n1(i8, requestHeaders);
        }
    }

    static {
        Settings settings = new Settings();
        settings.m29333h(7, 65535);
        settings.m29333h(5, 16384);
        f25828O = settings;
    }

    public Http2Connection(Builder builder) {
        AbstractC6118n.m27187e(builder, "builder");
        boolean zM29204b = builder.m29204b();
        this.f25842a = zM29204b;
        this.f25843b = builder.m29206d();
        this.f25844c = new LinkedHashMap();
        String strM29205c = builder.m29205c();
        this.f25845d = strM29205c;
        this.f25847f = builder.m29204b() ? 3 : 2;
        TaskRunner taskRunnerM29212j = builder.m29212j();
        this.f25849s = taskRunnerM29212j;
        TaskQueue taskQueueM28916i = taskRunnerM29212j.m28916i();
        this.f25850t = taskQueueM28916i;
        this.f25851u = taskRunnerM29212j.m28916i();
        this.f25852v = taskRunnerM29212j.m28916i();
        this.f25853w = builder.m29208f();
        Settings settings = new Settings();
        if (builder.m29204b()) {
            settings.m29333h(7, 16777216);
        }
        this.f25832D = settings;
        Settings settings2 = f25828O;
        this.f25833E = settings2;
        this.f25837I = settings2.m29328c();
        this.f25838J = builder.m29210h();
        this.f25839K = new Http2Writer(builder.m29209g(), zM29204b);
        this.f25840L = new ReaderRunnable(this, new Http2Reader(builder.m29211i(), zM29204b));
        this.f25841M = new LinkedHashSet();
        if (builder.m29207e() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m29207e());
            final String str = strM29205c + " ping";
            taskQueueM28916i.m28902i(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                /* JADX INFO: renamed from: f */
                public long mo28863f() {
                    boolean z7;
                    synchronized (this) {
                        if (this.f25855y < this.f25854x) {
                            z7 = true;
                        } else {
                            this.f25854x++;
                            z7 = false;
                        }
                    }
                    if (z7) {
                        this.m29158W0(null);
                        return -1L;
                    }
                    this.m29171A1(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public final void m29158W0(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        m29175V0(errorCode, errorCode, iOException);
    }

    /* JADX INFO: renamed from: j1 */
    private final Http2Stream m29161j1(int i7, List list, boolean z7) throws Throwable {
        Throwable th;
        boolean z8 = true;
        boolean z9 = !z7;
        synchronized (this.f25839K) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f25847f > 1073741823) {
                                try {
                                    m29198u1(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            try {
                                if (this.f25848r) {
                                    throw new ConnectionShutdownException();
                                }
                                int i8 = this.f25847f;
                                this.f25847f = i8 + 2;
                                Http2Stream http2Stream = new Http2Stream(i8, this, z9, false, null);
                                if (z7 && this.f25836H < this.f25837I && http2Stream.m29282r() < http2Stream.m29281q()) {
                                    z8 = false;
                                }
                                if (http2Stream.m29285u()) {
                                    this.f25844c.put(Integer.valueOf(i8), http2Stream);
                                }
                                C1444v c1444v = C1444v.f4971a;
                                if (i7 == 0) {
                                    this.f25839K.m29304J(z9, i8, list);
                                } else {
                                    if (this.f25842a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f25839K.m29305Q(i7, i8, list);
                                }
                                if (z8) {
                                    this.f25839K.flush();
                                }
                                return http2Stream;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    public static /* synthetic */ void m29169w1(Http2Connection http2Connection, boolean z7, TaskRunner taskRunner, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            taskRunner = TaskRunner.f25606i;
        }
        http2Connection.m29199v1(z7, taskRunner);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m29171A1(boolean z7, int i7, int i8) {
        try {
            this.f25839K.m29307b(z7, i7, i8);
        } catch (IOException e7) {
            m29158W0(e7);
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m29172B1(int i7, ErrorCode statusCode) {
        AbstractC6118n.m27187e(statusCode, "statusCode");
        this.f25839K.m29309d0(i7, statusCode);
    }

    /* JADX INFO: renamed from: C1 */
    public final void m29173C1(final int i7, final ErrorCode errorCode) {
        AbstractC6118n.m27187e(errorCode, "errorCode");
        TaskQueue taskQueue = this.f25850t;
        final String str = this.f25845d + '[' + i7 + "] writeSynReset";
        final boolean z7 = true;
        taskQueue.m28902i(new Task(str, z7) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                try {
                    this.m29172B1(i7, errorCode);
                    return -1L;
                } catch (IOException e7) {
                    this.m29158W0(e7);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m29174D1(final int i7, final long j7) {
        TaskQueue taskQueue = this.f25850t;
        final String str = this.f25845d + '[' + i7 + "] windowUpdate";
        final boolean z7 = true;
        taskQueue.m28902i(new Task(str, z7) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                try {
                    this.m29186h1().m29306a(i7, j7);
                    return -1L;
                } catch (IOException e7) {
                    this.m29158W0(e7);
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m29175V0(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i7;
        Object[] array;
        AbstractC6118n.m27187e(connectionCode, "connectionCode");
        AbstractC6118n.m27187e(streamCode, "streamCode");
        if (Util.f25484h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m29198u1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f25844c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f25844c.values().toArray(new Http2Stream[0]);
                    this.f25844c.clear();
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) array;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.m29269d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f25839K.close();
        } catch (IOException unused3) {
        }
        try {
            this.f25838J.close();
        } catch (IOException unused4) {
        }
        this.f25850t.m28906n();
        this.f25851u.m28906n();
        this.f25852v.m28906n();
    }

    /* JADX INFO: renamed from: X0 */
    public final boolean m29176X0() {
        return this.f25842a;
    }

    /* JADX INFO: renamed from: Y0 */
    public final String m29177Y0() {
        return this.f25845d;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m29178Z0() {
        return this.f25846e;
    }

    /* JADX INFO: renamed from: a1 */
    public final Listener m29179a1() {
        return this.f25843b;
    }

    /* JADX INFO: renamed from: b1 */
    public final int m29180b1() {
        return this.f25847f;
    }

    /* JADX INFO: renamed from: c1 */
    public final Settings m29181c1() {
        return this.f25832D;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m29175V0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    /* JADX INFO: renamed from: d1 */
    public final Settings m29182d1() {
        return this.f25833E;
    }

    /* JADX INFO: renamed from: e1 */
    public final synchronized Http2Stream m29183e1(int i7) {
        return (Http2Stream) this.f25844c.get(Integer.valueOf(i7));
    }

    /* JADX INFO: renamed from: f1 */
    public final Map m29184f1() {
        return this.f25844c;
    }

    public final void flush() {
        this.f25839K.flush();
    }

    /* JADX INFO: renamed from: g1 */
    public final long m29185g1() {
        return this.f25837I;
    }

    /* JADX INFO: renamed from: h1 */
    public final Http2Writer m29186h1() {
        return this.f25839K;
    }

    /* JADX INFO: renamed from: i1 */
    public final synchronized boolean m29187i1(long j7) {
        if (this.f25848r) {
            return false;
        }
        return this.f25829A >= this.f25856z || j7 < this.f25831C;
    }

    /* JADX INFO: renamed from: k1 */
    public final Http2Stream m29188k1(List requestHeaders, boolean z7) {
        AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
        return m29161j1(0, requestHeaders, z7);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m29189l1(final int i7, InterfaceC0650g source, final int i8, final boolean z7) {
        AbstractC6118n.m27187e(source, "source");
        final C0648e c0648e = new C0648e();
        long j7 = i8;
        source.mo3011G0(j7);
        source.mo2949w(c0648e, j7);
        TaskQueue taskQueue = this.f25851u;
        final String str = this.f25845d + '[' + i7 + "] onData";
        final boolean z8 = true;
        taskQueue.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                try {
                    boolean zMo29322a = this.f25853w.mo29322a(i7, c0648e, i8, z7);
                    if (zMo29322a) {
                        this.m29186h1().m29309d0(i7, ErrorCode.CANCEL);
                    }
                    if (!zMo29322a && !z7) {
                        return -1L;
                    }
                    synchronized (this) {
                        this.f25841M.remove(Integer.valueOf(i7));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: m1 */
    public final void m29190m1(final int i7, final List requestHeaders, final boolean z7) {
        AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.f25851u;
        final String str = this.f25845d + '[' + i7 + "] onHeaders";
        final boolean z8 = true;
        taskQueue.m28902i(new Task(str, z8) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                boolean zMo29324c = this.f25853w.mo29324c(i7, requestHeaders, z7);
                if (zMo29324c) {
                    try {
                        this.m29186h1().m29309d0(i7, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!zMo29324c && !z7) {
                    return -1L;
                }
                synchronized (this) {
                    this.f25841M.remove(Integer.valueOf(i7));
                }
                return -1L;
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m29191n1(final int i7, final List requestHeaders) throws Throwable {
        Throwable th;
        AbstractC6118n.m27187e(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f25841M.contains(Integer.valueOf(i7))) {
                    this.f25841M.add(Integer.valueOf(i7));
                    TaskQueue taskQueue = this.f25851u;
                    final String str = this.f25845d + '[' + i7 + "] onRequest";
                    final boolean z7 = true;
                    taskQueue.m28902i(new Task(str, z7) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                        @Override // okhttp3.internal.concurrent.Task
                        /* JADX INFO: renamed from: f */
                        public long mo28863f() {
                            if (!this.f25853w.mo29323b(i7, requestHeaders)) {
                                return -1L;
                            }
                            try {
                                this.m29186h1().m29309d0(i7, ErrorCode.CANCEL);
                                synchronized (this) {
                                    this.f25841M.remove(Integer.valueOf(i7));
                                }
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }, 0L);
                    return;
                }
                try {
                    m29173C1(i7, ErrorCode.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m29192o1(final int i7, final ErrorCode errorCode) {
        AbstractC6118n.m27187e(errorCode, "errorCode");
        TaskQueue taskQueue = this.f25851u;
        final String str = this.f25845d + '[' + i7 + "] onReset";
        final boolean z7 = true;
        taskQueue.m28902i(new Task(str, z7) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                this.f25853w.mo29325d(i7, errorCode);
                synchronized (this) {
                    this.f25841M.remove(Integer.valueOf(i7));
                    C1444v c1444v = C1444v.f4971a;
                }
                return -1L;
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: p1 */
    public final boolean m29193p1(int i7) {
        return i7 != 0 && (i7 & 1) == 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final synchronized Http2Stream m29194q1(int i7) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f25844c.remove(Integer.valueOf(i7));
        AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m29195r1() {
        synchronized (this) {
            long j7 = this.f25829A;
            long j8 = this.f25856z;
            if (j7 < j8) {
                return;
            }
            this.f25856z = j8 + 1;
            this.f25831C = System.nanoTime() + ((long) 1000000000);
            C1444v c1444v = C1444v.f4971a;
            TaskQueue taskQueue = this.f25850t;
            final String str = this.f25845d + " ping";
            final boolean z7 = true;
            taskQueue.m28902i(new Task(str, z7) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                /* JADX INFO: renamed from: f */
                public long mo28863f() {
                    this.m29171A1(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m29196s1(int i7) {
        this.f25846e = i7;
    }

    /* JADX INFO: renamed from: t1 */
    public final void m29197t1(Settings settings) {
        AbstractC6118n.m27187e(settings, "<set-?>");
        this.f25833E = settings;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m29198u1(ErrorCode statusCode) {
        AbstractC6118n.m27187e(statusCode, "statusCode");
        synchronized (this.f25839K) {
            C6130z c6130z = new C6130z();
            synchronized (this) {
                if (this.f25848r) {
                    return;
                }
                this.f25848r = true;
                int i7 = this.f25846e;
                c6130z.f23887a = i7;
                C1444v c1444v = C1444v.f4971a;
                this.f25839K.m29314x(i7, statusCode, Util.f25477a);
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m29199v1(boolean z7, TaskRunner taskRunner) {
        AbstractC6118n.m27187e(taskRunner, "taskRunner");
        if (z7) {
            this.f25839K.m29303H();
            this.f25839K.m29311k0(this.f25832D);
            int iM29328c = this.f25832D.m29328c();
            if (iM29328c != 65535) {
                this.f25839K.m29306a(0, iM29328c - 65535);
            }
        }
        TaskQueue taskQueueM28916i = taskRunner.m28916i();
        final String str = this.f25845d;
        final ReaderRunnable readerRunnable = this.f25840L;
        final boolean z8 = true;
        taskQueueM28916i.m28902i(new Task(str, z8) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            /* JADX INFO: renamed from: f */
            public long mo28863f() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: x1 */
    public final synchronized void m29200x1(long j7) {
        long j8 = this.f25834F + j7;
        this.f25834F = j8;
        long j9 = j8 - this.f25835G;
        if (j9 >= this.f25832D.m29328c() / 2) {
            m29174D1(0, j9);
            this.f25835G += j9;
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m29201y1(int i7, boolean z7, C0648e c0648e, long j7) {
        long j8;
        long j9;
        int iMin;
        long j10;
        if (j7 == 0) {
            this.f25839K.m29310j0(z7, i7, c0648e, 0);
            return;
        }
        while (j7 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j8 = this.f25836H;
                            j9 = this.f25837I;
                            if (j8 >= j9) {
                                if (!this.f25844c.containsKey(Integer.valueOf(i7))) {
                                    throw new IOException("stream closed");
                                }
                                AbstractC6118n.m27185c(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j7, j9 - j8), this.f25839K.m29302E0());
                j10 = iMin;
                this.f25836H += j10;
                C1444v c1444v = C1444v.f4971a;
            }
            j7 -= j10;
            this.f25839K.m29310j0(z7 && j7 == 0, i7, c0648e, iMin);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final void m29202z1(int i7, boolean z7, List alternating) {
        AbstractC6118n.m27187e(alternating, "alternating");
        this.f25839K.m29304J(z7, i7, alternating);
    }
}
