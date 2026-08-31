package p318o6;

import androidx.appcompat.app.AbstractC2263x;
import p173W5.InterfaceC1879i;

/* JADX INFO: renamed from: o6.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6646Y0 extends AbstractC6618K {

    /* JADX INFO: renamed from: c */
    public static final C6646Y0 f24931c = new C6646Y0();

    private C6646Y0() {
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        AbstractC2263x.m9328a(interfaceC1879i.get(AbstractC6657c1.f24940b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: R0 */
    public boolean mo28091R0(InterfaceC1879i interfaceC1879i) {
        return false;
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
