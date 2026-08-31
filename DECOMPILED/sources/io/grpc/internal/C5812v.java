package io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: renamed from: io.grpc.internal.v */
/* JADX INFO: loaded from: classes.dex */
public class C5812v extends AbstractC5772b {

    /* JADX INFO: renamed from: f */
    private static final f f22920f = new a();

    /* JADX INFO: renamed from: r */
    private static final f f22921r = new b();

    /* JADX INFO: renamed from: s */
    private static final f f22922s = new c();

    /* JADX INFO: renamed from: t */
    private static final f f22923t = new d();

    /* JADX INFO: renamed from: u */
    private static final g f22924u = new e();

    /* JADX INFO: renamed from: a */
    private final Deque f22925a;

    /* JADX INFO: renamed from: b */
    private Deque f22926b;

    /* JADX INFO: renamed from: c */
    private int f22927c;

    /* JADX INFO: renamed from: d */
    private final Queue f22928d;

    /* JADX INFO: renamed from: e */
    private boolean f22929e;

    /* JADX INFO: renamed from: io.grpc.internal.v$a */
    class a implements f {
        a() {
        }

        @Override // io.grpc.internal.C5812v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, Void r7, int i8) {
            return interfaceC5819y0.readUnsignedByte();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$b */
    class b implements f {
        b() {
        }

        @Override // io.grpc.internal.C5812v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, Void r7, int i8) {
            interfaceC5819y0.skipBytes(i7);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$c */
    class c implements f {
        c() {
        }

        @Override // io.grpc.internal.C5812v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, byte[] bArr, int i8) {
            interfaceC5819y0.mo3396c0(bArr, i8, i7);
            return i8 + i7;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$d */
    class d implements f {
        d() {
        }

        @Override // io.grpc.internal.C5812v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, ByteBuffer byteBuffer, int i8) {
            int iLimit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i7);
            interfaceC5819y0.mo3395H0(byteBuffer);
            byteBuffer.limit(iLimit);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$e */
    class e implements g {
        e() {
        }

        @Override // io.grpc.internal.C5812v.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, OutputStream outputStream, int i8) {
            interfaceC5819y0.mo3398x0(outputStream, i7);
            return 0;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$f */
    private interface f extends g {
    }

    /* JADX INFO: renamed from: io.grpc.internal.v$g */
    private interface g {
        /* JADX INFO: renamed from: a */
        int mo26201a(InterfaceC5819y0 interfaceC5819y0, int i7, Object obj, int i8);
    }

    public C5812v(int i7) {
        this.f22928d = new ArrayDeque(2);
        this.f22925a = new ArrayDeque(i7);
    }

    /* JADX INFO: renamed from: J */
    private void m26195J(InterfaceC5819y0 interfaceC5819y0) {
        if (!(interfaceC5819y0 instanceof C5812v)) {
            this.f22925a.add(interfaceC5819y0);
            this.f22927c += interfaceC5819y0.mo3397e();
            return;
        }
        C5812v c5812v = (C5812v) interfaceC5819y0;
        while (!c5812v.f22925a.isEmpty()) {
            this.f22925a.add((InterfaceC5819y0) c5812v.f22925a.remove());
        }
        this.f22927c += c5812v.f22927c;
        c5812v.f22927c = 0;
        c5812v.close();
    }

    /* JADX INFO: renamed from: Q */
    private int m26196Q(g gVar, int i7, Object obj, int i8) {
        m25847d(i7);
        if (!this.f22925a.isEmpty()) {
            m26199x();
        }
        while (i7 > 0 && !this.f22925a.isEmpty()) {
            InterfaceC5819y0 interfaceC5819y0 = (InterfaceC5819y0) this.f22925a.peek();
            int iMin = Math.min(i7, interfaceC5819y0.mo3397e());
            i8 = gVar.mo26201a(interfaceC5819y0, iMin, obj, i8);
            i7 -= iMin;
            this.f22927c -= iMin;
            m26199x();
        }
        if (i7 <= 0) {
            return i8;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* JADX INFO: renamed from: d0 */
    private int m26197d0(f fVar, int i7, Object obj, int i8) {
        try {
            return m26196Q(fVar, i7, obj, i8);
        } catch (IOException e7) {
            throw new AssertionError(e7);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m26198n() {
        if (!this.f22929e) {
            ((InterfaceC5819y0) this.f22925a.remove()).close();
            return;
        }
        this.f22926b.add((InterfaceC5819y0) this.f22925a.remove());
        InterfaceC5819y0 interfaceC5819y0 = (InterfaceC5819y0) this.f22925a.peek();
        if (interfaceC5819y0 != null) {
            interfaceC5819y0.mo25645f0();
        }
    }

    /* JADX INFO: renamed from: x */
    private void m26199x() {
        if (((InterfaceC5819y0) this.f22925a.peek()).mo3397e() == 0) {
            m26198n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.grpc.internal.y0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [io.grpc.internal.y0] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v3, types: [io.grpc.internal.v] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5819y0 mo3394B(int i7) {
        InterfaceC5819y0 interfaceC5819y0Mo3394B;
        int i8;
        InterfaceC5819y0 interfaceC5819y0Mo3394B2;
        ?? r7;
        ?? r8;
        if (i7 <= 0) {
            return AbstractC5821z0.m26217a();
        }
        m25847d(i7);
        this.f22927c -= i7;
        ?? r9 = 0;
        ?? c5812v = 0;
        while (true) {
            InterfaceC5819y0 interfaceC5819y0 = (InterfaceC5819y0) this.f22925a.peek();
            int iMo3397e = interfaceC5819y0.mo3397e();
            if (iMo3397e > i7) {
                interfaceC5819y0Mo3394B2 = interfaceC5819y0.mo3394B(i7);
                i8 = 0;
            } else {
                if (this.f22929e) {
                    interfaceC5819y0Mo3394B = interfaceC5819y0.mo3394B(iMo3397e);
                    m26198n();
                } else {
                    interfaceC5819y0Mo3394B = (InterfaceC5819y0) this.f22925a.poll();
                }
                InterfaceC5819y0 interfaceC5819y1 = interfaceC5819y0Mo3394B;
                i8 = i7 - iMo3397e;
                interfaceC5819y0Mo3394B2 = interfaceC5819y1;
            }
            if (r9 == 0) {
                r8 = interfaceC5819y0Mo3394B2;
            } else {
                if (c5812v == 0) {
                    c5812v = new C5812v(i8 != 0 ? Math.min(this.f22925a.size() + 2, 16) : 2);
                    c5812v.m26200m(r9);
                    r9 = c5812v;
                }
                c5812v.m26200m(interfaceC5819y0Mo3394B2);
                r8 = r9;
                r7 = c5812v;
            }
            if (i8 <= 0) {
                break;
            }
            r7 = c5812v;
            i7 = i8;
            r9 = r8;
            c5812v = r7;
        }
        return r8;
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: H0 */
    public void mo3395H0(ByteBuffer byteBuffer) {
        m26197d0(f22923t, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: c0 */
    public void mo3396c0(byte[] bArr, int i7, int i8) {
        m26197d0(f22922s, i8, bArr, i7);
    }

    @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        while (!this.f22925a.isEmpty()) {
            ((InterfaceC5819y0) this.f22925a.remove()).close();
        }
        if (this.f22926b != null) {
            while (!this.f22926b.isEmpty()) {
                ((InterfaceC5819y0) this.f22926b.remove()).close();
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: e */
    public int mo3397e() {
        return this.f22927c;
    }

    @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: f0 */
    public void mo25645f0() {
        if (this.f22926b == null) {
            this.f22926b = new ArrayDeque(Math.min(this.f22925a.size(), 16));
        }
        while (!this.f22926b.isEmpty()) {
            ((InterfaceC5819y0) this.f22926b.remove()).close();
        }
        this.f22929e = true;
        InterfaceC5819y0 interfaceC5819y0 = (InterfaceC5819y0) this.f22925a.peek();
        if (interfaceC5819y0 != null) {
            interfaceC5819y0.mo25645f0();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m26200m(InterfaceC5819y0 interfaceC5819y0) {
        boolean z7 = this.f22929e && this.f22925a.isEmpty();
        m26195J(interfaceC5819y0);
        if (z7) {
            ((InterfaceC5819y0) this.f22925a.peek()).mo25645f0();
        }
    }

    @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
    public boolean markSupported() {
        Iterator it = this.f22925a.iterator();
        while (it.hasNext()) {
            if (!((InterfaceC5819y0) it.next()).markSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public int readUnsignedByte() {
        return m26197d0(f22920f, 1, null, 0);
    }

    @Override // io.grpc.internal.AbstractC5772b, io.grpc.internal.InterfaceC5819y0
    public void reset() {
        if (!this.f22929e) {
            throw new InvalidMarkException();
        }
        InterfaceC5819y0 interfaceC5819y0 = (InterfaceC5819y0) this.f22925a.peek();
        if (interfaceC5819y0 != null) {
            int iMo3397e = interfaceC5819y0.mo3397e();
            interfaceC5819y0.reset();
            this.f22927c += interfaceC5819y0.mo3397e() - iMo3397e;
        }
        while (true) {
            InterfaceC5819y0 interfaceC5819y1 = (InterfaceC5819y0) this.f22926b.pollLast();
            if (interfaceC5819y1 == null) {
                return;
            }
            interfaceC5819y1.reset();
            this.f22925a.addFirst(interfaceC5819y1);
            this.f22927c += interfaceC5819y1.mo3397e();
        }
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    public void skipBytes(int i7) {
        m26197d0(f22921r, i7, null, 0);
    }

    @Override // io.grpc.internal.InterfaceC5819y0
    /* JADX INFO: renamed from: x0 */
    public void mo3398x0(OutputStream outputStream, int i7) {
        m26196Q(f22924u, i7, outputStream, 0);
    }

    public C5812v() {
        this.f22928d = new ArrayDeque(2);
        this.f22925a = new ArrayDeque();
    }
}
