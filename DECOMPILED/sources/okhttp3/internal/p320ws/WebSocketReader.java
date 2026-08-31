package okhttp3.internal.p320ws;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketReader implements Closeable {

    /* JADX INFO: renamed from: A */
    private final C0648e.a f26109A;

    /* JADX INFO: renamed from: a */
    private final boolean f26110a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0650g f26111b;

    /* JADX INFO: renamed from: c */
    private final FrameCallback f26112c;

    /* JADX INFO: renamed from: d */
    private final boolean f26113d;

    /* JADX INFO: renamed from: e */
    private final boolean f26114e;

    /* JADX INFO: renamed from: f */
    private boolean f26115f;

    /* JADX INFO: renamed from: r */
    private int f26116r;

    /* JADX INFO: renamed from: s */
    private long f26117s;

    /* JADX INFO: renamed from: t */
    private boolean f26118t;

    /* JADX INFO: renamed from: u */
    private boolean f26119u;

    /* JADX INFO: renamed from: v */
    private boolean f26120v;

    /* JADX INFO: renamed from: w */
    private final C0648e f26121w;

    /* JADX INFO: renamed from: x */
    private final C0648e f26122x;

    /* JADX INFO: renamed from: y */
    private MessageInflater f26123y;

    /* JADX INFO: renamed from: z */
    private final byte[] f26124z;

    public interface FrameCallback {
        /* JADX INFO: renamed from: a */
        void mo29457a(C0651h c0651h);

        /* JADX INFO: renamed from: b */
        void mo29458b(String str);

        /* JADX INFO: renamed from: c */
        void mo29459c(C0651h c0651h);

        /* JADX INFO: renamed from: d */
        void mo29460d(C0651h c0651h);

        /* JADX INFO: renamed from: e */
        void mo29461e(int i7, String str);
    }

    public WebSocketReader(boolean z7, InterfaceC0650g source, FrameCallback frameCallback, boolean z8, boolean z9) {
        AbstractC6118n.m27187e(source, "source");
        AbstractC6118n.m27187e(frameCallback, "frameCallback");
        this.f26110a = z7;
        this.f26111b = source;
        this.f26112c = frameCallback;
        this.f26113d = z8;
        this.f26114e = z9;
        this.f26121w = new C0648e();
        this.f26122x = new C0648e();
        this.f26124z = z7 ? null : new byte[4];
        this.f26109A = z7 ? null : new C0648e.a();
    }

    /* JADX INFO: renamed from: J */
    private final void m29485J() throws IOException {
        int i7 = this.f26116r;
        if (i7 != 1 && i7 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.m28749R(i7));
        }
        m29489x();
        if (this.f26120v) {
            MessageInflater messageInflater = this.f26123y;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.f26114e);
                this.f26123y = messageInflater;
            }
            messageInflater.m29450d(this.f26122x);
        }
        if (i7 == 1) {
            this.f26112c.mo29458b(this.f26122x.m3042e1());
        } else {
            this.f26112c.mo29459c(this.f26122x.m3034a1());
        }
    }

    /* JADX INFO: renamed from: Q */
    private final void m29486Q() throws IOException {
        while (!this.f26115f) {
            m29488n();
            if (!this.f26119u) {
                return;
            } else {
                m29487m();
            }
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m29487m() throws ProtocolException, EOFException {
        short s7;
        String strM3042e1;
        long j7 = this.f26117s;
        if (j7 > 0) {
            this.f26111b.mo3026U(this.f26121w, j7);
            if (!this.f26110a) {
                C0648e c0648e = this.f26121w;
                C0648e.a aVar = this.f26109A;
                AbstractC6118n.m27184b(aVar);
                c0648e.m3032X0(aVar);
                this.f26109A.m3083x(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.f26108a;
                C0648e.a aVar2 = this.f26109A;
                byte[] bArr = this.f26124z;
                AbstractC6118n.m27184b(bArr);
                webSocketProtocol.m29483b(aVar2, bArr);
                this.f26109A.close();
            }
        }
        switch (this.f26116r) {
            case 8:
                long jM3046h1 = this.f26121w.m3046h1();
                if (jM3046h1 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (jM3046h1 != 0) {
                    s7 = this.f26121w.readShort();
                    strM3042e1 = this.f26121w.m3042e1();
                    String strM29482a = WebSocketProtocol.f26108a.m29482a(s7);
                    if (strM29482a != null) {
                        throw new ProtocolException(strM29482a);
                    }
                } else {
                    s7 = 1005;
                    strM3042e1 = "";
                }
                this.f26112c.mo29461e(s7, strM3042e1);
                this.f26115f = true;
                return;
            case 9:
                this.f26112c.mo29460d(this.f26121w.m3034a1());
                return;
            case 10:
                this.f26112c.mo29457a(this.f26121w.m3034a1());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.m28749R(this.f26116r));
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m29488n() throws IOException {
        boolean z7;
        if (this.f26115f) {
            throw new IOException("closed");
        }
        long jMo2957h = this.f26111b.mo2948g().mo2957h();
        this.f26111b.mo2948g().mo2951b();
        try {
            int iM28764d = Util.m28764d(this.f26111b.readByte(), 255);
            this.f26111b.mo2948g().mo2956g(jMo2957h, TimeUnit.NANOSECONDS);
            int i7 = iM28764d & 15;
            this.f26116r = i7;
            boolean z8 = (iM28764d & 128) != 0;
            this.f26118t = z8;
            boolean z9 = (iM28764d & 8) != 0;
            this.f26119u = z9;
            if (z9 && !z8) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z10 = (iM28764d & 64) != 0;
            if (i7 == 1 || i7 == 2) {
                if (!z10) {
                    z7 = false;
                } else {
                    if (!this.f26113d) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z7 = true;
                }
                this.f26120v = z7;
            } else if (z10) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((iM28764d & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((iM28764d & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int iM28764d2 = Util.m28764d(this.f26111b.readByte(), 255);
            boolean z11 = (iM28764d2 & 128) != 0;
            if (z11 == this.f26110a) {
                throw new ProtocolException(this.f26110a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j7 = iM28764d2 & 127;
            this.f26117s = j7;
            if (j7 == 126) {
                this.f26117s = Util.m28765e(this.f26111b.readShort(), 65535);
            } else if (j7 == 127) {
                long j8 = this.f26111b.readLong();
                this.f26117s = j8;
                if (j8 < 0) {
                    throw new ProtocolException("Frame length 0x" + Util.m28750S(this.f26117s) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.f26119u && this.f26117s > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z11) {
                InterfaceC0650g interfaceC0650g = this.f26111b;
                byte[] bArr = this.f26124z;
                AbstractC6118n.m27184b(bArr);
                interfaceC0650g.readFully(bArr);
            }
        } catch (Throwable th) {
            this.f26111b.mo2948g().mo2956g(jMo2957h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m29489x() throws IOException {
        while (!this.f26115f) {
            long j7 = this.f26117s;
            if (j7 > 0) {
                this.f26111b.mo3026U(this.f26122x, j7);
                if (!this.f26110a) {
                    C0648e c0648e = this.f26122x;
                    C0648e.a aVar = this.f26109A;
                    AbstractC6118n.m27184b(aVar);
                    c0648e.m3032X0(aVar);
                    this.f26109A.m3083x(this.f26122x.m3046h1() - this.f26117s);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.f26108a;
                    C0648e.a aVar2 = this.f26109A;
                    byte[] bArr = this.f26124z;
                    AbstractC6118n.m27184b(bArr);
                    webSocketProtocol.m29483b(aVar2, bArr);
                    this.f26109A.close();
                }
            }
            if (this.f26118t) {
                return;
            }
            m29486Q();
            if (this.f26116r != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.m28749R(this.f26116r));
            }
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.f26123y;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m29490d() {
        m29488n();
        if (this.f26119u) {
            m29487m();
        } else {
            m29485J();
        }
    }
}
