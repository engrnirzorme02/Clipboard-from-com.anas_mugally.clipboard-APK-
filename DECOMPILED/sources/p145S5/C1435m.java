package p145S5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: S5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1435m implements Serializable {

    /* JADX INFO: renamed from: a */
    private final Object f4956a;

    /* JADX INFO: renamed from: b */
    private final Object f4957b;

    public C1435m(Object obj, Object obj2) {
        this.f4956a = obj;
        this.f4957b = obj2;
    }

    /* JADX INFO: renamed from: a */
    public final Object m6068a() {
        return this.f4956a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m6069b() {
        return this.f4957b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m6070c() {
        return this.f4956a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m6071d() {
        return this.f4957b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1435m)) {
            return false;
        }
        C1435m c1435m = (C1435m) obj;
        return AbstractC6118n.m27183a(this.f4956a, c1435m.f4956a) && AbstractC6118n.m27183a(this.f4957b, c1435m.f4957b);
    }

    public int hashCode() {
        Object obj = this.f4956a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4957b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f4956a + ", " + this.f4957b + ')';
    }
}
