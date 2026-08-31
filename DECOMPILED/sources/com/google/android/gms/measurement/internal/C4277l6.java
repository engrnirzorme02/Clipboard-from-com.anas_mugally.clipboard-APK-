package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4277l6 implements InterfaceC4381y6 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4317q6 f15873a;

    C4277l6(C4317q6 c4317q6) {
        Objects.requireNonNull(c4317q6);
        this.f15873a = c4317q6;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4381y6
    /* JADX INFO: renamed from: a */
    public final void mo18694a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f15873a.mo18422b().m18639t(new RunnableC4269k6(this, str, str2, bundle));
            return;
        }
        C4317q6 c4317q6 = this.f15873a;
        if (c4317q6.m18954x0() != null) {
            c4317q6.m18954x0().mo18421a().m18851o().m18835b("AppId not known when logging event", str2);
        }
    }
}
