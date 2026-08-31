package p206b0;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2919a {
    /* JADX INFO: renamed from: a */
    public static final Set m14649a(Set set) {
        AbstractC6118n.m27187e(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC1638q.m6598l0(set));
        AbstractC6118n.m27186d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: b */
    public static final Map m14650b(Map map) {
        AbstractC6118n.m27187e(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        AbstractC6118n.m27186d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
