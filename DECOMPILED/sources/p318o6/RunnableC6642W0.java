package p318o6;

import p173W5.InterfaceC1875e;
import p360t6.C7142z;

/* JADX INFO: renamed from: o6.W0 */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC6642W0 extends C7142z implements Runnable {

    /* JADX INFO: renamed from: e */
    public final long f24930e;

    public RunnableC6642W0(long j7, InterfaceC1875e interfaceC1875e) {
        super(interfaceC1875e.getContext(), interfaceC1875e);
        this.f24930e = j7;
    }

    @Override // p318o6.AbstractC6649a, p318o6.C6607E0
    /* JADX INFO: renamed from: h0 */
    public String mo28034h0() {
        return super.mo28034h0() + "(timeMillis=" + this.f24930e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m28043y(AbstractC6644X0.m28134a(this.f24930e, AbstractC6645Y.m28138b(getContext()), this));
    }
}
