package p216c2;

import androidx.appcompat.app.AbstractC2263x;
import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;
import p109N4.C0970a;
import p242f2.C5429a;
import p242f2.C5430b;
import p242f2.C5431c;
import p242f2.C5432d;
import p242f2.C5433e;
import p242f2.C5434f;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2985a implements InterfaceC0843a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0843a f12334a = new C2985a();

    /* JADX INFO: renamed from: c2.a$a */
    private static final class a implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final a f12335a = new a();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12336b = C0747c.m3508a("window").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f12337c = C0747c.m3508a("logSourceMetrics").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

        /* JADX INFO: renamed from: d */
        private static final C0747c f12338d = C0747c.m3508a("globalMetrics").m3513b(C0970a.m4222b().m4224c(3).m4223a()).m3512a();

        /* JADX INFO: renamed from: e */
        private static final C0747c f12339e = C0747c.m3508a("appNamespace").m3513b(C0970a.m4222b().m4224c(4).m4223a()).m3512a();

        private a() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5429a c5429a, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f12336b, c5429a.m24607d());
            interfaceC0749e.mo3519g(f12337c, c5429a.m24606c());
            interfaceC0749e.mo3519g(f12338d, c5429a.m24605b());
            interfaceC0749e.mo3519g(f12339e, c5429a.m24604a());
        }
    }

    /* JADX INFO: renamed from: c2.a$b */
    private static final class b implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final b f12340a = new b();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12341b = C0747c.m3508a("storageMetrics").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        private b() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5430b c5430b, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f12341b, c5430b.m24615a());
        }
    }

    /* JADX INFO: renamed from: c2.a$c */
    private static final class c implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final c f12342a = new c();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12343b = C0747c.m3508a("eventsDroppedCount").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f12344c = C0747c.m3508a("reason").m3513b(C0970a.m4222b().m4224c(3).m4223a()).m3512a();

        private c() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5431c c5431c, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3518d(f12343b, c5431c.m24619a());
            interfaceC0749e.mo3519g(f12344c, c5431c.m24620b());
        }
    }

    /* JADX INFO: renamed from: c2.a$d */
    private static final class d implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final d f12345a = new d();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12346b = C0747c.m3508a("logSource").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f12347c = C0747c.m3508a("logEventDropped").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

        private d() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5432d c5432d, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f12346b, c5432d.m24626b());
            interfaceC0749e.mo3519g(f12347c, c5432d.m24625a());
        }
    }

    /* JADX INFO: renamed from: c2.a$e */
    private static final class e implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final e f12348a = new e();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12349b = C0747c.m3509d("clientMetrics");

        private e() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3514a(Object obj, Object obj2) {
            AbstractC2263x.m9328a(obj);
            m14893b(null, (InterfaceC0749e) obj2);
        }

        /* JADX INFO: renamed from: b */
        public void m14893b(AbstractC2997m abstractC2997m, InterfaceC0749e interfaceC0749e) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: c2.a$f */
    private static final class f implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final f f12350a = new f();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12351b = C0747c.m3508a("currentCacheSizeBytes").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f12352c = C0747c.m3508a("maxCacheSizeBytes").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

        private f() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5433e c5433e, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3518d(f12351b, c5433e.m24631a());
            interfaceC0749e.mo3518d(f12352c, c5433e.m24632b());
        }
    }

    /* JADX INFO: renamed from: c2.a$g */
    private static final class g implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final g f12353a = new g();

        /* JADX INFO: renamed from: b */
        private static final C0747c f12354b = C0747c.m3508a("startMs").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f12355c = C0747c.m3508a("endMs").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

        private g() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5434f c5434f, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3518d(f12354b, c5434f.m24638b());
            interfaceC0749e.mo3518d(f12355c, c5434f.m24637a());
        }
    }

    private C2985a() {
    }

    @Override // p094L4.InterfaceC0843a
    /* JADX INFO: renamed from: a */
    public void mo3886a(InterfaceC0844b interfaceC0844b) {
        interfaceC0844b.mo3887a(AbstractC2997m.class, e.f12348a);
        interfaceC0844b.mo3887a(C5429a.class, a.f12335a);
        interfaceC0844b.mo3887a(C5434f.class, g.f12353a);
        interfaceC0844b.mo3887a(C5432d.class, d.f12345a);
        interfaceC0844b.mo3887a(C5431c.class, c.f12342a);
        interfaceC0844b.mo3887a(C5430b.class, b.f12340a);
        interfaceC0844b.mo3887a(C5433e.class, f.f12350a);
    }
}
