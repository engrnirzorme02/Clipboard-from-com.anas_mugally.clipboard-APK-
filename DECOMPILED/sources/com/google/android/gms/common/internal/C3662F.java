package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.F */
/* JADX INFO: loaded from: classes.dex */
final class C3662F extends AbstractDialogInterfaceOnClickListenerC3664H {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f14717a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Activity f14718b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f14719c;

    C3662F(Intent intent, Activity activity, int i7) {
        this.f14717a = intent;
        this.f14718b = activity;
        this.f14719c = i7;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3664H
    /* JADX INFO: renamed from: a */
    public final void mo17982a() {
        Intent intent = this.f14717a;
        if (intent != null) {
            this.f14718b.startActivityForResult(intent, this.f14719c);
        }
    }
}
