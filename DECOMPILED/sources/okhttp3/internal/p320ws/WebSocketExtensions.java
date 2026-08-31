package okhttp3.internal.p320ws;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class WebSocketExtensions {

    /* JADX INFO: renamed from: g */
    public static final Companion f26101g = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final boolean f26102a;

    /* JADX INFO: renamed from: b */
    public final Integer f26103b;

    /* JADX INFO: renamed from: c */
    public final boolean f26104c;

    /* JADX INFO: renamed from: d */
    public final Integer f26105d;

    /* JADX INFO: renamed from: e */
    public final boolean f26106e;

    /* JADX INFO: renamed from: f */
    public final boolean f26107f;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final WebSocketExtensions m29481a(Headers responseHeaders) {
            AbstractC6118n.m27187e(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z7 = false;
            Integer numM = null;
            boolean z8 = false;
            Integer numM2 = null;
            boolean z9 = false;
            boolean z10 = false;
            for (int i7 = 0; i7 < size; i7++) {
                if (AbstractC6406h.m27564w(responseHeaders.m28478b(i7), "Sec-WebSocket-Extensions", true)) {
                    String strM28480g = responseHeaders.m28480g(i7);
                    int i8 = 0;
                    while (i8 < strM28480g.length()) {
                        int i9 = i8;
                        int iM28778r = Util.m28778r(strM28480g, ',', i9, 0, 4, null);
                        int iM28776p = Util.m28776p(strM28480g, ';', i9, iM28778r);
                        String strM28757Z = Util.m28757Z(strM28480g, i9, iM28776p);
                        int i10 = iM28776p + 1;
                        if (!AbstractC6406h.m27564w(strM28757Z, "permessage-deflate", true)) {
                            i8 = i10;
                            z10 = true;
                        } else if (z7) {
                            z10 = true;
                        } else {
                            z10 = true;
                            while (i10 < iM28778r) {
                                int iM28776p2 = Util.m28776p(strM28480g, ';', i10, iM28778r);
                                int iM28776p3 = Util.m28776p(strM28480g, '=', i10, iM28776p2);
                                String strM28757Z2 = Util.m28757Z(strM28480g, i10, iM28776p3);
                                String strY0 = iM28776p3 < iM28776p2 ? AbstractC6406h.m27626y0(Util.m28757Z(strM28480g, iM28776p3 + 1, iM28776p2), "\"") : null;
                                i10 = iM28776p2 + 1;
                                if (AbstractC6406h.m27564w(strM28757Z2, "client_max_window_bits", true)) {
                                    if (numM != null) {
                                        z10 = true;
                                    }
                                    numM = strY0 != null ? AbstractC6406h.m27543m(strY0) : null;
                                    if (numM == null) {
                                        z10 = true;
                                    }
                                } else if (AbstractC6406h.m27564w(strM28757Z2, "client_no_context_takeover", true)) {
                                    if (z8) {
                                        z10 = true;
                                    }
                                    if (strY0 != null) {
                                        z10 = true;
                                    }
                                    z8 = true;
                                } else {
                                    if (AbstractC6406h.m27564w(strM28757Z2, "server_max_window_bits", true)) {
                                        if (numM2 != null) {
                                            z10 = true;
                                        }
                                        numM2 = strY0 != null ? AbstractC6406h.m27543m(strY0) : null;
                                        if (numM2 == null) {
                                        }
                                    } else if (AbstractC6406h.m27564w(strM28757Z2, "server_no_context_takeover", true)) {
                                        if (z9) {
                                            z10 = true;
                                        }
                                        if (strY0 != null) {
                                            z10 = true;
                                        }
                                        z9 = true;
                                    }
                                    z10 = true;
                                }
                            }
                            i8 = i10;
                            z7 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z7, numM, z8, numM2, z9, z10);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m29480a(boolean z7) {
        return z7 ? this.f26104c : this.f26106e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f26102a == webSocketExtensions.f26102a && AbstractC6118n.m27183a(this.f26103b, webSocketExtensions.f26103b) && this.f26104c == webSocketExtensions.f26104c && AbstractC6118n.m27183a(this.f26105d, webSocketExtensions.f26105d) && this.f26106e == webSocketExtensions.f26106e && this.f26107f == webSocketExtensions.f26107f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z7 = this.f26102a;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int i7 = r7 * 31;
        Integer num = this.f26103b;
        int iHashCode = (i7 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z8 = this.f26104c;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = (iHashCode + r8) * 31;
        Integer num2 = this.f26105d;
        int iHashCode2 = (i8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z9 = this.f26106e;
        ?? r9 = z9;
        if (z9) {
            r9 = 1;
        }
        int i9 = (iHashCode2 + r9) * 31;
        boolean z10 = this.f26107f;
        return i9 + (z10 ? 1 : z10);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f26102a + ", clientMaxWindowBits=" + this.f26103b + ", clientNoContextTakeover=" + this.f26104c + ", serverMaxWindowBits=" + this.f26105d + ", serverNoContextTakeover=" + this.f26106e + ", unknownValues=" + this.f26107f + ')';
    }

    public WebSocketExtensions(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        this.f26102a = z7;
        this.f26103b = num;
        this.f26104c = z8;
        this.f26105d = num2;
        this.f26106e = z9;
        this.f26107f = z10;
    }

    public /* synthetic */ WebSocketExtensions(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? false : z7, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? false : z8, (i7 & 8) != 0 ? null : num2, (i7 & 16) != 0 ? false : z9, (i7 & 32) != 0 ? false : z10);
    }
}
