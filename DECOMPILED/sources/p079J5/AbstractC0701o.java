package p079J5;

import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p087K5.C0753b;
import p087K5.C0757f;
import p087K5.EnumC0760i;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.o */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0701o {

    /* JADX INFO: renamed from: a */
    static final List f2856a = Collections.unmodifiableList(Arrays.asList(EnumC0760i.HTTP_2));

    /* JADX INFO: renamed from: a */
    static String m3402a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    /* JADX INFO: renamed from: b */
    public static SSLSocket m3403b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i7, C0753b c0753b) throws SSLPeerUnverifiedException {
        AbstractC1209m.m5303o(sSLSocketFactory, "sslSocketFactory");
        AbstractC1209m.m5303o(socket, "socket");
        AbstractC1209m.m5303o(c0753b, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i7, true);
        c0753b.m3527c(sSLSocket, false);
        String strMo3392h = C0697k.m3387e().mo3392h(sSLSocket, str, c0753b.m3529f() ? f2856a : null);
        List list = f2856a;
        AbstractC1209m.m5311w(list.contains(EnumC0760i.m3588c(strMo3392h)), "Only " + list + " are supported, but negotiated protocol is %s", strMo3392h);
        if (hostnameVerifier == null) {
            hostnameVerifier = C0757f.f3057a;
        }
        if (hostnameVerifier.verify(m3402a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
