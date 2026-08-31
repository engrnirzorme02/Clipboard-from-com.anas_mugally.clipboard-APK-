package p129Q3;

import java.io.Serializable;
import p122P3.AbstractC1205i;
import p122P3.AbstractC1209m;
import p122P3.InterfaceC1201e;

/* JADX INFO: renamed from: Q3.c */
/* JADX INFO: loaded from: classes2.dex */
final class C1264c extends AbstractC1281t implements Serializable {

    /* JADX INFO: renamed from: a */
    final InterfaceC1201e f4513a;

    /* JADX INFO: renamed from: b */
    final AbstractC1281t f4514b;

    C1264c(InterfaceC1201e interfaceC1201e, AbstractC1281t abstractC1281t) {
        this.f4513a = (InterfaceC1201e) AbstractC1209m.m5302n(interfaceC1201e);
        this.f4514b = (AbstractC1281t) AbstractC1209m.m5302n(abstractC1281t);
    }

    @Override // p129Q3.AbstractC1281t, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f4514b.compare(this.f4513a.apply(obj), this.f4513a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1264c) {
            C1264c c1264c = (C1264c) obj;
            if (this.f4513a.equals(c1264c.f4513a) && this.f4514b.equals(c1264c.f4514b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(this.f4513a, this.f4514b);
    }

    public String toString() {
        return this.f4514b + ".onResultOf(" + this.f4513a + ")";
    }
}
