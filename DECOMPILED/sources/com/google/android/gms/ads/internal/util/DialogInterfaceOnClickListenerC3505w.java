package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.Objects;
import p380w2.C7351t;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.w */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC3505w implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f14339a;

    DialogInterfaceOnClickListenerC3505w(RunnableC3507x runnableC3507x, Context context) {
        this.f14339a = context;
        Objects.requireNonNull(runnableC3507x);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        C7351t.m32349g();
        C3431F0.m17435z(this.f14339a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
