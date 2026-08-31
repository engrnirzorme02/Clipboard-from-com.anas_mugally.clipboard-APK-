package p056G6;

import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import p152T5.AbstractC1638q;
import p286k6.InterfaceC6077c;
import p408z6.InterfaceC7616b;

/* JADX INFO: renamed from: G6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0488b {
    public /* synthetic */ AbstractC0488b(AbstractC6112h abstractC6112h) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC7616b m2088b(AbstractC0488b abstractC0488b, InterfaceC6077c interfaceC6077c, List list, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i7 & 2) != 0) {
            list = AbstractC1638q.m6765j();
        }
        return abstractC0488b.mo2087a(interfaceC6077c, list);
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC7616b mo2087a(InterfaceC6077c interfaceC6077c, List list);

    private AbstractC0488b() {
    }
}
