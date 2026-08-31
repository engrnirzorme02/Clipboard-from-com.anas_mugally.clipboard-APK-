package p152T5;

import com.google.android.gms.common.api.C3553a;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1435m;
import p159U5.C1705d;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1612J extends AbstractC1611I {
    /* JADX INFO: renamed from: b */
    public static Map m6620b(Map builder) {
        AbstractC6118n.m27187e(builder, "builder");
        return ((C1705d) builder).m7283l();
    }

    /* JADX INFO: renamed from: c */
    public static Map m6621c() {
        return new C1705d();
    }

    /* JADX INFO: renamed from: d */
    public static Map m6622d(int i7) {
        return new C1705d(i7);
    }

    /* JADX INFO: renamed from: e */
    public static int m6623e(int i7) {
        if (i7 < 0) {
            return i7;
        }
        if (i7 < 3) {
            return i7 + 1;
        }
        return i7 < 1073741824 ? (int) ((i7 / 0.75f) + 1.0f) : C3553a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: f */
    public static Map m6624f(C1435m pair) {
        AbstractC6118n.m27187e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.m6070c(), pair.m6071d());
        AbstractC6118n.m27186d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    /* JADX INFO: renamed from: g */
    public static final Map m6625g(Map map) {
        AbstractC6118n.m27187e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        AbstractC6118n.m27186d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
