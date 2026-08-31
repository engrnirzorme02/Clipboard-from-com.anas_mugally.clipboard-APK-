package p129Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;
import p150T3.AbstractC1470a;

/* JADX INFO: renamed from: Q3.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1276o {
    /* JADX INFO: renamed from: a */
    static int m5584a(int i7) {
        AbstractC1265d.m5509b(i7, "arraySize");
        return AbstractC1470a.m6131a(((long) i7) + 5 + ((long) (i7 / 10)));
    }

    /* JADX INFO: renamed from: b */
    static boolean m5585b(List list, Object obj) {
        if (obj == AbstractC1209m.m5302n(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC1275n.m5582a(list.iterator(), list2.iterator());
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!AbstractC1205i.m5282a(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    static int m5586c(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m5587d(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC1205i.m5282a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    private static int m5587d(List list, Object obj) {
        int size = list.size();
        int i7 = 0;
        if (obj == null) {
            while (i7 < size) {
                if (list.get(i7) == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        while (i7 < size) {
            if (obj.equals(list.get(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    static int m5588e(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m5589f(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AbstractC1205i.m5282a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    private static int m5589f(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList m5590g(Object... objArr) {
        AbstractC1209m.m5302n(objArr);
        ArrayList arrayList = new ArrayList(m5584a(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
