package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;
import p157U3.InterfaceC1670b;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.K3 */
/* JADX INFO: loaded from: classes2.dex */
final class C4075K3 implements InterfaceC1670b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4132S5 f15285a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15286b;

    C4075K3(C4371x4 c4371x4, C4132S5 c4132s5) {
        this.f15285a = c4132s5;
        Objects.requireNonNull(c4371x4);
        this.f15286b = c4371x4;
    }

    /* JADX INFO: renamed from: b */
    private final void m18536b() {
        C4164X2 c4164x2 = this.f15286b.f15066a;
        SparseArray sparseArrayM18490r = c4164x2.m18687x().m18490r();
        C4132S5 c4132s5 = this.f15285a;
        sparseArrayM18490r.put(c4132s5.f15419c, Long.valueOf(c4132s5.f15418b));
        C4026E2 c4026e2M18687x = c4164x2.m18687x();
        int[] iArr = new int[sparseArrayM18490r.size()];
        long[] jArr = new long[sparseArrayM18490r.size()];
        for (int i7 = 0; i7 < sparseArrayM18490r.size(); i7++) {
            iArr[i7] = sparseArrayM18490r.keyAt(i7);
            jArr[i7] = ((Long) sparseArrayM18490r.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c4026e2M18687x.f15181o.m18420b(bundle);
    }

    @Override // p157U3.InterfaceC1670b
    /* JADX INFO: renamed from: a */
    public final void mo7030a(Throwable th) {
        C4371x4 c4371x4 = this.f15286b;
        c4371x4.mo18427h();
        c4371x4.m19281Z(false);
        C4164X2 c4164x2 = c4371x4.f15066a;
        int iM19285d0 = (c4164x2.m18686w().m18800H(null, AbstractC4209d2.f15637U0) ? c4371x4.m19285d0(th) : 2) - 1;
        if (iM19285d0 == 0) {
            c4164x2.mo18421a().m18854r().m18836c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C4313q2.m18846x(c4371x4.f15066a.m18670L().m18754q()), C4313q2.m18846x(th.toString()));
            c4371x4.m19283b0(1);
            c4371x4.m19310w0().add(this.f15285a);
            return;
        }
        if (iM19285d0 != 1) {
            c4164x2.mo18421a().m18851o().m18836c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C4313q2.m18846x(c4371x4.f15066a.m18670L().m18754q()), th);
            m18536b();
            c4371x4.m19283b0(1);
            c4371x4.m19312x0();
            return;
        }
        c4371x4.m19310w0().add(this.f15285a);
        if (c4371x4.m19282a0() > ((Integer) AbstractC4209d2.f15707x0.m18706b(null)).intValue()) {
            c4371x4.m19283b0(1);
            c4164x2.mo18421a().m18854r().m18836c("registerTriggerAsync failed. May try later. App ID, throwable", C4313q2.m18846x(c4371x4.f15066a.m18670L().m18754q()), C4313q2.m18846x(th.toString()));
        } else {
            c4164x2.mo18421a().m18854r().m18837d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C4313q2.m18846x(c4371x4.f15066a.m18670L().m18754q()), C4313q2.m18846x(String.valueOf(c4371x4.m19282a0())), C4313q2.m18846x(th.toString()));
            c4371x4.m19277V(c4371x4.m19282a0());
            int iM19282a0 = c4371x4.m19282a0();
            c4371x4.m19283b0(iM19282a0 + iM19282a0);
        }
    }

    @Override // p157U3.InterfaceC1670b
    public final void onSuccess(Object obj) {
        C4371x4 c4371x4 = this.f15286b;
        c4371x4.mo18427h();
        m18536b();
        c4371x4.m19281Z(false);
        c4371x4.m19283b0(1);
        c4371x4.f15066a.mo18421a().m18858v().m18835b("Successfully registered trigger URI", this.f15285a.f15417a);
        c4371x4.m19312x0();
    }
}
