package p030D4;

import p334q4.C6835b;
import p374v4.C7245j;

/* JADX INFO: renamed from: D4.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0214r {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0210n m1091a() {
        return C0203g.m1050w();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1092b(InterfaceC0210n interfaceC0210n) {
        if (interfaceC0210n.mo1006i().isEmpty()) {
            return interfaceC0210n.isEmpty() || (interfaceC0210n instanceof C0202f) || (interfaceC0210n instanceof C0216t) || (interfaceC0210n instanceof C0201e);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0210n m1093c(Object obj) {
        return m1094d(null, obj);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0210n m1094d(C7245j c7245j, Object obj) {
        String str;
        InterfaceC0210n interfaceC0210nM1085a = AbstractC0211o.m1085a(obj);
        if (interfaceC0210nM1085a instanceof C0208l) {
            interfaceC0210nM1085a = new C0202f(Double.valueOf(((Long) interfaceC0210nM1085a.getValue()).longValue()), m1091a());
        }
        if (m1092b(interfaceC0210nM1085a)) {
            return interfaceC0210nM1085a;
        }
        StringBuilder sb = new StringBuilder();
        if (c7245j != null) {
            str = "Path '" + c7245j + "'";
        } else {
            str = "Node";
        }
        sb.append(str);
        sb.append(" contains invalid priority: Must be a string, double, ServerValue, or null");
        throw new C6835b(sb.toString());
    }
}
