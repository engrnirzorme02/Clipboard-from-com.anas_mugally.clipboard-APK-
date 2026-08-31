package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.AbstractC4784n;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.q */
/* JADX INFO: loaded from: classes2.dex */
final class C4747q implements InterfaceC4754x {

    /* JADX INFO: renamed from: a */
    private Context f18345a;

    private C4747q() {
    }

    /* JADX INFO: renamed from: a */
    public final C4747q m21879a(Context context) {
        context.getClass();
        this.f18345a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.InterfaceC4754x
    /* JADX INFO: renamed from: b */
    public final C4749s mo21880b() {
        AbstractC4784n.m21929a(this.f18345a, Context.class);
        return new C4749s(this.f18345a, null);
    }

    /* synthetic */ C4747q(C4746p c4746p) {
    }
}
