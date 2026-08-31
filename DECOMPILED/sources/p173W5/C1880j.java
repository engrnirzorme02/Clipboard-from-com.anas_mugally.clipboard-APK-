package p173W5;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: W5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1880j implements InterfaceC1879i, Serializable {

    /* JADX INFO: renamed from: a */
    public static final C1880j f6044a = new C1880j();

    private C1880j() {
    }

    @Override // p173W5.InterfaceC1879i
    public Object fold(Object obj, InterfaceC5371p operation) {
        AbstractC6118n.m27187e(operation, "operation");
        return obj;
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i.b get(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i minusKey(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        return this;
    }

    @Override // p173W5.InterfaceC1879i
    public InterfaceC1879i plus(InterfaceC1879i context) {
        AbstractC6118n.m27187e(context, "context");
        return context;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
