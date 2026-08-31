package p152T5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1440r;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;
import p294l6.InterfaceC6304e;
import p302m6.AbstractC6406h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1603A extends AbstractC1647z {

    /* JADX INFO: renamed from: T5.A$a */
    public static final class a implements InterfaceC6304e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Iterable f5364a;

        public a(Iterable iterable) {
            this.f5364a = iterable;
        }

        @Override // p294l6.InterfaceC6304e
        public Iterator iterator() {
            return this.f5364a.iterator();
        }
    }

    /* JADX INFO: renamed from: C */
    public static InterfaceC6304e m6563C(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m6564D(Iterable iterable, Object obj) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m6574N(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: E */
    public static List m6565E(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return m6593g0(m6597k0(iterable));
    }

    /* JADX INFO: renamed from: F */
    public static List m6566F(List list, int i7) {
        AbstractC6118n.m27187e(list, "<this>");
        if (i7 >= 0) {
            return m6589c0(list, AbstractC5905g.m26654b(list.size() - i7, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
    }

    /* JADX INFO: renamed from: G */
    public static List m6567G(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return (List) m6568H(iterable, new ArrayList());
    }

    /* JADX INFO: renamed from: H */
    public static final Collection m6568H(Iterable iterable, Collection destination) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    /* JADX INFO: renamed from: I */
    public static final Object m6569I(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (iterable instanceof List) {
            return m6570J((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: J */
    public static Object m6570J(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: K */
    public static Object m6571K(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static Object m6572L(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: M */
    public static Object m6573M(List list, int i7) {
        AbstractC6118n.m27187e(list, "<this>");
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    /* JADX INFO: renamed from: N */
    public static final int m6574N(Iterable iterable, Object obj) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i7 = 0;
        for (Object obj2 : iterable) {
            if (i7 < 0) {
                AbstractC1640s.m6773r();
            }
            if (AbstractC6118n.m27183a(obj, obj2)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: O */
    public static final Appendable m6575O(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) throws IOException {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(buffer, "buffer");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        buffer.append(prefix);
        int i8 = 0;
        for (Object obj : iterable) {
            i8++;
            if (i8 > 1) {
                buffer.append(separator);
            }
            if (i7 >= 0 && i8 > i7) {
                break;
            }
            AbstractC6406h.m27531a(buffer, obj, interfaceC5367l);
        }
        if (i7 >= 0 && i8 > i7) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* JADX INFO: renamed from: Q */
    public static final String m6577Q(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i7, CharSequence truncated, InterfaceC5367l interfaceC5367l) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(separator, "separator");
        AbstractC6118n.m27187e(prefix, "prefix");
        AbstractC6118n.m27187e(postfix, "postfix");
        AbstractC6118n.m27187e(truncated, "truncated");
        return ((StringBuilder) m6575O(iterable, new StringBuilder(), separator, prefix, postfix, i7, truncated, interfaceC5367l)).toString();
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ String m6578R(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i7, CharSequence charSequence4, InterfaceC5367l interfaceC5367l, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i8 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i8 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i8 & 8) != 0) {
            i7 = -1;
        }
        if ((i8 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i8 & 32) != 0) {
            interfaceC5367l = null;
        }
        CharSequence charSequence5 = charSequence4;
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m6577Q(iterable, charSequence, charSequence2, charSequence3, i7, charSequence5, interfaceC5367l2);
    }

    /* JADX INFO: renamed from: S */
    public static Object m6579S(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1640s.m6766k(list));
    }

    /* JADX INFO: renamed from: T */
    public static Object m6580T(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: U */
    public static Comparable m6581U(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: V */
    public static List m6582V(Collection collection, Iterable elements) {
        AbstractC6118n.m27187e(collection, "<this>");
        AbstractC6118n.m27187e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC1645x.m6779v(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: W */
    public static List m6583W(Collection collection, Object obj) {
        AbstractC6118n.m27187e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public static Object m6584X(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (iterable instanceof List) {
            return m6585Y((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: Y */
    public static final Object m6585Y(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: Z */
    public static Object m6586Z(List list) {
        AbstractC6118n.m27187e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static List m6587a0(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM6595i0 = m6595i0(iterable);
            AbstractC1644w.m6775t(listM6595i0);
            return listM6595i0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m6593g0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC1634m.m6702o((Comparable[]) array);
        return AbstractC1634m.m6690c(array);
    }

    /* JADX INFO: renamed from: b0 */
    public static List m6588b0(Iterable iterable, Comparator comparator) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listM6595i0 = m6595i0(iterable);
            AbstractC1644w.m6776u(listM6595i0, comparator);
            return listM6595i0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m6593g0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC1634m.m6703p(array, comparator);
        return AbstractC1634m.m6690c(array);
    }

    /* JADX INFO: renamed from: c0 */
    public static List m6589c0(Iterable iterable, int i7) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i7 + " is less than zero.").toString());
        }
        if (i7 == 0) {
            return AbstractC1640s.m6765j();
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return m6593g0(iterable);
            }
            if (i7 == 1) {
                return AbstractC1639r.m6759d(m6569I(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i8++;
            if (i8 == i7) {
                break;
            }
        }
        return AbstractC1640s.m6770o(arrayList);
    }

    /* JADX INFO: renamed from: d0 */
    public static byte[] m6590d0(Collection collection) {
        AbstractC6118n.m27187e(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            bArr[i7] = ((Number) it.next()).byteValue();
            i7++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Collection m6591e0(Iterable iterable, Collection destination) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    /* JADX INFO: renamed from: f0 */
    public static int[] m6592f0(Collection collection) {
        AbstractC6118n.m27187e(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: g0 */
    public static List m6593g0(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC1640s.m6770o(m6595i0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1640s.m6765j();
        }
        if (size != 1) {
            return m6596j0(collection);
        }
        return AbstractC1639r.m6759d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: h0 */
    public static long[] m6594h0(Collection collection) {
        AbstractC6118n.m27187e(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            jArr[i7] = ((Number) it.next()).longValue();
            i7++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: i0 */
    public static final List m6595i0(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return iterable instanceof Collection ? m6596j0((Collection) iterable) : (List) m6591e0(iterable, new ArrayList());
    }

    /* JADX INFO: renamed from: j0 */
    public static List m6596j0(Collection collection) {
        AbstractC6118n.m27187e(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: k0 */
    public static Set m6597k0(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m6591e0(iterable, new LinkedHashSet());
    }

    /* JADX INFO: renamed from: l0 */
    public static Set m6598l0(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC1619Q.m6651e((Set) m6591e0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1619Q.m6650d();
        }
        if (size != 1) {
            return (Set) m6591e0(iterable, new LinkedHashSet(AbstractC1612J.m6623e(collection.size())));
        }
        return AbstractC1618P.m6649c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: m0 */
    public static List m6599m0(Iterable iterable, int i7, int i8, boolean z7) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC1621T.m6653a(i7, i8);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM6654b = AbstractC1621T.m6654b(iterable.iterator(), i7, i8, z7, false);
            while (itM6654b.hasNext()) {
                arrayList.add((List) itM6654b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i8) + (size % i8 == 0 ? 0 : 1));
        int i9 = 0;
        while (i9 >= 0 && i9 < size) {
            int iD = AbstractC5905g.m26656d(i7, size - i9);
            if (iD < i7 && !z7) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iD);
            for (int i10 = 0; i10 < iD; i10++) {
                arrayList3.add(list.get(i10 + i9));
            }
            arrayList2.add(arrayList3);
            i9 += i8;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n0 */
    public static List m6600n0(Iterable iterable, Iterable other) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1641t.m6774s(iterable, 10), AbstractC1641t.m6774s(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(AbstractC1440r.m6083a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
