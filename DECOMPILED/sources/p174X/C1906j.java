package p174X;

import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;
import p181Y.C2008a;
import p181Y.C2009b;
import p238e6.InterfaceC5356a;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: X.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1906j {

    /* JADX INFO: renamed from: a */
    public static final C1906j f6125a = new C1906j();

    private C1906j() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC1905i m7851c(C1906j c1906j, InterfaceC1885E interfaceC1885E, C2009b c2009b, List list, InterfaceC6624N interfaceC6624N, InterfaceC5356a interfaceC5356a, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            c2009b = null;
        }
        if ((i7 & 4) != 0) {
            list = AbstractC1638q.m6765j();
        }
        if ((i7 & 8) != 0) {
            interfaceC6624N = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));
        }
        return c1906j.m7852a(interfaceC1885E, c2009b, list, interfaceC6624N, interfaceC5356a);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1905i m7852a(InterfaceC1885E serializer, C2009b c2009b, List migrations, InterfaceC6624N scope, InterfaceC5356a produceFile) {
        AbstractC6118n.m27187e(serializer, "serializer");
        AbstractC6118n.m27187e(migrations, "migrations");
        AbstractC6118n.m27187e(scope, "scope");
        AbstractC6118n.m27187e(produceFile, "produceFile");
        return m7853b(new C1911o(serializer, null, produceFile, 2, null), c2009b, migrations, scope);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1905i m7853b(InterfaceC1890J storage, C2009b c2009b, List migrations, InterfaceC6624N scope) {
        AbstractC6118n.m27187e(storage, "storage");
        AbstractC6118n.m27187e(migrations, "migrations");
        AbstractC6118n.m27187e(scope, "scope");
        InterfaceC1901e c2008a = c2009b;
        if (c2009b == null) {
            c2008a = new C2008a();
        }
        return new C1907k(storage, AbstractC1638q.m6759d(AbstractC1904h.f6107a.m7846b(migrations)), c2008a, scope);
    }
}
