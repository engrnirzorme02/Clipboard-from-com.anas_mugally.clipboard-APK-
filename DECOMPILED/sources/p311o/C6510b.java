package p311o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.b */
/* JADX INFO: loaded from: classes.dex */
public class C6510b implements Iterable {

    /* JADX INFO: renamed from: a */
    c f24623a;

    /* JADX INFO: renamed from: b */
    private c f24624b;

    /* JADX INFO: renamed from: c */
    private final WeakHashMap f24625c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    private int f24626d = 0;

    /* JADX INFO: renamed from: o.b$a */
    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p311o.C6510b.e
        /* JADX INFO: renamed from: b */
        c mo27737b(c cVar) {
            return cVar.f24630d;
        }

        @Override // p311o.C6510b.e
        /* JADX INFO: renamed from: c */
        c mo27738c(c cVar) {
            return cVar.f24629c;
        }
    }

    /* JADX INFO: renamed from: o.b$b */
    private static class b extends e {
        b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // p311o.C6510b.e
        /* JADX INFO: renamed from: b */
        c mo27737b(c cVar) {
            return cVar.f24629c;
        }

        @Override // p311o.C6510b.e
        /* JADX INFO: renamed from: c */
        c mo27738c(c cVar) {
            return cVar.f24630d;
        }
    }

    /* JADX INFO: renamed from: o.b$c */
    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a */
        final Object f24627a;

        /* JADX INFO: renamed from: b */
        final Object f24628b;

        /* JADX INFO: renamed from: c */
        c f24629c;

        /* JADX INFO: renamed from: d */
        c f24630d;

        c(Object obj, Object obj2) {
            this.f24627a = obj;
            this.f24628b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f24627a.equals(cVar.f24627a) && this.f24628b.equals(cVar.f24628b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f24627a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f24628b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f24627a.hashCode() ^ this.f24628b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f24627a + "=" + this.f24628b;
        }
    }

    /* JADX INFO: renamed from: o.b$d */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a */
        private c f24631a;

        /* JADX INFO: renamed from: b */
        private boolean f24632b = true;

        d() {
        }

        @Override // p311o.C6510b.f
        /* JADX INFO: renamed from: a */
        void mo27739a(c cVar) {
            c cVar2 = this.f24631a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f24630d;
                this.f24631a = cVar3;
                this.f24632b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f24632b) {
                this.f24632b = false;
                this.f24631a = C6510b.this.f24623a;
            } else {
                c cVar = this.f24631a;
                this.f24631a = cVar != null ? cVar.f24629c : null;
            }
            return this.f24631a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24632b) {
                return C6510b.this.f24623a != null;
            }
            c cVar = this.f24631a;
            return (cVar == null || cVar.f24629c == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: o.b$e */
    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a */
        c f24634a;

        /* JADX INFO: renamed from: b */
        c f24635b;

        e(c cVar, c cVar2) {
            this.f24634a = cVar2;
            this.f24635b = cVar;
        }

        /* JADX INFO: renamed from: f */
        private c m27741f() {
            c cVar = this.f24635b;
            c cVar2 = this.f24634a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo27738c(cVar);
        }

        @Override // p311o.C6510b.f
        /* JADX INFO: renamed from: a */
        public void mo27739a(c cVar) {
            if (this.f24634a == cVar && cVar == this.f24635b) {
                this.f24635b = null;
                this.f24634a = null;
            }
            c cVar2 = this.f24634a;
            if (cVar2 == cVar) {
                this.f24634a = mo27737b(cVar2);
            }
            if (this.f24635b == cVar) {
                this.f24635b = m27741f();
            }
        }

        /* JADX INFO: renamed from: b */
        abstract c mo27737b(c cVar);

        /* JADX INFO: renamed from: c */
        abstract c mo27738c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f24635b;
            this.f24635b = m27741f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24635b != null;
        }
    }

    /* JADX INFO: renamed from: o.b$f */
    public static abstract class f {
        /* JADX INFO: renamed from: a */
        abstract void mo27739a(c cVar);
    }

    /* JADX INFO: renamed from: a */
    public Map.Entry m27733a() {
        return this.f24623a;
    }

    /* JADX INFO: renamed from: b */
    protected c mo27729b(Object obj) {
        c cVar = this.f24623a;
        while (cVar != null && !cVar.f24627a.equals(obj)) {
            cVar = cVar.f24629c;
        }
        return cVar;
    }

    public Iterator descendingIterator() {
        b bVar = new b(this.f24624b, this.f24623a);
        this.f24625c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public d m27734e() {
        d dVar = new d();
        this.f24625c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6510b)) {
            return false;
        }
        C6510b c6510b = (C6510b) obj;
        if (size() != c6510b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c6510b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public Map.Entry m27735g() {
        return this.f24624b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f24623a, this.f24624b);
        this.f24625c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: renamed from: j */
    c m27736j(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f24626d++;
        c cVar2 = this.f24624b;
        if (cVar2 == null) {
            this.f24623a = cVar;
            this.f24624b = cVar;
            return cVar;
        }
        cVar2.f24629c = cVar;
        cVar.f24630d = cVar2;
        this.f24624b = cVar;
        return cVar;
    }

    /* JADX INFO: renamed from: k */
    public Object mo27730k(Object obj, Object obj2) {
        c cVarMo27729b = mo27729b(obj);
        if (cVarMo27729b != null) {
            return cVarMo27729b.f24628b;
        }
        m27736j(obj, obj2);
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Object mo27731m(Object obj) {
        c cVarMo27729b = mo27729b(obj);
        if (cVarMo27729b == null) {
            return null;
        }
        this.f24626d--;
        if (!this.f24625c.isEmpty()) {
            Iterator it = this.f24625c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo27739a(cVarMo27729b);
            }
        }
        c cVar = cVarMo27729b.f24630d;
        if (cVar != null) {
            cVar.f24629c = cVarMo27729b.f24629c;
        } else {
            this.f24623a = cVarMo27729b.f24629c;
        }
        c cVar2 = cVarMo27729b.f24629c;
        if (cVar2 != null) {
            cVar2.f24630d = cVar;
        } else {
            this.f24624b = cVar;
        }
        cVarMo27729b.f24629c = null;
        cVarMo27729b.f24630d = null;
        return cVarMo27729b.f24628b;
    }

    public int size() {
        return this.f24626d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
