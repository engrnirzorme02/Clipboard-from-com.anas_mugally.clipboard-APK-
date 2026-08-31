package p036E2;

import java.util.concurrent.atomic.AtomicBoolean;
import p060H2.C0496a;
import p380w2.C7351t;

/* JADX INFO: renamed from: E2.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0356m0 {

    /* JADX INFO: renamed from: a */
    private final C0496a f1425a;

    /* JADX INFO: renamed from: b */
    private final String f1426b;

    /* JADX INFO: renamed from: c */
    private final long f1427c;

    /* JADX INFO: renamed from: d */
    private final int f1428d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f1429e = new AtomicBoolean(false);

    public C0356m0(C0496a c0496a, String str, long j7, int i7) {
        this.f1425a = c0496a;
        this.f1426b = str;
        this.f1427c = j7;
        this.f1428d = i7;
    }

    /* JADX INFO: renamed from: a */
    public final C0496a m1543a() {
        return this.f1425a;
    }

    /* JADX INFO: renamed from: b */
    public final String m1544b() {
        return this.f1426b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1545c() {
        return this.f1427c <= C7351t.m32357o().mo18159a();
    }

    /* JADX INFO: renamed from: d */
    public final int m1546d() {
        return this.f1428d;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1547e() {
        return this.f1429e.get();
    }

    /* JADX INFO: renamed from: f */
    public final void m1548f() {
        this.f1429e.set(true);
    }
}
