package p374v4;

import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.database.C4906c;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p022C4.C0144c;
import p022C4.InterfaceC0145d;
import p164V3.C1762g;
import p334q4.C6835b;
import p342r4.C6913m;
import p358t4.C7081c;
import p358t4.C7084f;
import p358t4.InterfaceC7082d;
import p358t4.InterfaceC7086h;
import p390x4.C7409d;
import p390x4.InterfaceC7410e;
import p398y4.AbstractC7542c;

/* JADX INFO: renamed from: v4.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7241f {

    /* JADX INFO: renamed from: a */
    protected InterfaceC0145d f28853a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC7244i f28854b;

    /* JADX INFO: renamed from: c */
    protected InterfaceC7261z f28855c;

    /* JADX INFO: renamed from: d */
    protected InterfaceC7261z f28856d;

    /* JADX INFO: renamed from: e */
    protected InterfaceC7252q f28857e;

    /* JADX INFO: renamed from: f */
    protected String f28858f;

    /* JADX INFO: renamed from: g */
    protected List f28859g;

    /* JADX INFO: renamed from: h */
    protected String f28860h;

    /* JADX INFO: renamed from: j */
    protected boolean f28862j;

    /* JADX INFO: renamed from: l */
    protected C1762g f28864l;

    /* JADX INFO: renamed from: m */
    private InterfaceC7410e f28865m;

    /* JADX INFO: renamed from: p */
    private InterfaceC7246k f28868p;

    /* JADX INFO: renamed from: i */
    protected InterfaceC0145d.a f28861i = InterfaceC0145d.a.INFO;

    /* JADX INFO: renamed from: k */
    protected long f28863k = 10485760;

    /* JADX INFO: renamed from: n */
    private boolean f28866n = false;

    /* JADX INFO: renamed from: o */
    private boolean f28867o = false;

    /* JADX INFO: renamed from: v4.f$a */
    class a implements InterfaceC7261z.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ScheduledExecutorService f28869a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC7082d.a f28870b;

        a(ScheduledExecutorService scheduledExecutorService, InterfaceC7082d.a aVar) {
            this.f28869a = scheduledExecutorService;
            this.f28870b = aVar;
        }

        @Override // p374v4.InterfaceC7261z.a
        /* JADX INFO: renamed from: a */
        public void mo31982a(final String str) {
            ScheduledExecutorService scheduledExecutorService = this.f28869a;
            final InterfaceC7082d.a aVar = this.f28870b;
            scheduledExecutorService.execute(new Runnable() { // from class: v4.e
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo31228a(str);
                }
            });
        }

        @Override // p374v4.InterfaceC7261z.a
        /* JADX INFO: renamed from: b */
        public void mo31983b(final String str) {
            ScheduledExecutorService scheduledExecutorService = this.f28869a;
            final InterfaceC7082d.a aVar = this.f28870b;
            scheduledExecutorService.execute(new Runnable() { // from class: v4.d
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.mo31229b(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    private synchronized void m31947A() {
        this.f28868p = new C6913m(this.f28864l);
    }

    /* JADX INFO: renamed from: F */
    private void m31948F() {
        this.f28854b.mo30264a();
        this.f28857e.mo32087a();
    }

    /* JADX INFO: renamed from: G */
    private static InterfaceC7082d m31949G(final InterfaceC7261z interfaceC7261z, final ScheduledExecutorService scheduledExecutorService) {
        return new InterfaceC7082d() { // from class: v4.c
            @Override // p358t4.InterfaceC7082d
            /* JADX INFO: renamed from: a */
            public final void mo31227a(boolean z7, InterfaceC7082d.a aVar) {
                interfaceC7261z.mo30256b(z7, new AbstractC7241f.a(scheduledExecutorService, aVar));
            }
        };
    }

    /* JADX INFO: renamed from: c */
    private String m31951c(String str) {
        return "Firebase/5/" + C4906c.m22116e() + "/" + str;
    }

    /* JADX INFO: renamed from: d */
    private void m31952d() {
        AbstractC3718s.m18084m(this.f28856d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    /* JADX INFO: renamed from: e */
    private void m31953e() {
        AbstractC3718s.m18084m(this.f28855c, "You must register an authTokenProvider before initializing Context.");
    }

    /* JADX INFO: renamed from: f */
    private void m31954f() {
        if (this.f28854b == null) {
            this.f28854b = m31960u().mo30271e(this);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m31955g() {
        if (this.f28853a == null) {
            this.f28853a = m31960u().mo30269c(this, this.f28861i, this.f28859g);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m31956h() {
        if (this.f28857e == null) {
            this.f28857e = this.f28868p.mo30273g(this);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m31957i() {
        if (this.f28858f == null) {
            this.f28858f = "default";
        }
    }

    /* JADX INFO: renamed from: j */
    private void m31958j() {
        if (this.f28860h == null) {
            this.f28860h = m31951c(m31960u().mo30272f(this));
        }
    }

    /* JADX INFO: renamed from: p */
    private ScheduledExecutorService m31959p() {
        InterfaceC7252q interfaceC7252qM31976v = m31976v();
        if (interfaceC7252qM31976v instanceof AbstractC7542c) {
            return ((AbstractC7542c) interfaceC7252qM31976v).m33184d();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    /* JADX INFO: renamed from: u */
    private InterfaceC7246k m31960u() {
        if (this.f28868p == null) {
            m31947A();
        }
        return this.f28868p;
    }

    /* JADX INFO: renamed from: z */
    private void m31961z() {
        m31955g();
        m31960u();
        m31958j();
        m31954f();
        m31956h();
        m31957i();
        m31953e();
        m31952d();
    }

    /* JADX INFO: renamed from: B */
    public boolean m31962B() {
        return this.f28866n;
    }

    /* JADX INFO: renamed from: C */
    public boolean m31963C() {
        return this.f28862j;
    }

    /* JADX INFO: renamed from: D */
    public InterfaceC7086h m31964D(C7084f c7084f, InterfaceC7086h.a aVar) {
        return m31960u().mo30267a(this, m31970n(), c7084f, aVar);
    }

    /* JADX INFO: renamed from: E */
    public void m31965E() {
        if (this.f28867o) {
            m31948F();
            this.f28867o = false;
        }
    }

    /* JADX INFO: renamed from: b */
    protected void m31966b() {
        if (m31962B()) {
            throw new C6835b("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    /* JADX INFO: renamed from: k */
    synchronized void m31967k() {
        if (!this.f28866n) {
            this.f28866n = true;
            m31961z();
        }
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC7261z m31968l() {
        return this.f28856d;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC7261z m31969m() {
        return this.f28855c;
    }

    /* JADX INFO: renamed from: n */
    public C7081c m31970n() {
        return new C7081c(m31973r(), m31949G(m31969m(), m31959p()), m31949G(m31968l(), m31959p()), m31959p(), m31963C(), C4906c.m22116e(), m31979y(), this.f28864l.m7407p().m7423c(), m31977w().getAbsolutePath());
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC7244i m31971o() {
        return this.f28854b;
    }

    /* JADX INFO: renamed from: q */
    public C0144c m31972q(String str) {
        return new C0144c(this.f28853a, str);
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC0145d m31973r() {
        return this.f28853a;
    }

    /* JADX INFO: renamed from: s */
    public long m31974s() {
        return this.f28863k;
    }

    /* JADX INFO: renamed from: t */
    InterfaceC7410e m31975t(String str) {
        InterfaceC7410e interfaceC7410e = this.f28865m;
        if (interfaceC7410e != null) {
            return interfaceC7410e;
        }
        if (!this.f28862j) {
            return new C7409d();
        }
        InterfaceC7410e interfaceC7410eMo30270d = this.f28868p.mo30270d(this, str);
        if (interfaceC7410eMo30270d != null) {
            return interfaceC7410eMo30270d;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC7252q m31976v() {
        return this.f28857e;
    }

    /* JADX INFO: renamed from: w */
    public File m31977w() {
        return m31960u().mo30268b();
    }

    /* JADX INFO: renamed from: x */
    public String m31978x() {
        return this.f28858f;
    }

    /* JADX INFO: renamed from: y */
    public String m31979y() {
        return this.f28860h;
    }
}
