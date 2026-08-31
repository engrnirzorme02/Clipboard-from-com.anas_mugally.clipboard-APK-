package p152T5;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: T5.I */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1611I {
    /* JADX INFO: renamed from: a */
    public static final Object m6619a(Map map, Object obj) {
        AbstractC6118n.m27187e(map, "<this>");
        if (map instanceof InterfaceC1609G) {
            return ((InterfaceC1609G) map).m6618j(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
