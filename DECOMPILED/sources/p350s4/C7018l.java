package p350s4;

import java.util.Comparator;

/* JADX INFO: renamed from: s4.l */
/* JADX INFO: loaded from: classes.dex */
public class C7018l implements Comparator {

    /* JADX INFO: renamed from: a */
    private static C7018l f28049a = new C7018l();

    private C7018l() {
    }

    /* JADX INFO: renamed from: b */
    public static C7018l m30656b(Class cls) {
        return f28049a;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
