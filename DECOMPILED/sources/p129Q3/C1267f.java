package p129Q3;

import java.io.Serializable;
import java.util.Comparator;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: Q3.f */
/* JADX INFO: loaded from: classes2.dex */
final class C1267f extends AbstractC1281t implements Serializable {

    /* JADX INFO: renamed from: a */
    final Comparator f4515a;

    C1267f(Comparator comparator) {
        this.f4515a = (Comparator) AbstractC1209m.m5302n(comparator);
    }

    @Override // p129Q3.AbstractC1281t, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f4515a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1267f) {
            return this.f4515a.equals(((C1267f) obj).f4515a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4515a.hashCode();
    }

    public String toString() {
        return this.f4515a.toString();
    }
}
