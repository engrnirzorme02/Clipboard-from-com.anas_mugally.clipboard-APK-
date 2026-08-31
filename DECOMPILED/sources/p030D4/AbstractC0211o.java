package p030D4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p334q4.C6835b;
import p350s4.AbstractC7009c;

/* JADX INFO: renamed from: D4.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0211o {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0210n m1085a(Object obj) {
        return m1086b(obj, AbstractC0214r.m1091a());
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0210n m1086b(Object obj, InterfaceC0210n interfaceC0210n) {
        HashMap map;
        try {
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                if (map2.containsKey(".priority")) {
                    interfaceC0210n = AbstractC0214r.m1093c(map2.get(".priority"));
                }
                if (map2.containsKey(".value")) {
                    obj = map2.get(".value");
                }
            }
            if (obj == null) {
                return C0203g.m1050w();
            }
            if (obj instanceof String) {
                return new C0216t((String) obj, interfaceC0210n);
            }
            if (obj instanceof Long) {
                return new C0208l((Long) obj, interfaceC0210n);
            }
            if (obj instanceof Integer) {
                return new C0208l(Long.valueOf(((Integer) obj).intValue()), interfaceC0210n);
            }
            if (obj instanceof Double) {
                return new C0202f((Double) obj, interfaceC0210n);
            }
            if (obj instanceof Boolean) {
                return new C0197a((Boolean) obj, interfaceC0210n);
            }
            if (!(obj instanceof Map) && !(obj instanceof List)) {
                throw new C6835b("Failed to parse node with class " + obj.getClass().toString());
            }
            if (obj instanceof Map) {
                Map map3 = (Map) obj;
                if (map3.containsKey(".sv")) {
                    return new C0201e(map3, interfaceC0210n);
                }
                map = new HashMap(map3.size());
                for (String str : map3.keySet()) {
                    if (!str.startsWith(".")) {
                        InterfaceC0210n interfaceC0210nM1085a = m1085a(map3.get(str));
                        if (!interfaceC0210nM1085a.isEmpty()) {
                            map.put(C0198b.m988j(str), interfaceC0210nM1085a);
                        }
                    }
                }
            } else {
                List list = (List) obj;
                map = new HashMap(list.size());
                for (int i7 = 0; i7 < list.size(); i7++) {
                    String str2 = "" + i7;
                    InterfaceC0210n interfaceC0210nM1085a2 = m1085a(list.get(i7));
                    if (!interfaceC0210nM1085a2.isEmpty()) {
                        map.put(C0198b.m988j(str2), interfaceC0210nM1085a2);
                    }
                }
            }
            return map.isEmpty() ? C0203g.m1050w() : new C0199c(AbstractC7009c.a.m30613d(map, C0199c.f879d), interfaceC0210n);
        } catch (ClassCastException e7) {
            throw new C6835b("Failed to parse node", e7);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1087c(C0198b c0198b, InterfaceC0210n interfaceC0210n, C0198b c0198b2, InterfaceC0210n interfaceC0210n2) {
        int iCompareTo = interfaceC0210n.compareTo(interfaceC0210n2);
        return iCompareTo != 0 ? iCompareTo : c0198b.compareTo(c0198b2);
    }
}
