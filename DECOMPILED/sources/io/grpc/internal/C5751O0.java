package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import p063H5.AbstractC0551k;
import p063H5.AbstractC0560o0;
import p063H5.C0530Z;
import p063H5.C0531a;
import p063H5.C0554l0;

/* JADX INFO: renamed from: io.grpc.internal.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5751O0 {

    /* JADX INFO: renamed from: c */
    public static final C5751O0 f22219c = new C5751O0(new AbstractC0560o0[0]);

    /* JADX INFO: renamed from: a */
    private final AbstractC0560o0[] f22220a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f22221b = new AtomicBoolean(false);

    C5751O0(AbstractC0560o0[] abstractC0560o0Arr) {
        this.f22220a = abstractC0560o0Arr;
    }

    /* JADX INFO: renamed from: h */
    public static C5751O0 m25646h(AbstractC0551k[] abstractC0551kArr, C0531a c0531a, C0530Z c0530z) {
        C5751O0 c5751o0 = new C5751O0(abstractC0551kArr);
        for (AbstractC0551k abstractC0551k : abstractC0551kArr) {
            abstractC0551k.mo2431n(c0531a, c0530z);
        }
        return c5751o0;
    }

    /* JADX INFO: renamed from: a */
    public void m25647a() {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            ((AbstractC0551k) abstractC0560o0).mo2428k();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25648b(C0530Z c0530z) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            ((AbstractC0551k) abstractC0560o0).mo2429l(c0530z);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m25649c() {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            ((AbstractC0551k) abstractC0560o0).mo2430m();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m25650d(int i7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2479a(i7);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m25651e(int i7, long j7, long j8) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2480b(i7, j7, j8);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m25652f(long j7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2481c(j7);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m25653g(long j7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2482d(j7);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m25654i(int i7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2483e(i7);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m25655j(int i7, long j7, long j8) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2484f(i7, j7, j8);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m25656k(long j7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2485g(j7);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m25657l(long j7) {
        for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
            abstractC0560o0.mo2486h(j7);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m25658m(C0554l0 c0554l0) {
        if (this.f22221b.compareAndSet(false, true)) {
            for (AbstractC0560o0 abstractC0560o0 : this.f22220a) {
                abstractC0560o0.mo2487i(c0554l0);
            }
        }
    }
}
