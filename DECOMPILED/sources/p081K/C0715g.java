package p081K;

import android.p204os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: K.g */
/* JADX INFO: loaded from: classes.dex */
final class C0715g extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1875e f2887a;

    public C0715g(InterfaceC1875e interfaceC1875e) {
        super(false);
        this.f2887a = interfaceC1875e;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            InterfaceC1875e interfaceC1875e = this.f2887a;
            C1436n.a aVar = C1436n.f4958b;
            interfaceC1875e.resumeWith(C1436n.m6073b(AbstractC1437o.m6081a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f2887a.resumeWith(C1436n.m6073b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
