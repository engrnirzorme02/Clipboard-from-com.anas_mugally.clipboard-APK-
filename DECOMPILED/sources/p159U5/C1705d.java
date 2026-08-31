package p159U5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1625d;
import p246f6.InterfaceC5442a;
import p246f6.InterfaceC5445d;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: U5.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1705d implements Map, Serializable, InterfaceC5445d {

    /* JADX INFO: renamed from: y */
    public static final a f5677y = new a(null);

    /* JADX INFO: renamed from: z */
    private static final C1705d f5678z;

    /* JADX INFO: renamed from: a */
    private Object[] f5679a;

    /* JADX INFO: renamed from: b */
    private Object[] f5680b;

    /* JADX INFO: renamed from: c */
    private int[] f5681c;

    /* JADX INFO: renamed from: d */
    private int[] f5682d;

    /* JADX INFO: renamed from: e */
    private int f5683e;

    /* JADX INFO: renamed from: f */
    private int f5684f;

    /* JADX INFO: renamed from: r */
    private int f5685r;

    /* JADX INFO: renamed from: s */
    private int f5686s;

    /* JADX INFO: renamed from: t */
    private int f5687t;

    /* JADX INFO: renamed from: u */
    private C1707f f5688u;

    /* JADX INFO: renamed from: v */
    private C1708g f5689v;

    /* JADX INFO: renamed from: w */
    private C1706e f5690w;

    /* JADX INFO: renamed from: x */
    private boolean f5691x;

    /* JADX INFO: renamed from: U5.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public final int m7293c(int i7) {
            return Integer.highestOneBit(AbstractC5905g.m26654b(i7, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final int m7294d(int i7) {
            return Integer.numberOfLeadingZeros(i7) + 1;
        }

        /* JADX INFO: renamed from: e */
        public final C1705d m7295e() {
            return C1705d.f5678z;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: U5.d$b */
    public static final class b extends d implements Iterator, InterfaceC5442a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1705d map) {
            super(map);
            AbstractC6118n.m27187e(map, "map");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c next() {
            m7300a();
            if (m7301b() >= m7303e().f5684f) {
                throw new NoSuchElementException();
            }
            int iM7301b = m7301b();
            m7305g(iM7301b + 1);
            m7306h(iM7301b);
            c cVar = new c(m7303e(), m7302c());
            m7304f();
            return cVar;
        }

        /* JADX INFO: renamed from: k */
        public final void m7297k(StringBuilder sb) {
            AbstractC6118n.m27187e(sb, "sb");
            if (m7301b() >= m7303e().f5684f) {
                throw new NoSuchElementException();
            }
            int iM7301b = m7301b();
            m7305g(iM7301b + 1);
            m7306h(iM7301b);
            Object obj = m7303e().f5679a[m7302c()];
            if (obj == m7303e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = m7303e().f5680b;
            AbstractC6118n.m27184b(objArr);
            Object obj2 = objArr[m7302c()];
            if (obj2 == m7303e()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m7304f();
        }

        /* JADX INFO: renamed from: l */
        public final int m7298l() {
            if (m7301b() >= m7303e().f5684f) {
                throw new NoSuchElementException();
            }
            int iM7301b = m7301b();
            m7305g(iM7301b + 1);
            m7306h(iM7301b);
            Object obj = m7303e().f5679a[m7302c()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m7303e().f5680b;
            AbstractC6118n.m27184b(objArr);
            Object obj2 = objArr[m7302c()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m7304f();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: U5.d$c */
    public static final class c implements Map.Entry, InterfaceC5442a {

        /* JADX INFO: renamed from: a */
        private final C1705d f5692a;

        /* JADX INFO: renamed from: b */
        private final int f5693b;

        /* JADX INFO: renamed from: c */
        private final int f5694c;

        public c(C1705d map, int i7) {
            AbstractC6118n.m27187e(map, "map");
            this.f5692a = map;
            this.f5693b = i7;
            this.f5694c = map.f5686s;
        }

        /* JADX INFO: renamed from: a */
        private final void m7299a() {
            if (this.f5692a.f5686s != this.f5694c) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC6118n.m27183a(entry.getKey(), getKey()) && AbstractC6118n.m27183a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            m7299a();
            return this.f5692a.f5679a[this.f5693b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            m7299a();
            Object[] objArr = this.f5692a.f5680b;
            AbstractC6118n.m27184b(objArr);
            return objArr[this.f5693b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m7299a();
            this.f5692a.m7284m();
            Object[] objArrM7267k = this.f5692a.m7267k();
            int i7 = this.f5693b;
            Object obj2 = objArrM7267k[i7];
            objArrM7267k[i7] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: U5.d$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        private final C1705d f5695a;

        /* JADX INFO: renamed from: b */
        private int f5696b;

        /* JADX INFO: renamed from: c */
        private int f5697c;

        /* JADX INFO: renamed from: d */
        private int f5698d;

        public d(C1705d map) {
            AbstractC6118n.m27187e(map, "map");
            this.f5695a = map;
            this.f5697c = -1;
            this.f5698d = map.f5686s;
            m7304f();
        }

        /* JADX INFO: renamed from: a */
        public final void m7300a() {
            if (this.f5695a.f5686s != this.f5698d) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m7301b() {
            return this.f5696b;
        }

        /* JADX INFO: renamed from: c */
        public final int m7302c() {
            return this.f5697c;
        }

        /* JADX INFO: renamed from: e */
        public final C1705d m7303e() {
            return this.f5695a;
        }

        /* JADX INFO: renamed from: f */
        public final void m7304f() {
            while (this.f5696b < this.f5695a.f5684f) {
                int[] iArr = this.f5695a.f5681c;
                int i7 = this.f5696b;
                if (iArr[i7] >= 0) {
                    return;
                } else {
                    this.f5696b = i7 + 1;
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m7305g(int i7) {
            this.f5696b = i7;
        }

        /* JADX INFO: renamed from: h */
        public final void m7306h(int i7) {
            this.f5697c = i7;
        }

        public final boolean hasNext() {
            return this.f5696b < this.f5695a.f5684f;
        }

        public final void remove() {
            m7300a();
            if (this.f5697c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.f5695a.m7284m();
            this.f5695a.m7256K(this.f5697c);
            this.f5697c = -1;
            this.f5698d = this.f5695a.f5686s;
        }
    }

    /* JADX INFO: renamed from: U5.d$e */
    public static final class e extends d implements Iterator, InterfaceC5442a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C1705d map) {
            super(map);
            AbstractC6118n.m27187e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m7300a();
            if (m7301b() >= m7303e().f5684f) {
                throw new NoSuchElementException();
            }
            int iM7301b = m7301b();
            m7305g(iM7301b + 1);
            m7306h(iM7301b);
            Object obj = m7303e().f5679a[m7302c()];
            m7304f();
            return obj;
        }
    }

    /* JADX INFO: renamed from: U5.d$f */
    public static final class f extends d implements Iterator, InterfaceC5442a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C1705d map) {
            super(map);
            AbstractC6118n.m27187e(map, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            m7300a();
            if (m7301b() >= m7303e().f5684f) {
                throw new NoSuchElementException();
            }
            int iM7301b = m7301b();
            m7305g(iM7301b + 1);
            m7306h(iM7301b);
            Object[] objArr = m7303e().f5680b;
            AbstractC6118n.m27184b(objArr);
            Object obj = objArr[m7302c()];
            m7304f();
            return obj;
        }
    }

    static {
        C1705d c1705d = new C1705d(0);
        c1705d.f5691x = true;
        f5678z = c1705d;
    }

    private C1705d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i7, int i8) {
        this.f5679a = objArr;
        this.f5680b = objArr2;
        this.f5681c = iArr;
        this.f5682d = iArr2;
        this.f5683e = i7;
        this.f5684f = i8;
        this.f5685r = f5677y.m7294d(m7274y());
    }

    /* JADX INFO: renamed from: C */
    private final int m7250C(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f5685r;
    }

    /* JADX INFO: renamed from: E */
    private final boolean m7251E(Collection collection) {
        boolean z7 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m7271s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m7252F((Map.Entry) it.next())) {
                z7 = true;
            }
        }
        return z7;
    }

    /* JADX INFO: renamed from: F */
    private final boolean m7252F(Map.Entry entry) {
        int iM7282i = m7282i(entry.getKey());
        Object[] objArrM7267k = m7267k();
        if (iM7282i >= 0) {
            objArrM7267k[iM7282i] = entry.getValue();
            return true;
        }
        int i7 = (-iM7282i) - 1;
        if (AbstractC6118n.m27183a(entry.getValue(), objArrM7267k[i7])) {
            return false;
        }
        objArrM7267k[i7] = entry.getValue();
        return true;
    }

    /* JADX INFO: renamed from: G */
    private final boolean m7253G(int i7) {
        int iM7250C = m7250C(this.f5679a[i7]);
        int i8 = this.f5683e;
        while (true) {
            int[] iArr = this.f5682d;
            if (iArr[iM7250C] == 0) {
                iArr[iM7250C] = i7 + 1;
                this.f5681c[i7] = iM7250C;
                return true;
            }
            i8--;
            if (i8 < 0) {
                return false;
            }
            iM7250C = iM7250C == 0 ? m7274y() - 1 : iM7250C - 1;
        }
    }

    /* JADX INFO: renamed from: H */
    private final void m7254H() {
        this.f5686s++;
    }

    /* JADX INFO: renamed from: I */
    private final void m7255I(int i7) {
        m7254H();
        int i8 = 0;
        if (this.f5684f > size()) {
            m7268n(false);
        }
        this.f5682d = new int[i7];
        this.f5685r = f5677y.m7294d(i7);
        while (i8 < this.f5684f) {
            int i9 = i8 + 1;
            if (!m7253G(i8)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i8 = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final void m7256K(int i7) {
        AbstractC1704c.m7245f(this.f5679a, i7);
        Object[] objArr = this.f5680b;
        if (objArr != null) {
            AbstractC1704c.m7245f(objArr, i7);
        }
        m7257L(this.f5681c[i7]);
        this.f5681c[i7] = -1;
        this.f5687t = size() - 1;
        m7254H();
    }

    /* JADX INFO: renamed from: L */
    private final void m7257L(int i7) {
        int iD = AbstractC5905g.m26656d(this.f5683e * 2, m7274y() / 2);
        int i8 = 0;
        int i9 = i7;
        do {
            i7 = i7 == 0 ? m7274y() - 1 : i7 - 1;
            i8++;
            if (i8 > this.f5683e) {
                this.f5682d[i9] = 0;
                return;
            }
            int[] iArr = this.f5682d;
            int i10 = iArr[i7];
            if (i10 == 0) {
                iArr[i9] = 0;
                return;
            }
            if (i10 < 0) {
                iArr[i9] = -1;
            } else {
                int i11 = i10 - 1;
                if (((m7250C(this.f5679a[i11]) - i7) & (m7274y() - 1)) >= i8) {
                    this.f5682d[i9] = i10;
                    this.f5681c[i11] = i9;
                }
                iD--;
            }
            i9 = i7;
            i8 = 0;
            iD--;
        } while (iD >= 0);
        this.f5682d[i9] = -1;
    }

    /* JADX INFO: renamed from: O */
    private final boolean m7258O(int i7) {
        int iM7288w = m7288w();
        int i8 = this.f5684f;
        int i9 = iM7288w - i8;
        int size = i8 - size();
        return i9 < i7 && i9 + size >= i7 && size >= m7288w() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Object[] m7267k() {
        Object[] objArr = this.f5680b;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrM7243d = AbstractC1704c.m7243d(m7288w());
        this.f5680b = objArrM7243d;
        return objArrM7243d;
    }

    /* JADX INFO: renamed from: n */
    private final void m7268n(boolean z7) {
        int i7;
        Object[] objArr = this.f5680b;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i7 = this.f5684f;
            if (i8 >= i7) {
                break;
            }
            int[] iArr = this.f5681c;
            int i10 = iArr[i8];
            if (i10 >= 0) {
                Object[] objArr2 = this.f5679a;
                objArr2[i9] = objArr2[i8];
                if (objArr != null) {
                    objArr[i9] = objArr[i8];
                }
                if (z7) {
                    iArr[i9] = i10;
                    this.f5682d[i10] = i9 + 1;
                }
                i9++;
            }
            i8++;
        }
        AbstractC1704c.m7246g(this.f5679a, i9, i7);
        if (objArr != null) {
            AbstractC1704c.m7246g(objArr, i9, this.f5684f);
        }
        this.f5684f = i9;
    }

    /* JADX INFO: renamed from: q */
    private final boolean m7269q(Map map) {
        return size() == map.size() && m7285o(map.entrySet());
    }

    /* JADX INFO: renamed from: r */
    private final void m7270r(int i7) {
        if (i7 < 0) {
            throw new OutOfMemoryError();
        }
        if (i7 > m7288w()) {
            int iM6665e = AbstractC1625d.f5389a.m6665e(m7288w(), i7);
            this.f5679a = AbstractC1704c.m7244e(this.f5679a, iM6665e);
            Object[] objArr = this.f5680b;
            this.f5680b = objArr != null ? AbstractC1704c.m7244e(objArr, iM6665e) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f5681c, iM6665e);
            AbstractC6118n.m27186d(iArrCopyOf, "copyOf(...)");
            this.f5681c = iArrCopyOf;
            int iM7293c = f5677y.m7293c(iM6665e);
            if (iM7293c > m7274y()) {
                m7255I(iM7293c);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private final void m7271s(int i7) {
        if (m7258O(i7)) {
            m7268n(true);
        } else {
            m7270r(this.f5684f + i7);
        }
    }

    /* JADX INFO: renamed from: u */
    private final int m7272u(Object obj) {
        int iM7250C = m7250C(obj);
        int i7 = this.f5683e;
        while (true) {
            int i8 = this.f5682d[iM7250C];
            if (i8 == 0) {
                return -1;
            }
            if (i8 > 0) {
                int i9 = i8 - 1;
                if (AbstractC6118n.m27183a(this.f5679a[i9], obj)) {
                    return i9;
                }
            }
            i7--;
            if (i7 < 0) {
                return -1;
            }
            iM7250C = iM7250C == 0 ? m7274y() - 1 : iM7250C - 1;
        }
    }

    /* JADX INFO: renamed from: v */
    private final int m7273v(Object obj) {
        int i7 = this.f5684f;
        while (true) {
            i7--;
            if (i7 < 0) {
                return -1;
            }
            if (this.f5681c[i7] >= 0) {
                Object[] objArr = this.f5680b;
                AbstractC6118n.m27184b(objArr);
                if (AbstractC6118n.m27183a(objArr[i7], obj)) {
                    return i7;
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private final int m7274y() {
        return this.f5682d.length;
    }

    /* JADX INFO: renamed from: A */
    public int m7275A() {
        return this.f5687t;
    }

    /* JADX INFO: renamed from: B */
    public Collection m7276B() {
        C1708g c1708g = this.f5689v;
        if (c1708g != null) {
            return c1708g;
        }
        C1708g c1708g2 = new C1708g(this);
        this.f5689v = c1708g2;
        return c1708g2;
    }

    /* JADX INFO: renamed from: D */
    public final e m7277D() {
        return new e(this);
    }

    /* JADX INFO: renamed from: J */
    public final boolean m7278J(Map.Entry entry) {
        AbstractC6118n.m27187e(entry, "entry");
        m7284m();
        int iM7272u = m7272u(entry.getKey());
        if (iM7272u < 0) {
            return false;
        }
        Object[] objArr = this.f5680b;
        AbstractC6118n.m27184b(objArr);
        if (!AbstractC6118n.m27183a(objArr[iM7272u], entry.getValue())) {
            return false;
        }
        m7256K(iM7272u);
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m7279M(Object obj) {
        m7284m();
        int iM7272u = m7272u(obj);
        if (iM7272u < 0) {
            return false;
        }
        m7256K(iM7272u);
        return true;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7280N(Object obj) {
        m7284m();
        int iM7273v = m7273v(obj);
        if (iM7273v < 0) {
            return false;
        }
        m7256K(iM7273v);
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final f m7281P() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m7284m();
        int i7 = this.f5684f - 1;
        if (i7 >= 0) {
            int i8 = 0;
            while (true) {
                int[] iArr = this.f5681c;
                int i9 = iArr[i8];
                if (i9 >= 0) {
                    this.f5682d[i9] = 0;
                    iArr[i8] = -1;
                }
                if (i8 == i7) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        AbstractC1704c.m7246g(this.f5679a, 0, this.f5684f);
        Object[] objArr = this.f5680b;
        if (objArr != null) {
            AbstractC1704c.m7246g(objArr, 0, this.f5684f);
        }
        this.f5687t = 0;
        this.f5684f = 0;
        m7254H();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m7272u(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m7273v(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m7289x();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && m7269q((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iM7272u = m7272u(obj);
        if (iM7272u < 0) {
            return null;
        }
        Object[] objArr = this.f5680b;
        AbstractC6118n.m27184b(objArr);
        return objArr[iM7272u];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarM7287t = m7287t();
        int iM7298l = 0;
        while (bVarM7287t.hasNext()) {
            iM7298l += bVarM7287t.m7298l();
        }
        return iM7298l;
    }

    /* JADX INFO: renamed from: i */
    public final int m7282i(Object obj) {
        m7284m();
        while (true) {
            int iM7250C = m7250C(obj);
            int iD = AbstractC5905g.m26656d(this.f5683e * 2, m7274y() / 2);
            int i7 = 0;
            while (true) {
                int i8 = this.f5682d[iM7250C];
                if (i8 <= 0) {
                    if (this.f5684f >= m7288w()) {
                        m7271s(1);
                        break;
                    }
                    int i9 = this.f5684f;
                    int i10 = i9 + 1;
                    this.f5684f = i10;
                    this.f5679a[i9] = obj;
                    this.f5681c[i9] = iM7250C;
                    this.f5682d[iM7250C] = i10;
                    this.f5687t = size() + 1;
                    m7254H();
                    if (i7 > this.f5683e) {
                        this.f5683e = i7;
                    }
                    return i9;
                }
                if (AbstractC6118n.m27183a(this.f5679a[i8 - 1], obj)) {
                    return -i8;
                }
                i7++;
                if (i7 > iD) {
                    m7255I(m7274y() * 2);
                    break;
                }
                iM7250C = iM7250C == 0 ? m7274y() - 1 : iM7250C - 1;
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m7290z();
    }

    /* JADX INFO: renamed from: l */
    public final Map m7283l() {
        m7284m();
        this.f5691x = true;
        if (size() > 0) {
            return this;
        }
        C1705d c1705d = f5678z;
        AbstractC6118n.m27185c(c1705d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c1705d;
    }

    /* JADX INFO: renamed from: m */
    public final void m7284m() {
        if (this.f5691x) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7285o(Collection m7) {
        AbstractC6118n.m27187e(m7, "m");
        for (Object obj : m7) {
            if (obj != null) {
                try {
                    if (!m7286p((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7286p(Map.Entry entry) {
        AbstractC6118n.m27187e(entry, "entry");
        int iM7272u = m7272u(entry.getKey());
        if (iM7272u < 0) {
            return false;
        }
        Object[] objArr = this.f5680b;
        AbstractC6118n.m27184b(objArr);
        return AbstractC6118n.m27183a(objArr[iM7272u], entry.getValue());
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m7284m();
        int iM7282i = m7282i(obj);
        Object[] objArrM7267k = m7267k();
        if (iM7282i >= 0) {
            objArrM7267k[iM7282i] = obj2;
            return null;
        }
        int i7 = (-iM7282i) - 1;
        Object obj3 = objArrM7267k[i7];
        objArrM7267k[i7] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        AbstractC6118n.m27187e(from, "from");
        m7284m();
        m7251E(from.entrySet());
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m7284m();
        int iM7272u = m7272u(obj);
        if (iM7272u < 0) {
            return null;
        }
        Object[] objArr = this.f5680b;
        AbstractC6118n.m27184b(objArr);
        Object obj2 = objArr[iM7272u];
        m7256K(iM7272u);
        return obj2;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m7275A();
    }

    /* JADX INFO: renamed from: t */
    public final b m7287t() {
        return new b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b bVarM7287t = m7287t();
        int i7 = 0;
        while (bVarM7287t.hasNext()) {
            if (i7 > 0) {
                sb.append(", ");
            }
            bVarM7287t.m7297k(sb);
            i7++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m7276B();
    }

    /* JADX INFO: renamed from: w */
    public final int m7288w() {
        return this.f5679a.length;
    }

    /* JADX INFO: renamed from: x */
    public Set m7289x() {
        C1706e c1706e = this.f5690w;
        if (c1706e != null) {
            return c1706e;
        }
        C1706e c1706e2 = new C1706e(this);
        this.f5690w = c1706e2;
        return c1706e2;
    }

    /* JADX INFO: renamed from: z */
    public Set m7290z() {
        C1707f c1707f = this.f5688u;
        if (c1707f != null) {
            return c1707f;
        }
        C1707f c1707f2 = new C1707f(this);
        this.f5688u = c1707f2;
        return c1707f2;
    }

    public C1705d() {
        this(8);
    }

    public C1705d(int i7) {
        this(AbstractC1704c.m7243d(i7), null, new int[i7], new int[f5677y.m7293c(i7)], 2, 0);
    }
}
