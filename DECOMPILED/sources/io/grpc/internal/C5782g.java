package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5782g {

    /* JADX INFO: renamed from: c */
    private static final Logger f22482c = Logger.getLogger(C5782g.class.getName());

    /* JADX INFO: renamed from: a */
    private final String f22483a;

    /* JADX INFO: renamed from: b */
    private final AtomicLong f22484b;

    /* JADX INFO: renamed from: io.grpc.internal.g$b */
    public final class b {

        /* JADX INFO: renamed from: a */
        private final long f22485a;

        /* JADX INFO: renamed from: a */
        public void m25924a() {
            long j7 = this.f22485a;
            long jMax = Math.max(2 * j7, j7);
            if (C5782g.this.f22484b.compareAndSet(this.f22485a, jMax)) {
                C5782g.f22482c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{C5782g.this.f22483a, Long.valueOf(jMax)});
            }
        }

        /* JADX INFO: renamed from: b */
        public long m25925b() {
            return this.f22485a;
        }

        private b(long j7) {
            this.f22485a = j7;
        }
    }

    public C5782g(String str, long j7) {
        AtomicLong atomicLong = new AtomicLong();
        this.f22484b = atomicLong;
        AbstractC1209m.m5293e(j7 > 0, "value must be positive");
        this.f22483a = str;
        atomicLong.set(j7);
    }

    /* JADX INFO: renamed from: d */
    public b m25923d() {
        return new b(this.f22484b.get());
    }
}
