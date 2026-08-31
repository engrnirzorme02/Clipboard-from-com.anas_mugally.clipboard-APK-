package p165V4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p158U4.C1694r;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;

/* JADX INFO: renamed from: V4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1781g {

    /* JADX INFO: renamed from: a */
    private final int f5838a;

    /* JADX INFO: renamed from: b */
    private final C1774s f5839b;

    /* JADX INFO: renamed from: c */
    private final List f5840c;

    /* JADX INFO: renamed from: d */
    private final List f5841d;

    public C1781g(int i7, C1774s c1774s, List list, List list2) {
        AbstractC2034b.m8460d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f5838a = i7;
        this.f5839b = c1774s;
        this.f5840c = list;
        this.f5841d = list2;
    }

    /* JADX INFO: renamed from: a */
    public C1778d m7470a(C1694r c1694r, C1778d c1778d) {
        for (int i7 = 0; i7 < this.f5840c.size(); i7++) {
            AbstractC1780f abstractC1780f = (AbstractC1780f) this.f5840c.get(i7);
            if (abstractC1780f.m7462f().equals(c1694r.getKey())) {
                c1778d = abstractC1780f.mo7453a(c1694r, c1778d, this.f5839b);
            }
        }
        for (int i8 = 0; i8 < this.f5841d.size(); i8++) {
            AbstractC1780f abstractC1780f2 = (AbstractC1780f) this.f5841d.get(i8);
            if (abstractC1780f2.m7462f().equals(c1694r.getKey())) {
                c1778d = abstractC1780f2.mo7453a(c1694r, c1778d, this.f5839b);
            }
        }
        return c1778d;
    }

    /* JADX INFO: renamed from: b */
    public void m7471b(C1694r c1694r, C1782h c1782h) {
        int size = this.f5841d.size();
        List listM7481e = c1782h.m7481e();
        AbstractC2034b.m8460d(listM7481e.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(listM7481e.size()));
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1780f abstractC1780f = (AbstractC1780f) this.f5841d.get(i7);
            if (abstractC1780f.m7462f().equals(c1694r.getKey())) {
                abstractC1780f.mo7454b(c1694r, (C1783i) listM7481e.get(i7));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public List m7472c() {
        return this.f5840c;
    }

    /* JADX INFO: renamed from: d */
    public int m7473d() {
        return this.f5838a;
    }

    /* JADX INFO: renamed from: e */
    public Set m7474e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f5841d.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbstractC1780f) it.next()).m7462f());
        }
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1781g.class == obj.getClass()) {
            C1781g c1781g = (C1781g) obj;
            if (this.f5838a == c1781g.f5838a && this.f5839b.equals(c1781g.f5839b) && this.f5840c.equals(c1781g.f5840c) && this.f5841d.equals(c1781g.f5841d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public C1774s m7475f() {
        return this.f5839b;
    }

    /* JADX INFO: renamed from: g */
    public List m7476g() {
        return this.f5841d;
    }

    public int hashCode() {
        return (((((this.f5838a * 31) + this.f5839b.hashCode()) * 31) + this.f5840c.hashCode()) * 31) + this.f5841d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f5838a + ", localWriteTime=" + this.f5839b + ", baseMutations=" + this.f5840c + ", mutations=" + this.f5841d + ')';
    }
}
