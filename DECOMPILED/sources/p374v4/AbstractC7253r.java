package p374v4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p030D4.AbstractC0211o;
import p030D4.AbstractC0214r;
import p030D4.C0198b;
import p030D4.C0199c;
import p030D4.InterfaceC0210n;
import p398y4.AbstractC7551l;
import p398y4.InterfaceC7540a;

/* JADX INFO: renamed from: v4.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7253r {

    /* JADX INFO: renamed from: v4.r$a */
    class a extends C0199c.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC7233D f28965a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Map f28966b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C7254s f28967c;

        a(AbstractC7233D abstractC7233D, Map map, C7254s c7254s) {
            this.f28965a = abstractC7233D;
            this.f28966b = map;
            this.f28967c = c7254s;
        }

        @Override // p030D4.C0199c.c
        /* JADX INFO: renamed from: b */
        public void mo1019b(C0198b c0198b, InterfaceC0210n interfaceC0210n) {
            InterfaceC0210n interfaceC0210nM32098i = AbstractC7253r.m32098i(interfaceC0210n, this.f28965a.mo31901a(c0198b), this.f28966b);
            if (interfaceC0210nM32098i != interfaceC0210n) {
                this.f28967c.m32102c(new C7245j(c0198b.m992d()), interfaceC0210nM32098i);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m32091b(Number number) {
        return ((number instanceof Double) || (number instanceof Float)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public static Map m32092c(InterfaceC7540a interfaceC7540a) {
        HashMap map = new HashMap();
        map.put("timestamp", Long.valueOf(interfaceC7540a.mo33182a()));
        return map;
    }

    /* JADX INFO: renamed from: d */
    static Object m32093d(Map map, AbstractC7233D abstractC7233D, Map map2) {
        if (!map.containsKey("increment")) {
            return null;
        }
        Object obj = map.get("increment");
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        InterfaceC0210n interfaceC0210nMo31902b = abstractC7233D.mo31902b();
        if (!interfaceC0210nMo31902b.mo1000H() || !(interfaceC0210nMo31902b.getValue() instanceof Number)) {
            return number;
        }
        Number number2 = (Number) interfaceC0210nMo31902b.getValue();
        if (m32091b(number) && m32091b(number2)) {
            long jLongValue = number.longValue();
            long jLongValue2 = number2.longValue();
            long j7 = jLongValue + jLongValue2;
            if (((jLongValue ^ j7) & (jLongValue2 ^ j7)) >= 0) {
                return Long.valueOf(j7);
            }
        }
        return Double.valueOf(number.doubleValue() + number2.doubleValue());
    }

    /* JADX INFO: renamed from: e */
    public static Object m32094e(Object obj, AbstractC7233D abstractC7233D, Map map) {
        Object objM32093d;
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (map2.containsKey(".sv")) {
            Object obj2 = map2.get(".sv");
            if (obj2 instanceof String) {
                objM32093d = m32099j((String) obj2, map);
            } else {
                objM32093d = obj2 instanceof Map ? m32093d((Map) obj2, abstractC7233D, map) : null;
            }
            if (objM32093d != null) {
                return objM32093d;
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: f */
    public static C7236a m32095f(C7236a c7236a, C7258w c7258w, C7245j c7245j, Map map) {
        C7236a c7236aM31930n = C7236a.m31930n();
        Iterator it = c7236a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c7236aM31930n = c7236aM31930n.m31935b((C7245j) entry.getKey(), m32098i((InterfaceC0210n) entry.getValue(), new AbstractC7233D.a(c7258w, c7245j.m32000q((C7245j) entry.getKey())), map));
        }
        return c7236aM31930n;
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC0210n m32096g(InterfaceC0210n interfaceC0210n, InterfaceC0210n interfaceC0210n2, Map map) {
        return m32098i(interfaceC0210n, new AbstractC7233D.b(interfaceC0210n2), map);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC0210n m32097h(InterfaceC0210n interfaceC0210n, C7258w c7258w, C7245j c7245j, Map map) {
        return m32098i(interfaceC0210n, new AbstractC7233D.a(c7258w, c7245j), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static InterfaceC0210n m32098i(InterfaceC0210n interfaceC0210n, AbstractC7233D abstractC7233D, Map map) {
        Object value = interfaceC0210n.mo1006i().getValue();
        Object objM32094e = m32094e(value, abstractC7233D.mo31901a(C0198b.m988j(".priority")), map);
        if (interfaceC0210n.mo1000H()) {
            Object objM32094e2 = m32094e(interfaceC0210n.getValue(), abstractC7233D, map);
            if (!objM32094e2.equals(interfaceC0210n.getValue()) || !AbstractC7551l.m33231d(objM32094e, value)) {
                return AbstractC0211o.m1086b(objM32094e2, AbstractC0214r.m1093c(objM32094e));
            }
        } else if (!interfaceC0210n.isEmpty()) {
            C0199c c0199c = (C0199c) interfaceC0210n;
            C7254s c7254s = new C7254s(c0199c);
            c0199c.m1009m(new a(abstractC7233D, map, c7254s));
            return !c7254s.m32101b().mo1006i().equals(objM32094e) ? c7254s.m32101b().mo981G(AbstractC0214r.m1093c(objM32094e)) : c7254s.m32101b();
        }
        return interfaceC0210n;
    }

    /* JADX INFO: renamed from: j */
    static Object m32099j(String str, Map map) {
        if ("timestamp".equals(str) && map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }
}
