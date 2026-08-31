package p030D4;

import java.util.Comparator;
import p374v4.C7245j;

/* JADX INFO: renamed from: D4.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204h implements Comparator {
    /* JADX INFO: renamed from: b */
    public static AbstractC0204h m1052b(String str) {
        if (str.equals(".value")) {
            return C0217u.m1099j();
        }
        if (str.equals(".key")) {
            return C0206j.m1071j();
        }
        if (str.equals(".priority")) {
            throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
        }
        return new C0212p(new C7245j(str));
    }

    /* JADX INFO: renamed from: a */
    public int m1053a(C0209m c0209m, C0209m c0209m2, boolean z7) {
        return z7 ? compare(c0209m2, c0209m) : compare(c0209m, c0209m2);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo1054c();

    /* JADX INFO: renamed from: d */
    public boolean m1055d(InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2) {
        return compare(new C0209m(C0198b.m990m(), interfaceC0210n), new C0209m(C0198b.m990m(), interfaceC0210n2)) != 0;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1056e(InterfaceC0210n interfaceC0210n);

    /* JADX INFO: renamed from: f */
    public abstract C0209m mo1057f(C0198b c0198b, InterfaceC0210n interfaceC0210n);

    /* JADX INFO: renamed from: g */
    public abstract C0209m mo1058g();

    /* JADX INFO: renamed from: h */
    public C0209m m1059h() {
        return C0209m.m1081b();
    }
}
