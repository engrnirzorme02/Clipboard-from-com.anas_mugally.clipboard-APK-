package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.AbstractC2665a;
import com.google.android.gms.common.api.AbstractC3560h;
import java.util.Objects;
import p142S2.C1396g;
import p322p0.AbstractC6716b;

/* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.internal.a */
/* JADX INFO: loaded from: classes.dex */
final class C3552a implements AbstractC2665a.a {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SignInHubActivity f14507a;

    /* synthetic */ C3552a(SignInHubActivity signInHubActivity, byte[] bArr) {
        Objects.requireNonNull(signInHubActivity);
        this.f14507a = signInHubActivity;
    }

    @Override // androidx.loader.app.AbstractC2665a.a
    /* JADX INFO: renamed from: a */
    public final void mo12685a(AbstractC6716b abstractC6716b) {
    }

    @Override // androidx.loader.app.AbstractC2665a.a
    /* JADX INFO: renamed from: b */
    public final AbstractC6716b mo12686b(int i7, Bundle bundle) {
        return new C1396g(this.f14507a, AbstractC3560h.m17770c());
    }

    @Override // androidx.loader.app.AbstractC2665a.a
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12687c(AbstractC6716b abstractC6716b, Object obj) {
        SignInHubActivity signInHubActivity = this.f14507a;
        signInHubActivity.setResult(signInHubActivity.m17738O0(), signInHubActivity.m17739P0());
        signInHubActivity.finish();
    }
}
