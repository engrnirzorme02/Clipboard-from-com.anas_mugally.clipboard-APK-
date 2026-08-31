package p095L5;

import com.google.android.gms.common.api.C3553a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0649f;
import p072I6.InterfaceC0650g;

/* JADX INFO: renamed from: L5.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0851g implements InterfaceC0854j {

    /* JADX INFO: renamed from: a */
    private static final Logger f3383a = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: b */
    private static final C0651h f3384b = C0651h.m3084j("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: L5.g$a */
    static final class a implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0650g f3385a;

        /* JADX INFO: renamed from: b */
        int f3386b;

        /* JADX INFO: renamed from: c */
        byte f3387c;

        /* JADX INFO: renamed from: d */
        int f3388d;

        /* JADX INFO: renamed from: e */
        int f3389e;

        /* JADX INFO: renamed from: f */
        short f3390f;

        public a(InterfaceC0650g interfaceC0650g) {
            this.f3385a = interfaceC0650g;
        }

        /* JADX INFO: renamed from: d */
        private void m3934d() throws IOException {
            int i7 = this.f3388d;
            int iM3930m = C0851g.m3930m(this.f3385a);
            this.f3389e = iM3930m;
            this.f3386b = iM3930m;
            byte b7 = (byte) (this.f3385a.readByte() & 255);
            this.f3387c = (byte) (this.f3385a.readByte() & 255);
            if (C0851g.f3383a.isLoggable(Level.FINE)) {
                C0851g.f3383a.fine(b.m3936b(true, this.f3388d, this.f3386b, b7, this.f3387c));
            }
            int i8 = this.f3385a.readInt() & C3553a.e.API_PRIORITY_OTHER;
            this.f3388d = i8;
            if (b7 != 9) {
                throw C0851g.m3928k("%s != TYPE_CONTINUATION", Byte.valueOf(b7));
            }
            if (i8 != i7) {
                throw C0851g.m3928k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return this.f3385a.mo2948g();
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e c0648e, long j7) throws IOException {
            while (true) {
                int i7 = this.f3389e;
                if (i7 != 0) {
                    long jMo2949w = this.f3385a.mo2949w(c0648e, Math.min(j7, i7));
                    if (jMo2949w == -1) {
                        return -1L;
                    }
                    this.f3389e -= (int) jMo2949w;
                    return jMo2949w;
                }
                this.f3385a.mo3052l(this.f3390f);
                this.f3390f = (short) 0;
                if ((this.f3387c & 4) != 0) {
                    return -1L;
                }
                m3934d();
            }
        }
    }

    /* JADX INFO: renamed from: L5.g$b */
    static final class b {

        /* JADX INFO: renamed from: a */
        private static final String[] f3391a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* JADX INFO: renamed from: b */
        private static final String[] f3392b = new String[64];

        /* JADX INFO: renamed from: c */
        private static final String[] f3393c = new String[256];

        static {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr = f3393c;
                if (i8 >= strArr.length) {
                    break;
                }
                strArr[i8] = String.format("%8s", Integer.toBinaryString(i8)).replace(' ', '0');
                i8++;
            }
            String[] strArr2 = f3392b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            int i9 = iArr[0];
            strArr2[i9 | 8] = strArr2[i9] + "|PADDED";
            strArr2[4] = "END_HEADERS";
            strArr2[32] = "PRIORITY";
            strArr2[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr2[i10];
                int i12 = iArr[0];
                String[] strArr3 = f3392b;
                int i13 = i12 | i11;
                strArr3[i13] = strArr3[i12] + '|' + strArr3[i11];
                strArr3[i13 | 8] = strArr3[i12] + '|' + strArr3[i11] + "|PADDED";
            }
            while (true) {
                String[] strArr4 = f3392b;
                if (i7 >= strArr4.length) {
                    return;
                }
                if (strArr4[i7] == null) {
                    strArr4[i7] = f3393c[i7];
                }
                i7++;
            }
        }

        /* JADX INFO: renamed from: a */
        static String m3935a(byte b7, byte b8) {
            if (b8 == 0) {
                return "";
            }
            if (b7 != 2 && b7 != 3) {
                if (b7 == 4 || b7 == 6) {
                    return b8 == 1 ? "ACK" : f3393c[b8];
                }
                if (b7 != 7 && b7 != 8) {
                    String[] strArr = f3392b;
                    String str = b8 < strArr.length ? strArr[b8] : f3393c[b8];
                    if (b7 != 5 || (b8 & 4) == 0) {
                        return (b7 != 0 || (b8 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f3393c[b8];
        }

        /* JADX INFO: renamed from: b */
        static String m3936b(boolean z7, int i7, int i8, byte b7, byte b8) {
            String[] strArr = f3391a;
            return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z7 ? "<<" : ">>", Integer.valueOf(i7), Integer.valueOf(i8), b7 < strArr.length ? strArr[b7] : String.format("0x%02x", Byte.valueOf(b7)), m3935a(b7, b8));
        }
    }

    /* JADX INFO: renamed from: L5.g$c */
    static final class c implements InterfaceC0846b {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0650g f3394a;

        /* JADX INFO: renamed from: b */
        private final a f3395b;

        /* JADX INFO: renamed from: c */
        private final boolean f3396c;

        /* JADX INFO: renamed from: d */
        final AbstractC0850f.a f3397d;

        c(InterfaceC0650g interfaceC0650g, int i7, boolean z7) {
            this.f3394a = interfaceC0650g;
            this.f3396c = z7;
            a aVar = new a(interfaceC0650g);
            this.f3395b = aVar;
            this.f3397d = new AbstractC0850f.a(i7, aVar);
        }

        /* JADX INFO: renamed from: J */
        private void m3937J(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i7 != 8) {
                throw C0851g.m3928k("TYPE_PING length != 8: %s", Integer.valueOf(i7));
            }
            if (i8 != 0) {
                throw C0851g.m3928k("TYPE_PING streamId != 0", new Object[0]);
            }
            aVar.mo3361b((b7 & 1) != 0, this.f3394a.readInt(), this.f3394a.readInt());
        }

        /* JADX INFO: renamed from: Q */
        private void m3938Q(InterfaceC0846b.a aVar, int i7) {
            int i8 = this.f3394a.readInt();
            aVar.mo3364l(i7, i8 & C3553a.e.API_PRIORITY_OTHER, (this.f3394a.readByte() & 255) + 1, (Integer.MIN_VALUE & i8) != 0);
        }

        /* JADX INFO: renamed from: d */
        private void m3939d(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            boolean z7 = (b7 & 1) != 0;
            if ((b7 & 32) != 0) {
                throw C0851g.m3928k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            short s7 = (b7 & 8) != 0 ? (short) (this.f3394a.readByte() & 255) : (short) 0;
            aVar.mo3368p(z7, i8, this.f3394a, C0851g.m3929l(i7, b7, s7), i7);
            this.f3394a.mo3052l(s7);
        }

        /* JADX INFO: renamed from: d0 */
        private void m3940d0(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i7 != 5) {
                throw C0851g.m3928k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i7));
            }
            if (i8 == 0) {
                throw C0851g.m3928k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
            m3938Q(aVar, i8);
        }

        /* JADX INFO: renamed from: k0 */
        private void m3941k0(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i8 == 0) {
                throw C0851g.m3928k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short s7 = (b7 & 8) != 0 ? (short) (this.f3394a.readByte() & 255) : (short) 0;
            aVar.mo3365m(i8, this.f3394a.readInt() & C3553a.e.API_PRIORITY_OTHER, m3944n(C0851g.m3929l(i7 - 4, b7, s7), s7, b7, i8));
        }

        /* JADX INFO: renamed from: l0 */
        private void m3942l0(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i7 != 4) {
                throw C0851g.m3928k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i7));
            }
            if (i8 == 0) {
                throw C0851g.m3928k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int i9 = this.f3394a.readInt();
            EnumC0845a enumC0845aM3888c = EnumC0845a.m3888c(i9);
            if (enumC0845aM3888c == null) {
                throw C0851g.m3928k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(i9));
            }
            aVar.mo3363k(i8, enumC0845aM3888c);
        }

        /* JADX INFO: renamed from: m */
        private void m3943m(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i7 < 8) {
                throw C0851g.m3928k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i7));
            }
            if (i8 != 0) {
                throw C0851g.m3928k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int i9 = this.f3394a.readInt();
            int i10 = this.f3394a.readInt();
            int i11 = i7 - 8;
            EnumC0845a enumC0845aM3888c = EnumC0845a.m3888c(i10);
            if (enumC0845aM3888c == null) {
                throw C0851g.m3928k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(i10));
            }
            C0651h c0651hMo3063r = C0651h.f2563e;
            if (i11 > 0) {
                c0651hMo3063r = this.f3394a.mo3063r(i11);
            }
            aVar.mo3369q(i9, enumC0845aM3888c, c0651hMo3063r);
        }

        /* JADX INFO: renamed from: n */
        private List m3944n(int i7, short s7, byte b7, int i8) throws IOException {
            a aVar = this.f3395b;
            aVar.f3389e = i7;
            aVar.f3386b = i7;
            aVar.f3390f = s7;
            aVar.f3387c = b7;
            aVar.f3388d = i8;
            this.f3397d.m3912l();
            return this.f3397d.m3909e();
        }

        /* JADX INFO: renamed from: o0 */
        private void m3945o0(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i8 != 0) {
                throw C0851g.m3928k("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((b7 & 1) != 0) {
                if (i7 != 0) {
                    throw C0851g.m3928k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                }
                aVar.mo3362c();
                return;
            }
            if (i7 % 6 != 0) {
                throw C0851g.m3928k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i7));
            }
            C0853i c0853i = new C0853i();
            for (int i9 = 0; i9 < i7; i9 += 6) {
                short s7 = this.f3394a.readShort();
                int i10 = this.f3394a.readInt();
                switch (s7) {
                    case 1:
                    case 6:
                        break;
                    case 2:
                        if (i10 != 0 && i10 != 1) {
                            throw C0851g.m3928k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    case 3:
                        s7 = 4;
                        break;
                    case 4:
                        if (i10 < 0) {
                            throw C0851g.m3928k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        s7 = 7;
                        break;
                        break;
                    case 5:
                        if (i10 < 16384 || i10 > 16777215) {
                            throw C0851g.m3928k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(i10));
                        }
                        break;
                    default:
                        continue;
                        break;
                }
                c0853i.m3965e(s7, 0, i10);
            }
            aVar.mo3367o(false, c0853i);
            if (c0853i.m3962b() >= 0) {
                this.f3397d.m3910g(c0853i.m3962b());
            }
        }

        /* JADX INFO: renamed from: p0 */
        private void m3946p0(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i7 != 4) {
                throw C0851g.m3928k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i7));
            }
            long j7 = ((long) this.f3394a.readInt()) & 2147483647L;
            if (j7 == 0) {
                throw C0851g.m3928k("windowSizeIncrement was 0", new Object[0]);
            }
            aVar.mo3360a(i8, j7);
        }

        /* JADX INFO: renamed from: x */
        private void m3947x(InterfaceC0846b.a aVar, int i7, byte b7, int i8) throws IOException {
            if (i8 == 0) {
                throw C0851g.m3928k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean z7 = (b7 & 1) != 0;
            short s7 = (b7 & 8) != 0 ? (short) (this.f3394a.readByte() & 255) : (short) 0;
            if ((b7 & 32) != 0) {
                m3938Q(aVar, i8);
                i7 -= 5;
            }
            aVar.mo3366n(false, z7, i8, -1, m3944n(C0851g.m3929l(i7, b7, s7), s7, b7, i8), EnumC0849e.HTTP_20_HEADERS);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3394a.close();
        }

        @Override // p095L5.InterfaceC0846b
        /* JADX INFO: renamed from: g0 */
        public boolean mo3889g0(InterfaceC0846b.a aVar) throws IOException {
            try {
                this.f3394a.mo3011G0(9L);
                int iM3930m = C0851g.m3930m(this.f3394a);
                if (iM3930m < 0 || iM3930m > 16384) {
                    throw C0851g.m3928k("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM3930m));
                }
                byte b7 = (byte) (this.f3394a.readByte() & 255);
                byte b8 = (byte) (this.f3394a.readByte() & 255);
                int i7 = this.f3394a.readInt() & C3553a.e.API_PRIORITY_OTHER;
                if (C0851g.f3383a.isLoggable(Level.FINE)) {
                    C0851g.f3383a.fine(b.m3936b(true, i7, iM3930m, b7, b8));
                }
                switch (b7) {
                    case 0:
                        m3939d(aVar, iM3930m, b8, i7);
                        return true;
                    case 1:
                        m3947x(aVar, iM3930m, b8, i7);
                        return true;
                    case 2:
                        m3940d0(aVar, iM3930m, b8, i7);
                        return true;
                    case 3:
                        m3942l0(aVar, iM3930m, b8, i7);
                        return true;
                    case 4:
                        m3945o0(aVar, iM3930m, b8, i7);
                        return true;
                    case 5:
                        m3941k0(aVar, iM3930m, b8, i7);
                        return true;
                    case 6:
                        m3937J(aVar, iM3930m, b8, i7);
                        return true;
                    case 7:
                        m3943m(aVar, iM3930m, b8, i7);
                        return true;
                    case 8:
                        m3946p0(aVar, iM3930m, b8, i7);
                        return true;
                    default:
                        this.f3394a.mo3052l(iM3930m);
                        return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: L5.g$d */
    static final class d implements InterfaceC0847c {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0649f f3398a;

        /* JADX INFO: renamed from: b */
        private final boolean f3399b;

        /* JADX INFO: renamed from: c */
        private final C0648e f3400c;

        /* JADX INFO: renamed from: d */
        private final AbstractC0850f.b f3401d;

        /* JADX INFO: renamed from: e */
        private int f3402e;

        /* JADX INFO: renamed from: f */
        private boolean f3403f;

        d(InterfaceC0649f interfaceC0649f, boolean z7) {
            this.f3398a = interfaceC0649f;
            this.f3399b = z7;
            C0648e c0648e = new C0648e();
            this.f3400c = c0648e;
            this.f3401d = new AbstractC0850f.b(c0648e);
            this.f3402e = 16384;
        }

        /* JADX INFO: renamed from: x */
        private void m3948x(int i7, long j7) {
            while (j7 > 0) {
                int iMin = (int) Math.min(this.f3402e, j7);
                long j8 = iMin;
                j7 -= j8;
                m3950m(i7, iMin, (byte) 9, j7 == 0 ? (byte) 4 : (byte) 0);
                this.f3398a.mo3003I(this.f3400c, j8);
            }
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: B0 */
        public synchronized void mo3216B0(C0853i c0853i) {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            this.f3402e = c0853i.m3963c(this.f3402e);
            m3950m(0, 0, (byte) 4, (byte) 1);
            this.f3398a.flush();
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: E0 */
        public int mo3220E0() {
            return this.f3402e;
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: F0 */
        public synchronized void mo3221F0(boolean z7, boolean z8, int i7, int i8, List list) {
            try {
                if (z8) {
                    throw new UnsupportedOperationException();
                }
                if (this.f3403f) {
                    throw new IOException("closed");
                }
                m3951n(z7, i7, list);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: H */
        public synchronized void mo3222H() {
            try {
                if (this.f3403f) {
                    throw new IOException("closed");
                }
                if (this.f3399b) {
                    if (C0851g.f3383a.isLoggable(Level.FINE)) {
                        C0851g.f3383a.fine(String.format(">> CONNECTION %s", C0851g.f3384b.mo3104q()));
                    }
                    this.f3398a.mo3070u0(C0851g.f3384b.mo3093K());
                    this.f3398a.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: Z */
        public synchronized void mo3223Z(int i7, EnumC0845a enumC0845a, byte[] bArr) {
            try {
                if (this.f3403f) {
                    throw new IOException("closed");
                }
                if (enumC0845a.f3344a == -1) {
                    throw C0851g.m3927j("errorCode.httpCode == -1", new Object[0]);
                }
                m3950m(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f3398a.mo3008A(i7);
                this.f3398a.mo3008A(enumC0845a.f3344a);
                if (bArr.length > 0) {
                    this.f3398a.mo3070u0(bArr);
                }
                this.f3398a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: a */
        public synchronized void mo3224a(int i7, long j7) {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            if (j7 == 0 || j7 > 2147483647L) {
                throw C0851g.m3927j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j7));
            }
            m3950m(i7, 4, (byte) 8, (byte) 0);
            this.f3398a.mo3008A((int) j7);
            this.f3398a.flush();
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: b */
        public synchronized void mo3217b(boolean z7, int i7, int i8) {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            m3950m(0, 8, (byte) 6, z7 ? (byte) 1 : (byte) 0);
            this.f3398a.mo3008A(i7);
            this.f3398a.mo3008A(i8);
            this.f3398a.flush();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            this.f3403f = true;
            this.f3398a.close();
        }

        /* JADX INFO: renamed from: d */
        void m3949d(int i7, byte b7, C0648e c0648e, int i8) {
            m3950m(i7, i8, (byte) 0, b7);
            if (i8 > 0) {
                this.f3398a.mo3003I(c0648e, i8);
            }
        }

        @Override // p095L5.InterfaceC0847c
        public synchronized void flush() {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            this.f3398a.flush();
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: h0 */
        public synchronized void mo3225h0(C0853i c0853i) {
            int i7;
            try {
                if (this.f3403f) {
                    throw new IOException("closed");
                }
                int i8 = 0;
                m3950m(0, c0853i.m3966f() * 6, (byte) 4, (byte) 0);
                while (i8 < 10) {
                    if (c0853i.m3964d(i8)) {
                        if (i8 == 4) {
                            i7 = 3;
                        } else {
                            i7 = i8 == 7 ? 4 : i8;
                        }
                        this.f3398a.mo3072v(i7);
                        this.f3398a.mo3008A(c0853i.m3961a(i8));
                    }
                    i8++;
                }
                this.f3398a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: j0 */
        public synchronized void mo3226j0(boolean z7, int i7, C0648e c0648e, int i8) {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            m3949d(i7, z7 ? (byte) 1 : (byte) 0, c0648e, i8);
        }

        @Override // p095L5.InterfaceC0847c
        /* JADX INFO: renamed from: k */
        public synchronized void mo3218k(int i7, EnumC0845a enumC0845a) {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            if (enumC0845a.f3344a == -1) {
                throw new IllegalArgumentException();
            }
            m3950m(i7, 4, (byte) 3, (byte) 0);
            this.f3398a.mo3008A(enumC0845a.f3344a);
            this.f3398a.flush();
        }

        /* JADX INFO: renamed from: m */
        void m3950m(int i7, int i8, byte b7, byte b8) {
            if (C0851g.f3383a.isLoggable(Level.FINE)) {
                C0851g.f3383a.fine(b.m3936b(false, i7, i8, b7, b8));
            }
            int i9 = this.f3402e;
            if (i8 > i9) {
                throw C0851g.m3927j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i9), Integer.valueOf(i8));
            }
            if ((Integer.MIN_VALUE & i7) != 0) {
                throw C0851g.m3927j("reserved bit set: %s", Integer.valueOf(i7));
            }
            C0851g.m3931n(this.f3398a, i8);
            this.f3398a.mo3010F(b7 & 255);
            this.f3398a.mo3010F(b8 & 255);
            this.f3398a.mo3008A(i7 & C3553a.e.API_PRIORITY_OTHER);
        }

        /* JADX INFO: renamed from: n */
        void m3951n(boolean z7, int i7, List list) throws IOException {
            if (this.f3403f) {
                throw new IOException("closed");
            }
            this.f3401d.m3918e(list);
            long jM3046h1 = this.f3400c.m3046h1();
            int iMin = (int) Math.min(this.f3402e, jM3046h1);
            long j7 = iMin;
            byte b7 = jM3046h1 == j7 ? (byte) 4 : (byte) 0;
            if (z7) {
                b7 = (byte) (b7 | 1);
            }
            m3950m(i7, iMin, (byte) 1, b7);
            this.f3398a.mo3003I(this.f3400c, j7);
            if (jM3046h1 > j7) {
                m3948x(i7, jM3046h1 - j7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static IllegalArgumentException m3927j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static IOException m3928k(String str, Object... objArr) throws IOException {
        throw new IOException(String.format(Locale.US, str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static int m3929l(int i7, byte b7, short s7) throws IOException {
        if ((b7 & 8) != 0) {
            i7--;
        }
        if (s7 <= i7) {
            return (short) (i7 - s7);
        }
        throw m3928k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s7), Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static int m3930m(InterfaceC0650g interfaceC0650g) {
        return (interfaceC0650g.readByte() & 255) | ((interfaceC0650g.readByte() & 255) << 16) | ((interfaceC0650g.readByte() & 255) << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static void m3931n(InterfaceC0649f interfaceC0649f, int i7) {
        interfaceC0649f.mo3010F((i7 >>> 16) & 255);
        interfaceC0649f.mo3010F((i7 >>> 8) & 255);
        interfaceC0649f.mo3010F(i7 & 255);
    }

    @Override // p095L5.InterfaceC0854j
    /* JADX INFO: renamed from: a */
    public InterfaceC0847c mo3932a(InterfaceC0649f interfaceC0649f, boolean z7) {
        return new d(interfaceC0649f, z7);
    }

    @Override // p095L5.InterfaceC0854j
    /* JADX INFO: renamed from: b */
    public InterfaceC0846b mo3933b(InterfaceC0650g interfaceC0650g, boolean z7) {
        return new c(interfaceC0650g, 4096, z7);
    }
}
