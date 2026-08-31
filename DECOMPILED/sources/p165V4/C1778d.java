package p165V4;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: V4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1778d {

    /* JADX INFO: renamed from: b */
    public static C1778d f5831b = m7456a(new HashSet());

    /* JADX INFO: renamed from: a */
    private final Set f5832a;

    private C1778d(Set set) {
        this.f5832a = set;
    }

    /* JADX INFO: renamed from: a */
    public static C1778d m7456a(Set set) {
        return new C1778d(set);
    }

    /* JADX INFO: renamed from: b */
    public Set m7457b() {
        return this.f5832a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1778d.class != obj.getClass()) {
            return false;
        }
        return this.f5832a.equals(((C1778d) obj).f5832a);
    }

    public int hashCode() {
        return this.f5832a.hashCode();
    }

    public String toString() {
        return "FieldMask{mask=" + this.f5832a.toString() + "}";
    }
}
