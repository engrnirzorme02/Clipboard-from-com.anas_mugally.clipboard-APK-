package p200a4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: a4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2210c {

    /* JADX INFO: renamed from: a */
    private final String f7152a;

    /* JADX INFO: renamed from: b */
    private final Set f7153b;

    /* JADX INFO: renamed from: c */
    private final Set f7154c;

    /* JADX INFO: renamed from: d */
    private final int f7155d;

    /* JADX INFO: renamed from: e */
    private final int f7156e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC2214g f7157f;

    /* JADX INFO: renamed from: g */
    private final Set f7158g;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m8961a(Object obj, InterfaceC2211d interfaceC2211d) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m8962b(Object obj, InterfaceC2211d interfaceC2211d) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static b m8963c(C2206E c2206e) {
        return new b(c2206e, new C2206E[0]);
    }

    /* JADX INFO: renamed from: d */
    public static b m8964d(C2206E c2206e, C2206E... c2206eArr) {
        return new b(c2206e, c2206eArr);
    }

    /* JADX INFO: renamed from: e */
    public static b m8965e(Class cls) {
        return new b(cls, new Class[0]);
    }

    /* JADX INFO: renamed from: f */
    public static b m8966f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    /* JADX INFO: renamed from: l */
    public static C2210c m8967l(final Object obj, Class cls) {
        return m8968m(cls).m8987f(new InterfaceC2214g() { // from class: a4.a
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return C2210c.m8962b(obj, interfaceC2211d);
            }
        }).m8985d();
    }

    /* JADX INFO: renamed from: m */
    public static b m8968m(Class cls) {
        return m8965e(cls).m8980g();
    }

    /* JADX INFO: renamed from: q */
    public static C2210c m8969q(final Object obj, Class cls, Class... clsArr) {
        return m8966f(cls, clsArr).m8987f(new InterfaceC2214g() { // from class: a4.b
            @Override // p200a4.InterfaceC2214g
            /* JADX INFO: renamed from: a */
            public final Object mo2117a(InterfaceC2211d interfaceC2211d) {
                return C2210c.m8961a(obj, interfaceC2211d);
            }
        }).m8985d();
    }

    /* JADX INFO: renamed from: g */
    public Set m8970g() {
        return this.f7154c;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC2214g m8971h() {
        return this.f7157f;
    }

    /* JADX INFO: renamed from: i */
    public String m8972i() {
        return this.f7152a;
    }

    /* JADX INFO: renamed from: j */
    public Set m8973j() {
        return this.f7153b;
    }

    /* JADX INFO: renamed from: k */
    public Set m8974k() {
        return this.f7158g;
    }

    /* JADX INFO: renamed from: n */
    public boolean m8975n() {
        return this.f7155d == 1;
    }

    /* JADX INFO: renamed from: o */
    public boolean m8976o() {
        return this.f7155d == 2;
    }

    /* JADX INFO: renamed from: p */
    public boolean m8977p() {
        return this.f7156e == 0;
    }

    /* JADX INFO: renamed from: r */
    public C2210c m8978r(InterfaceC2214g interfaceC2214g) {
        return new C2210c(this.f7152a, this.f7153b, this.f7154c, this.f7155d, this.f7156e, interfaceC2214g, this.f7158g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f7153b.toArray()) + ">{" + this.f7155d + ", type=" + this.f7156e + ", deps=" + Arrays.toString(this.f7154c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: a4.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f7159a;

        /* JADX INFO: renamed from: b */
        private final Set f7160b;

        /* JADX INFO: renamed from: c */
        private final Set f7161c;

        /* JADX INFO: renamed from: d */
        private int f7162d;

        /* JADX INFO: renamed from: e */
        private int f7163e;

        /* JADX INFO: renamed from: f */
        private InterfaceC2214g f7164f;

        /* JADX INFO: renamed from: g */
        private final Set f7165g;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public b m8980g() {
            this.f7163e = 1;
            return this;
        }

        /* JADX INFO: renamed from: i */
        private b m8981i(int i7) {
            AbstractC2205D.m8950d(this.f7162d == 0, "Instantiation type has already been set.");
            this.f7162d = i7;
            return this;
        }

        /* JADX INFO: renamed from: j */
        private void m8982j(C2206E c2206e) {
            AbstractC2205D.m8947a(!this.f7160b.contains(c2206e), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* JADX INFO: renamed from: b */
        public b m8983b(C2224q c2224q) {
            AbstractC2205D.m8949c(c2224q, "Null dependency");
            m8982j(c2224q.m9037c());
            this.f7161c.add(c2224q);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m8984c() {
            return m8981i(1);
        }

        /* JADX INFO: renamed from: d */
        public C2210c m8985d() {
            AbstractC2205D.m8950d(this.f7164f != null, "Missing required property: factory.");
            return new C2210c(this.f7159a, new HashSet(this.f7160b), new HashSet(this.f7161c), this.f7162d, this.f7163e, this.f7164f, this.f7165g);
        }

        /* JADX INFO: renamed from: e */
        public b m8986e() {
            return m8981i(2);
        }

        /* JADX INFO: renamed from: f */
        public b m8987f(InterfaceC2214g interfaceC2214g) {
            this.f7164f = (InterfaceC2214g) AbstractC2205D.m8949c(interfaceC2214g, "Null factory");
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m8988h(String str) {
            this.f7159a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f7159a = null;
            HashSet hashSet = new HashSet();
            this.f7160b = hashSet;
            this.f7161c = new HashSet();
            this.f7162d = 0;
            this.f7163e = 0;
            this.f7165g = new HashSet();
            AbstractC2205D.m8949c(cls, "Null interface");
            hashSet.add(C2206E.m8952b(cls));
            for (Class cls2 : clsArr) {
                AbstractC2205D.m8949c(cls2, "Null interface");
                this.f7160b.add(C2206E.m8952b(cls2));
            }
        }

        private b(C2206E c2206e, C2206E... c2206eArr) {
            this.f7159a = null;
            HashSet hashSet = new HashSet();
            this.f7160b = hashSet;
            this.f7161c = new HashSet();
            this.f7162d = 0;
            this.f7163e = 0;
            this.f7165g = new HashSet();
            AbstractC2205D.m8949c(c2206e, "Null interface");
            hashSet.add(c2206e);
            for (C2206E c2206e2 : c2206eArr) {
                AbstractC2205D.m8949c(c2206e2, "Null interface");
            }
            Collections.addAll(this.f7160b, c2206eArr);
        }
    }

    private C2210c(String str, Set set, Set set2, int i7, int i8, InterfaceC2214g interfaceC2214g, Set set3) {
        this.f7152a = str;
        this.f7153b = Collections.unmodifiableSet(set);
        this.f7154c = Collections.unmodifiableSet(set2);
        this.f7155d = i7;
        this.f7156e = i8;
        this.f7157f = interfaceC2214g;
        this.f7158g = Collections.unmodifiableSet(set3);
    }
}
