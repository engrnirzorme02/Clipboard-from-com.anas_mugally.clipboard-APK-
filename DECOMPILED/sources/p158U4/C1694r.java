package p158U4;

import p351s5.C7039u;

/* JADX INFO: renamed from: U4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1694r implements InterfaceC1684h {

    /* JADX INFO: renamed from: b */
    private final C1687k f5618b;

    /* JADX INFO: renamed from: c */
    private b f5619c;

    /* JADX INFO: renamed from: d */
    private C1698v f5620d;

    /* JADX INFO: renamed from: e */
    private C1698v f5621e;

    /* JADX INFO: renamed from: f */
    private C1695s f5622f;

    /* JADX INFO: renamed from: g */
    private a f5623g;

    /* JADX INFO: renamed from: U4.r$a */
    private enum a {
        HAS_LOCAL_MUTATIONS,
        HAS_COMMITTED_MUTATIONS,
        SYNCED
    }

    /* JADX INFO: renamed from: U4.r$b */
    private enum b {
        INVALID,
        FOUND_DOCUMENT,
        NO_DOCUMENT,
        UNKNOWN_DOCUMENT
    }

    private C1694r(C1687k c1687k) {
        this.f5618b = c1687k;
        this.f5621e = C1698v.f5636b;
    }

    /* JADX INFO: renamed from: p */
    public static C1694r m7123p(C1687k c1687k, C1698v c1698v, C1695s c1695s) {
        return new C1694r(c1687k).m7127l(c1698v, c1695s);
    }

    /* JADX INFO: renamed from: q */
    public static C1694r m7124q(C1687k c1687k) {
        b bVar = b.INVALID;
        C1698v c1698v = C1698v.f5636b;
        return new C1694r(c1687k, bVar, c1698v, c1698v, new C1695s(), a.SYNCED);
    }

    /* JADX INFO: renamed from: r */
    public static C1694r m7125r(C1687k c1687k, C1698v c1698v) {
        return new C1694r(c1687k).m7128m(c1698v);
    }

    /* JADX INFO: renamed from: s */
    public static C1694r m7126s(C1687k c1687k, C1698v c1698v) {
        return new C1694r(c1687k).m7129n(c1698v);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: a */
    public C1694r mo7072a() {
        return new C1694r(this.f5618b, this.f5619c, this.f5620d, this.f5621e, this.f5622f.clone(), this.f5623g);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: b */
    public boolean mo7073b() {
        return this.f5619c.equals(b.FOUND_DOCUMENT);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: c */
    public boolean mo7074c() {
        return this.f5623g.equals(a.HAS_COMMITTED_MUTATIONS);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: d */
    public boolean mo7075d() {
        return this.f5623g.equals(a.HAS_LOCAL_MUTATIONS);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: e */
    public boolean mo7076e() {
        return mo7075d() || mo7074c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1694r.class != obj.getClass()) {
            return false;
        }
        C1694r c1694r = (C1694r) obj;
        if (this.f5618b.equals(c1694r.f5618b) && this.f5620d.equals(c1694r.f5620d) && this.f5619c.equals(c1694r.f5619c) && this.f5623g.equals(c1694r.f5623g)) {
            return this.f5622f.equals(c1694r.f5622f);
        }
        return false;
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: f */
    public C1698v mo7077f() {
        return this.f5621e;
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: g */
    public C7039u mo7078g(C1693q c1693q) {
        return getData().m7143g(c1693q);
    }

    @Override // p158U4.InterfaceC1684h
    public C1695s getData() {
        return this.f5622f;
    }

    @Override // p158U4.InterfaceC1684h
    public C1687k getKey() {
        return this.f5618b;
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: h */
    public boolean mo7079h() {
        return this.f5619c.equals(b.NO_DOCUMENT);
    }

    public int hashCode() {
        return this.f5618b.hashCode();
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: i */
    public boolean mo7080i() {
        return this.f5619c.equals(b.UNKNOWN_DOCUMENT);
    }

    @Override // p158U4.InterfaceC1684h
    /* JADX INFO: renamed from: j */
    public C1698v mo7081j() {
        return this.f5620d;
    }

    /* JADX INFO: renamed from: l */
    public C1694r m7127l(C1698v c1698v, C1695s c1695s) {
        this.f5620d = c1698v;
        this.f5619c = b.FOUND_DOCUMENT;
        this.f5622f = c1695s;
        this.f5623g = a.SYNCED;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C1694r m7128m(C1698v c1698v) {
        this.f5620d = c1698v;
        this.f5619c = b.NO_DOCUMENT;
        this.f5622f = new C1695s();
        this.f5623g = a.SYNCED;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C1694r m7129n(C1698v c1698v) {
        this.f5620d = c1698v;
        this.f5619c = b.UNKNOWN_DOCUMENT;
        this.f5622f = new C1695s();
        this.f5623g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public boolean m7130o() {
        return !this.f5619c.equals(b.INVALID);
    }

    /* JADX INFO: renamed from: t */
    public C1694r m7131t() {
        this.f5623g = a.HAS_COMMITTED_MUTATIONS;
        return this;
    }

    public String toString() {
        return "Document{key=" + this.f5618b + ", version=" + this.f5620d + ", readTime=" + this.f5621e + ", type=" + this.f5619c + ", documentState=" + this.f5623g + ", value=" + this.f5622f + '}';
    }

    /* JADX INFO: renamed from: u */
    public C1694r m7132u() {
        this.f5623g = a.HAS_LOCAL_MUTATIONS;
        this.f5620d = C1698v.f5636b;
        return this;
    }

    /* JADX INFO: renamed from: v */
    public C1694r m7133v(C1698v c1698v) {
        this.f5621e = c1698v;
        return this;
    }

    private C1694r(C1687k c1687k, b bVar, C1698v c1698v, C1698v c1698v2, C1695s c1695s, a aVar) {
        this.f5618b = c1687k;
        this.f5620d = c1698v;
        this.f5621e = c1698v2;
        this.f5619c = bVar;
        this.f5623g = aVar;
        this.f5622f = c1695s;
    }
}
