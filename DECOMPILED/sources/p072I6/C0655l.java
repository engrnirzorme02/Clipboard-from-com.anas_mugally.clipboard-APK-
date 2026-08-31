package p072I6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: I6.l */
/* JADX INFO: loaded from: classes.dex */
public class C0655l extends C0641C {

    /* JADX INFO: renamed from: f */
    private C0641C f2572f;

    public C0655l(C0641C delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f2572f = delegate;
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: a */
    public C0641C mo2950a() {
        return this.f2572f.mo2950a();
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: b */
    public C0641C mo2951b() {
        return this.f2572f.mo2951b();
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: c */
    public long mo2952c() {
        return this.f2572f.mo2952c();
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: d */
    public C0641C mo2953d(long j7) {
        return this.f2572f.mo2953d(j7);
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: e */
    public boolean mo2954e() {
        return this.f2572f.mo2954e();
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: f */
    public void mo2955f() throws InterruptedIOException {
        this.f2572f.mo2955f();
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: g */
    public C0641C mo2956g(long j7, TimeUnit unit) {
        AbstractC6118n.m27187e(unit, "unit");
        return this.f2572f.mo2956g(j7, unit);
    }

    @Override // p072I6.C0641C
    /* JADX INFO: renamed from: h */
    public long mo2957h() {
        return this.f2572f.mo2957h();
    }

    /* JADX INFO: renamed from: j */
    public final C0641C m3120j() {
        return this.f2572f;
    }

    /* JADX INFO: renamed from: k */
    public final C0655l m3121k(C0641C delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f2572f = delegate;
        return this;
    }
}
