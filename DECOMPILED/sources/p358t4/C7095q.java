package p358t4;

import java.io.EOFException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p022C4.C0144c;
import p038E4.C0384c;
import p038E4.C0386e;
import p038E4.C0388g;
import p038E4.InterfaceC0385d;
import p046F4.AbstractC0432b;
import p366u4.C7161b;

/* JADX INFO: renamed from: t4.q */
/* JADX INFO: loaded from: classes.dex */
class C7095q {

    /* JADX INFO: renamed from: l */
    private static long f28368l;

    /* JADX INFO: renamed from: a */
    private d f28369a;

    /* JADX INFO: renamed from: b */
    private boolean f28370b = false;

    /* JADX INFO: renamed from: c */
    private boolean f28371c = false;

    /* JADX INFO: renamed from: d */
    private long f28372d = 0;

    /* JADX INFO: renamed from: e */
    private C7161b f28373e;

    /* JADX INFO: renamed from: f */
    private c f28374f;

    /* JADX INFO: renamed from: g */
    private ScheduledFuture f28375g;

    /* JADX INFO: renamed from: h */
    private ScheduledFuture f28376h;

    /* JADX INFO: renamed from: i */
    private final C7081c f28377i;

    /* JADX INFO: renamed from: j */
    private final ScheduledExecutorService f28378j;

    /* JADX INFO: renamed from: k */
    private final C0144c f28379k;

    /* JADX INFO: renamed from: t4.q$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7095q.this.m31359l();
        }
    }

    /* JADX INFO: renamed from: t4.q$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7095q.this.f28369a != null) {
                C7095q.this.f28369a.mo31374b("0");
                C7095q.this.m31367u();
            }
        }
    }

    /* JADX INFO: renamed from: t4.q$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo31205a(Map map);

        /* JADX INFO: renamed from: b */
        void mo31206b(boolean z7);
    }

    /* JADX INFO: renamed from: t4.q$d */
    private interface d {
        /* JADX INFO: renamed from: b */
        void mo31374b(String str);

        /* JADX INFO: renamed from: c */
        void mo31375c();

        void close();
    }

    /* JADX INFO: renamed from: t4.q$e */
    private class e implements d, InterfaceC0385d {

        /* JADX INFO: renamed from: a */
        private C0384c f28382a;

        /* JADX INFO: renamed from: t4.q$e$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C7095q.this.f28376h.cancel(false);
                C7095q.this.f28370b = true;
                if (C7095q.this.f28379k.m627f()) {
                    C7095q.this.f28379k.m624b("websocket opened", new Object[0]);
                }
                C7095q.this.m31367u();
            }
        }

        /* JADX INFO: renamed from: t4.q$e$b */
        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ String f28385a;

            b(String str) {
                this.f28385a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7095q.this.m31362o(this.f28385a);
            }
        }

        /* JADX INFO: renamed from: t4.q$e$c */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C7095q.this.f28379k.m627f()) {
                    C7095q.this.f28379k.m624b("closed", new Object[0]);
                }
                C7095q.this.m31366s();
            }
        }

        /* JADX INFO: renamed from: t4.q$e$d */
        class d implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ C0386e f28388a;

            d(C0386e c0386e) {
                this.f28388a = c0386e;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f28388a.getCause() == null || !(this.f28388a.getCause() instanceof EOFException)) {
                    C7095q.this.f28379k.m623a("WebSocket error.", this.f28388a, new Object[0]);
                } else {
                    C7095q.this.f28379k.m624b("WebSocket reached EOF.", new Object[0]);
                }
                C7095q.this.m31366s();
            }
        }

        /* synthetic */ e(C7095q c7095q, C0384c c0384c, a aVar) {
            this(c0384c);
        }

        /* JADX INFO: renamed from: g */
        private void m31376g() {
            this.f28382a.m1630c();
            try {
                this.f28382a.m1629b();
            } catch (InterruptedException e7) {
                C7095q.this.f28379k.m625c("Interrupted while shutting down websocket threads", e7);
            }
        }

        @Override // p038E4.InterfaceC0385d
        /* JADX INFO: renamed from: a */
        public void mo1640a() {
            C7095q.this.f28378j.execute(new a());
        }

        @Override // p358t4.C7095q.d
        /* JADX INFO: renamed from: b */
        public void mo31374b(String str) {
            this.f28382a.m1637p(str);
        }

        @Override // p358t4.C7095q.d
        /* JADX INFO: renamed from: c */
        public void mo31375c() {
            try {
                this.f28382a.m1631e();
            } catch (C0386e e7) {
                if (C7095q.this.f28379k.m627f()) {
                    C7095q.this.f28379k.m623a("Error connecting", e7, new Object[0]);
                }
                m31376g();
            }
        }

        @Override // p358t4.C7095q.d
        public void close() {
            this.f28382a.m1630c();
        }

        @Override // p038E4.InterfaceC0385d
        /* JADX INFO: renamed from: d */
        public void mo1641d(C0386e c0386e) {
            C7095q.this.f28378j.execute(new d(c0386e));
        }

        @Override // p038E4.InterfaceC0385d
        /* JADX INFO: renamed from: e */
        public void mo1642e() {
            C7095q.this.f28378j.execute(new c());
        }

        @Override // p038E4.InterfaceC0385d
        /* JADX INFO: renamed from: f */
        public void mo1643f(C0388g c0388g) {
            String strM1650a = c0388g.m1650a();
            if (C7095q.this.f28379k.m627f()) {
                C7095q.this.f28379k.m624b("ws message: " + strM1650a, new Object[0]);
            }
            C7095q.this.f28378j.execute(new b(strM1650a));
        }

        private e(C0384c c0384c) {
            this.f28382a = c0384c;
            c0384c.m1638r(this);
        }
    }

    public C7095q(C7081c c7081c, C7084f c7084f, String str, String str2, c cVar, String str3) {
        this.f28377i = c7081c;
        this.f28378j = c7081c.m31222e();
        this.f28374f = cVar;
        long j7 = f28368l;
        f28368l = 1 + j7;
        this.f28379k = new C0144c(c7081c.m31223f(), "WebSocket", "ws_" + j7);
        this.f28369a = m31360m(c7084f, str, str2, str3);
    }

    /* JADX INFO: renamed from: j */
    private void m31358j(String str) {
        this.f28373e.m31662d(str);
        long j7 = this.f28372d - 1;
        this.f28372d = j7;
        if (j7 == 0) {
            try {
                this.f28373e.m31661Q();
                Map mapM1861a = AbstractC0432b.m1861a(this.f28373e.toString());
                this.f28373e = null;
                if (this.f28379k.m627f()) {
                    this.f28379k.m624b("handleIncomingFrame complete frame: " + mapM1861a, new Object[0]);
                }
                this.f28374f.mo31205a(mapM1861a);
            } catch (IOException e7) {
                this.f28379k.m625c("Error parsing frame: " + this.f28373e.toString(), e7);
                m31370k();
                m31368w();
            } catch (ClassCastException e8) {
                this.f28379k.m625c("Error parsing frame (cast error): " + this.f28373e.toString(), e8);
                m31370k();
                m31368w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m31359l() {
        if (this.f28370b || this.f28371c) {
            return;
        }
        if (this.f28379k.m627f()) {
            this.f28379k.m624b("timed out on connect", new Object[0]);
        }
        this.f28369a.close();
    }

    /* JADX INFO: renamed from: m */
    private d m31360m(C7084f c7084f, String str, String str2, String str3) {
        if (str == null) {
            str = c7084f.m31236b();
        }
        URI uriM31235a = C7084f.m31235a(str, c7084f.m31238d(), c7084f.m31237c(), str3);
        HashMap map = new HashMap();
        map.put("User-Agent", this.f28377i.m31225h());
        map.put("X-Firebase-GMPID", this.f28377i.m31219b());
        map.put("X-Firebase-AppCheck", str2);
        return new e(this, new C0384c(this.f28377i, uriM31235a, null, map), null);
    }

    /* JADX INFO: renamed from: n */
    private String m31361n(String str) {
        if (str.length() <= 6) {
            try {
                int i7 = Integer.parseInt(str);
                if (i7 <= 0) {
                    return null;
                }
                m31363p(i7);
                return null;
            } catch (NumberFormatException unused) {
            }
        }
        m31363p(1);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m31362o(String str) {
        if (this.f28371c) {
            return;
        }
        m31367u();
        if (m31364q()) {
            m31358j(str);
            return;
        }
        String strM31361n = m31361n(str);
        if (strM31361n != null) {
            m31358j(strM31361n);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m31363p(int i7) {
        this.f28372d = i7;
        this.f28373e = new C7161b();
        if (this.f28379k.m627f()) {
            this.f28379k.m624b("HandleNewFrameCount: " + this.f28372d, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: q */
    private boolean m31364q() {
        return this.f28373e != null;
    }

    /* JADX INFO: renamed from: r */
    private Runnable m31365r() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m31366s() {
        if (!this.f28371c) {
            if (this.f28379k.m627f()) {
                this.f28379k.m624b("closing itself", new Object[0]);
            }
            m31368w();
        }
        this.f28369a = null;
        ScheduledFuture scheduledFuture = this.f28375g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m31367u() {
        if (this.f28371c) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f28375g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            if (this.f28379k.m627f()) {
                this.f28379k.m624b("Reset keepAlive. Remaining: " + this.f28375g.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
            }
        } else if (this.f28379k.m627f()) {
            this.f28379k.m624b("Reset keepAlive", new Object[0]);
        }
        this.f28375g = this.f28378j.schedule(m31365r(), 45000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: w */
    private void m31368w() {
        this.f28371c = true;
        this.f28374f.mo31206b(this.f28370b);
    }

    /* JADX INFO: renamed from: x */
    private static String[] m31369x(String str, int i7) {
        if (str.length() <= i7) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < str.length()) {
            int i9 = i8 + i7;
            arrayList.add(str.substring(i8, Math.min(i9, str.length())));
            i8 = i9;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: k */
    public void m31370k() {
        if (this.f28379k.m627f()) {
            this.f28379k.m624b("websocket is being closed", new Object[0]);
        }
        this.f28371c = true;
        this.f28369a.close();
        ScheduledFuture scheduledFuture = this.f28376h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledFuture scheduledFuture2 = this.f28375g;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m31371t() {
        this.f28369a.mo31375c();
        this.f28376h = this.f28378j.schedule(new a(), 30000L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: v */
    public void m31372v(Map map) {
        m31367u();
        try {
            String[] strArrM31369x = m31369x(AbstractC0432b.m1863c(map), 16384);
            if (strArrM31369x.length > 1) {
                this.f28369a.mo31374b("" + strArrM31369x.length);
            }
            for (String str : strArrM31369x) {
                this.f28369a.mo31374b(str);
            }
        } catch (IOException e7) {
            this.f28379k.m625c("Failed to serialize message: " + map.toString(), e7);
            m31368w();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m31373y() {
    }
}
