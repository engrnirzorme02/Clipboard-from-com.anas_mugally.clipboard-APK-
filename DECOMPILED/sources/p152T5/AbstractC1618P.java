package p152T5;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p159U5.C1709h;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: T5.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1618P {
    /* JADX INFO: renamed from: a */
    public static Set m6647a(Set builder) {
        AbstractC6118n.m27187e(builder, "builder");
        return ((C1709h) builder).m7308b();
    }

    /* JADX INFO: renamed from: b */
    public static Set m6648b() {
        return new C1709h();
    }

    /* JADX INFO: renamed from: c */
    public static Set m6649c(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        AbstractC6118n.m27186d(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
