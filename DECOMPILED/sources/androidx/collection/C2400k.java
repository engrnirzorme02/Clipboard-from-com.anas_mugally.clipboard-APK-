package androidx.collection;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p353t.AbstractC7065a;

/* JADX INFO: renamed from: androidx.collection.k */
/* JADX INFO: loaded from: classes.dex */
public class C2400k {

    /* JADX INFO: renamed from: a */
    private int[] f8476a;

    /* JADX INFO: renamed from: b */
    private Object[] f8477b;

    /* JADX INFO: renamed from: c */
    private int f8478c;

    public C2400k() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: c */
    private final int m10295c(Object obj, int i7) {
        int i8 = this.f8478c;
        if (i8 == 0) {
            return -1;
        }
        int iM31154a = AbstractC7065a.m31154a(this.f8476a, i8, i7);
        if (iM31154a < 0 || AbstractC6118n.m27183a(obj, this.f8477b[iM31154a << 1])) {
            return iM31154a;
        }
        int i9 = iM31154a + 1;
        while (i9 < i8 && this.f8476a[i9] == i7) {
            if (AbstractC6118n.m27183a(obj, this.f8477b[i9 << 1])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iM31154a - 1; i10 >= 0 && this.f8476a[i10] == i7; i10--) {
            if (AbstractC6118n.m27183a(obj, this.f8477b[i10 << 1])) {
                return i10;
            }
        }
        return ~i9;
    }

    /* JADX INFO: renamed from: e */
    private final int m10296e() {
        int i7 = this.f8478c;
        if (i7 == 0) {
            return -1;
        }
        int iM31154a = AbstractC7065a.m31154a(this.f8476a, i7, 0);
        if (iM31154a < 0 || this.f8477b[iM31154a << 1] == null) {
            return iM31154a;
        }
        int i8 = iM31154a + 1;
        while (i8 < i7 && this.f8476a[i8] == 0) {
            if (this.f8477b[i8 << 1] == null) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iM31154a - 1; i9 >= 0 && this.f8476a[i9] == 0; i9--) {
            if (this.f8477b[i9 << 1] == null) {
                return i9;
            }
        }
        return ~i8;
    }

    /* JADX INFO: renamed from: a */
    public final int m10297a(Object obj) {
        int i7 = this.f8478c * 2;
        Object[] objArr = this.f8477b;
        if (obj == null) {
            for (int i8 = 1; i8 < i7; i8 += 2) {
                if (objArr[i8] == null) {
                    return i8 >> 1;
                }
            }
            return -1;
        }
        for (int i9 = 1; i9 < i7; i9 += 2) {
            if (AbstractC6118n.m27183a(obj, objArr[i9])) {
                return i9 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m10298b(int i7) {
        int i8 = this.f8478c;
        int[] iArr = this.f8476a;
        if (iArr.length < i7) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8476a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8477b, i7 * 2);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8477b = objArrCopyOf;
        }
        if (this.f8478c != i8) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (this.f8478c > 0) {
            this.f8476a = AbstractC7065a.f28224a;
            this.f8477b = AbstractC7065a.f28226c;
            this.f8478c = 0;
        }
        if (this.f8478c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m10299d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m10297a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public int m10299d(Object obj) {
        return obj == null ? m10296e() : m10295c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2400k) {
                if (size() != ((C2400k) obj).size()) {
                    return false;
                }
                C2400k c2400k = (C2400k) obj;
                int i7 = this.f8478c;
                for (int i8 = 0; i8 < i7; i8++) {
                    Object objM10300f = m10300f(i8);
                    Object objM10301k = m10301k(i8);
                    Object obj2 = c2400k.get(objM10300f);
                    if (objM10301k == null) {
                        if (obj2 != null || !c2400k.containsKey(objM10300f)) {
                            return false;
                        }
                    } else if (!AbstractC6118n.m27183a(objM10301k, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i9 = this.f8478c;
            for (int i10 = 0; i10 < i9; i10++) {
                Object objM10300f2 = m10300f(i10);
                Object objM10301k2 = m10301k(i10);
                Object obj3 = ((Map) obj).get(objM10300f2);
                if (objM10301k2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM10300f2)) {
                        return false;
                    }
                } else if (!AbstractC6118n.m27183a(objM10301k2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public Object m10300f(int i7) {
        if (i7 >= 0 && i7 < this.f8478c) {
            return this.f8477b[i7 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
    }

    /* JADX INFO: renamed from: g */
    public void mo8380g(C2400k map) {
        AbstractC6118n.m27187e(map, "map");
        int i7 = map.f8478c;
        m10298b(this.f8478c + i7);
        if (this.f8478c != 0) {
            for (int i8 = 0; i8 < i7; i8++) {
                put(map.m10300f(i8), map.m10301k(i8));
            }
        } else if (i7 > 0) {
            AbstractC1631j.m6692e(map.f8476a, this.f8476a, 0, 0, i7);
            AbstractC1631j.m6694g(map.f8477b, this.f8477b, 0, 0, i7 << 1);
            this.f8478c = i7;
        }
    }

    public Object get(Object obj) {
        int iM10299d = m10299d(obj);
        if (iM10299d >= 0) {
            return this.f8477b[(iM10299d << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iM10299d = m10299d(obj);
        return iM10299d >= 0 ? this.f8477b[(iM10299d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public Object mo8381h(int i7) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f8478c)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        Object[] objArr = this.f8477b;
        int i9 = i7 << 1;
        Object obj = objArr[i9 + 1];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i10 = i8 - 1;
        int[] iArr = this.f8476a;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i7 < i10) {
                int i11 = i7 + 1;
                AbstractC1631j.m6692e(iArr, iArr, i7, i11, i8);
                Object[] objArr2 = this.f8477b;
                AbstractC1631j.m6694g(objArr2, objArr2, i9, i11 << 1, i8 << 1);
            }
            Object[] objArr3 = this.f8477b;
            int i12 = i10 << 1;
            objArr3[i12] = null;
            objArr3[i12 + 1] = null;
        } else {
            int i13 = i8 > 8 ? i8 + (i8 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8476a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8477b, i13 << 1);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8477b = objArrCopyOf;
            if (i8 != this.f8478c) {
                throw new ConcurrentModificationException();
            }
            if (i7 > 0) {
                AbstractC1631j.m6692e(iArr, this.f8476a, 0, 0, i7);
                AbstractC1631j.m6694g(objArr, this.f8477b, 0, 0, i9);
            }
            if (i7 < i10) {
                int i14 = i7 + 1;
                AbstractC1631j.m6692e(iArr, this.f8476a, i7, i14, i8);
                AbstractC1631j.m6694g(objArr, this.f8477b, i9, i14 << 1, i8 << 1);
            }
        }
        if (i8 != this.f8478c) {
            throw new ConcurrentModificationException();
        }
        this.f8478c = i10;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f8476a;
        Object[] objArr = this.f8477b;
        int i7 = this.f8478c;
        int i8 = 1;
        int i9 = 0;
        int iHashCode = 0;
        while (i9 < i7) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i9];
            i9++;
            i8 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object mo8382i(int i7, Object obj) {
        if (i7 < 0 || i7 >= this.f8478c) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
        }
        int i8 = (i7 << 1) + 1;
        Object[] objArr = this.f8477b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        return obj2;
    }

    public boolean isEmpty() {
        return this.f8478c <= 0;
    }

    /* JADX INFO: renamed from: k */
    public Object m10301k(int i7) {
        if (i7 >= 0 && i7 < this.f8478c) {
            return this.f8477b[(i7 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i7).toString());
    }

    public Object put(Object obj, Object obj2) {
        int i7 = this.f8478c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM10295c = obj != null ? m10295c(obj, iHashCode) : m10296e();
        if (iM10295c >= 0) {
            int i8 = (iM10295c << 1) + 1;
            Object[] objArr = this.f8477b;
            Object obj3 = objArr[i8];
            objArr[i8] = obj2;
            return obj3;
        }
        int i9 = ~iM10295c;
        int[] iArr = this.f8476a;
        if (i7 >= iArr.length) {
            int i10 = 8;
            if (i7 >= 8) {
                i10 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i10 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(this, newSize)");
            this.f8476a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f8477b, i10 << 1);
            AbstractC6118n.m27186d(objArrCopyOf, "copyOf(this, newSize)");
            this.f8477b = objArrCopyOf;
            if (i7 != this.f8478c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i9 < i7) {
            int[] iArr2 = this.f8476a;
            int i11 = i9 + 1;
            AbstractC1631j.m6692e(iArr2, iArr2, i11, i9, i7);
            Object[] objArr2 = this.f8477b;
            AbstractC1631j.m6694g(objArr2, objArr2, i11 << 1, i9 << 1, this.f8478c << 1);
        }
        int i12 = this.f8478c;
        if (i7 == i12) {
            int[] iArr3 = this.f8476a;
            if (i9 < iArr3.length) {
                iArr3[i9] = iHashCode;
                Object[] objArr3 = this.f8477b;
                int i13 = i9 << 1;
                objArr3[i13] = obj;
                objArr3[i13 + 1] = obj2;
                this.f8478c = i12 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM10299d = m10299d(obj);
        if (iM10299d >= 0) {
            return mo8381h(iM10299d);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iM10299d = m10299d(obj);
        if (iM10299d >= 0) {
            return mo8382i(iM10299d, obj2);
        }
        return null;
    }

    public int size() {
        return this.f8478c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8478c * 28);
        sb.append('{');
        int i7 = this.f8478c;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object objM10300f = m10300f(i8);
            if (objM10300f != sb) {
                sb.append(objM10300f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM10301k = m10301k(i8);
            if (objM10301k != sb) {
                sb.append(objM10301k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public C2400k(int i7) {
        this.f8476a = i7 == 0 ? AbstractC7065a.f28224a : new int[i7];
        this.f8477b = i7 == 0 ? AbstractC7065a.f28226c : new Object[i7 << 1];
    }

    public boolean remove(Object obj, Object obj2) {
        int iM10299d = m10299d(obj);
        if (iM10299d < 0 || !AbstractC6118n.m27183a(obj2, m10301k(iM10299d))) {
            return false;
        }
        mo8381h(iM10299d);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iM10299d = m10299d(obj);
        if (iM10299d < 0 || !AbstractC6118n.m27183a(obj2, m10301k(iM10299d))) {
            return false;
        }
        mo8382i(iM10299d, obj3);
        return true;
    }

    public /* synthetic */ C2400k(int i7, int i8, AbstractC6112h abstractC6112h) {
        this((i8 & 1) != 0 ? 0 : i7);
    }

    public C2400k(C2400k c2400k) {
        this(0, 1, null);
        if (c2400k != null) {
            mo8380g(c2400k);
        }
    }
}
