package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.InterfaceC3608k;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.G */
/* JADX INFO: loaded from: classes.dex */
final class C3663G extends AbstractDialogInterfaceOnClickListenerC3664H {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f14720a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ InterfaceC3608k f14721b;

    C3663G(Intent intent, InterfaceC3608k interfaceC3608k, int i7) {
        this.f14720a = intent;
        this.f14721b = interfaceC3608k;
    }

    @Override // com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC3664H
    /* JADX INFO: renamed from: a */
    public final void mo17982a() {
        Intent intent = this.f14720a;
        if (intent != null) {
            this.f14721b.startActivityForResult(intent, 2);
        }
    }
}
