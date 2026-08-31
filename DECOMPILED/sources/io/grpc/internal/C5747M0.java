package io.grpc.internal;

/* JADX INFO: renamed from: io.grpc.internal.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5747M0 implements InterfaceC5803q0 {

    /* JADX INFO: renamed from: a */
    private final C5745L0.d f22214a;

    private C5747M0(C5745L0.d dVar) {
        this.f22214a = dVar;
    }

    /* JADX INFO: renamed from: c */
    public static C5747M0 m25642c(C5745L0.d dVar) {
        return new C5747M0(dVar);
    }

    @Override // io.grpc.internal.InterfaceC5803q0
    /* JADX INFO: renamed from: a */
    public Object mo25643a() {
        return C5745L0.m25637d(this.f22214a);
    }

    @Override // io.grpc.internal.InterfaceC5803q0
    /* JADX INFO: renamed from: b */
    public Object mo25644b(Object obj) {
        C5745L0.m25638f(this.f22214a, obj);
        return null;
    }
}
