package p166V5;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: V5.f */
/* JADX INFO: loaded from: classes.dex */
final class C1797f implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C1797f f5858a = new C1797f();

    private C1797f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a7, Comparable b7) {
        AbstractC6118n.m27187e(a7, "a");
        AbstractC6118n.m27187e(b7, "b");
        return b7.compareTo(a7);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C1796e.f5857a;
    }
}
