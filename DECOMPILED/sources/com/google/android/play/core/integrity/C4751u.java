package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC4784n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.u */
/* JADX INFO: loaded from: classes2.dex */
final class C4751u implements InterfaceC4703av {

    /* JADX INFO: renamed from: a */
    private Context f18352a;

    private C4751u() {
    }

    /* JADX INFO: renamed from: a */
    public final C4751u m21882a(Context context) {
        context.getClass();
        this.f18352a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC4703av
    /* JADX INFO: renamed from: b */
    public final InterfaceC4704aw mo21848b() {
        AbstractC4784n.m21929a(this.f18352a, Context.class);
        return new C4753w(this.f18352a, null);
    }

    /* synthetic */ C4751u(C4750t c4750t) {
    }
}
