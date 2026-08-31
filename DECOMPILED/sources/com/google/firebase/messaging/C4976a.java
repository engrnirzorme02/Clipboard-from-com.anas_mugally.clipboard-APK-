package com.google.firebase.messaging;

import androidx.appcompat.app.AbstractC2263x;
import p086K4.C0747c;
import p086K4.InterfaceC0748d;
import p086K4.InterfaceC0749e;
import p094L4.InterfaceC0843a;
import p094L4.InterfaceC0844b;
import p109N4.C0970a;
import p269i5.C5719a;
import p269i5.C5720b;

/* JADX INFO: renamed from: com.google.firebase.messaging.a */
/* JADX INFO: loaded from: classes.dex */
public final class C4976a implements InterfaceC0843a {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0843a f18878a = new C4976a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a */
    private static final class a implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final a f18879a = new a();

        /* JADX INFO: renamed from: b */
        private static final C0747c f18880b = C0747c.m3508a("projectNumber").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        /* JADX INFO: renamed from: c */
        private static final C0747c f18881c = C0747c.m3508a("messageId").m3513b(C0970a.m4222b().m4224c(2).m4223a()).m3512a();

        /* JADX INFO: renamed from: d */
        private static final C0747c f18882d = C0747c.m3508a("instanceId").m3513b(C0970a.m4222b().m4224c(3).m4223a()).m3512a();

        /* JADX INFO: renamed from: e */
        private static final C0747c f18883e = C0747c.m3508a("messageType").m3513b(C0970a.m4222b().m4224c(4).m4223a()).m3512a();

        /* JADX INFO: renamed from: f */
        private static final C0747c f18884f = C0747c.m3508a("sdkPlatform").m3513b(C0970a.m4222b().m4224c(5).m4223a()).m3512a();

        /* JADX INFO: renamed from: g */
        private static final C0747c f18885g = C0747c.m3508a("packageName").m3513b(C0970a.m4222b().m4224c(6).m4223a()).m3512a();

        /* JADX INFO: renamed from: h */
        private static final C0747c f18886h = C0747c.m3508a("collapseKey").m3513b(C0970a.m4222b().m4224c(7).m4223a()).m3512a();

        /* JADX INFO: renamed from: i */
        private static final C0747c f18887i = C0747c.m3508a("priority").m3513b(C0970a.m4222b().m4224c(8).m4223a()).m3512a();

        /* JADX INFO: renamed from: j */
        private static final C0747c f18888j = C0747c.m3508a("ttl").m3513b(C0970a.m4222b().m4224c(9).m4223a()).m3512a();

        /* JADX INFO: renamed from: k */
        private static final C0747c f18889k = C0747c.m3508a("topic").m3513b(C0970a.m4222b().m4224c(10).m4223a()).m3512a();

        /* JADX INFO: renamed from: l */
        private static final C0747c f18890l = C0747c.m3508a("bulkId").m3513b(C0970a.m4222b().m4224c(11).m4223a()).m3512a();

        /* JADX INFO: renamed from: m */
        private static final C0747c f18891m = C0747c.m3508a("event").m3513b(C0970a.m4222b().m4224c(12).m4223a()).m3512a();

        /* JADX INFO: renamed from: n */
        private static final C0747c f18892n = C0747c.m3508a("analyticsLabel").m3513b(C0970a.m4222b().m4224c(13).m4223a()).m3512a();

        /* JADX INFO: renamed from: o */
        private static final C0747c f18893o = C0747c.m3508a("campaignId").m3513b(C0970a.m4222b().m4224c(14).m4223a()).m3512a();

        /* JADX INFO: renamed from: p */
        private static final C0747c f18894p = C0747c.m3508a("composerLabel").m3513b(C0970a.m4222b().m4224c(15).m4223a()).m3512a();

        private a() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5719a c5719a, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3518d(f18880b, c5719a.m25378l());
            interfaceC0749e.mo3519g(f18881c, c5719a.m25374h());
            interfaceC0749e.mo3519g(f18882d, c5719a.m25373g());
            interfaceC0749e.mo3519g(f18883e, c5719a.m25375i());
            interfaceC0749e.mo3519g(f18884f, c5719a.m25379m());
            interfaceC0749e.mo3519g(f18885g, c5719a.m25376j());
            interfaceC0749e.mo3519g(f18886h, c5719a.m25370d());
            interfaceC0749e.mo3517c(f18887i, c5719a.m25377k());
            interfaceC0749e.mo3517c(f18888j, c5719a.m25381o());
            interfaceC0749e.mo3519g(f18889k, c5719a.m25380n());
            interfaceC0749e.mo3518d(f18890l, c5719a.m25368b());
            interfaceC0749e.mo3519g(f18891m, c5719a.m25372f());
            interfaceC0749e.mo3519g(f18892n, c5719a.m25367a());
            interfaceC0749e.mo3518d(f18893o, c5719a.m25369c());
            interfaceC0749e.mo3519g(f18894p, c5719a.m25371e());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final b f18895a = new b();

        /* JADX INFO: renamed from: b */
        private static final C0747c f18896b = C0747c.m3508a("messagingClientEvent").m3513b(C0970a.m4222b().m4224c(1).m4223a()).m3512a();

        private b() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo3514a(C5720b c5720b, InterfaceC0749e interfaceC0749e) {
            interfaceC0749e.mo3519g(f18896b, c5720b.m25400a());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements InterfaceC0748d {

        /* JADX INFO: renamed from: a */
        static final c f18897a = new c();

        /* JADX INFO: renamed from: b */
        private static final C0747c f18898b = C0747c.m3509d("messagingClientEventExtension");

        private c() {
        }

        @Override // p086K4.InterfaceC0748d
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3514a(Object obj, Object obj2) {
            AbstractC2263x.m9328a(obj);
            m22436b(null, (InterfaceC0749e) obj2);
        }

        /* JADX INFO: renamed from: b */
        public void m22436b(AbstractC4959I abstractC4959I, InterfaceC0749e interfaceC0749e) {
            throw null;
        }
    }

    private C4976a() {
    }

    @Override // p094L4.InterfaceC0843a
    /* JADX INFO: renamed from: a */
    public void mo3886a(InterfaceC0844b interfaceC0844b) {
        interfaceC0844b.mo3887a(AbstractC4959I.class, c.f18897a);
        interfaceC0844b.mo3887a(C5720b.class, b.f18895a);
        interfaceC0844b.mo3887a(C5719a.class, a.f18879a);
    }
}
