package p318o6;

import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: o6.O0 */
/* JADX INFO: loaded from: classes.dex */
final class C6627O0 extends AbstractC6605D0 {

    /* JADX INFO: renamed from: e */
    private final InterfaceC1875e f24913e;

    public C6627O0(InterfaceC1875e interfaceC1875e) {
        this.f24913e = interfaceC1875e;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: v */
    public boolean mo27974v() {
        return false;
    }

    @Override // p318o6.AbstractC6605D0
    /* JADX INFO: renamed from: w */
    public void mo27975w(Throwable th) {
        InterfaceC1875e interfaceC1875e = this.f24913e;
        C1436n.a aVar = C1436n.f4958b;
        interfaceC1875e.resumeWith(C1436n.m6073b(C1444v.f4971a));
    }
}
