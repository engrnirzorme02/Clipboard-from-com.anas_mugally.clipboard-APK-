package p151T4;

import java.util.Comparator;
import p158U4.C1687k;

/* JADX INFO: renamed from: T4.e */
/* JADX INFO: loaded from: classes.dex */
class C1537e {

    /* JADX INFO: renamed from: c */
    static final Comparator f5219c = new Comparator() { // from class: T4.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1537e.m6397b((C1537e) obj, (C1537e) obj2);
        }
    };

    /* JADX INFO: renamed from: d */
    static final Comparator f5220d = new Comparator() { // from class: T4.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C1537e.m6396a((C1537e) obj, (C1537e) obj2);
        }
    };

    /* JADX INFO: renamed from: a */
    private final C1687k f5221a;

    /* JADX INFO: renamed from: b */
    private final int f5222b;

    public C1537e(C1687k c1687k, int i7) {
        this.f5221a = c1687k;
        this.f5222b = i7;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m6396a(C1537e c1537e, C1537e c1537e2) {
        int iCompare = Integer.compare(c1537e.f5222b, c1537e2.f5222b);
        return iCompare != 0 ? iCompare : c1537e.f5221a.compareTo(c1537e2.f5221a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m6397b(C1537e c1537e, C1537e c1537e2) {
        int iCompareTo = c1537e.f5221a.compareTo(c1537e2.f5221a);
        return iCompareTo != 0 ? iCompareTo : Integer.compare(c1537e.f5222b, c1537e2.f5222b);
    }

    /* JADX INFO: renamed from: c */
    int m6398c() {
        return this.f5222b;
    }

    /* JADX INFO: renamed from: d */
    C1687k m6399d() {
        return this.f5221a;
    }
}
