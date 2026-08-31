package p145S5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: S5.q */
/* JADX INFO: loaded from: classes.dex */
final class C1439q implements InterfaceC1429g, Serializable {

    /* JADX INFO: renamed from: a */
    private InterfaceC5356a f4966a;

    /* JADX INFO: renamed from: b */
    private volatile Object f4967b;

    /* JADX INFO: renamed from: c */
    private final Object f4968c;

    public C1439q(InterfaceC5356a initializer, Object obj) {
        AbstractC6118n.m27187e(initializer, "initializer");
        this.f4966a = initializer;
        this.f4967b = C1442t.f4970a;
        this.f4968c = obj == null ? this : obj;
    }

    @Override // p145S5.InterfaceC1429g
    /* JADX INFO: renamed from: d */
    public boolean mo6064d() {
        return this.f4967b != C1442t.f4970a;
    }

    @Override // p145S5.InterfaceC1429g
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f4967b;
        C1442t c1442t = C1442t.f4970a;
        if (obj != c1442t) {
            return obj;
        }
        synchronized (this.f4968c) {
            objInvoke = this.f4967b;
            if (objInvoke == c1442t) {
                InterfaceC5356a interfaceC5356a = this.f4966a;
                AbstractC6118n.m27184b(interfaceC5356a);
                objInvoke = interfaceC5356a.invoke();
                this.f4967b = objInvoke;
                this.f4966a = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return mo6064d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C1439q(InterfaceC5356a interfaceC5356a, Object obj, int i7, AbstractC6112h abstractC6112h) {
        this(interfaceC5356a, (i7 & 2) != 0 ? null : obj);
    }
}
