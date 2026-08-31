package p390x4;

import p030D4.C0198b;
import p374v4.C7245j;
import p398y4.C7543d;
import p398y4.InterfaceC7548i;

/* JADX INFO: renamed from: x4.g */
/* JADX INFO: loaded from: classes.dex */
public class C7412g {

    /* JADX INFO: renamed from: b */
    private static final InterfaceC7548i f29661b = new a();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC7548i f29662c = new b();

    /* JADX INFO: renamed from: d */
    private static final C7543d f29663d = new C7543d(Boolean.TRUE);

    /* JADX INFO: renamed from: e */
    private static final C7543d f29664e = new C7543d(Boolean.FALSE);

    /* JADX INFO: renamed from: a */
    private final C7543d f29665a;

    /* JADX INFO: renamed from: x4.g$a */
    class a implements InterfaceC7548i {
        a() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: x4.g$b */
    class b implements InterfaceC7548i {
        b() {
        }

        @Override // p398y4.InterfaceC7548i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean mo31917a(Boolean bool) {
            return bool.booleanValue();
        }
    }

    /* JADX INFO: renamed from: x4.g$c */
    class c implements C7543d.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C7543d.c f29666a;

        c(C7543d.c cVar) {
            this.f29666a = cVar;
        }

        @Override // p398y4.C7543d.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object mo30316a(C7245j c7245j, Boolean bool, Object obj) {
            return !bool.booleanValue() ? this.f29666a.mo30316a(c7245j, null, obj) : obj;
        }
    }

    public C7412g() {
        this.f29665a = C7543d.m33187b();
    }

    /* JADX INFO: renamed from: a */
    public C7412g m32750a(C0198b c0198b) {
        C7543d c7543dM33198p = this.f29665a.m33198p(c0198b);
        if (c7543dM33198p == null) {
            c7543dM33198p = new C7543d((Boolean) this.f29665a.getValue());
        } else if (c7543dM33198p.getValue() == null && this.f29665a.getValue() != null) {
            c7543dM33198p = c7543dM33198p.m33204z(C7245j.m31994y(), (Boolean) this.f29665a.getValue());
        }
        return new C7412g(c7543dM33198p);
    }

    /* JADX INFO: renamed from: b */
    public Object m32751b(Object obj, C7543d.c cVar) {
        return this.f29665a.m33195j(obj, new c(cVar));
    }

    /* JADX INFO: renamed from: c */
    public C7412g m32752c(C7245j c7245j) {
        return this.f29665a.m33203y(c7245j, f29661b) != null ? this : new C7412g(this.f29665a.m33189A(c7245j, f29664e));
    }

    /* JADX INFO: renamed from: d */
    public C7412g m32753d(C7245j c7245j) {
        if (this.f29665a.m33203y(c7245j, f29661b) == null) {
            return this.f29665a.m33203y(c7245j, f29662c) != null ? this : new C7412g(this.f29665a.m33189A(c7245j, f29663d));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    /* JADX INFO: renamed from: e */
    public boolean m32754e() {
        return this.f29665a.m33192a(f29662c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7412g) && this.f29665a.equals(((C7412g) obj).f29665a);
    }

    /* JADX INFO: renamed from: f */
    public boolean m32755f(C7245j c7245j) {
        Boolean bool = (Boolean) this.f29665a.m33200v(c7245j);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public boolean m32756g(C7245j c7245j) {
        Boolean bool = (Boolean) this.f29665a.m33200v(c7245j);
        return bool != null && bool.booleanValue();
    }

    public int hashCode() {
        return this.f29665a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.f29665a.toString() + "}";
    }

    private C7412g(C7543d c7543d) {
        this.f29665a = c7543d;
    }
}
