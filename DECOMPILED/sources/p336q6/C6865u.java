package p336q6;

import p145S5.C1444v;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6622M;

/* JADX INFO: renamed from: q6.u */
/* JADX INFO: loaded from: classes.dex */
final class C6865u extends AbstractC6852h implements InterfaceC6866v {
    public C6865u(InterfaceC1879i interfaceC1879i, InterfaceC6851g interfaceC6851g) {
        super(interfaceC1879i, interfaceC6851g, true, true);
    }

    @Override // p318o6.AbstractC6649a
    /* JADX INFO: renamed from: J0 */
    protected void mo28146J0(Throwable th, boolean z7) {
        if (m30028N0().mo29979g(th) || z7) {
            return;
        }
        AbstractC6622M.m28096a(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p318o6.AbstractC6649a
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public void mo28147L0(C1444v c1444v) {
        InterfaceC6868x.a.m30073a(m30028N0(), null, 1, null);
    }

    @Override // p318o6.AbstractC6649a, p318o6.C6607E0, p318o6.InterfaceC6701y0
    public boolean isActive() {
        return super.isActive();
    }
}
