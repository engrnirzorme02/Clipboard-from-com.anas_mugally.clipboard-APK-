package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.Objects;
import java.util.concurrent.Callable;
import p283k3.EnumC6051v;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.i6 */
/* JADX INFO: loaded from: classes2.dex */
final class CallableC4253i6 implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4006B6 f15830a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4317q6 f15831b;

    CallableC4253i6(C4317q6 c4317q6, C4006B6 c4006b6) {
        this.f15830a = c4006b6;
        Objects.requireNonNull(c4317q6);
        this.f15831b = c4317q6;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C4006B6 c4006b6 = this.f15830a;
        String str = (String) AbstractC3718s.m18083l(c4006b6.f15112a);
        C4317q6 c4317q6 = this.f15831b;
        C4027E3 c4027e3M18920g = c4317q6.m18920g(str);
        EnumC6051v enumC6051v = EnumC6051v.ANALYTICS_STORAGE;
        if (c4027e3M18920g.m18514o(enumC6051v) && C4027E3.m18502f(c4006b6.f15099D, 100).m18514o(enumC6051v)) {
            return c4317q6.m18937o0(c4006b6).m19176p0();
        }
        c4317q6.mo18421a().m18859w().m18834a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
