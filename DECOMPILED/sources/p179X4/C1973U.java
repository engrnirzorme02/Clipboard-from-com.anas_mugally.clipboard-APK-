package p179X4;

import androidx.appcompat.app.AbstractC2263x;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p158U4.C1682f;
import p351s5.C7022d;

/* JADX INFO: renamed from: X4.U */
/* JADX INFO: loaded from: classes.dex */
final class C1973U {

    /* JADX INFO: renamed from: b */
    private static final C1973U f6519b = new C1973U();

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArrayList f6520a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: X4.U$a */
    static abstract class a {
        a() {
        }

        /* JADX INFO: renamed from: d */
        static a m8243d(C1990m c1990m, boolean z7, int i7, int i8, int i9) {
            return new C1988k(c1990m, z7, i7, i8, i9);
        }

        /* JADX INFO: renamed from: e */
        static a m8244e(C1990m c1990m, C1975W.b bVar, C1993p c1993p) {
            C7022d c7022dM8354b = c1993p.m8354b();
            if (c7022dM8354b == null) {
                return null;
            }
            return m8243d(c1990m, bVar == C1975W.b.SUCCESS, c7022dM8354b.m30683c0(), c7022dM8354b.m30682a0().m30678a0().size(), c7022dM8354b.m30682a0().m30679c0());
        }

        /* JADX INFO: renamed from: a */
        abstract boolean mo8245a();

        /* JADX INFO: renamed from: b */
        abstract int mo8246b();

        /* JADX INFO: renamed from: c */
        abstract C1990m mo8247c();

        /* JADX INFO: renamed from: f */
        abstract int mo8248f();

        /* JADX INFO: renamed from: g */
        abstract int mo8249g();
    }

    /* JADX INFO: renamed from: X4.U$b */
    static abstract class b {
        b() {
        }

        /* JADX INFO: renamed from: b */
        static b m8250b(int i7, int i8, String str, String str2, a aVar) {
            return new C1989l(i7, i8, str, str2, aVar);
        }

        /* JADX INFO: renamed from: e */
        static b m8251e(int i7, C1993p c1993p, C1682f c1682f, C1990m c1990m, C1975W.b bVar) {
            return m8250b(i7, c1993p.m8353a(), c1682f.m7070k(), c1682f.m7069j(), a.m8244e(c1990m, bVar, c1993p));
        }

        /* JADX INFO: renamed from: a */
        abstract a mo8252a();

        /* JADX INFO: renamed from: c */
        abstract String mo8253c();

        /* JADX INFO: renamed from: d */
        abstract int mo8254d();

        /* JADX INFO: renamed from: f */
        abstract int mo8255f();

        /* JADX INFO: renamed from: g */
        abstract String mo8256g();
    }

    private C1973U() {
    }

    /* JADX INFO: renamed from: a */
    static C1973U m8241a() {
        return f6519b;
    }

    /* JADX INFO: renamed from: b */
    void m8242b(b bVar) {
        Iterator it = this.f6520a.iterator();
        while (it.hasNext()) {
            AbstractC2263x.m9328a(((AtomicReference) it.next()).get());
        }
    }
}
