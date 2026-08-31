package okhttp3.internal.p320ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.C0652i;
import p072I6.InterfaceC0669z;
import p220c6.AbstractC3026b;

/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflater implements Closeable {

    /* JADX INFO: renamed from: a */
    private final boolean f26052a;

    /* JADX INFO: renamed from: b */
    private final C0648e f26053b;

    /* JADX INFO: renamed from: c */
    private final Deflater f26054c;

    /* JADX INFO: renamed from: d */
    private final C0652i f26055d;

    public MessageDeflater(boolean z7) {
        this.f26052a = z7;
        C0648e c0648e = new C0648e();
        this.f26053b = c0648e;
        Deflater deflater = new Deflater(-1, true);
        this.f26054c = deflater;
        this.f26055d = new C0652i((InterfaceC0669z) c0648e, deflater);
    }

    /* JADX INFO: renamed from: m */
    private final boolean m29447m(C0648e c0648e, C0651h c0651h) {
        return c0648e.m3027U0(c0648e.m3046h1() - ((long) c0651h.m3090F()), c0651h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f26055d.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m29448d(C0648e buffer) throws IOException {
        AbstractC6118n.m27187e(buffer, "buffer");
        if (this.f26053b.m3046h1() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f26052a) {
            this.f26054c.reset();
        }
        this.f26055d.mo3003I(buffer, buffer.m3046h1());
        this.f26055d.flush();
        if (m29447m(this.f26053b, MessageDeflaterKt.f26056a)) {
            long jM3046h1 = this.f26053b.m3046h1() - ((long) 4);
            C0648e.a aVarM3007Y0 = C0648e.m3007Y0(this.f26053b, null, 1, null);
            try {
                aVarM3007Y0.m3082n(jM3046h1);
                AbstractC3026b.m14999a(aVarM3007Y0, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(aVarM3007Y0, th);
                    throw th2;
                }
            }
        } else {
            this.f26053b.mo3010F(0);
        }
        C0648e c0648e = this.f26053b;
        buffer.mo3003I(c0648e, c0648e.m3046h1());
    }
}
