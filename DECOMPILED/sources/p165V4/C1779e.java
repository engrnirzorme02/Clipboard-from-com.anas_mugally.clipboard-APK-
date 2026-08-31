package p165V4;

import p158U4.C1693q;

/* JADX INFO: renamed from: V4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1779e {

    /* JADX INFO: renamed from: a */
    private final C1693q f5833a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1790p f5834b;

    public C1779e(C1693q c1693q, InterfaceC1790p interfaceC1790p) {
        this.f5833a = c1693q;
        this.f5834b = interfaceC1790p;
    }

    /* JADX INFO: renamed from: a */
    public C1693q m7458a() {
        return this.f5833a;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC1790p m7459b() {
        return this.f5834b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1779e.class != obj.getClass()) {
            return false;
        }
        C1779e c1779e = (C1779e) obj;
        if (this.f5833a.equals(c1779e.f5833a)) {
            return this.f5834b.equals(c1779e.f5834b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f5833a.hashCode() * 31) + this.f5834b.hashCode();
    }
}
