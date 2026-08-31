package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: F6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0442c {

    /* JADX INFO: renamed from: a */
    private static final int f1712a;

    static {
        Object objM6073b;
        try {
            C1436n.a aVar = C1436n.f4958b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            AbstractC6118n.m27186d(property, "getProperty(...)");
            objM6073b = C1436n.m6073b(AbstractC6406h.m27543m(property));
        } catch (Throwable th) {
            C1436n.a aVar2 = C1436n.f4958b;
            objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
        }
        if (C1436n.m6077f(objM6073b)) {
            objM6073b = null;
        }
        Integer num = (Integer) objM6073b;
        f1712a = num != null ? num.intValue() : 2097152;
    }
}
