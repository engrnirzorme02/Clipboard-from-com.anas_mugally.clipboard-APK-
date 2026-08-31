package p376v6;

import p173W5.InterfaceC1879i;
import p318o6.AbstractC6618K;
import p360t6.AbstractC7128l;

/* JADX INFO: renamed from: v6.k */
/* JADX INFO: loaded from: classes.dex */
final class C7273k extends AbstractC6618K {

    /* JADX INFO: renamed from: c */
    public static final C7273k f29093c = new C7273k();

    private C7273k() {
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        C7265c.f29077t.m32238V0(runnable, true, false);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: S0 */
    public AbstractC6618K mo28086S0(int i7, String str) {
        AbstractC7128l.m31467a(i7);
        return i7 >= AbstractC7272j.f29090d ? AbstractC7128l.m31468b(this, str) : super.mo28086S0(i7, str);
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return "Dispatchers.IO";
    }
}
