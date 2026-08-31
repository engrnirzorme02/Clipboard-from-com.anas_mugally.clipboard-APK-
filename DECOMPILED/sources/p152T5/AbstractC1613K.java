package p152T5;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1435m;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1613K extends AbstractC1612J {
    /* JADX INFO: renamed from: h */
    public static Map m6626h() {
        C1606D c1606d = C1606D.f5367a;
        AbstractC6118n.m27185c(c1606d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c1606d;
    }

    /* JADX INFO: renamed from: i */
    public static Object m6627i(Map map, Object obj) {
        AbstractC6118n.m27187e(map, "<this>");
        return AbstractC1611I.m6619a(map, obj);
    }

    /* JADX INFO: renamed from: j */
    public static Map m6628j(C1435m... pairs) {
        AbstractC6118n.m27187e(pairs, "pairs");
        return pairs.length > 0 ? m6637s(pairs, new LinkedHashMap(AbstractC1612J.m6623e(pairs.length))) : m6626h();
    }

    /* JADX INFO: renamed from: k */
    public static Map m6629k(C1435m... pairs) {
        AbstractC6118n.m27187e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1612J.m6623e(pairs.length));
        m6633o(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: l */
    public static final Map m6630l(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : AbstractC1612J.m6625g(map);
        }
        return m6626h();
    }

    /* JADX INFO: renamed from: m */
    public static Map m6631m(Map map, Map map2) {
        AbstractC6118n.m27187e(map, "<this>");
        AbstractC6118n.m27187e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static final void m6632n(Map map, Iterable pairs) {
        AbstractC6118n.m27187e(map, "<this>");
        AbstractC6118n.m27187e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C1435m c1435m = (C1435m) it.next();
            map.put(c1435m.m6068a(), c1435m.m6069b());
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m6633o(Map map, C1435m[] pairs) {
        AbstractC6118n.m27187e(map, "<this>");
        AbstractC6118n.m27187e(pairs, "pairs");
        for (C1435m c1435m : pairs) {
            map.put(c1435m.m6068a(), c1435m.m6069b());
        }
    }

    /* JADX INFO: renamed from: p */
    public static Map m6634p(Iterable iterable) {
        AbstractC6118n.m27187e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m6630l(m6635q(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m6626h();
        }
        if (size != 1) {
            return m6635q(iterable, new LinkedHashMap(AbstractC1612J.m6623e(collection.size())));
        }
        return AbstractC1612J.m6624f((C1435m) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* JADX INFO: renamed from: q */
    public static final Map m6635q(Iterable iterable, Map destination) {
        AbstractC6118n.m27187e(iterable, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        m6632n(destination, iterable);
        return destination;
    }

    /* JADX INFO: renamed from: r */
    public static Map m6636r(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? m6638t(map) : AbstractC1612J.m6625g(map);
        }
        return m6626h();
    }

    /* JADX INFO: renamed from: s */
    public static final Map m6637s(C1435m[] c1435mArr, Map destination) {
        AbstractC6118n.m27187e(c1435mArr, "<this>");
        AbstractC6118n.m27187e(destination, "destination");
        m6633o(destination, c1435mArr);
        return destination;
    }

    /* JADX INFO: renamed from: t */
    public static Map m6638t(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
