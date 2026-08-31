package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6118n;
import p318o6.AbstractC6634S0;
import p318o6.C6656c0;

/* JADX INFO: renamed from: androidx.lifecycle.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2655q {
    /* JADX INFO: renamed from: a */
    public static final AbstractC2651m m12640a(AbstractC2650l abstractC2650l) {
        C2652n c2652n;
        AbstractC6118n.m27187e(abstractC2650l, "<this>");
        do {
            C2652n c2652n2 = (C2652n) abstractC2650l.m12627c().m12609b();
            if (c2652n2 != null) {
                return c2652n2;
            }
            c2652n = new C2652n(abstractC2650l, AbstractC6634S0.m28112b(null, 1, null).plus(C6656c0.m28164c().mo28087U0()));
        } while (!abstractC2650l.m12627c().m12608a(null, c2652n));
        c2652n.m12637b();
        return c2652n;
    }
}
