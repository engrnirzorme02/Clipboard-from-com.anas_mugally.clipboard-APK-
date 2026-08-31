package io.grpc.internal;

import java.util.Set;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p129Q3.AbstractC1274m;

/* JADX INFO: renamed from: io.grpc.internal.U */
/* JADX INFO: loaded from: classes.dex */
final class C5761U {

    /* JADX INFO: renamed from: a */
    final int f22298a;

    /* JADX INFO: renamed from: b */
    final long f22299b;

    /* JADX INFO: renamed from: c */
    final Set f22300c;

    C5761U(int i7, long j7, Set set) {
        this.f22298a = i7;
        this.f22299b = j7;
        this.f22300c = AbstractC1274m.m5575p(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5761U.class == obj.getClass()) {
            C5761U c5761u = (C5761U) obj;
            if (this.f22298a == c5761u.f22298a && this.f22299b == c5761u.f22299b && AbstractC1205i.m5282a(this.f22300c, c5761u.f22300c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(Integer.valueOf(this.f22298a), Long.valueOf(this.f22299b), this.f22300c);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5275b("maxAttempts", this.f22298a).m5276c("hedgingDelayNanos", this.f22299b).m5277d("nonFatalStatusCodes", this.f22300c).toString();
    }
}
