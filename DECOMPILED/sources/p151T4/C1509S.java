package p151T4;

import java.util.HashMap;
import java.util.Map;
import p123P4.C1229i;
import p186Y4.AbstractC2034b;
import p186Y4.InterfaceC2052t;

/* JADX INFO: renamed from: T4.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1509S extends AbstractC1521Y {

    /* JADX INFO: renamed from: j */
    private InterfaceC1535d0 f5126j;

    /* JADX INFO: renamed from: k */
    private boolean f5127k;

    /* JADX INFO: renamed from: c */
    private final C1496L f5119c = new C1496L();

    /* JADX INFO: renamed from: d */
    private final Map f5120d = new HashMap();

    /* JADX INFO: renamed from: f */
    private final C1498M f5122f = new C1498M();

    /* JADX INFO: renamed from: g */
    private final C1513U f5123g = new C1513U(this);

    /* JADX INFO: renamed from: h */
    private final C1490I f5124h = new C1490I();

    /* JADX INFO: renamed from: i */
    private final C1511T f5125i = new C1511T();

    /* JADX INFO: renamed from: e */
    private final Map f5121e = new HashMap();

    private C1509S() {
    }

    /* JADX INFO: renamed from: n */
    public static C1509S m6302n() {
        C1509S c1509s = new C1509S();
        c1509s.m6304t(new C1494K(c1509s));
        return c1509s;
    }

    /* JADX INFO: renamed from: o */
    public static C1509S m6303o(C1486G.b bVar, C1570p c1570p) {
        C1509S c1509s = new C1509S();
        c1509s.m6304t(new C1502O(c1509s, bVar, c1570p));
        return c1509s;
    }

    /* JADX INFO: renamed from: t */
    private void m6304t(InterfaceC1535d0 interfaceC1535d0) {
        this.f5126j = interfaceC1535d0;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: a */
    InterfaceC1525a mo6305a() {
        return this.f5124h;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: b */
    InterfaceC1528b mo6306b(C1229i c1229i) {
        C1492J c1492j = (C1492J) this.f5121e.get(c1229i);
        if (c1492j != null) {
            return c1492j;
        }
        C1492J c1492j2 = new C1492J();
        this.f5121e.put(c1229i, c1492j2);
        return c1492j2;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: c */
    InterfaceC1543g mo6307c() {
        return this.f5119c;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: e */
    InterfaceC1515V mo6309e(C1229i c1229i, InterfaceC1561m interfaceC1561m) {
        C1504P c1504p = (C1504P) this.f5120d.get(c1229i);
        if (c1504p != null) {
            return c1504p;
        }
        C1504P c1504p2 = new C1504P(this, c1229i);
        this.f5120d.put(c1229i, c1504p2);
        return c1504p2;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: f */
    InterfaceC1517W mo6310f() {
        return new C1506Q();
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: g */
    public InterfaceC1535d0 mo6311g() {
        return this.f5126j;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: j */
    public boolean mo6314j() {
        return this.f5127k;
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: k */
    Object mo6315k(String str, InterfaceC2052t interfaceC2052t) {
        this.f5126j.mo6198i();
        try {
            return interfaceC2052t.get();
        } finally {
            this.f5126j.mo6195f();
        }
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: l */
    void mo6316l(String str, Runnable runnable) {
        this.f5126j.mo6198i();
        try {
            runnable.run();
        } finally {
            this.f5126j.mo6195f();
        }
    }

    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: m */
    public void mo6317m() {
        AbstractC2034b.m8460d(!this.f5127k, "MemoryPersistence double-started!", new Object[0]);
        this.f5127k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1498M mo6308d(C1229i c1229i) {
        return this.f5122f;
    }

    /* JADX INFO: renamed from: q */
    Iterable m6319q() {
        return this.f5120d.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C1511T mo6312h() {
        return this.f5125i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p151T4.AbstractC1521Y
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C1513U mo6313i() {
        return this.f5123g;
    }
}
