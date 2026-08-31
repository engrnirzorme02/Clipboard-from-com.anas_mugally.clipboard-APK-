package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import java.util.Objects;
import p275j3.C5862a;

/* JADX INFO: renamed from: com.google.firebase.analytics.connector.internal.e */
/* JADX INFO: loaded from: classes.dex */
final class C4813e implements C5862a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4814f f18433a;

    public C4813e(C4814f c4814f) {
        Objects.requireNonNull(c4814f);
        this.f18433a = c4814f;
    }

    @Override // p283k3.InterfaceC6018A
    /* JADX INFO: renamed from: a */
    public final void mo18430a(String str, String str2, Bundle bundle, long j7) {
        if (str == null || !AbstractC4810b.m21960c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j7);
        bundle2.putBundle("params", bundle);
        this.f18433a.m21964a().mo7657a(3, bundle2);
    }
}
