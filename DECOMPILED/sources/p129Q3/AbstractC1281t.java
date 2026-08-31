package p129Q3;

import java.util.Comparator;
import p122P3.InterfaceC1201e;

/* JADX INFO: renamed from: Q3.t */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1281t implements Comparator {
    protected AbstractC1281t() {
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1281t m5602a(Comparator comparator) {
        return comparator instanceof AbstractC1281t ? (AbstractC1281t) comparator : new C1267f(comparator);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC1281t m5603b(InterfaceC1201e interfaceC1201e) {
        return new C1264c(interfaceC1201e, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);
}
