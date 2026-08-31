package p173W5;

import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5367l;

/* JADX INFO: renamed from: W5.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1872b implements InterfaceC1879i.c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5367l f6038a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1879i.c f6039b;

    public AbstractC1872b(InterfaceC1879i.c baseKey, InterfaceC5367l safeCast) {
        AbstractC6118n.m27187e(baseKey, "baseKey");
        AbstractC6118n.m27187e(safeCast, "safeCast");
        this.f6038a = safeCast;
        this.f6039b = baseKey instanceof AbstractC1872b ? ((AbstractC1872b) baseKey).f6039b : baseKey;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7767a(InterfaceC1879i.c key) {
        AbstractC6118n.m27187e(key, "key");
        return key == this || this.f6039b == key;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1879i.b m7768b(InterfaceC1879i.b element) {
        AbstractC6118n.m27187e(element, "element");
        return (InterfaceC1879i.b) this.f6038a.invoke(element);
    }
}
