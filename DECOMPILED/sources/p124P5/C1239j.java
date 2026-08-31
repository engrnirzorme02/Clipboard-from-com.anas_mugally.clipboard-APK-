package p124P5;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p063H5.AbstractC0523S;
import p063H5.EnumC0561p;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: P5.j */
/* JADX INFO: loaded from: classes.dex */
public class C1239j extends AbstractC1236g {

    /* JADX INFO: renamed from: m */
    private final AtomicInteger f4445m;

    /* JADX INFO: renamed from: n */
    protected AbstractC0523S.j f4446n;

    /* JADX INFO: renamed from: P5.j$a */
    static final class a extends AbstractC0523S.j {
        a() {
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return AbstractC0523S.f.m2202g();
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    /* JADX INFO: renamed from: P5.j$b */
    static class b extends AbstractC0523S.j {

        /* JADX INFO: renamed from: a */
        private final List f4447a;

        /* JADX INFO: renamed from: b */
        private final AtomicInteger f4448b;

        /* JADX INFO: renamed from: c */
        private final int f4449c;

        public b(List list, AtomicInteger atomicInteger) {
            AbstractC1209m.m5293e(!list.isEmpty(), "empty list");
            this.f4447a = list;
            this.f4448b = (AtomicInteger) AbstractC1209m.m5303o(atomicInteger, "index");
            Iterator it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((AbstractC0523S.j) it.next()).hashCode();
            }
            this.f4449c = iHashCode;
        }

        /* JADX INFO: renamed from: c */
        private int m5465c() {
            return (this.f4448b.getAndIncrement() & C3553a.e.API_PRIORITY_OTHER) % this.f4447a.size();
        }

        @Override // p063H5.AbstractC0523S.j
        /* JADX INFO: renamed from: a */
        public AbstractC0523S.f mo2179a(AbstractC0523S.g gVar) {
            return ((AbstractC0523S.j) this.f4447a.get(m5465c())).mo2179a(gVar);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f4449c == bVar.f4449c && this.f4448b == bVar.f4448b && this.f4447a.size() == bVar.f4447a.size() && new HashSet(this.f4447a).containsAll(bVar.f4447a);
        }

        public int hashCode() {
            return this.f4449c;
        }

        public String toString() {
            return AbstractC1203g.m5266a(b.class).m5277d("subchannelPickers", this.f4447a).toString();
        }
    }

    public C1239j(AbstractC0523S.e eVar) {
        super(eVar);
        this.f4445m = new AtomicInteger(new Random().nextInt());
        this.f4446n = new a();
    }

    /* JADX INFO: renamed from: x */
    private void m5463x(EnumC0561p enumC0561p, AbstractC0523S.j jVar) {
        if (enumC0561p == this.f4355k && jVar.equals(this.f4446n)) {
            return;
        }
        m5376p().mo2199f(enumC0561p, jVar);
        this.f4355k = enumC0561p;
        this.f4446n = jVar;
    }

    @Override // p124P5.AbstractC1236g
    /* JADX INFO: renamed from: v */
    protected void mo5382v() {
        List listM5378r = m5378r();
        if (!listM5378r.isEmpty()) {
            m5463x(EnumC0561p.READY, m5464w(listM5378r));
            return;
        }
        Iterator it = m5374n().iterator();
        while (it.hasNext()) {
            EnumC0561p enumC0561pM5391i = ((AbstractC1236g.c) it.next()).m5391i();
            EnumC0561p enumC0561p = EnumC0561p.CONNECTING;
            if (enumC0561pM5391i == enumC0561p || enumC0561pM5391i == EnumC0561p.IDLE) {
                m5463x(enumC0561p, new a());
                return;
            }
        }
        m5463x(EnumC0561p.TRANSIENT_FAILURE, m5464w(m5374n()));
    }

    /* JADX INFO: renamed from: w */
    protected AbstractC0523S.j m5464w(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC1236g.c) it.next()).m5390h());
        }
        return new b(arrayList, this.f4445m);
    }
}
