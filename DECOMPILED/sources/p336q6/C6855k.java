package p336q6;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: q6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C6855k {

    /* JADX INFO: renamed from: b */
    public static final b f27480b = new b(null);

    /* JADX INFO: renamed from: c */
    private static final c f27481c = new c();

    /* JADX INFO: renamed from: a */
    private final Object f27482a;

    /* JADX INFO: renamed from: q6.k$a */
    public static final class a extends c {

        /* JADX INFO: renamed from: a */
        public final Throwable f27483a;

        public a(Throwable th) {
            this.f27483a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC6118n.m27183a(this.f27483a, ((a) obj).f27483a);
        }

        public int hashCode() {
            Throwable th = this.f27483a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // p336q6.C6855k.c
        public String toString() {
            return "Closed(" + this.f27483a + ')';
        }
    }

    /* JADX INFO: renamed from: q6.k$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Object m30042a(Throwable th) {
            return C6855k.m30033c(new a(th));
        }

        /* JADX INFO: renamed from: b */
        public final Object m30043b() {
            return C6855k.m30033c(C6855k.f27481c);
        }

        /* JADX INFO: renamed from: c */
        public final Object m30044c(Object obj) {
            return C6855k.m30033c(obj);
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: q6.k$c */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ C6855k(Object obj) {
        this.f27482a = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C6855k m30032b(Object obj) {
        return new C6855k(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Object m30033c(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m30034d(Object obj, Object obj2) {
        return (obj2 instanceof C6855k) && AbstractC6118n.m27183a(obj, ((C6855k) obj2).m30041k());
    }

    /* JADX INFO: renamed from: e */
    public static final Throwable m30035e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f27483a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final Object m30036f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public static int m30037g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m30038h(Object obj) {
        return obj instanceof a;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m30039i(Object obj) {
        return !(obj instanceof c);
    }

    /* JADX INFO: renamed from: j */
    public static String m30040j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m30034d(this.f27482a, obj);
    }

    public int hashCode() {
        return m30037g(this.f27482a);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object m30041k() {
        return this.f27482a;
    }

    public String toString() {
        return m30040j(this.f27482a);
    }
}
