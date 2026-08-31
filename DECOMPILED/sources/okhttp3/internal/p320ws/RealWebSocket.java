package okhttp3.internal.p320ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Call;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.connection.Exchange;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p278j6.C5904f;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {

    /* JADX INFO: renamed from: y */
    public static final Companion f26061y = new Companion(null);

    /* JADX INFO: renamed from: z */
    private static final List f26062z = AbstractC1638q.m6759d(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    private final WebSocketListener f26063a;

    /* JADX INFO: renamed from: b */
    private final Random f26064b;

    /* JADX INFO: renamed from: c */
    private final long f26065c;

    /* JADX INFO: renamed from: d */
    private WebSocketExtensions f26066d;

    /* JADX INFO: renamed from: e */
    private long f26067e;

    /* JADX INFO: renamed from: f */
    private final String f26068f;

    /* JADX INFO: renamed from: g */
    private Call f26069g;

    /* JADX INFO: renamed from: h */
    private Task f26070h;

    /* JADX INFO: renamed from: i */
    private WebSocketReader f26071i;

    /* JADX INFO: renamed from: j */
    private WebSocketWriter f26072j;

    /* JADX INFO: renamed from: k */
    private TaskQueue f26073k;

    /* JADX INFO: renamed from: l */
    private String f26074l;

    /* JADX INFO: renamed from: m */
    private Streams f26075m;

    /* JADX INFO: renamed from: n */
    private final ArrayDeque f26076n;

    /* JADX INFO: renamed from: o */
    private final ArrayDeque f26077o;

    /* JADX INFO: renamed from: p */
    private long f26078p;

    /* JADX INFO: renamed from: q */
    private boolean f26079q;

    /* JADX INFO: renamed from: r */
    private int f26080r;

    /* JADX INFO: renamed from: s */
    private String f26081s;

    /* JADX INFO: renamed from: t */
    private boolean f26082t;

    /* JADX INFO: renamed from: u */
    private int f26083u;

    /* JADX INFO: renamed from: v */
    private int f26084v;

    /* JADX INFO: renamed from: w */
    private int f26085w;

    /* JADX INFO: renamed from: x */
    private boolean f26086x;

    public static final class Close {

        /* JADX INFO: renamed from: a */
        private final int f26087a;

        /* JADX INFO: renamed from: b */
        private final C0651h f26088b;

        /* JADX INFO: renamed from: c */
        private final long f26089c;

        public Close(int i7, C0651h c0651h, long j7) {
            this.f26087a = i7;
            this.f26088b = c0651h;
            this.f26089c = j7;
        }

        /* JADX INFO: renamed from: a */
        public final long m29472a() {
            return this.f26089c;
        }

        /* JADX INFO: renamed from: b */
        public final int m29473b() {
            return this.f26087a;
        }

        /* JADX INFO: renamed from: c */
        public final C0651h m29474c() {
            return this.f26088b;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Message {

        /* JADX INFO: renamed from: a */
        private final int f26090a;

        /* JADX INFO: renamed from: b */
        private final C0651h f26091b;

        /* JADX INFO: renamed from: a */
        public final C0651h m29475a() {
            return this.f26091b;
        }

        /* JADX INFO: renamed from: b */
        public final int m29476b() {
            return this.f26090a;
        }
    }

    public static abstract class Streams implements Closeable {

        /* JADX INFO: renamed from: a */
        private final boolean f26092a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC0650g f26093b;

        /* JADX INFO: renamed from: c */
        private final InterfaceC0649f f26094c;

        public Streams(boolean z7, InterfaceC0650g source, InterfaceC0649f sink) {
            AbstractC6118n.m27187e(source, "source");
            AbstractC6118n.m27187e(sink, "sink");
            this.f26092a = z7;
            this.f26093b = source;
            this.f26094c = sink;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m29477d() {
            return this.f26092a;
        }

        /* JADX INFO: renamed from: m */
        public final InterfaceC0649f m29478m() {
            return this.f26094c;
        }

        /* JADX INFO: renamed from: n */
        public final InterfaceC0650g m29479n() {
            return this.f26093b;
        }
    }

    private final class WriterTask extends Task {
        public WriterTask() {
            super(RealWebSocket.this.f26074l + " writer", false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.Task
        /* JADX INFO: renamed from: f */
        public long mo28863f() {
            try {
                return RealWebSocket.this.m29470t() ? 0L : -1L;
            } catch (IOException e7) {
                RealWebSocket.this.m29466n(e7, null);
                return -1L;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final boolean m29455q(WebSocketExtensions webSocketExtensions) {
        if (!webSocketExtensions.f26107f && webSocketExtensions.f26103b == null) {
            return webSocketExtensions.f26105d == null || new C5904f(8, 15).m26649m(webSocketExtensions.f26105d.intValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private final void m29456s() {
        if (!Util.f25484h || Thread.holdsLock(this)) {
            Task task = this.f26070h;
            if (task != null) {
                TaskQueue.m28893j(this.f26073k, task, 0L, 2, null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    /* JADX INFO: renamed from: a */
    public synchronized void mo29457a(C0651h payload) {
        AbstractC6118n.m27187e(payload, "payload");
        this.f26085w++;
        this.f26086x = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    /* JADX INFO: renamed from: b */
    public void mo29458b(String text) {
        AbstractC6118n.m27187e(text, "text");
        this.f26063a.m28725e(this, text);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    /* JADX INFO: renamed from: c */
    public void mo29459c(C0651h bytes) {
        AbstractC6118n.m27187e(bytes, "bytes");
        this.f26063a.m28724d(this, bytes);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    /* JADX INFO: renamed from: d */
    public synchronized void mo29460d(C0651h payload) {
        try {
            AbstractC6118n.m27187e(payload, "payload");
            if (!this.f26082t && (!this.f26079q || !this.f26077o.isEmpty())) {
                this.f26076n.add(payload);
                m29456s();
                this.f26084v++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    /* JADX INFO: renamed from: e */
    public void mo29461e(int i7, String reason) {
        Streams streams;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        AbstractC6118n.m27187e(reason, "reason");
        if (i7 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            try {
                if (this.f26080r != -1) {
                    throw new IllegalStateException("already closed");
                }
                this.f26080r = i7;
                this.f26081s = reason;
                streams = null;
                if (this.f26079q && this.f26077o.isEmpty()) {
                    Streams streams2 = this.f26075m;
                    this.f26075m = null;
                    webSocketReader = this.f26071i;
                    this.f26071i = null;
                    webSocketWriter = this.f26072j;
                    this.f26072j = null;
                    this.f26073k.m28906n();
                    streams = streams2;
                } else {
                    webSocketReader = null;
                    webSocketWriter = null;
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            this.f26063a.m28722b(this, i7, reason);
            if (streams != null) {
                this.f26063a.m28721a(this, i7, reason);
            }
        } finally {
            if (streams != null) {
                Util.m28773m(streams);
            }
            if (webSocketReader != null) {
                Util.m28773m(webSocketReader);
            }
            if (webSocketWriter != null) {
                Util.m28773m(webSocketWriter);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m29462j() {
        Call call = this.f26069g;
        AbstractC6118n.m27184b(call);
        call.cancel();
    }

    /* JADX INFO: renamed from: k */
    public final void m29463k(Response response, Exchange exchange) throws ProtocolException {
        AbstractC6118n.m27187e(response, "response");
        if (response.m28672J() != 101) {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.m28672J() + ' ' + response.m28688w0() + '\'');
        }
        String strM28671l0 = Response.m28671l0(response, "Connection", null, 2, null);
        if (!AbstractC6406h.m27564w("Upgrade", strM28671l0, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strM28671l0 + '\'');
        }
        String strM28671l1 = Response.m28671l0(response, "Upgrade", null, 2, null);
        if (!AbstractC6406h.m27564w("websocket", strM28671l1, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strM28671l1 + '\'');
        }
        String strM28671l2 = Response.m28671l0(response, "Sec-WebSocket-Accept", null, 2, null);
        String strMo3096c = C0651h.f2562d.m3114d(this.f26068f + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").m3088C().mo3096c();
        if (AbstractC6118n.m27183a(strMo3096c, strM28671l2)) {
            if (exchange == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo3096c + "' but was '" + strM28671l2 + '\'');
    }

    /* JADX INFO: renamed from: l */
    public boolean m29464l(int i7, String str) {
        return m29465m(i7, str, 60000L);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized boolean m29465m(int i7, String str, long j7) {
        C0651h c0651hM3114d;
        try {
            WebSocketProtocol.f26108a.m29484c(i7);
            if (str != null) {
                c0651hM3114d = C0651h.f2562d.m3114d(str);
                if (c0651hM3114d.m3090F() > 123) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            } else {
                c0651hM3114d = null;
            }
            if (!this.f26082t && !this.f26079q) {
                this.f26079q = true;
                this.f26077o.add(new Close(i7, c0651hM3114d, j7));
                m29456s();
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m29466n(Exception e7, Response response) {
        AbstractC6118n.m27187e(e7, "e");
        synchronized (this) {
            if (this.f26082t) {
                return;
            }
            this.f26082t = true;
            Streams streams = this.f26075m;
            this.f26075m = null;
            WebSocketReader webSocketReader = this.f26071i;
            this.f26071i = null;
            WebSocketWriter webSocketWriter = this.f26072j;
            this.f26072j = null;
            this.f26073k.m28906n();
            C1444v c1444v = C1444v.f4971a;
            try {
                this.f26063a.m28723c(this, e7, response);
            } finally {
                if (streams != null) {
                    Util.m28773m(streams);
                }
                if (webSocketReader != null) {
                    Util.m28773m(webSocketReader);
                }
                if (webSocketWriter != null) {
                    Util.m28773m(webSocketWriter);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final WebSocketListener m29467o() {
        return this.f26063a;
    }

    /* JADX INFO: renamed from: p */
    public final void m29468p(String name, Streams streams) throws Throwable {
        Throwable th;
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(streams, "streams");
        WebSocketExtensions webSocketExtensions = this.f26066d;
        AbstractC6118n.m27184b(webSocketExtensions);
        synchronized (this) {
            try {
                this.f26074l = name;
                this.f26075m = streams;
                this.f26072j = new WebSocketWriter(streams.m29477d(), streams.m29478m(), this.f26064b, webSocketExtensions.f26102a, webSocketExtensions.m29480a(streams.m29477d()), this.f26067e);
                this.f26070h = new WriterTask();
                long j7 = this.f26065c;
                if (j7 != 0) {
                    try {
                        final long nanos = TimeUnit.MILLISECONDS.toNanos(j7);
                        final String str = name + " ping";
                        this.f26073k.m28902i(new Task(str) { // from class: okhttp3.internal.ws.RealWebSocket$initReaderAndWriter$lambda$3$$inlined$schedule$1
                            @Override // okhttp3.internal.concurrent.Task
                            /* JADX INFO: renamed from: f */
                            public long mo28863f() {
                                this.m29471u();
                                return nanos;
                            }
                        }, nanos);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (!this.f26077o.isEmpty()) {
                    m29456s();
                }
                C1444v c1444v = C1444v.f4971a;
                this.f26071i = new WebSocketReader(streams.m29477d(), streams.m29479n(), this, webSocketExtensions.f26102a, webSocketExtensions.m29480a(!streams.m29477d()));
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m29469r() {
        while (this.f26080r == -1) {
            WebSocketReader webSocketReader = this.f26071i;
            AbstractC6118n.m27184b(webSocketReader);
            webSocketReader.m29490d();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m29470t() {
        String str;
        WebSocketReader webSocketReader;
        WebSocketWriter webSocketWriter;
        int i7;
        Streams streams;
        synchronized (this) {
            try {
                if (this.f26082t) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.f26072j;
                Object objPoll = this.f26076n.poll();
                final boolean z7 = true;
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.f26077o.poll();
                    if (objPoll2 instanceof Close) {
                        i7 = this.f26080r;
                        str = this.f26081s;
                        if (i7 != -1) {
                            streams = this.f26075m;
                            this.f26075m = null;
                            webSocketReader = this.f26071i;
                            this.f26071i = null;
                            webSocketWriter = this.f26072j;
                            this.f26072j = null;
                            this.f26073k.m28906n();
                        } else {
                            long jM29472a = ((Close) objPoll2).m29472a();
                            TaskQueue taskQueue = this.f26073k;
                            final String str2 = this.f26074l + " cancel";
                            taskQueue.m28902i(new Task(str2, z7) { // from class: okhttp3.internal.ws.RealWebSocket$writeOneFrame$lambda$8$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                /* JADX INFO: renamed from: f */
                                public long mo28863f() {
                                    this.m29462j();
                                    return -1L;
                                }
                            }, TimeUnit.MILLISECONDS.toNanos(jM29472a));
                            streams = null;
                            webSocketReader = null;
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        webSocketReader = null;
                        webSocketWriter = null;
                        i7 = -1;
                        streams = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    webSocketReader = null;
                    webSocketWriter = null;
                    i7 = -1;
                    streams = null;
                }
                C1444v c1444v = C1444v.f4971a;
                try {
                    if (objPoll != null) {
                        AbstractC6118n.m27184b(webSocketWriter2);
                        webSocketWriter2.m29492J((C0651h) objPoll);
                    } else if (obj instanceof Message) {
                        Message message = (Message) obj;
                        AbstractC6118n.m27184b(webSocketWriter2);
                        webSocketWriter2.m29494n(message.m29476b(), message.m29475a());
                        synchronized (this) {
                            this.f26078p -= (long) message.m29475a().m3090F();
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        Close close = (Close) obj;
                        AbstractC6118n.m27184b(webSocketWriter2);
                        webSocketWriter2.m29493d(close.m29473b(), close.m29474c());
                        if (streams != null) {
                            WebSocketListener webSocketListener = this.f26063a;
                            AbstractC6118n.m27184b(str);
                            webSocketListener.m28721a(this, i7, str);
                        }
                    }
                    if (streams != null) {
                        Util.m28773m(streams);
                    }
                    if (webSocketReader != null) {
                        Util.m28773m(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.m28773m(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th) {
                    if (streams != null) {
                        Util.m28773m(streams);
                    }
                    if (webSocketReader != null) {
                        Util.m28773m(webSocketReader);
                    }
                    if (webSocketWriter != null) {
                        Util.m28773m(webSocketWriter);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m29471u() {
        synchronized (this) {
            try {
                if (this.f26082t) {
                    return;
                }
                WebSocketWriter webSocketWriter = this.f26072j;
                if (webSocketWriter == null) {
                    return;
                }
                int i7 = this.f26086x ? this.f26083u : -1;
                this.f26083u++;
                this.f26086x = true;
                C1444v c1444v = C1444v.f4971a;
                if (i7 == -1) {
                    try {
                        webSocketWriter.m29495x(C0651h.f2563e);
                        return;
                    } catch (IOException e7) {
                        m29466n(e7, null);
                        return;
                    }
                }
                m29466n(new SocketTimeoutException("sent ping but didn't receive pong within " + this.f26065c + "ms (after " + (i7 - 1) + " successful ping/pongs)"), null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
