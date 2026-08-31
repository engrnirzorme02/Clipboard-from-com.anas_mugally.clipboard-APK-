package okhttp3;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.internal.Util;
import p072I6.InterfaceC0649f;
import p302m6.C6402d;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestBody {

    /* JADX INFO: renamed from: a */
    public static final Companion f25422a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ RequestBody m28668c(Companion companion, byte[] bArr, MediaType mediaType, int i7, int i8, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                mediaType = null;
            }
            if ((i9 & 2) != 0) {
                i7 = 0;
            }
            if ((i9 & 4) != 0) {
                i8 = bArr.length;
            }
            return companion.m28670b(bArr, mediaType, i7, i8);
        }

        /* JADX INFO: renamed from: a */
        public final RequestBody m28669a(String str, MediaType mediaType) {
            AbstractC6118n.m27187e(str, "<this>");
            Charset charset = C6402d.f24428b;
            if (mediaType != null) {
                Charset charsetM28562d = MediaType.m28562d(mediaType, null, 1, null);
                if (charsetM28562d == null) {
                    mediaType = MediaType.f25301e.m28566b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetM28562d;
                }
            }
            byte[] bytes = str.getBytes(charset);
            AbstractC6118n.m27186d(bytes, "this as java.lang.String).getBytes(charset)");
            return m28670b(bytes, mediaType, 0, bytes.length);
        }

        /* JADX INFO: renamed from: b */
        public final RequestBody m28670b(final byte[] bArr, final MediaType mediaType, final int i7, final int i8) {
            AbstractC6118n.m27187e(bArr, "<this>");
            Util.m28772l(bArr.length, i7, i8);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: a */
                public long mo28463a() {
                    return i8;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: b */
                public MediaType mo28464b() {
                    return mediaType;
                }

                @Override // okhttp3.RequestBody
                /* JADX INFO: renamed from: e */
                public void mo28465e(InterfaceC0649f sink) {
                    AbstractC6118n.m27187e(sink, "sink");
                    sink.mo3047i(bArr, i7, i8);
                }
            };
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public long mo28463a() {
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public abstract MediaType mo28464b();

    /* JADX INFO: renamed from: c */
    public boolean m28666c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public boolean m28667d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo28465e(InterfaceC0649f interfaceC0649f);
}
