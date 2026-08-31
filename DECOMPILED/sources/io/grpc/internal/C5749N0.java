package io.grpc.internal;

import java.io.Closeable;

/* JADX INFO: renamed from: io.grpc.internal.N0 */
/* JADX INFO: loaded from: classes.dex */
final class C5749N0 extends AbstractC5744L {

    /* JADX INFO: renamed from: a */
    private final C5795m0.b f22216a;

    /* JADX INFO: renamed from: b */
    private boolean f22217b;

    public C5749N0(C5795m0.b bVar) {
        this.f22216a = bVar;
    }

    @Override // io.grpc.internal.AbstractC5744L, io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: a */
    public void mo25632a(InterfaceC5755Q0.a aVar) {
        if (!this.f22217b) {
            super.mo25632a(aVar);
        } else if (aVar instanceof Closeable) {
            AbstractC5757S.m25667e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.AbstractC5744L
    /* JADX INFO: renamed from: b */
    protected C5795m0.b mo25633b() {
        return this.f22216a;
    }

    @Override // io.grpc.internal.AbstractC5744L, io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: c */
    public void mo3281c(boolean z7) {
        this.f22217b = true;
        super.mo3281c(z7);
    }

    @Override // io.grpc.internal.AbstractC5744L, io.grpc.internal.C5795m0.b
    /* JADX INFO: renamed from: e */
    public void mo3284e(Throwable th) {
        this.f22217b = true;
        super.mo3284e(th);
    }
}
