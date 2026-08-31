package p030D4;

import p374v4.C7245j;

/* JADX INFO: renamed from: D4.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0212p extends AbstractC0204h {

    /* JADX INFO: renamed from: a */
    private final C7245j f924a;

    public C0212p(C7245j c7245j) {
        if (c7245j.size() == 1 && c7245j.m32004z().m996q()) {
            throw new IllegalArgumentException("Can't create PathIndex with '.priority' as key. Please use PriorityIndex instead!");
        }
        this.f924a = c7245j;
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: c */
    public String mo1054c() {
        return this.f924a.m31997D();
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: e */
    public boolean mo1056e(InterfaceC0210n interfaceC0210n) {
        return !interfaceC0210n.mo1013r(this.f924a).isEmpty();
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0212p.class == obj.getClass() && this.f924a.equals(((C0212p) obj).f924a);
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: f */
    public C0209m mo1057f(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
        return new C0209m(c0198b, C0203g.m1050w().mo1015u(this.f924a, interfaceC0210n));
    }

    @Override // p030D4.AbstractC0204h
    /* JADX INFO: renamed from: g */
    public C0209m mo1058g() {
        return new C0209m(C0198b.m989k(), C0203g.m1050w().mo1015u(this.f924a, InterfaceC0210n.f920g));
    }

    public int hashCode() {
        return this.f924a.hashCode();
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compare(C0209m c0209m, C0209m c0209m2) {
        int iCompareTo = c0209m.m1083d().mo1013r(this.f924a).compareTo(c0209m2.m1083d().mo1013r(this.f924a));
        return iCompareTo == 0 ? c0209m.m1082c().compareTo(c0209m2.m1082c()) : iCompareTo;
    }
}
