package p010B0;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1426d;
import p152T5.AbstractC1610H;

/* JADX INFO: renamed from: B0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0044c {
    /* JADX INFO: renamed from: a */
    public static Bundle m176a(Bundle source) {
        AbstractC6118n.m27187e(source, "source");
        return source;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m177b(Bundle bundle, String key) {
        AbstractC6118n.m27187e(key, "key");
        return bundle.containsKey(key);
    }

    /* JADX INFO: renamed from: c */
    public static final Bundle m178c(Bundle bundle, String key) {
        AbstractC6118n.m27187e(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        AbstractC0045d.m183a(key);
        throw new C1426d();
    }

    /* JADX INFO: renamed from: d */
    public static final Bundle m179d(Bundle bundle, String key) {
        AbstractC6118n.m27187e(key, "key");
        return bundle.getBundle(key);
    }

    /* JADX INFO: renamed from: e */
    public static final List m180e(Bundle bundle, String key) {
        AbstractC6118n.m27187e(key, "key");
        return bundle.getStringArrayList(key);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m181f(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public static final Map m182g(Bundle bundle) {
        Map mapD = AbstractC1610H.m6622d(bundle.size());
        for (String str : bundle.keySet()) {
            AbstractC6118n.m27184b(str);
            mapD.put(str, bundle.get(str));
        }
        return AbstractC1610H.m6620b(mapD);
    }
}
