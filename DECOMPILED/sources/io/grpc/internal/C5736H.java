package io.grpc.internal;

import p063H5.AbstractC0551k;
import p063H5.C0516K;
import p063H5.C0530Z;
import p063H5.C0532a0;
import p063H5.C0535c;
import p063H5.C0554l0;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: io.grpc.internal.H */
/* JADX INFO: loaded from: classes.dex */
class C5736H implements InterfaceC5808t {

    /* JADX INFO: renamed from: a */
    final C0554l0 f22183a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5806s.a f22184b;

    C5736H(C0554l0 c0554l0, InterfaceC5806s.a aVar) {
        AbstractC1209m.m5293e(!c0554l0.m2460o(), "error must not be OK");
        this.f22183a = c0554l0;
        this.f22184b = aVar;
    }

    @Override // io.grpc.internal.InterfaceC5808t
    /* JADX INFO: renamed from: c */
    public InterfaceC5804r mo3348c(C0532a0 c0532a0, C0530Z c0530z, C0535c c0535c, AbstractC0551k[] abstractC0551kArr) {
        return new C5734G(this.f22183a, this.f22184b, abstractC0551kArr);
    }

    @Override // p063H5.InterfaceC0521P
    /* JADX INFO: renamed from: g */
    public C0516K mo2172g() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
