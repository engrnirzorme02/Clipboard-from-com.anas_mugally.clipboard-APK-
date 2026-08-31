package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public interface SocketAdapter {

    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    boolean mo29394a();

    /* JADX INFO: renamed from: b */
    boolean mo29395b(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: c */
    String mo29396c(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: d */
    void mo29397d(SSLSocket sSLSocket, String str, List list);
}
