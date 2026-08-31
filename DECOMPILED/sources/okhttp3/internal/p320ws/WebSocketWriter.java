package okhttp3.internal.p320ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketWriter implements Closeable {

    /* JADX INFO: renamed from: a */
    private final boolean f26125a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0649f f26126b;

    /* JADX INFO: renamed from: c */
    private final Random f26127c;

    /* JADX INFO: renamed from: d */
    private final boolean f26128d;

    /* JADX INFO: renamed from: e */
    private final boolean f26129e;

    /* JADX INFO: renamed from: f */
    private final long f26130f;

    /* JADX INFO: renamed from: r */
    private final C0648e f26131r;

    /* JADX INFO: renamed from: s */
    private final C0648e f26132s;

    /* JADX INFO: renamed from: t */
    private boolean f26133t;

    /* JADX INFO: renamed from: u */
    private MessageDeflater f26134u;

    /* JADX INFO: renamed from: v */
    private final byte[] f26135v;

    /* JADX INFO: renamed from: w */
    private final C0648e.a f26136w;

    public WebSocketWriter(boolean z7, InterfaceC0649f sink, Random random, boolean z8, boolean z9, long j7) {
        AbstractC6118n.m27187e(sink, "sink");
        AbstractC6118n.m27187e(random, "random");
        this.f26125a = z7;
        this.f26126b = sink;
        this.f26127c = random;
        this.f26128d = z8;
        this.f26129e = z9;
        this.f26130f = j7;
        this.f26131r = new C0648e();
        this.f26132s = sink.mo3043f();
        this.f26135v = z7 ? new byte[4] : null;
        this.f26136w = z7 ? new C0648e.a() : null;
    }

    /* JADX INFO: renamed from: m */
    private final void m29491m(int i7, C0651h c0651h) throws IOException {
        if (this.f26133t) {
            throw new IOException("closed");
        }
        int iM3090F = c0651h.m3090F();
        if (iM3090F > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.f26132s.mo3010F(i7 | 128);
        if (this.f26125a) {
            this.f26132s.mo3010F(iM3090F | 128);
            Random random = this.f26127c;
            byte[] bArr = this.f26135v;
            AbstractC6118n.m27184b(bArr);
            random.nextBytes(bArr);
            this.f26132s.mo3070u0(this.f26135v);
            if (iM3090F > 0) {
                long jM3046h1 = this.f26132s.m3046h1();
                this.f26132s.mo3017N0(c0651h);
                C0648e c0648e = this.f26132s;
                C0648e.a aVar = this.f26136w;
                AbstractC6118n.m27184b(aVar);
                c0648e.m3032X0(aVar);
                this.f26136w.m3083x(jM3046h1);
                WebSocketProtocol.f26108a.m29483b(this.f26136w, this.f26135v);
                this.f26136w.close();
            }
        } else {
            this.f26132s.mo3010F(iM3090F);
            this.f26132s.mo3017N0(c0651h);
        }
        this.f26126b.flush();
    }

    /* JADX INFO: renamed from: J */
    public final void m29492J(C0651h payload) throws IOException {
        AbstractC6118n.m27187e(payload, "payload");
        m29491m(10, payload);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        MessageDeflater messageDeflater = this.f26134u;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29493d(int i7, C0651h c0651h) {
        C0651h c0651hM3034a1 = C0651h.f2563e;
        if (i7 != 0 || c0651h != null) {
            if (i7 != 0) {
                WebSocketProtocol.f26108a.m29484c(i7);
            }
            C0648e c0648e = new C0648e();
            c0648e.mo3072v(i7);
            if (c0651h != null) {
                c0648e.mo3017N0(c0651h);
            }
            c0651hM3034a1 = c0648e.m3034a1();
        }
        try {
            m29491m(8, c0651hM3034a1);
        } finally {
            this.f26133t = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m29494n(int i7, C0651h data) throws IOException {
        AbstractC6118n.m27187e(data, "data");
        if (this.f26133t) {
            throw new IOException("closed");
        }
        this.f26131r.mo3017N0(data);
        int i8 = i7 | 128;
        if (this.f26128d && data.m3090F() >= this.f26130f) {
            MessageDeflater messageDeflater = this.f26134u;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.f26129e);
                this.f26134u = messageDeflater;
            }
            messageDeflater.m29448d(this.f26131r);
            i8 = i7 | 192;
        }
        long jM3046h1 = this.f26131r.m3046h1();
        this.f26132s.mo3010F(i8);
        int i9 = this.f26125a ? 128 : 0;
        if (jM3046h1 <= 125) {
            this.f26132s.mo3010F(i9 | ((int) jM3046h1));
        } else if (jM3046h1 <= 65535) {
            this.f26132s.mo3010F(i9 | 126);
            this.f26132s.mo3072v((int) jM3046h1);
        } else {
            this.f26132s.mo3010F(i9 | 127);
            this.f26132s.m3067s1(jM3046h1);
        }
        if (this.f26125a) {
            Random random = this.f26127c;
            byte[] bArr = this.f26135v;
            AbstractC6118n.m27184b(bArr);
            random.nextBytes(bArr);
            this.f26132s.mo3070u0(this.f26135v);
            if (jM3046h1 > 0) {
                C0648e c0648e = this.f26131r;
                C0648e.a aVar = this.f26136w;
                AbstractC6118n.m27184b(aVar);
                c0648e.m3032X0(aVar);
                this.f26136w.m3083x(0L);
                WebSocketProtocol.f26108a.m29483b(this.f26136w, this.f26135v);
                this.f26136w.close();
            }
        }
        this.f26132s.mo3003I(this.f26131r, jM3046h1);
        this.f26126b.mo3069u();
    }

    /* JADX INFO: renamed from: x */
    public final void m29495x(C0651h payload) throws IOException {
        AbstractC6118n.m27187e(payload, "payload");
        m29491m(9, payload);
    }
}
