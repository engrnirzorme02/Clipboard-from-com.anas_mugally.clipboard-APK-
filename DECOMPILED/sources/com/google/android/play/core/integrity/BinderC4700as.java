package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.integrity.internal.AbstractBinderC4761E;
import com.google.android.play.integrity.internal.C4763G;
import com.google.android.play.integrity.internal.C4776f;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.as */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4700as extends AbstractBinderC4761E {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f18271a;

    /* JADX INFO: renamed from: b */
    final C4776f f18272b;

    /* JADX INFO: renamed from: c */
    private final C4763G f18273c = new C4763G("RequestDialogCallbackImpl");

    /* JADX INFO: renamed from: d */
    private final String f18274d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC4739k f18275e;

    /* JADX INFO: renamed from: f */
    private final Activity f18276f;

    BinderC4700as(Context context, InterfaceC4739k interfaceC4739k, Activity activity, TaskCompletionSource taskCompletionSource, C4776f c4776f) {
        this.f18274d = context.getPackageName();
        this.f18275e = interfaceC4739k;
        this.f18271a = taskCompletionSource;
        this.f18276f = activity;
        this.f18272b = c4776f;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4762F
    /* JADX INFO: renamed from: b */
    public final void mo21845b(Bundle bundle) {
        this.f18272b.m21921v(this.f18271a);
        this.f18273c.m21893d("onRequestDialog(%s)", this.f18274d);
        C3554b c3554bMo21874a = this.f18275e.mo21874a(bundle);
        if (c3554bMo21874a != null) {
            this.f18271a.trySetException(c3554bMo21874a);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.f18273c.m21891b("onRequestDialog(%s): got null dialog intent", this.f18274d);
            this.f18271a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f18276f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ResultReceiverC4699ar(this, this.f18272b.m21917c()));
        this.f18273c.m21890a("Starting dialog intent...", new Object[0]);
        this.f18276f.startActivityForResult(intent, 0);
    }
}
