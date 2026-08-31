package p166V5;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: V5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1793b {
    /* JADX INFO: renamed from: a */
    public static int m7503a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX INFO: renamed from: b */
    public static int m7504b(Object obj, Object obj2, InterfaceC5367l... selectors) {
        AbstractC6118n.m27187e(selectors, "selectors");
        if (selectors.length > 0) {
            return m7505c(obj, obj2, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: c */
    private static final int m7505c(Object obj, Object obj2, InterfaceC5367l[] interfaceC5367lArr) {
        for (InterfaceC5367l interfaceC5367l : interfaceC5367lArr) {
            int iM7503a = m7503a((Comparable) interfaceC5367l.invoke(obj), (Comparable) interfaceC5367l.invoke(obj2));
            if (iM7503a != 0) {
                return iM7503a;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static Comparator m7506d() {
        C1796e c1796e = C1796e.f5857a;
        AbstractC6118n.m27185c(c1796e, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c1796e;
    }
}
