package p166V5;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: V5.e */
/* JADX INFO: loaded from: classes.dex */
final class C1796e implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C1796e f5857a = new C1796e();

    private C1796e() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a7, Comparable b7) {
        AbstractC6118n.m27187e(a7, "a");
        AbstractC6118n.m27187e(b7, "b");
        return a7.compareTo(b7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C1797f.f5858a;
    }
}
