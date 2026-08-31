package p152T5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1645x extends AbstractC1644w {
    /* JADX INFO: renamed from: A */
    public static Object m6777A(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC1640s.m6766k(list));
    }

    /* JADX INFO: renamed from: B */
    public static boolean m6778B(Iterable iterable, InterfaceC5367l predicate) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(predicate, "predicate");
        return m6781x(iterable, predicate, false);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m6779v(Collection collection, Iterable elements) {
        AbstractC6118n.m27187e(collection, "<this>");
        AbstractC6118n.m27187e(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m6780w(Collection collection, Object[] elements) {
        AbstractC6118n.m27187e(collection, "<this>");
        AbstractC6118n.m27187e(elements, "elements");
        return collection.addAll(AbstractC1634m.m6690c(elements));
    }

    /* JADX INFO: renamed from: x */
    private static final boolean m6781x(Iterable iterable, InterfaceC5367l interfaceC5367l, boolean z7) {
        Iterator it = iterable.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC5367l.invoke(it.next())).booleanValue() == z7) {
                it.remove();
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m6782y(List list, InterfaceC5367l interfaceC5367l, boolean z7) {
        int i7;
        if (!(list instanceof RandomAccess)) {
            AbstractC6118n.m27185c(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m6781x(AbstractC6104G.m27158a(list), interfaceC5367l, z7);
        }
        int iM6766k = AbstractC1640s.m6766k(list);
        if (iM6766k >= 0) {
            int i8 = 0;
            i7 = 0;
            while (true) {
                Object obj = list.get(i8);
                if (((Boolean) interfaceC5367l.invoke(obj)).booleanValue() != z7) {
                    if (i7 != i8) {
                        list.set(i7, obj);
                    }
                    i7++;
                }
                if (i8 == iM6766k) {
                    break;
                }
                i8++;
            }
        } else {
            i7 = 0;
        }
        if (i7 >= list.size()) {
            return false;
        }
        int iM6766k2 = AbstractC1640s.m6766k(list);
        if (i7 > iM6766k2) {
            return true;
        }
        while (true) {
            list.remove(iM6766k2);
            if (iM6766k2 == i7) {
                return true;
            }
            iM6766k2--;
        }
    }

    /* JADX INFO: renamed from: z */
    public static boolean m6783z(List list, InterfaceC5367l predicate) {
        AbstractC6118n.m27187e(list, "<this>");
        AbstractC6118n.m27187e(predicate, "predicate");
        return m6782y(list, predicate, true);
    }
}
