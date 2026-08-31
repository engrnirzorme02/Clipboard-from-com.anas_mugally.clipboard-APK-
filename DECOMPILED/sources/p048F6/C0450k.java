package p048F6;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p016B6.InterfaceC0096d;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: F6.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0450k {

    /* JADX INFO: renamed from: a */
    private final Map f1723a = AbstractC0449j.m1948a(16);

    /* JADX INFO: renamed from: F6.k$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: a */
    public final Object m1949a(InterfaceC0096d descriptor, a key) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(key, "key");
        Map map = (Map) this.f1723a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1950b(InterfaceC0096d descriptor, a key, InterfaceC5356a defaultValue) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(defaultValue, "defaultValue");
        Object objM1949a = m1949a(descriptor, key);
        if (objM1949a != null) {
            return objM1949a;
        }
        Object objInvoke = defaultValue.invoke();
        m1951c(descriptor, key, objInvoke);
        return objInvoke;
    }

    /* JADX INFO: renamed from: c */
    public final void m1951c(InterfaceC0096d descriptor, a key, Object value) {
        AbstractC6118n.m27187e(descriptor, "descriptor");
        AbstractC6118n.m27187e(key, "key");
        AbstractC6118n.m27187e(value, "value");
        Map map = this.f1723a;
        Object objM1948a = map.get(descriptor);
        if (objM1948a == null) {
            objM1948a = AbstractC0449j.m1948a(2);
            map.put(descriptor, objM1948a);
        }
        ((Map) objM1948a).put(key, value);
    }
}
