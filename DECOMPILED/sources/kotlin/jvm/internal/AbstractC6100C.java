package kotlin.jvm.internal;

import p286k6.InterfaceC6077c;
import p286k6.InterfaceC6078d;
import p286k6.InterfaceC6079e;
import p286k6.InterfaceC6080f;
import p286k6.InterfaceC6081g;
import p286k6.InterfaceC6082h;

/* JADX INFO: renamed from: kotlin.jvm.internal.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6100C {

    /* JADX INFO: renamed from: a */
    private static final C6101D f23860a;

    /* JADX INFO: renamed from: b */
    private static final InterfaceC6077c[] f23861b;

    static {
        C6101D c6101d = null;
        try {
            c6101d = (C6101D) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c6101d == null) {
            c6101d = new C6101D();
        }
        f23860a = c6101d;
        f23861b = new InterfaceC6077c[0];
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC6079e m27138a(AbstractC6115k abstractC6115k) {
        return f23860a.m27146a(abstractC6115k);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6077c m27139b(Class cls) {
        return f23860a.m27147b(cls);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC6078d m27140c(Class cls) {
        return f23860a.m27148c(cls, "");
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC6080f m27141d(AbstractC6121q abstractC6121q) {
        return f23860a.m27149d(abstractC6121q);
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC6081g m27142e(AbstractC6123s abstractC6123s) {
        return f23860a.m27150e(abstractC6123s);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC6082h m27143f(AbstractC6125u abstractC6125u) {
        return f23860a.m27151f(abstractC6125u);
    }

    /* JADX INFO: renamed from: g */
    public static String m27144g(InterfaceC6114j interfaceC6114j) {
        return f23860a.m27152g(interfaceC6114j);
    }

    /* JADX INFO: renamed from: h */
    public static String m27145h(AbstractC6119o abstractC6119o) {
        return f23860a.m27153h(abstractC6119o);
    }
}
