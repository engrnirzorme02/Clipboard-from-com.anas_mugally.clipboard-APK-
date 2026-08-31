package okhttp3;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0641C;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.C0662s;
import p072I6.InterfaceC0640B;
import p072I6.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
public final class MultipartReader implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final Companion f25327e = new Companion(null);

    /* JADX INFO: renamed from: f */
    private static final C0662s f25328f;

    /* JADX INFO: renamed from: a */
    private final InterfaceC0650g f25329a;

    /* JADX INFO: renamed from: b */
    private final C0651h f25330b;

    /* JADX INFO: renamed from: c */
    private boolean f25331c;

    /* JADX INFO: renamed from: d */
    private PartSource f25332d;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0650g f25333a;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f25333a.close();
        }
    }

    private final class PartSource implements InterfaceC0640B {

        /* JADX INFO: renamed from: a */
        private final C0641C f25334a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ MultipartReader f25335b;

        @Override // p072I6.InterfaceC0640B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (AbstractC6118n.m27183a(this.f25335b.f25332d, this)) {
                this.f25335b.f25332d = null;
            }
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: g */
        public C0641C mo2948g() {
            return this.f25334a;
        }

        @Override // p072I6.InterfaceC0640B
        /* JADX INFO: renamed from: w */
        public long mo2949w(C0648e sink, long j7) {
            AbstractC6118n.m27187e(sink, "sink");
            if (j7 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j7).toString());
            }
            if (!AbstractC6118n.m27183a(this.f25335b.f25332d, this)) {
                throw new IllegalStateException("closed");
            }
            C0641C c0641cMo2948g = this.f25335b.f25329a.mo2948g();
            C0641C c0641c = this.f25334a;
            MultipartReader multipartReader = this.f25335b;
            long jMo2957h = c0641cMo2948g.mo2957h();
            c0641cMo2948g.mo2956g(C0641C.f2529d.m2959a(c0641c.mo2957h(), c0641cMo2948g.mo2957h()), TimeUnit.NANOSECONDS);
            if (!c0641cMo2948g.mo2954e()) {
                if (c0641c.mo2954e()) {
                    c0641cMo2948g.mo2953d(c0641c.mo2952c());
                }
                try {
                    long jM28570J = multipartReader.m28570J(j7);
                    return jM28570J == 0 ? -1L : multipartReader.f25329a.mo2949w(sink, jM28570J);
                } finally {
                    c0641cMo2948g.mo2956g(jMo2957h, TimeUnit.NANOSECONDS);
                    if (c0641c.mo2954e()) {
                        c0641cMo2948g.mo2950a();
                    }
                }
            }
            long jMo2952c = c0641cMo2948g.mo2952c();
            if (c0641c.mo2954e()) {
                c0641cMo2948g.mo2953d(Math.min(c0641cMo2948g.mo2952c(), c0641c.mo2952c()));
            }
            try {
                long jM28570J2 = multipartReader.m28570J(j7);
                return jM28570J2 == 0 ? -1L : multipartReader.f25329a.mo2949w(sink, jM28570J2);
            } finally {
                c0641cMo2948g.mo2956g(jMo2957h, TimeUnit.NANOSECONDS);
                if (c0641c.mo2954e()) {
                    c0641cMo2948g.mo2953d(jMo2952c);
                }
            }
        }
    }

    static {
        C0662s.a aVar = C0662s.f2585d;
        C0651h.a aVar2 = C0651h.f2562d;
        f25328f = aVar.m3164d(aVar2.m3114d("\r\n"), aVar2.m3114d("--"), aVar2.m3114d(" "), aVar2.m3114d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final long m28570J(long j7) {
        this.f25329a.mo3011G0(this.f25330b.m3090F());
        long jM3014K0 = this.f25329a.mo3043f().m3014K0(this.f25330b);
        return jM3014K0 == -1 ? Math.min(j7, (this.f25329a.mo3043f().m3046h1() - ((long) this.f25330b.m3090F())) + 1) : Math.min(j7, jM3014K0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25331c) {
            return;
        }
        this.f25331c = true;
        this.f25332d = null;
        this.f25329a.close();
    }
}
