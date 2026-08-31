package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.R2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4122R2 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a */
    private final long f15385a;

    /* JADX INFO: renamed from: b */
    final boolean f15386b;

    /* JADX INFO: renamed from: c */
    private final String f15387c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4136T2 f15388d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4122R2(C4136T2 c4136t2, Runnable runnable, boolean z7, String str) {
        super(runnable, null);
        Objects.requireNonNull(c4136t2);
        this.f15388d = c4136t2;
        AbstractC3718s.m18083l(str);
        long andIncrement = C4136T2.f15423k.getAndIncrement();
        this.f15385a = andIncrement;
        this.f15387c = str;
        this.f15386b = z7;
        if (andIncrement == Long.MAX_VALUE) {
            c4136t2.f15066a.mo18421a().m18851o().m18834a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4122R2 c4122r2 = (C4122R2) obj;
        boolean z7 = c4122r2.f15386b;
        boolean z8 = this.f15386b;
        if (z8 != z7) {
            return !z8 ? 1 : -1;
        }
        long j7 = this.f15385a;
        long j8 = c4122r2.f15385a;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        this.f15388d.f15066a.mo18421a().m18852p().m18835b("Two tasks share the same index. index", Long.valueOf(j7));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.f15388d.f15066a.mo18421a().m18851o().m18835b(this.f15387c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4122R2(C4136T2 c4136t2, Callable callable, boolean z7, String str) {
        super(callable);
        Objects.requireNonNull(c4136t2);
        this.f15388d = c4136t2;
        AbstractC3718s.m18083l("Task exception on worker thread");
        long andIncrement = C4136T2.f15423k.getAndIncrement();
        this.f15385a = andIncrement;
        this.f15387c = "Task exception on worker thread";
        this.f15386b = z7;
        if (andIncrement == Long.MAX_VALUE) {
            c4136t2.f15066a.mo18421a().m18851o().m18834a("Tasks index overflow");
        }
    }
}
