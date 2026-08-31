package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h4 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4243h4 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4374y f15797a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4371x4 f15798b;

    RunnableC4243h4(C4371x4 c4371x4, C4374y c4374y) {
        this.f15797a = c4374y;
        Objects.requireNonNull(c4371x4);
        this.f15798b = c4371x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4371x4 c4371x4 = this.f15798b;
        C4164X2 c4164x2 = c4371x4.f15066a;
        C4026E2 c4026e2M18687x = c4164x2.m18687x();
        C4164X2 c4164x3 = c4026e2M18687x.f15066a;
        c4026e2M18687x.mo18427h();
        C4374y c4374yM18493u = c4026e2M18687x.m18493u();
        C4374y c4374y = this.f15797a;
        if (!C4027E3.m18508u(c4374y.m19320b(), c4374yM18493u.m19320b())) {
            c4164x2.mo18421a().m18857u().m18835b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c4374y.m19320b()));
            return;
        }
        SharedPreferences.Editor editorEdit = c4026e2M18687x.m18488p().edit();
        editorEdit.putString("dma_consent_settings", c4374y.m19323e());
        editorEdit.apply();
        c4164x2.mo18421a().m18859w().m18835b("Setting DMA consent(FE)", c4374y);
        C4164X2 c4164x4 = c4371x4.f15066a;
        if (c4164x4.m18668J().m19205D()) {
            c4164x4.m18668J().m19223a0();
        } else {
            c4164x4.m18668J().m19221Y(false);
        }
    }
}
