package p010B0;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: B0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0051j {
    /* JADX INFO: renamed from: a */
    public static Bundle m199a(Bundle source) {
        AbstractC6118n.m27187e(source, "source");
        return source;
    }

    /* JADX INFO: renamed from: b */
    public static final void m200b(Bundle bundle, Bundle from) {
        AbstractC6118n.m27187e(from, "from");
        bundle.putAll(from);
    }

    /* JADX INFO: renamed from: c */
    public static final void m201c(Bundle bundle, String key, Bundle value) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        bundle.putBundle(key, value);
    }

    /* JADX INFO: renamed from: d */
    public static final void m202d(Bundle bundle, String key, List value) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        bundle.putStringArrayList(key, AbstractC0052k.m204a(value));
    }

    /* JADX INFO: renamed from: e */
    public static final void m203e(Bundle bundle, String key) {
        AbstractC6118n.m27187e(key, "key");
        bundle.remove(key);
    }
}
