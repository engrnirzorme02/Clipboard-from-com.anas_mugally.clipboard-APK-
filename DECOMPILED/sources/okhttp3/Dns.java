package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;

/* JADX INFO: loaded from: classes.dex */
public interface Dns {

    /* JADX INFO: renamed from: a */
    public static final Companion f25255a = Companion.f25257a;

    /* JADX INFO: renamed from: b */
    public static final Dns f25256b = new Companion.DnsSystem();

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f25257a = new Companion();

        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            /* JADX INFO: renamed from: a */
            public List mo28432a(String hostname) throws UnknownHostException {
                AbstractC6118n.m27187e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    AbstractC6118n.m27186d(allByName, "getAllByName(hostname)");
                    return AbstractC1631j.m6734e0(allByName);
                } catch (NullPointerException e7) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e7);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    List mo28432a(String str);
}
