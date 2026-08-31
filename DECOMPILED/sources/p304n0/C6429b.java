package p304n0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6429b extends AbstractC6428a {
    /* JADX WARN: Multi-variable type inference failed */
    public C6429b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // p304n0.AbstractC6428a
    /* JADX INFO: renamed from: a */
    public Object mo27640a(AbstractC6428a.c key) {
        AbstractC6118n.m27187e(key, "key");
        return m27641b().get(key);
    }

    /* JADX INFO: renamed from: c */
    public final void m27642c(AbstractC6428a.c key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        m27641b().put(key, obj);
    }

    public C6429b(Map initialExtras) {
        AbstractC6118n.m27187e(initialExtras, "initialExtras");
        m27641b().putAll(initialExtras);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6429b(AbstractC6428a initialExtras) {
        this(initialExtras.m27641b());
        AbstractC6118n.m27187e(initialExtras, "initialExtras");
    }

    public /* synthetic */ C6429b(AbstractC6428a abstractC6428a, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? AbstractC6428a.b.f24472c : abstractC6428a);
    }
}
