package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4776f;
import com.google.android.play.integrity.internal.InterfaceC4793w;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bh */
/* JADX INFO: loaded from: classes2.dex */
final class C4716bh extends AbstractC4721bm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Bundle f18302a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f18303b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ TaskCompletionSource f18304c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f18305d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ C4722bn f18306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4716bh(C4722bn c4722bn, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i7) {
        super(c4722bn, taskCompletionSource);
        this.f18306e = c4722bn;
        this.f18302a = bundle;
        this.f18303b = activity;
        this.f18304c = taskCompletionSource2;
        this.f18305d = i7;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC4764H
    /* JADX INFO: renamed from: b */
    protected final void mo21834b() {
        if (C4722bn.m21868k(this.f18306e)) {
            super.mo21833a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            C4722bn c4722bn = this.f18306e;
            C4776f c4776f = c4722bn.f18316a;
            ((InterfaceC4793w) c4776f.m21918e()).mo21939a(this.f18302a, c4722bn.f18320e.m21846a(this.f18303b, this.f18304c, c4776f));
        } catch (RemoteException e7) {
            this.f18306e.f18317b.m21892c(e7, "requestAndShowDialog(%s)", Integer.valueOf(this.f18305d));
            this.f18304c.trySetException(new StandardIntegrityException(-100, e7));
        }
    }
}
