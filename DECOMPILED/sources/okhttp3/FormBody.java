package okhttp3;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: d */
    public static final Companion f25260d = new Companion(null);

    /* JADX INFO: renamed from: e */
    private static final MediaType f25261e = MediaType.f25301e.m28565a("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: b */
    private final List f25262b;

    /* JADX INFO: renamed from: c */
    private final List f25263c;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final Charset f25264a;

        /* JADX INFO: renamed from: b */
        private final List f25265b;

        /* JADX INFO: renamed from: c */
        private final List f25266c;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(Charset charset) {
            this.f25264a = charset;
            this.f25265b = new ArrayList();
            this.f25266c = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i7, AbstractC6112h abstractC6112h) {
            this((i7 & 1) != 0 ? null : charset);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: f */
    private final long m28462f(InterfaceC0649f interfaceC0649f, boolean z7) throws EOFException {
        C0648e c0648eMo3043f;
        if (z7) {
            c0648eMo3043f = new C0648e();
        } else {
            AbstractC6118n.m27184b(interfaceC0649f);
            c0648eMo3043f = interfaceC0649f.mo3043f();
        }
        int size = this.f25262b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (i7 > 0) {
                c0648eMo3043f.mo3010F(38);
            }
            c0648eMo3043f.mo3031X((String) this.f25262b.get(i7));
            c0648eMo3043f.mo3010F(61);
            c0648eMo3043f.mo3031X((String) this.f25263c.get(i7));
        }
        if (!z7) {
            return 0L;
        }
        long jM3046h1 = c0648eMo3043f.m3046h1();
        c0648eMo3043f.m3076x();
        return jM3046h1;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo28463a() {
        return m28462f(null, true);
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType mo28464b() {
        return f25261e;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: e */
    public void mo28465e(InterfaceC0649f sink) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        m28462f(sink, false);
    }
}
