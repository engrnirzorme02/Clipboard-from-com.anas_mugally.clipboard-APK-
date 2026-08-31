package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.Protocol;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class StatusLine {

    /* JADX INFO: renamed from: d */
    public static final Companion f25742d = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final Protocol f25743a;

    /* JADX INFO: renamed from: b */
    public final int f25744b;

    /* JADX INFO: renamed from: c */
    public final String f25745c;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final StatusLine m29087a(String statusLine) throws ProtocolException {
            Protocol protocol;
            int i7;
            String strSubstring;
            AbstractC6118n.m27187e(statusLine, "statusLine");
            if (AbstractC6406h.m27557K(statusLine, "HTTP/1.", false, 2, null)) {
                i7 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!AbstractC6406h.m27557K(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                protocol = Protocol.HTTP_1_0;
                i7 = 4;
            }
            int i8 = i7 + 3;
            if (statusLine.length() < i8) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String strSubstring2 = statusLine.substring(i7, i8);
                AbstractC6118n.m27186d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i9 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i8) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i8) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    strSubstring = statusLine.substring(i7 + 4);
                    AbstractC6118n.m27186d(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, i9, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i7, String message) {
        AbstractC6118n.m27187e(protocol, "protocol");
        AbstractC6118n.m27187e(message, "message");
        this.f25743a = protocol;
        this.f25744b = i7;
        this.f25745c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f25743a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f25744b);
        sb.append(' ');
        sb.append(this.f25745c);
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
