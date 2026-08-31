package p268i4;

import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;

/* JADX INFO: renamed from: i4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5705a implements InterfaceC0843a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0843a f21763a = new C5705a();

    /* JADX INFO: renamed from: i4.a$a */
    private static final class a implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final a f21764a = new a();

        /* JADX INFO: renamed from: b */
        private static final C0747c f21765b = C0747c.m3509d("rolloutId");

        /* JADX INFO: renamed from: c */
        private static final C0747c f21766c = C0747c.m3509d("parameterKey");

        /* JADX INFO: renamed from: d */
        private static final C0747c f21767d = C0747c.m3509d("parameterValue");

        /* JADX INFO: renamed from: e */
        private static final C0747c f21768e = C0747c.m3509d("variantId");

        /* JADX INFO: renamed from: f */
        private static final C0747c f21769f = C0747c.m3509d("templateVersion");

        private a() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(AbstractC5714j abstractC5714j, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f21765b, abstractC5714j.mo25269e());
            interfaceC0749e.mo3519g(f21766c, abstractC5714j.mo25267c());
            interfaceC0749e.mo3519g(f21767d, abstractC5714j.mo25268d());
            interfaceC0749e.mo3519g(f21768e, abstractC5714j.mo25271g());
            interfaceC0749e.mo3518d(f21769f, abstractC5714j.mo25270f());
        }
    }

    private C5705a() {
    }

    @Override // p094L4.InterfaceC0843a
    /* JADX INFO: renamed from: a */
    public void mo3886a(InterfaceC0844b interfaceC0844b) {
        a aVar = a.f21764a;
        interfaceC0844b.mo3887a(AbstractC5714j.class, aVar);
        interfaceC0844b.mo3887a(C5706b.class, aVar);
    }
}
