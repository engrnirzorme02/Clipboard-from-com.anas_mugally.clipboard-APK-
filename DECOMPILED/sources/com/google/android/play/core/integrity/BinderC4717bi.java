package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC4794x;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bi */
/* JADX INFO: loaded from: classes2.dex */
class BinderC4717bi extends AbstractBinderC4794x {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f18307a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4722bn f18308b;

    BinderC4717bi(C4722bn c4722bn, TaskCompletionSource taskCompletionSource) {
        this.f18308b = c4722bn;
        this.f18307a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: b */
    public final void mo21856b(Bundle bundle) {
        this.f18308b.f18316a.m21921v(this.f18307a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: c */
    public void mo21857c(Bundle bundle) {
        this.f18308b.f18316a.m21921v(this.f18307a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: d */
    public final void mo21858d(Bundle bundle) {
        this.f18308b.f18316a.m21921v(this.f18307a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4795y
    /* JADX INFO: renamed from: e */
    public void mo21859e(Bundle bundle) {
        this.f18308b.f18316a.m21921v(this.f18307a);
    }
}
