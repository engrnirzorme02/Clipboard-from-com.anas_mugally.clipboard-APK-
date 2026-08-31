package p145S5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: S5.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1445w implements InterfaceC1429g, Serializable {

    /* JADX INFO: renamed from: a */
    private InterfaceC5356a f4972a;

    /* JADX INFO: renamed from: b */
    private Object f4973b;

    public C1445w(InterfaceC5356a initializer) {
        AbstractC6118n.m27187e(initializer, "initializer");
        this.f4972a = initializer;
        this.f4973b = C1442t.f4970a;
    }

    @Override // p145S5.InterfaceC1429g
    /* JADX INFO: renamed from: d */
    public boolean mo6064d() {
        return this.f4973b != C1442t.f4970a;
    }

    @Override // p145S5.InterfaceC1429g
    public Object getValue() {
        if (this.f4973b == C1442t.f4970a) {
            InterfaceC5356a interfaceC5356a = this.f4972a;
            AbstractC6118n.m27184b(interfaceC5356a);
            this.f4973b = interfaceC5356a.invoke();
            this.f4972a = null;
        }
        return this.f4973b;
    }

    public String toString() {
        return mo6064d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
