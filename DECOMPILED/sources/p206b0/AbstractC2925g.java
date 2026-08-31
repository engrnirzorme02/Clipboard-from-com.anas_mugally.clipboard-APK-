package p206b0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2925g {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2924f m14669a() {
        return new C2921c(null, true, 1, null);
    }

    /* JADX INFO: renamed from: b */
    public static final C2921c m14670b(AbstractC2924f.b... pairs) {
        AbstractC6118n.m27187e(pairs, "pairs");
        C2921c c2921c = new C2921c(null, false, 1, null);
        c2921c.m14657g((AbstractC2924f.b[]) Arrays.copyOf(pairs, pairs.length));
        return c2921c;
    }
}
