package p294l6;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: l6.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6300a implements InterfaceC6304e {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f24100a;

    public C6300a(InterfaceC6304e sequence) {
        AbstractC6118n.m27187e(sequence, "sequence");
        this.f24100a = new AtomicReference(sequence);
    }

    @Override // p294l6.InterfaceC6304e
    public Iterator iterator() {
        InterfaceC6304e interfaceC6304e = (InterfaceC6304e) this.f24100a.getAndSet(null);
        if (interfaceC6304e != null) {
            return interfaceC6304e.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
