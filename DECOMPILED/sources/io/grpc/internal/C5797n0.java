package io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p063H5.C0554l0;
import p063H5.C0558n0;
import p063H5.InterfaceC0522Q;
import p063H5.InterfaceC0553l;
import p063H5.InterfaceC0557n;
import p063H5.InterfaceC0571w;
import p122P3.AbstractC1209m;
import p136R3.AbstractC1332b;

/* JADX INFO: renamed from: io.grpc.internal.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C5797n0 implements InterfaceC5752P {

    /* JADX INFO: renamed from: a */
    private final d f22783a;

    /* JADX INFO: renamed from: c */
    private InterfaceC5764V0 f22785c;

    /* JADX INFO: renamed from: h */
    private final InterfaceC5766W0 f22790h;

    /* JADX INFO: renamed from: i */
    private final C5751O0 f22791i;

    /* JADX INFO: renamed from: j */
    private boolean f22792j;

    /* JADX INFO: renamed from: k */
    private int f22793k;

    /* JADX INFO: renamed from: m */
    private long f22795m;

    /* JADX INFO: renamed from: b */
    private int f22784b = -1;

    /* JADX INFO: renamed from: d */
    private InterfaceC0557n f22786d = InterfaceC0553l.b.f2096a;

    /* JADX INFO: renamed from: e */
    private boolean f22787e = true;

    /* JADX INFO: renamed from: f */
    private final c f22788f = new c();

    /* JADX INFO: renamed from: g */
    private final ByteBuffer f22789g = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: l */
    private int f22794l = -1;

    /* JADX INFO: renamed from: io.grpc.internal.n0$d */
    public interface d {
        /* JADX INFO: renamed from: h */
        void mo25825h(InterfaceC5764V0 interfaceC5764V0, boolean z7, boolean z8, int i7);
    }

    public C5797n0(d dVar, InterfaceC5766W0 interfaceC5766W0, C5751O0 c5751o0) {
        this.f22783a = (d) AbstractC1209m.m5303o(dVar, "sink");
        this.f22790h = (InterfaceC5766W0) AbstractC1209m.m5303o(interfaceC5766W0, "bufferAllocator");
        this.f22791i = (C5751O0) AbstractC1209m.m5303o(c5751o0, "statsTraceCtx");
    }

    /* JADX INFO: renamed from: e */
    private void m26080e(boolean z7, boolean z8) {
        InterfaceC5764V0 interfaceC5764V0 = this.f22785c;
        this.f22785c = null;
        this.f22783a.mo25825h(interfaceC5764V0, z7, z8, this.f22793k);
        this.f22793k = 0;
    }

    /* JADX INFO: renamed from: f */
    private int m26081f(InputStream inputStream) {
        if ((inputStream instanceof InterfaceC0522Q) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    private void m26082g() {
        InterfaceC5764V0 interfaceC5764V0 = this.f22785c;
        if (interfaceC5764V0 != null) {
            interfaceC5764V0.release();
            this.f22785c = null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m26083i() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    /* JADX INFO: renamed from: j */
    private void m26084j(b bVar, boolean z7) {
        int iM26092e = bVar.m26092e();
        int i7 = this.f22784b;
        if (i7 >= 0 && iM26092e > i7) {
            throw C0554l0.f2107n.m2462q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iM26092e), Integer.valueOf(this.f22784b))).m2455d();
        }
        this.f22789g.clear();
        this.f22789g.put(z7 ? (byte) 1 : (byte) 0).putInt(iM26092e);
        InterfaceC5764V0 interfaceC5764V0Mo3409a = this.f22790h.mo3409a(5);
        interfaceC5764V0Mo3409a.mo3408i(this.f22789g.array(), 0, this.f22789g.position());
        if (iM26092e == 0) {
            this.f22785c = interfaceC5764V0Mo3409a;
            return;
        }
        this.f22783a.mo25825h(interfaceC5764V0Mo3409a, false, false, this.f22793k - 1);
        this.f22793k = 1;
        List list = bVar.f22796a;
        for (int i8 = 0; i8 < list.size() - 1; i8++) {
            this.f22783a.mo25825h((InterfaceC5764V0) list.get(i8), false, false, 0);
        }
        this.f22785c = (InterfaceC5764V0) list.get(list.size() - 1);
        this.f22795m = iM26092e;
    }

    /* JADX INFO: renamed from: k */
    private int m26085k(InputStream inputStream, int i7) throws IOException {
        b bVar = new b();
        OutputStream outputStreamMo2445c = this.f22786d.mo2445c(bVar);
        try {
            int iM26088o = m26088o(inputStream, outputStreamMo2445c);
            outputStreamMo2445c.close();
            int i8 = this.f22784b;
            if (i8 >= 0 && iM26088o > i8) {
                throw C0554l0.f2107n.m2462q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iM26088o), Integer.valueOf(this.f22784b))).m2455d();
            }
            m26084j(bVar, true);
            return iM26088o;
        } catch (Throwable th) {
            outputStreamMo2445c.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    private int m26086l(InputStream inputStream, int i7) {
        int i8 = this.f22784b;
        if (i8 >= 0 && i7 > i8) {
            throw C0554l0.f2107n.m2462q(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i7), Integer.valueOf(this.f22784b))).m2455d();
        }
        this.f22789g.clear();
        this.f22789g.put((byte) 0).putInt(i7);
        if (this.f22785c == null) {
            this.f22785c = this.f22790h.mo3409a(this.f22789g.position() + i7);
        }
        m26087m(this.f22789g.array(), 0, this.f22789g.position());
        return m26088o(inputStream, this.f22788f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m26087m(byte[] bArr, int i7, int i8) {
        while (i8 > 0) {
            InterfaceC5764V0 interfaceC5764V0 = this.f22785c;
            if (interfaceC5764V0 != null && interfaceC5764V0.mo3404a() == 0) {
                m26080e(false, false);
            }
            if (this.f22785c == null) {
                this.f22785c = this.f22790h.mo3409a(i8);
            }
            int iMin = Math.min(i8, this.f22785c.mo3404a());
            this.f22785c.mo3408i(bArr, i7, iMin);
            i7 += iMin;
            i8 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    private static int m26088o(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof InterfaceC0571w) {
            return ((InterfaceC0571w) inputStream).mo2532d(outputStream);
        }
        long jM5713b = AbstractC1332b.m5713b(inputStream, outputStream);
        AbstractC1209m.m5297i(jM5713b <= 2147483647L, "Message size overflow: %s", jM5713b);
        return (int) jM5713b;
    }

    /* JADX INFO: renamed from: p */
    private int m26089p(InputStream inputStream, int i7) throws IOException {
        if (i7 != -1) {
            this.f22795m = i7;
            return m26086l(inputStream, i7);
        }
        b bVar = new b();
        int iM26088o = m26088o(inputStream, bVar);
        m26084j(bVar, false);
        return iM26088o;
    }

    @Override // io.grpc.internal.InterfaceC5752P
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f22792j = true;
        InterfaceC5764V0 interfaceC5764V0 = this.f22785c;
        if (interfaceC5764V0 != null && interfaceC5764V0.mo3407e() == 0) {
            m26082g();
        }
        m26080e(true, true);
    }

    @Override // io.grpc.internal.InterfaceC5752P
    /* JADX INFO: renamed from: d */
    public void mo25660d(InputStream inputStream) {
        m26083i();
        this.f22793k++;
        int i7 = this.f22794l + 1;
        this.f22794l = i7;
        this.f22795m = 0L;
        this.f22791i.m25654i(i7);
        boolean z7 = this.f22787e && this.f22786d != InterfaceC0553l.b.f2096a;
        try {
            int iM26081f = m26081f(inputStream);
            int iM26089p = (iM26081f == 0 || !z7) ? m26089p(inputStream, iM26081f) : m26085k(inputStream, iM26081f);
            if (iM26081f != -1 && iM26089p != iM26081f) {
                throw C0554l0.f2112s.m2462q(String.format("Message length inaccurate %s != %s", Integer.valueOf(iM26089p), Integer.valueOf(iM26081f))).m2455d();
            }
            long j7 = iM26089p;
            this.f22791i.m25656k(j7);
            this.f22791i.m25657l(this.f22795m);
            this.f22791i.m25655j(this.f22794l, this.f22795m, j7);
        } catch (C0558n0 e7) {
            throw e7;
        } catch (IOException e8) {
            throw C0554l0.f2112s.m2462q("Failed to frame message").m2461p(e8).m2455d();
        } catch (RuntimeException e9) {
            throw C0554l0.f2112s.m2462q("Failed to frame message").m2461p(e9).m2455d();
        }
    }

    @Override // io.grpc.internal.InterfaceC5752P
    public void flush() {
        InterfaceC5764V0 interfaceC5764V0 = this.f22785c;
        if (interfaceC5764V0 == null || interfaceC5764V0.mo3407e() <= 0) {
            return;
        }
        m26080e(false, true);
    }

    @Override // io.grpc.internal.InterfaceC5752P
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5797n0 mo25659c(InterfaceC0557n interfaceC0557n) {
        this.f22786d = (InterfaceC0557n) AbstractC1209m.m5303o(interfaceC0557n, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.InterfaceC5752P
    public boolean isClosed() {
        return this.f22792j;
    }

    @Override // io.grpc.internal.InterfaceC5752P
    /* JADX INFO: renamed from: n */
    public void mo25661n(int i7) {
        AbstractC1209m.m5309u(this.f22784b == -1, "max size already set");
        this.f22784b = i7;
    }

    /* JADX INFO: renamed from: io.grpc.internal.n0$c */
    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            write(new byte[]{(byte) i7}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            C5797n0.this.m26087m(bArr, i7, i8);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.n0$b */
    private final class b extends OutputStream {

        /* JADX INFO: renamed from: a */
        private final List f22796a;

        /* JADX INFO: renamed from: b */
        private InterfaceC5764V0 f22797b;

        private b() {
            this.f22796a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public int m26092e() {
            Iterator it = this.f22796a.iterator();
            int iMo3407e = 0;
            while (it.hasNext()) {
                iMo3407e += ((InterfaceC5764V0) it.next()).mo3407e();
            }
            return iMo3407e;
        }

        @Override // java.io.OutputStream
        public void write(int i7) {
            InterfaceC5764V0 interfaceC5764V0 = this.f22797b;
            if (interfaceC5764V0 == null || interfaceC5764V0.mo3404a() <= 0) {
                write(new byte[]{(byte) i7}, 0, 1);
            } else {
                this.f22797b.mo3405b((byte) i7);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i7, int i8) {
            if (this.f22797b == null) {
                InterfaceC5764V0 interfaceC5764V0Mo3409a = C5797n0.this.f22790h.mo3409a(i8);
                this.f22797b = interfaceC5764V0Mo3409a;
                this.f22796a.add(interfaceC5764V0Mo3409a);
            }
            while (i8 > 0) {
                int iMin = Math.min(i8, this.f22797b.mo3404a());
                if (iMin == 0) {
                    InterfaceC5764V0 interfaceC5764V0Mo3409a2 = C5797n0.this.f22790h.mo3409a(Math.max(i8, this.f22797b.mo3407e() * 2));
                    this.f22797b = interfaceC5764V0Mo3409a2;
                    this.f22796a.add(interfaceC5764V0Mo3409a2);
                } else {
                    this.f22797b.mo3408i(bArr, i7, iMin);
                    i7 += iMin;
                    i8 -= iMin;
                }
            }
        }
    }
}
