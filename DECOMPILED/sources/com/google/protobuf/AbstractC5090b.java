package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5090b implements InterfaceC5097e0 {

    /* JADX INFO: renamed from: a */
    private static final C5120q f19374a = C5120q.m23562b();

    /* JADX INFO: renamed from: c */
    private InterfaceC5082U m23075c(InterfaceC5082U interfaceC5082U) throws C5065C {
        if (interfaceC5082U == null || interfaceC5082U.mo22977d()) {
            return interfaceC5082U;
        }
        throw m23076d(interfaceC5082U).m23592a().m22903k(interfaceC5082U);
    }

    /* JADX INFO: renamed from: d */
    private C5127t0 m23076d(InterfaceC5082U interfaceC5082U) {
        return interfaceC5082U instanceof AbstractC5088a ? ((AbstractC5088a) interfaceC5082U).m23071n() : new C5127t0(interfaceC5082U);
    }

    @Override // com.google.protobuf.InterfaceC5097e0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public InterfaceC5082U mo23077a(AbstractC5106j abstractC5106j, C5120q c5120q) {
        return m23075c((InterfaceC5082U) mo23100b(abstractC5106j, c5120q));
    }
}
