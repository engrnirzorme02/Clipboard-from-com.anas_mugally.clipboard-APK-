package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.C4776f;
import com.google.android.play.integrity.internal.InterfaceC4785o;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.at */
/* JADX INFO: loaded from: classes2.dex */
final class C4701at {

    /* JADX INFO: renamed from: a */
    private final InterfaceC4785o f18277a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC4785o f18278b;

    C4701at(InterfaceC4785o interfaceC4785o, InterfaceC4785o interfaceC4785o2) {
        this.f18277a = interfaceC4785o;
        this.f18278b = interfaceC4785o2;
    }

    /* JADX INFO: renamed from: a */
    final BinderC4700as m21846a(Activity activity, TaskCompletionSource taskCompletionSource, C4776f c4776f) {
        Object objMo21830a = this.f18277a.mo21830a();
        objMo21830a.getClass();
        InterfaceC4739k interfaceC4739k = (InterfaceC4739k) this.f18278b.mo21830a();
        interfaceC4739k.getClass();
        activity.getClass();
        c4776f.getClass();
        return new BinderC4700as((Context) objMo21830a, interfaceC4739k, activity, taskCompletionSource, c4776f);
    }
}
