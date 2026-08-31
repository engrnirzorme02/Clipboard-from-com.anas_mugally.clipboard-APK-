package p030D4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import p374v4.C7245j;
import p398y4.AbstractC7544e;
import p398y4.AbstractC7551l;

/* JADX INFO: renamed from: D4.d */
/* JADX INFO: loaded from: classes.dex */
public class C0200d {

    /* JADX INFO: renamed from: a */
    private final List f887a;

    /* JADX INFO: renamed from: b */
    private final List f888b;

    /* JADX INFO: renamed from: D4.d$a */
    class a extends C0199c.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ b f889a;

        a(b bVar) {
            this.f889a = bVar;
        }

        @Override // p030D4.C0199c.c
        /* JADX INFO: renamed from: b */
        public void mo1019b(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
            this.f889a.m1041q(c0198b);
            C0200d.m1025f(interfaceC0210n, this.f889a);
            this.f889a.m1036l();
        }
    }

    /* JADX INFO: renamed from: D4.d$b */
    static class b {

        /* JADX INFO: renamed from: d */
        private int f893d;

        /* JADX INFO: renamed from: h */
        private final d f897h;

        /* JADX INFO: renamed from: a */
        private StringBuilder f890a = null;

        /* JADX INFO: renamed from: b */
        private Stack f891b = new Stack();

        /* JADX INFO: renamed from: c */
        private int f892c = -1;

        /* JADX INFO: renamed from: e */
        private boolean f894e = true;

        /* JADX INFO: renamed from: f */
        private final List f895f = new ArrayList();

        /* JADX INFO: renamed from: g */
        private final List f896g = new ArrayList();

        public b(d dVar) {
            this.f897h = dVar;
        }

        /* JADX INFO: renamed from: g */
        private void m1034g(StringBuilder sb, C0198b c0198b) {
            sb.append(AbstractC7551l.m33237j(c0198b.m992d()));
        }

        /* JADX INFO: renamed from: k */
        private C7245j m1035k(int i7) {
            C0198b[] c0198bArr = new C0198b[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c0198bArr[i8] = (C0198b) this.f891b.get(i8);
            }
            return new C7245j(c0198bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public void m1036l() {
            this.f893d--;
            if (m1042h()) {
                this.f890a.append(")");
            }
            this.f894e = true;
        }

        /* JADX INFO: renamed from: m */
        private void m1037m() {
            AbstractC7551l.m33234g(m1042h(), "Can't end range without starting a range!");
            for (int i7 = 0; i7 < this.f893d; i7++) {
                this.f890a.append(")");
            }
            this.f890a.append(")");
            C7245j c7245jM1035k = m1035k(this.f892c);
            this.f896g.add(AbstractC7551l.m33236i(this.f890a.toString()));
            this.f895f.add(c7245jM1035k);
            this.f890a = null;
        }

        /* JADX INFO: renamed from: n */
        private void m1038n() {
            if (m1042h()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            this.f890a = sb;
            sb.append("(");
            Iterator it = m1035k(this.f893d).iterator();
            while (it.hasNext()) {
                m1034g(this.f890a, (C0198b) it.next());
                this.f890a.append(":(");
            }
            this.f894e = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: o */
        public void m1039o() {
            AbstractC7551l.m33234g(this.f893d == 0, "Can't finish hashing in the middle processing a child");
            if (m1042h()) {
                m1037m();
            }
            this.f896g.add("");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public void m1040p(AbstractC0207k abstractC0207k) {
            m1038n();
            this.f892c = this.f893d;
            this.f890a.append(abstractC0207k.mo982L(InterfaceC0210n.b.V2));
            this.f894e = true;
            if (this.f897h.mo1045a(this)) {
                m1037m();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public void m1041q(C0198b c0198b) {
            m1038n();
            if (this.f894e) {
                this.f890a.append(",");
            }
            m1034g(this.f890a, c0198b);
            this.f890a.append(":(");
            if (this.f893d == this.f891b.size()) {
                this.f891b.add(c0198b);
            } else {
                this.f891b.set(this.f893d, c0198b);
            }
            this.f893d++;
            this.f894e = false;
        }

        /* JADX INFO: renamed from: h */
        public boolean m1042h() {
            return this.f890a != null;
        }

        /* JADX INFO: renamed from: i */
        public int m1043i() {
            return this.f890a.length();
        }

        /* JADX INFO: renamed from: j */
        public C7245j m1044j() {
            return m1035k(this.f893d);
        }
    }

    /* JADX INFO: renamed from: D4.d$c */
    private static class c implements d {

        /* JADX INFO: renamed from: a */
        private final long f898a;

        public c(InterfaceC0210n interfaceC0210n) {
            this.f898a = Math.max(512L, (long) Math.sqrt(AbstractC7544e.m33208b(interfaceC0210n) * 100));
        }

        @Override // p030D4.C0200d.d
        /* JADX INFO: renamed from: a */
        public boolean mo1045a(b bVar) {
            if (bVar.m1043i() > this.f898a) {
                return bVar.m1044j().isEmpty() || !bVar.m1044j().m32003x().equals(C0198b.m991n());
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: D4.d$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo1045a(b bVar);
    }

    private C0200d(List list, List list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f887a = list;
        this.f888b = list2;
    }

    /* JADX INFO: renamed from: b */
    public static C0200d m1023b(InterfaceC0210n interfaceC0210n) {
        return m1024c(interfaceC0210n, new c(interfaceC0210n));
    }

    /* JADX INFO: renamed from: c */
    public static C0200d m1024c(InterfaceC0210n interfaceC0210n, d dVar) {
        if (interfaceC0210n.isEmpty()) {
            return new C0200d(Collections.EMPTY_LIST, Collections.singletonList(""));
        }
        b bVar = new b(dVar);
        m1025f(interfaceC0210n, bVar);
        bVar.m1039o();
        return new C0200d(bVar.f895f, bVar.f896g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static void m1025f(InterfaceC0210n interfaceC0210n, b bVar) {
        if (interfaceC0210n.mo1000H()) {
            bVar.m1040p((AbstractC0207k) interfaceC0210n);
            return;
        }
        if (interfaceC0210n.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        }
        if (interfaceC0210n instanceof C0199c) {
            ((C0199c) interfaceC0210n).m1010n(new a(bVar), true);
            return;
        }
        throw new IllegalStateException("Expected children node, but got: " + interfaceC0210n);
    }

    /* JADX INFO: renamed from: d */
    public List m1026d() {
        return Collections.unmodifiableList(this.f888b);
    }

    /* JADX INFO: renamed from: e */
    public List m1027e() {
        return Collections.unmodifiableList(this.f887a);
    }
}
