package okhttp3.internal.http1;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Headers;
import p072I6.InterfaceC0650g;

/* JADX INFO: loaded from: classes.dex */
public final class HeadersReader {

    /* JADX INFO: renamed from: c */
    public static final Companion f25746c = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final InterfaceC0650g f25747a;

    /* JADX INFO: renamed from: b */
    private long f25748b;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(InterfaceC0650g source) {
        AbstractC6118n.m27187e(source, "source");
        this.f25747a = source;
        this.f25748b = 262144L;
    }

    /* JADX INFO: renamed from: a */
    public final Headers m29088a() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String strM29089b = m29089b();
            if (strM29089b.length() == 0) {
                return builder.m28485d();
            }
            builder.m28483b(strM29089b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m29089b() {
        String strMo3020P = this.f25747a.mo3020P(this.f25748b);
        this.f25748b -= (long) strMo3020P.length();
        return strMo3020P;
    }
}
