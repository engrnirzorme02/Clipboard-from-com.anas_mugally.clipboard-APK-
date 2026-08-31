package p318o6;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: o6.l */
/* JADX INFO: loaded from: classes.dex */
final class C6674l implements InterfaceC6676m {

    /* JADX INFO: renamed from: a */
    private final Future f24977a;

    public C6674l(Future future) {
        this.f24977a = future;
    }

    @Override // p318o6.InterfaceC6676m
    /* JADX INFO: renamed from: a */
    public void mo28174a(Throwable th) {
        this.f24977a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f24977a + ']';
    }
}
