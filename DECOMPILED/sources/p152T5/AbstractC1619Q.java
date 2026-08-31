package p152T5;

import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1619Q extends AbstractC1618P {
    /* JADX INFO: renamed from: d */
    public static Set m6650d() {
        return C1607E.f5368a;
    }

    /* JADX INFO: renamed from: e */
    public static final Set m6651e(Set set) {
        AbstractC6118n.m27187e(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : AbstractC1618P.m6649c(set.iterator().next());
        }
        return m6650d();
    }

    /* JADX INFO: renamed from: f */
    public static Set m6652f(Object... elements) {
        AbstractC6118n.m27187e(elements, "elements");
        return AbstractC1635n.m6743n0(elements);
    }
}
