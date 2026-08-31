package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b */
    public static final Companion f25402b = new Companion(null);

    /* JADX INFO: renamed from: a */
    private final String f25410a;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Protocol m28646a(String protocol) throws IOException {
            AbstractC6118n.m27187e(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (AbstractC6118n.m27183a(protocol, protocol2.f25410a)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.HTTP_1_1;
            if (AbstractC6118n.m27183a(protocol, protocol3.f25410a)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (AbstractC6118n.m27183a(protocol, protocol4.f25410a)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.HTTP_2;
            if (AbstractC6118n.m27183a(protocol, protocol5.f25410a)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.SPDY_3;
            if (AbstractC6118n.m27183a(protocol, protocol6.f25410a)) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.QUIC;
            if (AbstractC6118n.m27183a(protocol, protocol7.f25410a)) {
                return protocol7;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.f25410a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f25410a;
    }
}
