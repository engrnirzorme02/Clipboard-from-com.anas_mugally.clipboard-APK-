package p392x6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p173W5.InterfaceC1879i;
import p360t6.AbstractC7101A;

/* JADX INFO: renamed from: x6.k */
/* JADX INFO: loaded from: classes.dex */
final class C7429k extends AbstractC7101A {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ AtomicReferenceArray f29755e;

    public C7429k(long j7, C7429k c7429k, int i7) {
        super(j7, c7429k, i7);
        this.f29755e = new AtomicReferenceArray(AbstractC7428j.f29754f);
    }

    @Override // p360t6.AbstractC7101A
    /* JADX INFO: renamed from: r */
    public int mo30054r() {
        return AbstractC7428j.f29754f;
    }

    @Override // p360t6.AbstractC7101A
    /* JADX INFO: renamed from: s */
    public void mo30055s(int i7, Throwable th, InterfaceC1879i interfaceC1879i) {
        m32905v().set(i7, AbstractC7428j.f29753e);
        m31380t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f28391c + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ AtomicReferenceArray m32905v() {
        return this.f29755e;
    }
}
