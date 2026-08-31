package io.grpc.internal;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.F */
/* JADX INFO: loaded from: classes.dex */
public final class C5732F implements InterfaceC5788j {

    /* JADX INFO: renamed from: a */
    private Random f22164a = new Random();

    /* JADX INFO: renamed from: b */
    private long f22165b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c */
    private long f22166c = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: d */
    private double f22167d = 1.6d;

    /* JADX INFO: renamed from: e */
    private double f22168e = 0.2d;

    /* JADX INFO: renamed from: f */
    private long f22169f = this.f22165b;

    /* JADX INFO: renamed from: io.grpc.internal.F$a */
    public static final class a implements InterfaceC5788j.a {
        @Override // io.grpc.internal.InterfaceC5788j.a
        public InterfaceC5788j get() {
            return new C5732F();
        }
    }

    /* JADX INFO: renamed from: b */
    private long m25584b(double d7, double d8) {
        AbstractC1209m.m5292d(d8 >= d7);
        return (long) ((this.f22164a.nextDouble() * (d8 - d7)) + d7);
    }

    @Override // io.grpc.internal.InterfaceC5788j
    /* JADX INFO: renamed from: a */
    public long mo25585a() {
        long j7 = this.f22169f;
        double d7 = j7;
        this.f22169f = Math.min((long) (this.f22167d * d7), this.f22166c);
        double d8 = this.f22168e;
        return j7 + m25584b((-d8) * d7, d8 * d7);
    }
}
