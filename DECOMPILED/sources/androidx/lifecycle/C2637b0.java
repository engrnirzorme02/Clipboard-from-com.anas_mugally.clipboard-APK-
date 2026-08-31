package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: androidx.lifecycle.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C2637b0 {

    /* JADX INFO: renamed from: a */
    private final Map f10455a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m12604a() {
        Iterator it = this.f10455a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC2632Y) it.next()).m12588b();
        }
        this.f10455a.clear();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2632Y m12605b(String key) {
        AbstractC6118n.m27187e(key, "key");
        return (AbstractC2632Y) this.f10455a.get(key);
    }

    /* JADX INFO: renamed from: c */
    public final Set m12606c() {
        return new HashSet(this.f10455a.keySet());
    }

    /* JADX INFO: renamed from: d */
    public final void m12607d(String key, AbstractC2632Y viewModel) {
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(viewModel, "viewModel");
        AbstractC2632Y abstractC2632Y = (AbstractC2632Y) this.f10455a.put(key, viewModel);
        if (abstractC2632Y != null) {
            abstractC2632Y.m12588b();
        }
    }
}
