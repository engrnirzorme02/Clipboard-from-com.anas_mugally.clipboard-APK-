package com.google.firebase.sessions;

import android.content.Context;
import p164V3.C1762g;
import p173W5.InterfaceC1879i;
import p211b5.InterfaceC2972b;
import p219c5.InterfaceC3022e;
import p301m5.C6348B;
import p301m5.C6353G;
import p301m5.C6359M;
import p301m5.C6361O;
import p301m5.C6364S;
import p301m5.C6367V;
import p301m5.C6381i;
import p301m5.C6384l;
import p301m5.C6391s;
import p301m5.InterfaceC6365T;
import p317o5.AbstractC6596d;
import p317o5.C6593a;
import p317o5.C6595c;
import p317o5.InterfaceC6594b;
import p317o5.InterfaceC6597e;
import p327p5.C6760c;
import p327p5.C6763f;
import p327p5.C6764g;
import p327p5.C6768k;
import p327p5.C6771n;

/* JADX INFO: renamed from: com.google.firebase.sessions.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5015a {

    /* JADX INFO: renamed from: com.google.firebase.sessions.a$b */
    private static final class b implements InterfaceC5016b.a {

        /* JADX INFO: renamed from: a */
        private Context f18994a;

        /* JADX INFO: renamed from: b */
        private InterfaceC1879i f18995b;

        /* JADX INFO: renamed from: c */
        private InterfaceC1879i f18996c;

        /* JADX INFO: renamed from: d */
        private C1762g f18997d;

        /* JADX INFO: renamed from: e */
        private InterfaceC3022e f18998e;

        /* JADX INFO: renamed from: f */
        private InterfaceC2972b f18999f;

        private b() {
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: a */
        public InterfaceC5016b mo22555a() {
            AbstractC6596d.m27933a(this.f18994a, Context.class);
            AbstractC6596d.m27933a(this.f18995b, InterfaceC1879i.class);
            AbstractC6596d.m27933a(this.f18996c, InterfaceC1879i.class);
            AbstractC6596d.m27933a(this.f18997d, C1762g.class);
            AbstractC6596d.m27933a(this.f18998e, InterfaceC3022e.class);
            AbstractC6596d.m27933a(this.f18999f, InterfaceC2972b.class);
            return new c(this.f18994a, this.f18995b, this.f18996c, this.f18997d, this.f18998e, this.f18999f);
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b mo22561g(Context context) {
            this.f18994a = (Context) AbstractC6596d.m27934b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b mo22557c(InterfaceC1879i interfaceC1879i) {
            this.f18995b = (InterfaceC1879i) AbstractC6596d.m27934b(interfaceC1879i);
            return this;
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b mo22559e(InterfaceC1879i interfaceC1879i) {
            this.f18996c = (InterfaceC1879i) AbstractC6596d.m27934b(interfaceC1879i);
            return this;
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b mo22556b(C1762g c1762g) {
            this.f18997d = (C1762g) AbstractC6596d.m27934b(c1762g);
            return this;
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b mo22560f(InterfaceC3022e interfaceC3022e) {
            this.f18998e = (InterfaceC3022e) AbstractC6596d.m27934b(interfaceC3022e);
            return this;
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b mo22558d(InterfaceC2972b interfaceC2972b) {
            this.f18999f = (InterfaceC2972b) AbstractC6596d.m27934b(interfaceC2972b);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.a$c */
    private static final class c implements InterfaceC5016b {

        /* JADX INFO: renamed from: a */
        private final c f19000a;

        /* JADX INFO: renamed from: b */
        private InterfaceC6597e f19001b;

        /* JADX INFO: renamed from: c */
        private InterfaceC6597e f19002c;

        /* JADX INFO: renamed from: d */
        private InterfaceC6597e f19003d;

        /* JADX INFO: renamed from: e */
        private InterfaceC6597e f19004e;

        /* JADX INFO: renamed from: f */
        private InterfaceC6597e f19005f;

        /* JADX INFO: renamed from: g */
        private InterfaceC6597e f19006g;

        /* JADX INFO: renamed from: h */
        private InterfaceC6597e f19007h;

        /* JADX INFO: renamed from: i */
        private InterfaceC6597e f19008i;

        /* JADX INFO: renamed from: j */
        private InterfaceC6597e f19009j;

        /* JADX INFO: renamed from: k */
        private InterfaceC6597e f19010k;

        /* JADX INFO: renamed from: l */
        private InterfaceC6597e f19011l;

        /* JADX INFO: renamed from: m */
        private InterfaceC6597e f19012m;

        /* JADX INFO: renamed from: n */
        private InterfaceC6597e f19013n;

        /* JADX INFO: renamed from: o */
        private InterfaceC6597e f19014o;

        /* JADX INFO: renamed from: p */
        private InterfaceC6597e f19015p;

        /* JADX INFO: renamed from: q */
        private InterfaceC6597e f19016q;

        /* JADX INFO: renamed from: r */
        private InterfaceC6597e f19017r;

        /* JADX INFO: renamed from: s */
        private InterfaceC6597e f19018s;

        /* JADX INFO: renamed from: t */
        private InterfaceC6597e f19019t;

        /* JADX INFO: renamed from: u */
        private InterfaceC6597e f19020u;

        /* JADX INFO: renamed from: v */
        private InterfaceC6597e f19021v;

        /* JADX INFO: renamed from: w */
        private InterfaceC6597e f19022w;

        /* JADX INFO: renamed from: x */
        private InterfaceC6597e f19023x;

        /* JADX INFO: renamed from: y */
        private InterfaceC6597e f19024y;

        /* JADX INFO: renamed from: c */
        private void m22568c(Context context, InterfaceC1879i interfaceC1879i, InterfaceC1879i interfaceC1879i2, C1762g c1762g, InterfaceC3022e interfaceC3022e, InterfaceC2972b interfaceC2972b) {
            this.f19001b = C6595c.m27932a(c1762g);
            InterfaceC6594b interfaceC6594bM27932a = C6595c.m27932a(context);
            this.f19002c = interfaceC6594bM27932a;
            this.f19003d = C6593a.m27930a(C6760c.m29549a(interfaceC6594bM27932a));
            this.f19004e = C6593a.m27930a(C5020f.m22596a());
            this.f19005f = C6595c.m27932a(interfaceC3022e);
            this.f19006g = C6593a.m27930a(C5017c.m22588b(this.f19001b));
            InterfaceC6594b interfaceC6594bM27932a2 = C6595c.m27932a(interfaceC1879i2);
            this.f19007h = interfaceC6594bM27932a2;
            this.f19008i = C6593a.m27930a(C6763f.m29563a(this.f19006g, interfaceC6594bM27932a2));
            this.f19009j = C6595c.m27932a(interfaceC1879i);
            InterfaceC6597e interfaceC6597eM27930a = C6593a.m27930a(C5018d.m22590a(this.f19002c, this.f19007h));
            this.f19010k = interfaceC6597eM27930a;
            InterfaceC6597e interfaceC6597eM27930a2 = C6593a.m27930a(C6771n.m29602a(this.f19009j, this.f19004e, interfaceC6597eM27930a));
            this.f19011l = interfaceC6597eM27930a2;
            InterfaceC6597e interfaceC6597eM27930a3 = C6593a.m27930a(C6764g.m29566a(this.f19004e, this.f19005f, this.f19006g, this.f19008i, interfaceC6597eM27930a2));
            this.f19012m = interfaceC6597eM27930a3;
            this.f19013n = C6593a.m27930a(C6768k.m29585a(this.f19003d, interfaceC6597eM27930a3));
            InterfaceC6597e interfaceC6597eM27930a4 = C6593a.m27930a(C5021g.m22600a());
            this.f19014o = interfaceC6597eM27930a4;
            this.f19015p = C6593a.m27930a(C6361O.m27421a(this.f19004e, interfaceC6597eM27930a4));
            InterfaceC6594b interfaceC6594bM27932a3 = C6595c.m27932a(interfaceC2972b);
            this.f19016q = interfaceC6594bM27932a3;
            InterfaceC6597e interfaceC6597eM27930a5 = C6593a.m27930a(C6381i.m27496a(interfaceC6594bM27932a3));
            this.f19017r = interfaceC6597eM27930a5;
            this.f19018s = C6593a.m27930a(C6359M.m27416a(this.f19001b, this.f19005f, this.f19013n, interfaceC6597eM27930a5, this.f19009j));
            InterfaceC6597e interfaceC6597eM27930a6 = C6593a.m27930a(C6353G.m27389a(this.f19015p));
            this.f19019t = interfaceC6597eM27930a6;
            this.f19020u = C6593a.m27930a(C5019e.m22593a(this.f19002c, this.f19007h, interfaceC6597eM27930a6));
            InterfaceC6597e interfaceC6597eM27930a7 = C6593a.m27930a(C6348B.m27368a(this.f19002c, this.f19014o));
            this.f19021v = interfaceC6597eM27930a7;
            InterfaceC6597e interfaceC6597eM27930a8 = C6593a.m27930a(C6367V.m27461a(this.f19013n, this.f19015p, this.f19018s, this.f19004e, this.f19020u, interfaceC6597eM27930a7, this.f19009j));
            this.f19022w = interfaceC6597eM27930a8;
            InterfaceC6597e interfaceC6597eM27930a9 = C6593a.m27930a(C6364S.m27431a(interfaceC6597eM27930a8));
            this.f19023x = interfaceC6597eM27930a9;
            this.f19024y = C6593a.m27930a(C6391s.m27503a(this.f19001b, this.f19013n, this.f19009j, interfaceC6597eM27930a9));
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b
        /* JADX INFO: renamed from: a */
        public C6384l mo22569a() {
            return (C6384l) this.f19024y.get();
        }

        @Override // com.google.firebase.sessions.InterfaceC5016b
        /* JADX INFO: renamed from: b */
        public InterfaceC6365T mo22570b() {
            return (InterfaceC6365T) this.f19022w.get();
        }

        private c(Context context, InterfaceC1879i interfaceC1879i, InterfaceC1879i interfaceC1879i2, C1762g c1762g, InterfaceC3022e interfaceC3022e, InterfaceC2972b interfaceC2972b) {
            this.f19000a = this;
            m22568c(context, interfaceC1879i, interfaceC1879i2, c1762g, interfaceC3022e, interfaceC2972b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5016b.a m22554a() {
        return new b();
    }
}
