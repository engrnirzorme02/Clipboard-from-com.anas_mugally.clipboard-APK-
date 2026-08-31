package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC4759C;
import com.google.android.play.integrity.internal.C4763G;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ai */
/* JADX INFO: loaded from: classes2.dex */
final class BinderC4690ai extends AbstractBinderC4759C {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4691aj f18250a;

    /* JADX INFO: renamed from: b */
    private final C4763G f18251b = new C4763G("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: c */
    private final TaskCompletionSource f18252c;

    BinderC4690ai(C4691aj c4691aj, TaskCompletionSource taskCompletionSource) {
        this.f18250a = c4691aj;
        this.f18252c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC4760D
    /* JADX INFO: renamed from: b */
    public final void mo21836b(Bundle bundle) {
        this.f18250a.f18253a.m21921v(this.f18252c);
        this.f18251b.m21893d("onRequestIntegrityToken", new Object[0]);
        C3554b c3554bMo21874a = this.f18250a.f18257e.mo21874a(bundle);
        if (c3554bMo21874a != null) {
            this.f18252c.trySetException(c3554bMo21874a);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f18252c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        C4689ah c4689ah = new C4689ah(this, this.f18250a.f18255c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f18252c;
        C4681a c4681a = new C4681a();
        c4681a.mo21828b(string);
        c4681a.mo21827a(c4689ah);
        taskCompletionSource.trySetResult(c4681a.mo21829c());
    }
}
