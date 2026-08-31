package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.b4 */
/* JADX INFO: loaded from: classes2.dex */
final class C4195b4 implements InterfaceC4381y6 {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4371x4 f15562a;

    C4195b4(C4371x4 c4371x4) {
        Objects.requireNonNull(c4371x4);
        this.f15562a = c4371x4;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4381y6
    /* JADX INFO: renamed from: a */
    public final void mo18694a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f15562a.m19295p("auto", "_err", bundle);
        } else {
            this.f15562a.m19309w("auto", "_err", bundle, str);
        }
    }
}
