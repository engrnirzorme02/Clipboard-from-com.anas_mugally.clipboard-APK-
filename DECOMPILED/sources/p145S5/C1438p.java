package p145S5;

import androidx.concurrent.futures.AbstractC2404b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: S5.p */
/* JADX INFO: loaded from: classes.dex */
final class C1438p implements InterfaceC1429g, Serializable {

    /* JADX INFO: renamed from: d */
    public static final a f4961d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final AtomicReferenceFieldUpdater f4962e = AtomicReferenceFieldUpdater.newUpdater(C1438p.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    private volatile InterfaceC5356a f4963a;

    /* JADX INFO: renamed from: b */
    private volatile Object f4964b;

    /* JADX INFO: renamed from: c */
    private final Object f4965c;

    /* JADX INFO: renamed from: S5.p$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    public C1438p(InterfaceC5356a initializer) {
        AbstractC6118n.m27187e(initializer, "initializer");
        this.f4963a = initializer;
        C1442t c1442t = C1442t.f4970a;
        this.f4964b = c1442t;
        this.f4965c = c1442t;
    }

    @Override // p145S5.InterfaceC1429g
    /* JADX INFO: renamed from: d */
    public boolean mo6064d() {
        return this.f4964b != C1442t.f4970a;
    }

    @Override // p145S5.InterfaceC1429g
    public Object getValue() {
        Object obj = this.f4964b;
        C1442t c1442t = C1442t.f4970a;
        if (obj != c1442t) {
            return obj;
        }
        InterfaceC5356a interfaceC5356a = this.f4963a;
        if (interfaceC5356a != null) {
            Object objInvoke = interfaceC5356a.invoke();
            if (AbstractC2404b.m10339a(f4962e, this, c1442t, objInvoke)) {
                this.f4963a = null;
                return objInvoke;
            }
        }
        return this.f4964b;
    }

    public String toString() {
        return mo6064d() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
