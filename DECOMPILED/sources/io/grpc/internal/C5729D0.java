package io.grpc.internal;

import java.util.Set;
import p122P3.AbstractC1203g;
import p122P3.AbstractC1205i;
import p129Q3.AbstractC1274m;

/* JADX INFO: renamed from: io.grpc.internal.D0 */
/* JADX INFO: loaded from: classes.dex */
final class C5729D0 {

    /* JADX INFO: renamed from: a */
    final int f22156a;

    /* JADX INFO: renamed from: b */
    final long f22157b;

    /* JADX INFO: renamed from: c */
    final long f22158c;

    /* JADX INFO: renamed from: d */
    final double f22159d;

    /* JADX INFO: renamed from: e */
    final Long f22160e;

    /* JADX INFO: renamed from: f */
    final Set f22161f;

    C5729D0(int i7, long j7, long j8, double d7, Long l7, Set set) {
        this.f22156a = i7;
        this.f22157b = j7;
        this.f22158c = j8;
        this.f22159d = d7;
        this.f22160e = l7;
        this.f22161f = AbstractC1274m.m5575p(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5729D0)) {
            return false;
        }
        C5729D0 c5729d0 = (C5729D0) obj;
        return this.f22156a == c5729d0.f22156a && this.f22157b == c5729d0.f22157b && this.f22158c == c5729d0.f22158c && Double.compare(this.f22159d, c5729d0.f22159d) == 0 && AbstractC1205i.m5282a(this.f22160e, c5729d0.f22160e) && AbstractC1205i.m5282a(this.f22161f, c5729d0.f22161f);
    }

    public int hashCode() {
        return AbstractC1205i.m5283b(Integer.valueOf(this.f22156a), Long.valueOf(this.f22157b), Long.valueOf(this.f22158c), Double.valueOf(this.f22159d), this.f22160e, this.f22161f);
    }

    public String toString() {
        return AbstractC1203g.m5267b(this).m5275b("maxAttempts", this.f22156a).m5276c("initialBackoffNanos", this.f22157b).m5276c("maxBackoffNanos", this.f22158c).m5274a("backoffMultiplier", this.f22159d).m5277d("perAttemptRecvTimeoutNanos", this.f22160e).m5277d("retryableStatusCodes", this.f22161f).toString();
    }
}
