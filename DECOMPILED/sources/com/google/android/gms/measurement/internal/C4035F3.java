package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;
import p283k3.InterfaceC6041l;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.F3 */
/* JADX INFO: loaded from: classes2.dex */
final class C4035F3 implements InterfaceC6041l {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4164X2 f15210a;

    C4035F3(C4043G3 c4043g3, C4164X2 c4164x2) {
        this.f15210a = c4164x2;
        Objects.requireNonNull(c4043g3);
    }

    @Override // p283k3.InterfaceC6041l
    public final boolean zza() {
        return Log.isLoggable(this.f15210a.mo18421a().m18861z(), 3);
    }
}
