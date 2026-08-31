package p063H5;

import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: H5.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0563q {

    /* JADX INFO: renamed from: a */
    private final EnumC0561p f2180a;

    /* JADX INFO: renamed from: b */
    private final C0554l0 f2181b;

    private C0563q(EnumC0561p enumC0561p, C0554l0 c0554l0) {
        this.f2180a = (EnumC0561p) AbstractC1209m.m5303o(enumC0561p, "state is null");
        this.f2181b = (C0554l0) AbstractC1209m.m5303o(c0554l0, "status is null");
    }

    /* JADX INFO: renamed from: a */
    public static C0563q m2495a(EnumC0561p enumC0561p) {
        AbstractC1209m.m5293e(enumC0561p != EnumC0561p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new C0563q(enumC0561p, C0554l0.f2098e);
    }

    /* JADX INFO: renamed from: b */
    public static C0563q m2496b(C0554l0 c0554l0) {
        AbstractC1209m.m5293e(!c0554l0.m2460o(), "The error status must not be OK");
        return new C0563q(EnumC0561p.TRANSIENT_FAILURE, c0554l0);
    }

    /* JADX INFO: renamed from: c */
    public EnumC0561p m2497c() {
        return this.f2180a;
    }

    /* JADX INFO: renamed from: d */
    public C0554l0 m2498d() {
        return this.f2181b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0563q)) {
            return false;
        }
        C0563q c0563q = (C0563q) obj;
        return this.f2180a.equals(c0563q.f2180a) && this.f2181b.equals(c0563q.f2181b);
    }

    public int hashCode() {
        return this.f2180a.hashCode() ^ this.f2181b.hashCode();
    }

    public String toString() {
        if (this.f2181b.m2460o()) {
            return this.f2180a.toString();
        }
        return this.f2180a + "(" + this.f2181b + ")";
    }
}
