package p152T5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p166V5.AbstractC1792a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1640s extends AbstractC1639r {
    /* JADX INFO: renamed from: g */
    public static final Collection m6762g(Object[] objArr) {
        AbstractC6118n.m27187e(objArr, "<this>");
        return new C1629h(objArr, false);
    }

    /* JADX INFO: renamed from: h */
    public static final int m6763h(List list, Comparable comparable, int i7, int i8) {
        AbstractC6118n.m27187e(list, "<this>");
        m6771p(list.size(), i7, i8);
        int i9 = i8 - 1;
        while (i7 <= i9) {
            int i10 = (i7 + i9) >>> 1;
            int iA = AbstractC1792a.m7503a((Comparable) list.get(i10), comparable);
            if (iA < 0) {
                i7 = i10 + 1;
            } else {
                if (iA <= 0) {
                    return i10;
                }
                i9 = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ int m6764i(List list, Comparable comparable, int i7, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i7 = 0;
        }
        if ((i9 & 4) != 0) {
            i8 = list.size();
        }
        return m6763h(list, comparable, i7, i8);
    }

    /* JADX INFO: renamed from: j */
    public static List m6765j() {
        return C1605C.f5366a;
    }

    /* JADX INFO: renamed from: k */
    public static int m6766k(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: l */
    public static List m6767l(Object... elements) {
        AbstractC6118n.m27187e(elements, "elements");
        return elements.length > 0 ? AbstractC1634m.m6690c(elements) : m6765j();
    }

    /* JADX INFO: renamed from: m */
    public static List m6768m(Object... elements) {
        AbstractC6118n.m27187e(elements, "elements");
        return AbstractC1635n.m6745r(elements);
    }

    /* JADX INFO: renamed from: n */
    public static List m6769n(Object... elements) {
        AbstractC6118n.m27187e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1629h(elements, true));
    }

    /* JADX INFO: renamed from: o */
    public static final List m6770o(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : AbstractC1639r.m6759d(list.get(0));
        }
        return m6765j();
    }

    /* JADX INFO: renamed from: p */
    private static final void m6771p(int i7, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException("fromIndex (" + i8 + ") is greater than toIndex (" + i9 + ").");
        }
        if (i8 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i8 + ") is less than zero.");
        }
        if (i9 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i7 + ").");
    }

    /* JADX INFO: renamed from: q */
    public static void m6772q() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* JADX INFO: renamed from: r */
    public static void m6773r() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
