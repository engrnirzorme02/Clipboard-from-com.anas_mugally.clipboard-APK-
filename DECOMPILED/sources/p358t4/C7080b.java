package p358t4;

import java.util.HashMap;
import java.util.Map;
import p022C4.C0144c;

/* JADX INFO: renamed from: t4.b */
/* JADX INFO: loaded from: classes.dex */
class C7080b implements C7095q.c {

    /* JADX INFO: renamed from: f */
    private static long f28257f;

    /* JADX INFO: renamed from: a */
    private C7084f f28258a;

    /* JADX INFO: renamed from: b */
    private C7095q f28259b;

    /* JADX INFO: renamed from: c */
    private a f28260c;

    /* JADX INFO: renamed from: d */
    private c f28261d;

    /* JADX INFO: renamed from: e */
    private final C0144c f28262e;

    /* JADX INFO: renamed from: t4.b$a */
    public interface a {
        /* JADX INFO: renamed from: f */
        void mo31211f(String str);

        /* JADX INFO: renamed from: h */
        void mo31212h(String str);

        /* JADX INFO: renamed from: j */
        void mo31213j(long j7, String str);

        /* JADX INFO: renamed from: l */
        void mo31214l(b bVar);

        /* JADX INFO: renamed from: n */
        void mo31215n(Map map);
    }

    /* JADX INFO: renamed from: t4.b$b */
    public enum b {
        SERVER_RESET,
        OTHER
    }

    /* JADX INFO: renamed from: t4.b$c */
    private enum c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public C7080b(C7081c c7081c, C7084f c7084f, String str, a aVar, String str2, String str3) {
        long j7 = f28257f;
        f28257f = 1 + j7;
        this.f28258a = c7084f;
        this.f28260c = aVar;
        this.f28262e = new C0144c(c7081c.m31223f(), "Connection", "conn_" + j7);
        this.f28261d = c.REALTIME_CONNECTING;
        this.f28259b = new C7095q(c7081c, c7084f, str, str3, this, str2);
    }

    /* JADX INFO: renamed from: e */
    private void m31198e(long j7, String str) {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("realtime connection established", new Object[0]);
        }
        this.f28261d = c.REALTIME_CONNECTED;
        this.f28260c.mo31213j(j7, str);
    }

    /* JADX INFO: renamed from: f */
    private void m31199f(String str) {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.f28260c.mo31212h(str);
        m31207c();
    }

    /* JADX INFO: renamed from: g */
    private void m31200g(Map map) {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("Got control message: " + map.toString(), new Object[0]);
        }
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f28262e.m627f()) {
                    this.f28262e.m624b("Got invalid control message: " + map.toString(), new Object[0]);
                }
                m31207c();
                return;
            }
            if (str.equals("s")) {
                m31199f((String) map.get("d"));
                return;
            }
            if (str.equals("r")) {
                m31203j((String) map.get("d"));
                return;
            }
            if (str.equals("h")) {
                m31202i((Map) map.get("d"));
                return;
            }
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("Ignoring unknown control message: " + str, new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("Failed to parse control message: " + e7.toString(), new Object[0]);
            }
            m31207c();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m31201h(Map map) {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("received data message: " + map.toString(), new Object[0]);
        }
        this.f28260c.mo31215n(map);
    }

    /* JADX INFO: renamed from: i */
    private void m31202i(Map map) {
        long jLongValue = ((Long) map.get("ts")).longValue();
        this.f28260c.mo31211f((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.f28261d == c.REALTIME_CONNECTING) {
            this.f28259b.m31373y();
            m31198e(jLongValue, str);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m31203j(String str) {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("Got a reset; killing connection to " + this.f28258a.m31236b() + "; Updating internalHost to " + str, new Object[0]);
        }
        this.f28260c.mo31211f(str);
        m31208d(b.SERVER_RESET);
    }

    /* JADX INFO: renamed from: l */
    private void m31204l(Map map, boolean z7) {
        if (this.f28261d != c.REALTIME_CONNECTED) {
            this.f28262e.m624b("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z7) {
            this.f28262e.m624b("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f28262e.m624b("Sending data: %s", map);
        }
        this.f28259b.m31372v(map);
    }

    @Override // p358t4.C7095q.c
    /* JADX INFO: renamed from: a */
    public void mo31205a(Map map) {
        try {
            String str = (String) map.get("t");
            if (str == null) {
                if (this.f28262e.m627f()) {
                    this.f28262e.m624b("Failed to parse server message: missing message type:" + map.toString(), new Object[0]);
                }
                m31207c();
                return;
            }
            if (str.equals("d")) {
                m31201h((Map) map.get("d"));
                return;
            }
            if (str.equals("c")) {
                m31200g((Map) map.get("d"));
                return;
            }
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("Ignoring unknown server message type: " + str, new Object[0]);
            }
        } catch (ClassCastException e7) {
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("Failed to parse server message: " + e7.toString(), new Object[0]);
            }
            m31207c();
        }
    }

    @Override // p358t4.C7095q.c
    /* JADX INFO: renamed from: b */
    public void mo31206b(boolean z7) {
        this.f28259b = null;
        if (z7 || this.f28261d != c.REALTIME_CONNECTING) {
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("Realtime connection lost", new Object[0]);
            }
        } else if (this.f28262e.m627f()) {
            this.f28262e.m624b("Realtime connection failed", new Object[0]);
        }
        m31207c();
    }

    /* JADX INFO: renamed from: c */
    public void m31207c() {
        m31208d(b.OTHER);
    }

    /* JADX INFO: renamed from: d */
    public void m31208d(b bVar) {
        c cVar = this.f28261d;
        c cVar2 = c.REALTIME_DISCONNECTED;
        if (cVar != cVar2) {
            if (this.f28262e.m627f()) {
                this.f28262e.m624b("closing realtime connection", new Object[0]);
            }
            this.f28261d = cVar2;
            C7095q c7095q = this.f28259b;
            if (c7095q != null) {
                c7095q.m31370k();
                this.f28259b = null;
            }
            this.f28260c.mo31214l(bVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m31209k() {
        if (this.f28262e.m627f()) {
            this.f28262e.m624b("Opening a connection", new Object[0]);
        }
        this.f28259b.m31371t();
    }

    /* JADX INFO: renamed from: m */
    public void m31210m(Map map, boolean z7) {
        HashMap map2 = new HashMap();
        map2.put("t", "d");
        map2.put("d", map);
        m31204l(map2, z7);
    }
}
