package p350s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: s4.k */
/* JADX INFO: loaded from: classes.dex */
public class C7017k extends AbstractC7009c {

    /* JADX INFO: renamed from: a */
    private InterfaceC7014h f28036a;

    /* JADX INFO: renamed from: b */
    private Comparator f28037b;

    /* JADX INFO: renamed from: s4.k$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final List f28038a;

        /* JADX INFO: renamed from: b */
        private final Map f28039b;

        /* JADX INFO: renamed from: c */
        private final AbstractC7009c.a.InterfaceC7722a f28040c;

        /* JADX INFO: renamed from: d */
        private AbstractC7016j f28041d;

        /* JADX INFO: renamed from: e */
        private AbstractC7016j f28042e;

        /* JADX INFO: renamed from: s4.k$b$a */
        static class a implements Iterable {

            /* JADX INFO: renamed from: a */
            private long f28043a;

            /* JADX INFO: renamed from: b */
            private final int f28044b;

            /* JADX INFO: renamed from: s4.k$b$a$a, reason: collision with other inner class name */
            class C7723a implements Iterator {

                /* JADX INFO: renamed from: a */
                private int f28045a;

                C7723a() {
                    this.f28045a = a.this.f28044b - 1;
                }

                @Override // java.util.Iterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public C7724b next() {
                    long j7 = a.this.f28043a & ((long) (1 << this.f28045a));
                    C7724b c7724b = new C7724b();
                    c7724b.f28047a = j7 == 0;
                    c7724b.f28048b = (int) Math.pow(2.0d, this.f28045a);
                    this.f28045a--;
                    return c7724b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f28045a >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public a(int i7) {
                int i8 = i7 + 1;
                int iFloor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
                this.f28044b = iFloor;
                this.f28043a = (((long) Math.pow(2.0d, iFloor)) - 1) & ((long) i8);
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C7723a();
            }
        }

        /* JADX INFO: renamed from: s4.k$b$b, reason: collision with other inner class name */
        static class C7724b {

            /* JADX INFO: renamed from: a */
            public boolean f28047a;

            /* JADX INFO: renamed from: b */
            public int f28048b;

            C7724b() {
            }
        }

        private b(List list, Map map, AbstractC7009c.a.InterfaceC7722a interfaceC7722a) {
            this.f28038a = list;
            this.f28039b = map;
            this.f28040c = interfaceC7722a;
        }

        /* JADX INFO: renamed from: a */
        private InterfaceC7014h m30649a(int i7, int i8) {
            if (i8 == 0) {
                return C7013g.m30628j();
            }
            if (i8 == 1) {
                Object obj = this.f28038a.get(i7);
                return new C7012f(obj, m30652d(obj), null, null);
            }
            int i9 = i8 / 2;
            int i10 = i7 + i9;
            InterfaceC7014h interfaceC7014hM30649a = m30649a(i7, i9);
            InterfaceC7014h interfaceC7014hM30649a2 = m30649a(i10 + 1, i9);
            Object obj2 = this.f28038a.get(i10);
            return new C7012f(obj2, m30652d(obj2), interfaceC7014hM30649a, interfaceC7014hM30649a2);
        }

        /* JADX INFO: renamed from: b */
        public static C7017k m30650b(List list, Map map, AbstractC7009c.a.InterfaceC7722a interfaceC7722a, Comparator comparator) {
            b bVar = new b(list, map, interfaceC7722a);
            Collections.sort(list, comparator);
            int size = list.size();
            for (C7724b c7724b : new a(list.size())) {
                int i7 = c7724b.f28048b;
                size -= i7;
                if (c7724b.f28047a) {
                    bVar.m30651c(InterfaceC7014h.a.BLACK, i7, size);
                } else {
                    bVar.m30651c(InterfaceC7014h.a.BLACK, i7, size);
                    int i8 = c7724b.f28048b;
                    size -= i8;
                    bVar.m30651c(InterfaceC7014h.a.RED, i8, size);
                }
            }
            InterfaceC7014h interfaceC7014hM30628j = bVar.f28041d;
            if (interfaceC7014hM30628j == null) {
                interfaceC7014hM30628j = C7013g.m30628j();
            }
            return new C7017k(interfaceC7014hM30628j, comparator);
        }

        /* JADX INFO: renamed from: c */
        private void m30651c(InterfaceC7014h.a aVar, int i7, int i8) {
            InterfaceC7014h interfaceC7014hM30649a = m30649a(i8 + 1, i7 - 1);
            Object obj = this.f28038a.get(i8);
            AbstractC7016j c7015i = aVar == InterfaceC7014h.a.RED ? new C7015i(obj, m30652d(obj), null, interfaceC7014hM30649a) : new C7012f(obj, m30652d(obj), null, interfaceC7014hM30649a);
            if (this.f28041d == null) {
                this.f28041d = c7015i;
                this.f28042e = c7015i;
            } else {
                this.f28042e.mo30627u(c7015i);
                this.f28042e = c7015i;
            }
        }

        /* JADX INFO: renamed from: d */
        private Object m30652d(Object obj) {
            return this.f28039b.get(this.f28040c.mo30609a(obj));
        }
    }

    /* JADX INFO: renamed from: v */
    public static C7017k m30646v(List list, Map map, AbstractC7009c.a.InterfaceC7722a interfaceC7722a, Comparator comparator) {
        return b.m30650b(list, map, interfaceC7722a, comparator);
    }

    /* JADX INFO: renamed from: w */
    public static C7017k m30647w(Map map, Comparator comparator) {
        return b.m30650b(new ArrayList(map.keySet()), map, AbstractC7009c.a.m30614e(), comparator);
    }

    /* JADX INFO: renamed from: x */
    private InterfaceC7014h m30648x(Object obj) {
        InterfaceC7014h interfaceC7014hMo30629a = this.f28036a;
        while (!interfaceC7014hMo30629a.isEmpty()) {
            int iCompare = this.f28037b.compare(obj, interfaceC7014hMo30629a.getKey());
            if (iCompare < 0) {
                interfaceC7014hMo30629a = interfaceC7014hMo30629a.mo30629a();
            } else {
                if (iCompare == 0) {
                    return interfaceC7014hMo30629a;
                }
                interfaceC7014hMo30629a = interfaceC7014hMo30629a.mo30634g();
            }
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: Q */
    public Iterator mo30597Q() {
        return new C7010d(this.f28036a, null, this.f28037b, true);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: a */
    public boolean mo30598a(Object obj) {
        return m30648x(obj) != null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: b */
    public Object mo30599b(Object obj) {
        InterfaceC7014h interfaceC7014hM30648x = m30648x(obj);
        if (interfaceC7014hM30648x != null) {
            return interfaceC7014hM30648x.getValue();
        }
        return null;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: e */
    public Comparator mo30600e() {
        return this.f28037b;
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: g */
    public Object mo30601g() {
        return this.f28036a.mo30636i().getKey();
    }

    @Override // p350s4.AbstractC7009c
    public boolean isEmpty() {
        return this.f28036a.isEmpty();
    }

    @Override // p350s4.AbstractC7009c, java.lang.Iterable
    public Iterator iterator() {
        return new C7010d(this.f28036a, null, this.f28037b, false);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: j */
    public Object mo30602j() {
        return this.f28036a.mo30635h().getKey();
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: k */
    public Object mo30603k(Object obj) {
        InterfaceC7014h interfaceC7014hMo30629a = this.f28036a;
        InterfaceC7014h interfaceC7014h = null;
        while (!interfaceC7014hMo30629a.isEmpty()) {
            int iCompare = this.f28037b.compare(obj, interfaceC7014hMo30629a.getKey());
            if (iCompare == 0) {
                if (interfaceC7014hMo30629a.mo30629a().isEmpty()) {
                    if (interfaceC7014h != null) {
                        return interfaceC7014h.getKey();
                    }
                    return null;
                }
                InterfaceC7014h interfaceC7014hMo30629a2 = interfaceC7014hMo30629a.mo30629a();
                while (!interfaceC7014hMo30629a2.mo30634g().isEmpty()) {
                    interfaceC7014hMo30629a2 = interfaceC7014hMo30629a2.mo30634g();
                }
                return interfaceC7014hMo30629a2.getKey();
            }
            if (iCompare < 0) {
                interfaceC7014hMo30629a = interfaceC7014hMo30629a.mo30629a();
            } else {
                interfaceC7014h = interfaceC7014hMo30629a;
                interfaceC7014hMo30629a = interfaceC7014hMo30629a.mo30634g();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: m */
    public void mo30604m(InterfaceC7014h.b bVar) {
        this.f28036a.mo30633e(bVar);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: n */
    public AbstractC7009c mo30605n(Object obj, Object obj2) {
        return new C7017k(this.f28036a.mo30630b(obj, obj2, this.f28037b).mo30631c(null, null, InterfaceC7014h.a.BLACK, null, null), this.f28037b);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: p */
    public Iterator mo30606p(Object obj) {
        return new C7010d(this.f28036a, obj, this.f28037b, false);
    }

    @Override // p350s4.AbstractC7009c
    /* JADX INFO: renamed from: q */
    public AbstractC7009c mo30607q(Object obj) {
        return !mo30598a(obj) ? this : new C7017k(this.f28036a.mo30632d(obj, this.f28037b).mo30631c(null, null, InterfaceC7014h.a.BLACK, null, null), this.f28037b);
    }

    @Override // p350s4.AbstractC7009c
    public int size() {
        return this.f28036a.size();
    }

    private C7017k(InterfaceC7014h interfaceC7014h, Comparator comparator) {
        this.f28036a = interfaceC7014h;
        this.f28037b = comparator;
    }
}
