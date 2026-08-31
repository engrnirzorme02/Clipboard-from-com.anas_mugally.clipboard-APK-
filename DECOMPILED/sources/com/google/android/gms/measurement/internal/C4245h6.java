package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h6 */
/* JADX INFO: loaded from: classes2.dex */
final class C4245h6 extends AbstractC4366x {

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4317q6 f15805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4245h6(C4317q6 c4317q6, InterfaceC4011C3 interfaceC4011C3) {
        super(interfaceC4011C3);
        Objects.requireNonNull(c4317q6);
        this.f15805e = c4317q6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4366x
    /* JADX INFO: renamed from: a */
    public final void mo18529a() {
        C4317q6 c4317q6 = this.f15805e;
        c4317q6.mo18422b().mo18427h();
        String str = (String) c4317q6.m18956y0().pollFirst();
        if (str != null) {
            c4317q6.m18958z0(c4317q6.mo18425f().mo18161c());
            c4317q6.mo18421a().m18859w().m18835b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            C4317q6.m18883W(c4317q6.mo18424e(), intent);
        }
        c4317q6.m18951v0();
    }
}
