package p145S5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: S5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1436n implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final a f4958b = new a(null);

    /* JADX INFO: renamed from: a */
    private final Object f4959a;

    /* JADX INFO: renamed from: S5.n$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: S5.n$b */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a */
        public final Throwable f4960a;

        public b(Throwable exception) {
            AbstractC6118n.m27187e(exception, "exception");
            this.f4960a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && AbstractC6118n.m27183a(this.f4960a, ((b) obj).f4960a);
        }

        public int hashCode() {
            return this.f4960a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f4960a + ')';
        }
    }

    private /* synthetic */ C1436n(Object obj) {
        this.f4959a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C1436n m6072a(Object obj) {
        return new C1436n(obj);
    }

    /* JADX INFO: renamed from: b */
    public static Object m6073b(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6074c(Object obj, Object obj2) {
        return (obj2 instanceof C1436n) && AbstractC6118n.m27183a(obj, ((C1436n) obj2).m6080i());
    }

    /* JADX INFO: renamed from: d */
    public static final Throwable m6075d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f4960a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static int m6076e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m6077f(Object obj) {
        return obj instanceof b;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m6078g(Object obj) {
        return !(obj instanceof b);
    }

    /* JADX INFO: renamed from: h */
    public static String m6079h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m6074c(this.f4959a, obj);
    }

    public int hashCode() {
        return m6076e(this.f4959a);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object m6080i() {
        return this.f4959a;
    }

    public String toString() {
        return m6079h(this.f4959a);
    }
}
