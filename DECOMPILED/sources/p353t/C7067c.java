package p353t;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7067c {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap f28227a;

    public C7067c(int i7, float f7) {
        this.f28227a = new LinkedHashMap(i7, f7, true);
    }

    /* JADX INFO: renamed from: a */
    public final Object m31160a(Object key) {
        AbstractC6118n.m27187e(key, "key");
        return this.f28227a.get(key);
    }

    /* JADX INFO: renamed from: b */
    public final Set m31161b() {
        Set setEntrySet = this.f28227a.entrySet();
        AbstractC6118n.m27186d(setEntrySet, "map.entries");
        return setEntrySet;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31162c() {
        return this.f28227a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final Object m31163d(Object key, Object value) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        return this.f28227a.put(key, value);
    }

    /* JADX INFO: renamed from: e */
    public final Object m31164e(Object key) {
        AbstractC6118n.m27187e(key, "key");
        return this.f28227a.remove(key);
    }
}
