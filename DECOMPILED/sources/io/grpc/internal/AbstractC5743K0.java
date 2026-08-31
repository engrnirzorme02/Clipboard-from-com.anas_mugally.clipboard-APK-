package io.grpc.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p063H5.AbstractC0524T;
import p063H5.AbstractC0536c0;
import p063H5.C0525U;
import p063H5.C0554l0;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;
import p122P3.AbstractC1219w;
import p122P3.C1220x;

/* JADX INFO: renamed from: io.grpc.internal.K0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5743K0 {

    /* JADX INFO: renamed from: io.grpc.internal.K0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f22198a;

        /* JADX INFO: renamed from: b */
        private final Map f22199b;

        public a(String str, Map map) {
            this.f22198a = (String) AbstractC1209m.m5303o(str, "policyName");
            this.f22199b = (Map) AbstractC1209m.m5303o(map, "rawConfigValue");
        }

        /* JADX INFO: renamed from: a */
        public String m25628a() {
            return this.f22198a;
        }

        /* JADX INFO: renamed from: b */
        public Map m25629b() {
            return this.f22199b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f22198a.equals(aVar.f22198a) && this.f22199b.equals(aVar.f22199b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f22198a, this.f22199b);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("policyName", this.f22198a).m5277d("rawConfigValue", this.f22199b).toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.K0$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        final AbstractC0524T f22200a;

        /* JADX INFO: renamed from: b */
        final Object f22201b;

        public b(AbstractC0524T abstractC0524T, Object obj) {
            this.f22200a = (AbstractC0524T) AbstractC1209m.m5303o(abstractC0524T, "provider");
            this.f22201b = obj;
        }

        /* JADX INFO: renamed from: a */
        public Object m25630a() {
            return this.f22201b;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC0524T m25631b() {
            return this.f22200a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (AbstractC1205i.m5282a(this.f22200a, bVar.f22200a) && AbstractC1205i.m5282a(this.f22201b, bVar.f22201b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC1205i.m5283b(this.f22200a, this.f22201b);
        }

        public String toString() {
            return AbstractC1203g.m5267b(this).m5277d("provider", this.f22200a).m5277d("config", this.f22201b).toString();
        }
    }

    /* JADX INFO: renamed from: A */
    public static List m25601A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m25627z((Map) it.next()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: a */
    static Double m25602a(Map map) {
        return AbstractC5775c0.m25879h(map, "backoffMultiplier");
    }

    /* JADX INFO: renamed from: b */
    public static Map m25603b(Map map) {
        if (map == null) {
            return null;
        }
        return AbstractC5775c0.m25881j(map, "healthCheckConfig");
    }

    /* JADX INFO: renamed from: c */
    static Long m25604c(Map map) {
        return AbstractC5775c0.m25883l(map, "hedgingDelay");
    }

    /* JADX INFO: renamed from: d */
    static Map m25605d(Map map) {
        return AbstractC5775c0.m25881j(map, "hedgingPolicy");
    }

    /* JADX INFO: renamed from: e */
    static Long m25606e(Map map) {
        return AbstractC5775c0.m25883l(map, "initialBackoff");
    }

    /* JADX INFO: renamed from: f */
    private static Set m25607f(Map map, String str) {
        List listM25876e = AbstractC5775c0.m25876e(map, str);
        if (listM25876e == null) {
            return null;
        }
        return m25622u(listM25876e);
    }

    /* JADX INFO: renamed from: g */
    public static List m25608g(Map map) {
        String strM25882k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(AbstractC5775c0.m25877f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strM25882k = AbstractC5775c0.m25882k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strM25882k.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: h */
    static Integer m25609h(Map map) {
        return AbstractC5775c0.m25880i(map, "maxAttempts");
    }

    /* JADX INFO: renamed from: i */
    static Integer m25610i(Map map) {
        return AbstractC5775c0.m25880i(map, "maxAttempts");
    }

    /* JADX INFO: renamed from: j */
    static Long m25611j(Map map) {
        return AbstractC5775c0.m25883l(map, "maxBackoff");
    }

    /* JADX INFO: renamed from: k */
    static Integer m25612k(Map map) {
        return AbstractC5775c0.m25880i(map, "maxRequestMessageBytes");
    }

    /* JADX INFO: renamed from: l */
    static Integer m25613l(Map map) {
        return AbstractC5775c0.m25880i(map, "maxResponseMessageBytes");
    }

    /* JADX INFO: renamed from: m */
    static List m25614m(Map map) {
        return AbstractC5775c0.m25877f(map, "methodConfig");
    }

    /* JADX INFO: renamed from: n */
    static String m25615n(Map map) {
        return AbstractC5775c0.m25882k(map, "method");
    }

    /* JADX INFO: renamed from: o */
    static List m25616o(Map map) {
        return AbstractC5775c0.m25877f(map, "name");
    }

    /* JADX INFO: renamed from: p */
    static Set m25617p(Map map) {
        Set setM25607f = m25607f(map, "nonFatalStatusCodes");
        if (setM25607f == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C0554l0.b.class));
        }
        AbstractC1219w.m5337a(!setM25607f.contains(C0554l0.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setM25607f;
    }

    /* JADX INFO: renamed from: q */
    static Long m25618q(Map map) {
        return AbstractC5775c0.m25883l(map, "perAttemptRecvTimeout");
    }

    /* JADX INFO: renamed from: r */
    static Map m25619r(Map map) {
        return AbstractC5775c0.m25881j(map, "retryPolicy");
    }

    /* JADX INFO: renamed from: s */
    static Set m25620s(Map map) {
        Set setM25607f = m25607f(map, "retryableStatusCodes");
        AbstractC1219w.m5337a(setM25607f != null, "%s is required in retry policy", "retryableStatusCodes");
        AbstractC1219w.m5337a(true ^ setM25607f.contains(C0554l0.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setM25607f;
    }

    /* JADX INFO: renamed from: t */
    static String m25621t(Map map) {
        return AbstractC5775c0.m25882k(map, "service");
    }

    /* JADX INFO: renamed from: u */
    private static Set m25622u(List list) {
        C0554l0.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(C0554l0.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d7 = (Double) obj;
                int iIntValue = d7.intValue();
                AbstractC1219w.m5337a(((double) iIntValue) == d7.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = C0554l0.m2450h(iIntValue).m2458m();
                AbstractC1219w.m5337a(bVarValueOf.m2466h() == d7.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new C1220x("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = C0554l0.b.valueOf((String) obj);
                } catch (IllegalArgumentException e7) {
                    throw new C1220x("Status code " + obj + " is not valid", e7);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    /* JADX INFO: renamed from: v */
    static AbstractC5727C0.D m25623v(Map map) {
        Map mapM25881j;
        if (map == null || (mapM25881j = AbstractC5775c0.m25881j(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = AbstractC5775c0.m25879h(mapM25881j, "maxTokens").floatValue();
        float fFloatValue2 = AbstractC5775c0.m25879h(mapM25881j, "tokenRatio").floatValue();
        AbstractC1209m.m5309u(fFloatValue > 0.0f, "maxToken should be greater than zero");
        AbstractC1209m.m5309u(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC5727C0.D(fFloatValue, fFloatValue2);
    }

    /* JADX INFO: renamed from: w */
    static Long m25624w(Map map) {
        return AbstractC5775c0.m25883l(map, "timeout");
    }

    /* JADX INFO: renamed from: x */
    static Boolean m25625x(Map map) {
        return AbstractC5775c0.m25875d(map, "waitForReady");
    }

    /* JADX INFO: renamed from: y */
    public static AbstractC0536c0.b m25626y(List list, C0525U c0525u) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strM25628a = aVar.m25628a();
            AbstractC0524T abstractC0524TM2240d = c0525u.m2240d(strM25628a);
            if (abstractC0524TM2240d != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(AbstractC5743K0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC0536c0.b bVarMo2235e = abstractC0524TM2240d.mo2235e(aVar.m25629b());
                return bVarMo2235e.m2389d() != null ? bVarMo2235e : AbstractC0536c0.b.m2386a(new b(abstractC0524TM2240d, bVarMo2235e.m2388c()));
            }
            arrayList.add(strM25628a);
        }
        return AbstractC0536c0.b.m2387b(C0554l0.f2100g.m2462q("None of " + arrayList + " specified by Service Config are available."));
    }

    /* JADX INFO: renamed from: z */
    public static a m25627z(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new a(str, AbstractC5775c0.m25881j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
