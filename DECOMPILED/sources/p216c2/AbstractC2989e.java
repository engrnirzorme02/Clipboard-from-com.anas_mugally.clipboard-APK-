package p216c2;

import android.content.Context;
import p138R5.InterfaceC1380a;
import p226d2.C5221j;
import p226d2.C5223l;
import p234e2.AbstractC5338d;
import p234e2.C5335a;
import p234e2.C5337c;
import p234e2.InterfaceC5336b;
import p266i2.C5688d;
import p266i2.C5691g;
import p266i2.C5693i;
import p274j2.C5856s;
import p274j2.C5860w;
import p282k2.C5982N;
import p282k2.C5991X;
import p282k2.C5998g;
import p282k2.C5999h;
import p282k2.C6000i;
import p282k2.C6001j;
import p282k2.InterfaceC5995d;
import p298m2.C6330c;
import p298m2.C6331d;

/* JADX INFO: renamed from: c2.e */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC2989e {

    /* JADX INFO: renamed from: c2.e$b */
    private static final class b implements AbstractC3006v.a {

        /* JADX INFO: renamed from: a */
        private Context f12392a;

        private b() {
        }

        @Override // p216c2.AbstractC3006v.a
        /* JADX INFO: renamed from: a */
        public AbstractC3006v mo14937a() {
            AbstractC5338d.m24328a(this.f12392a, Context.class);
            return new c(this.f12392a);
        }

        @Override // p216c2.AbstractC3006v.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b mo14938b(Context context) {
            this.f12392a = (Context) AbstractC5338d.m24329b(context);
            return this;
        }
    }

    /* JADX INFO: renamed from: c2.e$c */
    private static final class c extends AbstractC3006v {

        /* JADX INFO: renamed from: a */
        private final c f12393a;

        /* JADX INFO: renamed from: b */
        private InterfaceC1380a f12394b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1380a f12395c;

        /* JADX INFO: renamed from: d */
        private InterfaceC1380a f12396d;

        /* JADX INFO: renamed from: e */
        private InterfaceC1380a f12397e;

        /* JADX INFO: renamed from: f */
        private InterfaceC1380a f12398f;

        /* JADX INFO: renamed from: r */
        private InterfaceC1380a f12399r;

        /* JADX INFO: renamed from: s */
        private InterfaceC1380a f12400s;

        /* JADX INFO: renamed from: t */
        private InterfaceC1380a f12401t;

        /* JADX INFO: renamed from: u */
        private InterfaceC1380a f12402u;

        /* JADX INFO: renamed from: v */
        private InterfaceC1380a f12403v;

        /* JADX INFO: renamed from: w */
        private InterfaceC1380a f12404w;

        /* JADX INFO: renamed from: x */
        private InterfaceC1380a f12405x;

        /* JADX INFO: renamed from: y */
        private InterfaceC1380a f12406y;

        /* JADX INFO: renamed from: n */
        private void m14940n(Context context) {
            this.f12394b = C5335a.m24325a(C2995k.m14956a());
            InterfaceC5336b interfaceC5336bM24327a = C5337c.m24327a(context);
            this.f12395c = interfaceC5336bM24327a;
            C5221j c5221jM24136a = C5221j.m24136a(interfaceC5336bM24327a, C6330c.m27286a(), C6331d.m27290a());
            this.f12396d = c5221jM24136a;
            this.f12397e = C5335a.m24325a(C5223l.m24143a(this.f12395c, c5221jM24136a));
            this.f12398f = C5991X.m27004a(this.f12395c, C5998g.m27026a(), C6000i.m27033a());
            this.f12399r = C5335a.m24325a(C5999h.m27030a(this.f12395c));
            this.f12400s = C5335a.m24325a(C5982N.m26990a(C6330c.m27286a(), C6331d.m27290a(), C6001j.m27037a(), this.f12398f, this.f12399r));
            C5691g c5691gM25244b = C5691g.m25244b(C6330c.m27286a());
            this.f12401t = c5691gM25244b;
            C5693i c5693iM25247a = C5693i.m25247a(this.f12395c, this.f12400s, c5691gM25244b, C6331d.m27290a());
            this.f12402u = c5693iM25247a;
            InterfaceC1380a interfaceC1380a = this.f12394b;
            InterfaceC1380a interfaceC1380a2 = this.f12397e;
            InterfaceC1380a interfaceC1380a3 = this.f12400s;
            this.f12403v = C5688d.m25239a(interfaceC1380a, interfaceC1380a2, c5693iM25247a, interfaceC1380a3, interfaceC1380a3);
            InterfaceC1380a interfaceC1380a4 = this.f12395c;
            InterfaceC1380a interfaceC1380a5 = this.f12397e;
            InterfaceC1380a interfaceC1380a6 = this.f12400s;
            this.f12404w = C5856s.m26267a(interfaceC1380a4, interfaceC1380a5, interfaceC1380a6, this.f12402u, this.f12394b, interfaceC1380a6, C6330c.m27286a(), C6331d.m27290a(), this.f12400s);
            InterfaceC1380a interfaceC1380a7 = this.f12394b;
            InterfaceC1380a interfaceC1380a8 = this.f12400s;
            this.f12405x = C5860w.m26273a(interfaceC1380a7, interfaceC1380a8, this.f12402u, interfaceC1380a8);
            this.f12406y = C5335a.m24325a(C3007w.m14976a(C6330c.m27286a(), C6331d.m27290a(), this.f12403v, this.f12404w, this.f12405x));
        }

        @Override // p216c2.AbstractC3006v
        /* JADX INFO: renamed from: d */
        InterfaceC5995d mo14941d() {
            return (InterfaceC5995d) this.f12400s.get();
        }

        @Override // p216c2.AbstractC3006v
        /* JADX INFO: renamed from: m */
        C3005u mo14942m() {
            return (C3005u) this.f12406y.get();
        }

        private c(Context context) {
            this.f12393a = this;
            m14940n(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC3006v.a m14936a() {
        return new b();
    }
}
