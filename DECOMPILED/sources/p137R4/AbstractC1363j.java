package p137R4;

import android.content.Context;
import com.google.firebase.firestore.C4929o;
import p123P4.AbstractC1221a;
import p123P4.C1229i;
import p151T4.AbstractC1521Y;
import p151T4.C1472A;
import p151T4.C1558l;
import p151T4.InterfaceC1602z1;
import p179X4.C1962I;
import p179X4.C1964K;
import p179X4.C1968O;
import p179X4.C1992o;
import p179X4.InterfaceC1958E;
import p179X4.InterfaceC1991n;
import p186Y4.AbstractC2034b;
import p186Y4.C2037e;

/* JADX INFO: renamed from: R4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1363j {

    /* JADX INFO: renamed from: a */
    protected final C4929o f4777a;

    /* JADX INFO: renamed from: b */
    private C1962I f4778b = new C1962I();

    /* JADX INFO: renamed from: c */
    private AbstractC1521Y f4779c;

    /* JADX INFO: renamed from: d */
    private C1472A f4780d;

    /* JADX INFO: renamed from: e */
    private C1347O f4781e;

    /* JADX INFO: renamed from: f */
    private C1968O f4782f;

    /* JADX INFO: renamed from: g */
    private C1368o f4783g;

    /* JADX INFO: renamed from: h */
    private C1558l f4784h;

    /* JADX INFO: renamed from: i */
    private InterfaceC1602z1 f4785i;

    /* JADX INFO: renamed from: R4.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Context f4786a;

        /* JADX INFO: renamed from: b */
        public final C2037e f4787b;

        /* JADX INFO: renamed from: c */
        public final C1365l f4788c;

        /* JADX INFO: renamed from: d */
        public final C1229i f4789d;

        /* JADX INFO: renamed from: e */
        public final int f4790e;

        /* JADX INFO: renamed from: f */
        public final AbstractC1221a f4791f;

        /* JADX INFO: renamed from: g */
        public final AbstractC1221a f4792g;

        /* JADX INFO: renamed from: h */
        public final InterfaceC1958E f4793h;

        public a(Context context, C2037e c2037e, C1365l c1365l, C1229i c1229i, int i7, AbstractC1221a abstractC1221a, AbstractC1221a abstractC1221a2, InterfaceC1958E interfaceC1958E) {
            this.f4786a = context;
            this.f4787b = c2037e;
            this.f4788c = c1365l;
            this.f4789d = c1229i;
            this.f4790e = i7;
            this.f4791f = abstractC1221a;
            this.f4792g = abstractC1221a2;
            this.f4793h = interfaceC1958E;
        }
    }

    public AbstractC1363j(C4929o c4929o) {
        this.f4777a = c4929o;
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC1363j m5878h(C4929o c4929o) {
        return c4929o.m22179d() ? new C1346N(c4929o) : new C1339G(c4929o);
    }

    /* JADX INFO: renamed from: a */
    protected abstract C1368o mo5724a(a aVar);

    /* JADX INFO: renamed from: b */
    protected abstract InterfaceC1602z1 mo5725b(a aVar);

    /* JADX INFO: renamed from: c */
    protected abstract C1558l mo5726c(a aVar);

    /* JADX INFO: renamed from: d */
    protected abstract C1472A mo5727d(a aVar);

    /* JADX INFO: renamed from: e */
    protected abstract AbstractC1521Y mo5728e(a aVar);

    /* JADX INFO: renamed from: f */
    protected abstract C1968O mo5729f(a aVar);

    /* JADX INFO: renamed from: g */
    protected abstract C1347O mo5730g(a aVar);

    /* JADX INFO: renamed from: i */
    protected InterfaceC1991n m5879i() {
        return this.f4778b.m8117f();
    }

    /* JADX INFO: renamed from: j */
    public C1992o m5880j() {
        return this.f4778b.m8118g();
    }

    /* JADX INFO: renamed from: k */
    public C1368o m5881k() {
        return (C1368o) AbstractC2034b.m8461e(this.f4783g, "eventManager not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC1602z1 m5882l() {
        return this.f4785i;
    }

    /* JADX INFO: renamed from: m */
    public C1558l m5883m() {
        return this.f4784h;
    }

    /* JADX INFO: renamed from: n */
    public C1472A m5884n() {
        return (C1472A) AbstractC2034b.m8461e(this.f4780d, "localStore not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC1521Y m5885o() {
        return (AbstractC1521Y) AbstractC2034b.m8461e(this.f4779c, "persistence not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: p */
    public C1964K m5886p() {
        return this.f4778b.m8121j();
    }

    /* JADX INFO: renamed from: q */
    public C1968O m5887q() {
        return (C1968O) AbstractC2034b.m8461e(this.f4782f, "remoteStore not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: r */
    public C1347O m5888r() {
        return (C1347O) AbstractC2034b.m8461e(this.f4781e, "syncEngine not initialized yet", new Object[0]);
    }

    /* JADX INFO: renamed from: s */
    public void m5889s(a aVar) {
        this.f4778b.m8122k(aVar);
        AbstractC1521Y abstractC1521YMo5728e = mo5728e(aVar);
        this.f4779c = abstractC1521YMo5728e;
        abstractC1521YMo5728e.mo6317m();
        this.f4780d = mo5727d(aVar);
        this.f4782f = mo5729f(aVar);
        this.f4781e = mo5730g(aVar);
        this.f4783g = mo5724a(aVar);
        this.f4780d.m6153G();
        this.f4782f.m8210J();
        this.f4785i = mo5725b(aVar);
        this.f4784h = mo5726c(aVar);
    }
}
