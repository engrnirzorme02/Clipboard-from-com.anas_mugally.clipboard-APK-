package p188Z;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: Z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2064c {

    /* JADX INFO: renamed from: a */
    private final SharedPreferences f6803a;

    /* JADX INFO: renamed from: b */
    private final Set f6804b;

    public C2064c(SharedPreferences prefs, Set set) {
        AbstractC6118n.m27187e(prefs, "prefs");
        this.f6803a = prefs;
        this.f6804b = set;
    }

    /* JADX INFO: renamed from: a */
    public final Map m8535a() {
        Map<String, ?> all = this.f6803a.getAll();
        AbstractC6118n.m27186d(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Set set = this.f6804b;
            if (set != null ? set.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1610H.m6623e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = AbstractC1638q.m6598l0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
