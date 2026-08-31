package p360t6;

import p173W5.InterfaceC1879i;
import p318o6.AbstractC6618K;
import p318o6.AbstractC6637U;
import p318o6.InterfaceC6643X;
import p318o6.InterfaceC6661e0;
import p318o6.InterfaceC6678n;

/* JADX INFO: renamed from: t6.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7138v extends AbstractC6618K implements InterfaceC6643X {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ InterfaceC6643X f28445c;

    /* JADX INFO: renamed from: d */
    private final AbstractC6618K f28446d;

    /* JADX INFO: renamed from: e */
    private final String f28447e;

    /* JADX WARN: Multi-variable type inference failed */
    public C7138v(AbstractC6618K abstractC6618K, String str) {
        InterfaceC6643X interfaceC6643X = abstractC6618K instanceof InterfaceC6643X ? (InterfaceC6643X) abstractC6618K : null;
        this.f28445c = interfaceC6643X == null ? AbstractC6637U.m28125a() : interfaceC6643X;
        this.f28446d = abstractC6618K;
        this.f28447e = str;
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: Q */
    public void mo28132Q(long j7, InterfaceC6678n interfaceC6678n) {
        this.f28445c.mo28132Q(j7, interfaceC6678n);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: Q0 */
    public void mo28090Q0(InterfaceC1879i interfaceC1879i, Runnable runnable) {
        this.f28446d.mo28090Q0(interfaceC1879i, runnable);
    }

    @Override // p318o6.AbstractC6618K
    /* JADX INFO: renamed from: R0 */
    public boolean mo28091R0(InterfaceC1879i interfaceC1879i) {
        return this.f28446d.mo28091R0(interfaceC1879i);
    }

    @Override // p318o6.InterfaceC6643X
    /* JADX INFO: renamed from: k0 */
    public InterfaceC6661e0 mo28121k0(long j7, Runnable runnable, InterfaceC1879i interfaceC1879i) {
        return this.f28445c.mo28121k0(j7, runnable, interfaceC1879i);
    }

    @Override // p318o6.AbstractC6618K
    public String toString() {
        return this.f28447e;
    }
}
