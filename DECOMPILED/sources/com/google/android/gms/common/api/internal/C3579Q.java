package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3559g;

/* JADX INFO: renamed from: com.google.android.gms.common.api.internal.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C3579Q extends AbstractC3567E {

    /* JADX INFO: renamed from: c */
    private final AbstractC3559g f14601c;

    public C3579Q(AbstractC3559g abstractC3559g) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f14601c = abstractC3559g;
    }

    @Override // com.google.android.gms.common.api.AbstractC3560h
    /* JADX INFO: renamed from: a */
    public final AbstractC3594d mo17771a(AbstractC3594d abstractC3594d) {
        return this.f14601c.doRead(abstractC3594d);
    }

    @Override // com.google.android.gms.common.api.AbstractC3560h
    /* JADX INFO: renamed from: b */
    public final AbstractC3594d mo17772b(AbstractC3594d abstractC3594d) {
        return this.f14601c.doWrite(abstractC3594d);
    }

    @Override // com.google.android.gms.common.api.AbstractC3560h
    /* JADX INFO: renamed from: e */
    public final Context mo17774e() {
        return this.f14601c.getApplicationContext();
    }

    @Override // com.google.android.gms.common.api.AbstractC3560h
    /* JADX INFO: renamed from: f */
    public final Looper mo17775f() {
        return this.f14601c.getLooper();
    }
}
