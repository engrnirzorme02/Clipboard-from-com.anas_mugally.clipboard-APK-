package p137R4;

import com.google.firebase.firestore.C4929o;
import p063H5.C0554l0;
import p151T4.AbstractC1521Y;
import p151T4.C1472A;
import p151T4.C1486G;
import p151T4.C1509S;
import p151T4.C1526a0;
import p151T4.C1558l;
import p151T4.C1570p;
import p151T4.InterfaceC1602z1;
import p165V4.C1782h;
import p179X4.C1963J;
import p179X4.C1968O;
import p350s4.C7011e;

/* JADX INFO: renamed from: R4.G */
/* JADX INFO: loaded from: classes.dex */
public class C1339G extends AbstractC1363j {

    /* JADX INFO: renamed from: R4.G$b */
    private class b implements C1968O.c {
        private b() {
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: a */
        public void mo5731a(EnumC1341I enumC1341I) {
            C1339G.this.m5888r().mo5731a(enumC1341I);
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: b */
        public C7011e mo5732b(int i7) {
            return C1339G.this.m5888r().mo5732b(i7);
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: c */
        public void mo5733c(int i7, C0554l0 c0554l0) {
            C1339G.this.m5888r().mo5733c(i7, c0554l0);
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: d */
        public void mo5734d(int i7, C0554l0 c0554l0) {
            C1339G.this.m5888r().mo5734d(i7, c0554l0);
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: e */
        public void mo5735e(C1963J c1963j) {
            C1339G.this.m5888r().mo5735e(c1963j);
        }

        @Override // p179X4.C1968O.c
        /* JADX INFO: renamed from: f */
        public void mo5736f(C1782h c1782h) {
            C1339G.this.m5888r().mo5736f(c1782h);
        }
    }

    public C1339G(C4929o c4929o) {
        super(c4929o);
    }

    /* JADX INFO: renamed from: t */
    private boolean m5723t(C4929o c4929o) {
        c4929o.m22176a();
        return false;
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: a */
    protected C1368o mo5724a(AbstractC1363j.a aVar) {
        return new C1368o(m5888r());
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: b */
    protected InterfaceC1602z1 mo5725b(AbstractC1363j.a aVar) {
        return null;
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: c */
    protected C1558l mo5726c(AbstractC1363j.a aVar) {
        return null;
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: d */
    protected C1472A mo5727d(AbstractC1363j.a aVar) {
        return new C1472A(m5885o(), new C1526a0(), aVar.f4789d);
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: e */
    protected AbstractC1521Y mo5728e(AbstractC1363j.a aVar) {
        if (!m5723t(this.f4777a)) {
            return C1509S.m6302n();
        }
        return C1509S.m6303o(C1486G.b.m6233a(this.f4777a.m22177b()), new C1570p(m5886p()));
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: f */
    protected C1968O mo5729f(AbstractC1363j.a aVar) {
        return new C1968O(aVar.f4788c.m5900a(), new b(), m5884n(), m5880j(), aVar.f4787b, m5879i());
    }

    @Override // p137R4.AbstractC1363j
    /* JADX INFO: renamed from: g */
    protected C1347O mo5730g(AbstractC1363j.a aVar) {
        return new C1347O(m5884n(), m5887q(), aVar.f4789d, aVar.f4790e);
    }
}
