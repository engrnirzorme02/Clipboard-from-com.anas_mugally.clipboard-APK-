package p151T4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137R4.C1348P;
import p158U4.AbstractC1692p;
import p158U4.C1696t;
import p186Y4.AbstractC2034b;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: T4.M */
/* JADX INFO: loaded from: classes.dex */
class C1498M implements InterfaceC1561m {

    /* JADX INFO: renamed from: a */
    private final a f5099a = new a();

    /* JADX INFO: renamed from: T4.M$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private final HashMap f5100a = new HashMap();

        a() {
        }

        /* JADX INFO: renamed from: a */
        boolean m6284a(C1696t c1696t) {
            AbstractC2034b.m8460d(c1696t.m7063v() % 2 == 1, "Expected a collection path.", new Object[0]);
            String strM7060o = c1696t.m7060o();
            C1696t c1696t2 = (C1696t) c1696t.m7065x();
            HashSet hashSet = (HashSet) this.f5100a.get(strM7060o);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f5100a.put(strM7060o, hashSet);
            }
            return hashSet.add(c1696t2);
        }

        /* JADX INFO: renamed from: b */
        List m6285b(String str) {
            HashSet hashSet = (HashSet) this.f5100a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.EMPTY_LIST;
        }
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: a */
    public InterfaceC1561m.a mo6274a(C1348P c1348p) {
        return InterfaceC1561m.a.NONE;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: b */
    public void mo6275b(AbstractC7009c abstractC7009c) {
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: c */
    public String mo6276c() {
        return null;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: d */
    public List mo6277d(String str) {
        return this.f5099a.m6285b(str);
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: e */
    public void mo6278e(C1696t c1696t) {
        this.f5099a.m6284a(c1696t);
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: f */
    public List mo6279f(C1348P c1348p) {
        return null;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: g */
    public void mo6280g(String str, AbstractC1692p.a aVar) {
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: h */
    public AbstractC1692p.a mo6281h(C1348P c1348p) {
        return AbstractC1692p.a.f5610a;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: i */
    public AbstractC1692p.a mo6282i(String str) {
        return AbstractC1692p.a.f5610a;
    }

    @Override // p151T4.InterfaceC1561m
    /* JADX INFO: renamed from: j */
    public void mo6283j(C1348P c1348p) {
    }

    @Override // p151T4.InterfaceC1561m
    public void start() {
    }
}
