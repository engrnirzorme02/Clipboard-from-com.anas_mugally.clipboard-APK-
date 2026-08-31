package p048F6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.AbstractC0098f;
import p016B6.AbstractC0099g;
import p016B6.InterfaceC0096d;
import p040E6.AbstractC0393b;
import p040E6.AbstractC0399h;
import p040E6.InterfaceC0397f;
import p040E6.InterfaceC0398g;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: F6.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0458s {

    /* JADX INFO: renamed from: a */
    private static final C0450k.a f1728a = new C0450k.a();

    /* JADX INFO: renamed from: b */
    private static final C0450k.a f1729b = new C0450k.a();

    /* JADX INFO: renamed from: b */
    private static final Map m1972b(InterfaceC0096d interfaceC0096d, AbstractC0393b abstractC0393b) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zM1974d = m1974d(abstractC0393b, interfaceC0096d);
        m1980j(interfaceC0096d, abstractC0393b);
        int iMo375f = interfaceC0096d.mo375f();
        for (int i7 = 0; i7 < iMo375f; i7++) {
            List listMo377h = interfaceC0096d.mo377h(i7);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listMo377h) {
                if (obj instanceof InterfaceC0397f) {
                    arrayList.add(obj);
                }
            }
            InterfaceC0397f interfaceC0397f = (InterfaceC0397f) AbstractC1638q.m6586Z(arrayList);
            if (interfaceC0397f != null && (strArrNames = interfaceC0397f.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zM1974d) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        AbstractC6118n.m27186d(lowerCase2, "toLowerCase(...)");
                    }
                    m1973c(linkedHashMap, interfaceC0096d, lowerCase2, i7);
                }
            }
            if (zM1974d) {
                lowerCase = interfaceC0096d.mo376g(i7).toLowerCase(Locale.ROOT);
                AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                m1973c(linkedHashMap, interfaceC0096d, lowerCase, i7);
            }
        }
        return linkedHashMap.isEmpty() ? AbstractC1610H.m6626h() : linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    private static final void m1973c(Map map, InterfaceC0096d interfaceC0096d, String str, int i7) {
        String str2 = AbstractC6118n.m27183a(interfaceC0096d.mo374e(), AbstractC0098f.b.f526a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i7));
            return;
        }
        throw new C0455p("The suggested name '" + str + "' for " + str2 + ' ' + interfaceC0096d.mo376g(i7) + " is already one of the names for " + str2 + ' ' + interfaceC0096d.mo376g(((Number) AbstractC1610H.m6627i(map, str)).intValue()) + " in " + interfaceC0096d);
    }

    /* JADX INFO: renamed from: d */
    private static final boolean m1974d(AbstractC0393b abstractC0393b, InterfaceC0096d interfaceC0096d) {
        return abstractC0393b.m1673c().m1683h() && AbstractC6118n.m27183a(interfaceC0096d.mo374e(), AbstractC0098f.b.f526a);
    }

    /* JADX INFO: renamed from: e */
    public static final Map m1975e(final AbstractC0393b abstractC0393b, final InterfaceC0096d descriptor) {
        AbstractC6118n.m27187e(abstractC0393b, "<this>");
        AbstractC6118n.m27187e(descriptor, "descriptor");
        return (Map) AbstractC0399h.m1694a(abstractC0393b).m1950b(descriptor, f1728a, new InterfaceC5356a() { // from class: F6.r
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AbstractC0458s.m1976f(descriptor, abstractC0393b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Map m1976f(InterfaceC0096d interfaceC0096d, AbstractC0393b abstractC0393b) {
        return m1972b(interfaceC0096d, abstractC0393b);
    }

    /* JADX INFO: renamed from: g */
    public static final String m1977g(InterfaceC0096d interfaceC0096d, AbstractC0393b json, int i7) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(json, "json");
        m1980j(interfaceC0096d, json);
        return interfaceC0096d.mo376g(i7);
    }

    /* JADX INFO: renamed from: h */
    public static final int m1978h(InterfaceC0096d interfaceC0096d, AbstractC0393b json, String name) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(name, "name");
        if (m1974d(json, interfaceC0096d)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC6118n.m27186d(lowerCase, "toLowerCase(...)");
            return m1979i(interfaceC0096d, json, lowerCase);
        }
        m1980j(interfaceC0096d, json);
        int iMo373d = interfaceC0096d.mo373d(name);
        return (iMo373d == -3 && json.m1673c().m1690o()) ? m1979i(interfaceC0096d, json, name) : iMo373d;
    }

    /* JADX INFO: renamed from: i */
    private static final int m1979i(InterfaceC0096d interfaceC0096d, AbstractC0393b abstractC0393b, String str) {
        Integer num = (Integer) m1975e(abstractC0393b, interfaceC0096d).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0398g m1980j(InterfaceC0096d interfaceC0096d, AbstractC0393b json) {
        AbstractC6118n.m27187e(interfaceC0096d, "<this>");
        AbstractC6118n.m27187e(json, "json");
        if (AbstractC6118n.m27183a(interfaceC0096d.mo374e(), AbstractC0099g.a.f527a)) {
            json.m1673c().m1687l();
        }
        return null;
    }
}
