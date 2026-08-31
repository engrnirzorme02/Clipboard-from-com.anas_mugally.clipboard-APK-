package p043F1;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p183Y1.AbstractC2022k;

/* JADX INFO: renamed from: F1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0411i implements InterfaceC0404b {

    /* JADX INFO: renamed from: a */
    private final C0409g f1627a = new C0409g();

    /* JADX INFO: renamed from: b */
    private final b f1628b = new b();

    /* JADX INFO: renamed from: c */
    private final Map f1629c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final Map f1630d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final int f1631e;

    /* JADX INFO: renamed from: f */
    private int f1632f;

    /* JADX INFO: renamed from: F1.i$a */
    private static final class a implements InterfaceC0414l {

        /* JADX INFO: renamed from: a */
        private final b f1633a;

        /* JADX INFO: renamed from: b */
        int f1634b;

        /* JADX INFO: renamed from: c */
        private Class f1635c;

        a(b bVar) {
            this.f1633a = bVar;
        }

        @Override // p043F1.InterfaceC0414l
        /* JADX INFO: renamed from: a */
        public void mo1773a() {
            this.f1633a.m1742c(this);
        }

        /* JADX INFO: renamed from: b */
        void m1774b(int i7, Class cls) {
            this.f1634b = i7;
            this.f1635c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f1634b == aVar.f1634b && this.f1635c == aVar.f1635c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i7 = this.f1634b * 31;
            Class cls = this.f1635c;
            return i7 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f1634b + "array=" + this.f1635c + '}';
        }
    }

    /* JADX INFO: renamed from: F1.i$b */
    private static final class b extends AbstractC0405c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p043F1.AbstractC0405c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a mo1740a() {
            return new a(this);
        }

        /* JADX INFO: renamed from: e */
        a m1776e(int i7, Class cls) {
            a aVar = (a) m1741b();
            aVar.m1774b(i7, cls);
            return aVar;
        }
    }

    public C0411i(int i7) {
        this.f1631e = i7;
    }

    /* JADX INFO: renamed from: f */
    private void m1762f(int i7, Class cls) {
        NavigableMap navigableMapM1769m = m1769m(cls);
        Integer num = (Integer) navigableMapM1769m.get(Integer.valueOf(i7));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM1769m.remove(Integer.valueOf(i7));
                return;
            } else {
                navigableMapM1769m.put(Integer.valueOf(i7), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i7 + ", this: " + this);
    }

    /* JADX INFO: renamed from: g */
    private void m1763g() {
        m1764h(this.f1631e);
    }

    /* JADX INFO: renamed from: h */
    private void m1764h(int i7) {
        while (this.f1632f > i7) {
            Object objM1756f = this.f1627a.m1756f();
            AbstractC2022k.m8408e(objM1756f);
            InterfaceC0403a interfaceC0403aM1765i = m1765i(objM1756f);
            this.f1632f -= interfaceC0403aM1765i.mo1734c(objM1756f) * interfaceC0403aM1765i.mo1733b();
            m1762f(interfaceC0403aM1765i.mo1734c(objM1756f), objM1756f.getClass());
            if (Log.isLoggable(interfaceC0403aM1765i.mo1732a(), 2)) {
                Log.v(interfaceC0403aM1765i.mo1732a(), "evicted: " + interfaceC0403aM1765i.mo1734c(objM1756f));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private InterfaceC0403a m1765i(Object obj) {
        return m1766j(obj.getClass());
    }

    /* JADX INFO: renamed from: j */
    private InterfaceC0403a m1766j(Class cls) {
        InterfaceC0403a c0408f;
        InterfaceC0403a interfaceC0403a = (InterfaceC0403a) this.f1630d.get(cls);
        if (interfaceC0403a != null) {
            return interfaceC0403a;
        }
        if (cls.equals(int[].class)) {
            c0408f = new C0410h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            c0408f = new C0408f();
        }
        this.f1630d.put(cls, c0408f);
        return c0408f;
    }

    /* JADX INFO: renamed from: k */
    private Object m1767k(a aVar) {
        return this.f1627a.m1754a(aVar);
    }

    /* JADX INFO: renamed from: l */
    private Object m1768l(a aVar, Class cls) {
        InterfaceC0403a interfaceC0403aM1766j = m1766j(cls);
        Object objM1767k = m1767k(aVar);
        if (objM1767k != null) {
            this.f1632f -= interfaceC0403aM1766j.mo1734c(objM1767k) * interfaceC0403aM1766j.mo1733b();
            m1762f(interfaceC0403aM1766j.mo1734c(objM1767k), cls);
        }
        if (objM1767k != null) {
            return objM1767k;
        }
        if (Log.isLoggable(interfaceC0403aM1766j.mo1732a(), 2)) {
            Log.v(interfaceC0403aM1766j.mo1732a(), "Allocated " + aVar.f1634b + " bytes");
        }
        return interfaceC0403aM1766j.newArray(aVar.f1634b);
    }

    /* JADX INFO: renamed from: m */
    private NavigableMap m1769m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f1629c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1629c.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: n */
    private boolean m1770n() {
        int i7 = this.f1632f;
        return i7 == 0 || this.f1631e / i7 >= 2;
    }

    /* JADX INFO: renamed from: o */
    private boolean m1771o(int i7) {
        return i7 <= this.f1631e / 2;
    }

    /* JADX INFO: renamed from: p */
    private boolean m1772p(int i7, Integer num) {
        if (num != null) {
            return m1770n() || num.intValue() <= i7 * 8;
        }
        return false;
    }

    @Override // p043F1.InterfaceC0404b
    /* JADX INFO: renamed from: a */
    public synchronized void mo1735a(int i7) {
        try {
            if (i7 >= 40) {
                mo1736b();
            } else if (i7 >= 20 || i7 == 15) {
                m1764h(this.f1631e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p043F1.InterfaceC0404b
    /* JADX INFO: renamed from: b */
    public synchronized void mo1736b() {
        m1764h(0);
    }

    @Override // p043F1.InterfaceC0404b
    /* JADX INFO: renamed from: c */
    public synchronized Object mo1737c(int i7, Class cls) {
        return m1768l(this.f1628b.m1776e(i7, cls), cls);
    }

    @Override // p043F1.InterfaceC0404b
    /* JADX INFO: renamed from: d */
    public synchronized void mo1738d(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC0403a interfaceC0403aM1766j = m1766j(cls);
        int iMo1734c = interfaceC0403aM1766j.mo1734c(obj);
        int iMo1733b = interfaceC0403aM1766j.mo1733b() * iMo1734c;
        if (m1771o(iMo1733b)) {
            a aVarM1776e = this.f1628b.m1776e(iMo1734c, cls);
            this.f1627a.m1755d(aVarM1776e, obj);
            NavigableMap navigableMapM1769m = m1769m(cls);
            Integer num = (Integer) navigableMapM1769m.get(Integer.valueOf(aVarM1776e.f1634b));
            Integer numValueOf = Integer.valueOf(aVarM1776e.f1634b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM1769m.put(numValueOf, Integer.valueOf(iIntValue));
            this.f1632f += iMo1733b;
            m1763g();
        }
    }

    @Override // p043F1.InterfaceC0404b
    /* JADX INFO: renamed from: e */
    public synchronized Object mo1739e(int i7, Class cls) {
        Integer num;
        try {
            num = (Integer) m1769m(cls).ceilingKey(Integer.valueOf(i7));
        } catch (Throwable th) {
            throw th;
        }
        return m1768l(m1772p(i7, num) ? this.f1628b.m1776e(num.intValue(), cls) : this.f1628b.m1776e(i7, cls), cls);
    }
}
