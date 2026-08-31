package p006A4;

import java.util.Map;
import p030D4.AbstractC0204h;
import p374v4.C7245j;

/* JADX INFO: renamed from: A4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0024i {

    /* JADX INFO: renamed from: a */
    private final C7245j f132a;

    /* JADX INFO: renamed from: b */
    private final C0023h f133b;

    public C0024i(C7245j c7245j, C0023h c0023h) {
        this.f132a = c7245j;
        this.f133b = c0023h;
    }

    /* JADX INFO: renamed from: a */
    public static C0024i m134a(C7245j c7245j) {
        return new C0024i(c7245j, C0023h.f119i);
    }

    /* JADX INFO: renamed from: b */
    public static C0024i m135b(C7245j c7245j, Map map) {
        return new C0024i(c7245j, C0023h.m116a(map));
    }

    /* JADX INFO: renamed from: c */
    public AbstractC0204h m136c() {
        return this.f133b.m118b();
    }

    /* JADX INFO: renamed from: d */
    public C0023h m137d() {
        return this.f133b;
    }

    /* JADX INFO: renamed from: e */
    public C7245j m138e() {
        return this.f132a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0024i.class != obj.getClass()) {
            return false;
        }
        C0024i c0024i = (C0024i) obj;
        return this.f132a.equals(c0024i.f132a) && this.f133b.equals(c0024i.f133b);
    }

    /* JADX INFO: renamed from: f */
    public boolean m139f() {
        return this.f133b.m129m();
    }

    /* JADX INFO: renamed from: g */
    public boolean m140g() {
        return this.f133b.m131o();
    }

    public int hashCode() {
        return (this.f132a.hashCode() * 31) + this.f133b.hashCode();
    }

    public String toString() {
        return this.f132a + ":" + this.f133b;
    }
}
