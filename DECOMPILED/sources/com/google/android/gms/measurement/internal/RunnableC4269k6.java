package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.k6 */
/* JADX INFO: loaded from: classes2.dex */
final class RunnableC4269k6 implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f15860a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f15861b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Bundle f15862c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C4277l6 f15863d;

    RunnableC4269k6(C4277l6 c4277l6, String str, String str2, Bundle bundle) {
        this.f15860a = str;
        this.f15861b = str2;
        this.f15862c = bundle;
        Objects.requireNonNull(c4277l6);
        this.f15863d = c4277l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4317q6 c4317q6 = this.f15863d.f15873a;
        C4389z6 c4389z6M18906N0 = c4317q6.m18906N0();
        long jMo18159a = c4317q6.mo18425f().mo18159a();
        String str = this.f15860a;
        c4317q6.m18924i((C4039G) AbstractC3718s.m18083l(c4389z6M18906N0.m19382R(str, this.f15861b, this.f15862c, "auto", jMo18159a, false, true)), str);
    }
}
