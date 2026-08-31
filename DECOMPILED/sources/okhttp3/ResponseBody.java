package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.C0648e;
import p072I6.InterfaceC0650g;
import p145S5.C1444v;
import p220c6.AbstractC3026b;
import p302m6.C6402d;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a */
    public static final Companion f25458a = new Companion(null);

    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: a */
        private final InterfaceC0650g f25459a;

        /* JADX INFO: renamed from: b */
        private final Charset f25460b;

        /* JADX INFO: renamed from: c */
        private boolean f25461c;

        /* JADX INFO: renamed from: d */
        private Reader f25462d;

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C1444v c1444v;
            this.f25461c = true;
            Reader reader = this.f25462d;
            if (reader != null) {
                reader.close();
                c1444v = C1444v.f4971a;
            } else {
                c1444v = null;
            }
            if (c1444v == null) {
                this.f25459a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int i7, int i8) throws IOException {
            AbstractC6118n.m27187e(cbuf, "cbuf");
            if (this.f25461c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f25462d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f25459a.mo3019O0(), Util.m28741J(this.f25459a, this.f25460b));
                this.f25462d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i7, i8);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ ResponseBody m28711c(Companion companion, byte[] bArr, MediaType mediaType, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                mediaType = null;
            }
            return companion.m28713b(bArr, mediaType);
        }

        /* JADX INFO: renamed from: a */
        public final ResponseBody m28712a(final InterfaceC0650g interfaceC0650g, final MediaType mediaType, final long j7) {
            AbstractC6118n.m27187e(interfaceC0650g, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: m */
                public long mo28325m() {
                    return j7;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: n */
                public MediaType mo28326n() {
                    return mediaType;
                }

                @Override // okhttp3.ResponseBody
                /* JADX INFO: renamed from: x */
                public InterfaceC0650g mo28327x() {
                    return interfaceC0650g;
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public final ResponseBody m28713b(byte[] bArr, MediaType mediaType) {
            AbstractC6118n.m27187e(bArr, "<this>");
            return m28712a(new C0648e().mo3070u0(bArr), mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    private final Charset m28709d() {
        Charset charsetM28563c;
        MediaType mediaTypeMo28326n = mo28326n();
        return (mediaTypeMo28326n == null || (charsetM28563c = mediaTypeMo28326n.m28563c(C6402d.f24428b)) == null) ? C6402d.f24428b : charsetM28563c;
    }

    /* JADX INFO: renamed from: J */
    public final String m28710J() throws IOException {
        InterfaceC0650g interfaceC0650gMo28327x = mo28327x();
        try {
            String strMo3035b0 = interfaceC0650gMo28327x.mo3035b0(Util.m28741J(interfaceC0650gMo28327x, m28709d()));
            AbstractC3026b.m14999a(interfaceC0650gMo28327x, null);
            return strMo3035b0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(interfaceC0650gMo28327x, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.m28773m(mo28327x());
    }

    /* JADX INFO: renamed from: m */
    public abstract long mo28325m();

    /* JADX INFO: renamed from: n */
    public abstract MediaType mo28326n();

    /* JADX INFO: renamed from: x */
    public abstract InterfaceC0650g mo28327x();
}
