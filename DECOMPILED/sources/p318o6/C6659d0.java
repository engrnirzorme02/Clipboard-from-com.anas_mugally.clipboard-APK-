package p318o6;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: o6.d0 */
/* JADX INFO: loaded from: classes.dex */
final class C6659d0 implements InterfaceC6661e0 {

    /* JADX INFO: renamed from: a */
    private final Future f24942a;

    public C6659d0(Future future) {
        this.f24942a = future;
    }

    @Override // p318o6.InterfaceC6661e0
    /* JADX INFO: renamed from: k */
    public void mo7954k() {
        this.f24942a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f24942a + ']';
    }
}
