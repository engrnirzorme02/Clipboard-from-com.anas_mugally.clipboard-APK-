package p038E4;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import com.google.android.gms.internal.ads.zzbbn;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import p022C4.C0144c;
import p358t4.C7081c;

/* JADX INFO: renamed from: E4.c */
/* JADX INFO: loaded from: classes.dex */
public class C0384c {

    /* JADX INFO: renamed from: l */
    private static final AtomicInteger f1539l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m */
    private static final Charset f1540m = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: n */
    private static ThreadFactory f1541n = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: o */
    private static InterfaceC0383b f1542o = new a();

    /* JADX INFO: renamed from: a */
    private volatile d f1543a = d.NONE;

    /* JADX INFO: renamed from: b */
    private volatile Socket f1544b = null;

    /* JADX INFO: renamed from: c */
    private InterfaceC0385d f1545c = null;

    /* JADX INFO: renamed from: d */
    private final URI f1546d;

    /* JADX INFO: renamed from: e */
    private final String f1547e;

    /* JADX INFO: renamed from: f */
    private final C0389h f1548f;

    /* JADX INFO: renamed from: g */
    private final C0390i f1549g;

    /* JADX INFO: renamed from: h */
    private final C0387f f1550h;

    /* JADX INFO: renamed from: i */
    private final C0144c f1551i;

    /* JADX INFO: renamed from: j */
    private final int f1552j;

    /* JADX INFO: renamed from: k */
    private final Thread f1553k;

    /* JADX INFO: renamed from: E4.c$a */
    class a implements InterfaceC0383b {
        a() {
        }

        @Override // p038E4.InterfaceC0383b
        /* JADX INFO: renamed from: a */
        public void mo1620a(Thread thread, String str) {
            thread.setName(str);
        }
    }

    /* JADX INFO: renamed from: E4.c$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0384c.this.m1626n();
        }
    }

    /* JADX INFO: renamed from: E4.c$c */
    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1555a;

        static {
            int[] iArr = new int[d.values().length];
            f1555a = iArr;
            try {
                iArr[d.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1555a[d.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1555a[d.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1555a[d.DISCONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1555a[d.DISCONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: E4.c$d */
    private enum d {
        NONE,
        CONNECTING,
        CONNECTED,
        DISCONNECTING,
        DISCONNECTED
    }

    public C0384c(C7081c c7081c, URI uri, String str, Map map) {
        int iIncrementAndGet = f1539l.incrementAndGet();
        this.f1552j = iIncrementAndGet;
        this.f1553k = m1625j().newThread(new b());
        this.f1546d = uri;
        this.f1547e = c7081c.m31224g();
        this.f1551i = new C0144c(c7081c.m31223f(), "WebSocket", "sk_" + iIncrementAndGet);
        this.f1550h = new C0387f(uri, str, map);
        this.f1548f = new C0389h(this);
        this.f1549g = new C0390i(this, "TubeSock", iIncrementAndGet);
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m1622d() {
        if (this.f1543a == d.DISCONNECTED) {
            return;
        }
        this.f1548f.m1658h();
        this.f1549g.m1668i();
        if (this.f1544b != null) {
            try {
                this.f1544b.close();
            } catch (Exception e7) {
                this.f1545c.mo1641d(new C0386e("Failed to close", e7));
            }
        }
        this.f1543a = d.DISCONNECTED;
        this.f1545c.mo1642e();
    }

    /* JADX INFO: renamed from: f */
    private Socket m1623f() {
        String scheme = this.f1546d.getScheme();
        String host = this.f1546d.getHost();
        int port = this.f1546d.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e7) {
                throw new C0386e("unknown host: " + host, e7);
            } catch (IOException e8) {
                throw new C0386e("error while creating socket to " + this.f1546d, e8);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            throw new C0386e("unsupported protocol: " + scheme);
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        try {
            if (this.f1547e != null) {
                sSLSessionCache = new SSLSessionCache(new File(this.f1547e));
            }
        } catch (IOException e9) {
            this.f1551i.m623a("Failed to initialize SSL session cache", e9, new Object[0]);
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            throw new C0386e("Error while verifying secure socket to " + this.f1546d);
        } catch (UnknownHostException e10) {
            throw new C0386e("unknown host: " + host, e10);
        } catch (IOException e11) {
            throw new C0386e("error while creating secure socket to " + this.f1546d, e11);
        }
    }

    /* JADX INFO: renamed from: i */
    static InterfaceC0383b m1624i() {
        return f1542o;
    }

    /* JADX INFO: renamed from: j */
    static ThreadFactory m1625j() {
        return f1541n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m1626n() {
        try {
            try {
                Socket socketM1623f = m1623f();
                synchronized (this) {
                    try {
                        this.f1544b = socketM1623f;
                        if (this.f1543a == d.DISCONNECTED) {
                            try {
                                this.f1544b.close();
                                this.f1544b = null;
                                m1630c();
                                return;
                            } catch (IOException e7) {
                                throw new RuntimeException(e7);
                            }
                        }
                        DataInputStream dataInputStream = new DataInputStream(socketM1623f.getInputStream());
                        OutputStream outputStream = socketM1623f.getOutputStream();
                        outputStream.write(this.f1550h.m1647c());
                        byte[] bArr = new byte[zzbbn.zzq.zzf];
                        ArrayList arrayList = new ArrayList();
                        boolean z7 = false;
                        int i7 = 0;
                        while (!z7) {
                            int i8 = dataInputStream.read();
                            if (i8 == -1) {
                                throw new C0386e("Connection closed before handshake was complete");
                            }
                            bArr[i7] = (byte) i8;
                            int i9 = i7 + 1;
                            if (bArr[i7] == 10 && bArr[i7 - 1] == 13) {
                                String str = new String(bArr, f1540m);
                                if (str.trim().equals("")) {
                                    z7 = true;
                                } else {
                                    arrayList.add(str.trim());
                                }
                                bArr = new byte[zzbbn.zzq.zzf];
                                i7 = 0;
                            } else {
                                if (i9 == 1000) {
                                    throw new C0386e("Unexpected long line in handshake: " + new String(bArr, f1540m));
                                }
                                i7 = i9;
                            }
                        }
                        this.f1550h.m1649f((String) arrayList.get(0));
                        arrayList.remove(0);
                        HashMap map = new HashMap();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String[] strArrSplit = ((String) it.next()).split(": ", 2);
                            String str2 = strArrSplit[0];
                            Locale locale = Locale.US;
                            map.put(str2.toLowerCase(locale), strArrSplit[1].toLowerCase(locale));
                        }
                        this.f1550h.m1648e(map);
                        this.f1549g.m1667h(outputStream);
                        this.f1548f.m1657g(dataInputStream);
                        this.f1543a = d.CONNECTED;
                        this.f1549g.m1665d().start();
                        this.f1545c.mo1640a();
                        this.f1548f.m1656f();
                        m1630c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                m1630c();
                throw th2;
            }
        } catch (C0386e e8) {
            this.f1545c.mo1641d(e8);
            m1630c();
        } catch (Throwable th3) {
            this.f1545c.mo1641d(new C0386e("error while connecting: " + th3.getMessage(), th3));
            m1630c();
        }
    }

    /* JADX INFO: renamed from: o */
    private synchronized void m1627o(byte b7, byte[] bArr) {
        try {
            if (this.f1543a != d.CONNECTED) {
                this.f1545c.mo1641d(new C0386e("error while sending data: not connected"));
            } else {
                try {
                    this.f1549g.m1666g(b7, true, bArr);
                } catch (IOException e7) {
                    this.f1545c.mo1641d(new C0386e("Failed to send frame", e7));
                    m1630c();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m1628q() {
        try {
            this.f1543a = d.DISCONNECTING;
            this.f1549g.m1668i();
            this.f1549g.m1666g((byte) 8, true, new byte[0]);
        } catch (IOException e7) {
            this.f1545c.mo1641d(new C0386e("Failed to send close frame", e7));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1629b() throws InterruptedException {
        if (this.f1549g.m1665d().getState() != Thread.State.NEW) {
            this.f1549g.m1665d().join();
        }
        m1633h().join();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m1630c() {
        int i7 = c.f1555a[this.f1543a.ordinal()];
        if (i7 == 1) {
            this.f1543a = d.DISCONNECTED;
            return;
        }
        if (i7 == 2) {
            m1622d();
            return;
        }
        if (i7 == 3) {
            m1628q();
        } else if (i7 != 4) {
            if (i7 != 5) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m1631e() {
        if (this.f1543a != d.NONE) {
            this.f1545c.mo1641d(new C0386e("connect() already called"));
            m1630c();
            return;
        }
        m1624i().mo1620a(m1633h(), "TubeSockReader-" + this.f1552j);
        this.f1543a = d.CONNECTING;
        m1633h().start();
    }

    /* JADX INFO: renamed from: g */
    InterfaceC0385d m1632g() {
        return this.f1545c;
    }

    /* JADX INFO: renamed from: h */
    Thread m1633h() {
        return this.f1553k;
    }

    /* JADX INFO: renamed from: k */
    void m1634k(C0386e c0386e) {
        this.f1545c.mo1641d(c0386e);
        if (this.f1543a == d.CONNECTED) {
            m1630c();
        }
        m1622d();
    }

    /* JADX INFO: renamed from: l */
    void m1635l() {
        m1622d();
    }

    /* JADX INFO: renamed from: m */
    synchronized void m1636m(byte[] bArr) {
        m1627o((byte) 10, bArr);
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m1637p(String str) {
        m1627o((byte) 1, str.getBytes(f1540m));
    }

    /* JADX INFO: renamed from: r */
    public void m1638r(InterfaceC0385d interfaceC0385d) {
        this.f1545c = interfaceC0385d;
    }
}
