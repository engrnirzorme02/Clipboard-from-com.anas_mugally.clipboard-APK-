package kotlin.jvm.internal;

import java.util.List;
import java.util.Map;
import p145S5.InterfaceC1425c;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p238e6.InterfaceC5373r;
import p246f6.InterfaceC5442a;
import p246f6.InterfaceC5443b;
import p246f6.InterfaceC5444c;
import p246f6.InterfaceC5445d;

/* JADX INFO: renamed from: kotlin.jvm.internal.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6104G {
    /* JADX INFO: renamed from: a */
    public static Iterable m27158a(Object obj) {
        if ((obj instanceof InterfaceC5442a) && !(obj instanceof InterfaceC5443b)) {
            m27169l(obj, "kotlin.collections.MutableIterable");
        }
        return m27162e(obj);
    }

    /* JADX INFO: renamed from: b */
    public static List m27159b(Object obj) {
        if ((obj instanceof InterfaceC5442a) && !(obj instanceof InterfaceC5444c)) {
            m27169l(obj, "kotlin.collections.MutableList");
        }
        return m27163f(obj);
    }

    /* JADX INFO: renamed from: c */
    public static Map m27160c(Object obj) {
        if ((obj instanceof InterfaceC5442a) && !(obj instanceof InterfaceC5445d)) {
            m27169l(obj, "kotlin.collections.MutableMap");
        }
        return m27164g(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Object m27161d(Object obj, int i7) {
        if (obj != null && !m27166i(obj, i7)) {
            m27169l(obj, "kotlin.jvm.functions.Function" + i7);
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public static Iterable m27162e(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e7) {
            throw m27168k(e7);
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m27163f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e7) {
            throw m27168k(e7);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map m27164g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e7) {
            throw m27168k(e7);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m27165h(Object obj) {
        if (obj instanceof InterfaceC6114j) {
            return ((InterfaceC6114j) obj).getArity();
        }
        if (obj instanceof InterfaceC5356a) {
            return 0;
        }
        if (obj instanceof InterfaceC5367l) {
            return 1;
        }
        if (obj instanceof InterfaceC5371p) {
            return 2;
        }
        if (obj instanceof InterfaceC5372q) {
            return 3;
        }
        return obj instanceof InterfaceC5373r ? 4 : -1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27166i(Object obj, int i7) {
        return (obj instanceof InterfaceC1425c) && m27165h(obj) == i7;
    }

    /* JADX INFO: renamed from: j */
    private static Throwable m27167j(Throwable th) {
        return AbstractC6118n.m27192j(th, AbstractC6104G.class.getName());
    }

    /* JADX INFO: renamed from: k */
    public static ClassCastException m27168k(ClassCastException classCastException) {
        throw ((ClassCastException) m27167j(classCastException));
    }

    /* JADX INFO: renamed from: l */
    public static void m27169l(Object obj, String str) {
        m27170m((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* JADX INFO: renamed from: m */
    public static void m27170m(String str) {
        throw m27168k(new ClassCastException(str));
    }
}
