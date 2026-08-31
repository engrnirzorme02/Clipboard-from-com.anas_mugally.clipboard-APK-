package p151T4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p158U4.C1687k;
import p350s4.C7011e;

/* JADX INFO: renamed from: T4.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C1538e0 {

    /* JADX INFO: renamed from: a */
    private C7011e f5223a;

    /* JADX INFO: renamed from: b */
    private C7011e f5224b;

    public C1538e0() {
        List list = Collections.EMPTY_LIST;
        this.f5223a = new C7011e(list, C1537e.f5219c);
        this.f5224b = new C7011e(list, C1537e.f5220d);
    }

    /* JADX INFO: renamed from: e */
    private void m6400e(C1537e c1537e) {
        this.f5223a = this.f5223a.m30622k(c1537e);
        this.f5224b = this.f5224b.m30622k(c1537e);
    }

    /* JADX INFO: renamed from: a */
    public void m6401a(C1687k c1687k, int i7) {
        C1537e c1537e = new C1537e(c1687k, i7);
        this.f5223a = this.f5223a.m30620g(c1537e);
        this.f5224b = this.f5224b.m30620g(c1537e);
    }

    /* JADX INFO: renamed from: b */
    public void m6402b(C7011e c7011e, int i7) {
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            m6401a((C1687k) it.next(), i7);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m6403c(C1687k c1687k) {
        Iterator itM30621j = this.f5223a.m30621j(new C1537e(c1687k, 0));
        if (itM30621j.hasNext()) {
            return ((C1537e) itM30621j.next()).m6399d().equals(c1687k);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public C7011e m6404d(int i7) {
        Iterator itM30621j = this.f5224b.m30621j(new C1537e(C1687k.m7085h(), i7));
        C7011e c7011eM7086j = C1687k.m7086j();
        while (itM30621j.hasNext()) {
            C1537e c1537e = (C1537e) itM30621j.next();
            if (c1537e.m6398c() != i7) {
                break;
            }
            c7011eM7086j = c7011eM7086j.m30620g(c1537e.m6399d());
        }
        return c7011eM7086j;
    }

    /* JADX INFO: renamed from: f */
    public void m6405f(C1687k c1687k, int i7) {
        m6400e(new C1537e(c1687k, i7));
    }

    /* JADX INFO: renamed from: g */
    public void m6406g(C7011e c7011e, int i7) {
        Iterator it = c7011e.iterator();
        while (it.hasNext()) {
            m6405f((C1687k) it.next(), i7);
        }
    }

    /* JADX INFO: renamed from: h */
    public C7011e m6407h(int i7) {
        Iterator itM30621j = this.f5224b.m30621j(new C1537e(C1687k.m7085h(), i7));
        C7011e c7011eM7086j = C1687k.m7086j();
        while (itM30621j.hasNext()) {
            C1537e c1537e = (C1537e) itM30621j.next();
            if (c1537e.m6398c() != i7) {
                break;
            }
            c7011eM7086j = c7011eM7086j.m30620g(c1537e.m6399d());
            m6400e(c1537e);
        }
        return c7011eM7086j;
    }
}
