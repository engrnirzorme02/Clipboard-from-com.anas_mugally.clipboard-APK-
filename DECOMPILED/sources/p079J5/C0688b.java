package p079J5;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p072I6.C0648e;
import p072I6.C0651h;
import p095L5.C0853i;
import p095L5.EnumC0845a;
import p095L5.InterfaceC0847c;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.b */
/* JADX INFO: loaded from: classes.dex */
final class C0688b implements InterfaceC0847c {

    /* JADX INFO: renamed from: d */
    private static final Logger f2673d = Logger.getLogger(C0695i.class.getName());

    /* JADX INFO: renamed from: a */
    private final a f2674a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC0847c f2675b;

    /* JADX INFO: renamed from: c */
    private final C0696j f2676c = new C0696j(Level.FINE, C0695i.class);

    /* JADX INFO: renamed from: J5.b$a */
    interface a {
        /* JADX INFO: renamed from: f */
        void mo3227f(Throwable th);
    }

    C0688b(a aVar, InterfaceC0847c interfaceC0847c) {
        this.f2674a = (a) AbstractC1209m.m5303o(aVar, "transportExceptionHandler");
        this.f2675b = (InterfaceC0847c) AbstractC1209m.m5303o(interfaceC0847c, "frameWriter");
    }

    /* JADX INFO: renamed from: d */
    static Level m3219d(Throwable th) {
        return th.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: B0 */
    public void mo3216B0(C0853i c0853i) {
        this.f2676c.m3381j(C0696j.a.OUTBOUND);
        try {
            this.f2675b.mo3216B0(c0853i);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: E0 */
    public int mo3220E0() {
        return this.f2675b.mo3220E0();
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: F0 */
    public void mo3221F0(boolean z7, boolean z8, int i7, int i8, List list) {
        try {
            this.f2675b.mo3221F0(z7, z8, i7, i8, list);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: H */
    public void mo3222H() {
        try {
            this.f2675b.mo3222H();
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: Z */
    public void mo3223Z(int i7, EnumC0845a enumC0845a, byte[] bArr) {
        this.f2676c.m3374c(C0696j.a.OUTBOUND, i7, enumC0845a, C0651h.m3085x(bArr));
        try {
            this.f2675b.mo3223Z(i7, enumC0845a, bArr);
            this.f2675b.flush();
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: a */
    public void mo3224a(int i7, long j7) {
        this.f2676c.m3382k(C0696j.a.OUTBOUND, i7, j7);
        try {
            this.f2675b.mo3224a(i7, j7);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: b */
    public void mo3217b(boolean z7, int i7, int i8) {
        if (z7) {
            this.f2676c.m3377f(C0696j.a.OUTBOUND, (4294967295L & ((long) i8)) | (((long) i7) << 32));
        } else {
            this.f2676c.m3376e(C0696j.a.OUTBOUND, (4294967295L & ((long) i8)) | (((long) i7) << 32));
        }
        try {
            this.f2675b.mo3217b(z7, i7, i8);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f2675b.close();
        } catch (IOException e7) {
            f2673d.log(m3219d(e7), "Failed closing connection", (Throwable) e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    public void flush() {
        try {
            this.f2675b.flush();
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: h0 */
    public void mo3225h0(C0853i c0853i) {
        this.f2676c.m3380i(C0696j.a.OUTBOUND, c0853i);
        try {
            this.f2675b.mo3225h0(c0853i);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: j0 */
    public void mo3226j0(boolean z7, int i7, C0648e c0648e, int i8) {
        this.f2676c.m3373b(C0696j.a.OUTBOUND, i7, c0648e.m3038d(), i8, z7);
        try {
            this.f2675b.mo3226j0(z7, i7, c0648e, i8);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }

    @Override // p095L5.InterfaceC0847c
    /* JADX INFO: renamed from: k */
    public void mo3218k(int i7, EnumC0845a enumC0845a) {
        this.f2676c.m3379h(C0696j.a.OUTBOUND, i7, enumC0845a);
        try {
            this.f2675b.mo3218k(i7, enumC0845a);
        } catch (IOException e7) {
            this.f2674a.mo3227f(e7);
        }
    }
}
