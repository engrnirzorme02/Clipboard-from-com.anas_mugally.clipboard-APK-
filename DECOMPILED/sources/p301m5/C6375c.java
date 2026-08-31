package p301m5;

import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;

/* JADX INFO: renamed from: m5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6375c implements InterfaceC0843a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0843a f24336a = new C6375c();

    /* JADX INFO: renamed from: m5.c$a */
    private static final class a implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final a f24337a = new a();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24338b = C0747c.m3509d("packageName");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24339c = C0747c.m3509d("versionName");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24340d = C0747c.m3509d("appBuildVersion");

        /* JADX INFO: renamed from: e */
        private static final C0747c f24341e = C0747c.m3509d("deviceManufacturer");

        /* JADX INFO: renamed from: f */
        private static final C0747c f24342f = C0747c.m3509d("currentProcessDetails");

        /* JADX INFO: renamed from: g */
        private static final C0747c f24343g = C0747c.m3509d("appProcessDetails");

        private a() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6372a c6372a, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24338b, c6372a.m27475e());
            interfaceC0749e.mo3519g(f24339c, c6372a.m27476f());
            interfaceC0749e.mo3519g(f24340d, c6372a.m27471a());
            interfaceC0749e.mo3519g(f24341e, c6372a.m27474d());
            interfaceC0749e.mo3519g(f24342f, c6372a.m27473c());
            interfaceC0749e.mo3519g(f24343g, c6372a.m27472b());
        }
    }

    /* JADX INFO: renamed from: m5.c$b */
    private static final class b implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final b f24344a = new b();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24345b = C0747c.m3509d("appId");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24346c = C0747c.m3509d("deviceModel");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24347d = C0747c.m3509d("sessionSdkVersion");

        /* JADX INFO: renamed from: e */
        private static final C0747c f24348e = C0747c.m3509d("osVersion");

        /* JADX INFO: renamed from: f */
        private static final C0747c f24349f = C0747c.m3509d("logEnvironment");

        /* JADX INFO: renamed from: g */
        private static final C0747c f24350g = C0747c.m3509d("androidAppInfo");

        private b() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6374b c6374b, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24345b, c6374b.m27478b());
            interfaceC0749e.mo3519g(f24346c, c6374b.m27479c());
            interfaceC0749e.mo3519g(f24347d, c6374b.m27482f());
            interfaceC0749e.mo3519g(f24348e, c6374b.m27481e());
            interfaceC0749e.mo3519g(f24349f, c6374b.m27480d());
            interfaceC0749e.mo3519g(f24350g, c6374b.m27477a());
        }
    }

    /* JADX INFO: renamed from: m5.c$c */
    private static final class c implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final c f24351a = new c();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24352b = C0747c.m3509d("performance");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24353c = C0747c.m3509d("crashlytics");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24354d = C0747c.m3509d("sessionSamplingRate");

        private c() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6377e c6377e, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24352b, c6377e.m27491b());
            interfaceC0749e.mo3519g(f24353c, c6377e.m27490a());
            interfaceC0749e.mo3516b(f24354d, c6377e.m27492c());
        }
    }

    /* JADX INFO: renamed from: m5.c$d */
    private static final class d implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final d f24355a = new d();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24356b = C0747c.m3509d("processName");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24357c = C0747c.m3509d("pid");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24358d = C0747c.m3509d("importance");

        /* JADX INFO: renamed from: e */
        private static final C0747c f24359e = C0747c.m3509d("defaultProcess");

        private d() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6349C c6349c, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24356b, c6349c.m27373c());
            interfaceC0749e.mo3517c(f24357c, c6349c.m27372b());
            interfaceC0749e.mo3517c(f24358d, c6349c.m27371a());
            interfaceC0749e.mo3515a(f24359e, c6349c.m27374d());
        }
    }

    /* JADX INFO: renamed from: m5.c$e */
    private static final class e implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final e f24360a = new e();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24361b = C0747c.m3509d("eventType");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24362c = C0747c.m3509d("sessionData");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24363d = C0747c.m3509d("applicationInfo");

        private e() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6355I c6355i, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24361b, c6355i.m27400b());
            interfaceC0749e.mo3519g(f24362c, c6355i.m27401c());
            interfaceC0749e.mo3519g(f24363d, c6355i.m27399a());
        }
    }

    /* JADX INFO: renamed from: m5.c$f */
    private static final class f implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final f f24364a = new f();

        /* JADX INFO: renamed from: b */
        private static final C0747c f24365b = C0747c.m3509d("sessionId");

        /* JADX INFO: renamed from: c */
        private static final C0747c f24366c = C0747c.m3509d("firstSessionId");

        /* JADX INFO: renamed from: d */
        private static final C0747c f24367d = C0747c.m3509d("sessionIndex");

        /* JADX INFO: renamed from: e */
        private static final C0747c f24368e = C0747c.m3509d("eventTimestampUs");

        /* JADX INFO: renamed from: f */
        private static final C0747c f24369f = C0747c.m3509d("dataCollectionStatus");

        /* JADX INFO: renamed from: g */
        private static final C0747c f24370g = C0747c.m3509d("firebaseInstallationId");

        /* JADX INFO: renamed from: h */
        private static final C0747c f24371h = C0747c.m3509d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C6362P c6362p, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f24365b, c6362p.m27429f());
            interfaceC0749e.mo3519g(f24366c, c6362p.m27428e());
            interfaceC0749e.mo3517c(f24367d, c6362p.m27430g());
            interfaceC0749e.mo3518d(f24368e, c6362p.m27425b());
            interfaceC0749e.mo3519g(f24369f, c6362p.m27424a());
            interfaceC0749e.mo3519g(f24370g, c6362p.m27427d());
            interfaceC0749e.mo3519g(f24371h, c6362p.m27426c());
        }
    }

    private C6375c() {
    }

    @Override // p094L4.InterfaceC0843a
    /* JADX INFO: renamed from: a */
    public void mo3886a(InterfaceC0844b interfaceC0844b) {
        interfaceC0844b.mo3887a(C6355I.class, e.f24360a);
        interfaceC0844b.mo3887a(C6362P.class, f.f24364a);
        interfaceC0844b.mo3887a(C6377e.class, c.f24351a);
        interfaceC0844b.mo3887a(C6374b.class, b.f24344a);
        interfaceC0844b.mo3887a(C6372a.class, a.f24337a);
        interfaceC0844b.mo3887a(C6349C.class, d.f24355a);
    }
}
