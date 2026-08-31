package okhttp3;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p072I6.C0648e;
import p072I6.C0651h;
import p072I6.InterfaceC0649f;

/* JADX INFO: loaded from: classes.dex */
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: f */
    public static final Companion f25308f = new Companion(null);

    /* JADX INFO: renamed from: g */
    public static final MediaType f25309g;

    /* JADX INFO: renamed from: h */
    public static final MediaType f25310h;

    /* JADX INFO: renamed from: i */
    public static final MediaType f25311i;

    /* JADX INFO: renamed from: j */
    public static final MediaType f25312j;

    /* JADX INFO: renamed from: k */
    public static final MediaType f25313k;

    /* JADX INFO: renamed from: l */
    private static final byte[] f25314l;

    /* JADX INFO: renamed from: m */
    private static final byte[] f25315m;

    /* JADX INFO: renamed from: n */
    private static final byte[] f25316n;

    /* JADX INFO: renamed from: b */
    private final C0651h f25317b;

    /* JADX INFO: renamed from: c */
    private final List f25318c;

    /* JADX INFO: renamed from: d */
    private final MediaType f25319d;

    /* JADX INFO: renamed from: e */
    private long f25320e;

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private final C0651h f25321a;

        /* JADX INFO: renamed from: b */
        private MediaType f25322b;

        /* JADX INFO: renamed from: c */
        private final List f25323c;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String boundary) {
            AbstractC6118n.m27187e(boundary, "boundary");
            this.f25321a = C0651h.f2562d.m3114d(boundary);
            this.f25322b = MultipartBody.f25309g;
            this.f25323c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i7, AbstractC6112h abstractC6112h) {
            if ((i7 & 1) != 0) {
                str = UUID.randomUUID().toString();
                AbstractC6118n.m27186d(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Part {

        /* JADX INFO: renamed from: c */
        public static final Companion f25324c = new Companion(null);

        /* JADX INFO: renamed from: a */
        private final Headers f25325a;

        /* JADX INFO: renamed from: b */
        private final RequestBody f25326b;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: a */
        public final RequestBody m28568a() {
            return this.f25326b;
        }

        /* JADX INFO: renamed from: b */
        public final Headers m28569b() {
            return this.f25325a;
        }
    }

    static {
        MediaType.Companion companion = MediaType.f25301e;
        f25309g = companion.m28565a("multipart/mixed");
        f25310h = companion.m28565a("multipart/alternative");
        f25311i = companion.m28565a("multipart/digest");
        f25312j = companion.m28565a("multipart/parallel");
        f25313k = companion.m28565a("multipart/form-data");
        f25314l = new byte[]{58, 32};
        f25315m = new byte[]{13, 10};
        f25316n = new byte[]{45, 45};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    private final long m28567f(InterfaceC0649f interfaceC0649f, boolean z7) throws EOFException {
        C0648e c0648e;
        if (z7) {
            interfaceC0649f = new C0648e();
            c0648e = interfaceC0649f;
        } else {
            c0648e = 0;
        }
        int size = this.f25318c.size();
        long j7 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Part part = (Part) this.f25318c.get(i7);
            Headers headersM28569b = part.m28569b();
            RequestBody requestBodyM28568a = part.m28568a();
            AbstractC6118n.m27184b(interfaceC0649f);
            interfaceC0649f.mo3070u0(f25316n);
            interfaceC0649f.mo3017N0(this.f25317b);
            interfaceC0649f.mo3070u0(f25315m);
            if (headersM28569b != null) {
                int size2 = headersM28569b.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    interfaceC0649f.mo3031X(headersM28569b.m28478b(i8)).mo3070u0(f25314l).mo3031X(headersM28569b.m28480g(i8)).mo3070u0(f25315m);
                }
            }
            MediaType mediaTypeMo28464b = requestBodyM28568a.mo28464b();
            if (mediaTypeMo28464b != null) {
                interfaceC0649f.mo3031X("Content-Type: ").mo3031X(mediaTypeMo28464b.toString()).mo3070u0(f25315m);
            }
            long jMo28463a = requestBodyM28568a.mo28463a();
            if (jMo28463a != -1) {
                interfaceC0649f.mo3031X("Content-Length: ").mo3012I0(jMo28463a).mo3070u0(f25315m);
            } else if (z7) {
                AbstractC6118n.m27184b(c0648e);
                c0648e.m3076x();
                return -1L;
            }
            byte[] bArr = f25315m;
            interfaceC0649f.mo3070u0(bArr);
            if (z7) {
                j7 += jMo28463a;
            } else {
                requestBodyM28568a.mo28465e(interfaceC0649f);
            }
            interfaceC0649f.mo3070u0(bArr);
        }
        AbstractC6118n.m27184b(interfaceC0649f);
        byte[] bArr2 = f25316n;
        interfaceC0649f.mo3070u0(bArr2);
        interfaceC0649f.mo3017N0(this.f25317b);
        interfaceC0649f.mo3070u0(bArr2);
        interfaceC0649f.mo3070u0(f25315m);
        if (!z7) {
            return j7;
        }
        AbstractC6118n.m27184b(c0648e);
        long jM3046h1 = j7 + c0648e.m3046h1();
        c0648e.m3076x();
        return jM3046h1;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: a */
    public long mo28463a() throws EOFException {
        long j7 = this.f25320e;
        if (j7 != -1) {
            return j7;
        }
        long jM28567f = m28567f(null, true);
        this.f25320e = jM28567f;
        return jM28567f;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: b */
    public MediaType mo28464b() {
        return this.f25319d;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: e */
    public void mo28465e(InterfaceC0649f sink) throws EOFException {
        AbstractC6118n.m27187e(sink, "sink");
        m28567f(sink, false);
    }
}
