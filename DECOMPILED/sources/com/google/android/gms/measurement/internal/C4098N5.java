package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcn;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.N5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4098N5 extends AbstractC4225f2 {

    /* JADX INFO: renamed from: c */
    private Handler f15332c;

    /* JADX INFO: renamed from: d */
    private boolean f15333d;

    /* JADX INFO: renamed from: e */
    protected final C4091M5 f15334e;

    /* JADX INFO: renamed from: f */
    protected final C4084L5 f15335f;

    /* JADX INFO: renamed from: g */
    protected final C4061I5 f15336g;

    C4098N5(C4164X2 c4164x2) {
        super(c4164x2);
        this.f15333d = true;
        this.f15334e = new C4091M5(this);
        this.f15335f = new C4084L5(this);
        this.f15336g = new C4061I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m18566q() {
        mo18427h();
        if (this.f15332c == null) {
            this.f15332c = new zzcn(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4225f2
    /* JADX INFO: renamed from: m */
    protected final boolean mo18463m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    final void m18564o(boolean z7) {
        mo18427h();
        this.f15333d = z7;
    }

    /* JADX INFO: renamed from: p */
    final boolean m18565p() {
        mo18427h();
        return this.f15333d;
    }

    /* JADX INFO: renamed from: r */
    final /* synthetic */ void m18567r(long j7) {
        mo18427h();
        m18566q();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18859w().m18835b("Activity resumed, time", Long.valueOf(j7));
        if (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15639V0)) {
            if (c4164x2.m18686w().m18806N() || this.f15333d) {
                this.f15335f.m18537a(j7);
            }
        } else if (c4164x2.m18686w().m18806N() || c4164x2.m18687x().f15186t.m19333a()) {
            this.f15335f.m18537a(j7);
        }
        this.f15336g.m18530a();
        C4091M5 c4091m5 = this.f15334e;
        C4098N5 c4098n5 = c4091m5.f15320a;
        c4098n5.mo18427h();
        if (c4098n5.f15066a.m18675g()) {
            c4091m5.m18561b(c4098n5.f15066a.mo18425f().mo18159a(), false);
        }
    }

    /* JADX INFO: renamed from: s */
    final /* synthetic */ void m18568s(long j7) {
        mo18427h();
        m18566q();
        C4164X2 c4164x2 = this.f15066a;
        c4164x2.mo18421a().m18859w().m18835b("Activity paused, time", Long.valueOf(j7));
        this.f15336g.m18531b(j7);
        if (c4164x2.m18686w().m18806N()) {
            this.f15335f.m18538b(j7);
        }
    }

    /* JADX INFO: renamed from: t */
    final /* synthetic */ Handler m18569t() {
        return this.f15332c;
    }
}
